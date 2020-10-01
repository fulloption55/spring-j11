package com.theerut.springj11.config;

import lombok.RequiredArgsConstructor;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
@RequiredArgsConstructor
public class RestTemplateConfiguration {
    private final RestClientConfiguration restClientConfiguration;

    @Bean
    public RestTemplate customerRestTemplate() {
        PoolingHttpClientConnectionManager connectionManager = this.initConnectionManager(
                restClientConfiguration.getCustomerTotalConnection(),
                restClientConfiguration.getCustomerMaxPerRoute());

        return this.createRestTemplate(connectionManager
                , restClientConfiguration.getCustomerConnectionTimeout()
                , restClientConfiguration.getCustomerReadTimeout());
    }

    @Bean
    public RestTemplate notificationRestTemplate() {
        PoolingHttpClientConnectionManager connectionManager = this.initConnectionManager(
                restClientConfiguration.getNotificationTotalConnection(),
                restClientConfiguration.getNotificationMaxPerRoute());

        return this.createRestTemplate(connectionManager
                , restClientConfiguration.getNotificationConnectionTimeout()
                , restClientConfiguration.getNotificationReadTimeout());
    }

    @Bean
    public RestTemplate gatewayRestTemplate() {
        PoolingHttpClientConnectionManager connectionManager = this.initConnectionManager(
                restClientConfiguration.getGatewayTotalConnection(),
                restClientConfiguration.getGatewayMaxPerRoute());

        return this.createRestTemplate(connectionManager
                , restClientConfiguration.getGatewayConnectionTimeout()
                , restClientConfiguration.getGatewayReadTimeout());
    }

    @Bean
    public RestTemplate productDetailRestTemplate() {
        PoolingHttpClientConnectionManager connectionManager = this.initConnectionManager(
                restClientConfiguration.getProductDetailTotalConnection(),
                restClientConfiguration.getProductDetailMaxPerRoute());

        return this.createRestTemplate(connectionManager
                , restClientConfiguration.getProductDetailConnectionTimeout()
                , restClientConfiguration.getProductDetailReadTimeout());
    }

    @Bean
    public RestTemplate openAccountRestTemplate() {
        PoolingHttpClientConnectionManager connectionManager = this.initConnectionManager(
                restClientConfiguration.getProductDetailTotalConnection(),
                restClientConfiguration.getProductDetailMaxPerRoute());

        return this.createRestTemplate(connectionManager
                , restClientConfiguration.getOpenAccountReadTimeout()
                , restClientConfiguration.getOpenAccountReadTimeout());
    }

    private RestTemplate createRestTemplate(HttpClientConnectionManager connectionManager, int connectionTimeout, int readTimeout) {
        RestTemplate restTemplate = new RestTemplate(this.getClientHttpRequestFactory(connectionManager, connectionTimeout, readTimeout));
        restTemplate.setErrorHandler(new RestTemplateErrorHandler());
        return restTemplate;
    }

    private ClientHttpRequestFactory getClientHttpRequestFactory(HttpClientConnectionManager connectionManager, int connectionTimeout, int readTimeout) {
        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory(getCloseableHttpClient(connectionManager));
        factory.setConnectTimeout(connectionTimeout);
        factory.setConnectionRequestTimeout(connectionTimeout);
        factory.setReadTimeout(readTimeout);
        return factory;
    }

    private CloseableHttpClient getCloseableHttpClient(HttpClientConnectionManager connectionManager) {
        return HttpClients.custom().setConnectionManager(connectionManager).build();
    }

    private PoolingHttpClientConnectionManager initConnectionManager(Integer maxTotalConnection, Integer maxPerRoute) {
        PoolingHttpClientConnectionManager connectionManager = new PoolingHttpClientConnectionManager();
        connectionManager.setDefaultMaxPerRoute(maxPerRoute);
        connectionManager.setMaxTotal(maxTotalConnection);
        return connectionManager;
    }
}
