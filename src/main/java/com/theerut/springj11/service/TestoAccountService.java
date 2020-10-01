package com.theerut.springj11.service;

import com.theerut.springj11.client.RestTestoAccountCasaTransactionClient;
import com.theerut.springj11.client.RestTestoAccountClient;
import com.theerut.springj11.client.request.CreateAccountMedixRequest;
import com.theerut.springj11.client.request.TestoAccountCasaTransactionRequest;
import com.theerut.springj11.client.request.TestoAccountDetailRequest;
import com.theerut.springj11.client.request.TestoBaseRequest;
import com.theerut.springj11.client.response.*;
import com.theerut.springj11.config.AccountConfiguration;
import com.theerut.springj11.config.SmsConfiguration;
import com.theerut.springj11.constant.*;
import com.theerut.springj11.controller.request.CreateAccountV3Request;
import com.theerut.springj11.controller.response.AccountAddingResponseV3;
import com.theerut.springj11.exception.AccountExceedException;
import com.theerut.springj11.exception.CustomRuntimeException;
import com.theerut.springj11.exception.TestoAddressException;
import com.theerut.springj11.factory.request.AccountOpenRequestFactory;
import com.theerut.springj11.service.model.*;
import com.theerut.springj11.utils.AccountUtil;
import com.theerut.springj11.utils.EXAMPayload;
import com.theerut.springj11.service.base.TestoBaseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;

import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

import static com.theerut.springj11.constant.AccountTypeEnum.SAVING;
import static com.theerut.springj11.constant.CurrencyEnum.THB;
import static com.theerut.springj11.constant.TestoResponseCodeEnum.getEnum;
import static com.theerut.springj11.constant.TestoSigningConditionEnum.SOLE;
import static com.theerut.springj11.constant.ResponseMapEnum.*;

@Slf4j
@Service
@RequiredArgsConstructor
public class TestoAccountService {
    private final RestTestoAccountClient TestoAccountClient;
    private final RestTestoAccountCasaTransactionClient TestoAccountCasaTransactionClient;
    private final AccountConfiguration accountConfiguration;
    private final TestoBaseService TestoBaseService;
    private final TestoAddressService TestoAddressService;
    private final NotificationService notificationService;
    private final TestoProductService TestoProductService;
    private final SmsConfiguration smsConfiguration;
    private final DocumentFormService documentFormService;
    private final AccountOpenRequestFactory accountOpenRequestFactory;

    final String currency = "THB";

    private static final String ERROR_CONNECT_TO_Testo = "Error while connect to Testo";

    public TestoAccount getAccount(String accountId, String accountType) {
        final String transaction = TestoBaseService.generateTransactionId();
        log.info("Getting an account by account ID [X-{}], type [{}] and transaction [{}]", AccountUtil.getLastDigits(accountId, 4), accountType, transaction);
        final TestoAccountDetailRequest request = TestoAccountDetailRequest.builder()
                .accountType(accountType)
                .build();
        final TestoBaseRequest<TestoAccountDetailRequest> TestoRequest = new TestoBaseRequest<>();
        TestoRequest.setRequest(request);
        final ResponseEntity<TestoAccountDetailResponse> response = TestoAccountClient.getAccountDetail(accountId, TestoRequest, transaction);
        final TestoResponseStatus responseStatus = TestoBaseService.extractStatus(this.getClass().getSimpleName(), TestoServiceNameConstant.CASA_ACCOUNT_DETAIL, response, transaction);
        if (TestoBaseService.isFailed(responseStatus)) {
            if (TestoResponseCodeEnum.NO_RECORDS_FOUND == getEnum(responseStatus.getCode())) {
                throw new IllegalStateException(ERROR_NOT_FOUND_DATA.getDescription());
            }
            throw new IllegalStateException(ERROR_CONNECT_TO_Testo);
        }
        return Objects.requireNonNull(response.getBody()).getAccount();
    }

    public AccountAddingResponseV3 addAccount(EXAMPayload payload, CreateAccountV3Request createAccountRequest, List<LegalDocument> documents) throws NoSuchAlgorithmException, AccountExceedException, TestoAddressException {
        final String transaction = TestoBaseService.generateTransactionId();
        final String productId = createAccountRequest.getProductId();
        final String mobile = createAccountRequest.getMobile().getDetail();
        final String email = createAccountRequest.getEmail().getDetail();
        final String cif = createAccountRequest.getCifNo();
        final Integer addressId = TestoAddressService.getAddressSequenceId(cif);
        final String accountType = SAVING.getTestoCode();

        log.info("Start create account [transaction : {}] ", transaction);


        CreateAccountMedixRequest request = CreateAccountMedixRequest.builder()
                .productCode(productId)
                .accountName(createAccountRequest.getFullNameTh())
                .accountShortName(accountOpenRequestFactory.subNickname(createAccountRequest.getFullNameEn().toUpperCase()))
                .email(email)
                .mobile(mobile)
                .accountType(accountType)
                .cif(cif)
                .signingCondition(SOLE.getId())
                .addressId(addressId)
                .accountCurrencyCode(THB.getCode())
                .build();

        ResponseEntity<CreateAccountTestoResponse> response = null;
        try {
            response = TestoAccountClient.createAccount(request, transaction);
        } catch (IllegalStateException ex) {
            if ("Error Timeout".equals(ex.getMessage())) {
                log.error("Socket timeout exception", ex);
                throw new CustomRuntimeException(HttpStatus.GATEWAY_TIMEOUT, ResponseConstant.Testo_TIMEOUT);
            }
            throw ex;
        } catch (HttpServerErrorException ex) {
            if (HttpStatus.GATEWAY_TIMEOUT.equals(ex.getStatusCode())) {
                log.error("Gateway timeout exception", ex);
                throw new CustomRuntimeException(HttpStatus.GATEWAY_TIMEOUT, ResponseConstant.Testo_TIMEOUT);
            }
            throw ex;
        }

        final TestoProductDetail productDetail = TestoProductService.getProduct(productId, currency);
        final Product product = new Product();
        product.setId(productId);
        product.setName(productDetail.getProductDescription());
        product.setLocalName(productDetail.getProductLocalDescription());

        String errorCode = response != null
                && response.getBody() != null
                && response.getBody().getData() != null
                && response.getBody().getData().getErrorResponse() != null
                && !response.getBody().getData().getErrorResponse().isEmpty()
                ? response.getBody().getData().getErrorResponse().get(0).getErrorCode()
                : null;

        if (TestoV2ResponseCode.EXCEED_LIMIT_PRODUCT_PER_UID.getCode().equals(errorCode)) {
            log.info("Exceed limit product per UID with product id: [{}] and account type: [{}]", productId, accountType);

            log.info("Find existing casa accounts");
            final TestoAccount account = getCasaAccounts(cif)
                    .stream()
                    .filter(acc -> productId.equals(acc.getProductId()) && accountType.equals(acc.getType()))
                    .findFirst()
                    .orElse(null);

            if (account == null) {
                throw new AccountExceedException(GENERAL_ERROR.getText());
            }

            log.info("Prepare response of create account");
            final TestoCreateAccountDataResponse TestoCreateAccountDataResponse = response.getBody().getData();
            TestoCreateAccountDataResponse.setCif(cif);
            TestoCreateAccountDataResponse.setAccountNo(account.getId());
            TestoCreateAccountDataResponse.setAccountType(account.getType());
            TestoCreateAccountDataResponse.setErrorResponse(null);
        }

        if (response == null || response.getBody() == null || response.getBody().getData().getErrorResponse() != null) {
            log.info("Create account Fail");
            notificationService.sendErrorEmailAccountSaving(payload.generateEXAMPayload(),
                    email,
                    createAccountRequest.getFullNameTh(),
                    createAccountRequest.getFullNameEn(),
                    product,
                    createAccountRequest.getTitleNameTh(),
                    createAccountRequest.getTitleNameEn()
            );

            final Map<String, String> smsContentValue = new HashMap<>();
            smsContentValue.put("product_name_th", productDetail.getProductLocalDescription());
            smsContentValue.put("product_name_en", productDetail.getProductDescription());
//            smsService.sendSms(
//                    createAccountRequest.getMobile().getDetail(),
//                    smsConfiguration.getNotificationOpenAccountFailedTemplateId(),
//                    smsContentValue,
//                    payload.generateEXAMPayload());
            throw new AccountExceedException(GENERAL_ERROR.getText());
        }

//        smsService.sendSmsCreateAccountSuccess(mobile, payload.generateEXAMPayload(), response.getBody().getData().getAccountNo(), productDetail.getProductLocalDescription(), productDetail.getProductDescription());

        final String purposeName = PurposeEnum.getEnum(createAccountRequest.getPurposeId()).getDescription();

        final TestoCreateAccountDataResponse TestoCreateAccountDataResponse = response.getBody().getData();
        TestoCreateAccountDataResponse.setAccountType(AccountTypeEnum.getEnum(accountType).getText());

        final AccountAddingResponseV3 accountAddingResponse = new AccountAddingResponseV3();
        accountAddingResponse.setAccountNo(TestoCreateAccountDataResponse.getAccountNo());
        accountAddingResponse.setCif(TestoCreateAccountDataResponse.getCif());
        accountAddingResponse.setAccountType(AccountTypeEnum.getEnum(accountType).getText());
        accountAddingResponse.setErrorResponse(TestoCreateAccountDataResponse.getErrorResponse());
        accountAddingResponse.setProductNameTh(productDetail.getProductLocalDescription());
        accountAddingResponse.setProductNameEn(productDetail.getProductDescription());


        final AccountOpening accountOpening = buildAccountOpening(
                TestoCreateAccountDataResponse.getAccountNo(),
                createAccountRequest.getProductId(),
                payload.getUserId(),
                transaction,
                AccountTypeEnum.getEnum(accountType).getCode(),
                productDetail.getProductLocalDescription()
        );

        final Profile profile = this.buildProfileObject(createAccountRequest);

        final AccountFileForm accountFileForm = documentFormService.createForm(purposeName, accountOpening, profile);
        accountFileForm.setRequestDebit(createAccountRequest.getIsRequestDebit());
        documentFormService.exportFile(payload.generateEXAMPayload(), accountFileForm, product, documents);

        return accountAddingResponse;
    }

    private AccountOpening buildAccountOpening(String accountNo, String productId, String userId, String transaction, String accountType, String description) {
        AccountOpening accountOpening = new AccountOpening();
        accountOpening.setId(accountNo);
        accountOpening.setUserId(userId);
        accountOpening.setReferenceId(transaction);
        accountOpening.setCreatedDatetime(LocalDateTime.now());
        accountOpening.setType(accountType);
        accountOpening.setProductId(productId);
        accountOpening.setProductDescription(description);

        return accountOpening;
    }

    private Profile buildProfileObject(CreateAccountV3Request createAccountRequest) {
        Profile profile = new Profile();
        profile.setRegisterAddress(createAccountRequest.getRegisterAddress());
        profile.setMailingAddress(createAccountRequest.getMailingAddress());
        profile.setOfficeAddress(createAccountRequest.getOfficeAddress());
        profile.setPhone(createAccountRequest.getPhone());
        profile.setOfficePhone(createAccountRequest.getOfficePhone());
        profile.setDateOfBirth(changeFormatDateForOldFlow(createAccountRequest.getDateOfBirth()));
        profile.setIdNumber(createAccountRequest.getIdNumber());
        profile.setTitleNameTh(createAccountRequest.getTitleNameTh());
        profile.setFullNameTh(createAccountRequest.getFullNameTh());
        profile.setTitleNameEn(createAccountRequest.getTitleNameEn());
        profile.setFullNameEn(createAccountRequest.getFullNameEn());
        profile.setNationalityName(createAccountRequest.getNationalityName());
        profile.setGenderName(createAccountRequest.getGenderName());
        profile.setMobile(createAccountRequest.getMobile());
        profile.setEmail(createAccountRequest.getEmail());
        profile.setOccupationName(createAccountRequest.getOccupationName());
        profile.setSectorCode(createAccountRequest.getSectorCode());
        profile.setEmployerName(createAccountRequest.getEmployerName());

        return profile;
    }

    private String changeFormatDateForOldFlow(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate oldDate = LocalDate.parse(date, formatter);
        LocalDate newDate = LocalDate.of(oldDate.getYear() + 543, oldDate.getMonth(), oldDate.getDayOfMonth());
        return newDate.format(formatter);
    }

    public boolean isAccountBelongUser(String expectedUserId, String actualUserId, String accountId) {
        if (!expectedUserId.equals(actualUserId)) {
            String maskedAccountId = AccountUtil.getLastDigits(accountId, 4);
            log.error("Account ID [X-{}] is not be long to user ID [{}] but actual user ID is [{}]", maskedAccountId, expectedUserId, actualUserId);
            throw new IllegalArgumentException(ERROR_ACCOUNT_NOT_BELONG_TO_USER.getDescription());
        }
        return true;
    }

    public AccountTypeEnum getAccountType(String accountId) {
        if (accountConfiguration.getAccountTypeCurrentPrefixes().stream().anyMatch(accountId::startsWith)) {
            return AccountTypeEnum.CURRENT;
        } else if (accountConfiguration.getAccountTypeSavingPrefixes().stream().anyMatch(accountId::startsWith)) {
            return AccountTypeEnum.SAVING;
        }
        throw new IllegalArgumentException("Invalid prefix account number current account prefix is " + accountId.substring(0, 2));
    }

    public List<TestoAccountCasaTransaction> getAccountCasaTransaction(String accountId, LocalDateTime startDate, Integer limit) {
        final String transaction = TestoBaseService.generateTransactionId();
        final String startDateTime = ZonedDateTime.of(startDate, ZoneId.of("Asia/Bangkok")).format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX"));
        final String startTime = startDate.format(DateTimeFormatter.ofPattern("HH:mm:ss.SSSSSS"));

        TestoAccountCasaTransactionRequest request = TestoAccountCasaTransactionRequest.builder()
                .startDate(startDateTime)
                .startTime(startTime)
                .accountType(getAccountType(accountId).getTestoCode())
                .build();

        TestoBaseRequest<TestoAccountCasaTransactionRequest> TestoBaseRequest = new TestoBaseRequest<>();
        TestoBaseRequest.setRequest(request);

        final ResponseEntity<TestoAccountCasaTransactionResponse> response = TestoAccountCasaTransactionClient.getAccountCasaTransaction(accountId, limit, TestoBaseRequest, transaction);

        final TestoResponseStatus responseStatus = TestoBaseService.extractStatus(this.getClass().getSimpleName(), TestoServiceNameConstant.CASA_TRANSACTION_HISTORY, response, transaction);
        if (TestoBaseService.isFailed(responseStatus)) {
            if (TestoResponseCodeEnum.NO_RECORDS_FOUND == getEnum(responseStatus.getCode())) {
                log.info("User has no any transactions");
                return Collections.emptyList();
            }
            throw new IllegalStateException(ERROR_CONNECT_TO_Testo);
        }

        return Objects.requireNonNull(response.getBody()).getTransactionList();
    }

    public List<TestoAccount> getCasaAccounts(String userId) {
        final String transaction = TestoBaseService.generateTransactionId();
        log.info("Getting accounts by customer ID [{}] and transaction [{}]", userId, transaction);
        final ResponseEntity<TestoAccountListResponse> response = TestoAccountClient.getCasaAccounts(userId, transaction);
        final TestoResponseStatus responseStatus = TestoBaseService.extractStatus(this.getClass().getSimpleName(), TestoServiceNameConstant.CASA_ACCOUNT_LIST, response, transaction);
        if (TestoBaseService.isFailed(responseStatus)) {
            if (TestoResponseCodeEnum.NO_RECORDS_FOUND == getEnum(responseStatus.getCode())) {
                log.info("User has no any CASA accounts");
                return Collections.emptyList();
            }
            throw new IllegalStateException(ERROR_CONNECT_TO_Testo);
        }
        return Objects.requireNonNull(response.getBody()).getAccounts();
    }

    public List<TestoFixedAccountGroup> getFixedAccountGroups(String userId) {
        final String transaction = TestoBaseService.generateTransactionId();
        log.info("Getting accounts by customer ID [{}] and transaction [{}]", userId, transaction);
        final ResponseEntity<TestoFixedAccountGroupListResponse> response = TestoAccountClient.getFixedAccountGroups(userId, transaction);
        final TestoResponseStatus responseStatus = TestoBaseService.extractStatus(this.getClass().getSimpleName(), TestoServiceNameConstant.FIXED_ACCOUNT_GROUP_LIST, response, transaction);
        if (TestoBaseService.isFailed(responseStatus)) {
            if (TestoResponseCodeEnum.NO_RECORDS_FOUND == getEnum(responseStatus.getCode())) {
                log.info("User has no any fixed accounts");
                return Collections.emptyList();
            }
            throw new IllegalStateException(ERROR_CONNECT_TO_Testo);
        }
        return Objects.requireNonNull(response.getBody()).getAccounts();
    }

    public <T extends FilterableAccount> List<T> filterAccounts(List<T> TestoAccounts, List<String> accountTypes, List<String> accountStatuses) {
        return TestoAccounts.stream()
                .filter(account -> accountTypes == null || accountTypes.contains(AccountTypeEnum.getEnum(account.getType()).toString()))
                .filter(account -> accountStatuses == null || accountStatuses.contains(AccountStatusEnum.getEnum(account.getStatus()).toString()))
                .collect(Collectors.toList());
    }
}
