
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXAM_SignonRs_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_SignonRs_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}SignonRs_Type">
 *       &lt;sequence>
 *         &lt;element name="EXAM_HeaderRs" type="{urn:ifxforum-org:XSD:1}EXAM_Header_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_SignonRs_Type", propOrder = {
    "examHeaderRs"
})
public class EXAMSignonRsType
    extends SignonRsType
{

    @XmlElement(name = "EXAM_HeaderRs", required = true)
    protected EXAMHeaderType examHeaderRs;

    /**
     * Gets the value of the examHeaderRs property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMHeaderType }
     *     
     */
    public EXAMHeaderType getEXAMHeaderRs() {
        return examHeaderRs;
    }

    /**
     * Sets the value of the examHeaderRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMHeaderType }
     *     
     */
    public void setEXAMHeaderRs(EXAMHeaderType value) {
        this.examHeaderRs = value;
    }

}
