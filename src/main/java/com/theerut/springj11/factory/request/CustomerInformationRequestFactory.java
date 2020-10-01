package com.theerut.springj11.factory.request;

import com.theerut.springj11.client.webservice.HeaderRequest;
import com.theerut.springj11.client.webservice.common.EXAMNonFinSvcHeaderInfoType;
import com.theerut.springj11.client.webservice.customersearch.EXAMCustSearchOpr;
import com.theerut.springj11.client.webservice.customersearch.EXAMCustSearchRqType;
import com.theerut.springj11.client.webservice.customersearch.EXAMCustSearchType;
import com.theerut.springj11.config.ExamConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.theerut.springj11.constant.ServiceNameConstant.CUSTOMER_SEARCH;

@Slf4j
@Component
public class CustomerInformationRequestFactory {

    @Autowired
    private ExamConfiguration examConfiguration;

    @Autowired
    private HeaderRequest soapHeader;

    public EXAMCustSearchOpr getEXAMCustSearchOprRequest(String requestId, String accountId) {
        EXAMCustSearchRqType examCustSearchType = this.generateEXAMCustSearchType(requestId, accountId);

        EXAMCustSearchOpr examCustSearchOpr = new EXAMCustSearchOpr();
        examCustSearchOpr.setEXAMSignonRq(soapHeader.getExamSignonRequest(CUSTOMER_SEARCH));
        examCustSearchOpr.setEXAMCustSearchRq(examCustSearchType);
        return examCustSearchOpr;
    }

    public EXAMCustSearchRqType generateEXAMCustSearchType(String requestId, String accountId) {
        String bankId = this.examConfiguration.getBankId();
        String branchId = this.examConfiguration.getBankBranchId();

        EXAMNonFinSvcHeaderInfoType examNonFinSvcHeaderInfoType = new EXAMNonFinSvcHeaderInfoType();
        examNonFinSvcHeaderInfoType.setBankId(bankId);
        examNonFinSvcHeaderInfoType.setBranchId(branchId);

        EXAMCustSearchRqType examCustSearchRqType = new EXAMCustSearchRqType();
        examCustSearchRqType.setEXAMRqUID(requestId);
        examCustSearchRqType.setEXAMNonFinSvcHeaderInfo(examNonFinSvcHeaderInfoType);

        EXAMCustSearchType examCustSerchType = new EXAMCustSearchType();
        examCustSerchType.setAcctId(accountId);

        examCustSearchRqType.setEXAMCustSearch(examCustSerchType);
        log.info("Generated EXAM Customer search type with request id [{}] " + requestId);
        return examCustSearchRqType;
    }

}
