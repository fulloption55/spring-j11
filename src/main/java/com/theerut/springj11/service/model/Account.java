package com.theerut.springj11.service.model;

import lombok.Data;

@Data
public class Account {
    private String id;
    private String type;
    private String statusCode;
    private String currency;
    private String name;
    private String resStatus;
    private String branchId;
    private String mode;
    private String signingCond;
    private String availableBalance;
    private String currentBalance;
    private String productId;
    private String productDescription;
    private boolean pidmFlag;
    private boolean jointIndicator;
    private boolean allowDebit;
    private boolean allowCredit;
}
