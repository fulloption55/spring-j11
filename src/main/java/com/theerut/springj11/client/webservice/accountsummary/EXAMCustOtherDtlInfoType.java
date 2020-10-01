
package com.theerut.springj11.client.webservice.accountsummary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXAM_CustOtherDtlInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_CustOtherDtlInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OtherNameType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SeqNum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OtherName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Remarks" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastMaintUID" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastMaintTmStamp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_CustOtherDtlInfo_Type", propOrder = {
    "examOtherNameType",
    "examSeqNum",
    "examOtherName",
    "examRemarks",
    "examLastMaintUID",
    "examLastMaintTmStamp"
})
public class EXAMCustOtherDtlInfoType {

    @XmlElement(name = "EXAM_OtherNameType")
    protected String examOtherNameType;
    @XmlElement(name = "EXAM_SeqNum")
    protected Long examSeqNum;
    @XmlElement(name = "EXAM_OtherName")
    protected String examOtherName;
    @XmlElement(name = "EXAM_Remarks")
    protected String examRemarks;
    @XmlElement(name = "EXAM_LastMaintUID")
    protected String examLastMaintUID;
    @XmlElement(name = "EXAM_LastMaintTmStamp")
    protected String examLastMaintTmStamp;

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
     * Gets the value of the examSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEXAMSeqNum() {
        return examSeqNum;
    }

    /**
     * Sets the value of the examSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEXAMSeqNum(Long value) {
        this.examSeqNum = value;
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
     * Gets the value of the examLastMaintTmStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMLastMaintTmStamp() {
        return examLastMaintTmStamp;
    }

    /**
     * Sets the value of the examLastMaintTmStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMLastMaintTmStamp(String value) {
        this.examLastMaintTmStamp = value;
    }

}
