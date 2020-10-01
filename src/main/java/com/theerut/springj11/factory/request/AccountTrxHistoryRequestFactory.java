package com.theerut.springj11.factory.request;

import com.theerut.springj11.client.webservice.HeaderRequest;
import com.theerut.springj11.client.webservice.accounttrxhistory.EXAMDepAcctTrnInqRqType;
import com.theerut.springj11.client.webservice.accounttrxhistory.EXAMDepAcctTrnInqSvc;
import com.theerut.springj11.client.webservice.accounttrxhistory.SelRangeDt;
import com.theerut.springj11.client.webservice.common.DepAcctIdType;
import com.theerut.springj11.constant.AccountTypeEnum;
import com.theerut.springj11.constant.ServiceNameConstant;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class AccountTrxHistoryRequestFactory extends RequestFactory {
    private final HeaderRequest soapHeader;

    public EXAMDepAcctTrnInqSvc getRequest(String requestId, String accountId, AccountTypeEnum accountType, LocalDateTime startDatetime, LocalDateTime endDatetime) {
        final EXAMDepAcctTrnInqRqType request = new EXAMDepAcctTrnInqRqType();
        request.setEXAMRqUID(requestId);
        request.setEXAMNonFinSvcHeaderInfo(createNonFinSvcHeaderInfo());
        final DepAcctIdType accountIdType = new DepAcctIdType();
        accountIdType.setAcctId(accountId);
        accountIdType.setAcctType(accountType.getCode());
        final SelRangeDt rangeDate = new SelRangeDt();
        rangeDate.setStartDt(startDatetime);
        rangeDate.setEndDt(endDatetime);
        request.setDepAcctId(accountIdType);
        request.setSelRangeDt(rangeDate);
        final EXAMDepAcctTrnInqSvc soapService = new EXAMDepAcctTrnInqSvc();
        soapService.setExamSignonRq(soapHeader.getExamSignonRequest(ServiceNameConstant.ACCOUNT_TRX_HISTORY));
        soapService.setEXAMDepAcctTrnInqRq(request);
        return soapService;
    }
}
