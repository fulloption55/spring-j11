
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SignonRq_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignonRq_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}SignonPswd"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}SignonCert"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}SignonTransport"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}SignonMagPIN"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}SignonICC"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}SessKey"/>
 *         &lt;/choice>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SignonOverride" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ClientDt"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustLangPref"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ClientApp"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ProxyClient" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EU.Cur" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SuppressEcho" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignonRq_Type", propOrder = {
    "signonPswd",
    "signonCert",
    "signonTransport",
    "signonMagPIN",
    "signonICC",
    "sessKey",
    "signonOverride",
    "clientDt",
    "custLangPref",
    "clientApp",
    "proxyClient",
    "euCur",
    "suppressEcho"
})
@XmlSeeAlso({
    EXAMSignonRqType.class
})
public class SignonRqType {

    @XmlElement(name = "SignonPswd")
    protected SignonPswdType signonPswd;
    @XmlElement(name = "SignonCert")
    protected SignonCertType signonCert;
    @XmlElement(name = "SignonTransport")
    protected SignonTransportType signonTransport;
    @XmlElement(name = "SignonMagPIN")
    protected SignonMagPINType signonMagPIN;
    @XmlElement(name = "SignonICC")
    protected SignonICCType signonICC;
    @XmlElement(name = "SessKey")
    protected String sessKey;
    @XmlElement(name = "SignonOverride")
    protected SignonOverrideType signonOverride;
    @XmlElement(name = "ClientDt", required = true)
    protected String clientDt;
    @XmlElement(name = "CustLangPref", required = true)
    protected String custLangPref;
    @XmlElement(name = "ClientApp", required = true)
    protected ClientAppType clientApp;
    @XmlElement(name = "ProxyClient")
    protected ClientAppType proxyClient;
    @XmlElement(name = "EU.Cur")
    protected String euCur;
    @XmlElement(name = "SuppressEcho")
    protected String suppressEcho;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

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
     * Gets the value of the signonTransport property.
     * 
     * @return
     *     possible object is
     *     {@link SignonTransportType }
     *     
     */
    public SignonTransportType getSignonTransport() {
        return signonTransport;
    }

    /**
     * Sets the value of the signonTransport property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignonTransportType }
     *     
     */
    public void setSignonTransport(SignonTransportType value) {
        this.signonTransport = value;
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

    /**
     * Gets the value of the signonICC property.
     * 
     * @return
     *     possible object is
     *     {@link SignonICCType }
     *     
     */
    public SignonICCType getSignonICC() {
        return signonICC;
    }

    /**
     * Sets the value of the signonICC property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignonICCType }
     *     
     */
    public void setSignonICC(SignonICCType value) {
        this.signonICC = value;
    }

    /**
     * Gets the value of the sessKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessKey() {
        return sessKey;
    }

    /**
     * Sets the value of the sessKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessKey(String value) {
        this.sessKey = value;
    }

    /**
     * Gets the value of the signonOverride property.
     * 
     * @return
     *     possible object is
     *     {@link SignonOverrideType }
     *     
     */
    public SignonOverrideType getSignonOverride() {
        return signonOverride;
    }

    /**
     * Sets the value of the signonOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignonOverrideType }
     *     
     */
    public void setSignonOverride(SignonOverrideType value) {
        this.signonOverride = value;
    }

    /**
     * Gets the value of the clientDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientDt() {
        return clientDt;
    }

    /**
     * Sets the value of the clientDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientDt(String value) {
        this.clientDt = value;
    }

    /**
     * Gets the value of the custLangPref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustLangPref() {
        return custLangPref;
    }

    /**
     * Sets the value of the custLangPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustLangPref(String value) {
        this.custLangPref = value;
    }

    /**
     * Gets the value of the clientApp property.
     * 
     * @return
     *     possible object is
     *     {@link ClientAppType }
     *     
     */
    public ClientAppType getClientApp() {
        return clientApp;
    }

    /**
     * Sets the value of the clientApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientAppType }
     *     
     */
    public void setClientApp(ClientAppType value) {
        this.clientApp = value;
    }

    /**
     * Gets the value of the proxyClient property.
     * 
     * @return
     *     possible object is
     *     {@link ClientAppType }
     *     
     */
    public ClientAppType getProxyClient() {
        return proxyClient;
    }

    /**
     * Sets the value of the proxyClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientAppType }
     *     
     */
    public void setProxyClient(ClientAppType value) {
        this.proxyClient = value;
    }

    /**
     * Gets the value of the euCur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEUCur() {
        return euCur;
    }

    /**
     * Sets the value of the euCur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEUCur(String value) {
        this.euCur = value;
    }

    /**
     * Gets the value of the suppressEcho property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuppressEcho() {
        return suppressEcho;
    }

    /**
     * Sets the value of the suppressEcho property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppressEcho(String value) {
        this.suppressEcho = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
