package com.theerut.springj11.controller;

import com.theerut.springj11.annotation.LogStartEnd;
import com.theerut.springj11.annotation.LogTime;
import com.theerut.springj11.config.ProductConfiguration;
import com.theerut.springj11.constant.CurrencyEnum;
import com.theerut.springj11.constant.ResponseConstant;
import com.theerut.springj11.controller.model.AccountType;
import com.theerut.springj11.controller.request.ProductRequest;
import com.theerut.springj11.controller.response.GeneralResponse;
import com.theerut.springj11.controller.response.ProductDetailResponse;
import com.theerut.springj11.controller.response.ProductDetailResponseV2;
import com.theerut.springj11.controller.response.ProductInterestResponse;
import com.theerut.springj11.factory.response.ResponseFactory;
import com.theerut.springj11.service.TestoProductService;
import com.theerut.springj11.service.ProductService;
import com.theerut.springj11.service.model.TestoInterestRate;
import com.theerut.springj11.service.model.TestoProductDetail;
import com.theerut.springj11.service.model.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ResponseFactory responseFactory;
    private final ProductService productService;
    private final TestoProductService TestoProductService;
    private final ProductConfiguration productConfiguration;

    private static final String ERROR_LOG_TEMPLATE = "Error {}";

    @LogTime
    @PostMapping(value = "/v1/products/search")
    public ResponseEntity<GeneralResponse<List<ProductDetailResponse>>> searchProductList(@Valid @RequestBody ProductRequest request) {
        log.info("========== Start to search product list with currency is [{}] ==========", request.getCurrency());
        try {
            final List<Product> productList = productService.getProductList();
            final List<Product> filteredProductList = productService.filter(productList, Collections.singletonList(request.getCurrency()),
                    productConfiguration.getAllowAccountOpeningProductList());

            final List<Product> productDetailList = productService.getProductDetailList(filteredProductList);

            return responseFactory.success(this.buildProductResponseList(productDetailList));
        } catch (IllegalArgumentException iae) {
            log.error(ERROR_LOG_TEMPLATE, iae.toString());
            return responseFactory.error(HttpStatus.BAD_REQUEST, ResponseConstant.GENERAL_ERROR_CODE);
        } finally {
            log.info("========== End to search product list with currency is [{}] ==========", request.getCurrency());
        }
    }

    @LogTime
    @PostMapping(value = "/v1/management/products/search")
    public ResponseEntity<GeneralResponse<List<ProductDetailResponse>>> searchAllProductList(@Valid @RequestBody ProductRequest request) {
        log.info("========== Start to search product list with currency is [{}] ==========", request.getCurrency());
        try {
            final List<Product> productList = productService.getProductList();
            final List<Product> filteredProductList = productService.filter(productList,
                    Collections.singletonList(request.getCurrency()),
                    null);
            final List<Product> productDetailList = productService.getProductDetailList(filteredProductList);

            return responseFactory.success(this.buildProductResponseList(productDetailList));
        } catch (IllegalArgumentException iae) {
            log.error(ERROR_LOG_TEMPLATE, iae.toString());
            return responseFactory.error(HttpStatus.BAD_REQUEST, ResponseConstant.GENERAL_ERROR_CODE);
        } finally {
            log.info("========== End to search product list with currency is [{}] ==========", request.getCurrency());
        }
    }

    @LogTime
    @LogStartEnd
    @GetMapping(value = "/v1/products/{product_id}")
    public ResponseEntity<GeneralResponse<ProductDetailResponseV2>> getTestoProductDetail(@PathVariable("product_id") String productId, @RequestParam(required = false, defaultValue = "THB") CurrencyEnum currency) {
        try {
            TestoProductDetail productDetail = TestoProductService.getProduct(productId, currency.getCode());
            return responseFactory.success(this.buildProductDetail(productDetail));
        } catch (IllegalArgumentException iae) {
            log.error(ERROR_LOG_TEMPLATE, iae.toString());
            return responseFactory.error(HttpStatus.BAD_REQUEST, ResponseConstant.GENERAL_ERROR_CODE);
        }
    }

    @LogTime
    @LogStartEnd
    @GetMapping(value = "/v1/management/products/{product_id}")
    public ResponseEntity<GeneralResponse<ProductDetailResponseV2>> getManagementTestoProductDetail(@PathVariable("product_id") String productId, @RequestParam(required = false, defaultValue = "THB") CurrencyEnum currency) {
        try {
            TestoProductDetail productDetail = TestoProductService.getProduct(productId, currency.getCode());
            return responseFactory.success(this.buildProductDetail(productDetail));
        } catch (IllegalArgumentException iae) {
            log.error(ERROR_LOG_TEMPLATE, iae.toString());
            return responseFactory.error(HttpStatus.BAD_REQUEST, ResponseConstant.GENERAL_ERROR_CODE);
        }
    }

    private List<ProductDetailResponse> buildProductResponseList(List<Product> productDetailList) {
        List<ProductDetailResponse> productDetailResponseList = new ArrayList<>();
        for (Product product : productDetailList) {
            productDetailResponseList.add(ProductDetailResponse.builder()
                    .id(product.getId())
                    .name(product.getLocalName())
                    .accountType(AccountType.builder().code(product.getType().name()).description(product.getType().getDescription()).build())
                    .currency(product.getCurrency())
                    .description(product.getLocalDescription())
                    .interestTiers(product.getInterestTier())
                    .accountLimit(product.getAccountLimit())
                    .build());
        }
        return productDetailResponseList;
    }

    private ProductDetailResponseV2 buildProductDetail(TestoProductDetail productDetail) {
        ProductDetailResponseV2 response = new ProductDetailResponseV2();
        response.setBankNo(productDetail.getBankNo());
        response.setCurrencyCode(productDetail.getCurrencyCode());
        response.setInterestRateNo(productDetail.getInterestRateNo());
        response.setInterestRatePercentage(productDetail.getInterestRatePercentage());
        response.setPricingGroup(productDetail.getPricingGroup());
        response.setProductDescription(productDetail.getProductDescription());
        response.setProductLocalDescription(productDetail.getProductLocalDescription());
        response.setSplitAccrualMethod(productDetail.getSplitAccrualMethod());
        response.setProductCode(productDetail.getProductCode());

        List<ProductInterestResponse> interestResponseList = new ArrayList<>();
        for (TestoInterestRate interestRate : productDetail.getRateList()) {
            ProductInterestResponse interestResponse = new ProductInterestResponse();
            interestResponse.setBalanceRate(interestRate.getBalanceRate());
            interestResponse.setInterestRateNo(interestRate.getInterestRateNo());
            interestResponse.setInterestRatePercentage(interestRate.getInterestRatePercentage());
            interestResponseList.add(interestResponse);
        }
        response.setProductInterestResponseList(interestResponseList);

        return response;
    }
}
