
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
 * <p>Java class for SignonRs_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignonRs_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}Status" minOccurs="0"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}SignonRole" minOccurs="0"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CustId" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}GenSessKey" minOccurs="0"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ClientDt" minOccurs="0"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CustLangPref" minOccurs="0"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ClientApp" minOccurs="0"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ProxyClient" minOccurs="0"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}EU.Cur" minOccurs="0"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ServerDt"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}SessKey" minOccurs="0"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ExpDt" minOccurs="0"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}Language"/>
 *         &lt;/sequence>
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
@XmlType(name = "SignonRs_Type", propOrder = {
    "status",
    "signonRole",
    "custId",
    "genSessKey",
    "clientDt",
    "custLangPref",
    "clientApp",
    "proxyClient",
    "euCur",
    "serverDt",
    "sessKey",
    "expDt",
    "language"
})
@XmlSeeAlso({
    EXAMSignonRsType.class
})
public class SignonRsType {

    @XmlElement(name = "Status")
    protected StatusType status;
    @XmlElement(name = "SignonRole")
    protected String signonRole;
    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "GenSessKey")
    protected String genSessKey;
    @XmlElement(name = "ClientDt")
    protected String clientDt;
    @XmlElement(name = "CustLangPref")
    protected String custLangPref;
    @XmlElement(name = "ClientApp")
    protected ClientAppType clientApp;
    @XmlElement(name = "ProxyClient")
    protected ClientAppType proxyClient;
    @XmlElement(name = "EU.Cur")
    protected String euCur;
    @XmlElement(name = "ServerDt")
    protected String serverDt;
    @XmlElement(name = "SessKey")
    protected String sessKey;
    @XmlElement(name = "ExpDt")
    protected String expDt;
    @XmlElement(name = "Language")
    protected String language;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

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
     * Gets the value of the serverDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerDt() {
        return serverDt;
    }

    /**
     * Sets the value of the serverDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerDt(String value) {
        this.serverDt = value;
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
