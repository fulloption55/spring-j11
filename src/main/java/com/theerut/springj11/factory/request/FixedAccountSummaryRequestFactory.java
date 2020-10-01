package com.theerut.springj11.factory.request;

import com.theerut.springj11.client.webservice.HeaderRequest;
import com.theerut.springj11.client.webservice.fixedgroupsummary.EXAMFDGrpSummOpr;
import com.theerut.springj11.client.webservice.fixedgroupsummary.EXAMFDGrpSummRqType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.theerut.springj11.constant.ServiceNameConstant.ACCOUNT_SUMMARY;

@Component
public class FixedAccountSummaryRequestFactory extends RequestFactory {
    private final HeaderRequest soapHeader;

    @Autowired
    public FixedAccountSummaryRequestFactory(HeaderRequest soapHeader) {
        this.soapHeader = soapHeader;
    }

    public EXAMFDGrpSummOpr getRequest(String requestId, String cifId) {
        final EXAMFDGrpSummRqType fixedGroupSummaryRequestType = this.createFixedGroupSummaryRequestType(requestId, cifId);
        final EXAMFDGrpSummOpr fixedGroupSummaryService = new EXAMFDGrpSummOpr();
        fixedGroupSummaryService.setExamSignonRq(soapHeader.getExamSignonRequest(ACCOUNT_SUMMARY));
        fixedGroupSummaryService.setExamfdGrpSummRq(fixedGroupSummaryRequestType);
        return fixedGroupSummaryService;
    }

    private EXAMFDGrpSummRqType createFixedGroupSummaryRequestType(String requestId, String cifId) {
        final EXAMFDGrpSummRqType fixedGroupSummaryRequestType = new EXAMFDGrpSummRqType();
        fixedGroupSummaryRequestType.setEXAMRqUID(requestId);
        fixedGroupSummaryRequestType.setCustPermId(cifId);
        fixedGroupSummaryRequestType.setEXAMNonFinSvcHeaderInfo(this.createNonFinSvcHeaderInfo());
        return fixedGroupSummaryRequestType;
    }

}
