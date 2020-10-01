
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXAM_ChargesList_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_ChargesList_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MiscChargeType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MiscChargeAmount" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MiscChargeCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OtherChargeType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OtherChargeAmount" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OtherChargeCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CapitalizeFeeImdFlag" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_ChargesList_Type", propOrder = {
    "examMiscChargeType",
    "examMiscChargeAmount",
    "examMiscChargeCode",
    "examOtherChargeType",
    "examOtherChargeAmount",
    "examOtherChargeCode",
    "examCapitalizeFeeImdFlag"
})
public class EXAMChargesListType {

    @XmlElement(name = "EXAM_MiscChargeType")
    protected String examMiscChargeType;
    @XmlElement(name = "EXAM_MiscChargeAmount")
    protected String examMiscChargeAmount;
    @XmlElement(name = "EXAM_MiscChargeCode")
    protected String examMiscChargeCode;
    @XmlElement(name = "EXAM_OtherChargeType")
    protected String examOtherChargeType;
    @XmlElement(name = "EXAM_OtherChargeAmount")
    protected String examOtherChargeAmount;
    @XmlElement(name = "EXAM_OtherChargeCode")
    protected String examOtherChargeCode;
    @XmlElement(name = "EXAM_CapitalizeFeeImdFlag")
    protected String examCapitalizeFeeImdFlag;

    /**
     * Gets the value of the examMiscChargeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMiscChargeType() {
        return examMiscChargeType;
    }

    /**
     * Sets the value of the examMiscChargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMiscChargeType(String value) {
        this.examMiscChargeType = value;
    }

    /**
     * Gets the value of the examMiscChargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMiscChargeAmount() {
        return examMiscChargeAmount;
    }

    /**
     * Sets the value of the examMiscChargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMiscChargeAmount(String value) {
        this.examMiscChargeAmount = value;
    }

    /**
     * Gets the value of the examMiscChargeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMiscChargeCode() {
        return examMiscChargeCode;
    }

    /**
     * Sets the value of the examMiscChargeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMiscChargeCode(String value) {
        this.examMiscChargeCode = value;
    }

    /**
     * Gets the value of the examOtherChargeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOtherChargeType() {
        return examOtherChargeType;
    }

    /**
     * Sets the value of the examOtherChargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOtherChargeType(String value) {
        this.examOtherChargeType = value;
    }

    /**
     * Gets the value of the examOtherChargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOtherChargeAmount() {
        return examOtherChargeAmount;
    }

    /**
     * Sets the value of the examOtherChargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOtherChargeAmount(String value) {
        this.examOtherChargeAmount = value;
    }

    /**
     * Gets the value of the examOtherChargeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOtherChargeCode() {
        return examOtherChargeCode;
    }

    /**
     * Sets the value of the examOtherChargeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOtherChargeCode(String value) {
        this.examOtherChargeCode = value;
    }

    /**
     * Gets the value of the examCapitalizeFeeImdFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCapitalizeFeeImdFlag() {
        return examCapitalizeFeeImdFlag;
    }

    /**
     * Sets the value of the examCapitalizeFeeImdFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCapitalizeFeeImdFlag(String value) {
        this.examCapitalizeFeeImdFlag = value;
    }

}
