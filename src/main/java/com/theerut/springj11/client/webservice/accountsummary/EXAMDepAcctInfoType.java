
package com.theerut.springj11.client.webservice.accountsummary;

import com.theerut.springj11.client.webservice.common.EXAMExtensionInfoType;
import com.theerut.springj11.client.webservice.common.CurAmtType;
import com.theerut.springj11.client.webservice.common.DepAcctIdType;
import com.theerut.springj11.client.webservice.common.TermType;
import com.theerut.springj11.utils.LocalDateAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for EXAM_DepAcctInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_DepAcctInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;sequence minOccurs="0">
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PrimAcctInd" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IBGHostChgInd" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IBGTranCount" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IBGLimitCount" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IBGMinChgAmt" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IBGChgAmt" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}LastTrnDt" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastTrnTm" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence minOccurs="0">
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}DepMatureDt" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}Term" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}Rate" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IntPaidAmt" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PlacementDt" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_eFDInd" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RenewalInd" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ReceiptNum" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MaturityAmt" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IntTerm" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_GrpType" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_HoldCert" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IndemLetterSg" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_FDStatus" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ProfitRatio" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IslamicFD" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_FDAcctGrpNum" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IntCreditAcctId" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_InstType" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SplitMethod" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IntDispMethod" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ChannelCode" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BranchType" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PenRate" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CertNum" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EntryType" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CollateralID" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SrcID" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}SeqNum" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ReasonCode" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ReasonDesc" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Indicator" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OverdraftRate" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OverdraftBalance" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OverdraftLimit" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PenaltyAmt" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EntityNum" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PSSIAUnits" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CreditAcctId" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CreditAcctType" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AcctOwnerId" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MaturityDt" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;group ref="{urn:ifxforum-org:XSD:1}EXAM_ExtnGroup" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PrincipalAmt"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IntPmtMode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PlacementSrc" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CurrentCycleRate" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CycleNumber" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MaturityInstFlag" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_WithdrawalAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RenewalCycleNumber" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ValueDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastIntPayDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NextIntPayDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastRenewDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NextSchdPayDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EffDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AccrualMethod" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_YearBase" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EvenPaymentCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RateFloor" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RateCeiling" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_VarianceCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RateVariance" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_FDCycleCounter" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_FDCycle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RateSchedule" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TaxCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AgentId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_DepAcctInfo_Type", propOrder = {
    "examPrimAcctInd",
    "examibgHostChgInd",
    "examibgTranCount",
    "examibgLimitCount",
    "examibgMinChgAmt",
    "examibgChgAmt",
    "lastTrnDt",
    "examLastTrnTm",
    "depMatureDt",
    "term",
    "rate",
    "examIntPaidAmt",
    "examPlacementDt",
    "examefdInd",
    "examRenewalInd",
    "examReceiptNum",
    "examMaturityAmt",
    "examIntTerm",
    "examGrpType",
    "examHoldCert",
    "examIndemLetterSg",
    "examfdStatus",
    "examProfitRatio",
    "examIslamicFD",
    "examfdAcctGrpNum",
    "examIntCreditAcctId",
    "examInstType",
    "examSplitMethod",
    "examIntDispMethod",
    "examChannelCode",
    "examBranchType",
    "examPenRate",
    "examCertNum",
    "examEntryType",
    "examCollateralID",
    "examSrcID",
    "seqNum",
    "examReasonCode",
    "examReasonDesc",
    "examIndicator",
    "examOverdraftRate",
    "examOverdraftBalance",
    "examOverdraftLimit",
    "examPenaltyAmt",
    "examEntityNum",
    "exampssiaUnits",
    "examCreditAcctId",
    "examCreditAcctType",
    "examAcctOwnerId",
    "examMaturityDt",
    "examExtnInfo",
    "examPrincipalAmt",
    "examIntPmtMode",
    "examPlacementSrc",
    "examCurrentCycleRate",
    "examCycleNumber",
    "examMaturityInstFlag",
    "examWithdrawalAmt",
    "examRenewalCycleNumber",
    "examValueDt",
    "examLastIntPayDt",
    "examNextIntPayDt",
    "examLastRenewDt",
    "examNextSchdPayDt",
    "examEffDt",
    "examAccrualMethod",
    "examYearBase",
    "examEvenPaymentCode",
    "examRateFloor",
    "examRateCeiling",
    "examVarianceCode",
    "examRateVariance",
    "examfdCycleCounter",
    "examfdCycle",
    "examRateSchedule",
    "examTaxCode",
    "agentId"
})
public class EXAMDepAcctInfoType {

    @XmlElement(name = "EXAM_PrimAcctInd")
    protected String examPrimAcctInd;
    @XmlElement(name = "EXAM_IBGHostChgInd")
    protected String examibgHostChgInd;
    @XmlElement(name = "EXAM_IBGTranCount")
    protected Long examibgTranCount;
    @XmlElement(name = "EXAM_IBGLimitCount")
    protected Long examibgLimitCount;
    @XmlElement(name = "EXAM_IBGMinChgAmt")
    protected CurAmtType examibgMinChgAmt;
    @XmlElement(name = "EXAM_IBGChgAmt")
    protected CurAmtType examibgChgAmt;
    @XmlElement(name = "LastTrnDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate lastTrnDt;
    @XmlElement(name = "EXAM_LastTrnTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar examLastTrnTm;
    @XmlElement(name = "DepMatureDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate depMatureDt;
    @XmlElement(name = "Term")
    protected TermType term;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "EXAM_IntPaidAmt")
    protected BigDecimal examIntPaidAmt;
    @XmlElement(name = "EXAM_PlacementDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examPlacementDt;
    @XmlElement(name = "EXAM_eFDInd")
    protected String examefdInd;
    @XmlElement(name = "EXAM_RenewalInd")
    protected String examRenewalInd;
    @XmlElement(name = "EXAM_ReceiptNum")
    protected String examReceiptNum;
    @XmlElement(name = "EXAM_MaturityAmt")
    protected BigDecimal examMaturityAmt;
    @XmlElement(name = "EXAM_IntTerm")
    protected TermType examIntTerm;
    @XmlElement(name = "EXAM_GrpType")
    protected String examGrpType;
    @XmlElement(name = "EXAM_HoldCert")
    protected String examHoldCert;
    @XmlElement(name = "EXAM_IndemLetterSg")
    protected String examIndemLetterSg;
    @XmlElement(name = "EXAM_FDStatus")
    protected String examfdStatus;
    @XmlElement(name = "EXAM_ProfitRatio")
    protected BigDecimal examProfitRatio;
    @XmlElement(name = "EXAM_IslamicFD")
    protected String examIslamicFD;
    @XmlElement(name = "EXAM_FDAcctGrpNum")
    protected String examfdAcctGrpNum;
    @XmlElement(name = "EXAM_IntCreditAcctId")
    protected DepAcctIdType examIntCreditAcctId;
    @XmlElement(name = "EXAM_InstType")
    protected String examInstType;
    @XmlElement(name = "EXAM_SplitMethod")
    protected String examSplitMethod;
    @XmlElement(name = "EXAM_IntDispMethod")
    protected String examIntDispMethod;
    @XmlElement(name = "EXAM_ChannelCode")
    protected String examChannelCode;
    @XmlElement(name = "EXAM_BranchType")
    protected String examBranchType;
    @XmlElement(name = "EXAM_PenRate")
    protected BigDecimal examPenRate;
    @XmlElement(name = "EXAM_CertNum")
    protected String examCertNum;
    @XmlElement(name = "EXAM_EntryType")
    protected String examEntryType;
    @XmlElement(name = "EXAM_CollateralID")
    protected String examCollateralID;
    @XmlElement(name = "EXAM_SrcID")
    protected String examSrcID;
    @XmlElement(name = "SeqNum")
    protected Long seqNum;
    @XmlElement(name = "EXAM_ReasonCode")
    protected String examReasonCode;
    @XmlElement(name = "EXAM_ReasonDesc")
    protected String examReasonDesc;
    @XmlElement(name = "EXAM_Indicator")
    protected String examIndicator;
    @XmlElement(name = "EXAM_OverdraftRate")
    protected String examOverdraftRate;
    @XmlElement(name = "EXAM_OverdraftBalance")
    protected String examOverdraftBalance;
    @XmlElement(name = "EXAM_OverdraftLimit")
    protected BigDecimal examOverdraftLimit;
    @XmlElement(name = "EXAM_PenaltyAmt")
    protected BigDecimal examPenaltyAmt;
    @XmlElement(name = "EXAM_EntityNum")
    protected String examEntityNum;
    @XmlElement(name = "EXAM_PSSIAUnits")
    protected List<EXAMPSSIAUnitsType> exampssiaUnits;
    @XmlElement(name = "EXAM_CreditAcctId")
    protected String examCreditAcctId;
    @XmlElement(name = "EXAM_CreditAcctType")
    protected String examCreditAcctType;
    @XmlElement(name = "EXAM_AcctOwnerId")
    protected String examAcctOwnerId;
    @XmlElement(name = "EXAM_MaturityDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examMaturityDt;
    @XmlElement(name = "EXAM_ExtnInfo")
    protected List<EXAMExtensionInfoType> examExtnInfo;
    @XmlElement(name = "EXAM_PrincipalAmt", required = true)
    protected CurAmtType examPrincipalAmt;
    @XmlElement(name = "EXAM_IntPmtMode")
    protected String examIntPmtMode;
    @XmlElement(name = "EXAM_PlacementSrc")
    protected String examPlacementSrc;
    @XmlElement(name = "EXAM_CurrentCycleRate")
    protected BigDecimal examCurrentCycleRate;
    @XmlElement(name = "EXAM_CycleNumber")
    protected String examCycleNumber;
    @XmlElement(name = "EXAM_MaturityInstFlag")
    protected String examMaturityInstFlag;
    @XmlElement(name = "EXAM_WithdrawalAmt")
    protected BigDecimal examWithdrawalAmt;
    @XmlElement(name = "EXAM_RenewalCycleNumber")
    protected Long examRenewalCycleNumber;
    @XmlElement(name = "EXAM_ValueDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examValueDt;
    @XmlElement(name = "EXAM_LastIntPayDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examLastIntPayDt;
    @XmlElement(name = "EXAM_NextIntPayDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examNextIntPayDt;
    @XmlElement(name = "EXAM_LastRenewDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examLastRenewDt;
    @XmlElement(name = "EXAM_NextSchdPayDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examNextSchdPayDt;
    @XmlElement(name = "EXAM_EffDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examEffDt;
    @XmlElement(name = "EXAM_AccrualMethod")
    protected String examAccrualMethod;
    @XmlElement(name = "EXAM_YearBase")
    protected String examYearBase;
    @XmlElement(name = "EXAM_EvenPaymentCode")
    protected String examEvenPaymentCode;
    @XmlElement(name = "EXAM_RateFloor")
    protected BigDecimal examRateFloor;
    @XmlElement(name = "EXAM_RateCeiling")
    protected BigDecimal examRateCeiling;
    @XmlElement(name = "EXAM_VarianceCode")
    protected String examVarianceCode;
    @XmlElement(name = "EXAM_RateVariance")
    protected BigDecimal examRateVariance;
    @XmlElement(name = "EXAM_FDCycleCounter")
    protected BigInteger examfdCycleCounter;
    @XmlElement(name = "EXAM_FDCycle")
    protected List<EXAMFDCycleType> examfdCycle;
    @XmlElement(name = "EXAM_RateSchedule")
    protected String examRateSchedule;
    @XmlElement(name = "EXAM_TaxCode")
    protected String examTaxCode;
    @XmlElement(name = "AgentId")
    protected String agentId;

    /**
     * Gets the value of the examPrimAcctInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPrimAcctInd() {
        return examPrimAcctInd;
    }

    /**
     * Sets the value of the examPrimAcctInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPrimAcctInd(String value) {
        this.examPrimAcctInd = value;
    }

    /**
     * Gets the value of the examibgHostChgInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIBGHostChgInd() {
        return examibgHostChgInd;
    }

    /**
     * Sets the value of the examibgHostChgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIBGHostChgInd(String value) {
        this.examibgHostChgInd = value;
    }

    /**
     * Gets the value of the examibgTranCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEXAMIBGTranCount() {
        return examibgTranCount;
    }

    /**
     * Sets the value of the examibgTranCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEXAMIBGTranCount(Long value) {
        this.examibgTranCount = value;
    }

    /**
     * Gets the value of the examibgLimitCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEXAMIBGLimitCount() {
        return examibgLimitCount;
    }

    /**
     * Sets the value of the examibgLimitCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEXAMIBGLimitCount(Long value) {
        this.examibgLimitCount = value;
    }

    /**
     * Gets the value of the examibgMinChgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurAmtType }
     *     
     */
    public CurAmtType getEXAMIBGMinChgAmt() {
        return examibgMinChgAmt;
    }

    /**
     * Sets the value of the examibgMinChgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmtType }
     *     
     */
    public void setEXAMIBGMinChgAmt(CurAmtType value) {
        this.examibgMinChgAmt = value;
    }

    /**
     * Gets the value of the examibgChgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurAmtType }
     *     
     */
    public CurAmtType getEXAMIBGChgAmt() {
        return examibgChgAmt;
    }

    /**
     * Sets the value of the examibgChgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmtType }
     *     
     */
    public void setEXAMIBGChgAmt(CurAmtType value) {
        this.examibgChgAmt = value;
    }

    /**
     * Gets the value of the lastTrnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getLastTrnDt() {
        return lastTrnDt;
    }

    /**
     * Sets the value of the lastTrnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastTrnDt(LocalDate value) {
        this.lastTrnDt = value;
    }

    /**
     * Gets the value of the examLastTrnTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEXAMLastTrnTm() {
        return examLastTrnTm;
    }

    /**
     * Sets the value of the examLastTrnTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEXAMLastTrnTm(XMLGregorianCalendar value) {
        this.examLastTrnTm = value;
    }

    /**
     * Gets the value of the depMatureDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDepMatureDt() {
        return depMatureDt;
    }

    /**
     * Sets the value of the depMatureDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepMatureDt(LocalDate value) {
        this.depMatureDt = value;
    }

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link TermType }
     *     
     */
    public TermType getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermType }
     *     
     */
    public void setTerm(TermType value) {
        this.term = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the examIntPaidAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMIntPaidAmt() {
        return examIntPaidAmt;
    }

    /**
     * Sets the value of the examIntPaidAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMIntPaidAmt(BigDecimal value) {
        this.examIntPaidAmt = value;
    }

    /**
     * Gets the value of the examPlacementDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMPlacementDt() {
        return examPlacementDt;
    }

    /**
     * Sets the value of the examPlacementDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPlacementDt(LocalDate value) {
        this.examPlacementDt = value;
    }

    /**
     * Gets the value of the examefdInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMEFDInd() {
        return examefdInd;
    }

    /**
     * Sets the value of the examefdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEFDInd(String value) {
        this.examefdInd = value;
    }

    /**
     * Gets the value of the examRenewalInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMRenewalInd() {
        return examRenewalInd;
    }

    /**
     * Sets the value of the examRenewalInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMRenewalInd(String value) {
        this.examRenewalInd = value;
    }

    /**
     * Gets the value of the examReceiptNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMReceiptNum() {
        return examReceiptNum;
    }

    /**
     * Sets the value of the examReceiptNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMReceiptNum(String value) {
        this.examReceiptNum = value;
    }

    /**
     * Gets the value of the examMaturityAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMMaturityAmt() {
        return examMaturityAmt;
    }

    /**
     * Sets the value of the examMaturityAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMMaturityAmt(BigDecimal value) {
        this.examMaturityAmt = value;
    }

    /**
     * Gets the value of the examIntTerm property.
     * 
     * @return
     *     possible object is
     *     {@link TermType }
     *     
     */
    public TermType getEXAMIntTerm() {
        return examIntTerm;
    }

    /**
     * Sets the value of the examIntTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermType }
     *     
     */
    public void setEXAMIntTerm(TermType value) {
        this.examIntTerm = value;
    }

    /**
     * Gets the value of the examGrpType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMGrpType() {
        return examGrpType;
    }

    /**
     * Sets the value of the examGrpType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMGrpType(String value) {
        this.examGrpType = value;
    }

    /**
     * Gets the value of the examHoldCert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMHoldCert() {
        return examHoldCert;
    }

    /**
     * Sets the value of the examHoldCert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMHoldCert(String value) {
        this.examHoldCert = value;
    }

    /**
     * Gets the value of the examIndemLetterSg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIndemLetterSg() {
        return examIndemLetterSg;
    }

    /**
     * Sets the value of the examIndemLetterSg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIndemLetterSg(String value) {
        this.examIndemLetterSg = value;
    }

    /**
     * Gets the value of the examfdStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMFDStatus() {
        return examfdStatus;
    }

    /**
     * Sets the value of the examfdStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMFDStatus(String value) {
        this.examfdStatus = value;
    }

    /**
     * Gets the value of the examProfitRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMProfitRatio() {
        return examProfitRatio;
    }

    /**
     * Sets the value of the examProfitRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMProfitRatio(BigDecimal value) {
        this.examProfitRatio = value;
    }

    /**
     * Gets the value of the examIslamicFD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIslamicFD() {
        return examIslamicFD;
    }

    /**
     * Sets the value of the examIslamicFD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIslamicFD(String value) {
        this.examIslamicFD = value;
    }

    /**
     * Gets the value of the examfdAcctGrpNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMFDAcctGrpNum() {
        return examfdAcctGrpNum;
    }

    /**
     * Sets the value of the examfdAcctGrpNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMFDAcctGrpNum(String value) {
        this.examfdAcctGrpNum = value;
    }

    /**
     * Gets the value of the examIntCreditAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link DepAcctIdType }
     *     
     */
    public DepAcctIdType getEXAMIntCreditAcctId() {
        return examIntCreditAcctId;
    }

    /**
     * Sets the value of the examIntCreditAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAcctIdType }
     *     
     */
    public void setEXAMIntCreditAcctId(DepAcctIdType value) {
        this.examIntCreditAcctId = value;
    }

    /**
     * Gets the value of the examInstType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMInstType() {
        return examInstType;
    }

    /**
     * Sets the value of the examInstType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMInstType(String value) {
        this.examInstType = value;
    }

    /**
     * Gets the value of the examSplitMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSplitMethod() {
        return examSplitMethod;
    }

    /**
     * Sets the value of the examSplitMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSplitMethod(String value) {
        this.examSplitMethod = value;
    }

    /**
     * Gets the value of the examIntDispMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIntDispMethod() {
        return examIntDispMethod;
    }

    /**
     * Sets the value of the examIntDispMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIntDispMethod(String value) {
        this.examIntDispMethod = value;
    }

    /**
     * Gets the value of the examChannelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMChannelCode() {
        return examChannelCode;
    }

    /**
     * Sets the value of the examChannelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMChannelCode(String value) {
        this.examChannelCode = value;
    }

    /**
     * Gets the value of the examBranchType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBranchType() {
        return examBranchType;
    }

    /**
     * Sets the value of the examBranchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBranchType(String value) {
        this.examBranchType = value;
    }

    /**
     * Gets the value of the examPenRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMPenRate() {
        return examPenRate;
    }

    /**
     * Sets the value of the examPenRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMPenRate(BigDecimal value) {
        this.examPenRate = value;
    }

    /**
     * Gets the value of the examCertNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCertNum() {
        return examCertNum;
    }

    /**
     * Sets the value of the examCertNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCertNum(String value) {
        this.examCertNum = value;
    }

    /**
     * Gets the value of the examEntryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMEntryType() {
        return examEntryType;
    }

    /**
     * Sets the value of the examEntryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEntryType(String value) {
        this.examEntryType = value;
    }

    /**
     * Gets the value of the examCollateralID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCollateralID() {
        return examCollateralID;
    }

    /**
     * Sets the value of the examCollateralID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCollateralID(String value) {
        this.examCollateralID = value;
    }

    /**
     * Gets the value of the examSrcID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSrcID() {
        return examSrcID;
    }

    /**
     * Sets the value of the examSrcID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSrcID(String value) {
        this.examSrcID = value;
    }

    /**
     * Gets the value of the seqNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSeqNum() {
        return seqNum;
    }

    /**
     * Sets the value of the seqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeqNum(Long value) {
        this.seqNum = value;
    }

    /**
     * Gets the value of the examReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMReasonCode() {
        return examReasonCode;
    }

    /**
     * Sets the value of the examReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMReasonCode(String value) {
        this.examReasonCode = value;
    }

    /**
     * Gets the value of the examReasonDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMReasonDesc() {
        return examReasonDesc;
    }

    /**
     * Sets the value of the examReasonDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMReasonDesc(String value) {
        this.examReasonDesc = value;
    }

    /**
     * Gets the value of the examIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIndicator() {
        return examIndicator;
    }

    /**
     * Sets the value of the examIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIndicator(String value) {
        this.examIndicator = value;
    }

    /**
     * Gets the value of the examOverdraftRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOverdraftRate() {
        return examOverdraftRate;
    }

    /**
     * Sets the value of the examOverdraftRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOverdraftRate(String value) {
        this.examOverdraftRate = value;
    }

    /**
     * Gets the value of the examOverdraftBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOverdraftBalance() {
        return examOverdraftBalance;
    }

    /**
     * Sets the value of the examOverdraftBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOverdraftBalance(String value) {
        this.examOverdraftBalance = value;
    }

    /**
     * Gets the value of the examOverdraftLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMOverdraftLimit() {
        return examOverdraftLimit;
    }

    /**
     * Sets the value of the examOverdraftLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMOverdraftLimit(BigDecimal value) {
        this.examOverdraftLimit = value;
    }

    /**
     * Gets the value of the examPenaltyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMPenaltyAmt() {
        return examPenaltyAmt;
    }

    /**
     * Sets the value of the examPenaltyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMPenaltyAmt(BigDecimal value) {
        this.examPenaltyAmt = value;
    }

    /**
     * Gets the value of the examEntityNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMEntityNum() {
        return examEntityNum;
    }

    /**
     * Sets the value of the examEntityNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEntityNum(String value) {
        this.examEntityNum = value;
    }

    /**
     * Gets the value of the exampssiaUnits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exampssiaUnits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMPSSIAUnits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMPSSIAUnitsType }
     * 
     * 
     */
    public List<EXAMPSSIAUnitsType> getEXAMPSSIAUnits() {
        if (exampssiaUnits == null) {
            exampssiaUnits = new ArrayList<>();
        }
        return this.exampssiaUnits;
    }

    /**
     * Gets the value of the examCreditAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCreditAcctId() {
        return examCreditAcctId;
    }

    /**
     * Sets the value of the examCreditAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCreditAcctId(String value) {
        this.examCreditAcctId = value;
    }

    /**
     * Gets the value of the examCreditAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCreditAcctType() {
        return examCreditAcctType;
    }

    /**
     * Sets the value of the examCreditAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCreditAcctType(String value) {
        this.examCreditAcctType = value;
    }

    /**
     * Gets the value of the examAcctOwnerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMAcctOwnerId() {
        return examAcctOwnerId;
    }

    /**
     * Sets the value of the examAcctOwnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMAcctOwnerId(String value) {
        this.examAcctOwnerId = value;
    }

    /**
     * Gets the value of the examMaturityDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMMaturityDt() {
        return examMaturityDt;
    }

    /**
     * Sets the value of the examMaturityDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMaturityDt(LocalDate value) {
        this.examMaturityDt = value;
    }

    /**
     * Gets the value of the examExtnInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examExtnInfo property.
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
     * 
     * 
     */
    public List<EXAMExtensionInfoType> getEXAMExtnInfo() {
        if (examExtnInfo == null) {
            examExtnInfo = new ArrayList<>();
        }
        return this.examExtnInfo;
    }

    /**
     * Gets the value of the examPrincipalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurAmtType }
     *     
     */
    public CurAmtType getEXAMPrincipalAmt() {
        return examPrincipalAmt;
    }

    /**
     * Sets the value of the examPrincipalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmtType }
     *     
     */
    public void setEXAMPrincipalAmt(CurAmtType value) {
        this.examPrincipalAmt = value;
    }

    /**
     * Gets the value of the examIntPmtMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIntPmtMode() {
        return examIntPmtMode;
    }

    /**
     * Sets the value of the examIntPmtMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIntPmtMode(String value) {
        this.examIntPmtMode = value;
    }

    /**
     * Gets the value of the examPlacementSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPlacementSrc() {
        return examPlacementSrc;
    }

    /**
     * Sets the value of the examPlacementSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPlacementSrc(String value) {
        this.examPlacementSrc = value;
    }

    /**
     * Gets the value of the examCurrentCycleRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMCurrentCycleRate() {
        return examCurrentCycleRate;
    }

    /**
     * Sets the value of the examCurrentCycleRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMCurrentCycleRate(BigDecimal value) {
        this.examCurrentCycleRate = value;
    }

    /**
     * Gets the value of the examCycleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCycleNumber() {
        return examCycleNumber;
    }

    /**
     * Sets the value of the examCycleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCycleNumber(String value) {
        this.examCycleNumber = value;
    }

    /**
     * Gets the value of the examMaturityInstFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMaturityInstFlag() {
        return examMaturityInstFlag;
    }

    /**
     * Sets the value of the examMaturityInstFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMaturityInstFlag(String value) {
        this.examMaturityInstFlag = value;
    }

    /**
     * Gets the value of the examWithdrawalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMWithdrawalAmt() {
        return examWithdrawalAmt;
    }

    /**
     * Sets the value of the examWithdrawalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMWithdrawalAmt(BigDecimal value) {
        this.examWithdrawalAmt = value;
    }

    /**
     * Gets the value of the examRenewalCycleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEXAMRenewalCycleNumber() {
        return examRenewalCycleNumber;
    }

    /**
     * Sets the value of the examRenewalCycleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEXAMRenewalCycleNumber(Long value) {
        this.examRenewalCycleNumber = value;
    }

    /**
     * Gets the value of the examValueDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMValueDt() {
        return examValueDt;
    }

    /**
     * Sets the value of the examValueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMValueDt(LocalDate value) {
        this.examValueDt = value;
    }

    /**
     * Gets the value of the examLastIntPayDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMLastIntPayDt() {
        return examLastIntPayDt;
    }

    /**
     * Sets the value of the examLastIntPayDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMLastIntPayDt(LocalDate value) {
        this.examLastIntPayDt = value;
    }

    /**
     * Gets the value of the examNextIntPayDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMNextIntPayDt() {
        return examNextIntPayDt;
    }

    /**
     * Sets the value of the examNextIntPayDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMNextIntPayDt(LocalDate value) {
        this.examNextIntPayDt = value;
    }

    /**
     * Gets the value of the examLastRenewDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMLastRenewDt() {
        return examLastRenewDt;
    }

    /**
     * Sets the value of the examLastRenewDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMLastRenewDt(LocalDate value) {
        this.examLastRenewDt = value;
    }

    /**
     * Gets the value of the examNextSchdPayDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMNextSchdPayDt() {
        return examNextSchdPayDt;
    }

    /**
     * Sets the value of the examNextSchdPayDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMNextSchdPayDt(LocalDate value) {
        this.examNextSchdPayDt = value;
    }

    /**
     * Gets the value of the examEffDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMEffDt() {
        return examEffDt;
    }

    /**
     * Sets the value of the examEffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEffDt(LocalDate value) {
        this.examEffDt = value;
    }

    /**
     * Gets the value of the examAccrualMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMAccrualMethod() {
        return examAccrualMethod;
    }

    /**
     * Sets the value of the examAccrualMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMAccrualMethod(String value) {
        this.examAccrualMethod = value;
    }

    /**
     * Gets the value of the examYearBase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMYearBase() {
        return examYearBase;
    }

    /**
     * Sets the value of the examYearBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMYearBase(String value) {
        this.examYearBase = value;
    }

    /**
     * Gets the value of the examEvenPaymentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMEvenPaymentCode() {
        return examEvenPaymentCode;
    }

    /**
     * Sets the value of the examEvenPaymentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEvenPaymentCode(String value) {
        this.examEvenPaymentCode = value;
    }

    /**
     * Gets the value of the examRateFloor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMRateFloor() {
        return examRateFloor;
    }

    /**
     * Sets the value of the examRateFloor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMRateFloor(BigDecimal value) {
        this.examRateFloor = value;
    }

    /**
     * Gets the value of the examRateCeiling property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMRateCeiling() {
        return examRateCeiling;
    }

    /**
     * Sets the value of the examRateCeiling property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMRateCeiling(BigDecimal value) {
        this.examRateCeiling = value;
    }

    /**
     * Gets the value of the examVarianceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMVarianceCode() {
        return examVarianceCode;
    }

    /**
     * Sets the value of the examVarianceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMVarianceCode(String value) {
        this.examVarianceCode = value;
    }

    /**
     * Gets the value of the examRateVariance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMRateVariance() {
        return examRateVariance;
    }

    /**
     * Sets the value of the examRateVariance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMRateVariance(BigDecimal value) {
        this.examRateVariance = value;
    }

    /**
     * Gets the value of the examfdCycleCounter property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEXAMFDCycleCounter() {
        return examfdCycleCounter;
    }

    /**
     * Sets the value of the examfdCycleCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEXAMFDCycleCounter(BigInteger value) {
        this.examfdCycleCounter = value;
    }

    /**
     * Gets the value of the examfdCycle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examfdCycle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMFDCycle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMFDCycleType }
     * 
     * 
     */
    public List<EXAMFDCycleType> getEXAMFDCycle() {
        if (examfdCycle == null) {
            examfdCycle = new ArrayList<>();
        }
        return this.examfdCycle;
    }

    /**
     * Gets the value of the examRateSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMRateSchedule() {
        return examRateSchedule;
    }

    /**
     * Sets the value of the examRateSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMRateSchedule(String value) {
        this.examRateSchedule = value;
    }

    /**
     * Gets the value of the examTaxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMTaxCode() {
        return examTaxCode;
    }

    /**
     * Sets the value of the examTaxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMTaxCode(String value) {
        this.examTaxCode = value;
    }

    /**
     * Gets the value of the agentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentId() {
        return agentId;
    }

    /**
     * Sets the value of the agentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentId(String value) {
        this.agentId = value;
    }

}
