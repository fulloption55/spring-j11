package com.theerut.springj11.constant;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum ProductGroupNameEnum {

    ACCOUNT_OPENING ("Account Opening");

    private final String text;

    ProductGroupNameEnum(String text) {
        this.text = text;
    }

    public static ProductGroupNameEnum getEnum(String codeInput) {
        return Arrays.stream(ProductGroupNameEnum.values())
                .filter(responseEnum -> responseEnum.text.equals(codeInput))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Not supported type: " + codeInput));
    }
}
