package com.theerut.springj11.constant;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum AccountRelationshipEnum {
    PRIMARY("P", "Primary Account"),
    JOINT("J", "Joint Account"),
    MINOR("M", "Account for some reason"),
    UNDEFINED("", "Unknown relationship");

    private final String code;
    private final String text;

    AccountRelationshipEnum(String code, String text) {
        this.code = code;
        this.text = text;
    }

    public static AccountRelationshipEnum getEnum(String codeInput) {
        return Arrays.stream(AccountRelationshipEnum.values())
                .filter(responseEnum -> responseEnum.code.equals(codeInput))
                .findFirst()
                .orElse(null);
    }


}
