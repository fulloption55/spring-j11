
package com.theerut.springj11.client.webservice.accountsummary;

import com.theerut.springj11.utils.LocalDateAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;


/**
 * <p>Java class for CustStatus_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustStatus_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustStatusCode"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StatusDesc" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EffDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StatusModBy" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ResolvePendingDt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustStatus_Type", propOrder = {
    "custStatusCode",
    "statusDesc",
    "effDt",
    "statusModBy",
    "resolvePendingDt"
})
public class CustStatusType {

    @XmlElement(name = "CustStatusCode", required = true)
    protected String custStatusCode;
    @XmlElement(name = "StatusDesc")
    protected String statusDesc;
    @XmlElement(name = "EffDt")
    protected String effDt;
    @XmlElement(name = "StatusModBy")
    protected String statusModBy;
    @XmlElement(name = "ResolvePendingDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate resolvePendingDt;

    /**
     * Gets the value of the custStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustStatusCode() {
        return custStatusCode;
    }

    /**
     * Sets the value of the custStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustStatusCode(String value) {
        this.custStatusCode = value;
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

    /**
     * Gets the value of the effDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffDt() {
        return effDt;
    }

    /**
     * Sets the value of the effDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffDt(String value) {
        this.effDt = value;
    }

    /**
     * Gets the value of the statusModBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusModBy() {
        return statusModBy;
    }

    /**
     * Sets the value of the statusModBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusModBy(String value) {
        this.statusModBy = value;
    }

    /**
     * Gets the value of the resolvePendingDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getResolvePendingDt() {
        return resolvePendingDt;
    }

    /**
     * Sets the value of the resolvePendingDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolvePendingDt(LocalDate value) {
        this.resolvePendingDt = value;
    }

}
