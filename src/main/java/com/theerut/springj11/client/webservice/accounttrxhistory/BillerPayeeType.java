
package com.theerut.springj11.client.webservice.accounttrxhistory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillerPayee_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillerPayee_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BillerId"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BillerContact" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}HistRetentionDays" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BillerPayInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillerPayee_Type", propOrder = {
    "billerId",
    "billerContact",
    "histRetentionDays",
    "billerPayInfo"
})
public class BillerPayeeType {

    @XmlElement(name = "BillerId", required = true)
    protected BillerIdType billerId;
    @XmlElement(name = "BillerContact")
    protected BillerContactType billerContact;
    @XmlElement(name = "HistRetentionDays")
    protected Long histRetentionDays;
    @XmlElement(name = "BillerPayInfo")
    protected BillerPayInfoType billerPayInfo;

    /**
     * Gets the value of the billerId property.
     * 
     * @return
     *     possible object is
     *     {@link BillerIdType }
     *     
     */
    public BillerIdType getBillerId() {
        return billerId;
    }

    /**
     * Sets the value of the billerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillerIdType }
     *     
     */
    public void setBillerId(BillerIdType value) {
        this.billerId = value;
    }

    /**
     * Gets the value of the billerContact property.
     * 
     * @return
     *     possible object is
     *     {@link BillerContactType }
     *     
     */
    public BillerContactType getBillerContact() {
        return billerContact;
    }

    /**
     * Sets the value of the billerContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillerContactType }
     *     
     */
    public void setBillerContact(BillerContactType value) {
        this.billerContact = value;
    }

    /**
     * Gets the value of the histRetentionDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHistRetentionDays() {
        return histRetentionDays;
    }

    /**
     * Sets the value of the histRetentionDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHistRetentionDays(Long value) {
        this.histRetentionDays = value;
    }

    /**
     * Gets the value of the billerPayInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BillerPayInfoType }
     *     
     */
    public BillerPayInfoType getBillerPayInfo() {
        return billerPayInfo;
    }

    /**
     * Sets the value of the billerPayInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillerPayInfoType }
     *     
     */
    public void setBillerPayInfo(BillerPayInfoType value) {
        this.billerPayInfo = value;
    }

}
