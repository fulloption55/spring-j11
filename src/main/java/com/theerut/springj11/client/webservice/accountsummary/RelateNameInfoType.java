
package com.theerut.springj11.client.webservice.accountsummary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelateNameInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelateNameInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OtherNameType"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OtherName"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Remarks"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NoOfRecords" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelateNameInfo_Type", propOrder = {
    "examOtherNameType",
    "examOtherName",
    "examRemarks",
    "examNoOfRecords"
})
public class RelateNameInfoType {

    @XmlElement(name = "EXAM_OtherNameType", required = true)
    protected String examOtherNameType;
    @XmlElement(name = "EXAM_OtherName", required = true)
    protected String examOtherName;
    @XmlElement(name = "EXAM_Remarks", required = true)
    protected String examRemarks;
    @XmlElement(name = "EXAM_NoOfRecords")
    protected String examNoOfRecords;

    /**
     * Gets the value of the examOtherNameType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOtherNameType() {
        return examOtherNameType;
    }

    /**
     * Sets the value of the examOtherNameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOtherNameType(String value) {
        this.examOtherNameType = value;
    }

    /**
     * Gets the value of the examOtherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOtherName() {
        return examOtherName;
    }

    /**
     * Sets the value of the examOtherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOtherName(String value) {
        this.examOtherName = value;
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
     * Gets the value of the examNoOfRecords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMNoOfRecords() {
        return examNoOfRecords;
    }

    /**
     * Sets the value of the examNoOfRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMNoOfRecords(String value) {
        this.examNoOfRecords = value;
    }

}
