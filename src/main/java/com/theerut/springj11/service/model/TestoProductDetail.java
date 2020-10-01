package com.theerut.springj11.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class TestoProductDetail {
    @JsonProperty("ProductCode")
    private String productCode;

    @JsonProperty("CurrencyCode")
    private String currencyCode;

    @JsonProperty("PricingGroup")
    private String pricingGroup;

    @JsonProperty("ProductDescription")
    private String productDescription;

    @JsonProperty("ProductLocalDescription")
    private String productLocalDescription;

    @JsonProperty("BankNo")
    private String bankNo;

    @JsonProperty("SplitAccrualMethod")
    private String splitAccrualMethod;

    @JsonProperty("InterestRateNo")
    private BigDecimal interestRateNo;

    @JsonProperty("InterestRatePercentage")
    private BigDecimal interestRatePercentage;

    @JsonProperty("RateList")
    private List<TestoInterestRate> rateList;
}
