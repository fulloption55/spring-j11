
package com.theerut.springj11.client.webservice.accounttrxhistory;

import com.theerut.springj11.client.webservice.common.DepAcctIdType;
import com.theerut.springj11.client.webservice.common.FeeType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeChargeAlloc_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeChargeAlloc_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChargeRegulation"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Fee"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DepAcctId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeChargeAlloc_Type", propOrder = {
    "chargeRegulation",
    "fee",
    "depAcctId"
})
public class FeeChargeAllocType {

    @XmlElement(name = "ChargeRegulation", required = true)
    protected String chargeRegulation;
    @XmlElement(name = "Fee", required = true)
    protected FeeType fee;
    @XmlElement(name = "DepAcctId")
    protected DepAcctIdType depAcctId;

    /**
     * Gets the value of the chargeRegulation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeRegulation() {
        return chargeRegulation;
    }

    /**
     * Sets the value of the chargeRegulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeRegulation(String value) {
        this.chargeRegulation = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link FeeType }
     *     
     */
    public FeeType getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeType }
     *     
     */
    public void setFee(FeeType value) {
        this.fee = value;
    }

    /**
     * Gets the value of the depAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link DepAcctIdType }
     *     
     */
    public DepAcctIdType getDepAcctId() {
        return depAcctId;
    }

    /**
     * Sets the value of the depAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAcctIdType }
     *     
     */
    public void setDepAcctId(DepAcctIdType value) {
        this.depAcctId = value;
    }

}
