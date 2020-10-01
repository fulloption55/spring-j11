
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXAM_FinSvcHeaderInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_FinSvcHeaderInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DocNum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Remarks" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_GLRefNum"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TellerId"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_JournalSeqNum"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Correction" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OrigJournalSeqNum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TellerBranch" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ServicingBranch" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BankId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BranchId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SrcSystem" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TrnBranchId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TellerOvrRide" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SuprOvrRide" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SuprOvrRideID" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ReleaseAcctInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ManFEOvrd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BranchUserId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_FrontEndOvrRide" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_FrontEndSuprId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_FinSvcHeaderInfo_Type", propOrder = {
    "examDocNum",
    "examRemarks",
    "examglRefNum",
    "examTellerId",
    "examJournalSeqNum",
    "examCorrection",
    "examOrigJournalSeqNum",
    "examTellerBranch",
    "examServicingBranch",
    "bankId",
    "branchId",
    "examSrcSystem",
    "examTrnBranchId",
    "examTellerOvrRide",
    "examSuprOvrRide",
    "examSuprOvrRideID",
    "examReleaseAcctInd",
    "examManFEOvrd",
    "examBranchUserId",
    "examFrontEndOvrRide",
    "examFrontEndSuprId"
})
public class EXAMFinSvcHeaderInfoType {

    @XmlElement(name = "EXAM_DocNum")
    protected String examDocNum;
    @XmlElement(name = "EXAM_Remarks")
    protected String examRemarks;
    @XmlElement(name = "EXAM_GLRefNum", required = true)
    protected String examglRefNum;
    @XmlElement(name = "EXAM_TellerId", required = true)
    protected String examTellerId;
    @XmlElement(name = "EXAM_JournalSeqNum")
    protected long examJournalSeqNum;
    @XmlElement(name = "EXAM_Correction")
    protected String examCorrection;
    @XmlElement(name = "EXAM_OrigJournalSeqNum")
    protected Long examOrigJournalSeqNum;
    @XmlElement(name = "EXAM_TellerBranch")
    protected String examTellerBranch;
    @XmlElement(name = "EXAM_ServicingBranch")
    protected Long examServicingBranch;
    @XmlElement(name = "BankId")
    protected String bankId;
    @XmlElement(name = "BranchId")
    protected String branchId;
    @XmlElement(name = "EXAM_SrcSystem")
    protected String examSrcSystem;
    @XmlElement(name = "EXAM_TrnBranchId")
    protected String examTrnBranchId;
    @XmlElement(name = "EXAM_TellerOvrRide")
    protected String examTellerOvrRide;
    @XmlElement(name = "EXAM_SuprOvrRide")
    protected String examSuprOvrRide;
    @XmlElement(name = "EXAM_SuprOvrRideID")
    protected String examSuprOvrRideID;
    @XmlElement(name = "EXAM_ReleaseAcctInd")
    protected String examReleaseAcctInd;
    @XmlElement(name = "EXAM_ManFEOvrd")
    protected String examManFEOvrd;
    @XmlElement(name = "EXAM_BranchUserId")
    protected String examBranchUserId;
    @XmlElement(name = "EXAM_FrontEndOvrRide")
    protected String examFrontEndOvrRide;
    @XmlElement(name = "EXAM_FrontEndSuprId")
    protected String examFrontEndSuprId;

    /**
     * Gets the value of the examDocNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMDocNum() {
        return examDocNum;
    }

    /**
     * Sets the value of the examDocNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMDocNum(String value) {
        this.examDocNum = value;
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
     * Gets the value of the examglRefNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMGLRefNum() {
        return examglRefNum;
    }

    /**
     * Sets the value of the examglRefNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMGLRefNum(String value) {
        this.examglRefNum = value;
    }

    /**
     * Gets the value of the examTellerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMTellerId() {
        return examTellerId;
    }

    /**
     * Sets the value of the examTellerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMTellerId(String value) {
        this.examTellerId = value;
    }

    /**
     * Gets the value of the examJournalSeqNum property.
     * 
     */
    public long getEXAMJournalSeqNum() {
        return examJournalSeqNum;
    }

    /**
     * Sets the value of the examJournalSeqNum property.
     * 
     */
    public void setEXAMJournalSeqNum(long value) {
        this.examJournalSeqNum = value;
    }

    /**
     * Gets the value of the examCorrection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCorrection() {
        return examCorrection;
    }

    /**
     * Sets the value of the examCorrection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCorrection(String value) {
        this.examCorrection = value;
    }

    /**
     * Gets the value of the examOrigJournalSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEXAMOrigJournalSeqNum() {
        return examOrigJournalSeqNum;
    }

    /**
     * Sets the value of the examOrigJournalSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEXAMOrigJournalSeqNum(Long value) {
        this.examOrigJournalSeqNum = value;
    }

    /**
     * Gets the value of the examTellerBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMTellerBranch() {
        return examTellerBranch;
    }

    /**
     * Sets the value of the examTellerBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMTellerBranch(String value) {
        this.examTellerBranch = value;
    }

    /**
     * Gets the value of the examServicingBranch property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEXAMServicingBranch() {
        return examServicingBranch;
    }

    /**
     * Sets the value of the examServicingBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEXAMServicingBranch(Long value) {
        this.examServicingBranch = value;
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
     * Gets the value of the examSrcSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSrcSystem() {
        return examSrcSystem;
    }

    /**
     * Sets the value of the examSrcSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSrcSystem(String value) {
        this.examSrcSystem = value;
    }

    /**
     * Gets the value of the examTrnBranchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMTrnBranchId() {
        return examTrnBranchId;
    }

    /**
     * Sets the value of the examTrnBranchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMTrnBranchId(String value) {
        this.examTrnBranchId = value;
    }

    /**
     * Gets the value of the examTellerOvrRide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMTellerOvrRide() {
        return examTellerOvrRide;
    }

    /**
     * Sets the value of the examTellerOvrRide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMTellerOvrRide(String value) {
        this.examTellerOvrRide = value;
    }

    /**
     * Gets the value of the examSuprOvrRide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSuprOvrRide() {
        return examSuprOvrRide;
    }

    /**
     * Sets the value of the examSuprOvrRide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSuprOvrRide(String value) {
        this.examSuprOvrRide = value;
    }

    /**
     * Gets the value of the examSuprOvrRideID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSuprOvrRideID() {
        return examSuprOvrRideID;
    }

    /**
     * Sets the value of the examSuprOvrRideID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSuprOvrRideID(String value) {
        this.examSuprOvrRideID = value;
    }

    /**
     * Gets the value of the examReleaseAcctInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMReleaseAcctInd() {
        return examReleaseAcctInd;
    }

    /**
     * Sets the value of the examReleaseAcctInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMReleaseAcctInd(String value) {
        this.examReleaseAcctInd = value;
    }

    /**
     * Gets the value of the examManFEOvrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMManFEOvrd() {
        return examManFEOvrd;
    }

    /**
     * Sets the value of the examManFEOvrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMManFEOvrd(String value) {
        this.examManFEOvrd = value;
    }

    /**
     * Gets the value of the examBranchUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBranchUserId() {
        return examBranchUserId;
    }

    /**
     * Sets the value of the examBranchUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBranchUserId(String value) {
        this.examBranchUserId = value;
    }

    /**
     * Gets the value of the examFrontEndOvrRide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMFrontEndOvrRide() {
        return examFrontEndOvrRide;
    }

    /**
     * Sets the value of the examFrontEndOvrRide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMFrontEndOvrRide(String value) {
        this.examFrontEndOvrRide = value;
    }

    /**
     * Gets the value of the examFrontEndSuprId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMFrontEndSuprId() {
        return examFrontEndSuprId;
    }

    /**
     * Sets the value of the examFrontEndSuprId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMFrontEndSuprId(String value) {
        this.examFrontEndSuprId = value;
    }

}
