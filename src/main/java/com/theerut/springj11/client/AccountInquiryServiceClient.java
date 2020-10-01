package com.theerut.springj11.client;

import com.theerut.springj11.client.webservice.HeaderRequest;
import com.theerut.springj11.client.webservice.accountinquiry.EXAMAcctInqRqType;
import com.theerut.springj11.client.webservice.accountinquiry.EXAMAcctInqSvc;
import com.theerut.springj11.config.ExamConfiguration;
import com.theerut.springj11.constant.ServiceNameConstant;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@Slf4j
@Component
@RequiredArgsConstructor
public class AccountInquiryServiceClient extends WebServiceGatewaySupport {
    private final HeaderRequest headerRequest;
    private final ExamConfiguration examConfiguration;
    private final WebServiceTemplate examWebServiceTemplate;

    @Deprecated
    public EXAMAcctInqSvc getAccountInquiry(EXAMAcctInqRqType request) {
        EXAMAcctInqSvc accountInq = new EXAMAcctInqSvc();
        accountInq.setExamSignonRq(headerRequest.getExamSignonRequest(ServiceNameConstant.ACCOUNT_INQUIRY));
        accountInq.setExamAcctInqRq(request);

        return (EXAMAcctInqSvc) examWebServiceTemplate
                .marshalSendAndReceive(
                        examConfiguration.getHost(),
                        accountInq,
                        new SoapActionCallback(""));
    }
}
