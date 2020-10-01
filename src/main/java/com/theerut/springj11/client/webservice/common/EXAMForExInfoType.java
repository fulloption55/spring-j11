
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;


/**
 * <p>Java class for EXAM_ForExInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_ForExInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BankId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_FromAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ToAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BaseCurCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BaseEquAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ForExRateDealType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ForExQuoteType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurRate" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurConvertRule" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Fee" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ExpDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ForExErrorCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Regcode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ProdType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RateType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Rate1" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Rate2" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Rate3" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MidvalueUSD" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MidValueMYR" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IdentNum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TrnDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RemitterInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BeneInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OperatorRate" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Campaign" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_FeeInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TotalRemitAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Corridorcode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SSTrnKey" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AgentId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TerminalId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Memo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PurposeCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ConstitutionCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_WatchListSupVId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_WatchListStatus" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PmtDtls" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtStatusCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PmtMode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SectorCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RelationshipCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ExtAcctInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BNMRefNo" minOccurs="0"/>
 *         &lt;element name="EXAM_RateInfo" type="{urn:ifxforum-org:XSD:1}EXAM_RateInfoType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastMaintDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DisplayUnits" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CurrencySuspInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ConvUnits" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_QuoteCurCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Denomination" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_QuoteType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_ForExInfo_Type", propOrder = {
    "bankId",
    "examFromAmt",
    "examToAmt",
    "examBaseCurCode",
    "examBaseEquAmt",
    "forExRateDealType",
    "examForExQuoteType",
    "curRate",
    "curConvertRule",
    "fee",
    "expDt",
    "examForExErrorCode",
    "examRegcode",
    "examProdType",
    "examRateType",
    "examRate1",
    "examRate2",
    "examRate3",
    "examMidvalueUSD",
    "examMidValueMYR",
    "examIdentNum",
    "trnDt",
    "pmtType",
    "examRemitterInfo",
    "examBeneInfo",
    "examOperatorRate",
    "examCampaign",
    "examFeeInfo",
    "examTotalRemitAmt",
    "examCorridorcode",
    "examssTrnKey",
    "agentId",
    "terminalId",
    "memo",
    "examPurposeCode",
    "examConstitutionCode",
    "examWatchListSupVId",
    "examWatchListStatus",
    "examPmtDtls",
    "pmtStatusCode",
    "examPmtMode",
    "examSectorCode",
    "examRelationshipCode",
    "examExtAcctInd",
    "exambnmRefNo",
    "examRateInfo",
    "examLastMaintDt",
    "examDisplayUnits",
    "examCurrencySuspInd",
    "examConvUnits",
    "curCode",
    "examQuoteCurCode",
    "examDenomination",
    "examQuoteType"
})
public class EXAMForExInfoType {

    @XmlElement(name = "BankId")
    protected String bankId;
    @XmlElement(name = "EXAM_FromAmt")
    protected CurAmtType examFromAmt;
    @XmlElement(name = "EXAM_ToAmt")
    protected CurAmtType examToAmt;
    @XmlElement(name = "EXAM_BaseCurCode")
    protected String examBaseCurCode;
    @XmlElement(name = "EXAM_BaseEquAmt")
    protected CurAmtType examBaseEquAmt;
    @XmlElement(name = "ForExRateDealType")
    protected String forExRateDealType;
    @XmlElement(name = "EXAM_ForExQuoteType")
    protected String examForExQuoteType;
    @XmlElement(name = "CurRate")
    protected BigDecimal curRate;
    @XmlElement(name = "CurConvertRule")
    protected String curConvertRule;
    @XmlElement(name = "Fee")
    protected FeeType fee;
    @XmlElement(name = "ExpDt")
    protected String expDt;
    @XmlElement(name = "EXAM_ForExErrorCode")
    protected String examForExErrorCode;
    @XmlElement(name = "EXAM_Regcode")
    protected String examRegcode;
    @XmlElement(name = "EXAM_ProdType")
    protected String examProdType;
    @XmlElement(name = "EXAM_RateType")
    protected String examRateType;
    @XmlElement(name = "EXAM_Rate1")
    protected BigDecimal examRate1;
    @XmlElement(name = "EXAM_Rate2")
    protected BigDecimal examRate2;
    @XmlElement(name = "EXAM_Rate3")
    protected BigDecimal examRate3;
    @XmlElement(name = "EXAM_MidvalueUSD")
    protected BigDecimal examMidvalueUSD;
    @XmlElement(name = "EXAM_MidValueMYR")
    protected BigDecimal examMidValueMYR;
    @XmlElement(name = "EXAM_IdentNum")
    protected String examIdentNum;
    @XmlElement(name = "TrnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar trnDt;
    @XmlElement(name = "PmtType")
    protected String pmtType;
    @XmlElement(name = "EXAM_RemitterInfo")
    protected EXAMRemitterInfoType examRemitterInfo;
    @XmlElement(name = "EXAM_BeneInfo")
    protected EXAMBeneInfoType examBeneInfo;
    @XmlElement(name = "EXAM_OperatorRate")
    protected BigDecimal examOperatorRate;
    @XmlElement(name = "EXAM_Campaign")
    protected String examCampaign;
    @XmlElement(name = "EXAM_FeeInfo")
    protected EXAMFeeType examFeeInfo;
    @XmlElement(name = "EXAM_TotalRemitAmt")
    protected BigDecimal examTotalRemitAmt;
    @XmlElement(name = "EXAM_Corridorcode")
    protected String examCorridorcode;
    @XmlElement(name = "EXAM_SSTrnKey")
    protected String examssTrnKey;
    @XmlElement(name = "AgentId")
    protected String agentId;
    @XmlElement(name = "TerminalId")
    protected String terminalId;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "EXAM_PurposeCode")
    protected String examPurposeCode;
    @XmlElement(name = "EXAM_ConstitutionCode")
    protected String examConstitutionCode;
    @XmlElement(name = "EXAM_WatchListSupVId")
    protected String examWatchListSupVId;
    @XmlElement(name = "EXAM_WatchListStatus")
    protected String examWatchListStatus;
    @XmlElement(name = "EXAM_PmtDtls")
    protected EXAMPmtDtlsType examPmtDtls;
    @XmlElement(name = "PmtStatusCode")
    protected String pmtStatusCode;
    @XmlElement(name = "EXAM_PmtMode")
    protected String examPmtMode;
    @XmlElement(name = "EXAM_SectorCode")
    protected String examSectorCode;
    @XmlElement(name = "EXAM_RelationshipCode")
    protected String examRelationshipCode;
    @XmlElement(name = "EXAM_ExtAcctInd")
    protected String examExtAcctInd;
    @XmlElement(name = "EXAM_BNMRefNo")
    protected String exambnmRefNo;
    @XmlElement(name = "EXAM_RateInfo")
    protected EXAMRateInfoType examRateInfo;
    @XmlElement(name = "EXAM_LastMaintDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar examLastMaintDt;
    @XmlElement(name = "EXAM_DisplayUnits")
    protected String examDisplayUnits;
    @XmlElement(name = "EXAM_CurrencySuspInd")
    protected String examCurrencySuspInd;
    @XmlElement(name = "EXAM_ConvUnits")
    protected String examConvUnits;
    @XmlElement(name = "CurCode")
    protected String curCode;
    @XmlElement(name = "EXAM_QuoteCurCode")
    protected String examQuoteCurCode;
    @XmlElement(name = "EXAM_Denomination")
    protected String examDenomination;
    @XmlElement(name = "EXAM_QuoteType")
    protected String examQuoteType;

    /**
     * Gets the value of the bankId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankId() {
        return bankId;
    }

    /**
     * Sets the value of the bankId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankId(String value) {
        this.bankId = value;
    }

    /**
     * Gets the value of the examFromAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurAmtType }
     *     
     */
    public CurAmtType getEXAMFromAmt() {
        return examFromAmt;
    }

    /**
     * Sets the value of the examFromAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmtType }
     *     
     */
    public void setEXAMFromAmt(CurAmtType value) {
        this.examFromAmt = value;
    }

    /**
     * Gets the value of the examToAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurAmtType }
     *     
     */
    public CurAmtType getEXAMToAmt() {
        return examToAmt;
    }

    /**
     * Sets the value of the examToAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmtType }
     *     
     */
    public void setEXAMToAmt(CurAmtType value) {
        this.examToAmt = value;
    }

    /**
     * Gets the value of the examBaseCurCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBaseCurCode() {
        return examBaseCurCode;
    }

    /**
     * Sets the value of the examBaseCurCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBaseCurCode(String value) {
        this.examBaseCurCode = value;
    }

    /**
     * Gets the value of the examBaseEquAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurAmtType }
     *     
     */
    public CurAmtType getEXAMBaseEquAmt() {
        return examBaseEquAmt;
    }

    /**
     * Sets the value of the examBaseEquAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmtType }
     *     
     */
    public void setEXAMBaseEquAmt(CurAmtType value) {
        this.examBaseEquAmt = value;
    }

    /**
     * Gets the value of the forExRateDealType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForExRateDealType() {
        return forExRateDealType;
    }

    /**
     * Sets the value of the forExRateDealType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForExRateDealType(String value) {
        this.forExRateDealType = value;
    }

    /**
     * Gets the value of the examForExQuoteType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMForExQuoteType() {
        return examForExQuoteType;
    }

    /**
     * Sets the value of the examForExQuoteType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMForExQuoteType(String value) {
        this.examForExQuoteType = value;
    }

    /**
     * Gets the value of the curRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurRate() {
        return curRate;
    }

    /**
     * Sets the value of the curRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurRate(BigDecimal value) {
        this.curRate = value;
    }

    /**
     * Gets the value of the curConvertRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurConvertRule() {
        return curConvertRule;
    }

    /**
     * Sets the value of the curConvertRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurConvertRule(String value) {
        this.curConvertRule = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link FeeType }
     *     
     */
    public FeeType getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeType }
     *     
     */
    public void setFee(FeeType value) {
        this.fee = value;
    }

    /**
     * Gets the value of the expDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpDt() {
        return expDt;
    }

    /**
     * Sets the value of the expDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpDt(String value) {
        this.expDt = value;
    }

    /**
     * Gets the value of the examForExErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMForExErrorCode() {
        return examForExErrorCode;
    }

    /**
     * Sets the value of the examForExErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMForExErrorCode(String value) {
        this.examForExErrorCode = value;
    }

    /**
     * Gets the value of the examRegcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMRegcode() {
        return examRegcode;
    }

    /**
     * Sets the value of the examRegcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMRegcode(String value) {
        this.examRegcode = value;
    }

    /**
     * Gets the value of the examProdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMProdType() {
        return examProdType;
    }

    /**
     * Sets the value of the examProdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMProdType(String value) {
        this.examProdType = value;
    }

    /**
     * Gets the value of the examRateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMRateType() {
        return examRateType;
    }

    /**
     * Sets the value of the examRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMRateType(String value) {
        this.examRateType = value;
    }

    /**
     * Gets the value of the examRate1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMRate1() {
        return examRate1;
    }

    /**
     * Sets the value of the examRate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMRate1(BigDecimal value) {
        this.examRate1 = value;
    }

    /**
     * Gets the value of the examRate2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMRate2() {
        return examRate2;
    }

    /**
     * Sets the value of the examRate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMRate2(BigDecimal value) {
        this.examRate2 = value;
    }

    /**
     * Gets the value of the examRate3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMRate3() {
        return examRate3;
    }

    /**
     * Sets the value of the examRate3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMRate3(BigDecimal value) {
        this.examRate3 = value;
    }

    /**
     * Gets the value of the examMidvalueUSD property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMMidvalueUSD() {
        return examMidvalueUSD;
    }

    /**
     * Sets the value of the examMidvalueUSD property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMMidvalueUSD(BigDecimal value) {
        this.examMidvalueUSD = value;
    }

    /**
     * Gets the value of the examMidValueMYR property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMMidValueMYR() {
        return examMidValueMYR;
    }

    /**
     * Sets the value of the examMidValueMYR property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMMidValueMYR(BigDecimal value) {
        this.examMidValueMYR = value;
    }

    /**
     * Gets the value of the examIdentNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIdentNum() {
        return examIdentNum;
    }

    /**
     * Sets the value of the examIdentNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIdentNum(String value) {
        this.examIdentNum = value;
    }

    /**
     * Gets the value of the trnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTrnDt() {
        return trnDt;
    }

    /**
     * Sets the value of the trnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTrnDt(XMLGregorianCalendar value) {
        this.trnDt = value;
    }

    /**
     * Gets the value of the pmtType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtType() {
        return pmtType;
    }

    /**
     * Sets the value of the pmtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtType(String value) {
        this.pmtType = value;
    }

    /**
     * Gets the value of the examRemitterInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMRemitterInfoType }
     *     
     */
    public EXAMRemitterInfoType getEXAMRemitterInfo() {
        return examRemitterInfo;
    }

    /**
     * Sets the value of the examRemitterInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMRemitterInfoType }
     *     
     */
    public void setEXAMRemitterInfo(EXAMRemitterInfoType value) {
        this.examRemitterInfo = value;
    }

    /**
     * Gets the value of the examBeneInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMBeneInfoType }
     *     
     */
    public EXAMBeneInfoType getEXAMBeneInfo() {
        return examBeneInfo;
    }

    /**
     * Sets the value of the examBeneInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMBeneInfoType }
     *     
     */
    public void setEXAMBeneInfo(EXAMBeneInfoType value) {
        this.examBeneInfo = value;
    }

    /**
     * Gets the value of the examOperatorRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMOperatorRate() {
        return examOperatorRate;
    }

    /**
     * Sets the value of the examOperatorRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMOperatorRate(BigDecimal value) {
        this.examOperatorRate = value;
    }

    /**
     * Gets the value of the examCampaign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCampaign() {
        return examCampaign;
    }

    /**
     * Sets the value of the examCampaign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCampaign(String value) {
        this.examCampaign = value;
    }

    /**
     * Gets the value of the examFeeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMFeeType }
     *     
     */
    public EXAMFeeType getEXAMFeeInfo() {
        return examFeeInfo;
    }

    /**
     * Sets the value of the examFeeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMFeeType }
     *     
     */
    public void setEXAMFeeInfo(EXAMFeeType value) {
        this.examFeeInfo = value;
    }

    /**
     * Gets the value of the examTotalRemitAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMTotalRemitAmt() {
        return examTotalRemitAmt;
    }

    /**
     * Sets the value of the examTotalRemitAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMTotalRemitAmt(BigDecimal value) {
        this.examTotalRemitAmt = value;
    }

    /**
     * Gets the value of the examCorridorcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCorridorcode() {
        return examCorridorcode;
    }

    /**
     * Sets the value of the examCorridorcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCorridorcode(String value) {
        this.examCorridorcode = value;
    }

    /**
     * Gets the value of the examssTrnKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSSTrnKey() {
        return examssTrnKey;
    }

    /**
     * Sets the value of the examssTrnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSSTrnKey(String value) {
        this.examssTrnKey = value;
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

    /**
     * Gets the value of the terminalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalId() {
        return terminalId;
    }

    /**
     * Sets the value of the terminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalId(String value) {
        this.terminalId = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * Gets the value of the examPurposeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPurposeCode() {
        return examPurposeCode;
    }

    /**
     * Sets the value of the examPurposeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPurposeCode(String value) {
        this.examPurposeCode = value;
    }

    /**
     * Gets the value of the examConstitutionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMConstitutionCode() {
        return examConstitutionCode;
    }

    /**
     * Sets the value of the examConstitutionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMConstitutionCode(String value) {
        this.examConstitutionCode = value;
    }

    /**
     * Gets the value of the examWatchListSupVId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMWatchListSupVId() {
        return examWatchListSupVId;
    }

    /**
     * Sets the value of the examWatchListSupVId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMWatchListSupVId(String value) {
        this.examWatchListSupVId = value;
    }

    /**
     * Gets the value of the examWatchListStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMWatchListStatus() {
        return examWatchListStatus;
    }

    /**
     * Sets the value of the examWatchListStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMWatchListStatus(String value) {
        this.examWatchListStatus = value;
    }

    /**
     * Gets the value of the examPmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMPmtDtlsType }
     *     
     */
    public EXAMPmtDtlsType getEXAMPmtDtls() {
        return examPmtDtls;
    }

    /**
     * Sets the value of the examPmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMPmtDtlsType }
     *     
     */
    public void setEXAMPmtDtls(EXAMPmtDtlsType value) {
        this.examPmtDtls = value;
    }

    /**
     * Gets the value of the pmtStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtStatusCode() {
        return pmtStatusCode;
    }

    /**
     * Sets the value of the pmtStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtStatusCode(String value) {
        this.pmtStatusCode = value;
    }

    /**
     * Gets the value of the examPmtMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPmtMode() {
        return examPmtMode;
    }

    /**
     * Sets the value of the examPmtMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPmtMode(String value) {
        this.examPmtMode = value;
    }

    /**
     * Gets the value of the examSectorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSectorCode() {
        return examSectorCode;
    }

    /**
     * Sets the value of the examSectorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSectorCode(String value) {
        this.examSectorCode = value;
    }

    /**
     * Gets the value of the examRelationshipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMRelationshipCode() {
        return examRelationshipCode;
    }

    /**
     * Sets the value of the examRelationshipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMRelationshipCode(String value) {
        this.examRelationshipCode = value;
    }

    /**
     * Gets the value of the examExtAcctInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMExtAcctInd() {
        return examExtAcctInd;
    }

    /**
     * Sets the value of the examExtAcctInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMExtAcctInd(String value) {
        this.examExtAcctInd = value;
    }

    /**
     * Gets the value of the exambnmRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBNMRefNo() {
        return exambnmRefNo;
    }

    /**
     * Sets the value of the exambnmRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBNMRefNo(String value) {
        this.exambnmRefNo = value;
    }

    /**
     * Gets the value of the examRateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMRateInfoType }
     *     
     */
    public EXAMRateInfoType getEXAMRateInfo() {
        return examRateInfo;
    }

    /**
     * Sets the value of the examRateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMRateInfoType }
     *     
     */
    public void setEXAMRateInfo(EXAMRateInfoType value) {
        this.examRateInfo = value;
    }

    /**
     * Gets the value of the examLastMaintDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEXAMLastMaintDt() {
        return examLastMaintDt;
    }

    /**
     * Sets the value of the examLastMaintDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEXAMLastMaintDt(XMLGregorianCalendar value) {
        this.examLastMaintDt = value;
    }

    /**
     * Gets the value of the examDisplayUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMDisplayUnits() {
        return examDisplayUnits;
    }

    /**
     * Sets the value of the examDisplayUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMDisplayUnits(String value) {
        this.examDisplayUnits = value;
    }

    /**
     * Gets the value of the examCurrencySuspInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCurrencySuspInd() {
        return examCurrencySuspInd;
    }

    /**
     * Sets the value of the examCurrencySuspInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCurrencySuspInd(String value) {
        this.examCurrencySuspInd = value;
    }

    /**
     * Gets the value of the examConvUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMConvUnits() {
        return examConvUnits;
    }

    /**
     * Sets the value of the examConvUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMConvUnits(String value) {
        this.examConvUnits = value;
    }

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
     * Gets the value of the examQuoteCurCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMQuoteCurCode() {
        return examQuoteCurCode;
    }

    /**
     * Sets the value of the examQuoteCurCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMQuoteCurCode(String value) {
        this.examQuoteCurCode = value;
    }

    /**
     * Gets the value of the examDenomination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMDenomination() {
        return examDenomination;
    }

    /**
     * Sets the value of the examDenomination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMDenomination(String value) {
        this.examDenomination = value;
    }

    /**
     * Gets the value of the examQuoteType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMQuoteType() {
        return examQuoteType;
    }

    /**
     * Sets the value of the examQuoteType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMQuoteType(String value) {
        this.examQuoteType = value;
    }

}
