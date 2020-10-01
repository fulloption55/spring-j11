package com.theerut.springj11.controller;

import com.theerut.springj11.annotation.LogStartEnd;
import com.theerut.springj11.annotation.LogTime;
import com.theerut.springj11.client.response.AgreementVerificationResponse;
import com.theerut.springj11.constant.AccountRelationshipEnum;
import com.theerut.springj11.constant.AccountStatusEnum;
import com.theerut.springj11.constant.AccountTypeEnum;
import com.theerut.springj11.constant.CurrencyEnum;
import com.theerut.springj11.constant.ResponseMapEnum;
import com.theerut.springj11.controller.request.AccountListManagementRequest;
import com.theerut.springj11.controller.request.AccountListRequest;
import com.theerut.springj11.controller.request.CreateAccountV3Request;
import com.theerut.springj11.controller.response.AccountAddingResponseV3;
import com.theerut.springj11.controller.response.AccountResponse;
import com.theerut.springj11.controller.response.GeneralResponse;
import com.theerut.springj11.controller.response.TestoAccountListResponse;
import com.theerut.springj11.controller.response.TestoAccountResponse;
import com.theerut.springj11.controller.response.TestoFixedAccountGroupListResponse;
import com.theerut.springj11.controller.response.TestoFixedAccountGroupResponse;
import com.theerut.springj11.exception.AccountExceedException;
import com.theerut.springj11.exception.CustomRuntimeException;
import com.theerut.springj11.exception.TestoAddressException;
import com.theerut.springj11.factory.response.ResponseFactory;
import com.theerut.springj11.service.AccountService;
import com.theerut.springj11.service.DocumentFormService;
import com.theerut.springj11.service.LegalDocumentService;
import com.theerut.springj11.service.TestoAccountService;
import com.theerut.springj11.service.ProductService;
import com.theerut.springj11.service.model.Account;
import com.theerut.springj11.service.model.AccountFilter;
import com.theerut.springj11.service.model.FixedAccount;
import com.theerut.springj11.service.model.LegalDocument;
import com.theerut.springj11.service.model.TestoAccount;
import com.theerut.springj11.service.model.TestoFixedAccountGroup;
import com.theerut.springj11.utils.AccountUtil;
import com.theerut.springj11.utils.EXAMPayload;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


@Slf4j
@RestController
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;
    private final ResponseFactory responseFactory;
    private final TestoAccountService TestoAccountService;
    private final LegalDocumentService legalDocumentService;
    private final ModelMapper modelMapper;
    private final EXAMPayload payload;

    private static final String ERROR_LOG_TEMPLATE = "Error {}";


    @LogStartEnd
    @LogTime
    @PostMapping(value = "/v1/accounts/search")
    public ResponseEntity<GeneralResponse<List<AccountResponse>>> searchAccountList(@Valid @RequestBody AccountListRequest request) {
        final String userId = payload.getUserId();
        final String requestAccountId = ((request.getId() == null) ? "N/A" : AccountUtil.getLastDigits(request.getId(), 4));
        log.info("Request with criteria are account ID[X-{}], types{}, status codes{}", requestAccountId, request.getTypes(), request.getStatusCodes());
        try {
            final Predicate<AccountTypeEnum> typeCASAPredicate = typeEnum ->
                    typeEnum.equals(AccountTypeEnum.SAVING) || typeEnum.equals(AccountTypeEnum.CURRENT);
            final Predicate<AccountTypeEnum> typeFDPredicate = typeEnum ->
                    typeEnum.equals(AccountTypeEnum.FIXED) || typeEnum.equals(AccountTypeEnum.SPECIAL_FIXED);
            final List<CurrencyEnum> currencyCodes = Collections.singletonList(CurrencyEnum.THB);

            List<Account> filteredList = new ArrayList<>();
            List<FixedAccount> filteredFixedList = new ArrayList<>();
            if (request.getTypes().stream().anyMatch(typeCASAPredicate)) {
                final List<Account> accountList = accountService.getAccountList(userId);
                final List<Account> nonJointAccountList = accountService.filterJointAccount(accountList);
                filteredList = accountService.filter(nonJointAccountList, new AccountFilter(request, currencyCodes));
            }
            return responseFactory.success(this.buildAccountResponseList(filteredList, filteredFixedList));
        } catch (IllegalArgumentException iae) {
            log.error(ERROR_LOG_TEMPLATE, iae.toString());
            return responseFactory.error(HttpStatus.BAD_REQUEST, ResponseMapEnum.GENERAL_ERROR.getText());
        }
    }

    @LogStartEnd
    @LogTime
    @PostMapping(value = "/v1/management/accounts/search")
    public ResponseEntity<GeneralResponse<List<TestoAccountResponse>>> searchAccountsManagement(@Valid @RequestBody AccountListManagementRequest request) {
        log.info("Request searchAccountsManagement with criteria are user ID[{}], types{}, status codes{}", request.getUserId(), request.getTypes(), request.getStatusCodes());
        final List<TestoAccount> TestoAccounts = TestoAccountService.getCasaAccounts(request.getUserId());
        final List<TestoAccount> filteredAccounts = TestoAccountService.filterAccounts(TestoAccounts, request.getTypes(), request.getStatusCodes());
        TestoAccountListResponse response = buildCasaAccountListResponse(filteredAccounts);
        return responseFactory.success(response.getAccounts());
    }


//    @LogStartEnd
//    @LogTime
//    @PostMapping(value = "/v1/management/accounts")
//    public ResponseEntity<GeneralResponse<AccountAddingResponse>> addAccountManagement(@Valid @RequestBody AccountAddingRequest request) {
//        String userId = request.getUserId();
//        log.info("User id is {} who accept factsheet, terms & conditions of product code {} with language {}", userId, request.getProductId(), payload.getLanguage());
//        try {
//
//            final String purposeName = PurposeEnum.getEnum(request.getPurposeId()).getDescription();
//            final GeneralResponse<Profile> profile = profileService.getProfile(payload, request.getUserId());
//
//            final Product product = productService.getProductDetail(request.getProductId(), CurrencyEnum.THB.getCode());
//            final AccountOpening account = accountOpeningService.addAccount(payload, userId, purposeName, request.getProductId(), request.getAccountType(), profile.getData(), product);
//
//            final AccountFileForm accountFileForm = documentFormService.createForm(purposeName, account, profile.getData());
//            documentFormService.exportFile(payload.generateEXAMPayload(), accountFileForm, product);
//
//            return responseFactory.success(AccountAddingResponse.builder()
//                    .id(account.getId())
//                    .type(AccountTypeEnum.getEnum(account.getType()))
//                    .referenceId(account.getReferenceId())
//                    .build());
//
//        } catch (AccountExceedException mae) {
//            log.error(ERROR_LOG_TEMPLATE, mae.toString());
//            return responseFactory.error(HttpStatus.INTERNAL_SERVER_ERROR, ResponseMapEnum.ERROR_EXCEED_ACCOUNT_FOR_PRODUCT.getText());
//        } catch (IllegalArgumentException iae) {
//            log.error(ERROR_LOG_TEMPLATE, iae.toString());
//            return responseFactory.error(HttpStatus.BAD_REQUEST, ResponseMapEnum.GENERAL_ERROR.getText());
//        } catch (IllegalStateException ise) {
//            log.error(ERROR_LOG_TEMPLATE, ise.toString());
//            if (ise.getMessage().equals("Latest FATCA status was not succeed")) {
//                return responseFactory.error(HttpStatus.INTERNAL_SERVER_ERROR, ResponseMapEnum.ERROR_FATCA_NOT_COMPLETE.getText());
//            } else if (ise.getMessage().equals("Latest KYC Grade status was not succeed")) {
//                return responseFactory.error(HttpStatus.INTERNAL_SERVER_ERROR, ResponseMapEnum.ERROR_KYC_GRADE_NOT_COMPLETE.getText());
//            } else if (ise.getMessage().equals("Latest Watchlist status was not succeed")) {
//                return responseFactory.error(HttpStatus.INTERNAL_SERVER_ERROR, ResponseMapEnum.ERROR_WATCHLIST_NOT_COMPLETE.getText());
//            } else {
//                return responseFactory.error(HttpStatus.INTERNAL_SERVER_ERROR, ResponseMapEnum.GENERAL_ERROR.getText());
//            }
//        }
//    }

    @LogTime
    @LogStartEnd
    @GetMapping(value = "/v1/customers/{customer_id}/casa-accounts")
    public ResponseEntity<GeneralResponse<TestoAccountListResponse>> searchCasaAccountList(
            @PathVariable("customer_id") String customerId,
            @RequestParam(required = false, name = "types") List<String> accountTypes,
            @RequestParam(required = false, name = "status_codes") List<String> accountStatuses) {
        if (!customerId.equals(payload.getUserId())) {
            log.error("Payload user ID [{}] and user ID [{}] from path url are different", customerId, payload.getUserId());
            return responseFactory.error(HttpStatus.BAD_REQUEST, ResponseMapEnum.GENERAL_ERROR.getText());
        }
        log.info("Request searchCasaAccountList with criteria are user ID[{}], types{}, status codes{}", customerId, accountTypes, accountStatuses);
        final List<TestoAccount> TestoAccounts = TestoAccountService.getCasaAccounts(customerId);
        final List<TestoAccount> filteredAccounts = TestoAccountService.filterAccounts(TestoAccounts, accountTypes, accountStatuses);
        TestoAccountListResponse response = buildCasaAccountListResponse(filteredAccounts);
        return responseFactory.success(response);
    }

    @LogTime
    @LogStartEnd
    @GetMapping(value = "/v1/customers/{customer_id}/fixed-accounts")
    public ResponseEntity<GeneralResponse<TestoFixedAccountGroupListResponse>> searchFixedAccountList(
            @PathVariable("customer_id") String customerId,
            @RequestParam(required = false, name = "types") List<String> accountTypes,
            @RequestParam(required = false, name = "status_codes") List<String> accountStatuses) {
        if (!customerId.equals(payload.getUserId())) {
            log.error("Payload user ID [{}] and user ID [{}] from path url are different", customerId, payload.getUserId());
            return responseFactory.error(HttpStatus.BAD_REQUEST, ResponseMapEnum.GENERAL_ERROR.getText());
        }
        log.info("Request searchFixedAccountList with criteria are user ID[{}], types{}, status codes{}", customerId, accountTypes, accountStatuses);
        final List<TestoFixedAccountGroup> TestoAccounts = TestoAccountService.getFixedAccountGroups(customerId);
        final List<TestoFixedAccountGroup> filteredAccounts = TestoAccountService.filterAccounts(TestoAccounts, accountTypes, accountStatuses);
        TestoFixedAccountGroupListResponse response = buildFixedAccountListResponse(filteredAccounts);
        return responseFactory.success(response);
    }

    @LogStartEnd
    @LogTime
    @PostMapping(value = "/v3/accounts")
    public ResponseEntity addAccountWithTesto(@Valid @RequestBody CreateAccountV3Request request) throws AccountExceedException, NoSuchAlgorithmException, TestoAddressException {
        log.info("Payload language is [{}]", payload.getLanguage());
        try {

            final GeneralResponse<AgreementVerificationResponse> agreementResponse = legalDocumentService.verifyAgreement(request.getAgreementIds());
            final List<LegalDocument> documentList = agreementResponse.getData()
                    .getAgreementList()
                    .stream()
                    .map(agreement -> modelMapper.map(agreement.getDocument(), LegalDocument.class))
                    .collect(Collectors.toList());

            legalDocumentService.validateDocumentForAccountProduct(documentList, request.getProductId());


            AccountAddingResponseV3 response = TestoAccountService.addAccount(
                    payload,
                    request,
                    documentList);
            return responseFactory.success(response);
        } catch (CustomRuntimeException ex) {
            log.error("Custom runtime exception", ex);
            return responseFactory.error(ex.getHttpStatus(), ex.getErrorCode());
        }
    }

    private TestoFixedAccountGroupListResponse buildFixedAccountListResponse(List<TestoFixedAccountGroup> TestoAccounts) {
        List<TestoFixedAccountGroupResponse> accounts = TestoAccounts.stream()
                .map(this::mapFixedAccount)
                .collect(Collectors.toList());
        return new TestoFixedAccountGroupListResponse(accounts);
    }

    private TestoFixedAccountGroupResponse mapFixedAccount(TestoFixedAccountGroup account) {
        return TestoFixedAccountGroupResponse.builder()
                .id(account.getId())
                .userId(account.getUserId())
                .type(AccountTypeEnum.getEnum(account.getType()).toString())
                .primaryName(account.getName())
                .nickName(account.getShortName())
                .relationship(AccountRelationshipEnum.getEnum(account.getRelationshipCode()).toString())
                .branchId(account.getBranchId())
                .currency(account.getCurrency())
                .availableBalance(account.getAvailableBalance().toString())
                .statusCode(AccountStatusEnum.getEnum(account.getStatus()))
                .jointIndicator(!"P".equals(account.getRelationshipCode()))
                .build();
    }

    private TestoAccountListResponse buildCasaAccountListResponse(List<TestoAccount> TestoAccounts) {
        List<TestoAccountResponse> accounts = TestoAccounts.stream()
                .map(this::mapCasaAccount)
                .collect(Collectors.toList());
        return new TestoAccountListResponse(accounts);
    }

    private TestoAccountResponse mapCasaAccount(TestoAccount account) {
        return TestoAccountResponse.builder()
                .id(account.getId())
                .userId(account.getUserId())
                .type(AccountTypeEnum.getEnum(account.getType()).toString())
                .primaryName(account.getName())
                .relationship(AccountRelationshipEnum.getEnum(account.getRelationshipCode()).toString())
                .nickName(account.getShortName())
                .branchId(account.getBranchId())
                .productId(account.getProductId())
                .productName(account.getProductName())
                .productNameLocal(account.getProductLocalName())
                .currency(account.getCurrency())
                .currentBalance(account.getCurrentBalance().toString())
                .availableBalance(account.getAvailableBalance().toString())
                .drawingLimit(account.getDrawingLimit() != null ? account.getDrawingLimit().toString() : "0")
                .statusCode(AccountStatusEnum.getEnum(account.getStatus()))
                .accumulateInterestBalance(account.getAccumulateIntBalance() != null ?
                        account.getAccumulateIntBalance().toString() : "0")
                .jointIndicator(!"P".equals(account.getRelationshipCode()))
                .allowCredit("Y".equals(account.getAllowCredit()))
                .allowDebit("Y".equals(account.getAllowDebit()))
                .build();
    }

    private List<AccountResponse> buildAccountResponseList(List<Account> accountList, List<FixedAccount> fixedAccountList) {
        final List<AccountResponse> responseList = new ArrayList<>();
        responseList.addAll(this.buildAccountResponseList(accountList));
        responseList.addAll(this.buildFixedAccountResponseList(fixedAccountList));
        return responseList;
    }

    private List<AccountResponse> buildAccountResponseList(List<Account> accountList) {
        final List<AccountResponse> responseList = new ArrayList<>();
        final List<String> logAccount = new ArrayList<>();
        for (Account account : accountList) {
            responseList.add(AccountResponse.builder()
                    .id(account.getId())
                    .type(AccountTypeEnum.getEnum(account.getType()))
                    .primaryName(account.getName())
                    .statusCode(AccountStatusEnum.getEnum(account.getStatusCode()))
                    .resStatus(account.getResStatus())
                    .branchId(account.getBranchId())
                    .mode(account.getMode())
                    .signingCond(account.getSigningCond())
                    .availableBalance(account.getAvailableBalance())
                    .currentBalance(account.getCurrentBalance())
                    .currency(account.getCurrency())
                    .productId(account.getProductId())
                    .productDesc(account.getMode())
                    .pidmFlag(account.isPidmFlag())
                    .jointIndicator(account.isJointIndicator())
                    .allowCredit(account.isAllowCredit())
                    .allowDebit(account.isAllowDebit())
                    .build());

            logAccount.add("{account ID[X-" + AccountUtil.getLastDigits(account.getId(), 4) + "], " +
                    "available balance[" + account.getAvailableBalance() + "], " +
                    "current balance[" + account.getCurrentBalance() + "]}");
        }
        log.info("List of CASA account: {}", logAccount.toString());
        return responseList;
    }

    private List<AccountResponse> buildFixedAccountResponseList(List<FixedAccount> accountList) {
        final List<AccountResponse> responseList = new ArrayList<>();
        final List<String> logAccount = new ArrayList<>();
        for (FixedAccount account : accountList) {
            responseList.add(AccountResponse.builder()
                    .id(account.getId())
                    .primaryName(account.getName())
                    .currency(account.getCurrency())
                    .statusCode(AccountStatusEnum.getEnum(account.getStatusCode()))
                    .availableBalance(account.getAvailableBalance())
                    .type(AccountTypeEnum.getEnum(account.getType()))
                    .branchId(account.getBranchId())
                    .build());

            logAccount.add("{ account ID [X-" + AccountUtil.getLastDigits(account.getId(), 4) + "], " +
                    "available balance[" + account.getAvailableBalance() + "], " +
                    "current balance[" + account.getCurrentBalance() + "] }");
        }
        log.info("List of fixed account: {}", logAccount.toString());
        return responseList;
    }

}
