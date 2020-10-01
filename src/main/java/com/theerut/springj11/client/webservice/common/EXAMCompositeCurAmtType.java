
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXAM_CompositeCurAmt_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_CompositeCurAmt_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}CompositeCurAmt_Type">
 *       &lt;sequence>
 *         &lt;element name="EXAM_ChrgCode" type="{urn:ifxforum-org:XSD:1}NC"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_CompositeCurAmt_Type", propOrder = {
    "examChrgCode"
})
public class EXAMCompositeCurAmtType
    extends CompositeCurAmtType
{

    @XmlElement(name = "EXAM_ChrgCode", required = true)
    protected String examChrgCode;

    /**
     * Gets the value of the examChrgCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMChrgCode() {
        return examChrgCode;
    }

    /**
     * Sets the value of the examChrgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMChrgCode(String value) {
        this.examChrgCode = value;
    }

}
