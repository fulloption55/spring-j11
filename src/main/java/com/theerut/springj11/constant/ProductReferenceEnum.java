package com.theerut.springj11.constant;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum ProductReferenceEnum {

    DIGITAL_E_SAVING("SAND0001"),
    DIGITAL_AIR_ASIA("SASD0001"),
    DIGITAL_PAYROLL("SABP0001");
    
    private final String text;

    ProductReferenceEnum(String text) {
        this.text = text;
    }

    public static ProductReferenceEnum getEnum(String codeInput) {
        return Arrays.stream(ProductReferenceEnum.values())
                .filter(responseEnum -> responseEnum.text.equals(codeInput))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Not supported type: " + codeInput));
    }
}
