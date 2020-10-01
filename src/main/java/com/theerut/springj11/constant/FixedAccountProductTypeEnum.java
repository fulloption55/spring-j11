package com.theerut.springj11.constant;

import lombok.Getter;

@Getter
public enum FixedAccountProductTypeEnum {
    FIXED("0350", "Normal Fixed Account", "Normal Fixed Account"),
    SPECIAL_FIXED("0363", "Special Fixed Account", "Special Fixed Account");

    private final String code;
    private final String name;
    private final String description;

    FixedAccountProductTypeEnum(String code, String name, String description) {
        this.code = code;
        this.name = name;
        this.description = description;
    }

}
