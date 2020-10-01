
package com.theerut.springj11.client.webservice.accounttrxhistory;

        import com.theerut.springj11.client.webservice.common.DepAcctIdFromType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DfltPmtInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DfltPmtInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}DepAcctIdFrom" minOccurs="0"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CardAcctIdFrom" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Category" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Memo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DfltPmtInfo_Type", propOrder = {
    "depAcctIdFrom",
    "cardAcctIdFrom",
    "category",
    "memo"
})
public class DfltPmtInfoType {

    @XmlElement(name = "DepAcctIdFrom")
    protected DepAcctIdFromType depAcctIdFrom;
    @XmlElement(name = "CardAcctIdFrom")
    protected CardAcctIdType cardAcctIdFrom;
    @XmlElement(name = "Category")
    protected String category;
    @XmlElement(name = "Memo")
    protected String memo;

    /**
     * Gets the value of the depAcctIdFrom property.
     * 
     * @return
     *     possible object is
     *     {@link DepAcctIdFromType }
     *     
     */
    public DepAcctIdFromType getDepAcctIdFrom() {
        return depAcctIdFrom;
    }

    /**
     * Sets the value of the depAcctIdFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAcctIdFromType }
     *     
     */
    public void setDepAcctIdFrom(DepAcctIdFromType value) {
        this.depAcctIdFrom = value;
    }

    /**
     * Gets the value of the cardAcctIdFrom property.
     * 
     * @return
     *     possible object is
     *     {@link CardAcctIdType }
     *     
     */
    public CardAcctIdType getCardAcctIdFrom() {
        return cardAcctIdFrom;
    }

    /**
     * Sets the value of the cardAcctIdFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAcctIdType }
     *     
     */
    public void setCardAcctIdFrom(CardAcctIdType value) {
        this.cardAcctIdFrom = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

}
