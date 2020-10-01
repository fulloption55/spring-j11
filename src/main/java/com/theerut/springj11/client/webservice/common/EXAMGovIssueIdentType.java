
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EXAM_GovIssueIdent_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_GovIssueIdent_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_GovIssueIdentType"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IdentSerialNum"/>
 *         &lt;element name="EXAM_GovOrg" type="{urn:ifxforum-org:XSD:1}EXAM_GovOrg_Type" minOccurs="0"/>
 *         &lt;element name="EXAM_GovOrgName" type="{urn:ifxforum-org:XSD:1}EXAM_GovOrgName_Type" minOccurs="0"/>
 *         &lt;element name="EXAM_GovRank" type="{urn:ifxforum-org:XSD:1}EXAM_GovRank_Type" minOccurs="0"/>
 *         &lt;element name="StateProv" type="{urn:ifxforum-org:XSD:1}StateProv_Type" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Country" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Desc" minOccurs="0"/>
 *         &lt;element name="EXAM_IssDt" type="{urn:ifxforum-org:XSD:1}EXAM_IssDt_Type" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IssPlace" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ExpDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastMaintUID" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastMaintTm" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BirthDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IDDocSrc" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IdentNum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustomerName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastMaintDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_JobDesignation" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RegistrationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_GovIssueIdent_Type", propOrder = {
    "examGovIssueIdentType",
    "examIdentSerialNum",
    "examGovOrg",
    "examGovOrgName",
    "examGovRank",
    "stateProv",
    "country",
    "desc",
    "examIssDt",
    "examIssPlace",
    "expDt",
    "examLastMaintUID",
    "examLastMaintTm",
    "birthDt",
    "examidDocSrc",
    "examIdentNum",
    "examCustomerName",
    "examLastMaintDt",
    "examJobDesignation",
    "examRegistrationType"
})
public class EXAMGovIssueIdentType {

    @XmlElement(name = "EXAM_GovIssueIdentType", required = true)
    protected String examGovIssueIdentType;
    @XmlElement(name = "EXAM_IdentSerialNum", required = true)
    protected String examIdentSerialNum;
    @XmlElement(name = "EXAM_GovOrg")
    protected String examGovOrg;
    @XmlElement(name = "EXAM_GovOrgName")
    protected String examGovOrgName;
    @XmlElement(name = "EXAM_GovRank")
    protected String examGovRank;
    @XmlElement(name = "StateProv")
    protected String stateProv;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "EXAM_IssDt")
    protected String examIssDt;
    @XmlElement(name = "EXAM_IssPlace")
    protected String examIssPlace;
    @XmlElement(name = "ExpDt")
    protected String expDt;
    @XmlElement(name = "EXAM_LastMaintUID")
    protected String examLastMaintUID;
    @XmlElement(name = "EXAM_LastMaintTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar examLastMaintTm;
    @XmlElement(name = "BirthDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDt;
    @XmlElement(name = "EXAM_IDDocSrc")
    protected String examidDocSrc;
    @XmlElement(name = "EXAM_IdentNum")
    protected String examIdentNum;
    @XmlElement(name = "EXAM_CustomerName")
    protected String examCustomerName;
    @XmlElement(name = "EXAM_LastMaintDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar examLastMaintDt;
    @XmlElement(name = "EXAM_JobDesignation")
    protected String examJobDesignation;
    @XmlElement(name = "EXAM_RegistrationType")
    protected String examRegistrationType;

    /**
     * Gets the value of the examGovIssueIdentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMGovIssueIdentType() {
        return examGovIssueIdentType;
    }

    /**
     * Sets the value of the examGovIssueIdentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMGovIssueIdentType(String value) {
        this.examGovIssueIdentType = value;
    }

    /**
     * Gets the value of the examIdentSerialNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIdentSerialNum() {
        return examIdentSerialNum;
    }

    /**
     * Sets the value of the examIdentSerialNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIdentSerialNum(String value) {
        this.examIdentSerialNum = value;
    }

    /**
     * Gets the value of the examGovOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMGovOrg() {
        return examGovOrg;
    }

    /**
     * Sets the value of the examGovOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMGovOrg(String value) {
        this.examGovOrg = value;
    }

    /**
     * Gets the value of the examGovOrgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMGovOrgName() {
        return examGovOrgName;
    }

    /**
     * Sets the value of the examGovOrgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMGovOrgName(String value) {
        this.examGovOrgName = value;
    }

    /**
     * Gets the value of the examGovRank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMGovRank() {
        return examGovRank;
    }

    /**
     * Sets the value of the examGovRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMGovRank(String value) {
        this.examGovRank = value;
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
     * Gets the value of the examIssDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIssDt() {
        return examIssDt;
    }

    /**
     * Sets the value of the examIssDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIssDt(String value) {
        this.examIssDt = value;
    }

    /**
     * Gets the value of the examIssPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIssPlace() {
        return examIssPlace;
    }

    /**
     * Sets the value of the examIssPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIssPlace(String value) {
        this.examIssPlace = value;
    }

    /**
     * Gets the value of the expDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpDt() {
        return expDt;
    }

    /**
     * Sets the value of the expDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpDt(String value) {
        this.expDt = value;
    }

    /**
     * Gets the value of the examLastMaintUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMLastMaintUID() {
        return examLastMaintUID;
    }

    /**
     * Sets the value of the examLastMaintUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMLastMaintUID(String value) {
        this.examLastMaintUID = value;
    }

    /**
     * Gets the value of the examLastMaintTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEXAMLastMaintTm() {
        return examLastMaintTm;
    }

    /**
     * Sets the value of the examLastMaintTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEXAMLastMaintTm(XMLGregorianCalendar value) {
        this.examLastMaintTm = value;
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
     * Gets the value of the examidDocSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIDDocSrc() {
        return examidDocSrc;
    }

    /**
     * Sets the value of the examidDocSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIDDocSrc(String value) {
        this.examidDocSrc = value;
    }

    /**
     * Gets the value of the examIdentNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIdentNum() {
        return examIdentNum;
    }

    /**
     * Sets the value of the examIdentNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIdentNum(String value) {
        this.examIdentNum = value;
    }

    /**
     * Gets the value of the examCustomerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCustomerName() {
        return examCustomerName;
    }

    /**
     * Sets the value of the examCustomerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCustomerName(String value) {
        this.examCustomerName = value;
    }

    /**
     * Gets the value of the examLastMaintDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEXAMLastMaintDt() {
        return examLastMaintDt;
    }

    /**
     * Sets the value of the examLastMaintDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEXAMLastMaintDt(XMLGregorianCalendar value) {
        this.examLastMaintDt = value;
    }

    /**
     * Gets the value of the examJobDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMJobDesignation() {
        return examJobDesignation;
    }

    /**
     * Sets the value of the examJobDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMJobDesignation(String value) {
        this.examJobDesignation = value;
    }

    /**
     * Gets the value of the examRegistrationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMRegistrationType() {
        return examRegistrationType;
    }

    /**
     * Sets the value of the examRegistrationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMRegistrationType(String value) {
        this.examRegistrationType = value;
    }

}
