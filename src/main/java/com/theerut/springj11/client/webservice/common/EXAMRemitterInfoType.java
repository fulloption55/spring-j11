
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EXAM_RemitterInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_RemitterInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Name" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_GovIssueId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RateType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Remarks" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BirthDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ContactInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Gender" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_UIDId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CompanyId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EmployerName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EmploymentType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PassportExpDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Nationality" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IsResident" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Occupation" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StateProv" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CountryOfBirth" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ForeignWorkerIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NatureOfWork" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_RemitterInfo_Type", propOrder = {
    "name",
    "acctId",
    "curAmt",
    "examGovIssueId",
    "examRateType",
    "acctType",
    "examRemarks",
    "birthDt",
    "contactInfo",
    "gender",
    "examcifId",
    "examCompanyId",
    "examEmployerName",
    "examEmploymentType",
    "examPassportExpDt",
    "examNationality",
    "examIsResident",
    "occupation",
    "stateProv",
    "examCountryOfBirth",
    "examForeignWorkerIndicator",
    "examNatureOfWork"
})
public class EXAMRemitterInfoType {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "CurAmt")
    protected CurAmtType curAmt;
    @XmlElement(name = "EXAM_GovIssueId")
    protected EXAMGovIssueIdentType examGovIssueId;
    @XmlElement(name = "EXAM_RateType")
    protected String examRateType;
    @XmlElement(name = "AcctType")
    protected String acctType;
    @XmlElement(name = "EXAM_Remarks")
    protected String examRemarks;
    @XmlElement(name = "BirthDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDt;
    @XmlElement(name = "ContactInfo")
    protected ContactInfoType contactInfo;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElement(name = "EXAM_UIDId")
    protected String examcifId;
    @XmlElement(name = "EXAM_CompanyId")
    protected String examCompanyId;
    @XmlElement(name = "EXAM_EmployerName")
    protected String examEmployerName;
    @XmlElement(name = "EXAM_EmploymentType")
    protected String examEmploymentType;
    @XmlElement(name = "EXAM_PassportExpDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar examPassportExpDt;
    @XmlElement(name = "EXAM_Nationality")
    protected String examNationality;
    @XmlElement(name = "EXAM_IsResident")
    protected String examIsResident;
    @XmlElement(name = "Occupation")
    protected String occupation;
    @XmlElement(name = "StateProv")
    protected String stateProv;
    @XmlElement(name = "EXAM_CountryOfBirth")
    protected String examCountryOfBirth;
    @XmlElement(name = "EXAM_ForeignWorkerIndicator")
    protected String examForeignWorkerIndicator;
    @XmlElement(name = "EXAM_NatureOfWork")
    protected String examNatureOfWork;

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
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctId(String value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the curAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurAmtType }
     *     
     */
    public CurAmtType getCurAmt() {
        return curAmt;
    }

    /**
     * Sets the value of the curAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmtType }
     *     
     */
    public void setCurAmt(CurAmtType value) {
        this.curAmt = value;
    }

    /**
     * Gets the value of the examGovIssueId property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMGovIssueIdentType }
     *     
     */
    public EXAMGovIssueIdentType getEXAMGovIssueId() {
        return examGovIssueId;
    }

    /**
     * Sets the value of the examGovIssueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMGovIssueIdentType }
     *     
     */
    public void setEXAMGovIssueId(EXAMGovIssueIdentType value) {
        this.examGovIssueId = value;
    }

    /**
     * Gets the value of the examRateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMRateType() {
        return examRateType;
    }

    /**
     * Sets the value of the examRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMRateType(String value) {
        this.examRateType = value;
    }

    /**
     * Gets the value of the acctType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctType() {
        return acctType;
    }

    /**
     * Sets the value of the acctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctType(String value) {
        this.acctType = value;
    }

    /**
     * Gets the value of the examRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMRemarks() {
        return examRemarks;
    }

    /**
     * Sets the value of the examRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMRemarks(String value) {
        this.examRemarks = value;
    }

    /**
     * Gets the value of the birthDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDt() {
        return birthDt;
    }

    /**
     * Sets the value of the birthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDt(XMLGregorianCalendar value) {
        this.birthDt = value;
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
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the examcifId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMUIDId() {
        return examcifId;
    }

    /**
     * Sets the value of the examcifId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMUIDId(String value) {
        this.examcifId = value;
    }

    /**
     * Gets the value of the examCompanyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCompanyId() {
        return examCompanyId;
    }

    /**
     * Sets the value of the examCompanyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCompanyId(String value) {
        this.examCompanyId = value;
    }

    /**
     * Gets the value of the examEmployerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMEmployerName() {
        return examEmployerName;
    }

    /**
     * Sets the value of the examEmployerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEmployerName(String value) {
        this.examEmployerName = value;
    }

    /**
     * Gets the value of the examEmploymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMEmploymentType() {
        return examEmploymentType;
    }

    /**
     * Sets the value of the examEmploymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEmploymentType(String value) {
        this.examEmploymentType = value;
    }

    /**
     * Gets the value of the examPassportExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEXAMPassportExpDt() {
        return examPassportExpDt;
    }

    /**
     * Sets the value of the examPassportExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEXAMPassportExpDt(XMLGregorianCalendar value) {
        this.examPassportExpDt = value;
    }

    /**
     * Gets the value of the examNationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMNationality() {
        return examNationality;
    }

    /**
     * Sets the value of the examNationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMNationality(String value) {
        this.examNationality = value;
    }

    /**
     * Gets the value of the examIsResident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIsResident() {
        return examIsResident;
    }

    /**
     * Sets the value of the examIsResident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIsResident(String value) {
        this.examIsResident = value;
    }

    /**
     * Gets the value of the occupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Sets the value of the occupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupation(String value) {
        this.occupation = value;
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
     * Gets the value of the examCountryOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCountryOfBirth() {
        return examCountryOfBirth;
    }

    /**
     * Sets the value of the examCountryOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCountryOfBirth(String value) {
        this.examCountryOfBirth = value;
    }

    /**
     * Gets the value of the examForeignWorkerIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMForeignWorkerIndicator() {
        return examForeignWorkerIndicator;
    }

    /**
     * Sets the value of the examForeignWorkerIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMForeignWorkerIndicator(String value) {
        this.examForeignWorkerIndicator = value;
    }

    /**
     * Gets the value of the examNatureOfWork property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMNatureOfWork() {
        return examNatureOfWork;
    }

    /**
     * Sets the value of the examNatureOfWork property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMNatureOfWork(String value) {
        this.examNatureOfWork = value;
    }

}
