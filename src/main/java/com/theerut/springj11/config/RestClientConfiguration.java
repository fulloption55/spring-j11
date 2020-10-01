package com.theerut.springj11.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class RestClientConfiguration {

    @Value("${internal.customer.rest-client.read-timeout}")
    private Integer customerReadTimeout;

    @Value("${internal.customer.rest-client.connection-timeout}")
    private Integer customerConnectionTimeout;

    @Value("${internal.customer.rest-client.max-per-route}")
    private Integer customerMaxPerRoute;

    @Value("${internal.customer.rest-client.total-connection}")
    private Integer customerTotalConnection;

    @Value("${internal.notification.rest-client.read-timeout}")
    private Integer notificationReadTimeout;

    @Value("${internal.notification.rest-client.connection-timeout}")
    private Integer notificationConnectionTimeout;

    @Value("${internal.notification.rest-client.max-per-route}")
    private Integer notificationMaxPerRoute;

    @Value("${internal.notification.rest-client.total-connection}")
    private Integer notificationTotalConnection;

    @Value("${internal.gateway-management.rest-client.read-timeout}")
    private Integer gatewayReadTimeout;

    @Value("${internal.gateway-management.rest-client.connection-timeout}")
    private Integer gatewayConnectionTimeout;

    @Value("${internal.gateway-management.rest-client.max-per-route}")
    private Integer gatewayMaxPerRoute;

    @Value("${internal.gateway-management.rest-client.total-connection}")
    private Integer gatewayTotalConnection;

    @Value("${external.Testo.service.product-detail.rest-client.total-connection}")
    private Integer productDetailTotalConnection;

    @Value("${external.Testo.service.product-detail.rest-client.max-per-route}")
    private Integer productDetailMaxPerRoute;

    @Value("${external.Testo.service.product-detail.rest-client.connection-timeout}")
    private Integer productDetailConnectionTimeout;

    @Value("${external.Testo.service.product-detail.rest-client.read-timeout}")
    private Integer productDetailReadTimeout;
    
    @Value("${external.Testo.service.account-detail.rest-client.total-connection}")
    private Integer accountDetailTotalConnection;

    @Value("${external.Testo.service.account-detail.rest-client.max-per-route}")
    private Integer accountDetailMaxPerRoute;

    @Value("${external.Testo.service.account-detail.rest-client.connection-timeout}")
    private Integer accountDetailConnectionTimeout;

    @Value("${external.Testo.service.account-detail.rest-client.read-timeout}")
    private Integer accountDetailReadTimeout;

    @Value("${external.Testo.service.deposit.open-account.rest-client.read-timeout}")
    private Integer openAccountReadTimeout;
}
