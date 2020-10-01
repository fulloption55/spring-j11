
package com.theerut.springj11.client.webservice.accountsummary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXAM_AcctClosingInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_AcctClosingInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ChargeCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CurrencyCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MinChargeAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MaxChargeAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CounterLimit" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_FieldValue" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BucketRef" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_AcctClosingInfo_Type", propOrder = {
    "examChargeCode",
    "examCurrencyCode",
    "examMinChargeAmt",
    "examMaxChargeAmt",
    "examCounterLimit",
    "examFieldValue",
    "examBucketRef"
})
public class EXAMAcctClosingInfoType {

    @XmlElement(name = "EXAM_ChargeCode")
    protected String examChargeCode;
    @XmlElement(name = "EXAM_CurrencyCode")
    protected String examCurrencyCode;
    @XmlElement(name = "EXAM_MinChargeAmt")
    protected String examMinChargeAmt;
    @XmlElement(name = "EXAM_MaxChargeAmt")
    protected String examMaxChargeAmt;
    @XmlElement(name = "EXAM_CounterLimit")
    protected String examCounterLimit;
    @XmlElement(name = "EXAM_FieldValue")
    protected String examFieldValue;
    @XmlElement(name = "EXAM_BucketRef")
    protected String examBucketRef;

    /**
     * Gets the value of the examChargeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMChargeCode() {
        return examChargeCode;
    }

    /**
     * Sets the value of the examChargeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMChargeCode(String value) {
        this.examChargeCode = value;
    }

    /**
     * Gets the value of the examCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCurrencyCode() {
        return examCurrencyCode;
    }

    /**
     * Sets the value of the examCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCurrencyCode(String value) {
        this.examCurrencyCode = value;
    }

    /**
     * Gets the value of the examMinChargeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMinChargeAmt() {
        return examMinChargeAmt;
    }

    /**
     * Sets the value of the examMinChargeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMinChargeAmt(String value) {
        this.examMinChargeAmt = value;
    }

    /**
     * Gets the value of the examMaxChargeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMaxChargeAmt() {
        return examMaxChargeAmt;
    }

    /**
     * Sets the value of the examMaxChargeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMaxChargeAmt(String value) {
        this.examMaxChargeAmt = value;
    }

    /**
     * Gets the value of the examCounterLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCounterLimit() {
        return examCounterLimit;
    }

    /**
     * Sets the value of the examCounterLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCounterLimit(String value) {
        this.examCounterLimit = value;
    }

    /**
     * Gets the value of the examFieldValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMFieldValue() {
        return examFieldValue;
    }

    /**
     * Sets the value of the examFieldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMFieldValue(String value) {
        this.examFieldValue = value;
    }

    /**
     * Gets the value of the examBucketRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBucketRef() {
        return examBucketRef;
    }

    /**
     * Sets the value of the examBucketRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBucketRef(String value) {
        this.examBucketRef = value;
    }

}
