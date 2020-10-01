
package com.theerut.springj11.client.webservice.accounttrxhistory;

import com.theerut.springj11.client.webservice.common.ContactInfoType;
import com.theerut.springj11.client.webservice.common.DepAcctIdType;
import com.theerut.springj11.client.webservice.common.OrgContactType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for SettlementInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettlementInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SettlementMethod"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DepAcctId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SettlementId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OrgContact" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ContactInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Memo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtInstruction" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementInfo_Type", propOrder = {
    "settlementMethod",
    "depAcctId",
    "settlementId",
    "orgContact",
    "contactInfo",
    "memo",
    "pmtInstruction"
})
public class SettlementInfoType {

    @XmlElement(name = "SettlementMethod", required = true)
    protected String settlementMethod;
    @XmlElement(name = "DepAcctId")
    protected DepAcctIdType depAcctId;
    @XmlElement(name = "SettlementId")
    protected String settlementId;
    @XmlElement(name = "OrgContact")
    protected OrgContactType orgContact;
    @XmlElement(name = "ContactInfo")
    protected ContactInfoType contactInfo;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "PmtInstruction")
    protected List<PmtInstructionType> pmtInstruction;

    /**
     * Gets the value of the settlementMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementMethod() {
        return settlementMethod;
    }

    /**
     * Sets the value of the settlementMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementMethod(String value) {
        this.settlementMethod = value;
    }

    /**
     * Gets the value of the depAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link DepAcctIdType }
     *     
     */
    public DepAcctIdType getDepAcctId() {
        return depAcctId;
    }

    /**
     * Sets the value of the depAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAcctIdType }
     *     
     */
    public void setDepAcctId(DepAcctIdType value) {
        this.depAcctId = value;
    }

    /**
     * Gets the value of the settlementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementId() {
        return settlementId;
    }

    /**
     * Sets the value of the settlementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementId(String value) {
        this.settlementId = value;
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
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * Gets the value of the pmtInstruction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtInstruction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtInstruction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmtInstructionType }
     * 
     * 
     */
    public List<PmtInstructionType> getPmtInstruction() {
        if (pmtInstruction == null) {
            pmtInstruction = new ArrayList<>();
        }
        return this.pmtInstruction;
    }

}
