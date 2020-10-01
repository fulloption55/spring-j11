
package com.theerut.springj11.client.webservice.accountsummary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXAM_Blacklist_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_Blacklist_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BlacklistSrcType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BlacklistReasonCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BlacklistReasonDesc" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_Blacklist_Type", propOrder = {
    "examBlacklistSrcType",
    "examBlacklistReasonCode",
    "examBlacklistReasonDesc"
})
public class EXAMBlacklistType {

    @XmlElement(name = "EXAM_BlacklistSrcType")
    protected String examBlacklistSrcType;
    @XmlElement(name = "EXAM_BlacklistReasonCode")
    protected String examBlacklistReasonCode;
    @XmlElement(name = "EXAM_BlacklistReasonDesc")
    protected String examBlacklistReasonDesc;

    /**
     * Gets the value of the examBlacklistSrcType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBlacklistSrcType() {
        return examBlacklistSrcType;
    }

    /**
     * Sets the value of the examBlacklistSrcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBlacklistSrcType(String value) {
        this.examBlacklistSrcType = value;
    }

    /**
     * Gets the value of the examBlacklistReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBlacklistReasonCode() {
        return examBlacklistReasonCode;
    }

    /**
     * Sets the value of the examBlacklistReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBlacklistReasonCode(String value) {
        this.examBlacklistReasonCode = value;
    }

    /**
     * Gets the value of the examBlacklistReasonDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBlacklistReasonDesc() {
        return examBlacklistReasonDesc;
    }

    /**
     * Sets the value of the examBlacklistReasonDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBlacklistReasonDesc(String value) {
        this.examBlacklistReasonDesc = value;
    }

}
