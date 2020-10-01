
package com.theerut.springj11.client.webservice.accounttrxhistory;

import com.theerut.springj11.client.webservice.common.ContactInfoType;
import com.theerut.springj11.client.webservice.common.OrgContactType;
import com.theerut.springj11.client.webservice.common.PostAddrType;
import com.theerut.springj11.client.webservice.common.PostAddrType2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for BillerContact_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillerContact_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}LegalName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Name" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PostAddr" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BillRetAddr" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RemitName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RemitAddr" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}OrgContact" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ContactInfo" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "BillerContact_Type", propOrder = {
    "legalName",
    "name",
    "postAddr",
    "billRetAddr",
    "remitName",
    "remitAddr",
    "orgContact",
    "contactInfo"
})
public class BillerContactType {

    @XmlElement(name = "LegalName")
    protected String legalName;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "PostAddr")
    protected PostAddrType postAddr;
    @XmlElement(name = "BillRetAddr")
    protected PostAddrType2 billRetAddr;
    @XmlElement(name = "RemitName")
    protected String remitName;
    @XmlElement(name = "RemitAddr")
    protected PostAddrType2 remitAddr;
    @XmlElement(name = "OrgContact")
    protected List<OrgContactType> orgContact;
    @XmlElement(name = "ContactInfo")
    protected List<ContactInfoType> contactInfo;

    /**
     * Gets the value of the legalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalName() {
        return legalName;
    }

    /**
     * Sets the value of the legalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalName(String value) {
        this.legalName = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the billRetAddr property.
     * 
     * @return
     *     possible object is
     *     {@link PostAddrType2 }
     *     
     */
    public PostAddrType2 getBillRetAddr() {
        return billRetAddr;
    }

    /**
     * Sets the value of the billRetAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostAddrType2 }
     *     
     */
    public void setBillRetAddr(PostAddrType2 value) {
        this.billRetAddr = value;
    }

    /**
     * Gets the value of the remitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemitName() {
        return remitName;
    }

    /**
     * Sets the value of the remitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemitName(String value) {
        this.remitName = value;
    }

    /**
     * Gets the value of the remitAddr property.
     * 
     * @return
     *     possible object is
     *     {@link PostAddrType2 }
     *     
     */
    public PostAddrType2 getRemitAddr() {
        return remitAddr;
    }

    /**
     * Sets the value of the remitAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostAddrType2 }
     *     
     */
    public void setRemitAddr(PostAddrType2 value) {
        this.remitAddr = value;
    }

    /**
     * Gets the value of the orgContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orgContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrgContactType }
     * 
     * 
     */
    public List<OrgContactType> getOrgContact() {
        if (orgContact == null) {
            orgContact = new ArrayList<>();
        }
        return this.orgContact;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInfoType }
     * 
     * 
     */
    public List<ContactInfoType> getContactInfo() {
        if (contactInfo == null) {
            contactInfo = new ArrayList<>();
        }
        return this.contactInfo;
    }

}
