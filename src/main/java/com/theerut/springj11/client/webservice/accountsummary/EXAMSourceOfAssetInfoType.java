
package com.theerut.springj11.client.webservice.accountsummary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXAM_SourceOfAssetInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_SourceOfAssetInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SourceOfAsst" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Remarks" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_UserCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_SourceOfAssetInfo_Type", propOrder = {
    "examSourceOfAsst",
    "examRemarks",
    "examUserCode"
})
public class EXAMSourceOfAssetInfoType {

    @XmlElement(name = "EXAM_SourceOfAsst")
    protected String examSourceOfAsst;
    @XmlElement(name = "EXAM_Remarks")
    protected String examRemarks;
    @XmlElement(name = "EXAM_UserCode")
    protected String examUserCode;

    /**
     * Gets the value of the examSourceOfAsst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSourceOfAsst() {
        return examSourceOfAsst;
    }

    /**
     * Sets the value of the examSourceOfAsst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSourceOfAsst(String value) {
        this.examSourceOfAsst = value;
    }

    /**
     * Gets the value of the examRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMRemarks() {
        return examRemarks;
    }

    /**
     * Sets the value of the examRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMRemarks(String value) {
        this.examRemarks = value;
    }

    /**
     * Gets the value of the examUserCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMUserCode() {
        return examUserCode;
    }

    /**
     * Sets the value of the examUserCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMUserCode(String value) {
        this.examUserCode = value;
    }

}
