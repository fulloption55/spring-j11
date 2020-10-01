package com.theerut.springj11.constant;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum AccountTypeEnum {
    CURRENT("CDA", "Current", "D", "บัญชีเงินฝากกระแสรายวัน"),
    SAVING("SDA", "Savings", "S", "บัญชีเงินฝากออมทรัพย์"),
    FIXED("TDA", "Fixed", "T", "บัญชีเงินฝากประจำ"),
    SPECIAL_FIXED("SFD", "Special Fixed", "X", "บัญชีเงินฝากประจำปลอดภาษี");

    private final String code;
    private final String text;
    private final String TestoCode;
    private final String description;


    AccountTypeEnum(String code, String text, String TestoCode, String description) {
        this.code = code;
        this.text = text;
        this.description = description;
        this.TestoCode = TestoCode;
    }

    public static AccountTypeEnum getEnum(String codeInput) {
        return Arrays.stream(AccountTypeEnum.values())
                .filter(responseEnum -> responseEnum.code.equals(codeInput) || responseEnum.TestoCode.equals(codeInput))
                .findFirst()
                .orElse(null);
    }

}
