package com.theerut.springj11.factory.response;

import com.theerut.springj11.client.webservice.accounttrxhistory.BankAcctTrnRecType;
import com.theerut.springj11.client.webservice.accounttrxhistory.EXAMDepAcctTrnRecType;
import com.theerut.springj11.client.webservice.common.RefInfoType;
import com.theerut.springj11.service.model.AccountTransaction;
import com.theerut.springj11.utils.LocalDateTimeZoneAdapter;
import org.springframework.stereotype.Component;

@Component
public class AccountTrxHistoryResponseFactory {

    public AccountTransaction mapTransaction(final EXAMDepAcctTrnRecType record) {
        final BankAcctTrnRecType bankAcctTrnRec = record.getBankAcctTrnRec();
        final RefInfoType refInfoType = bankAcctTrnRec.getRefInfo().stream().findFirst().orElseGet(RefInfoType::new);
        return AccountTransaction.builder()
                .source(bankAcctTrnRec.getTrnSrc())
                .type(bankAcctTrnRec.getTrnType())
                .referenceId(refInfoType.getRefId())
                .referenceType(refInfoType.getRefType())
                .postedDate(bankAcctTrnRec.getPostedDt())
                .effectiveDatetime(new LocalDateTimeZoneAdapter().unmarshal(bankAcctTrnRec.getEffDt()))
                .memo(bankAcctTrnRec.getMemo().get(0))
                .amount(bankAcctTrnRec.getCurAmt().getAmt())
                .currency(bankAcctTrnRec.getCurAmt().getCurCode())
                .statementBalance(record.getStmtRunningBal().getAmt())
                .statementCurrency(record.getStmtRunningBal().getCurCode())
                .build();
    }

}
