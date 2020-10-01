
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXAM_GenericIdentification_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_GenericIdentification_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EXAM_Id" type="{urn:ifxforum-org:XSD:1}EXAM_Id_Type"/>
 *         &lt;element name="EXAM_IdTp" type="{urn:ifxforum-org:XSD:1}OpenEnum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Country" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_GenericIdentification_Type", propOrder = {
    "examId",
    "examIdTp",
    "country"
})
public class EXAMGenericIdentificationType {

    @XmlElement(name = "EXAM_Id", required = true)
    protected String examId;
    @XmlElement(name = "EXAM_IdTp")
    protected String examIdTp;
    @XmlElement(name = "Country")
    protected String country;

    /**
     * Gets the value of the examId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMId() {
        return examId;
    }

    /**
     * Sets the value of the examId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMId(String value) {
        this.examId = value;
    }

    /**
     * Gets the value of the examIdTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIdTp() {
        return examIdTp;
    }

    /**
     * Sets the value of the examIdTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIdTp(String value) {
        this.examIdTp = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

}
