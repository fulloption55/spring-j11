
package com.theerut.springj11.client.webservice.accountsummary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustPref_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustPref_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Language" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MktgInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustBankSvcPref" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustPref_Type", propOrder = {
    "language",
    "mktgInfo",
    "custBankSvcPref"
})
public class CustPrefType {

    @XmlElement(name = "Language")
    protected String language;
    @XmlElement(name = "MktgInfo")
    protected String mktgInfo;
    @XmlElement(name = "CustBankSvcPref")
    protected CustBankSvcPrefType custBankSvcPref;

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the mktgInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktgInfo() {
        return mktgInfo;
    }

    /**
     * Sets the value of the mktgInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktgInfo(String value) {
        this.mktgInfo = value;
    }

    /**
     * Gets the value of the custBankSvcPref property.
     * 
     * @return
     *     possible object is
     *     {@link CustBankSvcPrefType }
     *     
     */
    public CustBankSvcPrefType getCustBankSvcPref() {
        return custBankSvcPref;
    }

    /**
     * Sets the value of the custBankSvcPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustBankSvcPrefType }
     *     
     */
    public void setCustBankSvcPref(CustBankSvcPrefType value) {
        this.custBankSvcPref = value;
    }

}
