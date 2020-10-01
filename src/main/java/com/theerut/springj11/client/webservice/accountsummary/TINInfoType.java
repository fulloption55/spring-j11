
package com.theerut.springj11.client.webservice.accountsummary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TINInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TINInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TINType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TaxId"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CertCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TINInfo_Type", propOrder = {
    "tinType",
    "taxId",
    "certCode"
})
public class TINInfoType {

    @XmlElement(name = "TINType")
    protected String tinType;
    @XmlElement(name = "TaxId", required = true)
    protected String taxId;
    @XmlElement(name = "CertCode")
    protected String certCode;

    /**
     * Gets the value of the tinType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTINType() {
        return tinType;
    }

    /**
     * Sets the value of the tinType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTINType(String value) {
        this.tinType = value;
    }

    /**
     * Gets the value of the taxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxId() {
        return taxId;
    }

    /**
     * Sets the value of the taxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxId(String value) {
        this.taxId = value;
    }

    /**
     * Gets the value of the certCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertCode() {
        return certCode;
    }

    /**
     * Sets the value of the certCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertCode(String value) {
        this.certCode = value;
    }

}
