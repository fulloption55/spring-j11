
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustId_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustId_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SPName"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustPermId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustLoginId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardMagData" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardLogicalData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustId_Type", propOrder = {
    "spName",
    "custPermId",
    "custLoginId",
    "cardMagData",
    "cardLogicalData"
})
public class CustIdType {

    @XmlElement(name = "SPName", required = true)
    protected String spName;
    @XmlElement(name = "CustPermId")
    protected String custPermId;
    @XmlElement(name = "CustLoginId")
    protected String custLoginId;
    @XmlElement(name = "CardMagData")
    protected CardMagDataType cardMagData;
    @XmlElement(name = "CardLogicalData")
    protected CardLogicalDataType cardLogicalData;

    /**
     * Gets the value of the spName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPName() {
        return spName;
    }

    /**
     * Sets the value of the spName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPName(String value) {
        this.spName = value;
    }

    /**
     * Gets the value of the custPermId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustPermId() {
        return custPermId;
    }

    /**
     * Sets the value of the custPermId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustPermId(String value) {
        this.custPermId = value;
    }

    /**
     * Gets the value of the custLoginId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustLoginId() {
        return custLoginId;
    }

    /**
     * Sets the value of the custLoginId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustLoginId(String value) {
        this.custLoginId = value;
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
     * Gets the value of the cardLogicalData property.
     * 
     * @return
     *     possible object is
     *     {@link CardLogicalDataType }
     *     
     */
    public CardLogicalDataType getCardLogicalData() {
        return cardLogicalData;
    }

    /**
     * Sets the value of the cardLogicalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardLogicalDataType }
     *     
     */
    public void setCardLogicalData(CardLogicalDataType value) {
        this.cardLogicalData = value;
    }

}
