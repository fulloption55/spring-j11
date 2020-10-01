
package com.theerut.springj11.client.webservice.accounttrxhistory;

import com.theerut.springj11.client.webservice.common.DepAcctIdType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntermediaryDepAcct_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntermediaryDepAcct_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SeqNum"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DepAcctId"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntermediaryDepAcct_Type", propOrder = {
    "seqNum",
    "depAcctId"
})
public class IntermediaryDepAcctType {

    @XmlElement(name = "SeqNum")
    protected long seqNum;
    @XmlElement(name = "DepAcctId", required = true)
    protected DepAcctIdType depAcctId;

    /**
     * Gets the value of the seqNum property.
     * 
     */
    public long getSeqNum() {
        return seqNum;
    }

    /**
     * Sets the value of the seqNum property.
     * 
     */
    public void setSeqNum(long value) {
        this.seqNum = value;
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
