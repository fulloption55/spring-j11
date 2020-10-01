package com.theerut.springj11.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum  AccountTransactionTypeEnum {
    DEBIT("D", "Debit"),
    CREDIT("C", "Credit");

    private final String code;
    private final String value;

    public static AccountTransactionTypeEnum  getTransactionType(String codeInput) {
        return Arrays.stream(AccountTransactionTypeEnum.values())
                .filter(responseEnum -> responseEnum.code.equals(codeInput))
                .findFirst()
                .orElse(null);
    }

}
