
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXAM_ErrorAttribute_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_ErrorAttribute_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EXAM_ErrorAttribute_Name" type="{urn:ifxforum-org:XSD:1}NC" minOccurs="0"/>
 *         &lt;element name="EXAM_ErrorAttribute_Value" type="{urn:ifxforum-org:XSD:1}NC" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_ErrorAttribute_Type", propOrder = {
    "examErrorAttributeName",
    "examErrorAttributeValue"
})
public class EXAMErrorAttributeType {

    @XmlElement(name = "EXAM_ErrorAttribute_Name")
    protected String examErrorAttributeName;
    @XmlElement(name = "EXAM_ErrorAttribute_Value")
    protected String examErrorAttributeValue;

    /**
     * Gets the value of the examErrorAttributeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMErrorAttributeName() {
        return examErrorAttributeName;
    }

    /**
     * Sets the value of the examErrorAttributeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMErrorAttributeName(String value) {
        this.examErrorAttributeName = value;
    }

    /**
     * Gets the value of the examErrorAttributeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMErrorAttributeValue() {
        return examErrorAttributeValue;
    }

    /**
     * Sets the value of the examErrorAttributeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMErrorAttributeValue(String value) {
        this.examErrorAttributeValue = value;
    }

}
