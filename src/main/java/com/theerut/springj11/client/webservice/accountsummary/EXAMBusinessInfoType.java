
package com.theerut.springj11.client.webservice.accountsummary;

import com.theerut.springj11.utils.LocalDateAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;


/**
 * <p>Java class for EXAM_BusinessInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_BusinessInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IsFamilyOwned" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BusinessSize" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IsAddProof" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ComplexCompStruc" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IsPayTax" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IsCashIncome" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PoliticalRelationship" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EstAssetVal" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IsDocProof" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ReturnedMailAssess" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IsNonProfitOrg" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EmployerName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IncomeRange" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_StrategicBusinessUnit" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EmploymentStartDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastMaintUID" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastMaintTm" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_BusinessInfo_Type", propOrder = {
    "examIsFamilyOwned",
    "examBusinessSize",
    "examIsAddProof",
    "examComplexCompStruc",
    "examIsPayTax",
    "examIsCashIncome",
    "examPoliticalRelationship",
    "examEstAssetVal",
    "examIsDocProof",
    "examReturnedMailAssess",
    "examIsNonProfitOrg",
    "examEmployerName",
    "examIncomeRange",
    "examStrategicBusinessUnit",
    "examEmploymentStartDt",
    "examLastMaintUID",
    "examLastMaintTm"
})
public class EXAMBusinessInfoType {

    @XmlElement(name = "EXAM_IsFamilyOwned")
    protected String examIsFamilyOwned;
    @XmlElement(name = "EXAM_BusinessSize")
    protected String examBusinessSize;
    @XmlElement(name = "EXAM_IsAddProof")
    protected String examIsAddProof;
    @XmlElement(name = "EXAM_ComplexCompStruc")
    protected String examComplexCompStruc;
    @XmlElement(name = "EXAM_IsPayTax")
    protected String examIsPayTax;
    @XmlElement(name = "EXAM_IsCashIncome")
    protected String examIsCashIncome;
    @XmlElement(name = "EXAM_PoliticalRelationship")
    protected String examPoliticalRelationship;
    @XmlElement(name = "EXAM_EstAssetVal")
    protected String examEstAssetVal;
    @XmlElement(name = "EXAM_IsDocProof")
    protected String examIsDocProof;
    @XmlElement(name = "EXAM_ReturnedMailAssess")
    protected String examReturnedMailAssess;
    @XmlElement(name = "EXAM_IsNonProfitOrg")
    protected String examIsNonProfitOrg;
    @XmlElement(name = "EXAM_EmployerName")
    protected String examEmployerName;
    @XmlElement(name = "EXAM_IncomeRange")
    protected String examIncomeRange;
    @XmlElement(name = "EXAM_StrategicBusinessUnit")
    protected String examStrategicBusinessUnit;
    @XmlElement(name = "EXAM_EmploymentStartDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examEmploymentStartDt;
    @XmlElement(name = "EXAM_LastMaintUID")
    protected String examLastMaintUID;
    @XmlElement(name = "EXAM_LastMaintTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar examLastMaintTm;

    /**
     * Gets the value of the examIsFamilyOwned property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIsFamilyOwned() {
        return examIsFamilyOwned;
    }

    /**
     * Sets the value of the examIsFamilyOwned property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIsFamilyOwned(String value) {
        this.examIsFamilyOwned = value;
    }

    /**
     * Gets the value of the examBusinessSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBusinessSize() {
        return examBusinessSize;
    }

    /**
     * Sets the value of the examBusinessSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBusinessSize(String value) {
        this.examBusinessSize = value;
    }

    /**
     * Gets the value of the examIsAddProof property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIsAddProof() {
        return examIsAddProof;
    }

    /**
     * Sets the value of the examIsAddProof property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIsAddProof(String value) {
        this.examIsAddProof = value;
    }

    /**
     * Gets the value of the examComplexCompStruc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMComplexCompStruc() {
        return examComplexCompStruc;
    }

    /**
     * Sets the value of the examComplexCompStruc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMComplexCompStruc(String value) {
        this.examComplexCompStruc = value;
    }

    /**
     * Gets the value of the examIsPayTax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIsPayTax() {
        return examIsPayTax;
    }

    /**
     * Sets the value of the examIsPayTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIsPayTax(String value) {
        this.examIsPayTax = value;
    }

    /**
     * Gets the value of the examIsCashIncome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIsCashIncome() {
        return examIsCashIncome;
    }

    /**
     * Sets the value of the examIsCashIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIsCashIncome(String value) {
        this.examIsCashIncome = value;
    }

    /**
     * Gets the value of the examPoliticalRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPoliticalRelationship() {
        return examPoliticalRelationship;
    }

    /**
     * Sets the value of the examPoliticalRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPoliticalRelationship(String value) {
        this.examPoliticalRelationship = value;
    }

    /**
     * Gets the value of the examEstAssetVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMEstAssetVal() {
        return examEstAssetVal;
    }

    /**
     * Sets the value of the examEstAssetVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEstAssetVal(String value) {
        this.examEstAssetVal = value;
    }

    /**
     * Gets the value of the examIsDocProof property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIsDocProof() {
        return examIsDocProof;
    }

    /**
     * Sets the value of the examIsDocProof property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIsDocProof(String value) {
        this.examIsDocProof = value;
    }

    /**
     * Gets the value of the examReturnedMailAssess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMReturnedMailAssess() {
        return examReturnedMailAssess;
    }

    /**
     * Sets the value of the examReturnedMailAssess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMReturnedMailAssess(String value) {
        this.examReturnedMailAssess = value;
    }

    /**
     * Gets the value of the examIsNonProfitOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIsNonProfitOrg() {
        return examIsNonProfitOrg;
    }

    /**
     * Sets the value of the examIsNonProfitOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIsNonProfitOrg(String value) {
        this.examIsNonProfitOrg = value;
    }

    /**
     * Gets the value of the examEmployerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMEmployerName() {
        return examEmployerName;
    }

    /**
     * Sets the value of the examEmployerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEmployerName(String value) {
        this.examEmployerName = value;
    }

    /**
     * Gets the value of the examIncomeRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIncomeRange() {
        return examIncomeRange;
    }

    /**
     * Sets the value of the examIncomeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIncomeRange(String value) {
        this.examIncomeRange = value;
    }

    /**
     * Gets the value of the examStrategicBusinessUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMStrategicBusinessUnit() {
        return examStrategicBusinessUnit;
    }

    /**
     * Sets the value of the examStrategicBusinessUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMStrategicBusinessUnit(String value) {
        this.examStrategicBusinessUnit = value;
    }

    /**
     * Gets the value of the examEmploymentStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMEmploymentStartDt() {
        return examEmploymentStartDt;
    }

    /**
     * Sets the value of the examEmploymentStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEmploymentStartDt(LocalDate value) {
        this.examEmploymentStartDt = value;
    }

    /**
     * Gets the value of the examLastMaintUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMLastMaintUID() {
        return examLastMaintUID;
    }

    /**
     * Sets the value of the examLastMaintUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMLastMaintUID(String value) {
        this.examLastMaintUID = value;
    }

    /**
     * Gets the value of the examLastMaintTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEXAMLastMaintTm() {
        return examLastMaintTm;
    }

    /**
     * Sets the value of the examLastMaintTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEXAMLastMaintTm(XMLGregorianCalendar value) {
        this.examLastMaintTm = value;
    }

}
