
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustPswd_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustPswd_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CryptType"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SecObjId" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}Pswd"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CryptPswd"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustPswd_Type", propOrder = {
    "cryptType",
    "secObjId",
    "pswd",
    "cryptPswd"
})
public class CustPswdType {

    @XmlElement(name = "CryptType", required = true)
    protected String cryptType;
    @XmlElement(name = "SecObjId")
    protected String secObjId;
    @XmlElement(name = "Pswd")
    protected String pswd;
    @XmlElement(name = "CryptPswd")
    protected Binary cryptPswd;

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
     * Gets the value of the pswd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPswd() {
        return pswd;
    }

    /**
     * Sets the value of the pswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPswd(String value) {
        this.pswd = value;
    }

    /**
     * Gets the value of the cryptPswd property.
     * 
     * @return
     *     possible object is
     *     {@link Binary }
     *     
     */
    public Binary getCryptPswd() {
        return cryptPswd;
    }

    /**
     * Sets the value of the cryptPswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Binary }
     *     
     */
    public void setCryptPswd(Binary value) {
        this.cryptPswd = value;
    }

}
