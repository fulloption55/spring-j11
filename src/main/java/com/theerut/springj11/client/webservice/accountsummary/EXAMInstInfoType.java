
package com.theerut.springj11.client.webservice.accountsummary;

import com.theerut.springj11.client.webservice.common.CurAmtType;
import com.theerut.springj11.utils.LocalDateAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for EXAM_InstInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_InstInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_InstType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Term" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ComputeMethod" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Rate" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IntFreeMonths" minOccurs="0"/>
 *         &lt;element name="EXAM_FirstPmtAmt" type="{urn:ifxforum-org:XSD:1}Amt_Type" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastInstPaidAmt" minOccurs="0"/>
 *         &lt;element name="EXAM_InststrtDt" type="{urn:ifxforum-org:XSD:1}Date" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_InstAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastPmtDt" minOccurs="0"/>
 *         &lt;element name="EXAM_OutStdPrinciple" type="{urn:ifxforum-org:XSD:1}Amt_Type" minOccurs="0"/>
 *         &lt;element name="EXAM_OutStdInterest" type="{urn:ifxforum-org:XSD:1}Amt_Type" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_HandlingFee" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PlanType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Price" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_InstStatus" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RemainingPmtTerm" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CashliteIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Desc" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TotalInstAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PromoFlag" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_WaiveInstStartMonth" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_WaiveInstEndMonth" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PlanOrg" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DBAName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TranCurExp" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IPMDataCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CashliteAmount" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TrnDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_InterestAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PrincipalAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TotalIntAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TotalPrincipalInt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EffInterestRt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CashLiteDtlInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BusinessCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_InstInfo_Type", propOrder = {
    "curCode",
    "examInstType",
    "examTerm",
    "examComputeMethod",
    "examRate",
    "examIntFreeMonths",
    "examFirstPmtAmt",
    "examLastInstPaidAmt",
    "examInststrtDt",
    "examInstAmt",
    "examLastPmtDt",
    "examOutStdPrinciple",
    "examOutStdInterest",
    "examHandlingFee",
    "examPlanType",
    "examPrice",
    "examInstStatus",
    "examRemainingPmtTerm",
    "examCashliteIndicator",
    "desc",
    "examTotalInstAmt",
    "examPromoFlag",
    "examWaiveInstStartMonth",
    "examWaiveInstEndMonth",
    "examPlanOrg",
    "examdbaName",
    "examTranCurExp",
    "examipmDataCode",
    "examCashliteAmount",
    "examTrnDt",
    "examInterestAmt",
    "examPrincipalAmt",
    "examTotalIntAmt",
    "examTotalPrincipalInt",
    "examEffInterestRt",
    "examCashLiteDtlInfo",
    "examBusinessCode"
})
public class EXAMInstInfoType {

    @XmlElement(name = "CurCode")
    protected String curCode;
    @XmlElement(name = "EXAM_InstType")
    protected String examInstType;
    @XmlElement(name = "EXAM_Term")
    protected Long examTerm;
    @XmlElement(name = "EXAM_ComputeMethod")
    protected String examComputeMethod;
    @XmlElement(name = "EXAM_Rate")
    protected IntRateInfoType examRate;
    @XmlElement(name = "EXAM_IntFreeMonths")
    protected String examIntFreeMonths;
    @XmlElement(name = "EXAM_FirstPmtAmt")
    protected BigDecimal examFirstPmtAmt;
    @XmlElement(name = "EXAM_LastInstPaidAmt")
    protected BigDecimal examLastInstPaidAmt;
    @XmlElement(name = "EXAM_InststrtDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examInststrtDt;
    @XmlElement(name = "EXAM_InstAmt")
    protected BigDecimal examInstAmt;
    @XmlElement(name = "EXAM_LastPmtDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examLastPmtDt;
    @XmlElement(name = "EXAM_OutStdPrinciple")
    protected BigDecimal examOutStdPrinciple;
    @XmlElement(name = "EXAM_OutStdInterest")
    protected BigDecimal examOutStdInterest;
    @XmlElement(name = "EXAM_HandlingFee")
    protected String examHandlingFee;
    @XmlElement(name = "EXAM_PlanType")
    protected String examPlanType;
    @XmlElement(name = "EXAM_Price")
    protected CurAmtType examPrice;
    @XmlElement(name = "EXAM_InstStatus")
    protected String examInstStatus;
    @XmlElement(name = "EXAM_RemainingPmtTerm")
    protected String examRemainingPmtTerm;
    @XmlElement(name = "EXAM_CashliteIndicator")
    protected String examCashliteIndicator;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "EXAM_TotalInstAmt")
    protected BigDecimal examTotalInstAmt;
    @XmlElement(name = "EXAM_PromoFlag")
    protected String examPromoFlag;
    @XmlElement(name = "EXAM_WaiveInstStartMonth")
    protected String examWaiveInstStartMonth;
    @XmlElement(name = "EXAM_WaiveInstEndMonth")
    protected String examWaiveInstEndMonth;
    @XmlElement(name = "EXAM_PlanOrg")
    protected String examPlanOrg;
    @XmlElement(name = "EXAM_DBAName")
    protected String examdbaName;
    @XmlElement(name = "EXAM_TranCurExp")
    protected String examTranCurExp;
    @XmlElement(name = "EXAM_IPMDataCode")
    protected String examipmDataCode;
    @XmlElement(name = "EXAM_CashliteAmount")
    protected String examCashliteAmount;
    @XmlElement(name = "EXAM_TrnDt")
    protected String examTrnDt;
    @XmlElement(name = "EXAM_InterestAmt")
    protected BigDecimal examInterestAmt;
    @XmlElement(name = "EXAM_PrincipalAmt")
    protected CurAmtType examPrincipalAmt;
    @XmlElement(name = "EXAM_TotalIntAmt")
    protected BigDecimal examTotalIntAmt;
    @XmlElement(name = "EXAM_TotalPrincipalInt")
    protected BigDecimal examTotalPrincipalInt;
    @XmlElement(name = "EXAM_EffInterestRt")
    protected BigDecimal examEffInterestRt;
    @XmlElement(name = "EXAM_CashLiteDtlInfo")
    protected List<EXAMCashLiteDtlInfoType> examCashLiteDtlInfo;
    @XmlElement(name = "EXAM_BusinessCode")
    protected String examBusinessCode;

    /**
     * Gets the value of the curCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurCode() {
        return curCode;
    }

    /**
     * Sets the value of the curCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurCode(String value) {
        this.curCode = value;
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
     * Gets the value of the examTerm property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEXAMTerm() {
        return examTerm;
    }

    /**
     * Sets the value of the examTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEXAMTerm(Long value) {
        this.examTerm = value;
    }

    /**
     * Gets the value of the examComputeMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMComputeMethod() {
        return examComputeMethod;
    }

    /**
     * Sets the value of the examComputeMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMComputeMethod(String value) {
        this.examComputeMethod = value;
    }

    /**
     * Gets the value of the examRate property.
     * 
     * @return
     *     possible object is
     *     {@link IntRateInfoType }
     *     
     */
    public IntRateInfoType getEXAMRate() {
        return examRate;
    }

    /**
     * Sets the value of the examRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRateInfoType }
     *     
     */
    public void setEXAMRate(IntRateInfoType value) {
        this.examRate = value;
    }

    /**
     * Gets the value of the examIntFreeMonths property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIntFreeMonths() {
        return examIntFreeMonths;
    }

    /**
     * Sets the value of the examIntFreeMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIntFreeMonths(String value) {
        this.examIntFreeMonths = value;
    }

    /**
     * Gets the value of the examFirstPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMFirstPmtAmt() {
        return examFirstPmtAmt;
    }

    /**
     * Sets the value of the examFirstPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMFirstPmtAmt(BigDecimal value) {
        this.examFirstPmtAmt = value;
    }

    /**
     * Gets the value of the examLastInstPaidAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMLastInstPaidAmt() {
        return examLastInstPaidAmt;
    }

    /**
     * Sets the value of the examLastInstPaidAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMLastInstPaidAmt(BigDecimal value) {
        this.examLastInstPaidAmt = value;
    }

    /**
     * Gets the value of the examInststrtDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMInststrtDt() {
        return examInststrtDt;
    }

    /**
     * Sets the value of the examInststrtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMInststrtDt(LocalDate value) {
        this.examInststrtDt = value;
    }

    /**
     * Gets the value of the examInstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMInstAmt() {
        return examInstAmt;
    }

    /**
     * Sets the value of the examInstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMInstAmt(BigDecimal value) {
        this.examInstAmt = value;
    }

    /**
     * Gets the value of the examLastPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMLastPmtDt() {
        return examLastPmtDt;
    }

    /**
     * Sets the value of the examLastPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMLastPmtDt(LocalDate value) {
        this.examLastPmtDt = value;
    }

    /**
     * Gets the value of the examOutStdPrinciple property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMOutStdPrinciple() {
        return examOutStdPrinciple;
    }

    /**
     * Sets the value of the examOutStdPrinciple property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMOutStdPrinciple(BigDecimal value) {
        this.examOutStdPrinciple = value;
    }

    /**
     * Gets the value of the examOutStdInterest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMOutStdInterest() {
        return examOutStdInterest;
    }

    /**
     * Sets the value of the examOutStdInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMOutStdInterest(BigDecimal value) {
        this.examOutStdInterest = value;
    }

    /**
     * Gets the value of the examHandlingFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMHandlingFee() {
        return examHandlingFee;
    }

    /**
     * Sets the value of the examHandlingFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMHandlingFee(String value) {
        this.examHandlingFee = value;
    }

    /**
     * Gets the value of the examPlanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPlanType() {
        return examPlanType;
    }

    /**
     * Sets the value of the examPlanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPlanType(String value) {
        this.examPlanType = value;
    }

    /**
     * Gets the value of the examPrice property.
     * 
     * @return
     *     possible object is
     *     {@link CurAmtType }
     *     
     */
    public CurAmtType getEXAMPrice() {
        return examPrice;
    }

    /**
     * Sets the value of the examPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmtType }
     *     
     */
    public void setEXAMPrice(CurAmtType value) {
        this.examPrice = value;
    }

    /**
     * Gets the value of the examInstStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMInstStatus() {
        return examInstStatus;
    }

    /**
     * Sets the value of the examInstStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMInstStatus(String value) {
        this.examInstStatus = value;
    }

    /**
     * Gets the value of the examRemainingPmtTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMRemainingPmtTerm() {
        return examRemainingPmtTerm;
    }

    /**
     * Sets the value of the examRemainingPmtTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMRemainingPmtTerm(String value) {
        this.examRemainingPmtTerm = value;
    }

    /**
     * Gets the value of the examCashliteIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCashliteIndicator() {
        return examCashliteIndicator;
    }

    /**
     * Sets the value of the examCashliteIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCashliteIndicator(String value) {
        this.examCashliteIndicator = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the examTotalInstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMTotalInstAmt() {
        return examTotalInstAmt;
    }

    /**
     * Sets the value of the examTotalInstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMTotalInstAmt(BigDecimal value) {
        this.examTotalInstAmt = value;
    }

    /**
     * Gets the value of the examPromoFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPromoFlag() {
        return examPromoFlag;
    }

    /**
     * Sets the value of the examPromoFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPromoFlag(String value) {
        this.examPromoFlag = value;
    }

    /**
     * Gets the value of the examWaiveInstStartMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMWaiveInstStartMonth() {
        return examWaiveInstStartMonth;
    }

    /**
     * Sets the value of the examWaiveInstStartMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMWaiveInstStartMonth(String value) {
        this.examWaiveInstStartMonth = value;
    }

    /**
     * Gets the value of the examWaiveInstEndMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMWaiveInstEndMonth() {
        return examWaiveInstEndMonth;
    }

    /**
     * Sets the value of the examWaiveInstEndMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMWaiveInstEndMonth(String value) {
        this.examWaiveInstEndMonth = value;
    }

    /**
     * Gets the value of the examPlanOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPlanOrg() {
        return examPlanOrg;
    }

    /**
     * Sets the value of the examPlanOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPlanOrg(String value) {
        this.examPlanOrg = value;
    }

    /**
     * Gets the value of the examdbaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMDBAName() {
        return examdbaName;
    }

    /**
     * Sets the value of the examdbaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMDBAName(String value) {
        this.examdbaName = value;
    }

    /**
     * Gets the value of the examTranCurExp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMTranCurExp() {
        return examTranCurExp;
    }

    /**
     * Sets the value of the examTranCurExp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMTranCurExp(String value) {
        this.examTranCurExp = value;
    }

    /**
     * Gets the value of the examipmDataCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIPMDataCode() {
        return examipmDataCode;
    }

    /**
     * Sets the value of the examipmDataCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIPMDataCode(String value) {
        this.examipmDataCode = value;
    }

    /**
     * Gets the value of the examCashliteAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCashliteAmount() {
        return examCashliteAmount;
    }

    /**
     * Sets the value of the examCashliteAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCashliteAmount(String value) {
        this.examCashliteAmount = value;
    }

    /**
     * Gets the value of the examTrnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMTrnDt() {
        return examTrnDt;
    }

    /**
     * Sets the value of the examTrnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMTrnDt(String value) {
        this.examTrnDt = value;
    }

    /**
     * Gets the value of the examInterestAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMInterestAmt() {
        return examInterestAmt;
    }

    /**
     * Sets the value of the examInterestAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMInterestAmt(BigDecimal value) {
        this.examInterestAmt = value;
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
     * Gets the value of the examTotalIntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMTotalIntAmt() {
        return examTotalIntAmt;
    }

    /**
     * Sets the value of the examTotalIntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMTotalIntAmt(BigDecimal value) {
        this.examTotalIntAmt = value;
    }

    /**
     * Gets the value of the examTotalPrincipalInt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMTotalPrincipalInt() {
        return examTotalPrincipalInt;
    }

    /**
     * Sets the value of the examTotalPrincipalInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMTotalPrincipalInt(BigDecimal value) {
        this.examTotalPrincipalInt = value;
    }

    /**
     * Gets the value of the examEffInterestRt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMEffInterestRt() {
        return examEffInterestRt;
    }

    /**
     * Sets the value of the examEffInterestRt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMEffInterestRt(BigDecimal value) {
        this.examEffInterestRt = value;
    }

    /**
     * Gets the value of the examCashLiteDtlInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examCashLiteDtlInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMCashLiteDtlInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMCashLiteDtlInfoType }
     * 
     * 
     */
    public List<EXAMCashLiteDtlInfoType> getEXAMCashLiteDtlInfo() {
        if (examCashLiteDtlInfo == null) {
            examCashLiteDtlInfo = new ArrayList<>();
        }
        return this.examCashLiteDtlInfo;
    }

    /**
     * Gets the value of the examBusinessCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBusinessCode() {
        return examBusinessCode;
    }

    /**
     * Sets the value of the examBusinessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBusinessCode(String value) {
        this.examBusinessCode = value;
    }

}
