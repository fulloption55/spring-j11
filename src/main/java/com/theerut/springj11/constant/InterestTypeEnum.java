package com.theerut.springj11.constant;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum InterestTypeEnum {
    UNDEFINED("", "Undefine when Testo sent as empty string"),
    FLAT("F", "Flat rate"),
    TIER("T", "Tier rate"),
    SPLIT("S", "Split rate");

    private final String code;
    private final String description;

    InterestTypeEnum(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public static InterestTypeEnum getEnum(String codeInput) {
        return Arrays.stream(InterestTypeEnum.values())
                .filter(responseEnum -> responseEnum.code.equals(codeInput))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Not supported type: " + codeInput));
    }
}


