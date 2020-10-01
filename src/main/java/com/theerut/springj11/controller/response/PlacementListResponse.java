package com.theerut.springj11.controller.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class PlacementListResponse {
    private String id;
    private String accountId;
    private String productType;
    private String statusCode;
    private String currency;
    private String availableBalance;
    private String currentBalance;
    private BigDecimal interestRate;
    private Integer termCount;
    private String termUnit;
    private String maturityDate;
}
