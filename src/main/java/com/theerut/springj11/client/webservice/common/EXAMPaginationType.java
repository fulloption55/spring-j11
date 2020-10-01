
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EXAM_Pagination_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_Pagination_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EXAM_ServiceName" type="{urn:ifxforum-org:XSD:1}EXAM_ServiceName_Type" minOccurs="0"/>
 *         &lt;element name="EXAM_AtomicServiceName" type="{urn:ifxforum-org:XSD:1}EXAM_ServiceName_Type" minOccurs="0"/>
 *         &lt;element name="EXAM_PaginationKey" type="{urn:ifxforum-org:XSD:1}NC" minOccurs="0"/>
 *         &lt;element name="EXAM_ProviderPaginationKey" type="{urn:ifxforum-org:XSD:1}NC" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PageNumber" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SeqNum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Indicator" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PostingOrder" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PostedDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_StartDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EndDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TrnType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_FromAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ToAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TrnCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_Pagination_Type", propOrder = {
    "examServiceName",
    "examAtomicServiceName",
    "examPaginationKey",
    "examProviderPaginationKey",
    "acctId",
    "acctType",
    "examPageNumber",
    "seqNum",
    "examIndicator",
    "examPostingOrder",
    "postedDt",
    "examStartDt",
    "examEndDt",
    "trnType",
    "examFromAmt",
    "examToAmt",
    "examTrnCode"
})
public class EXAMPaginationType {

    @XmlElement(name = "EXAM_ServiceName")
    protected String examServiceName;
    @XmlElement(name = "EXAM_AtomicServiceName")
    protected String examAtomicServiceName;
    @XmlElement(name = "EXAM_PaginationKey")
    protected String examPaginationKey;
    @XmlElement(name = "EXAM_ProviderPaginationKey")
    protected String examProviderPaginationKey;
    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "AcctType")
    protected String acctType;
    @XmlElement(name = "EXAM_PageNumber")
    protected Long examPageNumber;
    @XmlElement(name = "SeqNum")
    protected Long seqNum;
    @XmlElement(name = "EXAM_Indicator")
    protected String examIndicator;
    @XmlElement(name = "EXAM_PostingOrder")
    protected String examPostingOrder;
    @XmlElement(name = "PostedDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar postedDt;
    @XmlElement(name = "EXAM_StartDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar examStartDt;
    @XmlElement(name = "EXAM_EndDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar examEndDt;
    @XmlElement(name = "TrnType")
    protected String trnType;
    @XmlElement(name = "EXAM_FromAmt")
    protected CurAmtType examFromAmt;
    @XmlElement(name = "EXAM_ToAmt")
    protected CurAmtType examToAmt;
    @XmlElement(name = "EXAM_TrnCode")
    protected String examTrnCode;

    /**
     * Gets the value of the examServiceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMServiceName() {
        return examServiceName;
    }

    /**
     * Sets the value of the examServiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMServiceName(String value) {
        this.examServiceName = value;
    }

    /**
     * Gets the value of the examAtomicServiceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMAtomicServiceName() {
        return examAtomicServiceName;
    }

    /**
     * Sets the value of the examAtomicServiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMAtomicServiceName(String value) {
        this.examAtomicServiceName = value;
    }

    /**
     * Gets the value of the examPaginationKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPaginationKey() {
        return examPaginationKey;
    }

    /**
     * Sets the value of the examPaginationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPaginationKey(String value) {
        this.examPaginationKey = value;
    }

    /**
     * Gets the value of the examProviderPaginationKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMProviderPaginationKey() {
        return examProviderPaginationKey;
    }

    /**
     * Sets the value of the examProviderPaginationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMProviderPaginationKey(String value) {
        this.examProviderPaginationKey = value;
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
     * Gets the value of the examPageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEXAMPageNumber() {
        return examPageNumber;
    }

    /**
     * Sets the value of the examPageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEXAMPageNumber(Long value) {
        this.examPageNumber = value;
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
     * Gets the value of the examPostingOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPostingOrder() {
        return examPostingOrder;
    }

    /**
     * Sets the value of the examPostingOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPostingOrder(String value) {
        this.examPostingOrder = value;
    }

    /**
     * Gets the value of the postedDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPostedDt() {
        return postedDt;
    }

    /**
     * Sets the value of the postedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPostedDt(XMLGregorianCalendar value) {
        this.postedDt = value;
    }

    /**
     * Gets the value of the examStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEXAMStartDt() {
        return examStartDt;
    }

    /**
     * Sets the value of the examStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEXAMStartDt(XMLGregorianCalendar value) {
        this.examStartDt = value;
    }

    /**
     * Gets the value of the examEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEXAMEndDt() {
        return examEndDt;
    }

    /**
     * Sets the value of the examEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEXAMEndDt(XMLGregorianCalendar value) {
        this.examEndDt = value;
    }

    /**
     * Gets the value of the trnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnType() {
        return trnType;
    }

    /**
     * Sets the value of the trnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnType(String value) {
        this.trnType = value;
    }

    /**
     * Gets the value of the examFromAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurAmtType }
     *     
     */
    public CurAmtType getEXAMFromAmt() {
        return examFromAmt;
    }

    /**
     * Sets the value of the examFromAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmtType }
     *     
     */
    public void setEXAMFromAmt(CurAmtType value) {
        this.examFromAmt = value;
    }

    /**
     * Gets the value of the examToAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurAmtType }
     *     
     */
    public CurAmtType getEXAMToAmt() {
        return examToAmt;
    }

    /**
     * Sets the value of the examToAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmtType }
     *     
     */
    public void setEXAMToAmt(CurAmtType value) {
        this.examToAmt = value;
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

}
