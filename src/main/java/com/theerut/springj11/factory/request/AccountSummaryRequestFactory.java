package com.theerut.springj11.factory.request;

import com.theerut.springj11.client.webservice.HeaderRequest;
import com.theerut.springj11.client.webservice.accountsummary.EXAMAcctSummRqType;
import com.theerut.springj11.client.webservice.accountsummary.EXAMAcctSummSvc;
import com.theerut.springj11.constant.AccountTypeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.theerut.springj11.constant.ServiceNameConstant.ACCOUNT_SUMMARY;

@Component
public class AccountSummaryRequestFactory extends RequestFactory {

    @Autowired
    private HeaderRequest soapHeader;

    public EXAMAcctSummSvc getRequest(String requestId, String cifId) {
        final EXAMAcctSummRqType summaryRequestType = this.createSummaryRequestType(requestId, cifId);
        final EXAMAcctSummSvc summaryRequestService = new EXAMAcctSummSvc();
        summaryRequestService.setExamSignonRq(soapHeader.getExamSignonRequest(ACCOUNT_SUMMARY));
        summaryRequestService.setEXAMAcctSummRq(summaryRequestType);
        return summaryRequestService;
    }

    public EXAMAcctSummSvc getPlacementRequest(String requestId, String fixedAccountGroupId) {
        final EXAMAcctSummRqType summaryRequestType = this.createPlacementRequestType(requestId, fixedAccountGroupId);
        final EXAMAcctSummSvc summaryRequestService = new EXAMAcctSummSvc();
        summaryRequestService.setExamSignonRq(soapHeader.getExamSignonRequest(ACCOUNT_SUMMARY));
        summaryRequestService.setEXAMAcctSummRq(summaryRequestType);
        return summaryRequestService;
    }

    private EXAMAcctSummRqType createSummaryRequestType(String requestId, String cifId) {
        final EXAMAcctSummRqType accountSummaryRequestType = new EXAMAcctSummRqType();
        accountSummaryRequestType.setEXAMRqUID(requestId);
        accountSummaryRequestType.setCustPermId(cifId);
        accountSummaryRequestType.setAcctType(AccountTypeEnum.SAVING.getCode());
        accountSummaryRequestType.setEXAMNonFinSvcHeaderInfo(this.createNonFinSvcHeaderInfo());
        return accountSummaryRequestType;
    }

    private EXAMAcctSummRqType createPlacementRequestType(String requestId, String fixedAccountGroupId) {
        final EXAMAcctSummRqType accountSummaryRequestType = new EXAMAcctSummRqType();
        accountSummaryRequestType.setEXAMRqUID(requestId);
        accountSummaryRequestType.setEXAMFDAcctGrpNum(fixedAccountGroupId);
        accountSummaryRequestType.setAcctType(AccountTypeEnum.FIXED.getCode());
        accountSummaryRequestType.setEXAMNonFinSvcHeaderInfo(this.createNonFinSvcHeaderInfo());
        return accountSummaryRequestType;
    }

}
