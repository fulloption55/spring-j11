package com.theerut.springj11.factory.response;

import com.theerut.springj11.client.webservice.common.EXAMExtensionInfoType;
import com.theerut.springj11.client.webservice.productinquiry.EXAMProdInqDetailsType;
import com.theerut.springj11.constant.AccountTypeEnum;
import com.theerut.springj11.controller.model.InterestTier;
import com.theerut.springj11.service.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.theerut.springj11.constant.ProductInquiryConstant.BALANCE_RATE;
import static com.theerut.springj11.constant.ProductInquiryConstant.INTEREST_ID;
import static com.theerut.springj11.constant.ProductInquiryConstant.INTEREST_RATE;

@Slf4j
@Component
public class ProductInquiryResponseFactory {

    public Product mapProduct(EXAMProdInqDetailsType prodInqDetailsType) {
        final String productId = prodInqDetailsType.getExamAcctInfo().getProductId();
        final String currency = prodInqDetailsType.getExamAcctInfo().getCurCode();
        final Product product = new Product();
        product.setId(productId);
        product.setCurrency(currency);
        return product;
    }

    public Product mapProductDetail(EXAMProdInqDetailsType prodInqDetailsType) {
        final String productId = prodInqDetailsType.getExamAcctInfo().getProductId();
        final String currency = prodInqDetailsType.getExamAcctInfo().getCurCode();
        final String descriptionTh = prodInqDetailsType.getExamAcctInfo().getEXAMLocalDesc();
        final String description = prodInqDetailsType.getExamAcctInfo().getEXAMProdDesc();
        final AccountTypeEnum accountType = AccountTypeEnum.getEnum(prodInqDetailsType.getExamAcctInfo().getAcctType());
        final String effectiveDate = prodInqDetailsType.getExamAcctInfo().getEffDt();
        final Product product = new Product();
        product.setId(productId);
        product.setCurrency(currency);
        product.setName(description);
        product.setLocalName(descriptionTh);
        product.setType(accountType);
        product.setEffectiveDate(effectiveDate);
        product.setInterestTier(this.getInterestTierList(prodInqDetailsType.getEXAMExtnInfo()));
        return product;
    }

    private List<InterestTier> getInterestTierList(List<EXAMExtensionInfoType> extensionInfoTypeList) {
        final Map<String, String> mapExtension = new HashMap<>();
        for (EXAMExtensionInfoType extensionInfoType : extensionInfoTypeList) {
            mapExtension.put(extensionInfoType.getFieldName(), extensionInfoType.getValue());
        }
        final List<InterestTier> interestTiers = new ArrayList<>();
        for (int index = 1; index <= 12; index++) {
            final InterestTier interestTier = new InterestTier();
            interestTier.setLevel(index);
            if (index == 1) {
                interestTier.setInterestId(mapExtension.get(INTEREST_ID));
                interestTier.setInterestRate(mapExtension.get(INTEREST_RATE));
                interestTier.setBalanceRate(null);
            } else {
                final String suffixIndex = "_" + index;
                interestTier.setInterestId(mapExtension.get(INTEREST_ID + suffixIndex));
                interestTier.setInterestRate(mapExtension.get(INTEREST_RATE + suffixIndex));
                interestTier.setBalanceRate(mapExtension.get(BALANCE_RATE + suffixIndex));
            }
            interestTiers.add(interestTier);
        }
        return interestTiers;
    }
}