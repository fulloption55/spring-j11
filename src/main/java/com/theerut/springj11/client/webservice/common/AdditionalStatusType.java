
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalStatus_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalStatus_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StatusCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ServerStatusCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Severity"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StatusDesc" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalStatus_Type", propOrder = {
    "statusCode",
    "serverStatusCode",
    "severity",
    "statusDesc"
})
public class AdditionalStatusType {

    @XmlElement(name = "StatusCode")
    protected Long statusCode;
    @XmlElement(name = "ServerStatusCode")
    protected String serverStatusCode;
    @XmlElement(name = "Severity", required = true)
    protected String severity;
    @XmlElement(name = "StatusDesc")
    protected String statusDesc;

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStatusCode(Long value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the serverStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerStatusCode() {
        return serverStatusCode;
    }

    /**
     * Sets the value of the serverStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerStatusCode(String value) {
        this.serverStatusCode = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverity(String value) {
        this.severity = value;
    }

    /**
     * Gets the value of the statusDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDesc() {
        return statusDesc;
    }

    /**
     * Sets the value of the statusDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDesc(String value) {
        this.statusDesc = value;
    }

}
