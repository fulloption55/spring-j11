package com.theerut.springj11.factory.response;

import com.theerut.springj11.client.webservice.accountsummary.EXAMAcctInfoType;
import com.theerut.springj11.client.webservice.common.AcctBalType;
import com.theerut.springj11.service.model.FixedAccount;
import com.theerut.springj11.utils.AccountUtil;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.theerut.springj11.constant.AccountBalanceTypeConstant.CURRENT_BALANCE;
import static com.theerut.springj11.constant.AccountBalanceTypeConstant.ORIGINAL_BALANCE;

@Component
public class FixedAccountSummaryResponseFactory {

    public FixedAccount mapFixedAccount(EXAMAcctInfoType acctInfoType) {
        final FixedAccount account = new FixedAccount();
        final String primaryName = acctInfoType.getEXAMAcctName().getEXAMPriAcctName();
        account.setName(primaryName);
        account.setId(AccountUtil.format(acctInfoType.getAcctId()));
        account.setType(acctInfoType.getAcctType());
        account.setCurrency(acctInfoType.getCurCode());
        account.setStatusCode(acctInfoType.getBankAcctStatus().getBankAcctStatusCode());
        account.setBranchId(acctInfoType.getBankInfo().getBranchId());
        this.setBalance(account, acctInfoType.getAcctBal());
        return account;
    }

    private void setBalance(FixedAccount account, List<AcctBalType> accountBalanceTypeList) {
        for (AcctBalType accountBalanceType : accountBalanceTypeList) {
            if (ORIGINAL_BALANCE.equalsIgnoreCase(accountBalanceType.getBalType())) {
                account.setAvailableBalance(accountBalanceType.getCurAmt().getAmt().toPlainString());
            } else if (CURRENT_BALANCE.equalsIgnoreCase(accountBalanceType.getBalType())) {
                account.setCurrentBalance(accountBalanceType.getCurAmt().getAmt().toPlainString());
            }
        }
    }
}
