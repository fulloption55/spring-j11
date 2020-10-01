package com.theerut.springj11.factory.request;

import com.theerut.springj11.client.webservice.HeaderRequest;
import com.theerut.springj11.client.webservice.accountinquiry.EXAMAcctInqRqType;
import com.theerut.springj11.client.webservice.accountinquiry.EXAMAcctInqSvc;
import com.theerut.springj11.controller.request.AccountInquiryRequest;
import com.theerut.springj11.utils.RandomRqIdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.theerut.springj11.constant.ServiceNameConstant.ACCOUNT_INQUIRY;

@Component
public class AccountInquiryRequestFactory extends RequestFactory {

    private final HeaderRequest soapHeader;

    @Autowired
    public AccountInquiryRequestFactory(HeaderRequest soapHeader) {
        this.soapHeader = soapHeader;
    }

    public EXAMAcctInqRqType getEXAMAcctInqRqType (AccountInquiryRequest request){
        final EXAMAcctInqRqType req = new EXAMAcctInqRqType();
        req.setEXAMRqUID(RandomRqIdGenerator.generateRequestIdForExam());
        req.setEXAMNonFinSvcHeaderInfo(createNonFinSvcHeaderInfo());
        req.setAcctId(request.getAccountNo());
        req.setAcctType(request.getAccountType());
        return req;
    }

    public EXAMAcctInqSvc getRequest(String requestId, String accountId, String accountType) {
        final EXAMAcctInqRqType request = this.createAccountInquiryRequest(requestId, accountId, accountType);
        final EXAMAcctInqSvc service = new EXAMAcctInqSvc();
        service.setExamSignonRq(soapHeader.getExamSignonRequest(ACCOUNT_INQUIRY));
        service.setExamAcctInqRq(request);
        return service;
    }

    private EXAMAcctInqRqType createAccountInquiryRequest(String requestId, String accountId, String accountType) {
        final EXAMAcctInqRqType request = new EXAMAcctInqRqType();
        request.setEXAMRqUID(requestId);
        request.setEXAMNonFinSvcHeaderInfo(this.createNonFinSvcHeaderInfo());
        request.setAcctId(accountId);
        request.setAcctType(accountType);
        return request;
    }

}
