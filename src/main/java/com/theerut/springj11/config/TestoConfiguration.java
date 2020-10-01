package com.theerut.springj11.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class TestoConfiguration {
    @Value("${external.Testo.host}")
    private String TestoHost;

    @Value("${external.Testo.teller.id}")
    private String tellerId;

    @Value("${external.Testo.create-account.teller.id}")
    private String createAccountTellerId;

    @Value("${external.Testo.endpoint.product-detail}")
    private String TestoEndpointProductDetail;

    @Value("${external.Testo.endpoint.account-detail}")
    private String TestoEndpointAccountDetail;

    @Value("${external.Testo.endpoint.casa.account.transaction}")
    private  String TestoEndpointCasaAccountTransaction;

    @Value("${external.Testo.endpoint.casa-account-list}")
    private String TestoEndpointCasaAccountList;

    @Value("${external.Testo.endpoint.fixed-account-list}")
    private String TestoEndpointFixedAccountList;

    @Value("${external.Testo.endpoint.create-account}")
    private String TestoEndpointCreateAccount;

    @Value("${external.Testo.endpoint.get-address}")
    private String TestoEndpointGetAddress;

    @Value("${external.Testo.branch.id}")
    private String branchId;

    @Value("${external.Testo.username}")
    private String username;

    @Value("${external.Testo.password}")
    private String password;
}

