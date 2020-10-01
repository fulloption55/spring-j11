
package com.theerut.springj11.client.webservice.accountsummary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CustContact_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustContact_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustContactPref" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PrefTimeStart" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PrefTimeEnd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DayPhone" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EvePhone" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DayFax" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EveFax" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EmailAddr" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustContact_Type", propOrder = {
    "custContactPref",
    "prefTimeStart",
    "prefTimeEnd",
    "dayPhone",
    "evePhone",
    "dayFax",
    "eveFax",
    "emailAddr"
})
public class CustContactType {

    @XmlElement(name = "CustContactPref")
    protected String custContactPref;
    @XmlElement(name = "PrefTimeStart")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar prefTimeStart;
    @XmlElement(name = "PrefTimeEnd")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar prefTimeEnd;
    @XmlElement(name = "DayPhone")
    protected String dayPhone;
    @XmlElement(name = "EvePhone")
    protected String evePhone;
    @XmlElement(name = "DayFax")
    protected String dayFax;
    @XmlElement(name = "EveFax")
    protected String eveFax;
    @XmlElement(name = "EmailAddr")
    protected String emailAddr;

    /**
     * Gets the value of the custContactPref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustContactPref() {
        return custContactPref;
    }

    /**
     * Sets the value of the custContactPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustContactPref(String value) {
        this.custContactPref = value;
    }

    /**
     * Gets the value of the prefTimeStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrefTimeStart() {
        return prefTimeStart;
    }

    /**
     * Sets the value of the prefTimeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrefTimeStart(XMLGregorianCalendar value) {
        this.prefTimeStart = value;
    }

    /**
     * Gets the value of the prefTimeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrefTimeEnd() {
        return prefTimeEnd;
    }

    /**
     * Sets the value of the prefTimeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrefTimeEnd(XMLGregorianCalendar value) {
        this.prefTimeEnd = value;
    }

    /**
     * Gets the value of the dayPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayPhone() {
        return dayPhone;
    }

    /**
     * Sets the value of the dayPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayPhone(String value) {
        this.dayPhone = value;
    }

    /**
     * Gets the value of the evePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvePhone() {
        return evePhone;
    }

    /**
     * Sets the value of the evePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvePhone(String value) {
        this.evePhone = value;
    }

    /**
     * Gets the value of the dayFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayFax() {
        return dayFax;
    }

    /**
     * Sets the value of the dayFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayFax(String value) {
        this.dayFax = value;
    }

    /**
     * Gets the value of the eveFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEveFax() {
        return eveFax;
    }

    /**
     * Sets the value of the eveFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEveFax(String value) {
        this.eveFax = value;
    }

    /**
     * Gets the value of the emailAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddr() {
        return emailAddr;
    }

    /**
     * Sets the value of the emailAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddr(String value) {
        this.emailAddr = value;
    }

}
