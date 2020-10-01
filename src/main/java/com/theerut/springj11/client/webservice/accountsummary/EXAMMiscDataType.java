
package com.theerut.springj11.client.webservice.accountsummary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXAM_MiscData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_MiscData_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MiscText" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MiscType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_MiscData_Type", propOrder = {
    "examMiscText",
    "examMiscType"
})
public class EXAMMiscDataType {

    @XmlElement(name = "EXAM_MiscText")
    protected String examMiscText;
    @XmlElement(name = "EXAM_MiscType")
    protected String examMiscType;

    /**
     * Gets the value of the examMiscText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMiscText() {
        return examMiscText;
    }

    /**
     * Sets the value of the examMiscText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMiscText(String value) {
        this.examMiscText = value;
    }

    /**
     * Gets the value of the examMiscType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMiscType() {
        return examMiscType;
    }

    /**
     * Sets the value of the examMiscType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMiscType(String value) {
        this.examMiscType = value;
    }

}
