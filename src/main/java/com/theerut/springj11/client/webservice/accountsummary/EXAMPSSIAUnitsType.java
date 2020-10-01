
package com.theerut.springj11.client.webservice.accountsummary;

import com.theerut.springj11.utils.LocalDateAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.time.LocalDate;


/**
 * <p>Java class for EXAM_PSSIAUnits_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_PSSIAUnits_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Type" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Count" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MeasurementUnit" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_InvestAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BankAcctStatus" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MaturityDt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_PSSIAUnits_Type", propOrder = {
    "examType",
    "examCount",
    "examMeasurementUnit",
    "examInvestAmt",
    "bankAcctStatus",
    "examMaturityDt"
})
public class EXAMPSSIAUnitsType {

    @XmlElement(name = "EXAM_Type")
    protected String examType;
    @XmlElement(name = "EXAM_Count")
    protected BigDecimal examCount;
    @XmlElement(name = "EXAM_MeasurementUnit")
    protected String examMeasurementUnit;
    @XmlElement(name = "EXAM_InvestAmt")
    protected BigDecimal examInvestAmt;
    @XmlElement(name = "BankAcctStatus")
    protected BankAcctStatusType bankAcctStatus;
    @XmlElement(name = "EXAM_MaturityDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examMaturityDt;

    /**
     * Gets the value of the examType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMType() {
        return examType;
    }

    /**
     * Sets the value of the examType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMType(String value) {
        this.examType = value;
    }

    /**
     * Gets the value of the examCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMCount() {
        return examCount;
    }

    /**
     * Sets the value of the examCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMCount(BigDecimal value) {
        this.examCount = value;
    }

    /**
     * Gets the value of the examMeasurementUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMeasurementUnit() {
        return examMeasurementUnit;
    }

    /**
     * Sets the value of the examMeasurementUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMeasurementUnit(String value) {
        this.examMeasurementUnit = value;
    }

    /**
     * Gets the value of the examInvestAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMInvestAmt() {
        return examInvestAmt;
    }

    /**
     * Sets the value of the examInvestAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMInvestAmt(BigDecimal value) {
        this.examInvestAmt = value;
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

}
