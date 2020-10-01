package com.theerut.springj11.constant;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum ActionTransactionTypeEnum {
    WATCHLIST(1, "Check WatchList", "Watchlist Validation"),
    FATCA(2, "Check FATCA status", "Foreign Account Tax Compliance Act (FATCA) Validation"),
    KYC_GRADE(3, "Check KYC Grade", "Know Your Customer (KYC) Grading Validation"),
    ACCOUNT_OPENING(4, "Account Opening", "New Account Creation"),
    ADDING_FATCA(5, "Adding FATCA Status", "Adding FATCA Status to Profile");

    private final Integer code;
    private final String name;
    private final String description;


    public static ActionTransactionTypeEnum getEnum(Integer codeInput) {
        return Arrays.stream(ActionTransactionTypeEnum.values())
                .filter(responseEnum -> responseEnum.code.equals(codeInput))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Not supported type: " + codeInput));
    }

    ActionTransactionTypeEnum(Integer code, String name, String description) {
        this.code = code;
        this.name = name;
        this.description = description;
    }

}
