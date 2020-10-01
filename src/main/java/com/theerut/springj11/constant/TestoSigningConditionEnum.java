package com.theerut.springj11.constant;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum TestoSigningConditionEnum {
    SOLE("1", "Sole"),
    ANYONE_SIGN("2", "Anyone to sign"),
    ALL_SIGN("3", "All to sign"),
    SIGN_WITH_CONDITION("4", "Sign with Condition"),
    REFER_CARD("9", "Refer to Specimen Card");

    private final String id;
    private final String description;

    TestoSigningConditionEnum(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public static TestoSigningConditionEnum getEnum(String idInput) {
        return Arrays.stream(TestoSigningConditionEnum.values())
                .filter(responseEnum -> responseEnum.id.equals(idInput))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Not supported type: " + idInput));
    }
}
