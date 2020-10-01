package com.theerut.springj11.controller.response;

import com.theerut.springj11.constant.AccountStatusEnum;
import com.theerut.springj11.constant.AccountTypeEnum;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class AccountDetailResponse {
    private String id;
    private AccountTypeEnum type;
    private String description;
    private String mode;
    private String residentStatus;
    private AccountStatusEnum statusCode;
    private String currency;
    private String primaryName;
    private String secondaryName;
    private String nickName;
    private String branchId;
    private String availableBalance;
    private String currentBalance;
    private String productId;
    private String productName;
    private String productNameEn;
    private boolean allowCredit;
    private String overdraftCreditLimit;
    private String accountCreditLimit;
    private String interestRate;
}
