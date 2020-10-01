package com.theerut.springj11.factory.response;

import com.theerut.springj11.client.webservice.accountsummary.EXAMAcctInfoType;
import com.theerut.springj11.client.webservice.common.AcctBalType;
import com.theerut.springj11.client.webservice.common.EXAMExtensionInfoType;
import com.theerut.springj11.service.model.Account;
import com.theerut.springj11.service.model.Placement;
import com.theerut.springj11.utils.AccountUtil;
import com.theerut.springj11.utils.BooleanMapper;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.theerut.springj11.constant.AccountBalanceTypeConstant.ORIGINAL_BALANCE;

@Component
public class AccountSummaryResponseFactory {
    private static final String AVAILABLE_BALANCE = "Available";
    private static final String CURRENT_BALANCE = "Current";
    private static final String EXTENSION_FULL_DESC = "EXAM_FullDesc";
    private static final String EXTENSION_ALLOW_CREDIT = "EXAM_AllowCredit";
    private static final String EXTENSION_ALLOW_DEBIT = "EXAM_AllowDebit";
    private static final String EXTENSION_JOIN_INDICATOR = "EXAM_JoinAccountIndicator";

    public Account mapAccount(EXAMAcctInfoType acctInfoType) {
        final Account account = new Account();
        final String primaryName = acctInfoType.getEXAMAcctName().getEXAMPriAcctName();
        final String secondaryName = acctInfoType.getEXAMAcctName().getEXAMSecAcctName();
        final String accountName = primaryName + secondaryName;
        account.setName(accountName);
        account.setId(AccountUtil.format(acctInfoType.getAcctId()));
        account.setType(acctInfoType.getAcctType());
        account.setResStatus(acctInfoType.getEXAMResStatus());
        account.setMode(acctInfoType.getEXAMAcctMode());
        account.setSigningCond(acctInfoType.getEXAMSigningCond());
        account.setPidmFlag(BooleanMapper.convert(acctInfoType.getEXAMPidmFlag()));
        account.setProductId(acctInfoType.getProductId());
        account.setCurrency(acctInfoType.getCurCode());
        account.setStatusCode(acctInfoType.getBankAcctStatus().getBankAcctStatusCode());
        account.setBranchId(acctInfoType.getBankInfo().getBranchId());
        this.setBalance(account, acctInfoType.getAcctBal());
        this.setExtensionInfo(account, acctInfoType.getEXAMExtnInfo());
        return account;
    }

    private void setExtensionInfo(Account account, List<EXAMExtensionInfoType> extensionInfoTypeList) {
        for (EXAMExtensionInfoType extensionInfoType : extensionInfoTypeList) {
            if (EXTENSION_FULL_DESC.equalsIgnoreCase(extensionInfoType.getFieldName())) {
                account.setProductDescription(extensionInfoType.getValue());
            } else if (EXTENSION_JOIN_INDICATOR.equalsIgnoreCase(extensionInfoType.getFieldName())) {
                account.setJointIndicator(BooleanMapper.convert(extensionInfoType.getValue()));
            } else if (EXTENSION_ALLOW_CREDIT.equalsIgnoreCase(extensionInfoType.getFieldName())) {
                account.setAllowCredit(BooleanMapper.convert(extensionInfoType.getValue()));
            } else if (EXTENSION_ALLOW_DEBIT.equalsIgnoreCase(extensionInfoType.getFieldName())) {
                account.setAllowDebit(BooleanMapper.convert(extensionInfoType.getValue()));
            }
        }
    }

    private void setBalance(Account account, List<AcctBalType> accountBalanceTypeList) {
        for (AcctBalType accountBalanceType : accountBalanceTypeList) {
            if (AVAILABLE_BALANCE.equalsIgnoreCase(accountBalanceType.getBalType())) {
                account.setAvailableBalance(accountBalanceType.getCurAmt().getAmt().toPlainString());
            } else if (CURRENT_BALANCE.equalsIgnoreCase(accountBalanceType.getBalType())) {
                account.setCurrentBalance(accountBalanceType.getCurAmt().getAmt().toPlainString());
            }
        }
    }

    public Placement mapPlacement(EXAMAcctInfoType acctInfoType) {
        final Placement placement = new Placement();
        placement.setId(acctInfoType.getEXAMDepAcctInfo().getEXAMCertNum());
        placement.setAccountId(acctInfoType.getAcctId());
        placement.setProductType(acctInfoType.getEXAMProdType());
        placement.setCurrency(acctInfoType.getCurCode());
        placement.setStatusCode(acctInfoType.getBankAcctStatus().getBankAcctStatusCode());
        placement.setInterestRate(acctInfoType.getEXAMDepAcctInfo().getRate());
        placement.setMaturityDate(acctInfoType.getEXAMDepAcctInfo().getDepMatureDt());
        placement.setTermCount((int) acctInfoType.getEXAMDepAcctInfo().getTerm().getCount());
        placement.setTermUnit(acctInfoType.getEXAMDepAcctInfo().getTerm().getTermUnits());
        this.setBalance(placement, acctInfoType.getAcctBal());
        return placement;
    }

    private void setBalance(Placement placement, List<AcctBalType> accountBalanceTypeList) {
        for (AcctBalType accountBalanceType : accountBalanceTypeList) {
            if (ORIGINAL_BALANCE.equalsIgnoreCase(accountBalanceType.getBalType())) {
                placement.setAvailableBalance(accountBalanceType.getCurAmt().getAmt().toPlainString());
            } else if (CURRENT_BALANCE.equalsIgnoreCase(accountBalanceType.getBalType())) {
                placement.setCurrentBalance(accountBalanceType.getCurAmt().getAmt().toPlainString());
            }
        }
    }
}
