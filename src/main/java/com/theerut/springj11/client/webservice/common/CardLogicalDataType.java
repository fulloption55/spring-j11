
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardLogicalData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardLogicalData_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardEmbossNum"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardSeqNum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Brand" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Technology" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ExpDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardVrfyData" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Name" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CSPhoneNum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardLogicalData_Type", propOrder = {
    "cardEmbossNum",
    "cardSeqNum",
    "brand",
    "technology",
    "expDt",
    "cardVrfyData",
    "name",
    "csPhoneNum"
})
public class CardLogicalDataType {

    @XmlElement(name = "CardEmbossNum", required = true)
    protected String cardEmbossNum;
    @XmlElement(name = "CardSeqNum")
    protected String cardSeqNum;
    @XmlElement(name = "Brand")
    protected String brand;
    @XmlElement(name = "Technology")
    protected String technology;
    @XmlElement(name = "ExpDt")
    protected String expDt;
    @XmlElement(name = "CardVrfyData")
    protected String cardVrfyData;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "CSPhoneNum")
    protected String csPhoneNum;

    /**
     * Gets the value of the cardEmbossNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardEmbossNum() {
        return cardEmbossNum;
    }

    /**
     * Sets the value of the cardEmbossNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardEmbossNum(String value) {
        this.cardEmbossNum = value;
    }

    /**
     * Gets the value of the cardSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSeqNum() {
        return cardSeqNum;
    }

    /**
     * Sets the value of the cardSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardSeqNum(String value) {
        this.cardSeqNum = value;
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

    /**
     * Gets the value of the technology property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnology() {
        return technology;
    }

    /**
     * Sets the value of the technology property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnology(String value) {
        this.technology = value;
    }

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
     * Gets the value of the csPhoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSPhoneNum() {
        return csPhoneNum;
    }

    /**
     * Sets the value of the csPhoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSPhoneNum(String value) {
        this.csPhoneNum = value;
    }

}
