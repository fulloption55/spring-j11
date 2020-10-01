
package com.theerut.springj11.client.webservice.accountsummary;

import com.theerut.springj11.client.webservice.common.ContactInfoType;
import com.theerut.springj11.client.webservice.common.CustNameType;
import com.theerut.springj11.client.webservice.common.PostAddrType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CustName"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PostAddr" minOccurs="0"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CustContact" minOccurs="0"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ContactInfo" minOccurs="0"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CustPref" minOccurs="0"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CustType" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PersonInfo"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OrgInfo"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustInfo_Type", propOrder = {
    "custName",
    "postAddr",
    "custContact",
    "contactInfo",
    "custPref",
    "custType",
    "personInfo",
    "orgInfo"
})
public class CustInfoType {

    @XmlElement(name = "CustName")
    protected CustNameType custName;
    @XmlElement(name = "PostAddr")
    protected PostAddrType postAddr;
    @XmlElement(name = "CustContact")
    protected CustContactType custContact;
    @XmlElement(name = "ContactInfo")
    protected ContactInfoType contactInfo;
    @XmlElement(name = "CustPref")
    protected CustPrefType custPref;
    @XmlElement(name = "CustType")
    protected String custType;
    @XmlElement(name = "PersonInfo")
    protected PersonInfoType personInfo;
    @XmlElement(name = "OrgInfo")
    protected OrgInfoType orgInfo;

    /**
     * Gets the value of the custName property.
     * 
     * @return
     *     possible object is
     *     {@link CustNameType }
     *     
     */
    public CustNameType getCustName() {
        return custName;
    }

    /**
     * Sets the value of the custName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustNameType }
     *     
     */
    public void setCustName(CustNameType value) {
        this.custName = value;
    }

    /**
     * Gets the value of the postAddr property.
     * 
     * @return
     *     possible object is
     *     {@link PostAddrType }
     *     
     */
    public PostAddrType getPostAddr() {
        return postAddr;
    }

    /**
     * Sets the value of the postAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostAddrType }
     *     
     */
    public void setPostAddr(PostAddrType value) {
        this.postAddr = value;
    }

    /**
     * Gets the value of the custContact property.
     * 
     * @return
     *     possible object is
     *     {@link CustContactType }
     *     
     */
    public CustContactType getCustContact() {
        return custContact;
    }

    /**
     * Sets the value of the custContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustContactType }
     *     
     */
    public void setCustContact(CustContactType value) {
        this.custContact = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfoType }
     *     
     */
    public ContactInfoType getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfoType }
     *     
     */
    public void setContactInfo(ContactInfoType value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the custPref property.
     * 
     * @return
     *     possible object is
     *     {@link CustPrefType }
     *     
     */
    public CustPrefType getCustPref() {
        return custPref;
    }

    /**
     * Sets the value of the custPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustPrefType }
     *     
     */
    public void setCustPref(CustPrefType value) {
        this.custPref = value;
    }

    /**
     * Gets the value of the custType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustType() {
        return custType;
    }

    /**
     * Sets the value of the custType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustType(String value) {
        this.custType = value;
    }

    /**
     * Gets the value of the personInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PersonInfoType }
     *     
     */
    public PersonInfoType getPersonInfo() {
        return personInfo;
    }

    /**
     * Sets the value of the personInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInfoType }
     *     
     */
    public void setPersonInfo(PersonInfoType value) {
        this.personInfo = value;
    }

    /**
     * Gets the value of the orgInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OrgInfoType }
     *     
     */
    public OrgInfoType getOrgInfo() {
        return orgInfo;
    }

    /**
     * Sets the value of the orgInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgInfoType }
     *     
     */
    public void setOrgInfo(OrgInfoType value) {
        this.orgInfo = value;
    }

}
