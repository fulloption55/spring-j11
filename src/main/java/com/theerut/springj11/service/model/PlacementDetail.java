package com.theerut.springj11.service.model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class PlacementDetail {

    private String id;
    private String nickname;
    private String primaryName;
    private String secondaryName;
    private LocalDate openAccountDate;
    private LocalDate placementDate;
    private LocalDate maturityDate;
    private String bankAccountStatus;
    private BigDecimal originalBalance;
    private BigDecimal currentBalance;
    private BigDecimal interestRate;
    private Integer termCount;
    private String termUnit;
    private String currency;
}
