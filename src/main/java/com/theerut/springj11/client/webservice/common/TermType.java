
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Term_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Term_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Count"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TermUnits"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Desc" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DaysCall" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Term_Type", propOrder = {
    "count",
    "termUnits",
    "desc",
    "daysCall"
})
public class TermType {

    @XmlElement(name = "Count")
    protected long count;
    @XmlElement(name = "TermUnits", required = true)
    protected String termUnits;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "DaysCall")
    protected Long daysCall;

    /**
     * Gets the value of the count property.
     * 
     */
    public long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(long value) {
        this.count = value;
    }

    /**
     * Gets the value of the termUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermUnits() {
        return termUnits;
    }

    /**
     * Sets the value of the termUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermUnits(String value) {
        this.termUnits = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the daysCall property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDaysCall() {
        return daysCall;
    }

    /**
     * Sets the value of the daysCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDaysCall(Long value) {
        this.daysCall = value;
    }

}
