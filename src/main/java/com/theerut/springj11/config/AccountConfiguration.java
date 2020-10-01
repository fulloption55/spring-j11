package com.theerut.springj11.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Getter
@Configuration
public class AccountConfiguration {
    @Value("${account-type.saving.prefix}")
    private List<String> accountTypeSavingPrefixes;

    @Value("${account-type.current.prefix}")
    private List<String> accountTypeCurrentPrefixes;
}
