package com.theerut.springj11.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductInterestResponse {
    @JsonProperty("balance_rate")
    private BigDecimal balanceRate;

    @JsonProperty("interest_rate_no")
    private Integer interestRateNo;

    @JsonProperty("interest_rate_percentage")
    private BigDecimal interestRatePercentage;
}
