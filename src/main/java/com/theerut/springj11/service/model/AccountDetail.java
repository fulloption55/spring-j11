package com.theerut.springj11.service.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class AccountDetail implements Serializable {
    private String id;
    private String type;
    private String description;
    private String statusCode;
    private String currency;
    private String primaryName;
    private String secondaryName;
    private String firstName;
    private String middleName;
    private String lastName;
    private String nickName;
    private String resStatus;
    private String branchId;
    private String mode;
    private String availableBalance;
    private String currentBalance;
    private String productId;
    private String productDescription;
    private boolean allowCredit;
    private String overdraftCreditLimit;
    private String accountCreditLimit;
    private String accountInterest;
    private String interestRate;
    private String productInterestId;
    private String productInterestRate;
    private String interestLoading;
}
