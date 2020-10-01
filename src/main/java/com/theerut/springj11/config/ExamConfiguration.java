package com.theerut.springj11.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class ExamConfiguration {

    @Value("${external.exam.soap-client.host}")
    private String host;

    @Value("${external.exam.username}")
    private String username;

    @Value("${external.exam.password}")
    private String password;

    @Value("${external.exam.soap-client.version}")
    private String version;

    @Value("${external.exam.service.account-opening.teller.id}")
    private String accountOpeningTellerId;

    @Value("${external.exam.service.account-opening.serving.rm}")
    private String accountServicingRm;

    @Value("${external.exam.source.system.code}")
    private String sourceSystemCode;

    @Value("${external.exam.source.country.code}")
    private String sourceCountryCode;

    @Value("${external.exam.provider.system.code}")
    private String providerSystemCode;

    @Value("${external.exam.organize.code}")
    private String organizeCode;

    @Value("${external.exam.language-preference}")
    private String languagePreference;

    @Value("${external.exam.bank.id}")
    private String bankId;

    @Value("${external.exam.bank.branch.id}")
    private String bankBranchId;

    @Value("${external.exam.soap-client.connection-timeout}")
    private int connectionTimeout;

    @Value("${external.exam.soap-client.read-timeout}")
    private int readTimeout;

    @Value("${external.exam.soap-client.total-connection}")
    private int maxTotalConnection;

    @Value("${external.exam.soap-client.name}")
    private String clientName;

    @Value("${external.exam.service.account-opening.document.number}")
    private String accountOpeningDocNum;

    @Value("${external.exam.service.account-summary.soap-client.connection-timeout}")
    private int accountSummaryConnectionTimeout;

    @Value("${external.exam.service.account-summary.soap-client.read-timeout}")
    private int accountSummaryReadTimeout;

    @Value("${external.exam.service.account-summary.soap-client.total-connection}")
    private int accountSummaryMaxTotalConnection;

    @Value("${external.exam.service.fixed-summary.soap-client.connection-timeout}")
    private int fixedSummaryConnectionTimeout;

    @Value("${external.exam.service.fixed-summary.soap-client.read-timeout}")
    private int fixedSummaryReadTimeout;

    @Value("${external.exam.service.fixed-summary.soap-client.total-connection}")
    private int fixedSummaryMaxTotalConnection;

}
