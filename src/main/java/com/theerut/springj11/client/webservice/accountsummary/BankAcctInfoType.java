
package com.theerut.springj11.client.webservice.accountsummary;

import com.theerut.springj11.client.webservice.common.ContactInfoType;
import com.theerut.springj11.client.webservice.common.CurrencyAmount;
import com.theerut.springj11.client.webservice.common.CustNameType;
import com.theerut.springj11.client.webservice.common.OrgContactType;
import com.theerut.springj11.client.webservice.common.TermType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankAcctInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankAcctInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurCode"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Desc" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CustName" minOccurs="0"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PersonName" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}OrgContact" minOccurs="0"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ContactInfo" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustAcctUse" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PrimaryAcct" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Term" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IntRateInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BackupWithholding" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TaxCountry" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TaxProvince" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Ownership" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ProductId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}InitialDeposit" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankAcctInfo_Type", propOrder = {
    "curCode",
    "desc",
    "custName",
    "personName",
    "orgContact",
    "contactInfo",
    "custAcctUse",
    "primaryAcct",
    "term",
    "intRateInfo",
    "backupWithholding",
    "taxCountry",
    "taxProvince",
    "ownership",
    "productId",
    "initialDeposit"
})
@XmlSeeAlso({
    EXAMAcctInfoType.class
})
public class BankAcctInfoType {

    @XmlElement(name = "CurCode", required = true)
    protected String curCode;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "CustName")
    protected CustNameType custName;
    @XmlElement(name = "PersonName")
    protected PersonNameType personName;
    @XmlElement(name = "OrgContact")
    protected OrgContactType orgContact;
    @XmlElement(name = "ContactInfo")
    protected ContactInfoType contactInfo;
    @XmlElement(name = "CustAcctUse")
    protected String custAcctUse;
    @XmlElement(name = "PrimaryAcct")
    protected String primaryAcct;
    @XmlElement(name = "Term")
    protected TermType term;
    @XmlElement(name = "IntRateInfo")
    protected IntRateInfoType intRateInfo;
    @XmlElement(name = "BackupWithholding")
    protected String backupWithholding;
    @XmlElement(name = "TaxCountry")
    protected String taxCountry;
    @XmlElement(name = "TaxProvince")
    protected String taxProvince;
    @XmlElement(name = "Ownership")
    protected String ownership;
    @XmlElement(name = "ProductId")
    protected String productId;
    @XmlElement(name = "InitialDeposit")
    protected CurrencyAmount initialDeposit;

    /**
     * Gets the value of the curCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurCode() {
        return curCode;
    }

    /**
     * Sets the value of the curCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurCode(String value) {
        this.curCode = value;
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
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setPersonName(PersonNameType value) {
        this.personName = value;
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
     * Gets the value of the custAcctUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustAcctUse() {
        return custAcctUse;
    }

    /**
     * Sets the value of the custAcctUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustAcctUse(String value) {
        this.custAcctUse = value;
    }

    /**
     * Gets the value of the primaryAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAcct() {
        return primaryAcct;
    }

    /**
     * Sets the value of the primaryAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAcct(String value) {
        this.primaryAcct = value;
    }

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link TermType }
     *     
     */
    public TermType getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermType }
     *     
     */
    public void setTerm(TermType value) {
        this.term = value;
    }

    /**
     * Gets the value of the intRateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IntRateInfoType }
     *     
     */
    public IntRateInfoType getIntRateInfo() {
        return intRateInfo;
    }

    /**
     * Sets the value of the intRateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRateInfoType }
     *     
     */
    public void setIntRateInfo(IntRateInfoType value) {
        this.intRateInfo = value;
    }

    /**
     * Gets the value of the backupWithholding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackupWithholding() {
        return backupWithholding;
    }

    /**
     * Sets the value of the backupWithholding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackupWithholding(String value) {
        this.backupWithholding = value;
    }

    /**
     * Gets the value of the taxCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCountry() {
        return taxCountry;
    }

    /**
     * Sets the value of the taxCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCountry(String value) {
        this.taxCountry = value;
    }

    /**
     * Gets the value of the taxProvince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxProvince() {
        return taxProvince;
    }

    /**
     * Sets the value of the taxProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxProvince(String value) {
        this.taxProvince = value;
    }

    /**
     * Gets the value of the ownership property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnership() {
        return ownership;
    }

    /**
     * Sets the value of the ownership property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnership(String value) {
        this.ownership = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Gets the value of the initialDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getInitialDeposit() {
        return initialDeposit;
    }

    /**
     * Sets the value of the initialDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setInitialDeposit(CurrencyAmount value) {
        this.initialDeposit = value;
    }

}
