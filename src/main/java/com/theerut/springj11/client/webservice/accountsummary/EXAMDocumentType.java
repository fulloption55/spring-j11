
package com.theerut.springj11.client.webservice.accountsummary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXAM_Document_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_Document_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DocumentNum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Name" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_Document_Type", propOrder = {
    "examDocumentNum",
    "name"
})
public class EXAMDocumentType {

    @XmlElement(name = "EXAM_DocumentNum")
    protected String examDocumentNum;
    @XmlElement(name = "Name")
    protected String name;

    /**
     * Gets the value of the examDocumentNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMDocumentNum() {
        return examDocumentNum;
    }

    /**
     * Sets the value of the examDocumentNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMDocumentNum(String value) {
        this.examDocumentNum = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
