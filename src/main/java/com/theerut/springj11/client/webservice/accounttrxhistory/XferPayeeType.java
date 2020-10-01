
package com.theerut.springj11.client.webservice.accounttrxhistory;

import com.theerut.springj11.client.webservice.common.DepAcctIdToType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XferPayee_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XferPayee_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DepAcctIdTo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XferPayee_Type", propOrder = {
    "depAcctIdTo"
})
public class XferPayeeType {

    @XmlElement(name = "DepAcctIdTo", required = true)
    protected DepAcctIdToType depAcctIdTo;

    /**
     * Gets the value of the depAcctIdTo property.
     * 
     * @return
     *     possible object is
     *     {@link DepAcctIdToType }
     *     
     */
    public DepAcctIdToType getDepAcctIdTo() {
        return depAcctIdTo;
    }

    /**
     * Sets the value of the depAcctIdTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAcctIdToType }
     *     
     */
    public void setDepAcctIdTo(DepAcctIdToType value) {
        this.depAcctIdTo = value;
    }

}
