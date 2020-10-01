package com.theerut.springj11.factory.request;

import com.theerut.springj11.client.webservice.HeaderRequest;
import com.theerut.springj11.client.webservice.accountopen.EXAMAcctOpnRqType;
import com.theerut.springj11.client.webservice.accountopen.EXAMAcctOpnSvc;
import com.theerut.springj11.client.webservice.accountsummary.EXAMAcctNameType;
import com.theerut.springj11.client.webservice.common.EXAMContactDetailsType;
import com.theerut.springj11.client.webservice.common.EXAMFinSvcHeaderInfoType;
import com.theerut.springj11.client.webservice.common.CurAmtType;
import com.theerut.springj11.client.webservice.common.DepAcctIdType;
import com.theerut.springj11.config.ExamConfiguration;
import com.theerut.springj11.constant.CurrencyEnum;
import com.theerut.springj11.service.model.AccountOpeningInformation;
import com.theerut.springj11.utils.RandomRqIdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static com.theerut.springj11.constant.ServiceNameConstant.ACCOUNT_OPEN;

@Component
public class AccountOpenRequestFactory {
    private static final String SIGNING_CONDITION_SINGLY = "Singly";
    private static final String ATM_CARDTAG_TO = "Existing";
    private static final int FIELD_NICKNAME_TYPE_SIZE = 20;

    @Autowired
    private HeaderRequest soapHeader;
    @Autowired
    private ExamConfiguration examConfiguration;

    public EXAMAcctOpnSvc getRequest(String requestId, AccountOpeningInformation accountOpeningInformation) {
        final EXAMAcctOpnRqType accountOpenRequestType = this.createOpeningRequestType(requestId, accountOpeningInformation);
        final EXAMAcctOpnSvc accountOpenService = new EXAMAcctOpnSvc();
        accountOpenService.setExamSignonRq(soapHeader.getExamSignonRequest(ACCOUNT_OPEN));
        accountOpenService.setExamAcctOpnRq(accountOpenRequestType);
        return accountOpenService;
    }

    private EXAMAcctOpnRqType createOpeningRequestType(String requestId, AccountOpeningInformation accountOpeningInformation) {
        final String cifId = accountOpeningInformation.getUserId();
        final String productId = accountOpeningInformation.getProductId();
        final String accountName = accountOpeningInformation.getCustomerNameTh();
        final String nickName = this.subNickname(accountOpeningInformation.getCustomerNameEn());
        final String addressSequenceId = String.valueOf(accountOpeningInformation.getMailingAddress().getSequenceNum());
        final String accountType = accountOpeningInformation.getAccountType().getCode();

        final EXAMAcctOpnRqType accountOpenRequestType = new EXAMAcctOpnRqType();
        accountOpenRequestType.setExamRqUID(requestId);
        accountOpenRequestType.setExamFinSvcHeaderInfo(this.createFinSvcHeaderInfo());
        accountOpenRequestType.setAcctType(accountType);
        accountOpenRequestType.setExamProdCode(productId);
        accountOpenRequestType.setExamDebitAcctId(this.createDepositAccountType(accountType));
        accountOpenRequestType.setExamTransferAmt(this.createCurrencyAmountType());
        accountOpenRequestType.setExamDepositAmt(this.createCurrencyAmountType());
        accountOpenRequestType.setExamatmCardTagTo(ATM_CARDTAG_TO);
        accountOpenRequestType.setExamAcctName(this.createAccountNameType(accountName));
        accountOpenRequestType.setNickname(nickName);
        accountOpenRequestType.setCustPermId(cifId);
        accountOpenRequestType.setExamSigningCond(SIGNING_CONDITION_SINGLY);
        accountOpenRequestType.setExamServicingRM(examConfiguration.getAccountServicingRm());
        accountOpenRequestType.setOpenDt(LocalDate.now());
        accountOpenRequestType.setExamAddrInd(addressSequenceId);
        accountOpenRequestType.setExamContactDetails(this.createContactDetailsTypeList(
                accountOpeningInformation.getMobile(),
                accountOpeningInformation.getMobileType(),
                accountOpeningInformation.getEmail(),
                accountOpeningInformation.getEmailType()));

        return accountOpenRequestType;

    }

    private List<EXAMContactDetailsType> createContactDetailsTypeList(String mobile, String mobileType, String email, String emailType) {
        final List<EXAMContactDetailsType> contactDetailList = new ArrayList<>();

        EXAMContactDetailsType contactDetailsTypeMobile = new EXAMContactDetailsType();
        contactDetailsTypeMobile.setContactType(mobileType);
        contactDetailsTypeMobile.setPhone(mobile.replace("+66", "0"));
        EXAMContactDetailsType contactDetailsTypeEmail = new EXAMContactDetailsType();
        contactDetailsTypeEmail.setContactType(emailType);
        contactDetailsTypeEmail.setEmailAddr(email);

        contactDetailList.add(contactDetailsTypeMobile);
        contactDetailList.add(contactDetailsTypeEmail);
        return contactDetailList;
    }

    private DepAcctIdType createDepositAccountType(String accountType) {
        final DepAcctIdType depositAccountType = new DepAcctIdType();
        depositAccountType.setAcctId("0");
        depositAccountType.setAcctType(accountType);
        return depositAccountType;
    }

    private CurAmtType createCurrencyAmountType() {
        CurAmtType curAmtType = new CurAmtType();
        curAmtType.setAmt(BigDecimal.ZERO);
        curAmtType.setCurCode(CurrencyEnum.THB.getCode());
        return curAmtType;
    }

    private EXAMAcctNameType createAccountNameType(String accountName) {
        EXAMAcctNameType acctNameType = new EXAMAcctNameType();
        acctNameType.setEXAMPriAcctName(accountName);
        return acctNameType;
    }

    private EXAMFinSvcHeaderInfoType createFinSvcHeaderInfo() {
        final EXAMFinSvcHeaderInfoType finSvcHeaderInfoType = new EXAMFinSvcHeaderInfoType();
        final Integer journalSeqNum = RandomRqIdGenerator.generateJournalSeqNum();
        finSvcHeaderInfoType.setEXAMDocNum(examConfiguration.getAccountOpeningDocNum());
        finSvcHeaderInfoType.setEXAMGLRefNum(RandomRqIdGenerator.generateGLRefNo(journalSeqNum.toString()));
        finSvcHeaderInfoType.setEXAMJournalSeqNum(journalSeqNum);
        finSvcHeaderInfoType.setEXAMTellerId(examConfiguration.getAccountOpeningTellerId());
        finSvcHeaderInfoType.setEXAMTellerBranch(examConfiguration.getBankBranchId());
        finSvcHeaderInfoType.setEXAMServicingBranch(Long.valueOf(examConfiguration.getBankId()));
        return finSvcHeaderInfoType;
    }

    public String subNickname(String englishName) {
        return englishName.length() < FIELD_NICKNAME_TYPE_SIZE ? englishName : englishName.substring(0, FIELD_NICKNAME_TYPE_SIZE);
    }
}
