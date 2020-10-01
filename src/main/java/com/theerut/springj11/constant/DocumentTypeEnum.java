package com.theerut.springj11.constant;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum DocumentTypeEnum {

    TERM_AND_CONDITION("Term and Condition"),
    FACT_SHEET("Fact Sheet");

    private final String text;

    DocumentTypeEnum(String text) { this.text = text; }


    public static DocumentTypeEnum getEnum(String codeInput) {
        return Arrays.stream(DocumentTypeEnum.values())
                .filter(responseEnum -> responseEnum.text.equals(codeInput))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Not supported type: " + codeInput));
    }
}


