
package com.theerut.springj11.client.webservice.accountsummary;

import com.theerut.springj11.client.webservice.common.EXAMPostAddrType;
import com.theerut.springj11.client.webservice.common.PhoneNumType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for EXAM_ContactInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_ContactInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactPref" type="{urn:ifxforum-org:XSD:1}ContactPref_Type" minOccurs="0"/>
 *         &lt;element name="PrefTimeStart" type="{urn:ifxforum-org:XSD:1}PrefTimeStart_Type" minOccurs="0"/>
 *         &lt;element name="PrefTimeEnd" type="{urn:ifxforum-org:XSD:1}PrefTimeEnd_Type" minOccurs="0"/>
 *         &lt;element name="PhoneNum" type="{urn:ifxforum-org:XSD:1}PhoneNum_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactName" type="{urn:ifxforum-org:XSD:1}ContactName_Type" minOccurs="0"/>
 *         &lt;element name="EmailAddr" type="{urn:ifxforum-org:XSD:1}EmailAddr_Type" minOccurs="0"/>
 *         &lt;element name="URL" type="{urn:ifxforum-org:XSD:1}URL_Type" minOccurs="0"/>
 *         &lt;element name="EXAM_PostAddr" type="{urn:ifxforum-org:XSD:1}EXAM_PostAddr_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Relationship" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ForeignAddrInd" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_ContactInfo_Type", propOrder = {
    "contactPref",
    "prefTimeStart",
    "prefTimeEnd",
    "phoneNum",
    "contactName",
    "emailAddr",
    "url",
    "examPostAddr",
    "examRelationship",
    "examForeignAddrInd"
})
public class EXAMContactInfoType {

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
    @XmlElement(name = "EXAM_PostAddr")
    protected List<EXAMPostAddrType> examPostAddr;
    @XmlElement(name = "EXAM_Relationship")
    protected String examRelationship;
    @XmlElement(name = "EXAM_ForeignAddrInd")
    protected String examForeignAddrInd;

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
     * Gets the value of the examPostAddr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examPostAddr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMPostAddr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMPostAddrType }
     * 
     * 
     */
    public List<EXAMPostAddrType> getEXAMPostAddr() {
        if (examPostAddr == null) {
            examPostAddr = new ArrayList<>();
        }
        return this.examPostAddr;
    }

    /**
     * Gets the value of the examRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMRelationship() {
        return examRelationship;
    }

    /**
     * Sets the value of the examRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMRelationship(String value) {
        this.examRelationship = value;
    }

    /**
     * Gets the value of the examForeignAddrInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMForeignAddrInd() {
        return examForeignAddrInd;
    }

    /**
     * Sets the value of the examForeignAddrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMForeignAddrInd(String value) {
        this.examForeignAddrInd = value;
    }

}
