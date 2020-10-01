
package com.theerut.springj11.client.webservice.accountsummary;

import com.theerut.springj11.client.webservice.common.EXAMAmtType;
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
 * <p>Java class for EXAM_CardAcctInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_CardAcctInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DueDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastPmtDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastSmtDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastPmtAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BlockCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ClicksVWInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ClicksPmtInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OrgNo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OrgType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AlertFlag" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CardSummInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EXAM_PlasticCardIssued" type="{urn:ifxforum-org:XSD:1}Boolean" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustPermId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CorpCustOrgNo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CorpCustPermId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BlockDate" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AltBlockCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AltBlockDate" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ControlAcctId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CreditLimit" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PlasticCardFlag" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OutStdBal" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PlasticCardStatus" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustomerName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OpenDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}LastTrnDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CorpInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastDebDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ConsolAcctId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastCreDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Amt" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Billday" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MiscData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ReachUsDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PastDueDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AltCustOrgNo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AltCustPermId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SupCustOrgNo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SupCustPermId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CreditSign" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OutstandingSign" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Overseas" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ExpDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CreditCardExpDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BankAcctStatus"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MaturityDt"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Rate"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_InstAmt"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OriginalTenure"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CashliteAmt"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PlanStatus"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PlanNumber"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CurrentStatementDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MinPaymentDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CardBonus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_CardAcctInfo_Type", propOrder = {
    "dueDt",
    "examLastPmtDt",
    "examLastSmtDt",
    "examLastPmtAmt",
    "examBlockCode",
    "examClicksVWInd",
    "examClicksPmtInd",
    "examOrgNo",
    "examOrgType",
    "examAlertFlag",
    "examCardSummInfo",
    "examPlasticCardIssued",
    "acctId",
    "custPermId",
    "examCorpCustOrgNo",
    "examCorpCustPermId",
    "examBlockDate",
    "examAltBlockCode",
    "examAltBlockDate",
    "examControlAcctId",
    "examCreditLimit",
    "examPlasticCardFlag",
    "examOutStdBal",
    "examPlasticCardStatus",
    "examCustomerName",
    "openDt",
    "lastTrnDt",
    "examCorpInd",
    "examLastDebDt",
    "examConsolAcctId",
    "examLastCreDt",
    "examAmt",
    "examBillday",
    "examMiscData",
    "examReachUsDt",
    "examPastDueDt",
    "examAltCustOrgNo",
    "examAltCustPermId",
    "examSupCustOrgNo",
    "examSupCustPermId",
    "examCreditSign",
    "examOutstandingSign",
    "examOverseas",
    "examExpDt",
    "examCreditCardExpDt",
    "bankAcctStatus",
    "examMaturityDt",
    "rate",
    "examInstAmt",
    "examOriginalTenure",
    "examCashliteAmt",
    "examPlanStatus",
    "examPlanNumber",
    "examCurrentStatementDt",
    "examMinPaymentDt",
    "examCardBonus"
})
public class EXAMCardAcctInfoType {

    @XmlElement(name = "DueDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dueDt;
    @XmlElement(name = "EXAM_LastPmtDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examLastPmtDt;
    @XmlElement(name = "EXAM_LastSmtDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examLastSmtDt;
    @XmlElement(name = "EXAM_LastPmtAmt")
    protected BigDecimal examLastPmtAmt;
    @XmlElement(name = "EXAM_BlockCode")
    protected String examBlockCode;
    @XmlElement(name = "EXAM_ClicksVWInd")
    protected String examClicksVWInd;
    @XmlElement(name = "EXAM_ClicksPmtInd")
    protected String examClicksPmtInd;
    @XmlElement(name = "EXAM_OrgNo")
    protected String examOrgNo;
    @XmlElement(name = "EXAM_OrgType")
    protected String examOrgType;
    @XmlElement(name = "EXAM_AlertFlag")
    protected String examAlertFlag;
    @XmlElement(name = "EXAM_CardSummInfo")
    protected List<EXAMCardSummInfoType> examCardSummInfo;
    @XmlElement(name = "EXAM_PlasticCardIssued")
    protected String examPlasticCardIssued;
    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "CustPermId")
    protected String custPermId;
    @XmlElement(name = "EXAM_CorpCustOrgNo")
    protected String examCorpCustOrgNo;
    @XmlElement(name = "EXAM_CorpCustPermId")
    protected String examCorpCustPermId;
    @XmlElement(name = "EXAM_BlockDate", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examBlockDate;
    @XmlElement(name = "EXAM_AltBlockCode")
    protected String examAltBlockCode;
    @XmlElement(name = "EXAM_AltBlockDate", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examAltBlockDate;
    @XmlElement(name = "EXAM_ControlAcctId")
    protected String examControlAcctId;
    @XmlElement(name = "EXAM_CreditLimit")
    protected BigDecimal examCreditLimit;
    @XmlElement(name = "EXAM_PlasticCardFlag")
    protected String examPlasticCardFlag;
    @XmlElement(name = "EXAM_OutStdBal")
    protected String examOutStdBal;
    @XmlElement(name = "EXAM_PlasticCardStatus")
    protected String examPlasticCardStatus;
    @XmlElement(name = "EXAM_CustomerName")
    protected String examCustomerName;
    @XmlElement(name = "OpenDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate openDt;
    @XmlElement(name = "LastTrnDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate lastTrnDt;
    @XmlElement(name = "EXAM_CorpInd")
    protected String examCorpInd;
    @XmlElement(name = "EXAM_LastDebDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examLastDebDt;
    @XmlElement(name = "EXAM_ConsolAcctId")
    protected String examConsolAcctId;
    @XmlElement(name = "EXAM_LastCreDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examLastCreDt;
    @XmlElement(name = "EXAM_Amt")
    protected List<EXAMAmtType> examAmt;
    @XmlElement(name = "EXAM_Billday")
    protected String examBillday;
    @XmlElement(name = "EXAM_MiscData")
    protected List<EXAMMiscDataType> examMiscData;
    @XmlElement(name = "EXAM_ReachUsDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examReachUsDt;
    @XmlElement(name = "EXAM_PastDueDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examPastDueDt;
    @XmlElement(name = "EXAM_AltCustOrgNo")
    protected String examAltCustOrgNo;
    @XmlElement(name = "EXAM_AltCustPermId")
    protected String examAltCustPermId;
    @XmlElement(name = "EXAM_SupCustOrgNo")
    protected String examSupCustOrgNo;
    @XmlElement(name = "EXAM_SupCustPermId")
    protected String examSupCustPermId;
    @XmlElement(name = "EXAM_CreditSign")
    protected String examCreditSign;
    @XmlElement(name = "EXAM_OutstandingSign")
    protected String examOutstandingSign;
    @XmlElement(name = "EXAM_Overseas")
    protected List<EXAMOverseasType> examOverseas;
    @XmlElement(name = "EXAM_ExpDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examExpDt;
    @XmlElement(name = "EXAM_CreditCardExpDt")
    protected String examCreditCardExpDt;
    @XmlElement(name = "BankAcctStatus", required = true)
    protected BankAcctStatusType bankAcctStatus;
    @XmlElement(name = "EXAM_MaturityDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examMaturityDt;
    @XmlElement(name = "Rate", required = true)
    protected BigDecimal rate;
    @XmlElement(name = "EXAM_InstAmt", required = true)
    protected BigDecimal examInstAmt;
    @XmlElement(name = "EXAM_OriginalTenure", required = true)
    protected String examOriginalTenure;
    @XmlElement(name = "EXAM_CashliteAmt", required = true)
    protected String examCashliteAmt;
    @XmlElement(name = "EXAM_PlanStatus", required = true)
    protected String examPlanStatus;
    @XmlElement(name = "EXAM_PlanNumber", required = true)
    protected String examPlanNumber;
    @XmlElement(name = "EXAM_CurrentStatementDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examCurrentStatementDt;
    @XmlElement(name = "EXAM_MinPaymentDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examMinPaymentDt;
    @XmlElement(name = "EXAM_CardBonus")
    protected EXAMCardBonusType examCardBonus;

    /**
     * Gets the value of the dueDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDueDt() {
        return dueDt;
    }

    /**
     * Sets the value of the dueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDt(LocalDate value) {
        this.dueDt = value;
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
     * Gets the value of the examLastSmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMLastSmtDt() {
        return examLastSmtDt;
    }

    /**
     * Sets the value of the examLastSmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMLastSmtDt(LocalDate value) {
        this.examLastSmtDt = value;
    }

    /**
     * Gets the value of the examLastPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMLastPmtAmt() {
        return examLastPmtAmt;
    }

    /**
     * Sets the value of the examLastPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMLastPmtAmt(BigDecimal value) {
        this.examLastPmtAmt = value;
    }

    /**
     * Gets the value of the examBlockCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBlockCode() {
        return examBlockCode;
    }

    /**
     * Sets the value of the examBlockCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBlockCode(String value) {
        this.examBlockCode = value;
    }

    /**
     * Gets the value of the examClicksVWInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMClicksVWInd() {
        return examClicksVWInd;
    }

    /**
     * Sets the value of the examClicksVWInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMClicksVWInd(String value) {
        this.examClicksVWInd = value;
    }

    /**
     * Gets the value of the examClicksPmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMClicksPmtInd() {
        return examClicksPmtInd;
    }

    /**
     * Sets the value of the examClicksPmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMClicksPmtInd(String value) {
        this.examClicksPmtInd = value;
    }

    /**
     * Gets the value of the examOrgNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOrgNo() {
        return examOrgNo;
    }

    /**
     * Sets the value of the examOrgNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOrgNo(String value) {
        this.examOrgNo = value;
    }

    /**
     * Gets the value of the examOrgType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOrgType() {
        return examOrgType;
    }

    /**
     * Sets the value of the examOrgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOrgType(String value) {
        this.examOrgType = value;
    }

    /**
     * Gets the value of the examAlertFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMAlertFlag() {
        return examAlertFlag;
    }

    /**
     * Sets the value of the examAlertFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMAlertFlag(String value) {
        this.examAlertFlag = value;
    }

    /**
     * Gets the value of the examCardSummInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examCardSummInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMCardSummInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMCardSummInfoType }
     * 
     * 
     */
    public List<EXAMCardSummInfoType> getEXAMCardSummInfo() {
        if (examCardSummInfo == null) {
            examCardSummInfo = new ArrayList<>();
        }
        return this.examCardSummInfo;
    }

    /**
     * Gets the value of the examPlasticCardIssued property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPlasticCardIssued() {
        return examPlasticCardIssued;
    }

    /**
     * Sets the value of the examPlasticCardIssued property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPlasticCardIssued(String value) {
        this.examPlasticCardIssued = value;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctId(String value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the custPermId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustPermId() {
        return custPermId;
    }

    /**
     * Sets the value of the custPermId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustPermId(String value) {
        this.custPermId = value;
    }

    /**
     * Gets the value of the examCorpCustOrgNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCorpCustOrgNo() {
        return examCorpCustOrgNo;
    }

    /**
     * Sets the value of the examCorpCustOrgNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCorpCustOrgNo(String value) {
        this.examCorpCustOrgNo = value;
    }

    /**
     * Gets the value of the examCorpCustPermId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCorpCustPermId() {
        return examCorpCustPermId;
    }

    /**
     * Sets the value of the examCorpCustPermId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCorpCustPermId(String value) {
        this.examCorpCustPermId = value;
    }

    /**
     * Gets the value of the examBlockDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMBlockDate() {
        return examBlockDate;
    }

    /**
     * Sets the value of the examBlockDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBlockDate(LocalDate value) {
        this.examBlockDate = value;
    }

    /**
     * Gets the value of the examAltBlockCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMAltBlockCode() {
        return examAltBlockCode;
    }

    /**
     * Sets the value of the examAltBlockCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMAltBlockCode(String value) {
        this.examAltBlockCode = value;
    }

    /**
     * Gets the value of the examAltBlockDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMAltBlockDate() {
        return examAltBlockDate;
    }

    /**
     * Sets the value of the examAltBlockDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMAltBlockDate(LocalDate value) {
        this.examAltBlockDate = value;
    }

    /**
     * Gets the value of the examControlAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMControlAcctId() {
        return examControlAcctId;
    }

    /**
     * Sets the value of the examControlAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMControlAcctId(String value) {
        this.examControlAcctId = value;
    }

    /**
     * Gets the value of the examCreditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMCreditLimit() {
        return examCreditLimit;
    }

    /**
     * Sets the value of the examCreditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMCreditLimit(BigDecimal value) {
        this.examCreditLimit = value;
    }

    /**
     * Gets the value of the examPlasticCardFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPlasticCardFlag() {
        return examPlasticCardFlag;
    }

    /**
     * Sets the value of the examPlasticCardFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPlasticCardFlag(String value) {
        this.examPlasticCardFlag = value;
    }

    /**
     * Gets the value of the examOutStdBal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOutStdBal() {
        return examOutStdBal;
    }

    /**
     * Sets the value of the examOutStdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOutStdBal(String value) {
        this.examOutStdBal = value;
    }

    /**
     * Gets the value of the examPlasticCardStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPlasticCardStatus() {
        return examPlasticCardStatus;
    }

    /**
     * Sets the value of the examPlasticCardStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPlasticCardStatus(String value) {
        this.examPlasticCardStatus = value;
    }

    /**
     * Gets the value of the examCustomerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCustomerName() {
        return examCustomerName;
    }

    /**
     * Sets the value of the examCustomerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCustomerName(String value) {
        this.examCustomerName = value;
    }

    /**
     * Gets the value of the openDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getOpenDt() {
        return openDt;
    }

    /**
     * Sets the value of the openDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenDt(LocalDate value) {
        this.openDt = value;
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
     * Gets the value of the examCorpInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCorpInd() {
        return examCorpInd;
    }

    /**
     * Sets the value of the examCorpInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCorpInd(String value) {
        this.examCorpInd = value;
    }

    /**
     * Gets the value of the examLastDebDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMLastDebDt() {
        return examLastDebDt;
    }

    /**
     * Sets the value of the examLastDebDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMLastDebDt(LocalDate value) {
        this.examLastDebDt = value;
    }

    /**
     * Gets the value of the examConsolAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMConsolAcctId() {
        return examConsolAcctId;
    }

    /**
     * Sets the value of the examConsolAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMConsolAcctId(String value) {
        this.examConsolAcctId = value;
    }

    /**
     * Gets the value of the examLastCreDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMLastCreDt() {
        return examLastCreDt;
    }

    /**
     * Sets the value of the examLastCreDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMLastCreDt(LocalDate value) {
        this.examLastCreDt = value;
    }

    /**
     * Gets the value of the examAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMAmtType }
     * 
     * 
     */
    public List<EXAMAmtType> getEXAMAmt() {
        if (examAmt == null) {
            examAmt = new ArrayList<>();
        }
        return this.examAmt;
    }

    /**
     * Gets the value of the examBillday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBillday() {
        return examBillday;
    }

    /**
     * Sets the value of the examBillday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBillday(String value) {
        this.examBillday = value;
    }

    /**
     * Gets the value of the examMiscData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examMiscData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMMiscData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMMiscDataType }
     * 
     * 
     */
    public List<EXAMMiscDataType> getEXAMMiscData() {
        if (examMiscData == null) {
            examMiscData = new ArrayList<>();
        }
        return this.examMiscData;
    }

    /**
     * Gets the value of the examReachUsDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMReachUsDt() {
        return examReachUsDt;
    }

    /**
     * Sets the value of the examReachUsDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMReachUsDt(LocalDate value) {
        this.examReachUsDt = value;
    }

    /**
     * Gets the value of the examPastDueDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMPastDueDt() {
        return examPastDueDt;
    }

    /**
     * Sets the value of the examPastDueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPastDueDt(LocalDate value) {
        this.examPastDueDt = value;
    }

    /**
     * Gets the value of the examAltCustOrgNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMAltCustOrgNo() {
        return examAltCustOrgNo;
    }

    /**
     * Sets the value of the examAltCustOrgNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMAltCustOrgNo(String value) {
        this.examAltCustOrgNo = value;
    }

    /**
     * Gets the value of the examAltCustPermId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMAltCustPermId() {
        return examAltCustPermId;
    }

    /**
     * Sets the value of the examAltCustPermId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMAltCustPermId(String value) {
        this.examAltCustPermId = value;
    }

    /**
     * Gets the value of the examSupCustOrgNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSupCustOrgNo() {
        return examSupCustOrgNo;
    }

    /**
     * Sets the value of the examSupCustOrgNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSupCustOrgNo(String value) {
        this.examSupCustOrgNo = value;
    }

    /**
     * Gets the value of the examSupCustPermId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSupCustPermId() {
        return examSupCustPermId;
    }

    /**
     * Sets the value of the examSupCustPermId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSupCustPermId(String value) {
        this.examSupCustPermId = value;
    }

    /**
     * Gets the value of the examCreditSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCreditSign() {
        return examCreditSign;
    }

    /**
     * Sets the value of the examCreditSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCreditSign(String value) {
        this.examCreditSign = value;
    }

    /**
     * Gets the value of the examOutstandingSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOutstandingSign() {
        return examOutstandingSign;
    }

    /**
     * Sets the value of the examOutstandingSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOutstandingSign(String value) {
        this.examOutstandingSign = value;
    }

    /**
     * Gets the value of the examOverseas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examOverseas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMOverseas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMOverseasType }
     * 
     * 
     */
    public List<EXAMOverseasType> getEXAMOverseas() {
        if (examOverseas == null) {
            examOverseas = new ArrayList<>();
        }
        return this.examOverseas;
    }

    /**
     * Gets the value of the examExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMExpDt() {
        return examExpDt;
    }

    /**
     * Sets the value of the examExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMExpDt(LocalDate value) {
        this.examExpDt = value;
    }

    /**
     * Gets the value of the examCreditCardExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCreditCardExpDt() {
        return examCreditCardExpDt;
    }

    /**
     * Sets the value of the examCreditCardExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCreditCardExpDt(String value) {
        this.examCreditCardExpDt = value;
    }

    /**
     * Gets the value of the bankAcctStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BankAcctStatusType }
     *     
     */
    public BankAcctStatusType getBankAcctStatus() {
        return bankAcctStatus;
    }

    /**
     * Sets the value of the bankAcctStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAcctStatusType }
     *     
     */
    public void setBankAcctStatus(BankAcctStatusType value) {
        this.bankAcctStatus = value;
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
     * Gets the value of the examOriginalTenure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOriginalTenure() {
        return examOriginalTenure;
    }

    /**
     * Sets the value of the examOriginalTenure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOriginalTenure(String value) {
        this.examOriginalTenure = value;
    }

    /**
     * Gets the value of the examCashliteAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCashliteAmt() {
        return examCashliteAmt;
    }

    /**
     * Sets the value of the examCashliteAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCashliteAmt(String value) {
        this.examCashliteAmt = value;
    }

    /**
     * Gets the value of the examPlanStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPlanStatus() {
        return examPlanStatus;
    }

    /**
     * Sets the value of the examPlanStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPlanStatus(String value) {
        this.examPlanStatus = value;
    }

    /**
     * Gets the value of the examPlanNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPlanNumber() {
        return examPlanNumber;
    }

    /**
     * Sets the value of the examPlanNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPlanNumber(String value) {
        this.examPlanNumber = value;
    }

    /**
     * Gets the value of the examCurrentStatementDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMCurrentStatementDt() {
        return examCurrentStatementDt;
    }

    /**
     * Sets the value of the examCurrentStatementDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCurrentStatementDt(LocalDate value) {
        this.examCurrentStatementDt = value;
    }

    /**
     * Gets the value of the examMinPaymentDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMMinPaymentDt() {
        return examMinPaymentDt;
    }

    /**
     * Sets the value of the examMinPaymentDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMinPaymentDt(LocalDate value) {
        this.examMinPaymentDt = value;
    }

    /**
     * Gets the value of the examCardBonus property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMCardBonusType }
     *     
     */
    public EXAMCardBonusType getEXAMCardBonus() {
        return examCardBonus;
    }

    /**
     * Sets the value of the examCardBonus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMCardBonusType }
     *     
     */
    public void setEXAMCardBonus(EXAMCardBonusType value) {
        this.examCardBonus = value;
    }

}
