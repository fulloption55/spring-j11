
package com.theerut.springj11.client.webservice.accountsummary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EXAM_CustLifeStyleInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_CustLifeStyleInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LifeStyInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_UserCd" minOccurs="0"/>
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
@XmlType(name = "EXAM_CustLifeStyleInfo_Type", propOrder = {
    "examLifeStyInd",
    "examUserCd",
    "examLastMaintUID",
    "examLastMaintTm"
})
public class EXAMCustLifeStyleInfoType {

    @XmlElement(name = "EXAM_LifeStyInd")
    protected String examLifeStyInd;
    @XmlElement(name = "EXAM_UserCd")
    protected String examUserCd;
    @XmlElement(name = "EXAM_LastMaintUID")
    protected String examLastMaintUID;
    @XmlElement(name = "EXAM_LastMaintTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar examLastMaintTm;

    /**
     * Gets the value of the examLifeStyInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMLifeStyInd() {
        return examLifeStyInd;
    }

    /**
     * Sets the value of the examLifeStyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMLifeStyInd(String value) {
        this.examLifeStyInd = value;
    }

    /**
     * Gets the value of the examUserCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMUserCd() {
        return examUserCd;
    }

    /**
     * Sets the value of the examUserCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMUserCd(String value) {
        this.examUserCd = value;
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
