package com.theerut.springj11.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class ApplicationConfiguration {

    @Value("${validator.date.range.day}")
    private int validatorRangeDays;

    @Value("${validator.application-transaction.valid-in-minute}")
    private int applicationTransactionValidMinute;

    @Value("${validator.passcode.invalid-count}")
    private int passcodeInvalidCount;
}
