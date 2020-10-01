package com.theerut.springj11.service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountTransaction {
    private String type;
    private String source;
    private String referenceId;
    private String referenceType;
    private LocalDate postedDate;
    private LocalDateTime effectiveDatetime;
    private BigDecimal amount;
    private String currency;
    private BigDecimal statementBalance;
    private String statementCurrency;
    private String memo;
}