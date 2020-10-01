
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXAM_BankInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_BankInfo_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}BankInfo_Type">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BIC" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_BankInfo_Type", propOrder = {
    "exambic"
})
public class EXAMBankInfoType
    extends BankInfoType
{

    @XmlElement(name = "EXAM_BIC")
    protected String exambic;

    /**
     * Gets the value of the exambic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBIC() {
        return exambic;
    }

    /**
     * Sets the value of the exambic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBIC(String value) {
        this.exambic = value;
    }

}
