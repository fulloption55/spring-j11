
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for EXAM_XferInfoAlt_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_XferInfoAlt_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_XferFromInfo"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_XferToInfo" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Category" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Fee" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CompositeCurAmt" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ChgDrAcctId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PaymentPurpose" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PaymentMode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PaymentFeeMode" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}RefInfo" minOccurs="0"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}FullName" minOccurs="0"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}Memo" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_FeeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MerchantId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CardVrfyData" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CVV2Ind" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ChannelTrnRefNm" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Indicator" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EarmarkRefNum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ContractNum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EffDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TrnDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TrnCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CallCenterId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ChargesList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_UserId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustSegmentCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_FacilityId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ForExInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ControlUnit" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_GLSourceID" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PurposeCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Amt" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SystemRefNum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ScndValInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IsResident" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ProductType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ShariahCompl" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ApprovalCd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CaptureDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BusinessCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Desc" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Desc" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_XferInfoAlt_Type", propOrder = {
    "examXferFromInfo",
    "examXferToInfo",
    "category",
    "fee",
    "examCompositeCurAmt",
    "examChgDrAcctId",
    "examPaymentPurpose",
    "examPaymentMode",
    "examPaymentFeeMode",
    "refInfo",
    "fullName",
    "memo",
    "examFeeInfo",
    "examMerchantId",
    "examCardVrfyData",
    "examcvv2Ind",
    "examChannelTrnRefNm",
    "examIndicator",
    "examEarmarkRefNum",
    "examContractNum",
    "examEffDt",
    "examTrnDt",
    "examTrnCode",
    "examCallCenterId",
    "examChargesList",
    "examUserId",
    "examCustSegmentCode",
    "examFacilityId",
    "examForExInfo",
    "examControlUnit",
    "examglSourceID",
    "examPurposeCode",
    "examAmt",
    "examSystemRefNum",
    "examScndValInd",
    "examIsResident",
    "examProductType",
    "examShariahCompl",
    "custType",
    "examApprovalCd",
    "examCaptureDt",
    "examBusinessCode",
    "desc",
    "examDesc"
})
public class EXAMXferInfoAltType {

    @XmlElement(name = "EXAM_XferFromInfo", required = true)
    protected EXAMXferInfoType examXferFromInfo;
    @XmlElement(name = "EXAM_XferToInfo", required = true)
    protected List<EXAMXferInfoType> examXferToInfo;
    @XmlElement(name = "Category")
    protected String category;
    @XmlElement(name = "Fee")
    protected FeeType fee;
    @XmlElement(name = "EXAM_CompositeCurAmt")
    protected List<EXAMCompositeCurAmtType> examCompositeCurAmt;
    @XmlElement(name = "EXAM_ChgDrAcctId")
    protected String examChgDrAcctId;
    @XmlElement(name = "EXAM_PaymentPurpose")
    protected String examPaymentPurpose;
    @XmlElement(name = "EXAM_PaymentMode")
    protected String examPaymentMode;
    @XmlElement(name = "EXAM_PaymentFeeMode")
    protected String examPaymentFeeMode;
    @XmlElement(name = "RefInfo")
    protected RefInfoType refInfo;
    @XmlElement(name = "FullName")
    protected String fullName;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "EXAM_FeeInfo")
    protected List<EXAMFeeType> examFeeInfo;
    @XmlElement(name = "EXAM_MerchantId")
    protected String examMerchantId;
    @XmlElement(name = "EXAM_CardVrfyData")
    protected String examCardVrfyData;
    @XmlElement(name = "EXAM_CVV2Ind")
    protected String examcvv2Ind;
    @XmlElement(name = "EXAM_ChannelTrnRefNm")
    protected String examChannelTrnRefNm;
    @XmlElement(name = "EXAM_Indicator")
    protected String examIndicator;
    @XmlElement(name = "EXAM_EarmarkRefNum")
    protected String examEarmarkRefNum;
    @XmlElement(name = "EXAM_ContractNum")
    protected String examContractNum;
    @XmlElement(name = "EXAM_EffDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar examEffDt;
    @XmlElement(name = "EXAM_TrnDt")
    protected String examTrnDt;
    @XmlElement(name = "EXAM_TrnCode")
    protected String examTrnCode;
    @XmlElement(name = "EXAM_CallCenterId")
    protected String examCallCenterId;
    @XmlElement(name = "EXAM_ChargesList")
    protected List<EXAMChargesListType> examChargesList;
    @XmlElement(name = "EXAM_UserId")
    protected String examUserId;
    @XmlElement(name = "EXAM_CustSegmentCode")
    protected String examCustSegmentCode;
    @XmlElement(name = "EXAM_FacilityId")
    protected String examFacilityId;
    @XmlElement(name = "EXAM_ForExInfo")
    protected EXAMForExInfoType examForExInfo;
    @XmlElement(name = "EXAM_ControlUnit")
    protected String examControlUnit;
    @XmlElement(name = "EXAM_GLSourceID")
    protected String examglSourceID;
    @XmlElement(name = "EXAM_PurposeCode")
    protected String examPurposeCode;
    @XmlElement(name = "EXAM_Amt")
    protected List<EXAMAmtType> examAmt;
    @XmlElement(name = "EXAM_SystemRefNum")
    protected String examSystemRefNum;
    @XmlElement(name = "EXAM_ScndValInd")
    protected String examScndValInd;
    @XmlElement(name = "EXAM_IsResident")
    protected String examIsResident;
    @XmlElement(name = "EXAM_ProductType")
    protected String examProductType;
    @XmlElement(name = "EXAM_ShariahCompl")
    protected String examShariahCompl;
    @XmlElement(name = "CustType")
    protected String custType;
    @XmlElement(name = "EXAM_ApprovalCd")
    protected String examApprovalCd;
    @XmlElement(name = "EXAM_CaptureDt")
    protected String examCaptureDt;
    @XmlElement(name = "EXAM_BusinessCode")
    protected String examBusinessCode;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "EXAM_Desc")
    protected String examDesc;

    /**
     * Gets the value of the examXferFromInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMXferInfoType }
     *     
     */
    public EXAMXferInfoType getEXAMXferFromInfo() {
        return examXferFromInfo;
    }

    /**
     * Sets the value of the examXferFromInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMXferInfoType }
     *     
     */
    public void setEXAMXferFromInfo(EXAMXferInfoType value) {
        this.examXferFromInfo = value;
    }

    /**
     * Gets the value of the examXferToInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examXferToInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMXferToInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMXferInfoType }
     * 
     * 
     */
    public List<EXAMXferInfoType> getEXAMXferToInfo() {
        if (examXferToInfo == null) {
            examXferToInfo = new ArrayList<>();
        }
        return this.examXferToInfo;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link FeeType }
     *     
     */
    public FeeType getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeType }
     *     
     */
    public void setFee(FeeType value) {
        this.fee = value;
    }

    /**
     * Gets the value of the examCompositeCurAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examCompositeCurAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMCompositeCurAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMCompositeCurAmtType }
     * 
     * 
     */
    public List<EXAMCompositeCurAmtType> getEXAMCompositeCurAmt() {
        if (examCompositeCurAmt == null) {
            examCompositeCurAmt = new ArrayList<>();
        }
        return this.examCompositeCurAmt;
    }

    /**
     * Gets the value of the examChgDrAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMChgDrAcctId() {
        return examChgDrAcctId;
    }

    /**
     * Sets the value of the examChgDrAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMChgDrAcctId(String value) {
        this.examChgDrAcctId = value;
    }

    /**
     * Gets the value of the examPaymentPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPaymentPurpose() {
        return examPaymentPurpose;
    }

    /**
     * Sets the value of the examPaymentPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPaymentPurpose(String value) {
        this.examPaymentPurpose = value;
    }

    /**
     * Gets the value of the examPaymentMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPaymentMode() {
        return examPaymentMode;
    }

    /**
     * Sets the value of the examPaymentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPaymentMode(String value) {
        this.examPaymentMode = value;
    }

    /**
     * Gets the value of the examPaymentFeeMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPaymentFeeMode() {
        return examPaymentFeeMode;
    }

    /**
     * Sets the value of the examPaymentFeeMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPaymentFeeMode(String value) {
        this.examPaymentFeeMode = value;
    }

    /**
     * Gets the value of the refInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RefInfoType }
     *     
     */
    public RefInfoType getRefInfo() {
        return refInfo;
    }

    /**
     * Sets the value of the refInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefInfoType }
     *     
     */
    public void setRefInfo(RefInfoType value) {
        this.refInfo = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
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
     * Gets the value of the examFeeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examFeeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMFeeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMFeeType }
     * 
     * 
     */
    public List<EXAMFeeType> getEXAMFeeInfo() {
        if (examFeeInfo == null) {
            examFeeInfo = new ArrayList<>();
        }
        return this.examFeeInfo;
    }

    /**
     * Gets the value of the examMerchantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMerchantId() {
        return examMerchantId;
    }

    /**
     * Sets the value of the examMerchantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMerchantId(String value) {
        this.examMerchantId = value;
    }

    /**
     * Gets the value of the examCardVrfyData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCardVrfyData() {
        return examCardVrfyData;
    }

    /**
     * Sets the value of the examCardVrfyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCardVrfyData(String value) {
        this.examCardVrfyData = value;
    }

    /**
     * Gets the value of the examcvv2Ind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCVV2Ind() {
        return examcvv2Ind;
    }

    /**
     * Sets the value of the examcvv2Ind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCVV2Ind(String value) {
        this.examcvv2Ind = value;
    }

    /**
     * Gets the value of the examChannelTrnRefNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMChannelTrnRefNm() {
        return examChannelTrnRefNm;
    }

    /**
     * Sets the value of the examChannelTrnRefNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMChannelTrnRefNm(String value) {
        this.examChannelTrnRefNm = value;
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
     * Gets the value of the examEarmarkRefNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMEarmarkRefNum() {
        return examEarmarkRefNum;
    }

    /**
     * Sets the value of the examEarmarkRefNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEarmarkRefNum(String value) {
        this.examEarmarkRefNum = value;
    }

    /**
     * Gets the value of the examContractNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMContractNum() {
        return examContractNum;
    }

    /**
     * Sets the value of the examContractNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMContractNum(String value) {
        this.examContractNum = value;
    }

    /**
     * Gets the value of the examEffDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEXAMEffDt() {
        return examEffDt;
    }

    /**
     * Sets the value of the examEffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEXAMEffDt(XMLGregorianCalendar value) {
        this.examEffDt = value;
    }

    /**
     * Gets the value of the examTrnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMTrnDt() {
        return examTrnDt;
    }

    /**
     * Sets the value of the examTrnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMTrnDt(String value) {
        this.examTrnDt = value;
    }

    /**
     * Gets the value of the examTrnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMTrnCode() {
        return examTrnCode;
    }

    /**
     * Sets the value of the examTrnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMTrnCode(String value) {
        this.examTrnCode = value;
    }

    /**
     * Gets the value of the examCallCenterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCallCenterId() {
        return examCallCenterId;
    }

    /**
     * Sets the value of the examCallCenterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCallCenterId(String value) {
        this.examCallCenterId = value;
    }

    /**
     * Gets the value of the examChargesList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examChargesList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMChargesList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMChargesListType }
     * 
     * 
     */
    public List<EXAMChargesListType> getEXAMChargesList() {
        if (examChargesList == null) {
            examChargesList = new ArrayList<>();
        }
        return this.examChargesList;
    }

    /**
     * Gets the value of the examUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMUserId() {
        return examUserId;
    }

    /**
     * Sets the value of the examUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMUserId(String value) {
        this.examUserId = value;
    }

    /**
     * Gets the value of the examCustSegmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCustSegmentCode() {
        return examCustSegmentCode;
    }

    /**
     * Sets the value of the examCustSegmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCustSegmentCode(String value) {
        this.examCustSegmentCode = value;
    }

    /**
     * Gets the value of the examFacilityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMFacilityId() {
        return examFacilityId;
    }

    /**
     * Sets the value of the examFacilityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMFacilityId(String value) {
        this.examFacilityId = value;
    }

    /**
     * Gets the value of the examForExInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMForExInfoType }
     *     
     */
    public EXAMForExInfoType getEXAMForExInfo() {
        return examForExInfo;
    }

    /**
     * Sets the value of the examForExInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMForExInfoType }
     *     
     */
    public void setEXAMForExInfo(EXAMForExInfoType value) {
        this.examForExInfo = value;
    }

    /**
     * Gets the value of the examControlUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMControlUnit() {
        return examControlUnit;
    }

    /**
     * Sets the value of the examControlUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMControlUnit(String value) {
        this.examControlUnit = value;
    }

    /**
     * Gets the value of the examglSourceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMGLSourceID() {
        return examglSourceID;
    }

    /**
     * Sets the value of the examglSourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMGLSourceID(String value) {
        this.examglSourceID = value;
    }

    /**
     * Gets the value of the examPurposeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPurposeCode() {
        return examPurposeCode;
    }

    /**
     * Sets the value of the examPurposeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPurposeCode(String value) {
        this.examPurposeCode = value;
    }

    /**
     * Gets the value of the examAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMAmtType }
     * 
     * 
     */
    public List<EXAMAmtType> getEXAMAmt() {
        if (examAmt == null) {
            examAmt = new ArrayList<>();
        }
        return this.examAmt;
    }

    /**
     * Gets the value of the examSystemRefNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSystemRefNum() {
        return examSystemRefNum;
    }

    /**
     * Sets the value of the examSystemRefNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSystemRefNum(String value) {
        this.examSystemRefNum = value;
    }

    /**
     * Gets the value of the examScndValInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMScndValInd() {
        return examScndValInd;
    }

    /**
     * Sets the value of the examScndValInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMScndValInd(String value) {
        this.examScndValInd = value;
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
     * Gets the value of the examProductType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMProductType() {
        return examProductType;
    }

    /**
     * Sets the value of the examProductType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMProductType(String value) {
        this.examProductType = value;
    }

    /**
     * Gets the value of the examShariahCompl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMShariahCompl() {
        return examShariahCompl;
    }

    /**
     * Sets the value of the examShariahCompl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMShariahCompl(String value) {
        this.examShariahCompl = value;
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
     * Gets the value of the examApprovalCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMApprovalCd() {
        return examApprovalCd;
    }

    /**
     * Sets the value of the examApprovalCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMApprovalCd(String value) {
        this.examApprovalCd = value;
    }

    /**
     * Gets the value of the examCaptureDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCaptureDt() {
        return examCaptureDt;
    }

    /**
     * Sets the value of the examCaptureDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCaptureDt(String value) {
        this.examCaptureDt = value;
    }

    /**
     * Gets the value of the examBusinessCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBusinessCode() {
        return examBusinessCode;
    }

    /**
     * Sets the value of the examBusinessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBusinessCode(String value) {
        this.examBusinessCode = value;
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
     * Gets the value of the examDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMDesc() {
        return examDesc;
    }

    /**
     * Sets the value of the examDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMDesc(String value) {
        this.examDesc = value;
    }

}
