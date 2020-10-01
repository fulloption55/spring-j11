package com.theerut.springj11.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ProductDetailResponseV2 {

    @JsonProperty("product_code")
    private String productCode;

    @JsonProperty("currency_code")
    private String currencyCode;

    @JsonProperty("pricing_group")
    private String pricingGroup;

    @JsonProperty("product_description")
    private String productDescription;

    @JsonProperty("product_local_description")
    private String productLocalDescription;

    @JsonProperty("bank_no")
    private String bankNo;

    @JsonProperty("split_accrual_method")
    private String splitAccrualMethod;

    @JsonProperty("interest_rate_no")
    private BigDecimal interestRateNo;

    @JsonProperty("interest_rate_percentage")
    private BigDecimal interestRatePercentage;

    @JsonProperty("rate_list")
    private List<ProductInterestResponse> productInterestResponseList;
}
