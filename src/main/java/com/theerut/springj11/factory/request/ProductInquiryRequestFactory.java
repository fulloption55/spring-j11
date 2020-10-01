package com.theerut.springj11.factory.request;

import com.theerut.springj11.client.webservice.HeaderRequest;
import com.theerut.springj11.client.webservice.common.EXAMExtensionInfoType;
import com.theerut.springj11.client.webservice.productinquiry.EXAMProductInquiry;
import com.theerut.springj11.client.webservice.productinquiry.EXAMProductInquiryRqType;
import com.theerut.springj11.constant.ProductInquiryConstant;
import com.theerut.springj11.factory.request.RequestFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static com.theerut.springj11.constant.ServiceNameConstant.PRODUCT_INQUIRY;

@Component
public class ProductInquiryRequestFactory extends RequestFactory  {

    private final HeaderRequest soapHeader;

    @Autowired
    public ProductInquiryRequestFactory(HeaderRequest soapHeader) {
        this.soapHeader = soapHeader;
    }

    public EXAMProductInquiry getDetailRequest (String requestId, String productId,String currency) {
        final EXAMProductInquiryRqType productInquiryRqType = this.createProductDetailRequest(requestId, productId, currency);
        final EXAMProductInquiry productInquiryService = new EXAMProductInquiry();
        productInquiryService.setExamSignonRq(soapHeader.getExamSignonRequest(PRODUCT_INQUIRY));
        productInquiryService.setEXAMProductInquiryRq(productInquiryRqType);
        return productInquiryService;
    }

    public EXAMProductInquiry getListRequest (String requestId, String bankId, String branchId) {
        final EXAMProductInquiryRqType productInquiryRqType = this.createProductListRequest(requestId, bankId, branchId);
        final EXAMProductInquiry productInquiryService = new EXAMProductInquiry();
        productInquiryService.setExamSignonRq(soapHeader.getExamSignonRequest(PRODUCT_INQUIRY));
        productInquiryService.setEXAMProductInquiryRq(productInquiryRqType);
        return productInquiryService;
    }

    public EXAMProductInquiryRqType createProductDetailRequest(String requestId, String prodId, String curCode){
        final EXAMProductInquiryRqType req = new EXAMProductInquiryRqType();
        req.setEXAMRqUID(requestId);
        req.setEXAMNonFinSvcHeaderInfo(createNonFinSvcHeaderInfo());
        req.setEXAMModeOfOpr(ProductInquiryConstant.MODEOFOPR_PRODUCT_RATE);
        req.setProductId(prodId);
        req.setCurCode(curCode);

        List<EXAMExtensionInfoType> extensionInfoTypes = new ArrayList<>();
        EXAMExtensionInfoType examExtensionInfoType = new EXAMExtensionInfoType();
        examExtensionInfoType.setFieldName(ProductInquiryConstant.PRICINGGROUP_TXT);
        examExtensionInfoType.setValue("");

        extensionInfoTypes.add(examExtensionInfoType);
        req.setExamExtnInfo(extensionInfoTypes);
        return req;
    }

    public EXAMProductInquiryRqType createProductListRequest(String requestId, String bankId, String branchId){
        final EXAMProductInquiryRqType request = new EXAMProductInquiryRqType();
        request.setEXAMRqUID(requestId);
        request.setEXAMNonFinSvcHeaderInfo(createNonFinSvcHeaderInfo());
        request.setEXAMModeOfOpr(ProductInquiryConstant.MODEOFOPR_PRODUCT_CODE);

        List<EXAMExtensionInfoType> extensionInfoTypes = new ArrayList<>();
        EXAMExtensionInfoType examExtensionInfoType = new EXAMExtensionInfoType();
        examExtensionInfoType.setFieldName(ProductInquiryConstant.BRANCHID);
        examExtensionInfoType.setValue(branchId);
        extensionInfoTypes.add(examExtensionInfoType);

        examExtensionInfoType = new EXAMExtensionInfoType();
        examExtensionInfoType.setFieldName(ProductInquiryConstant.BANKID);
        examExtensionInfoType.setValue(bankId);
        extensionInfoTypes.add(examExtensionInfoType);
        request.setExamExtnInfo(extensionInfoTypes);
        return request;
    }
}
