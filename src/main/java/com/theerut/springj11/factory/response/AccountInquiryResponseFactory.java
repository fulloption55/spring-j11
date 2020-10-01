package com.theerut.springj11.factory.response;

import com.theerut.springj11.client.webservice.accountinquiry.EXAMAcctInqRsType;
import com.theerut.springj11.client.webservice.accountsummary.BankAcctStatusType;
import com.theerut.springj11.client.webservice.accountsummary.EXAMAcctInfoType;
import com.theerut.springj11.client.webservice.accountsummary.EXAMAcctNameType;
import com.theerut.springj11.client.webservice.accountsummary.ExtAcctBalType;
import com.theerut.springj11.client.webservice.accountsummary.IntRateInfoType;
import com.theerut.springj11.client.webservice.accountsummary.PersonNameType;
import com.theerut.springj11.client.webservice.common.AcctBalType;
import com.theerut.springj11.client.webservice.common.BankInfoType;
import com.theerut.springj11.client.webservice.common.EXAMExtensionInfoType;
import com.theerut.springj11.constant.AccountInquiryConstant;
import com.theerut.springj11.controller.response.AccountInquiryResponse;
import com.theerut.springj11.service.model.AccountDetail;
import com.theerut.springj11.utils.BooleanMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class AccountInquiryResponseFactory {

    private static final String EXTENSION_BALANCE_TYPE_ACCOUNT_CREDIT_LIMIT = "AcctCreditLimit";
    private static final String EXTENSION_BALANCE_TYPE_ACCOUNT_INTEREST = "AcctInt";
    private static final String EXTENSION_BALANCE_TYPE_OVERDRAFT_CREDIT_LIMIT = "ODLimit";
    private static final String EXTENSION_FULL_DESC = "EXAM_FullDesc";
    private static final String AVAILABLE_BALANCE = "Available";
    private static final String CURRENT_BALANCE = "Current";
    private static final String EXTENSION_ALLOW_CREDIT = "EXAM_AllowCredit";
    private static final String EXTENSION_ALLOW_DEBIT = "EXAM_AllowDebit";

    public AccountInquiryResponse getAccountInquiryResponse(EXAMAcctInqRsType record) {

        if (record != null && record.getExamAcctInfo() != null && !record.getExamAcctInfo().isEmpty()) {

            EXAMAcctInfoType examAcctInfoType = record.getExamAcctInfo().get(0);

            if (examAcctInfoType != null) {
                AccountInquiryResponse accountInquiryResponse = new AccountInquiryResponse();

                EXAMAcctNameType examAcctNameType = examAcctInfoType.getEXAMAcctName();

                if (examAcctNameType != null) {
                    accountInquiryResponse.setPriacctname(examAcctNameType.getEXAMPriAcctName());
                    accountInquiryResponse.setSecacctname(examAcctNameType.getEXAMSecAcctName());
                }

                PersonNameType personNameType = examAcctInfoType.getPersonName();
                if (personNameType != null) {
                    accountInquiryResponse.setPersonfirstname(personNameType.getFirstName());

                    if (personNameType.getLastName() != null && !personNameType.getLastName().isEmpty()) {
                        accountInquiryResponse.setPersonlastname(personNameType.getLastName().get(0));
                    }

                    accountInquiryResponse.setPersonnickname(personNameType.getNickname());
                }
                accountInquiryResponse.setAccounttype(examAcctInfoType.getAcctType());
                accountInquiryResponse.setAccountnumber(examAcctInfoType.getAcctId());
                accountInquiryResponse.setCurrency(examAcctInfoType.getCurCode());
                accountInquiryResponse.setProductid(examAcctInfoType.getProductId());

                BankAcctStatusType bankAcctStatusType = examAcctInfoType.getBankAcctStatus();
                if (bankAcctStatusType != null) {
                    accountInquiryResponse.setAccountstatus(bankAcctStatusType.getBankAcctStatusCode());
                }

                BankInfoType bankInfo = examAcctInfoType.getBankInfo();
                if (bankInfo != null) {
                    accountInquiryResponse.setBranchid(bankInfo.getBranchId());
                }

                accountInquiryResponse.setAccountmode(examAcctInfoType.getEXAMAcctMode());

                IntRateInfoType intRateInfoType = examAcctInfoType.getIntRateInfo();
                if (intRateInfoType != null) {
                    accountInquiryResponse.setInterestrate(intRateInfoType.getRate());
                }
                accountInquiryResponse.setInterestloading(examAcctInfoType.getEXAMIntLoading());
                accountInquiryResponse.setProductinterestrateno(examAcctInfoType.getEXAMProdInterestRateNo());
                accountInquiryResponse.setProductinterestrate(examAcctInfoType.getEXAMProdInterestRate());
                accountInquiryResponse.setDesc(examAcctInfoType.getDesc());
                accountInquiryResponse.setResstatus(examAcctInfoType.getEXAMResStatus());

                examAcctInfoType.getEXAMExtnInfo().forEach(extInfo -> {
                    if (extInfo.getFieldName().equalsIgnoreCase(AccountInquiryConstant.EXT_INFO_FULL_DESC)) {
                        accountInquiryResponse.setFulldesc(extInfo.getValue());
                    }
                });

                examAcctInfoType.getAcctBal().forEach(acctBalType -> {
                    if (acctBalType.getBalType().equalsIgnoreCase(AVAILABLE_BALANCE)) {
                        accountInquiryResponse.setAvailablebalance(acctBalType.getCurAmt().getAmt());
                    } else if (acctBalType.getBalType().equalsIgnoreCase(CURRENT_BALANCE)) {
                        accountInquiryResponse.setCurrentbalance(acctBalType.getCurAmt().getAmt());
                    }
                });

                examAcctInfoType.getExtAcctBal().forEach(extAcctBalType -> {
                    if (extAcctBalType.getExtBalType().equalsIgnoreCase(AccountInquiryConstant.EXT_ACCT_BALANCE_TYPE_ACCTCRLIMIT)) {
                        accountInquiryResponse.setAccountcreditlimit(extAcctBalType.getCurAmt().getAmt());
                    } else if (extAcctBalType.getExtBalType().equalsIgnoreCase(AccountInquiryConstant.EXT_ACCT_BALANCE_TYPE_ODLIMIT)) {
                        accountInquiryResponse.setOdlimit(extAcctBalType.getCurAmt().getAmt());
                    } else if (extAcctBalType.getExtBalType().equalsIgnoreCase(AccountInquiryConstant.EXT_ACCT_BALANCE_TYPE_ACCTINT)) {
                        accountInquiryResponse.setAccountinterest(extAcctBalType.getCurAmt().getAmt());
                    }
                });

                return accountInquiryResponse;

            } else {
                return new AccountInquiryResponse();
            }
        } else {
            return new AccountInquiryResponse();
        }
    }

    public AccountDetail mapDetail(EXAMAcctInfoType examAcctInfoType) {
        final AccountDetail accountDetail = new AccountDetail();
        accountDetail.setId(examAcctInfoType.getAcctId());
        accountDetail.setType(examAcctInfoType.getAcctType());
        accountDetail.setDescription(examAcctInfoType.getDesc());
        accountDetail.setCurrency(examAcctInfoType.getCurCode());
        accountDetail.setProductId(examAcctInfoType.getProductId());
        accountDetail.setBranchId(examAcctInfoType.getBankInfo().getBranchId());
        accountDetail.setStatusCode(examAcctInfoType.getBankAcctStatus().getBankAcctStatusCode());
        accountDetail.setResStatus(examAcctInfoType.getEXAMResStatus());
        accountDetail.setProductInterestId(examAcctInfoType.getEXAMProdInterestRateNo());
        accountDetail.setProductInterestRate(examAcctInfoType.getEXAMProdInterestRate());
        accountDetail.setInterestRate(examAcctInfoType.getIntRateInfo().getRate().toPlainString());
        accountDetail.setInterestLoading(examAcctInfoType.getEXAMIntLoading());
        accountDetail.setMode(examAcctInfoType.getEXAMAcctMode());

        final EXAMAcctNameType examAcctNameType = examAcctInfoType.getEXAMAcctName();
        accountDetail.setPrimaryName(examAcctNameType.getEXAMPriAcctName());
        accountDetail.setSecondaryName(examAcctNameType.getEXAMSecAcctName());

        final PersonNameType personNameType = examAcctInfoType.getPersonName();
        accountDetail.setFirstName(personNameType.getFirstName());
        accountDetail.setMiddleName(personNameType.getMiddleName().stream().findFirst().orElse(null));
        accountDetail.setLastName(personNameType.getLastName().stream().findFirst().orElse(null));
        accountDetail.setNickName(personNameType.getNickname());
        this.setBalance(accountDetail, examAcctInfoType.getAcctBal());
        this.setExtensionInfo(accountDetail, examAcctInfoType.getEXAMDepAcctInfo().getEXAMExtnInfo());
        this.setExtensionBalance(accountDetail, examAcctInfoType.getExtAcctBal());

        return accountDetail;
    }

    private void setBalance(AccountDetail account, List<AcctBalType> accountBalanceTypeList) {
        for (AcctBalType accountBalanceType : accountBalanceTypeList) {
            if (AVAILABLE_BALANCE.equalsIgnoreCase(accountBalanceType.getBalType())) {
                account.setAvailableBalance(accountBalanceType.getCurAmt().getAmt().toPlainString());
            } else if (CURRENT_BALANCE.equalsIgnoreCase(accountBalanceType.getBalType())) {
                account.setCurrentBalance(accountBalanceType.getCurAmt().getAmt().toPlainString());
            }
        }
    }

    private void setExtensionInfo(AccountDetail account, List<EXAMExtensionInfoType> extensionInfoTypeList) {
        for (EXAMExtensionInfoType extensionInfoType : extensionInfoTypeList) {
            if (EXTENSION_FULL_DESC.equalsIgnoreCase(extensionInfoType.getFieldName())) {
                account.setProductDescription(extensionInfoType.getValue());
            } else if (EXTENSION_ALLOW_CREDIT.equalsIgnoreCase(extensionInfoType.getFieldName())) {
                account.setAllowCredit(BooleanMapper.convert(extensionInfoType.getValue()));
            }
        }
    }

    private void setExtensionBalance(AccountDetail account, List<ExtAcctBalType> extensionBalanceList) {
        for (ExtAcctBalType extensionBalanceType : extensionBalanceList) {
            if (EXTENSION_BALANCE_TYPE_ACCOUNT_CREDIT_LIMIT.equalsIgnoreCase(extensionBalanceType.getExtBalType())) {
                account.setAccountCreditLimit(extensionBalanceType.getCurAmt().getAmt().toPlainString());
            } else if (EXTENSION_BALANCE_TYPE_ACCOUNT_INTEREST.equalsIgnoreCase(extensionBalanceType.getExtBalType())) {
                account.setAccountInterest(extensionBalanceType.getCurAmt().getAmt().toPlainString());
            } else if (EXTENSION_BALANCE_TYPE_OVERDRAFT_CREDIT_LIMIT.equalsIgnoreCase(extensionBalanceType.getExtBalType())) {
                account.setOverdraftCreditLimit(extensionBalanceType.getCurAmt().getAmt().toPlainString());
            }
        }
    }

}
