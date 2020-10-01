
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignonPswd_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignonPswd_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SignonRole" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustId"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustPswd"/>
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
@XmlType(name = "SignonPswd_Type", propOrder = {
    "signonRole",
    "custId",
    "custPswd",
    "genSessKey"
})
public class SignonPswdType {

    @XmlElement(name = "SignonRole")
    protected String signonRole;
    @XmlElement(name = "CustId", required = true)
    protected CustIdType custId;
    @XmlElement(name = "CustPswd", required = true)
    protected CustPswdType custPswd;
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
     * Gets the value of the custId property.
     * 
     * @return
     *     possible object is
     *     {@link CustIdType }
     *     
     */
    public CustIdType getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustIdType }
     *     
     */
    public void setCustId(CustIdType value) {
        this.custId = value;
    }

    /**
     * Gets the value of the custPswd property.
     * 
     * @return
     *     possible object is
     *     {@link CustPswdType }
     *     
     */
    public CustPswdType getCustPswd() {
        return custPswd;
    }

    /**
     * Sets the value of the custPswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustPswdType }
     *     
     */
    public void setCustPswd(CustPswdType value) {
        this.custPswd = value;
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
