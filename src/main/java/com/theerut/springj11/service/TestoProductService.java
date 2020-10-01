package com.theerut.springj11.service;

import com.theerut.springj11.client.RestTestoProductClient;
import com.theerut.springj11.client.request.TestoBaseRequest;
import com.theerut.springj11.client.request.TestoProductDetailRequest;
import com.theerut.springj11.client.response.TestoProductDetailResponse;
import com.theerut.springj11.constant.TestoServiceNameConstant;
import com.theerut.springj11.service.model.TestoInterestRate;
import com.theerut.springj11.service.model.TestoProductDetail;
import com.theerut.springj11.service.model.TestoResponseStatus;
import com.theerut.springj11.service.base.TestoBaseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Slf4j
@Service
@RequiredArgsConstructor
public class TestoProductService {
    private static final String CUSTOMER_SUB_TYPE = "000006001";

    private final RestTestoProductClient TestoProductClient;
    private final TestoBaseService TestoBaseService;

    public TestoProductDetail getProduct(String productId, String currency) {
        final String transaction = TestoBaseService.generateTransactionId();
        log.info("Getting product detail for product ID [{}] with transaction [{}]", productId, transaction);
        final TestoProductDetailRequest request = TestoProductDetailRequest
                .builder()
                .currencyCode(currency)
                .customerSubType(CUSTOMER_SUB_TYPE)
                .build();
        final TestoBaseRequest<TestoProductDetailRequest> TestoRequest = new TestoBaseRequest<>();
        TestoRequest.setRequest(request);

        final ResponseEntity<TestoProductDetailResponse> response = TestoProductClient.getProductDetail(productId, TestoRequest, transaction);

        final TestoResponseStatus responseStatus = TestoBaseService.extractStatus(this.getClass().getSimpleName(), TestoServiceNameConstant.CASA_PRODUCT_DETAIL, response, transaction);
        if (TestoBaseService.isFailed(responseStatus)) {
            throw new IllegalStateException("Error while connect to Testo");
        }
        return Objects.requireNonNull(response.getBody()).getProduct();
    }


    public void setFirstTier(TestoProductDetail productDetail) {
        List<TestoInterestRate> interestTierList = ((productDetail.getRateList() == null) ? new ArrayList<>() : productDetail.getRateList());
        interestTierList.add(this.createFirstTier(productDetail));
        productDetail.setRateList(interestTierList);
    }

    private TestoInterestRate createFirstTier(TestoProductDetail productDetail) {
        return TestoInterestRate.builder()
                .interestRateNo(productDetail.getInterestRateNo().intValue())
                .balanceRate(BigDecimal.ZERO)
                .interestRatePercentage(productDetail.getInterestRatePercentage())
                .build();
    }
}
