
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignonOverride_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignonOverride_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OverrideType"/>
 *         &lt;choice>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}SignonPswd"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}SignonCert"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}SignonMagPIN"/>
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
@XmlType(name = "SignonOverride_Type", propOrder = {
    "overrideType",
    "signonPswd",
    "signonCert",
    "signonMagPIN"
})
public class SignonOverrideType {

    @XmlElement(name = "OverrideType", required = true)
    protected String overrideType;
    @XmlElement(name = "SignonPswd")
    protected SignonPswdType signonPswd;
    @XmlElement(name = "SignonCert")
    protected SignonCertType signonCert;
    @XmlElement(name = "SignonMagPIN")
    protected SignonMagPINType signonMagPIN;

    /**
     * Gets the value of the overrideType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideType() {
        return overrideType;
    }

    /**
     * Sets the value of the overrideType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideType(String value) {
        this.overrideType = value;
    }

    /**
     * Gets the value of the signonPswd property.
     * 
     * @return
     *     possible object is
     *     {@link SignonPswdType }
     *     
     */
    public SignonPswdType getSignonPswd() {
        return signonPswd;
    }

    /**
     * Sets the value of the signonPswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignonPswdType }
     *     
     */
    public void setSignonPswd(SignonPswdType value) {
        this.signonPswd = value;
    }

    /**
     * Gets the value of the signonCert property.
     * 
     * @return
     *     possible object is
     *     {@link SignonCertType }
     *     
     */
    public SignonCertType getSignonCert() {
        return signonCert;
    }

    /**
     * Sets the value of the signonCert property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignonCertType }
     *     
     */
    public void setSignonCert(SignonCertType value) {
        this.signonCert = value;
    }

    /**
     * Gets the value of the signonMagPIN property.
     * 
     * @return
     *     possible object is
     *     {@link SignonMagPINType }
     *     
     */
    public SignonMagPINType getSignonMagPIN() {
        return signonMagPIN;
    }

    /**
     * Sets the value of the signonMagPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignonMagPINType }
     *     
     */
    public void setSignonMagPIN(SignonMagPINType value) {
        this.signonMagPIN = value;
    }

}
