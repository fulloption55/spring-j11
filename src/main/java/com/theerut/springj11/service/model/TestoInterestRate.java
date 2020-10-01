package com.theerut.springj11.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TestoInterestRate {
    @JsonProperty("BalanceRate")
    private BigDecimal balanceRate;

    @JsonProperty("InterestRateNo")
    private int interestRateNo;

    @JsonProperty("InterestRatePercentage")
    private BigDecimal interestRatePercentage;
}
