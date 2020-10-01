
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXAM_SignonRq_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_SignonRq_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}SignonRq_Type">
 *       &lt;sequence>
 *         &lt;element name="EXAM_HeaderRq" type="{urn:ifxforum-org:XSD:1}EXAM_Header_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_SignonRq_Type", propOrder = {
    "examHeaderRq"
})
public class EXAMSignonRqType
    extends SignonRqType
{

    @XmlElement(name = "EXAM_HeaderRq", required = true)
    protected EXAMHeaderType examHeaderRq;

    /**
     * Gets the value of the examHeaderRq property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMHeaderType }
     *     
     */
    public EXAMHeaderType getEXAMHeaderRq() {
        return examHeaderRq;
    }

    /**
     * Sets the value of the examHeaderRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMHeaderType }
     *     
     */
    public void setEXAMHeaderRq(EXAMHeaderType value) {
        this.examHeaderRq = value;
    }

}
