
package com.theerut.springj11.client.webservice.common;


import com.theerut.springj11.utils.LocalDateAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for EXAM_ContactDetails_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_ContactDetails_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ContactType"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="EXAM_ISDCode" type="{urn:ifxforum-org:XSD:1}EXAM_ISDCode_Type" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AreaCode" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}Phone"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ExtensionNum" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EContactCode" minOccurs="0"/>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EmailAddr"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Fax" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EmailAddr2" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MobilePhone" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}LegalName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_JobDesignation" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Country" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ContactName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SeqNum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Priority" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Indicator" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Remarks" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CusInstruction" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RelationshipCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EContactDetail" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DepartmentName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_InsufficientAddr" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AddressFormat" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SeqNum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastMaintUID" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastMaintTm" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MailMode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PromoMailMode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OverrideIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_HandleOption" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PostAddr" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EContact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastMaintDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastMaintTmStamp" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_JustifyCatContact" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_JustifyRsnContact" minOccurs="0"/>
 *         &lt;group ref="{urn:ifxforum-org:XSD:1}EXAM_ExtnGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_ContactDetails_Type", propOrder = {
    "contactType",
    "examisdCode",
    "examAreaCode",
    "phone",
    "examExtensionNum",
    "exameContactCode",
    "emailAddr",
    "fax",
    "examEmailAddr2",
    "examMobilePhone",
    "legalName",
    "examJobDesignation",
    "country",
    "contactName",
    "seqNum",
    "examPriority",
    "examIndicator",
    "examRemarks",
    "examCusInstruction",
    "examRelationshipCode",
    "exameContactDetail",
    "examDepartmentName",
    "examInsufficientAddr",
    "examAddressFormat",
    "examSeqNum",
    "examLastMaintUID",
    "examLastMaintTm",
    "examMailMode",
    "examPromoMailMode",
    "examOverrideIndicator",
    "examHandleOption",
    "examPostAddr",
    "exameContact",
    "examLastMaintDt",
    "examLastMaintTmStamp",
    "examJustifyCatContact",
    "examJustifyRsnContact",
    "examExtnGroup"
})
public class EXAMContactDetailsType {

    @XmlElement(name = "ContactType", required = true)
    protected String contactType;
    @XmlElement(name = "EXAM_ISDCode")
    protected String examisdCode;
    @XmlElement(name = "EXAM_AreaCode")
    protected String examAreaCode;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "EXAM_ExtensionNum")
    protected String examExtensionNum;
    @XmlElement(name = "EXAM_EContactCode")
    protected String exameContactCode;
    @XmlElement(name = "EmailAddr")
    protected String emailAddr;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "EXAM_EmailAddr2")
    protected String examEmailAddr2;
    @XmlElement(name = "EXAM_MobilePhone")
    protected String examMobilePhone;
    @XmlElement(name = "LegalName")
    protected String legalName;
    @XmlElement(name = "EXAM_JobDesignation")
    protected String examJobDesignation;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "ContactName")
    protected String contactName;
    @XmlElement(name = "SeqNum")
    protected Long seqNum;
    @XmlElement(name = "EXAM_Priority")
    protected String examPriority;
    @XmlElement(name = "EXAM_Indicator")
    protected String examIndicator;
    @XmlElement(name = "EXAM_Remarks")
    protected String examRemarks;
    @XmlElement(name = "EXAM_CusInstruction")
    protected String examCusInstruction;
    @XmlElement(name = "EXAM_RelationshipCode")
    protected String examRelationshipCode;
    @XmlElement(name = "EXAM_EContactDetail")
    protected String exameContactDetail;
    @XmlElement(name = "EXAM_DepartmentName")
    protected String examDepartmentName;
    @XmlElement(name = "EXAM_InsufficientAddr")
    protected String examInsufficientAddr;
    @XmlElement(name = "EXAM_AddressFormat")
    protected String examAddressFormat;
    @XmlElement(name = "EXAM_SeqNum")
    protected Long examSeqNum;
    @XmlElement(name = "EXAM_LastMaintUID")
    protected String examLastMaintUID;
    @XmlElement(name = "EXAM_LastMaintTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar examLastMaintTm;
    @XmlElement(name = "EXAM_MailMode")
    protected String examMailMode;
    @XmlElement(name = "EXAM_PromoMailMode")
    protected String examPromoMailMode;
    @XmlElement(name = "EXAM_OverrideIndicator")
    protected String examOverrideIndicator;
    @XmlElement(name = "EXAM_HandleOption")
    protected String examHandleOption;
    @XmlElement(name = "EXAM_PostAddr")
    protected EXAMPostAddrType examPostAddr;
    @XmlElement(name = "EXAM_EContact")
    protected List<EXAMEContactType> exameContact;
    @XmlElement(name = "EXAM_LastMaintDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    protected LocalDate examLastMaintDt;
    @XmlElement(name = "EXAM_LastMaintTmStamp")
    protected String examLastMaintTmStamp;
    @XmlElement(name = "EXAM_JustifyCatContact")
    protected String examJustifyCatContact;
    @XmlElement(name = "EXAM_JustifyRsnContact")
    protected String examJustifyRsnContact;
    @XmlElement(name = "EXAM_ExtnInfo")
    protected List<EXAMExtensionInfoType> examExtnGroup;

    /**
     * Gets the value of the contactType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactType() {
        return contactType;
    }

    /**
     * Sets the value of the contactType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactType(String value) {
        this.contactType = value;
    }

    /**
     * Gets the value of the examisdCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMISDCode() {
        return examisdCode;
    }

    /**
     * Sets the value of the examisdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMISDCode(String value) {
        this.examisdCode = value;
    }

    /**
     * Gets the value of the examAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMAreaCode() {
        return examAreaCode;
    }

    /**
     * Sets the value of the examAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMAreaCode(String value) {
        this.examAreaCode = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the examExtensionNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMExtensionNum() {
        return examExtensionNum;
    }

    /**
     * Sets the value of the examExtensionNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMExtensionNum(String value) {
        this.examExtensionNum = value;
    }

    /**
     * Gets the value of the exameContactCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMEContactCode() {
        return exameContactCode;
    }

    /**
     * Sets the value of the exameContactCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEContactCode(String value) {
        this.exameContactCode = value;
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
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the examEmailAddr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMEmailAddr2() {
        return examEmailAddr2;
    }

    /**
     * Sets the value of the examEmailAddr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEmailAddr2(String value) {
        this.examEmailAddr2 = value;
    }

    /**
     * Gets the value of the examMobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMobilePhone() {
        return examMobilePhone;
    }

    /**
     * Sets the value of the examMobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMobilePhone(String value) {
        this.examMobilePhone = value;
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
     * Gets the value of the seqNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSeqNum() {
        return seqNum;
    }

    /**
     * Sets the value of the seqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeqNum(Long value) {
        this.seqNum = value;
    }

    /**
     * Gets the value of the examPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPriority() {
        return examPriority;
    }

    /**
     * Sets the value of the examPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPriority(String value) {
        this.examPriority = value;
    }

    /**
     * Gets the value of the examIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIndicator() {
        return examIndicator;
    }

    /**
     * Sets the value of the examIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIndicator(String value) {
        this.examIndicator = value;
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
     * Gets the value of the examCusInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCusInstruction() {
        return examCusInstruction;
    }

    /**
     * Sets the value of the examCusInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCusInstruction(String value) {
        this.examCusInstruction = value;
    }

    /**
     * Gets the value of the examRelationshipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMRelationshipCode() {
        return examRelationshipCode;
    }

    /**
     * Sets the value of the examRelationshipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMRelationshipCode(String value) {
        this.examRelationshipCode = value;
    }

    /**
     * Gets the value of the exameContactDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMEContactDetail() {
        return exameContactDetail;
    }

    /**
     * Sets the value of the exameContactDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEContactDetail(String value) {
        this.exameContactDetail = value;
    }

    /**
     * Gets the value of the examDepartmentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMDepartmentName() {
        return examDepartmentName;
    }

    /**
     * Sets the value of the examDepartmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMDepartmentName(String value) {
        this.examDepartmentName = value;
    }

    /**
     * Gets the value of the examInsufficientAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMInsufficientAddr() {
        return examInsufficientAddr;
    }

    /**
     * Sets the value of the examInsufficientAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMInsufficientAddr(String value) {
        this.examInsufficientAddr = value;
    }

    /**
     * Gets the value of the examAddressFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMAddressFormat() {
        return examAddressFormat;
    }

    /**
     * Sets the value of the examAddressFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMAddressFormat(String value) {
        this.examAddressFormat = value;
    }

    /**
     * Gets the value of the examSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEXAMSeqNum() {
        return examSeqNum;
    }

    /**
     * Sets the value of the examSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEXAMSeqNum(Long value) {
        this.examSeqNum = value;
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
     * Gets the value of the examMailMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMailMode() {
        return examMailMode;
    }

    /**
     * Sets the value of the examMailMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMailMode(String value) {
        this.examMailMode = value;
    }

    /**
     * Gets the value of the examPromoMailMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPromoMailMode() {
        return examPromoMailMode;
    }

    /**
     * Sets the value of the examPromoMailMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPromoMailMode(String value) {
        this.examPromoMailMode = value;
    }

    /**
     * Gets the value of the examOverrideIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOverrideIndicator() {
        return examOverrideIndicator;
    }

    /**
     * Sets the value of the examOverrideIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOverrideIndicator(String value) {
        this.examOverrideIndicator = value;
    }

    /**
     * Gets the value of the examHandleOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMHandleOption() {
        return examHandleOption;
    }

    /**
     * Sets the value of the examHandleOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMHandleOption(String value) {
        this.examHandleOption = value;
    }

    /**
     * Gets the value of the examPostAddr property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMPostAddrType }
     *     
     */
    public EXAMPostAddrType getEXAMPostAddr() {
        return examPostAddr;
    }

    /**
     * Sets the value of the examPostAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMPostAddrType }
     *     
     */
    public void setEXAMPostAddr(EXAMPostAddrType value) {
        this.examPostAddr = value;
    }

    /**
     * Gets the value of the exameContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exameContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMEContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMEContactType }
     * 
     * 
     */
    public List<EXAMEContactType> getEXAMEContact() {
        if (exameContact == null) {
            exameContact = new ArrayList<>();
        }
        return this.exameContact;
    }

    /**
     * Gets the value of the examLastMaintDt property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDate }
     *     
     */
    public LocalDate getEXAMLastMaintDt() {
        return examLastMaintDt;
    }

    /**
     * Sets the value of the examLastMaintDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDate }
     *     
     */
    public void setEXAMLastMaintDt(LocalDate value) {
        this.examLastMaintDt = value;
    }

    /**
     * Gets the value of the examLastMaintTmStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMLastMaintTmStamp() {
        return examLastMaintTmStamp;
    }

    /**
     * Sets the value of the examLastMaintTmStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMLastMaintTmStamp(String value) {
        this.examLastMaintTmStamp = value;
    }

    /**
     * Gets the value of the examJustifyCatContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMJustifyCatContact() {
        return examJustifyCatContact;
    }

    /**
     * Sets the value of the examJustifyCatContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMJustifyCatContact(String value) {
        this.examJustifyCatContact = value;
    }

    /**
     * Gets the value of the examJustifyRsnContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMJustifyRsnContact() {
        return examJustifyRsnContact;
    }

    /**
     * Sets the value of the examJustifyRsnContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMJustifyRsnContact(String value) {
        this.examJustifyRsnContact = value;
    }

    /**
     * Gets the value of the examExtnGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examExtnGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMExtnGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMExtensionInfoType }
     * 
     * 
     */
    public List<EXAMExtensionInfoType> getEXAMExtnGroup() {
        if (examExtnGroup == null) {
            examExtnGroup = new ArrayList<>();
        }
        return this.examExtnGroup;
    }

}
