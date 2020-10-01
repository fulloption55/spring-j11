
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for BankInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BankIdType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BankId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RefInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Name" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BranchId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BranchName" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PostAddr"/>
 *           &lt;sequence>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}City" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}StateProv" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}PostalCode" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}Country" minOccurs="0"/>
 *           &lt;/sequence>
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
@XmlType(name = "BankInfo_Type", propOrder = {
    "bankIdType",
    "bankId",
    "refInfo",
    "name",
    "branchId",
    "branchName",
    "postAddr",
    "city",
    "stateProv",
    "postalCode",
    "country"
})
@XmlSeeAlso({
    EXAMBankInfoType.class
})
public class BankInfoType {

    @XmlElement(name = "BankIdType")
    protected String bankIdType;
    @XmlElement(name = "BankId")
    protected String bankId;
    @XmlElement(name = "RefInfo")
    protected List<RefInfoType> refInfo;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "BranchId")
    protected String branchId;
    @XmlElement(name = "BranchName")
    protected String branchName;
    @XmlElement(name = "PostAddr")
    protected PostAddrType postAddr;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "StateProv")
    protected String stateProv;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "Country")
    protected String country;

    /**
     * Gets the value of the bankIdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankIdType() {
        return bankIdType;
    }

    /**
     * Sets the value of the bankIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankIdType(String value) {
        this.bankIdType = value;
    }

    /**
     * Gets the value of the bankId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankId() {
        return bankId;
    }

    /**
     * Sets the value of the bankId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankId(String value) {
        this.bankId = value;
    }

    /**
     * Gets the value of the refInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefInfoType }
     * 
     * 
     */
    public List<RefInfoType> getRefInfo() {
        if (refInfo == null) {
            refInfo = new ArrayList<>();
        }
        return this.refInfo;
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
     * Gets the value of the branchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchId() {
        return branchId;
    }

    /**
     * Sets the value of the branchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchId(String value) {
        this.branchId = value;
    }

    /**
     * Gets the value of the branchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * Sets the value of the branchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchName(String value) {
        this.branchName = value;
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
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the stateProv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateProv() {
        return stateProv;
    }

    /**
     * Sets the value of the stateProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateProv(String value) {
        this.stateProv = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

}
