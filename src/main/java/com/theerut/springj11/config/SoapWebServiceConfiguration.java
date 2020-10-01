package com.theerut.springj11.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.transport.WebServiceMessageSender;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

@Configuration
@RequiredArgsConstructor
public class SoapWebServiceConfiguration {
    private static final String SOAP_PACKAGE_NAME = "com.theerut.springj11.client.webservice";
    private final ExamConfiguration examConfiguration;

    private Jaxb2Marshaller examMarshaller() throws Exception {
        final Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan(SOAP_PACKAGE_NAME);
        marshaller.afterPropertiesSet();
        return marshaller;
    }

    @Bean
    public WebServiceTemplate examWebServiceTemplate() throws Exception {
        final WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        WebServiceMessageSender webServiceMessageSender = this.examWebServiceMessageSender(
                examConfiguration.getReadTimeout(),
                examConfiguration.getConnectionTimeout(),
                examConfiguration.getMaxTotalConnection());
        webServiceTemplate.setMessageSender(webServiceMessageSender);
        webServiceTemplate.setMarshaller(this.examMarshaller());
        webServiceTemplate.setUnmarshaller(this.examMarshaller());
        return webServiceTemplate;
    }

    @Bean
    public WebServiceTemplate examAccountSummaryTemplate() throws Exception {
        final WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        WebServiceMessageSender webServiceMessageSender = this.examWebServiceMessageSender(
                examConfiguration.getAccountSummaryReadTimeout(),
                examConfiguration.getAccountSummaryConnectionTimeout(),
                examConfiguration.getAccountSummaryMaxTotalConnection());
        webServiceTemplate.setMessageSender(webServiceMessageSender);
        webServiceTemplate.setMarshaller(this.examMarshaller());
        webServiceTemplate.setUnmarshaller(this.examMarshaller());
        return webServiceTemplate;
    }

    @Bean
    public WebServiceTemplate examFixedGroupSummaryTemplate() throws Exception {
        final WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        WebServiceMessageSender webServiceMessageSender = this.examWebServiceMessageSender(
                examConfiguration.getFixedSummaryReadTimeout(),
                examConfiguration.getFixedSummaryConnectionTimeout(),
                examConfiguration.getFixedSummaryMaxTotalConnection());
        webServiceTemplate.setMessageSender(webServiceMessageSender);
        webServiceTemplate.setMarshaller(this.examMarshaller());
        webServiceTemplate.setUnmarshaller(this.examMarshaller());
        return webServiceTemplate;
    }

    private WebServiceMessageSender examWebServiceMessageSender(int readTimeout, int connectionTimeout, int maxConnection) {
        HttpComponentsMessageSender httpComponentsMessageSender = new HttpComponentsMessageSender();
        httpComponentsMessageSender.setReadTimeout(connectionTimeout);
        httpComponentsMessageSender.setConnectionTimeout(readTimeout);
        httpComponentsMessageSender.setMaxTotalConnections(maxConnection);
        return httpComponentsMessageSender;
    }
}
