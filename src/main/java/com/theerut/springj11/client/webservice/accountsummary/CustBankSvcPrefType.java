
package com.theerut.springj11.client.webservice.accountsummary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustBankSvcPref_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustBankSvcPref_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustWithdrawalPref" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustBankSvcPref_Type", propOrder = {
    "custWithdrawalPref"
})
public class CustBankSvcPrefType {

    @XmlElement(name = "CustWithdrawalPref")
    protected CustWithdrawalPrefType custWithdrawalPref;

    /**
     * Gets the value of the custWithdrawalPref property.
     * 
     * @return
     *     possible object is
     *     {@link CustWithdrawalPrefType }
     *     
     */
    public CustWithdrawalPrefType getCustWithdrawalPref() {
        return custWithdrawalPref;
    }

    /**
     * Sets the value of the custWithdrawalPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustWithdrawalPrefType }
     *     
     */
    public void setCustWithdrawalPref(CustWithdrawalPrefType value) {
        this.custWithdrawalPref = value;
    }

}
