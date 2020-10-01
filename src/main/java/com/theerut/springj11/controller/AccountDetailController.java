package com.theerut.springj11.controller;

import com.theerut.springj11.annotation.LogStartEnd;
import com.theerut.springj11.annotation.LogTime;
import com.theerut.springj11.constant.AccountRelationshipEnum;
import com.theerut.springj11.constant.AccountStatusEnum;
import com.theerut.springj11.constant.AccountTypeEnum;
import com.theerut.springj11.constant.InterestTypeEnum;
import com.theerut.springj11.constant.ResponseMapEnum;
import com.theerut.springj11.controller.model.InterestTier;
import com.theerut.springj11.controller.request.AccountDetailRequest;
import com.theerut.springj11.controller.request.CasaAccountDetailRequest;
import com.theerut.springj11.controller.response.AccountDetailResponse;
import com.theerut.springj11.controller.response.AccountDetailResponseV2;
import com.theerut.springj11.controller.response.GeneralResponse;
import com.theerut.springj11.factory.response.ResponseFactory;
import com.theerut.springj11.service.AccountService;
import com.theerut.springj11.service.TestoAccountService;
import com.theerut.springj11.service.TestoProductService;
import com.theerut.springj11.service.ProductService;
import com.theerut.springj11.service.model.AccountDetail;
import com.theerut.springj11.service.model.TestoAccount;
import com.theerut.springj11.service.model.TestoInterestRate;
import com.theerut.springj11.service.model.TestoProductDetail;
import com.theerut.springj11.service.model.Product;
import com.theerut.springj11.utils.EXAMPayload;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static com.theerut.springj11.constant.ResponseMapEnum.ERROR_NOT_FOUND_DATA;

@Slf4j
@RestController
@RequiredArgsConstructor
public class AccountDetailController {
    private final AccountService accountService;
    private final ResponseFactory responseFactory;
    private final ProductService productService;
    private final TestoAccountService TestoAccountService;
    private final TestoProductService TestoProductService;
    private final EXAMPayload payload;

    private static final String ERROR_LOG_TEMPLATE = "Error {}";

    @LogStartEnd
    @LogTime
    @PostMapping(value = "/v2/accounts/detail")
    public ResponseEntity<GeneralResponse<AccountDetailResponseV2>> searchAccountDetailTesto(@Valid @RequestBody AccountDetailRequest request) {
        final String userId = payload.getUserId();
        try {
            final TestoAccount accountDetail = TestoAccountService.getAccount(request.getId(), request.getType().getTestoCode());
            TestoAccountService.isAccountBelongUser(userId, accountDetail.getUserId(), accountDetail.getId());
            final TestoProductDetail productDetail = TestoProductService.getProduct(accountDetail.getProductId(), accountDetail.getCurrency());
            TestoProductService.setFirstTier(productDetail);
            return responseFactory.success(this.buildAccountDetailResponseV2(accountDetail, productDetail));
        } catch (IllegalArgumentException iae) {
            log.error(ERROR_LOG_TEMPLATE, iae.toString());
            return responseFactory.error(HttpStatus.BAD_REQUEST, ResponseMapEnum.GENERAL_ERROR.getText());
        }
    }

    @LogStartEnd
    @LogTime
    @PostMapping(value = "/v3/accounts/detail")
    public ResponseEntity<GeneralResponse<AccountDetailResponseV2>> searchAccountDetailTestoV3(@Valid @RequestBody AccountDetailRequest request) {
        final String userId = payload.getUserId();
        try {
            final TestoAccount accountDetail = TestoAccountService.getAccount(request.getId(), request.getType().getTestoCode());
            TestoAccountService.isAccountBelongUser(userId, accountDetail.getUserId(), accountDetail.getId());
            final TestoProductDetail productDetail = TestoProductService.getProduct(accountDetail.getProductId(), accountDetail.getCurrency());
            TestoProductService.setFirstTier(productDetail);
            return responseFactory.success(this.buildAccountDetailResponseV2(accountDetail, productDetail));
        } catch (IllegalStateException e) {
            return responseFactory.error(HttpStatus.BAD_REQUEST, ERROR_NOT_FOUND_DATA.getText());
        }
    }

    @LogStartEnd
    @LogTime
    @PostMapping(value = "/v1/management/casa-accounts/detail")
    public ResponseEntity<GeneralResponse<AccountDetailResponseV2>> searchCasaAccountDetailForInternal(@Valid @RequestBody CasaAccountDetailRequest request) {
        try {
            AccountTypeEnum accountType = TestoAccountService.getAccountType(request.getId());
            final TestoAccount accountDetail = TestoAccountService.getAccount(request.getId(), accountType.getTestoCode());
            return responseFactory.success(this.buildAccountDetailResponseV2(accountDetail));
        } catch (IllegalArgumentException iae) {
            log.error(ERROR_LOG_TEMPLATE, iae.toString());
            return responseFactory.error(HttpStatus.BAD_REQUEST, ResponseMapEnum.GENERAL_ERROR.getText());
        }
    }


    private AccountDetailResponse buildAccountDetailResponse(AccountDetail accountDetail, Product product) {
        return AccountDetailResponse.builder()
                .id(accountDetail.getId())
                .type(AccountTypeEnum.getEnum(accountDetail.getType()))
                .mode(accountDetail.getMode())
                .description(accountDetail.getDescription())
                .statusCode(AccountStatusEnum.getEnum(accountDetail.getStatusCode()))
                .residentStatus(accountDetail.getResStatus())
                .primaryName(accountDetail.getPrimaryName())
                .secondaryName(accountDetail.getSecondaryName())
                .nickName(accountDetail.getNickName())
                .currency(accountDetail.getCurrency())
                .branchId(accountDetail.getBranchId())
                .availableBalance(accountDetail.getAvailableBalance())
                .currentBalance(accountDetail.getCurrentBalance())
                .allowCredit(accountDetail.isAllowCredit())
                .productId(accountDetail.getProductId())
                .productName(product.getLocalName())
                .productNameEn(product.getName())
                .interestRate(accountDetail.getInterestRate())
                .productId(accountDetail.getProductId())
                .overdraftCreditLimit(accountDetail.getOverdraftCreditLimit())
                .accountCreditLimit(accountDetail.getAccountCreditLimit())
                .build();
    }

    private AccountDetailResponseV2 buildAccountDetailResponseV2(TestoAccount account) {
        return AccountDetailResponseV2.builder()
                .id(account.getId())
                .userId(account.getUserId())
                .relationship(AccountRelationshipEnum.getEnum(account.getRelationshipCode()).toString())
                .type(AccountTypeEnum.getEnum(account.getType()).toString())
                .statusCode(AccountStatusEnum.getEnum(account.getStatus()).name())
                .primaryName(account.getName())
                .nickName(account.getShortName())
                .currency(account.getCurrency())
                .branchId(account.getBranchId())
                .availableBalance(account.getAvailableBalance().toPlainString())
                .currentBalance(account.getCurrentBalance().toPlainString())
                .accumulateInterestBalance(account.getAccumulateIntBalance().toPlainString())
                .productId(account.getProductId())
                .productName(account.getProductLocalName())
                .drawingLimit(account.getDrawingLimit())
                .build();
    }

    private AccountDetailResponseV2 buildAccountDetailResponseV2(TestoAccount account, TestoProductDetail product) {
        return AccountDetailResponseV2.builder()
                .id(account.getId())
                .userId(account.getUserId())
                .relationship(AccountRelationshipEnum.getEnum(account.getRelationshipCode()).toString())
                .type(AccountTypeEnum.getEnum(account.getType()).toString())
                .statusCode(AccountStatusEnum.getEnum(account.getStatus()).name())
                .primaryName(account.getName())
                .nickName(account.getShortName())
                .currency(account.getCurrency())
                .branchId(account.getBranchId())
                .availableBalance(account.getAvailableBalance().toPlainString())
                .currentBalance(account.getCurrentBalance().toPlainString())
                .accumulateInterestBalance(account.getAccumulateIntBalance().toPlainString())
                .productId(account.getProductId())
                .productName(account.getProductLocalName())
                .productNameEn(account.getProductName())
                .drawingLimit(account.getDrawingLimit())
                .interestType(InterestTypeEnum.getEnum(product.getSplitAccrualMethod()).name())
                .interestTiers(this.buildInterestTierListResponse(product.getRateList()))
                .build();
    }

    private List<InterestTier> buildInterestTierListResponse(List<TestoInterestRate> TestoInterestRateList) {
        List<InterestTier> interestTierList = new ArrayList<>();
        for (TestoInterestRate interestRate : TestoInterestRateList) {
            interestTierList.add(this.buildInterestResponse(interestRate));
        }
        interestTierList.sort(Comparator.comparing(InterestTier::getBalanceRate));
        return interestTierList;
    }

    private InterestTier buildInterestResponse(TestoInterestRate interestRate) {
        return InterestTier.builder()
                .interestId(String.valueOf(interestRate.getInterestRateNo()))
                .balanceRate(interestRate.getBalanceRate().toPlainString())
                .interestRate(interestRate.getInterestRatePercentage().divide(BigDecimal.valueOf(100L), 2, RoundingMode.HALF_UP).toPlainString())
                .build();
    }

}
