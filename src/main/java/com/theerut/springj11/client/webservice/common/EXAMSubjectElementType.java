
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXAM_SubjectElement_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_SubjectElement_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Path"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Value" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_SubjectElement_Type", propOrder = {
    "examPath",
    "examValue"
})
public class EXAMSubjectElementType {

    @XmlElement(name = "EXAM_Path", required = true)
    protected String examPath;
    @XmlElement(name = "EXAM_Value")
    protected String examValue;

    /**
     * Gets the value of the examPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPath() {
        return examPath;
    }

    /**
     * Sets the value of the examPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPath(String value) {
        this.examPath = value;
    }

    /**
     * Gets the value of the examValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMValue() {
        return examValue;
    }

    /**
     * Sets the value of the examValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMValue(String value) {
        this.examValue = value;
    }

}
