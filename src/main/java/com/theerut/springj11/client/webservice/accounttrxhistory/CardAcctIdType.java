
package com.theerut.springj11.client.webservice.accounttrxhistory;

import com.theerut.springj11.client.webservice.common.CardMagDataType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardAcctId_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardAcctId_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}AcctId"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CardMagData"/>
 *         &lt;/choice>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctType"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CCMotoAcct" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardAcctId_Type", propOrder = {
    "acctId",
    "cardMagData",
    "acctType",
    "ccMotoAcct"
})
public class CardAcctIdType {

    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "CardMagData")
    protected CardMagDataType cardMagData;
    @XmlElement(name = "AcctType", required = true)
    protected String acctType;
    @XmlElement(name = "CCMotoAcct")
    protected CCMotoAcctType ccMotoAcct;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctId(String value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the cardMagData property.
     * 
     * @return
     *     possible object is
     *     {@link CardMagDataType }
     *     
     */
    public CardMagDataType getCardMagData() {
        return cardMagData;
    }

    /**
     * Sets the value of the cardMagData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardMagDataType }
     *     
     */
    public void setCardMagData(CardMagDataType value) {
        this.cardMagData = value;
    }

    /**
     * Gets the value of the acctType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctType() {
        return acctType;
    }

    /**
     * Sets the value of the acctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctType(String value) {
        this.acctType = value;
    }

    /**
     * Gets the value of the ccMotoAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CCMotoAcctType }
     *     
     */
    public CCMotoAcctType getCCMotoAcct() {
        return ccMotoAcct;
    }

    /**
     * Sets the value of the ccMotoAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCMotoAcctType }
     *     
     */
    public void setCCMotoAcct(CCMotoAcctType value) {
        this.ccMotoAcct = value;
    }

}
