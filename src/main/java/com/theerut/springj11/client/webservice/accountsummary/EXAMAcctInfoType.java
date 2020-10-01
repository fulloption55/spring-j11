package com.theerut.springj11.client.webservice.accountsummary;

import com.theerut.springj11.client.webservice.accounttrxhistory.AcctTaxInfoType;
import com.theerut.springj11.client.webservice.common.AcctBalType;
import com.theerut.springj11.client.webservice.common.BankInfoType;
import com.theerut.springj11.client.webservice.common.EXAMExtensionInfoType;
import com.theerut.springj11.client.webservice.common.EXAMGovIssueIdentType;
import com.theerut.springj11.client.webservice.common.CurAmtType;
import com.theerut.springj11.client.webservice.common.LoanAcctIdType;
import com.theerut.springj11.client.webservice.common.PostAddrType2;
import com.theerut.springj11.utils.LocalDateAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_AcctInfo_Type", propOrder = {
        "acctType",
        "acctId",
        "examAcctName",
        "bankAcctStatus",
        "examResStatus",
        "examStaffInd",
        "examProdType",
        "bankInfo",
        "openDt",
        "closeDt",
        "examAcctMode",
        "examSigningCond",
        "examPidmFlag",
        "acctBal",
        "extAcctBal",
        "acctTaxInfo",
        "cardType",
        "examCycle",
        "examnplTagging",
        "examAcctDelinquency",
        "examCardCustInfo",
        "examUserCode",
        "examAffAcctInfo",
        "examLoanAcctInfo",
        "examDepAcctInfo",
        "examCardAcctInfo",
        "examBancaAcctInfo",
        "examExtnInfo",
        "examProductIdent",
        "examRewardData",
        "examAcctUse",
        "examvipIndicator",
        "language",
        "memo",
        "examMailingCode",
        "examIndicator",
        "effDt",
        "custInfo",
        "examConsolAcctId",
        "examConsolAcctType",
        "custPermId",
        "examAppNum",
        "examGovIssueId",
        "loanAcctId",
        "examStmtAddr",
        "examCustCategory",
        "examUnClaimedAcct",
        "examWriteOffAcct",
        "examsbuCode",
        "examCostCenter",
        "examCustSegmentCode",
        "examConstitutionCode",
        "examgstReliefInd",
        "examJobDesignation",
        "examEntDate",
        "examSeqNum",
        "examPrimAcctInd",
        "examnplStatus",
        "examBlockCode",
        "examReclassCode",
        "examMaturityDt",
        "examPrincipalAmt",
        "examMeasurementUnit",
        "examcdsAcctNum",
        "examAcctClass",
        "examProductGroupCode",
        "examProductGroupDesc",
        "examTandemKey",
        "examCloseAcctFlag",
        "examSensitiveFlag",
        "custType",
        "examPrimaryId",
        "exampssiaUnits",
        "examProductDesc",
        "examCashliteIndicator",
        "examIslamicIndicator",
        "examLastRollOverDate",
        "examStockMarketInfo",
        "examOldCustPermId",
        "examfdrNumber",
        "examTerm",
        "examTermCode",
        "examAccountOrg",
        "examCentralBankCode5",
        "examIsResident",
        "examCentralBankCode2",
        "examExtAcctInd",
        "examOpeningDt",
        "examHoldAmt",
        "examLedgerBalance",
        "examLedgerBonusBalance",
        "examLedgerBalanceWithBonusUnit",
        "examLedgerBalanceWithBonusAmt",
        "examAccruedBonusUnit",
        "examAcctClosingInfo",
        "examLastMaintDt",
        "examContactInfo",
        "examAdditionalName",
        "examProductType",
        "examibgCounter",
        "examCustSubType",
        "examEntity",
        "examPurposeCode",
        "examWorkstationId",
        "examTradeAcctRefNo",
        "examAcctRefNo",
        "examEntityNum",
        "examRelationshipCode",
        "examBundleCode",
        "examRelationshipEndDate",
        "examTierCharges",
        "examProgramCode",
        "examSystemCode",
        "examAddrCustPermId",
        "examAcctTypeCode",
        "examHolder",
        "examMaskedBalInd",
        "examOption",
        "examInstInfo",
        "examBatchDate",
        "examLocalDesc",
        "examPassbook",
        "examPrintStmt",
        "examTitleShortDesc",
        "examTitleLongDesc",
        "examTitleLocalDesc",
        "examLastCalcDt",
        "examOccurrenceDt",
        "examNumberBook",
        "examNextLineNo",
        "examProdInterestRateNo",
        "examProdInterestRate",
        "examIntLoading",
        "examIntLoadingCode",
        "examSpecialInfo",
        "examHoldCode",
        "examLostContract",
        "examMessageLine",
        "examDepositTerm",
        "lastTrnDt",
        "examLastTrnTm",
        "rate",
        "examPlacementNum",
        "examNoOfPlacements",
        "examNoOfDelinquencies",
        "examPenaltyNum",
        "examTenor",
        "examEscrowAcctFlag",
        "examPledgeCode",
        "examPledgedStatus",
        "examCustInfo",
        "examTellerInqStat",
        "examSavingType",
        "examcifStatus",
        "examRemarks",
        "examOfficerCode",
        "examLastMaintUID",
        "examLastMaintTm",
        "examFlag",
        "examProdDesc",
        "examConvIslamic",
        "examDepositNum",
        "examBalanceAmount",
        "examOnusFlag",
        "examChannelCode",
        "examMaintInfo",
        "examCreationInfo",
        "shortDesc",
        "examcifId",
        "examBankName",
        "examTotalNumber",
        "examHoldAlert",
        "examEarmarkAlert",
        "examStopPaymentAlert",
        "examcifAlert",
        "examRefundStatus"
})
public class EXAMAcctInfoType extends BankAcctInfoType {

    @XmlElement(name = "AcctType")
    protected String acctType;
    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "EXAM_AcctName")
    protected EXAMAcctNameType examAcctName;
    @XmlElement(name = "BankAcctStatus")
    protected BankAcctStatusType bankAcctStatus;
    @XmlElement(name = "EXAM_ResStatus")
    protected String examResStatus;
    @XmlElement(name = "EXAM_StaffInd")
    protected String examStaffInd;
    @XmlElement(name = "EXAM_ProdType")
    protected String examProdType;
    @XmlElement(name = "BankInfo")
    protected BankInfoType bankInfo;
    @XmlElement(name = "OpenDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate openDt;
    @XmlElement(name = "CloseDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate closeDt;
    @XmlElement(name = "EXAM_AcctMode")
    protected String examAcctMode;
    @XmlElement(name = "EXAM_SigningCond")
    protected String examSigningCond;
    @XmlElement(name = "EXAM_PidmFlag")
    protected String examPidmFlag;
    @XmlElement(name = "AcctBal")
    protected List<AcctBalType> acctBal;
    @XmlElement(name = "ExtAcctBal")
    protected List<ExtAcctBalType> extAcctBal;
    @XmlElement(name = "AcctTaxInfo")
    protected AcctTaxInfoType acctTaxInfo;
    @XmlElement(name = "CardType")
    protected String cardType;
    @XmlElement(name = "EXAM_Cycle")
    protected Long examCycle;
    @XmlElement(name = "EXAM_NPLTagging")
    protected String examnplTagging;
    @XmlElement(name = "EXAM_AcctDelinquency")
    protected String examAcctDelinquency;
    @XmlElement(name = "EXAM_CardCustInfo")
    protected EXAMCardCustInfoType examCardCustInfo;
    @XmlElement(name = "EXAM_UserCode")
    protected List<String> examUserCode;
    @XmlElement(name = "EXAM_AffAcctInfo")
    protected EXAMAffAcctInfoType examAffAcctInfo;
    @XmlElement(name = "EXAM_LoanAcctInfo")
    protected EXAMLoanAcctInfoType examLoanAcctInfo;
    @XmlElement(name = "EXAM_DepAcctInfo")
    protected EXAMDepAcctInfoType examDepAcctInfo;
    @XmlElement(name = "EXAM_CardAcctInfo")
    protected EXAMCardAcctInfoType examCardAcctInfo;
    @XmlElement(name = "EXAM_BancaAcctInfo")
    protected EXAMBancaAcctInfoType examBancaAcctInfo;
    @XmlElement(name = "EXAM_ExtnInfo")
    protected List<EXAMExtensionInfoType> examExtnInfo;
    @XmlElement(name = "EXAM_ProductIdent")
    protected String examProductIdent;
    @XmlElement(name = "EXAM_RewardData")
    protected List<RewardDataType> examRewardData;
    @XmlElement(name = "EXAM_AcctUse")
    protected String examAcctUse;
    @XmlElement(name = "EXAM_VIPIndicator")
    protected String examvipIndicator;
    @XmlElement(name = "Language")
    protected String language;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "EXAM_MailingCode")
    protected String examMailingCode;
    @XmlElement(name = "EXAM_Indicator")
    protected String examIndicator;
    @XmlElement(name = "EffDt")
    protected String effDt;
    @XmlElement(name = "CustInfo")
    protected List<CustInfoType> custInfo;
    @XmlElement(name = "EXAM_ConsolAcctId")
    protected String examConsolAcctId;
    @XmlElement(name = "EXAM_ConsolAcctType")
    protected String examConsolAcctType;
    @XmlElement(name = "CustPermId")
    protected String custPermId;
    @XmlElement(name = "EXAM_AppNum")
    protected String examAppNum;
    @XmlElement(name = "EXAM_GovIssueId")
    protected EXAMGovIssueIdentType examGovIssueId;
    @XmlElement(name = "LoanAcctId")
    protected com.theerut.springj11.client.webservice.common.LoanAcctIdType loanAcctId;
    @XmlElement(name = "EXAM_StmtAddr")
    protected com.theerut.springj11.client.webservice.common.PostAddrType2 examStmtAddr;
    @XmlElement(name = "EXAM_CustCategory")
    protected String examCustCategory;
    @XmlElement(name = "EXAM_UnClaimedAcct")
    protected String examUnClaimedAcct;
    @XmlElement(name = "EXAM_WriteOffAcct")
    protected String examWriteOffAcct;
    @XmlElement(name = "EXAM_SBUCode")
    protected String examsbuCode;
    @XmlElement(name = "EXAM_CostCenter")
    protected String examCostCenter;
    @XmlElement(name = "EXAM_CustSegmentCode")
    protected String examCustSegmentCode;
    @XmlElement(name = "EXAM_ConstitutionCode")
    protected String examConstitutionCode;
    @XmlElement(name = "EXAM_GSTReliefInd")
    protected String examgstReliefInd;
    @XmlElement(name = "EXAM_JobDesignation")
    protected String examJobDesignation;
    @XmlElement(name = "EXAM_EntDate", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examEntDate;
    @XmlElement(name = "EXAM_SeqNum")
    protected Long examSeqNum;
    @XmlElement(name = "EXAM_PrimAcctInd")
    protected String examPrimAcctInd;
    @XmlElement(name = "EXAM_NPLStatus")
    protected String examnplStatus;
    @XmlElement(name = "EXAM_BlockCode")
    protected String examBlockCode;
    @XmlElement(name = "EXAM_ReclassCode")
    protected String examReclassCode;
    @XmlElement(name = "EXAM_MaturityDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examMaturityDt;
    @XmlElement(name = "EXAM_PrincipalAmt", required = true)
    protected CurAmtType examPrincipalAmt;
    @XmlElement(name = "EXAM_MeasurementUnit", required = true)
    protected String examMeasurementUnit;
    @XmlElement(name = "EXAM_CDSAcctNum", required = true)
    protected String examcdsAcctNum;
    @XmlElement(name = "EXAM_AcctClass")
    protected String examAcctClass;
    @XmlElement(name = "EXAM_ProductGroupCode")
    protected String examProductGroupCode;
    @XmlElement(name = "EXAM_ProductGroupDesc")
    protected String examProductGroupDesc;
    @XmlElement(name = "EXAM_TandemKey")
    protected String examTandemKey;
    @XmlElement(name = "EXAM_CloseAcctFlag")
    protected String examCloseAcctFlag;
    @XmlElement(name = "EXAM_SensitiveFlag")
    protected String examSensitiveFlag;
    @XmlElement(name = "CustType")
    protected String custType;
    @XmlElement(name = "EXAM_PrimaryId")
    protected EXAMCustomerIdentificationType examPrimaryId;
    @XmlElement(name = "EXAM_PSSIAUnits")
    protected EXAMPSSIAUnitsType exampssiaUnits;
    @XmlElement(name = "EXAM_ProductDesc")
    protected String examProductDesc;
    @XmlElement(name = "EXAM_CashliteIndicator")
    protected String examCashliteIndicator;
    @XmlElement(name = "EXAM_IslamicIndicator")
    protected String examIslamicIndicator;
    @XmlElement(name = "EXAM_LastRollOverDate", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examLastRollOverDate;
    @XmlElement(name = "EXAM_StockMarketInfo")
    protected List<EXAMStockMarketInfoType> examStockMarketInfo;
    @XmlElement(name = "EXAM_OldCustPermId")
    protected String examOldCustPermId;
    @XmlElement(name = "EXAM_FDRNumber")
    protected String examfdrNumber;
    @XmlElement(name = "EXAM_Term")
    protected Long examTerm;
    @XmlElement(name = "EXAM_TermCode")
    protected String examTermCode;
    @XmlElement(name = "EXAM_AccountOrg")
    protected String examAccountOrg;
    @XmlElement(name = "EXAM_CentralBankCode5")
    protected String examCentralBankCode5;
    @XmlElement(name = "EXAM_IsResident")
    protected String examIsResident;
    @XmlElement(name = "EXAM_CentralBankCode2")
    protected String examCentralBankCode2;
    @XmlElement(name = "EXAM_ExtAcctInd")
    protected String examExtAcctInd;
    @XmlElement(name = "EXAM_OpeningDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examOpeningDt;
    @XmlElement(name = "EXAM_HoldAmt")
    protected BigDecimal examHoldAmt;
    @XmlElement(name = "EXAM_LedgerBalance")
    protected BigDecimal examLedgerBalance;
    @XmlElement(name = "EXAM_LedgerBonusBalance")
    protected BigDecimal examLedgerBonusBalance;
    @XmlElement(name = "EXAM_LedgerBalanceWithBonusUnit")
    protected String examLedgerBalanceWithBonusUnit;
    @XmlElement(name = "EXAM_LedgerBalanceWithBonusAmt")
    protected BigDecimal examLedgerBalanceWithBonusAmt;
    @XmlElement(name = "EXAM_AccruedBonusUnit")
    protected String examAccruedBonusUnit;
    @XmlElement(name = "EXAM_AcctClosingInfo")
    protected List<EXAMAcctClosingInfoType> examAcctClosingInfo;
    @XmlElement(name = "EXAM_LastMaintDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examLastMaintDt;
    @XmlElement(name = "EXAM_ContactInfo")
    protected EXAMContactInfoType examContactInfo;
    @XmlElement(name = "EXAM_AdditionalName")
    protected String examAdditionalName;
    @XmlElement(name = "EXAM_ProductType")
    protected String examProductType;
    @XmlElement(name = "EXAM_IBGCounter")
    protected String examibgCounter;
    @XmlElement(name = "EXAM_CustSubType")
    protected String examCustSubType;
    @XmlElement(name = "EXAM_Entity")
    protected String examEntity;
    @XmlElement(name = "EXAM_PurposeCode")
    protected String examPurposeCode;
    @XmlElement(name = "EXAM_WorkstationId")
    protected String examWorkstationId;
    @XmlElement(name = "EXAM_TradeAcctRefNo")
    protected String examTradeAcctRefNo;
    @XmlElement(name = "EXAM_AcctRefNo")
    protected String examAcctRefNo;
    @XmlElement(name = "EXAM_EntityNum")
    protected String examEntityNum;
    @XmlElement(name = "EXAM_RelationshipCode")
    protected String examRelationshipCode;
    @XmlElement(name = "EXAM_BundleCode")
    protected String examBundleCode;
    @XmlElement(name = "EXAM_RelationshipEndDate")
    protected String examRelationshipEndDate;
    @XmlElement(name = "EXAM_TierCharges")
    protected BigDecimal examTierCharges;
    @XmlElement(name = "EXAM_ProgramCode")
    protected String examProgramCode;
    @XmlElement(name = "EXAM_SystemCode")
    protected String examSystemCode;
    @XmlElement(name = "EXAM_AddrCustPermId")
    protected String examAddrCustPermId;
    @XmlElement(name = "EXAM_AcctTypeCode")
    protected String examAcctTypeCode;
    @XmlElement(name = "EXAM_Holder")
    protected String examHolder;
    @XmlElement(name = "EXAM_MaskedBalInd")
    protected String examMaskedBalInd;
    @XmlElement(name = "EXAM_Option")
    protected String examOption;
    @XmlElement(name = "EXAM_InstInfo")
    protected EXAMInstInfoType examInstInfo;
    @XmlElement(name = "EXAM_BatchDate", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examBatchDate;
    @XmlElement(name = "EXAM_LocalDesc")
    protected String examLocalDesc;
    @XmlElement(name = "EXAM_Passbook")
    protected String examPassbook;
    @XmlElement(name = "EXAM_PrintStmt")
    protected String examPrintStmt;
    @XmlElement(name = "EXAM_Title_ShortDesc")
    protected String examTitleShortDesc;
    @XmlElement(name = "EXAM_Title_LongDesc")
    protected String examTitleLongDesc;
    @XmlElement(name = "EXAM_Title_LocalDesc")
    protected String examTitleLocalDesc;
    @XmlElement(name = "EXAM_Last_Calc_Dt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examLastCalcDt;
    @XmlElement(name = "EXAM_Occurrence_Dt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examOccurrenceDt;
    @XmlElement(name = "EXAM_Number_Book")
    protected String examNumberBook;
    @XmlElement(name = "EXAM_Next_LineNo")
    protected String examNextLineNo;
    @XmlElement(name = "EXAM_Prod_Interest_RateNo")
    protected String examProdInterestRateNo;
    @XmlElement(name = "EXAM_Prod_Interest_Rate")
    protected String examProdInterestRate;
    @XmlElement(name = "EXAM_Int_Loading")
    protected String examIntLoading;
    @XmlElement(name = "EXAM_Int_Loading_Code")
    protected String examIntLoadingCode;
    @XmlElement(name = "EXAM_Special_Info")
    protected String examSpecialInfo;
    @XmlElement(name = "EXAM_Hold_Code")
    protected String examHoldCode;
    @XmlElement(name = "EXAM_Lost_Contract")
    protected String examLostContract;
    @XmlElement(name = "EXAM_MessageLine")
    protected String examMessageLine;
    @XmlElement(name = "EXAM_DepositTerm")
    protected Long examDepositTerm;
    @XmlElement(name = "LastTrnDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate lastTrnDt;
    @XmlElement(name = "EXAM_LastTrnTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar examLastTrnTm;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "EXAM_PlacementNum")
    protected String examPlacementNum;
    @XmlElement(name = "EXAM_No_Of_Placements")
    protected String examNoOfPlacements;
    @XmlElement(name = "EXAM_No_Of_Delinquencies")
    protected String examNoOfDelinquencies;
    @XmlElement(name = "EXAM_PenaltyNum")
    protected String examPenaltyNum;
    @XmlElement(name = "EXAM_Tenor")
    protected String examTenor;
    @XmlElement(name = "EXAM_EscrowAcctFlag")
    protected String examEscrowAcctFlag;
    @XmlElement(name = "EXAM_PledgeCode")
    protected String examPledgeCode;
    @XmlElement(name = "EXAM_PledgedStatus")
    protected String examPledgedStatus;
    @XmlElement(name = "EXAM_CustInfo")
    protected EXAMCustInfoType examCustInfo;
    @XmlElement(name = "EXAM_TellerInqStat")
    protected String examTellerInqStat;
    @XmlElement(name = "EXAM_SavingType")
    protected String examSavingType;
    @XmlElement(name = "EXAM_UIDStatus")
    protected List<String> examcifStatus;
    @XmlElement(name = "EXAM_Remarks")
    protected List<String> examRemarks;
    @XmlElement(name = "EXAM_OfficerCode")
    protected String examOfficerCode;
    @XmlElement(name = "EXAM_LastMaintUID")
    protected String examLastMaintUID;
    @XmlElement(name = "EXAM_LastMaintTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar examLastMaintTm;
    @XmlElement(name = "EXAM_Flag")
    protected List<EXAMFlagType> examFlag;
    @XmlElement(name = "EXAM_ProdDesc")
    protected String examProdDesc;
    @XmlElement(name = "EXAM_ConvIslamic")
    protected String examConvIslamic;
    @XmlElement(name = "EXAM_DepositNum")
    protected String examDepositNum;
    @XmlElement(name = "EXAM_BalanceAmount")
    protected BigDecimal examBalanceAmount;
    @XmlElement(name = "EXAM_OnusFlag")
    protected String examOnusFlag;
    @XmlElement(name = "EXAM_ChannelCode")
    protected String examChannelCode;
    @XmlElement(name = "EXAM_MaintInfo")
    protected EXAMMaintInfoType examMaintInfo;
    @XmlElement(name = "EXAM_CreationInfo")
    protected EXAMCreationInfoType examCreationInfo;
    @XmlElement(name = "ShortDesc")
    protected String shortDesc;
    @XmlElement(name = "EXAM_UIDId")
    protected String examcifId;
    @XmlElement(name = "EXAM_BankName")
    protected String examBankName;
    @XmlElement(name = "EXAM_TotalNumber")
    protected BigDecimal examTotalNumber;
    @XmlElement(name = "EXAM_HoldAlert")
    protected String examHoldAlert;
    @XmlElement(name = "EXAM_EarmarkAlert")
    protected String examEarmarkAlert;
    @XmlElement(name = "EXAM_StopPaymentAlert")
    protected String examStopPaymentAlert;
    @XmlElement(name = "EXAM_UIDAlert")
    protected String examcifAlert;
    @XmlElement(name = "EXAM_RefundStatus")
    protected String examRefundStatus;

    /**
     * Gets the value of the acctType property.
     *
     * @return possible object is {@link String }
     */
    public String getAcctType() {
        return acctType;
    }

    /**
     * Sets the value of the acctType property.
     *
     * @param value allowed object is {@link String }
     */
    public void setAcctType(String value) {
        this.acctType = value;
    }

    /**
     * Gets the value of the acctId property.
     *
     * @return possible object is {@link String }
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     *
     * @param value allowed object is {@link String }
     */
    public void setAcctId(String value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the examAcctName property.
     *
     * @return possible object is {@link EXAMAcctNameType }
     */
    public EXAMAcctNameType getEXAMAcctName() {
        return examAcctName;
    }

    /**
     * Sets the value of the examAcctName property.
     *
     * @param value allowed object is {@link EXAMAcctNameType }
     */
    public void setEXAMAcctName(EXAMAcctNameType value) {
        this.examAcctName = value;
    }

    /**
     * Gets the value of the bankAcctStatus property.
     *
     * @return possible object is {@link BankAcctStatusType }
     */
    public BankAcctStatusType getBankAcctStatus() {
        return bankAcctStatus;
    }

    /**
     * Sets the value of the bankAcctStatus property.
     *
     * @param value allowed object is {@link BankAcctStatusType }
     */
    public void setBankAcctStatus(BankAcctStatusType value) {
        this.bankAcctStatus = value;
    }

    /**
     * Gets the value of the examResStatus property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMResStatus() {
        return examResStatus;
    }

    /**
     * Sets the value of the examResStatus property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMResStatus(String value) {
        this.examResStatus = value;
    }

    /**
     * Gets the value of the examStaffInd property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMStaffInd() {
        return examStaffInd;
    }

    /**
     * Sets the value of the examStaffInd property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMStaffInd(String value) {
        this.examStaffInd = value;
    }

    /**
     * Gets the value of the examProdType property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMProdType() {
        return examProdType;
    }

    /**
     * Sets the value of the examProdType property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMProdType(String value) {
        this.examProdType = value;
    }

    /**
     * Gets the value of the bankInfo property.
     *
     * @return possible object is {@link BankInfoType }
     */
    public BankInfoType getBankInfo() {
        return bankInfo;
    }

    /**
     * Sets the value of the bankInfo property.
     *
     * @param value allowed object is {@link BankInfoType }
     */
    public void setBankInfo(BankInfoType value) {
        this.bankInfo = value;
    }

    /**
     * Gets the value of the openDt property.
     *
     * @return possible object is {@link String }
     */
    public LocalDate getOpenDt() {
        return openDt;
    }

    /**
     * Sets the value of the openDt property.
     *
     * @param value allowed object is {@link String }
     */
    public void setOpenDt(LocalDate value) {
        this.openDt = value;
    }

    /**
     * Gets the value of the closeDt property.
     *
     * @return possible object is {@link String }
     */
    public LocalDate getCloseDt() {
        return closeDt;
    }

    /**
     * Sets the value of the closeDt property.
     *
     * @param value allowed object is {@link String }
     */
    public void setCloseDt(LocalDate value) {
        this.closeDt = value;
    }

    /**
     * Gets the value of the examAcctMode property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMAcctMode() {
        return examAcctMode;
    }

    /**
     * Sets the value of the examAcctMode property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMAcctMode(String value) {
        this.examAcctMode = value;
    }

    /**
     * Gets the value of the examSigningCond property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMSigningCond() {
        return examSigningCond;
    }

    /**
     * Sets the value of the examSigningCond property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMSigningCond(String value) {
        this.examSigningCond = value;
    }

    /**
     * Gets the value of the examPidmFlag property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMPidmFlag() {
        return examPidmFlag;
    }

    /**
     * Sets the value of the examPidmFlag property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMPidmFlag(String value) {
        this.examPidmFlag = value;
    }

    /**
     * Gets the value of the acctBal property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the acctBal property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctBal().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctBalType }
     */
    public List<AcctBalType> getAcctBal() {
        if (acctBal == null) {
            acctBal = new ArrayList<>();
        }
        return this.acctBal;
    }

    /**
     * Gets the value of the extAcctBal property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the extAcctBal property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtAcctBal().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtAcctBalType }
     */
    public List<ExtAcctBalType> getExtAcctBal() {
        if (extAcctBal == null) {
            extAcctBal = new ArrayList<>();
        }
        return this.extAcctBal;
    }

    /**
     * Gets the value of the acctTaxInfo property.
     *
     * @return possible object is {@link AcctTaxInfoType }
     */
    public AcctTaxInfoType getAcctTaxInfo() {
        return acctTaxInfo;
    }

    /**
     * Sets the value of the acctTaxInfo property.
     *
     * @param value allowed object is {@link AcctTaxInfoType }
     */
    public void setAcctTaxInfo(AcctTaxInfoType value) {
        this.acctTaxInfo = value;
    }

    /**
     * Gets the value of the cardType property.
     *
     * @return possible object is {@link String }
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     *
     * @param value allowed object is {@link String }
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the examCycle property.
     *
     * @return possible object is {@link Long }
     */
    public Long getEXAMCycle() {
        return examCycle;
    }

    /**
     * Sets the value of the examCycle property.
     *
     * @param value allowed object is {@link Long }
     */
    public void setEXAMCycle(Long value) {
        this.examCycle = value;
    }

    /**
     * Gets the value of the examnplTagging property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMNPLTagging() {
        return examnplTagging;
    }

    /**
     * Sets the value of the examnplTagging property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMNPLTagging(String value) {
        this.examnplTagging = value;
    }

    /**
     * Gets the value of the examAcctDelinquency property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMAcctDelinquency() {
        return examAcctDelinquency;
    }

    /**
     * Sets the value of the examAcctDelinquency property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMAcctDelinquency(String value) {
        this.examAcctDelinquency = value;
    }

    /**
     * Gets the value of the examCardCustInfo property.
     *
     * @return possible object is {@link EXAMCardCustInfoType }
     */
    public EXAMCardCustInfoType getEXAMCardCustInfo() {
        return examCardCustInfo;
    }

    /**
     * Sets the value of the examCardCustInfo property.
     *
     * @param value allowed object is {@link EXAMCardCustInfoType }
     */
    public void setEXAMCardCustInfo(EXAMCardCustInfoType value) {
        this.examCardCustInfo = value;
    }

    /**
     * Gets the value of the examUserCode property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the examUserCode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMUserCode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link String }
     */
    public List<String> getEXAMUserCode() {
        if (examUserCode == null) {
            examUserCode = new ArrayList<>();
        }
        return this.examUserCode;
    }

    /**
     * Gets the value of the examAffAcctInfo property.
     *
     * @return possible object is {@link EXAMAffAcctInfoType }
     */
    public EXAMAffAcctInfoType getEXAMAffAcctInfo() {
        return examAffAcctInfo;
    }

    /**
     * Sets the value of the examAffAcctInfo property.
     *
     * @param value allowed object is {@link EXAMAffAcctInfoType }
     */
    public void setEXAMAffAcctInfo(EXAMAffAcctInfoType value) {
        this.examAffAcctInfo = value;
    }

    /**
     * Gets the value of the examLoanAcctInfo property.
     *
     * @return possible object is {@link EXAMLoanAcctInfoType }
     */
    public EXAMLoanAcctInfoType getEXAMLoanAcctInfo() {
        return examLoanAcctInfo;
    }

    /**
     * Sets the value of the examLoanAcctInfo property.
     *
     * @param value allowed object is {@link EXAMLoanAcctInfoType }
     */
    public void setEXAMLoanAcctInfo(EXAMLoanAcctInfoType value) {
        this.examLoanAcctInfo = value;
    }

    /**
     * Gets the value of the examDepAcctInfo property.
     *
     * @return possible object is {@link EXAMDepAcctInfoType }
     */
    public EXAMDepAcctInfoType getEXAMDepAcctInfo() {
        return examDepAcctInfo;
    }

    /**
     * Sets the value of the examDepAcctInfo property.
     *
     * @param value allowed object is {@link EXAMDepAcctInfoType }
     */
    public void setEXAMDepAcctInfo(EXAMDepAcctInfoType value) {
        this.examDepAcctInfo = value;
    }

    /**
     * Gets the value of the examCardAcctInfo property.
     *
     * @return possible object is {@link EXAMCardAcctInfoType }
     */
    public EXAMCardAcctInfoType getEXAMCardAcctInfo() {
        return examCardAcctInfo;
    }

    /**
     * Sets the value of the examCardAcctInfo property.
     *
     * @param value allowed object is {@link EXAMCardAcctInfoType }
     */
    public void setEXAMCardAcctInfo(EXAMCardAcctInfoType value) {
        this.examCardAcctInfo = value;
    }

    /**
     * Gets the value of the examBancaAcctInfo property.
     *
     * @return possible object is {@link EXAMBancaAcctInfoType }
     */
    public EXAMBancaAcctInfoType getEXAMBancaAcctInfo() {
        return examBancaAcctInfo;
    }

    /**
     * Sets the value of the examBancaAcctInfo property.
     *
     * @param value allowed object is {@link EXAMBancaAcctInfoType }
     */
    public void setEXAMBancaAcctInfo(EXAMBancaAcctInfoType value) {
        this.examBancaAcctInfo = value;
    }

    /**
     * Gets the value of the examExtnInfo property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the examExtnInfo property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMExtnInfo().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMExtensionInfoType }
     */
    public List<EXAMExtensionInfoType> getEXAMExtnInfo() {
        if (examExtnInfo == null) {
            examExtnInfo = new ArrayList<>();
        }
        return this.examExtnInfo;
    }

    /**
     * Gets the value of the examProductIdent property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMProductIdent() {
        return examProductIdent;
    }

    /**
     * Sets the value of the examProductIdent property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMProductIdent(String value) {
        this.examProductIdent = value;
    }

    /**
     * Gets the value of the examRewardData property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the examRewardData property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMRewardData().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RewardDataType }
     */
    public List<RewardDataType> getEXAMRewardData() {
        if (examRewardData == null) {
            examRewardData = new ArrayList<>();
        }
        return this.examRewardData;
    }

    /**
     * Gets the value of the examAcctUse property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMAcctUse() {
        return examAcctUse;
    }

    /**
     * Sets the value of the examAcctUse property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMAcctUse(String value) {
        this.examAcctUse = value;
    }

    /**
     * Gets the value of the examvipIndicator property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMVIPIndicator() {
        return examvipIndicator;
    }

    /**
     * Sets the value of the examvipIndicator property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMVIPIndicator(String value) {
        this.examvipIndicator = value;
    }

    /**
     * Gets the value of the language property.
     *
     * @return possible object is {@link String }
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     *
     * @param value allowed object is {@link String }
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the memo property.
     *
     * @return possible object is {@link String }
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     *
     * @param value allowed object is {@link String }
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * Gets the value of the examMailingCode property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMMailingCode() {
        return examMailingCode;
    }

    /**
     * Sets the value of the examMailingCode property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMMailingCode(String value) {
        this.examMailingCode = value;
    }

    /**
     * Gets the value of the examIndicator property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMIndicator() {
        return examIndicator;
    }

    /**
     * Sets the value of the examIndicator property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMIndicator(String value) {
        this.examIndicator = value;
    }

    /**
     * Gets the value of the effDt property.
     *
     * @return possible object is {@link String }
     */
    public String getEffDt() {
        return effDt;
    }

    /**
     * Sets the value of the effDt property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEffDt(String value) {
        this.effDt = value;
    }

    /**
     * Gets the value of the custInfo property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the custInfo property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustInfo().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustInfoType }
     */
    public List<CustInfoType> getCustInfo() {
        if (custInfo == null) {
            custInfo = new ArrayList<>();
        }
        return this.custInfo;
    }

    /**
     * Gets the value of the examConsolAcctId property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMConsolAcctId() {
        return examConsolAcctId;
    }

    /**
     * Sets the value of the examConsolAcctId property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMConsolAcctId(String value) {
        this.examConsolAcctId = value;
    }

    /**
     * Gets the value of the examConsolAcctType property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMConsolAcctType() {
        return examConsolAcctType;
    }

    /**
     * Sets the value of the examConsolAcctType property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMConsolAcctType(String value) {
        this.examConsolAcctType = value;
    }

    /**
     * Gets the value of the custPermId property.
     *
     * @return possible object is {@link String }
     */
    public String getCustPermId() {
        return custPermId;
    }

    /**
     * Sets the value of the custPermId property.
     *
     * @param value allowed object is {@link String }
     */
    public void setCustPermId(String value) {
        this.custPermId = value;
    }

    /**
     * Gets the value of the examAppNum property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMAppNum() {
        return examAppNum;
    }

    /**
     * Sets the value of the examAppNum property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMAppNum(String value) {
        this.examAppNum = value;
    }

    /**
     * Gets the value of the examGovIssueId property.
     *
     * @return possible object is {@link EXAMGovIssueIdentType }
     */
    public EXAMGovIssueIdentType getEXAMGovIssueId() {
        return examGovIssueId;
    }

    /**
     * Sets the value of the examGovIssueId property.
     *
     * @param value allowed object is {@link EXAMGovIssueIdentType }
     */
    public void setEXAMGovIssueId(EXAMGovIssueIdentType value) {
        this.examGovIssueId = value;
    }

    /**
     * Gets the value of the loanAcctId property.
     *
     * @return possible object is {@link com.theerut.springj11.client.webservice.common.LoanAcctIdType }
     */
    public com.theerut.springj11.client.webservice.common.LoanAcctIdType getLoanAcctId() {
        return loanAcctId;
    }

    /**
     * Sets the value of the loanAcctId property.
     *
     * @param value allowed object is {@link com.theerut.springj11.client.webservice.common.LoanAcctIdType }
     */
    public void setLoanAcctId(LoanAcctIdType value) {
        this.loanAcctId = value;
    }

    /**
     * Gets the value of the examStmtAddr property.
     *
     * @return possible object is {@link com.theerut.springj11.client.webservice.common.PostAddrType2 }
     */
    public com.theerut.springj11.client.webservice.common.PostAddrType2 getEXAMStmtAddr() {
        return examStmtAddr;
    }

    /**
     * Sets the value of the examStmtAddr property.
     *
     * @param value allowed object is {@link com.theerut.springj11.client.webservice.common.PostAddrType2 }
     */
    public void setEXAMStmtAddr(PostAddrType2 value) {
        this.examStmtAddr = value;
    }

    /**
     * Gets the value of the examCustCategory property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMCustCategory() {
        return examCustCategory;
    }

    /**
     * Sets the value of the examCustCategory property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMCustCategory(String value) {
        this.examCustCategory = value;
    }

    /**
     * Gets the value of the examUnClaimedAcct property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMUnClaimedAcct() {
        return examUnClaimedAcct;
    }

    /**
     * Sets the value of the examUnClaimedAcct property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMUnClaimedAcct(String value) {
        this.examUnClaimedAcct = value;
    }

    /**
     * Gets the value of the examWriteOffAcct property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMWriteOffAcct() {
        return examWriteOffAcct;
    }

    /**
     * Sets the value of the examWriteOffAcct property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMWriteOffAcct(String value) {
        this.examWriteOffAcct = value;
    }

    /**
     * Gets the value of the examsbuCode property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMSBUCode() {
        return examsbuCode;
    }

    /**
     * Sets the value of the examsbuCode property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMSBUCode(String value) {
        this.examsbuCode = value;
    }

    /**
     * Gets the value of the examCostCenter property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMCostCenter() {
        return examCostCenter;
    }

    /**
     * Sets the value of the examCostCenter property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMCostCenter(String value) {
        this.examCostCenter = value;
    }

    /**
     * Gets the value of the examCustSegmentCode property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMCustSegmentCode() {
        return examCustSegmentCode;
    }

    /**
     * Sets the value of the examCustSegmentCode property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMCustSegmentCode(String value) {
        this.examCustSegmentCode = value;
    }

    /**
     * Gets the value of the examConstitutionCode property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMConstitutionCode() {
        return examConstitutionCode;
    }

    /**
     * Sets the value of the examConstitutionCode property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMConstitutionCode(String value) {
        this.examConstitutionCode = value;
    }

    /**
     * Gets the value of the examgstReliefInd property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMGSTReliefInd() {
        return examgstReliefInd;
    }

    /**
     * Sets the value of the examgstReliefInd property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMGSTReliefInd(String value) {
        this.examgstReliefInd = value;
    }

    /**
     * Gets the value of the examJobDesignation property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMJobDesignation() {
        return examJobDesignation;
    }

    /**
     * Sets the value of the examJobDesignation property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMJobDesignation(String value) {
        this.examJobDesignation = value;
    }

    /**
     * Gets the value of the examEntDate property.
     *
     * @return possible object is {@link String }
     */
    public LocalDate getEXAMEntDate() {
        return examEntDate;
    }

    /**
     * Sets the value of the examEntDate property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMEntDate(LocalDate value) {
        this.examEntDate = value;
    }

    /**
     * Gets the value of the examSeqNum property.
     *
     * @return possible object is {@link Long }
     */
    public Long getEXAMSeqNum() {
        return examSeqNum;
    }

    /**
     * Sets the value of the examSeqNum property.
     *
     * @param value allowed object is {@link Long }
     */
    public void setEXAMSeqNum(Long value) {
        this.examSeqNum = value;
    }

    /**
     * Gets the value of the examPrimAcctInd property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMPrimAcctInd() {
        return examPrimAcctInd;
    }

    /**
     * Sets the value of the examPrimAcctInd property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMPrimAcctInd(String value) {
        this.examPrimAcctInd = value;
    }

    /**
     * Gets the value of the examnplStatus property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMNPLStatus() {
        return examnplStatus;
    }

    /**
     * Sets the value of the examnplStatus property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMNPLStatus(String value) {
        this.examnplStatus = value;
    }

    /**
     * Gets the value of the examBlockCode property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMBlockCode() {
        return examBlockCode;
    }

    /**
     * Sets the value of the examBlockCode property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMBlockCode(String value) {
        this.examBlockCode = value;
    }

    /**
     * Gets the value of the examReclassCode property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMReclassCode() {
        return examReclassCode;
    }

    /**
     * Sets the value of the examReclassCode property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMReclassCode(String value) {
        this.examReclassCode = value;
    }

    /**
     * Gets the value of the examMaturityDt property.
     *
     * @return possible object is {@link String }
     */
    public LocalDate getEXAMMaturityDt() {
        return examMaturityDt;
    }

    /**
     * Sets the value of the examMaturityDt property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMMaturityDt(LocalDate value) {
        this.examMaturityDt = value;
    }

    /**
     * Gets the value of the examPrincipalAmt property.
     *
     * @return possible object is {@link CurAmtType }
     */
    public CurAmtType getEXAMPrincipalAmt() {
        return examPrincipalAmt;
    }

    /**
     * Sets the value of the examPrincipalAmt property.
     *
     * @param value allowed object is {@link CurAmtType }
     */
    public void setEXAMPrincipalAmt(CurAmtType value) {
        this.examPrincipalAmt = value;
    }

    /**
     * Gets the value of the examMeasurementUnit property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMMeasurementUnit() {
        return examMeasurementUnit;
    }

    /**
     * Sets the value of the examMeasurementUnit property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMMeasurementUnit(String value) {
        this.examMeasurementUnit = value;
    }

    /**
     * Gets the value of the examcdsAcctNum property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMCDSAcctNum() {
        return examcdsAcctNum;
    }

    /**
     * Sets the value of the examcdsAcctNum property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMCDSAcctNum(String value) {
        this.examcdsAcctNum = value;
    }

    /**
     * Gets the value of the examAcctClass property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMAcctClass() {
        return examAcctClass;
    }

    /**
     * Sets the value of the examAcctClass property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMAcctClass(String value) {
        this.examAcctClass = value;
    }

    /**
     * Gets the value of the examProductGroupCode property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMProductGroupCode() {
        return examProductGroupCode;
    }

    /**
     * Sets the value of the examProductGroupCode property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMProductGroupCode(String value) {
        this.examProductGroupCode = value;
    }

    /**
     * Gets the value of the examProductGroupDesc property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMProductGroupDesc() {
        return examProductGroupDesc;
    }

    /**
     * Sets the value of the examProductGroupDesc property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMProductGroupDesc(String value) {
        this.examProductGroupDesc = value;
    }

    /**
     * Gets the value of the examTandemKey property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMTandemKey() {
        return examTandemKey;
    }

    /**
     * Sets the value of the examTandemKey property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMTandemKey(String value) {
        this.examTandemKey = value;
    }

    /**
     * Gets the value of the examCloseAcctFlag property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMCloseAcctFlag() {
        return examCloseAcctFlag;
    }

    /**
     * Sets the value of the examCloseAcctFlag property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMCloseAcctFlag(String value) {
        this.examCloseAcctFlag = value;
    }

    /**
     * Gets the value of the examSensitiveFlag property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMSensitiveFlag() {
        return examSensitiveFlag;
    }

    /**
     * Sets the value of the examSensitiveFlag property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMSensitiveFlag(String value) {
        this.examSensitiveFlag = value;
    }

    /**
     * Gets the value of the custType property.
     *
     * @return possible object is {@link String }
     */
    public String getCustType() {
        return custType;
    }

    /**
     * Sets the value of the custType property.
     *
     * @param value allowed object is {@link String }
     */
    public void setCustType(String value) {
        this.custType = value;
    }

    /**
     * Gets the value of the examPrimaryId property.
     *
     * @return possible object is {@link EXAMCustomerIdentificationType }
     */
    public EXAMCustomerIdentificationType getEXAMPrimaryId() {
        return examPrimaryId;
    }

    /**
     * Sets the value of the examPrimaryId property.
     *
     * @param value allowed object is {@link EXAMCustomerIdentificationType }
     */
    public void setEXAMPrimaryId(EXAMCustomerIdentificationType value) {
        this.examPrimaryId = value;
    }

    /**
     * Gets the value of the exampssiaUnits property.
     *
     * @return possible object is {@link EXAMPSSIAUnitsType }
     */
    public EXAMPSSIAUnitsType getEXAMPSSIAUnits() {
        return exampssiaUnits;
    }

    /**
     * Sets the value of the exampssiaUnits property.
     *
     * @param value allowed object is {@link EXAMPSSIAUnitsType }
     */
    public void setEXAMPSSIAUnits(EXAMPSSIAUnitsType value) {
        this.exampssiaUnits = value;
    }

    /**
     * Gets the value of the examProductDesc property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMProductDesc() {
        return examProductDesc;
    }

    /**
     * Sets the value of the examProductDesc property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMProductDesc(String value) {
        this.examProductDesc = value;
    }

    /**
     * Gets the value of the examCashliteIndicator property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMCashliteIndicator() {
        return examCashliteIndicator;
    }

    /**
     * Sets the value of the examCashliteIndicator property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMCashliteIndicator(String value) {
        this.examCashliteIndicator = value;
    }

    /**
     * Gets the value of the examIslamicIndicator property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMIslamicIndicator() {
        return examIslamicIndicator;
    }

    /**
     * Sets the value of the examIslamicIndicator property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMIslamicIndicator(String value) {
        this.examIslamicIndicator = value;
    }

    /**
     * Gets the value of the examLastRollOverDate property.
     *
     * @return possible object is {@link String }
     */
    public LocalDate getEXAMLastRollOverDate() {
        return examLastRollOverDate;
    }

    /**
     * Sets the value of the examLastRollOverDate property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMLastRollOverDate(LocalDate value) {
        this.examLastRollOverDate = value;
    }

    /**
     * Gets the value of the examStockMarketInfo property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the examStockMarketInfo property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMStockMarketInfo().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMStockMarketInfoType }
     */
    public List<EXAMStockMarketInfoType> getEXAMStockMarketInfo() {
        if (examStockMarketInfo == null) {
            examStockMarketInfo = new ArrayList<>();
        }
        return this.examStockMarketInfo;
    }

    /**
     * Gets the value of the examOldCustPermId property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMOldCustPermId() {
        return examOldCustPermId;
    }

    /**
     * Sets the value of the examOldCustPermId property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMOldCustPermId(String value) {
        this.examOldCustPermId = value;
    }

    /**
     * Gets the value of the examfdrNumber property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMFDRNumber() {
        return examfdrNumber;
    }

    /**
     * Sets the value of the examfdrNumber property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMFDRNumber(String value) {
        this.examfdrNumber = value;
    }

    /**
     * Gets the value of the examTerm property.
     *
     * @return possible object is {@link Long }
     */
    public Long getEXAMTerm() {
        return examTerm;
    }

    /**
     * Sets the value of the examTerm property.
     *
     * @param value allowed object is {@link Long }
     */
    public void setEXAMTerm(Long value) {
        this.examTerm = value;
    }

    /**
     * Gets the value of the examTermCode property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMTermCode() {
        return examTermCode;
    }

    /**
     * Sets the value of the examTermCode property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMTermCode(String value) {
        this.examTermCode = value;
    }

    /**
     * Gets the value of the examAccountOrg property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMAccountOrg() {
        return examAccountOrg;
    }

    /**
     * Sets the value of the examAccountOrg property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMAccountOrg(String value) {
        this.examAccountOrg = value;
    }

    /**
     * Gets the value of the examCentralBankCode5 property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMCentralBankCode5() {
        return examCentralBankCode5;
    }

    /**
     * Sets the value of the examCentralBankCode5 property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMCentralBankCode5(String value) {
        this.examCentralBankCode5 = value;
    }

    /**
     * Gets the value of the examIsResident property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMIsResident() {
        return examIsResident;
    }

    /**
     * Sets the value of the examIsResident property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMIsResident(String value) {
        this.examIsResident = value;
    }

    /**
     * Gets the value of the examCentralBankCode2 property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMCentralBankCode2() {
        return examCentralBankCode2;
    }

    /**
     * Sets the value of the examCentralBankCode2 property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMCentralBankCode2(String value) {
        this.examCentralBankCode2 = value;
    }

    /**
     * Gets the value of the examExtAcctInd property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMExtAcctInd() {
        return examExtAcctInd;
    }

    /**
     * Sets the value of the examExtAcctInd property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMExtAcctInd(String value) {
        this.examExtAcctInd = value;
    }

    /**
     * Gets the value of the examOpeningDt property.
     *
     * @return possible object is {@link String }
     */
    public LocalDate getEXAMOpeningDt() {
        return examOpeningDt;
    }

    /**
     * Sets the value of the examOpeningDt property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMOpeningDt(LocalDate value) {
        this.examOpeningDt = value;
    }

    /**
     * Gets the value of the examHoldAmt property.
     *
     * @return possible object is {@link BigDecimal }
     */
    public BigDecimal getEXAMHoldAmt() {
        return examHoldAmt;
    }

    /**
     * Sets the value of the examHoldAmt property.
     *
     * @param value allowed object is {@link BigDecimal }
     */
    public void setEXAMHoldAmt(BigDecimal value) {
        this.examHoldAmt = value;
    }

    /**
     * Gets the value of the examLedgerBalance property.
     *
     * @return possible object is {@link BigDecimal }
     */
    public BigDecimal getEXAMLedgerBalance() {
        return examLedgerBalance;
    }

    /**
     * Sets the value of the examLedgerBalance property.
     *
     * @param value allowed object is {@link BigDecimal }
     */
    public void setEXAMLedgerBalance(BigDecimal value) {
        this.examLedgerBalance = value;
    }

    /**
     * Gets the value of the examLedgerBonusBalance property.
     *
     * @return possible object is {@link BigDecimal }
     */
    public BigDecimal getEXAMLedgerBonusBalance() {
        return examLedgerBonusBalance;
    }

    /**
     * Sets the value of the examLedgerBonusBalance property.
     *
     * @param value allowed object is {@link BigDecimal }
     */
    public void setEXAMLedgerBonusBalance(BigDecimal value) {
        this.examLedgerBonusBalance = value;
    }

    /**
     * Gets the value of the examLedgerBalanceWithBonusUnit property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMLedgerBalanceWithBonusUnit() {
        return examLedgerBalanceWithBonusUnit;
    }

    /**
     * Sets the value of the examLedgerBalanceWithBonusUnit property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMLedgerBalanceWithBonusUnit(String value) {
        this.examLedgerBalanceWithBonusUnit = value;
    }

    /**
     * Gets the value of the examLedgerBalanceWithBonusAmt property.
     *
     * @return possible object is {@link BigDecimal }
     */
    public BigDecimal getEXAMLedgerBalanceWithBonusAmt() {
        return examLedgerBalanceWithBonusAmt;
    }

    /**
     * Sets the value of the examLedgerBalanceWithBonusAmt property.
     *
     * @param value allowed object is {@link BigDecimal }
     */
    public void setEXAMLedgerBalanceWithBonusAmt(BigDecimal value) {
        this.examLedgerBalanceWithBonusAmt = value;
    }

    /**
     * Gets the value of the examAccruedBonusUnit property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMAccruedBonusUnit() {
        return examAccruedBonusUnit;
    }

    /**
     * Sets the value of the examAccruedBonusUnit property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMAccruedBonusUnit(String value) {
        this.examAccruedBonusUnit = value;
    }

    /**
     * Gets the value of the examAcctClosingInfo property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the examAcctClosingInfo property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMAcctClosingInfo().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMAcctClosingInfoType }
     */
    public List<EXAMAcctClosingInfoType> getEXAMAcctClosingInfo() {
        if (examAcctClosingInfo == null) {
            examAcctClosingInfo = new ArrayList<>();
        }
        return this.examAcctClosingInfo;
    }

    /**
     * Gets the value of the examLastMaintDt property.
     *
     * @return possible object is {@link String }
     */
    public LocalDate getEXAMLastMaintDt() {
        return examLastMaintDt;
    }

    /**
     * Sets the value of the examLastMaintDt property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMLastMaintDt(LocalDate value) {
        this.examLastMaintDt = value;
    }

    /**
     * Gets the value of the examContactInfo property.
     *
     * @return possible object is {@link EXAMContactInfoType }
     */
    public EXAMContactInfoType getEXAMContactInfo() {
        return examContactInfo;
    }

    /**
     * Sets the value of the examContactInfo property.
     *
     * @param value allowed object is {@link EXAMContactInfoType }
     */
    public void setEXAMContactInfo(EXAMContactInfoType value) {
        this.examContactInfo = value;
    }

    /**
     * Gets the value of the examAdditionalName property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMAdditionalName() {
        return examAdditionalName;
    }

    /**
     * Sets the value of the examAdditionalName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMAdditionalName(String value) {
        this.examAdditionalName = value;
    }

    /**
     * Gets the value of the examProductType property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMProductType() {
        return examProductType;
    }

    /**
     * Sets the value of the examProductType property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMProductType(String value) {
        this.examProductType = value;
    }

    /**
     * Gets the value of the examibgCounter property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMIBGCounter() {
        return examibgCounter;
    }

    /**
     * Sets the value of the examibgCounter property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMIBGCounter(String value) {
        this.examibgCounter = value;
    }

    /**
     * Gets the value of the examCustSubType property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMCustSubType() {
        return examCustSubType;
    }

    /**
     * Sets the value of the examCustSubType property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMCustSubType(String value) {
        this.examCustSubType = value;
    }

    /**
     * Gets the value of the examEntity property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMEntity() {
        return examEntity;
    }

    /**
     * Sets the value of the examEntity property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMEntity(String value) {
        this.examEntity = value;
    }

    /**
     * Gets the value of the examPurposeCode property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMPurposeCode() {
        return examPurposeCode;
    }

    /**
     * Sets the value of the examPurposeCode property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMPurposeCode(String value) {
        this.examPurposeCode = value;
    }

    /**
     * Gets the value of the examWorkstationId property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMWorkstationId() {
        return examWorkstationId;
    }

    /**
     * Sets the value of the examWorkstationId property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMWorkstationId(String value) {
        this.examWorkstationId = value;
    }

    /**
     * Gets the value of the examTradeAcctRefNo property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMTradeAcctRefNo() {
        return examTradeAcctRefNo;
    }

    /**
     * Sets the value of the examTradeAcctRefNo property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMTradeAcctRefNo(String value) {
        this.examTradeAcctRefNo = value;
    }

    /**
     * Gets the value of the examAcctRefNo property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMAcctRefNo() {
        return examAcctRefNo;
    }

    /**
     * Sets the value of the examAcctRefNo property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMAcctRefNo(String value) {
        this.examAcctRefNo = value;
    }

    /**
     * Gets the value of the examEntityNum property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMEntityNum() {
        return examEntityNum;
    }

    /**
     * Sets the value of the examEntityNum property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMEntityNum(String value) {
        this.examEntityNum = value;
    }

    /**
     * Gets the value of the examRelationshipCode property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMRelationshipCode() {
        return examRelationshipCode;
    }

    /**
     * Sets the value of the examRelationshipCode property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMRelationshipCode(String value) {
        this.examRelationshipCode = value;
    }

    /**
     * Gets the value of the examBundleCode property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMBundleCode() {
        return examBundleCode;
    }

    /**
     * Sets the value of the examBundleCode property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMBundleCode(String value) {
        this.examBundleCode = value;
    }

    /**
     * Gets the value of the examRelationshipEndDate property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMRelationshipEndDate() {
        return examRelationshipEndDate;
    }

    /**
     * Sets the value of the examRelationshipEndDate property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMRelationshipEndDate(String value) {
        this.examRelationshipEndDate = value;
    }

    /**
     * Gets the value of the examTierCharges property.
     *
     * @return possible object is {@link BigDecimal }
     */
    public BigDecimal getEXAMTierCharges() {
        return examTierCharges;
    }

    /**
     * Sets the value of the examTierCharges property.
     *
     * @param value allowed object is {@link BigDecimal }
     */
    public void setEXAMTierCharges(BigDecimal value) {
        this.examTierCharges = value;
    }

    /**
     * Gets the value of the examProgramCode property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMProgramCode() {
        return examProgramCode;
    }

    /**
     * Sets the value of the examProgramCode property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMProgramCode(String value) {
        this.examProgramCode = value;
    }

    /**
     * Gets the value of the examSystemCode property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMSystemCode() {
        return examSystemCode;
    }

    /**
     * Sets the value of the examSystemCode property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMSystemCode(String value) {
        this.examSystemCode = value;
    }

    /**
     * Gets the value of the examAddrCustPermId property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMAddrCustPermId() {
        return examAddrCustPermId;
    }

    /**
     * Sets the value of the examAddrCustPermId property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMAddrCustPermId(String value) {
        this.examAddrCustPermId = value;
    }

    /**
     * Gets the value of the examAcctTypeCode property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMAcctTypeCode() {
        return examAcctTypeCode;
    }

    /**
     * Sets the value of the examAcctTypeCode property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMAcctTypeCode(String value) {
        this.examAcctTypeCode = value;
    }

    /**
     * Gets the value of the examHolder property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMHolder() {
        return examHolder;
    }

    /**
     * Sets the value of the examHolder property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMHolder(String value) {
        this.examHolder = value;
    }

    /**
     * Gets the value of the examMaskedBalInd property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMMaskedBalInd() {
        return examMaskedBalInd;
    }

    /**
     * Sets the value of the examMaskedBalInd property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMMaskedBalInd(String value) {
        this.examMaskedBalInd = value;
    }

    /**
     * Gets the value of the examOption property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMOption() {
        return examOption;
    }

    /**
     * Sets the value of the examOption property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMOption(String value) {
        this.examOption = value;
    }

    /**
     * Gets the value of the examInstInfo property.
     *
     * @return possible object is {@link EXAMInstInfoType }
     */
    public EXAMInstInfoType getEXAMInstInfo() {
        return examInstInfo;
    }

    /**
     * Sets the value of the examInstInfo property.
     *
     * @param value allowed object is {@link EXAMInstInfoType }
     */
    public void setEXAMInstInfo(EXAMInstInfoType value) {
        this.examInstInfo = value;
    }

    /**
     * Gets the value of the examBatchDate property.
     *
     * @return possible object is {@link String }
     */
    public LocalDate getEXAMBatchDate() {
        return examBatchDate;
    }

    /**
     * Sets the value of the examBatchDate property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMBatchDate(LocalDate value) {
        this.examBatchDate = value;
    }

    /**
     * Gets the value of the examLocalDesc property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMLocalDesc() {
        return examLocalDesc;
    }

    /**
     * Sets the value of the examLocalDesc property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMLocalDesc(String value) {
        this.examLocalDesc = value;
    }

    /**
     * Gets the value of the examPassbook property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMPassbook() {
        return examPassbook;
    }

    /**
     * Sets the value of the examPassbook property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMPassbook(String value) {
        this.examPassbook = value;
    }

    /**
     * Gets the value of the examPrintStmt property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMPrintStmt() {
        return examPrintStmt;
    }

    /**
     * Sets the value of the examPrintStmt property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMPrintStmt(String value) {
        this.examPrintStmt = value;
    }

    /**
     * Gets the value of the examTitleShortDesc property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMTitleShortDesc() {
        return examTitleShortDesc;
    }

    /**
     * Sets the value of the examTitleShortDesc property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMTitleShortDesc(String value) {
        this.examTitleShortDesc = value;
    }

    /**
     * Gets the value of the examTitleLongDesc property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMTitleLongDesc() {
        return examTitleLongDesc;
    }

    /**
     * Sets the value of the examTitleLongDesc property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMTitleLongDesc(String value) {
        this.examTitleLongDesc = value;
    }

    /**
     * Gets the value of the examTitleLocalDesc property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMTitleLocalDesc() {
        return examTitleLocalDesc;
    }

    /**
     * Sets the value of the examTitleLocalDesc property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMTitleLocalDesc(String value) {
        this.examTitleLocalDesc = value;
    }

    /**
     * Gets the value of the examLastCalcDt property.
     *
     * @return possible object is {@link String }
     */
    public LocalDate getEXAMLastCalcDt() {
        return examLastCalcDt;
    }

    /**
     * Sets the value of the examLastCalcDt property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMLastCalcDt(LocalDate value) {
        this.examLastCalcDt = value;
    }

    /**
     * Gets the value of the examOccurrenceDt property.
     *
     * @return possible object is {@link String }
     */
    public LocalDate getEXAMOccurrenceDt() {
        return examOccurrenceDt;
    }

    /**
     * Sets the value of the examOccurrenceDt property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMOccurrenceDt(LocalDate value) {
        this.examOccurrenceDt = value;
    }

    /**
     * Gets the value of the examNumberBook property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMNumberBook() {
        return examNumberBook;
    }

    /**
     * Sets the value of the examNumberBook property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMNumberBook(String value) {
        this.examNumberBook = value;
    }

    /**
     * Gets the value of the examNextLineNo property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMNextLineNo() {
        return examNextLineNo;
    }

    /**
     * Sets the value of the examNextLineNo property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMNextLineNo(String value) {
        this.examNextLineNo = value;
    }

    /**
     * Gets the value of the examProdInterestRateNo property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMProdInterestRateNo() {
        return examProdInterestRateNo;
    }

    /**
     * Sets the value of the examProdInterestRateNo property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMProdInterestRateNo(String value) {
        this.examProdInterestRateNo = value;
    }

    /**
     * Gets the value of the examProdInterestRate property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMProdInterestRate() {
        return examProdInterestRate;
    }

    /**
     * Sets the value of the examProdInterestRate property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMProdInterestRate(String value) {
        this.examProdInterestRate = value;
    }

    /**
     * Gets the value of the examIntLoading property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMIntLoading() {
        return examIntLoading;
    }

    /**
     * Sets the value of the examIntLoading property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMIntLoading(String value) {
        this.examIntLoading = value;
    }

    /**
     * Gets the value of the examIntLoadingCode property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMIntLoadingCode() {
        return examIntLoadingCode;
    }

    /**
     * Sets the value of the examIntLoadingCode property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMIntLoadingCode(String value) {
        this.examIntLoadingCode = value;
    }

    /**
     * Gets the value of the examSpecialInfo property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMSpecialInfo() {
        return examSpecialInfo;
    }

    /**
     * Sets the value of the examSpecialInfo property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMSpecialInfo(String value) {
        this.examSpecialInfo = value;
    }

    /**
     * Gets the value of the examHoldCode property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMHoldCode() {
        return examHoldCode;
    }

    /**
     * Sets the value of the examHoldCode property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMHoldCode(String value) {
        this.examHoldCode = value;
    }

    /**
     * Gets the value of the examLostContract property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMLostContract() {
        return examLostContract;
    }

    /**
     * Sets the value of the examLostContract property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMLostContract(String value) {
        this.examLostContract = value;
    }

    /**
     * Gets the value of the examMessageLine property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMMessageLine() {
        return examMessageLine;
    }

    /**
     * Sets the value of the examMessageLine property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMMessageLine(String value) {
        this.examMessageLine = value;
    }

    /**
     * Gets the value of the examDepositTerm property.
     *
     * @return possible object is {@link Long }
     */
    public Long getEXAMDepositTerm() {
        return examDepositTerm;
    }

    /**
     * Sets the value of the examDepositTerm property.
     *
     * @param value allowed object is {@link Long }
     */
    public void setEXAMDepositTerm(Long value) {
        this.examDepositTerm = value;
    }

    /**
     * Gets the value of the lastTrnDt property.
     *
     * @return possible object is {@link String }
     */
    public LocalDate getLastTrnDt() {
        return lastTrnDt;
    }

    /**
     * Sets the value of the lastTrnDt property.
     *
     * @param value allowed object is {@link String }
     */
    public void setLastTrnDt(LocalDate value) {
        this.lastTrnDt = value;
    }

    /**
     * Gets the value of the examLastTrnTm property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getEXAMLastTrnTm() {
        return examLastTrnTm;
    }

    /**
     * Sets the value of the examLastTrnTm property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     */
    public void setEXAMLastTrnTm(XMLGregorianCalendar value) {
        this.examLastTrnTm = value;
    }

    /**
     * Gets the value of the rate property.
     *
     * @return possible object is {@link BigDecimal }
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     *
     * @param value allowed object is {@link BigDecimal }
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the examPlacementNum property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMPlacementNum() {
        return examPlacementNum;
    }

    /**
     * Sets the value of the examPlacementNum property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMPlacementNum(String value) {
        this.examPlacementNum = value;
    }

    /**
     * Gets the value of the examNoOfPlacements property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMNoOfPlacements() {
        return examNoOfPlacements;
    }

    /**
     * Sets the value of the examNoOfPlacements property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMNoOfPlacements(String value) {
        this.examNoOfPlacements = value;
    }

    /**
     * Gets the value of the examNoOfDelinquencies property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMNoOfDelinquencies() {
        return examNoOfDelinquencies;
    }

    /**
     * Sets the value of the examNoOfDelinquencies property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMNoOfDelinquencies(String value) {
        this.examNoOfDelinquencies = value;
    }

    /**
     * Gets the value of the examPenaltyNum property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMPenaltyNum() {
        return examPenaltyNum;
    }

    /**
     * Sets the value of the examPenaltyNum property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMPenaltyNum(String value) {
        this.examPenaltyNum = value;
    }

    /**
     * Gets the value of the examTenor property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMTenor() {
        return examTenor;
    }

    /**
     * Sets the value of the examTenor property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMTenor(String value) {
        this.examTenor = value;
    }

    /**
     * Gets the value of the examEscrowAcctFlag property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMEscrowAcctFlag() {
        return examEscrowAcctFlag;
    }

    /**
     * Sets the value of the examEscrowAcctFlag property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMEscrowAcctFlag(String value) {
        this.examEscrowAcctFlag = value;
    }

    /**
     * Gets the value of the examPledgeCode property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMPledgeCode() {
        return examPledgeCode;
    }

    /**
     * Sets the value of the examPledgeCode property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMPledgeCode(String value) {
        this.examPledgeCode = value;
    }

    /**
     * Gets the value of the examPledgedStatus property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMPledgedStatus() {
        return examPledgedStatus;
    }

    /**
     * Sets the value of the examPledgedStatus property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMPledgedStatus(String value) {
        this.examPledgedStatus = value;
    }

    /**
     * Gets the value of the examCustInfo property.
     *
     * @return possible object is {@link EXAMCustInfoType }
     */
    public EXAMCustInfoType getEXAMCustInfo() {
        return examCustInfo;
    }

    /**
     * Sets the value of the examCustInfo property.
     *
     * @param value allowed object is {@link EXAMCustInfoType }
     */
    public void setEXAMCustInfo(EXAMCustInfoType value) {
        this.examCustInfo = value;
    }

    /**
     * Gets the value of the examTellerInqStat property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMTellerInqStat() {
        return examTellerInqStat;
    }

    /**
     * Sets the value of the examTellerInqStat property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMTellerInqStat(String value) {
        this.examTellerInqStat = value;
    }

    /**
     * Gets the value of the examSavingType property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMSavingType() {
        return examSavingType;
    }

    /**
     * Sets the value of the examSavingType property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMSavingType(String value) {
        this.examSavingType = value;
    }

    /**
     * Gets the value of the examcifStatus property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the examcifStatus property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMUIDStatus().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link String }
     */
    public List<String> getEXAMUIDStatus() {
        if (examcifStatus == null) {
            examcifStatus = new ArrayList<>();
        }
        return this.examcifStatus;
    }

    /**
     * Gets the value of the examRemarks property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the examRemarks property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMRemarks().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link String }
     */
    public List<String> getEXAMRemarks() {
        if (examRemarks == null) {
            examRemarks = new ArrayList<>();
        }
        return this.examRemarks;
    }

    /**
     * Gets the value of the examOfficerCode property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMOfficerCode() {
        return examOfficerCode;
    }

    /**
     * Sets the value of the examOfficerCode property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMOfficerCode(String value) {
        this.examOfficerCode = value;
    }

    /**
     * Gets the value of the examLastMaintUID property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMLastMaintUID() {
        return examLastMaintUID;
    }

    /**
     * Sets the value of the examLastMaintUID property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMLastMaintUID(String value) {
        this.examLastMaintUID = value;
    }

    /**
     * Gets the value of the examLastMaintTm property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getEXAMLastMaintTm() {
        return examLastMaintTm;
    }

    /**
     * Sets the value of the examLastMaintTm property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     */
    public void setEXAMLastMaintTm(XMLGregorianCalendar value) {
        this.examLastMaintTm = value;
    }

    /**
     * Gets the value of the examFlag property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the examFlag property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMFlag().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMFlagType }
     */
    public List<EXAMFlagType> getEXAMFlag() {
        if (examFlag == null) {
            examFlag = new ArrayList<>();
        }
        return this.examFlag;
    }

    /**
     * Gets the value of the examProdDesc property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMProdDesc() {
        return examProdDesc;
    }

    /**
     * Sets the value of the examProdDesc property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMProdDesc(String value) {
        this.examProdDesc = value;
    }

    /**
     * Gets the value of the examConvIslamic property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMConvIslamic() {
        return examConvIslamic;
    }

    /**
     * Sets the value of the examConvIslamic property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMConvIslamic(String value) {
        this.examConvIslamic = value;
    }

    /**
     * Gets the value of the examDepositNum property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMDepositNum() {
        return examDepositNum;
    }

    /**
     * Sets the value of the examDepositNum property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMDepositNum(String value) {
        this.examDepositNum = value;
    }

    /**
     * Gets the value of the examBalanceAmount property.
     *
     * @return possible object is {@link BigDecimal }
     */
    public BigDecimal getEXAMBalanceAmount() {
        return examBalanceAmount;
    }

    /**
     * Sets the value of the examBalanceAmount property.
     *
     * @param value allowed object is {@link BigDecimal }
     */
    public void setEXAMBalanceAmount(BigDecimal value) {
        this.examBalanceAmount = value;
    }

    /**
     * Gets the value of the examOnusFlag property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMOnusFlag() {
        return examOnusFlag;
    }

    /**
     * Sets the value of the examOnusFlag property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMOnusFlag(String value) {
        this.examOnusFlag = value;
    }

    /**
     * Gets the value of the examChannelCode property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMChannelCode() {
        return examChannelCode;
    }

    /**
     * Sets the value of the examChannelCode property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMChannelCode(String value) {
        this.examChannelCode = value;
    }

    /**
     * Gets the value of the examMaintInfo property.
     *
     * @return possible object is {@link EXAMMaintInfoType }
     */
    public EXAMMaintInfoType getEXAMMaintInfo() {
        return examMaintInfo;
    }

    /**
     * Sets the value of the examMaintInfo property.
     *
     * @param value allowed object is {@link EXAMMaintInfoType }
     */
    public void setEXAMMaintInfo(EXAMMaintInfoType value) {
        this.examMaintInfo = value;
    }

    /**
     * Gets the value of the examCreationInfo property.
     *
     * @return possible object is {@link EXAMCreationInfoType }
     */
    public EXAMCreationInfoType getEXAMCreationInfo() {
        return examCreationInfo;
    }

    /**
     * Sets the value of the examCreationInfo property.
     *
     * @param value allowed object is {@link EXAMCreationInfoType }
     */
    public void setEXAMCreationInfo(EXAMCreationInfoType value) {
        this.examCreationInfo = value;
    }

    /**
     * Gets the value of the shortDesc property.
     *
     * @return possible object is {@link String }
     */
    public String getShortDesc() {
        return shortDesc;
    }

    /**
     * Sets the value of the shortDesc property.
     *
     * @param value allowed object is {@link String }
     */
    public void setShortDesc(String value) {
        this.shortDesc = value;
    }

    /**
     * Gets the value of the examcifId property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMUIDId() {
        return examcifId;
    }

    /**
     * Sets the value of the examcifId property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMUIDId(String value) {
        this.examcifId = value;
    }

    /**
     * Gets the value of the examBankName property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMBankName() {
        return examBankName;
    }

    /**
     * Sets the value of the examBankName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMBankName(String value) {
        this.examBankName = value;
    }

    /**
     * Gets the value of the examTotalNumber property.
     *
     * @return possible object is {@link BigDecimal }
     */
    public BigDecimal getEXAMTotalNumber() {
        return examTotalNumber;
    }

    /**
     * Sets the value of the examTotalNumber property.
     *
     * @param value allowed object is {@link BigDecimal }
     */
    public void setEXAMTotalNumber(BigDecimal value) {
        this.examTotalNumber = value;
    }

    /**
     * Gets the value of the examHoldAlert property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMHoldAlert() {
        return examHoldAlert;
    }

    /**
     * Sets the value of the examHoldAlert property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMHoldAlert(String value) {
        this.examHoldAlert = value;
    }

    /**
     * Gets the value of the examEarmarkAlert property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMEarmarkAlert() {
        return examEarmarkAlert;
    }

    /**
     * Sets the value of the examEarmarkAlert property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMEarmarkAlert(String value) {
        this.examEarmarkAlert = value;
    }

    /**
     * Gets the value of the examStopPaymentAlert property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMStopPaymentAlert() {
        return examStopPaymentAlert;
    }

    /**
     * Sets the value of the examStopPaymentAlert property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMStopPaymentAlert(String value) {
        this.examStopPaymentAlert = value;
    }

    /**
     * Gets the value of the examcifAlert property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMUIDAlert() {
        return examcifAlert;
    }

    /**
     * Sets the value of the examcifAlert property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMUIDAlert(String value) {
        this.examcifAlert = value;
    }

    /**
     * Gets the value of the examRefundStatus property.
     *
     * @return possible object is {@link String }
     */
    public String getEXAMRefundStatus() {
        return examRefundStatus;
    }

    /**
     * Sets the value of the examRefundStatus property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEXAMRefundStatus(String value) {
        this.examRefundStatus = value;
    }

}
