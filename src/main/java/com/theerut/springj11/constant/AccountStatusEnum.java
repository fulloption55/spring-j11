package com.theerut.springj11.constant;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum AccountStatusEnum {
    ACTIVE("1","Active", "Normal Account"),
    CLOSED("2","Close", "Closed Account"),
    MATURED_NOT_REDEEM("3","Matured not redeem", "Not support"),
    NEW("4","New", "Active account where there has been register and waiting batch to update within a day"),
    DO_NOT_CLOSE_ON_ZERO("5","Do not close on Zero", "Not support"),
    NO_DEBIT_ALLOWED("6","No debit allowed", "Not support"),
    FROZEN("7","Frozen", "Not support"),
    CHARGE_OFF("8","Charge off", "Not support"),
    DORMANT("9","Dormant", "Account where there has been no financial activity for a long period of time");

    private final String id;
    private final String code;
    private final String text;

    AccountStatusEnum(String id, String code, String text) {
        this.id = id;
        this.code = code;
        this.text = text;
    }

    public static AccountStatusEnum getEnum(String codeInput) throws IllegalArgumentException {
        return Arrays.stream(AccountStatusEnum.values())
                .filter(responseEnum -> responseEnum.code.equals(codeInput) || responseEnum.id.equals(codeInput))
                .findFirst()
                .orElse(null);
    }


}
