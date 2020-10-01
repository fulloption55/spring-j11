package com.theerut.springj11.service.model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class Placement {
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
    private LocalDate maturityDate;
}
