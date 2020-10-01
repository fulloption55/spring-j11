package com.theerut.springj11.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class EndpointConfiguration {
    @Value("${internal.customer.host}")
    private String customerHost;

    @Value("${internal.gateway-management.host}")
    private String gatewayManagementHost;

    @Value("${internal.customer.endpoint.profile}")
    private String customerEndpointProfile;

    @Value("${internal.customer.endpoint.profile.management}")
    private String customerEndpointProfileManagement;

    @Value("${internal.customer.endpoint.fatca}")
    private String profileFatcaEndpointProfile;


    @Value("${internal.customer.endpoint.fatca.profile.search.management}")
    private String searchProfileFatcaEndpointManagement;

    @Value("${internal.customer.endpoint.fatca.management}")
    private String profileFatcaEndpointProfileManagement;

    @Value("${internal.customer.endpoint.watchlist}")
    private String customerEndpointProfileWatchList;


    @Value("${internal.customer.endpoint.watchlist.management}")
    private String customerEndpointProfileWatchListManagement;

    @Value("${internal.customer.endpoint.passcode-validation}")
    private String customerEndpointPasscodeValidation;

    @Value("${internal.gateway-management.endpoint.passcode-validation}")
    private String gatewayEndpointPasscodeValidation;

    @Value("${internal.notification.host}")
    private String notificationHost;

    @Value("${internal.notification.endpoint.email}")
    private String notificationEndpointEmail;

    @Value("${internal.legal-document.host}")
    private String legalDocumentHost;

    @Value("${internal.legal-document.endpoint.document}")
    private String legalDocumentEndpointDocument;

    @Value("${internal.legal-document.endpoint.agreement-verification}")
    private String legalDocumentEndpointAgreementVerification;
}
