
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignonMagPIN_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignonMagPIN_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SignonRole"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardMagData"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CryptType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PINBlock"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SecObjId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}GenSessKey" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignonMagPIN_Type", propOrder = {
    "signonRole",
    "cardMagData",
    "cryptType",
    "pinBlock",
    "secObjId",
    "genSessKey"
})
public class SignonMagPINType {

    @XmlElement(name = "SignonRole", required = true)
    protected String signonRole;
    @XmlElement(name = "CardMagData", required = true)
    protected CardMagDataType cardMagData;
    @XmlElement(name = "CryptType")
    protected String cryptType;
    @XmlElement(name = "PINBlock", required = true)
    protected String pinBlock;
    @XmlElement(name = "SecObjId")
    protected String secObjId;
    @XmlElement(name = "GenSessKey")
    protected String genSessKey;

    /**
     * Gets the value of the signonRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignonRole() {
        return signonRole;
    }

    /**
     * Sets the value of the signonRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignonRole(String value) {
        this.signonRole = value;
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
     * Gets the value of the cryptType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCryptType() {
        return cryptType;
    }

    /**
     * Sets the value of the cryptType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCryptType(String value) {
        this.cryptType = value;
    }

    /**
     * Gets the value of the pinBlock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPINBlock() {
        return pinBlock;
    }

    /**
     * Sets the value of the pinBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPINBlock(String value) {
        this.pinBlock = value;
    }

    /**
     * Gets the value of the secObjId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecObjId() {
        return secObjId;
    }

    /**
     * Sets the value of the secObjId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecObjId(String value) {
        this.secObjId = value;
    }

    /**
     * Gets the value of the genSessKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenSessKey() {
        return genSessKey;
    }

    /**
     * Sets the value of the genSessKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenSessKey(String value) {
        this.genSessKey = value;
    }

}
