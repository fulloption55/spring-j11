
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;


/**
 * <p>Java class for EXAM_GSTFee_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_GSTFee_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RefId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Amt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurRate" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TaxCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TaxRate" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TaxReliefInd" minOccurs="0"/>
 *         &lt;element name="EXAM_TaxAmtInd" type="{urn:ifxforum-org:XSD:1}TaxType_Type" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BaseEquAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_GLRefNum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_UIDRegNum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_InvoiceDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_GSTChargeType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_InvoiceNum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OrigGSTRefNum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_GSTTreatment" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_GSTInclusive" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_GLAcctInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ChrgCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_GSTFee_Type", propOrder = {
    "refId",
    "amt",
    "curCode",
    "curRate",
    "curAmt",
    "examTaxCode",
    "examTaxRate",
    "examTaxReliefInd",
    "examTaxAmtInd",
    "examBaseEquAmt",
    "examglRefNum",
    "examcifRegNum",
    "examInvoiceDt",
    "examgstChargeType",
    "examInvoiceNum",
    "examOrigGSTRefNum",
    "examgstTreatment",
    "examgstInclusive",
    "examglAcctInfo",
    "examChrgCode"
})
public class EXAMGSTFeeType {

    @XmlElement(name = "RefId")
    protected String refId;
    @XmlElement(name = "Amt")
    protected BigDecimal amt;
    @XmlElement(name = "CurCode")
    protected String curCode;
    @XmlElement(name = "CurRate")
    protected BigDecimal curRate;
    @XmlElement(name = "CurAmt")
    protected CurAmtType curAmt;
    @XmlElement(name = "EXAM_TaxCode")
    protected String examTaxCode;
    @XmlElement(name = "EXAM_TaxRate")
    protected BigDecimal examTaxRate;
    @XmlElement(name = "EXAM_TaxReliefInd")
    protected String examTaxReliefInd;
    @XmlElement(name = "EXAM_TaxAmtInd")
    protected String examTaxAmtInd;
    @XmlElement(name = "EXAM_BaseEquAmt")
    protected CurAmtType examBaseEquAmt;
    @XmlElement(name = "EXAM_GLRefNum")
    protected String examglRefNum;
    @XmlElement(name = "EXAM_UIDRegNum")
    protected String examcifRegNum;
    @XmlElement(name = "EXAM_InvoiceDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar examInvoiceDt;
    @XmlElement(name = "EXAM_GSTChargeType")
    protected String examgstChargeType;
    @XmlElement(name = "EXAM_InvoiceNum")
    protected String examInvoiceNum;
    @XmlElement(name = "EXAM_OrigGSTRefNum")
    protected String examOrigGSTRefNum;
    @XmlElement(name = "EXAM_GSTTreatment")
    protected String examgstTreatment;
    @XmlElement(name = "EXAM_GSTInclusive")
    protected String examgstInclusive;
    @XmlElement(name = "EXAM_GLAcctInfo")
    protected DepAcctIdType examglAcctInfo;
    @XmlElement(name = "EXAM_ChrgCode")
    protected String examChrgCode;

    /**
     * Gets the value of the refId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefId() {
        return refId;
    }

    /**
     * Sets the value of the refId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefId(String value) {
        this.refId = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmt(BigDecimal value) {
        this.amt = value;
    }

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
     * Gets the value of the curRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurRate() {
        return curRate;
    }

    /**
     * Sets the value of the curRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurRate(BigDecimal value) {
        this.curRate = value;
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
     * Gets the value of the examTaxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMTaxCode() {
        return examTaxCode;
    }

    /**
     * Sets the value of the examTaxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMTaxCode(String value) {
        this.examTaxCode = value;
    }

    /**
     * Gets the value of the examTaxRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMTaxRate() {
        return examTaxRate;
    }

    /**
     * Sets the value of the examTaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMTaxRate(BigDecimal value) {
        this.examTaxRate = value;
    }

    /**
     * Gets the value of the examTaxReliefInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMTaxReliefInd() {
        return examTaxReliefInd;
    }

    /**
     * Sets the value of the examTaxReliefInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMTaxReliefInd(String value) {
        this.examTaxReliefInd = value;
    }

    /**
     * Gets the value of the examTaxAmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMTaxAmtInd() {
        return examTaxAmtInd;
    }

    /**
     * Sets the value of the examTaxAmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMTaxAmtInd(String value) {
        this.examTaxAmtInd = value;
    }

    /**
     * Gets the value of the examBaseEquAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurAmtType }
     *     
     */
    public CurAmtType getEXAMBaseEquAmt() {
        return examBaseEquAmt;
    }

    /**
     * Sets the value of the examBaseEquAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmtType }
     *     
     */
    public void setEXAMBaseEquAmt(CurAmtType value) {
        this.examBaseEquAmt = value;
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
     * Gets the value of the examcifRegNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMUIDRegNum() {
        return examcifRegNum;
    }

    /**
     * Sets the value of the examcifRegNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMUIDRegNum(String value) {
        this.examcifRegNum = value;
    }

    /**
     * Gets the value of the examInvoiceDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEXAMInvoiceDt() {
        return examInvoiceDt;
    }

    /**
     * Sets the value of the examInvoiceDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEXAMInvoiceDt(XMLGregorianCalendar value) {
        this.examInvoiceDt = value;
    }

    /**
     * Gets the value of the examgstChargeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMGSTChargeType() {
        return examgstChargeType;
    }

    /**
     * Sets the value of the examgstChargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMGSTChargeType(String value) {
        this.examgstChargeType = value;
    }

    /**
     * Gets the value of the examInvoiceNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMInvoiceNum() {
        return examInvoiceNum;
    }

    /**
     * Sets the value of the examInvoiceNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMInvoiceNum(String value) {
        this.examInvoiceNum = value;
    }

    /**
     * Gets the value of the examOrigGSTRefNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOrigGSTRefNum() {
        return examOrigGSTRefNum;
    }

    /**
     * Sets the value of the examOrigGSTRefNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOrigGSTRefNum(String value) {
        this.examOrigGSTRefNum = value;
    }

    /**
     * Gets the value of the examgstTreatment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMGSTTreatment() {
        return examgstTreatment;
    }

    /**
     * Sets the value of the examgstTreatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMGSTTreatment(String value) {
        this.examgstTreatment = value;
    }

    /**
     * Gets the value of the examgstInclusive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMGSTInclusive() {
        return examgstInclusive;
    }

    /**
     * Sets the value of the examgstInclusive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMGSTInclusive(String value) {
        this.examgstInclusive = value;
    }

    /**
     * Gets the value of the examglAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DepAcctIdType }
     *     
     */
    public DepAcctIdType getEXAMGLAcctInfo() {
        return examglAcctInfo;
    }

    /**
     * Sets the value of the examglAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAcctIdType }
     *     
     */
    public void setEXAMGLAcctInfo(DepAcctIdType value) {
        this.examglAcctInfo = value;
    }

    /**
     * Gets the value of the examChrgCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMChrgCode() {
        return examChrgCode;
    }

    /**
     * Sets the value of the examChrgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMChrgCode(String value) {
        this.examChrgCode = value;
    }

}
