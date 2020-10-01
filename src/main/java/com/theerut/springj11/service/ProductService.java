package com.theerut.springj11.service;

import com.theerut.springj11.annotation.LogTime;
import com.theerut.springj11.client.ExamSoapClient;
import com.theerut.springj11.client.webservice.ExamResponseInterface;
import com.theerut.springj11.client.webservice.common.EXAMStatusType;
import com.theerut.springj11.client.webservice.productinquiry.EXAMProductInquiry;
import com.theerut.springj11.client.webservice.productinquiry.EXAMProductInquiryRsType;
import com.theerut.springj11.config.ExamConfiguration;
import com.theerut.springj11.constant.CurrencyEnum;
import com.theerut.springj11.factory.request.ProductInquiryRequestFactory;
import com.theerut.springj11.factory.response.ProductInquiryResponseFactory;
import com.theerut.springj11.repository.entity.ProductFeatureEntity;
import com.theerut.springj11.service.base.ExamBaseService;
import com.theerut.springj11.service.model.ExamStatus;
import com.theerut.springj11.service.model.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.theerut.springj11.constant.ExamStatusEnum.GENERAL_ERROR;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductFeatureService productFeatureService;
    private final ProductInquiryRequestFactory productInquiryRequestFactory;
    private final ProductInquiryResponseFactory productInquiryResponseFactory;
    private final ExamConfiguration examConfiguration;
    private final ExamSoapClient examSoapClient;
    private final WebServiceTemplate examWebServiceTemplate;
    private final ExamBaseService examBaseService;

    @LogTime
    public List<Product> getProductDetailList(List<Product> originalList) {
        log.info("Get product Feature list for mapping.");
        List<Product> productList = new ArrayList<>();
        List<ProductFeatureEntity> productFeatureEntityList = productFeatureService.getProductFeatureList();
        for (Product product : originalList) {
            for (ProductFeatureEntity entity : productFeatureEntityList) {
                if (product.getId().equals(entity.getProductCode())) {
                    product = this.getProductDetail(product.getId(), product.getCurrency());
                    this.setProductFeature(product, entity);
                    productList.add(product);
                    break;
                }
            }
        }
        return productList;
    }

    public Product getProductDetail(String productId, String currency) {
        final String requestId = examBaseService.generateRequestId();
        log.info("Getting product detail for product ID [{}], currency [{}] and EXAM request ID [{}].", productId, currency, requestId);
        EXAMProductInquiry soapRequest = productInquiryRequestFactory.getDetailRequest(requestId, productId, currency);

        EXAMProductInquiryRsType soapResponse = this.getProductInquiry(soapRequest);
        log.info("Mapping product detail from EXAM format with product ID [{}], currency [{}].", productId, currency);

        return soapResponse.getExamProdInqDetails()
                .stream().map(productInquiryResponseFactory::mapProductDetail)
                .findFirst().orElseGet(Product::new);
    }

    public List<Product> getProductList() {
        final String bankId = examConfiguration.getBankId();
        final String branchId = examConfiguration.getBankBranchId();
        final String requestId = examBaseService.generateRequestId();
        log.info("Getting product list for bank ID [{}], branch ID [{}] and EXAM request ID [{}].", bankId, branchId, requestId);
        EXAMProductInquiry soapRequest = productInquiryRequestFactory.getListRequest(requestId, bankId, branchId);
        EXAMProductInquiryRsType soapResponse = this.getProductInquiry(soapRequest);
        log.info("Mapping product from EXAM format with bank ID [{}], branch ID [{}].", bankId, branchId);
        return soapResponse.getExamProdInqDetails()
                .stream().map(productInquiryResponseFactory::mapProduct)
                .collect(Collectors.toList());

    }

    public List<Product> filter(List<Product> originalList, List<CurrencyEnum> currencies, String[] allowedFilteredProduct) {
        Stream<Product> productStream = originalList.stream();
        if (currencies != null && !currencies.isEmpty()) {
            productStream = productStream.filter(product -> currencies
                    .stream()
                    .anyMatch(status -> status.getCode().equals(product.getCurrency())));
        }

        if (allowedFilteredProduct != null) {
            productStream = productStream.filter(product -> Stream.of(allowedFilteredProduct)
                    .anyMatch(productId -> productId.equals(product.getId())));

        }

        List<Product> filteredList = productStream.collect(Collectors.toList());
        log.info("Filter out with search criteria in product list size from [{}] to [{}]", originalList.size(), filteredList.size());
        return filteredList;
    }

    private EXAMProductInquiryRsType getProductInquiry(EXAMProductInquiry soapRequest) {
        final EXAMProductInquiryRsType soapResponse = Optional.ofNullable(examSoapClient.send(soapRequest, examWebServiceTemplate))
                .map(EXAMProductInquiry::getEXAMProductInquiryRs)
                .orElseThrow(() -> new IllegalArgumentException("Got empty from EXAM response mapping"));

        final String requestId = soapResponse.getExamRqUID();

        final EXAMStatusType examStatus = Optional.of(soapResponse)
                .map(ExamResponseInterface::getExamStatus)
                .orElseThrow(() -> new IllegalArgumentException("Got empty from EXAM status mapping"));

        final ExamStatus status = examBaseService.extractStatus(requestId,
                soapRequest.getEXAMSignonRq().getEXAMHeaderRq().getEXAMServiceName(),
                examStatus, this.getClass());


        if (examBaseService.isFailedExamStatus(soapResponse)) {
            final Long errorCode = status.getStatusCodes().stream().findFirst().orElse(GENERAL_ERROR.getCode());
            throw new IllegalStateException("EXAM Error code: " + errorCode);
        }
        return soapResponse;
    }


    private void setProductFeature(Product product, ProductFeatureEntity productFeatureEntity) {
        product.setLocalDescription(productFeatureEntity.getProductFeatureTH());
        product.setAccountLimit(productFeatureEntity.getAccountLimit());
    }
}
