package com.theerut.springj11.factory.request;

import com.theerut.springj11.client.webservice.common.EXAMNonFinSvcHeaderInfoType;
import com.theerut.springj11.config.ExamConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RequestFactory {

    @Autowired
    private ExamConfiguration examConfiguration;

    EXAMNonFinSvcHeaderInfoType createNonFinSvcHeaderInfo() {
        final EXAMNonFinSvcHeaderInfoType nonFinSvcHeaderInfo = new EXAMNonFinSvcHeaderInfoType();
        nonFinSvcHeaderInfo.setBankId(examConfiguration.getBankId());
        nonFinSvcHeaderInfo.setBranchId(examConfiguration.getBankBranchId());
        return nonFinSvcHeaderInfo;
    }
}
