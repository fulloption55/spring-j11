package com.theerut.springj11.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum TestoResponseCodeEnum {
    SUCCESS("AA", "Success", "success transaction"),
    NO_RECORDS_FOUND("MBM2001", "TZDD45003:No records found.", "When Testo has not infomation");

    private final String code;
    private final String message;
    private final String description;

    public static TestoResponseCodeEnum getEnum(String codeInput) {
        return Arrays.stream(TestoResponseCodeEnum.values())
                .filter(responseEnum -> responseEnum.code.equals(codeInput))
                .findFirst()
                .orElse(null);
    }
}
