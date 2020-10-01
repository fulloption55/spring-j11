
package com.theerut.springj11.client.webservice.accounttrxhistory;

import com.theerut.springj11.client.webservice.common.PostAddrType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCMotoAcct_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCMotoAcct_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ExpDt"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardVrfyData" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Name" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PostAddr"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PostalCode"/>
 *         &lt;/choice>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Phone" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Brand" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCMotoAcct_Type", propOrder = {
    "expDt",
    "cardVrfyData",
    "name",
    "postAddr",
    "postalCode",
    "phone",
    "brand"
})
public class CCMotoAcctType {

    @XmlElement(name = "ExpDt", required = true)
    protected String expDt;
    @XmlElement(name = "CardVrfyData")
    protected String cardVrfyData;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "PostAddr")
    protected PostAddrType postAddr;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "Brand")
    protected String brand;

    /**
     * Gets the value of the expDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpDt() {
        return expDt;
    }

    /**
     * Sets the value of the expDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpDt(String value) {
        this.expDt = value;
    }

    /**
     * Gets the value of the cardVrfyData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardVrfyData() {
        return cardVrfyData;
    }

    /**
     * Sets the value of the cardVrfyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardVrfyData(String value) {
        this.cardVrfyData = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the postAddr property.
     * 
     * @return
     *     possible object is
     *     {@link PostAddrType }
     *     
     */
    public PostAddrType getPostAddr() {
        return postAddr;
    }

    /**
     * Sets the value of the postAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostAddrType }
     *     
     */
    public void setPostAddr(PostAddrType value) {
        this.postAddr = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

}
