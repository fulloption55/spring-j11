package com.theerut.springj11.constant;

import lombok.Getter;

@Getter
public enum CurrencyEnum {
    THB("THB", "Thai Baht");

    private final String code;
    private final String text;

    CurrencyEnum(String code, String text) {
        this.code = code;
        this.text = text;
    }
}
