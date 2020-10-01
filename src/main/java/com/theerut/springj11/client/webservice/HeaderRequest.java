package com.theerut.springj11.client.webservice;

import com.theerut.springj11.client.webservice.common.EXAMHeaderType;
import com.theerut.springj11.client.webservice.common.EXAMProviderListType;
import com.theerut.springj11.client.webservice.common.EXAMProviderType;
import com.theerut.springj11.client.webservice.common.EXAMSignonRqType;
import com.theerut.springj11.client.webservice.common.ClientAppType;
import com.theerut.springj11.config.ExamConfiguration;
import com.theerut.springj11.utils.RandomRqIdGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
@RequiredArgsConstructor
public class HeaderRequest {
    private final DateTimeFormatter ZONED_DATETIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSS");
    private final ExamConfiguration examConfiguration;

    public EXAMSignonRqType getExamSignonRequest(String serviceName) {
        final EXAMSignonRqType signonRqType = new EXAMSignonRqType();
        signonRqType.setClientDt(LocalDateTime.now().format(ZONED_DATETIME_FORMATTER));
        signonRqType.setCustLangPref(examConfiguration.getLanguagePreference());
        signonRqType.setClientApp(this.createClientApp());
        signonRqType.setEXAMHeaderRq(this.createExamHeaderRq(serviceName));
        return signonRqType;
    }

    private ClientAppType createClientApp() {
        final ClientAppType clientApp = new ClientAppType();
        clientApp.setName(examConfiguration.getClientName());
        clientApp.setOrg(examConfiguration.getOrganizeCode());
        clientApp.setVersion(examConfiguration.getVersion());
        return clientApp;
    }

    private EXAMHeaderType createExamHeaderRq(String serviceName) {
        final EXAMHeaderType header = new EXAMHeaderType();
        header.setEXAMConsumerId(examConfiguration.getUsername());
        header.setEXAMConsumerPasswd(examConfiguration.getPassword());
        header.setEXAMServiceName(serviceName);
        header.setEXAMServiceVersion(examConfiguration.getVersion());
        header.setEXAMSrcSystem(examConfiguration.getSourceSystemCode());
        header.setEXAMProviderList(this.createExamProviderList());
        header.setEXAMSrcCountryCode(examConfiguration.getSourceCountryCode());
        return header;
    }

    private EXAMProviderListType createExamProviderList() {
        final EXAMProviderListType providerList = new EXAMProviderListType();
        providerList.getEXAMProvider().add(this.createExamProvider());
        return providerList;
    }

    private EXAMProviderType createExamProvider() {
        final EXAMProviderType providerType = new EXAMProviderType();
        providerType.setEXAMProviderRqUID(RandomRqIdGenerator.generateProviderRequestId());
        providerType.setEXAMProviderSystemCode(examConfiguration.getProviderSystemCode());
        return providerType;
    }

}
