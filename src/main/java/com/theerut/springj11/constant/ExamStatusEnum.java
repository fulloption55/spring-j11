package com.theerut.springj11.constant;

import lombok.Getter;

@Getter
public enum ExamStatusEnum {
    SUCCESS(0L, "Success"),
    NO_RECORD(3022L, "No record(s) found"),
    ERROR_EXCEED_ACCOUNT_FOR_PRODUCT(3166L, "Exceed maximum number account per UID for this product"),
    GENERAL_ERROR(9999L, "General Error");

    private final Long code;
    private final String text;

    ExamStatusEnum(Long code, String text) {
        this.code = code;
        this.text = text;
    }
}
