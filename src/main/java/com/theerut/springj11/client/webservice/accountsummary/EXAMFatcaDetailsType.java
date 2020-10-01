
package com.theerut.springj11.client.webservice.accountsummary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXAM_FatcaDetails_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_FatcaDetails_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Document" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_FatcaDetails_Type", propOrder = {
    "examDocument"
})
public class EXAMFatcaDetailsType {

    @XmlElement(name = "EXAM_Document")
    protected EXAMDocumentType examDocument;

    /**
     * Gets the value of the examDocument property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMDocumentType }
     *     
     */
    public EXAMDocumentType getEXAMDocument() {
        return examDocument;
    }

    /**
     * Sets the value of the examDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMDocumentType }
     *     
     */
    public void setEXAMDocument(EXAMDocumentType value) {
        this.examDocument = value;
    }

}
