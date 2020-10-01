
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ContactInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ContactPref" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PrefTimeStart" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PrefTimeEnd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PhoneNum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ContactName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EmailAddr" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}URL" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PostAddr" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInfo_Type", propOrder = {
    "contactPref",
    "prefTimeStart",
    "prefTimeEnd",
    "phoneNum",
    "contactName",
    "emailAddr",
    "url",
    "postAddr"
})
public class ContactInfoType {

    @XmlElement(name = "ContactPref")
    protected String contactPref;
    @XmlElement(name = "PrefTimeStart")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar prefTimeStart;
    @XmlElement(name = "PrefTimeEnd")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar prefTimeEnd;
    @XmlElement(name = "PhoneNum")
    protected List<PhoneNumType> phoneNum;
    @XmlElement(name = "ContactName")
    protected String contactName;
    @XmlElement(name = "EmailAddr")
    protected String emailAddr;
    @XmlElement(name = "URL")
    protected String url;
    @XmlElement(name = "PostAddr")
    protected List<PostAddrType> postAddr;

    /**
     * Gets the value of the contactPref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPref() {
        return contactPref;
    }

    /**
     * Sets the value of the contactPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPref(String value) {
        this.contactPref = value;
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
     * Gets the value of the phoneNum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneNum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneNum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneNumType }
     * 
     * 
     */
    public List<PhoneNumType> getPhoneNum() {
        if (phoneNum == null) {
            phoneNum = new ArrayList<>();
        }
        return this.phoneNum;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
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

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the postAddr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postAddr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostAddr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostAddrType }
     * 
     * 
     */
    public List<PostAddrType> getPostAddr() {
        if (postAddr == null) {
            postAddr = new ArrayList<>();
        }
        return this.postAddr;
    }

}
