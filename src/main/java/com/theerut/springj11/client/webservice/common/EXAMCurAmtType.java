
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXAM_CurAmt_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_CurAmt_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}CurAmt_Type">
 *       &lt;sequence>
 *         &lt;element name="EXAM_AmtType" type="{urn:ifxforum-org:XSD:1}OpenEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_CurAmt_Type", propOrder = {
    "examAmtType"
})
public class EXAMCurAmtType
    extends CurAmtType
{

    @XmlElement(name = "EXAM_AmtType")
    protected String examAmtType;

    /**
     * Gets the value of the examAmtType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMAmtType() {
        return examAmtType;
    }

    /**
     * Sets the value of the examAmtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMAmtType(String value) {
        this.examAmtType = value;
    }

}
