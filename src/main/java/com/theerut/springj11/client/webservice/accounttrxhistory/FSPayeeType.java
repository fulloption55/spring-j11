
package com.theerut.springj11.client.webservice.accounttrxhistory;

import com.theerut.springj11.client.webservice.common.ContactInfoType;
import com.theerut.springj11.client.webservice.common.OrgContactType;
import com.theerut.springj11.client.webservice.common.PostAddrType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for FSPayee_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FSPayee_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PostAddr"/>
 *         &lt;choice>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}OrgContact"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ContactInfo"/>
 *         &lt;/choice>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}LegalName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OrgId" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FSPayee_Type", propOrder = {
    "postAddr",
    "orgContact",
    "contactInfo",
    "legalName",
    "orgId"
})
public class FSPayeeType {

    @XmlElement(name = "PostAddr", required = true)
    protected PostAddrType postAddr;
    @XmlElement(name = "OrgContact")
    protected OrgContactType orgContact;
    @XmlElement(name = "ContactInfo")
    protected ContactInfoType contactInfo;
    @XmlElement(name = "LegalName")
    protected String legalName;
    @XmlElement(name = "OrgId")
    protected List<OrgIdType> orgId;

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
     * Gets the value of the orgContact property.
     * 
     * @return
     *     possible object is
     *     {@link OrgContactType }
     *     
     */
    public OrgContactType getOrgContact() {
        return orgContact;
    }

    /**
     * Sets the value of the orgContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgContactType }
     *     
     */
    public void setOrgContact(OrgContactType value) {
        this.orgContact = value;
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
     * Gets the value of the orgId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orgId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrgIdType }
     * 
     * 
     */
    public List<OrgIdType> getOrgId() {
        if (orgId == null) {
            orgId = new ArrayList<>();
        }
        return this.orgId;
    }

}
