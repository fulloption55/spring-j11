
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Java class for EXAM_Fee_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_Fee_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FeeType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Amt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurRate" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Desc" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BaseEquAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_GSTFeeInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MidvalueUSD" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_FeeWaiver" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_FeeAcctFromInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_FeeAcctToInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ForExInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ChargeCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_Fee_Type", propOrder = {
    "feeType",
    "amt",
    "curCode",
    "curRate",
    "curAmt",
    "desc",
    "examBaseEquAmt",
    "examgstFeeInfo",
    "examMidvalueUSD",
    "examFeeWaiver",
    "examFeeAcctFromInfo",
    "examFeeAcctToInfo",
    "examForExInfo",
    "examChargeCode"
})
@XmlSeeAlso({
    EXAMChargeType.class
})
public class EXAMFeeType {

    @XmlElement(name = "FeeType")
    protected String feeType;
    @XmlElement(name = "Amt")
    protected BigDecimal amt;
    @XmlElement(name = "CurCode")
    protected String curCode;
    @XmlElement(name = "CurRate")
    protected BigDecimal curRate;
    @XmlElement(name = "CurAmt")
    protected CurAmtType curAmt;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "EXAM_BaseEquAmt")
    protected CurAmtType examBaseEquAmt;
    @XmlElement(name = "EXAM_GSTFeeInfo")
    protected EXAMGSTFeeType examgstFeeInfo;
    @XmlElement(name = "EXAM_MidvalueUSD")
    protected BigDecimal examMidvalueUSD;
    @XmlElement(name = "EXAM_FeeWaiver")
    protected String examFeeWaiver;
    @XmlElement(name = "EXAM_FeeAcctFromInfo")
    protected DepAcctIdType examFeeAcctFromInfo;
    @XmlElement(name = "EXAM_FeeAcctToInfo")
    protected DepAcctIdType examFeeAcctToInfo;
    @XmlElement(name = "EXAM_ForExInfo")
    protected EXAMForExInfoType examForExInfo;
    @XmlElement(name = "EXAM_ChargeCode")
    protected String examChargeCode;

    /**
     * Gets the value of the feeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeType() {
        return feeType;
    }

    /**
     * Sets the value of the feeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeType(String value) {
        this.feeType = value;
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
     * Gets the value of the examgstFeeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMGSTFeeType }
     *     
     */
    public EXAMGSTFeeType getEXAMGSTFeeInfo() {
        return examgstFeeInfo;
    }

    /**
     * Sets the value of the examgstFeeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMGSTFeeType }
     *     
     */
    public void setEXAMGSTFeeInfo(EXAMGSTFeeType value) {
        this.examgstFeeInfo = value;
    }

    /**
     * Gets the value of the examMidvalueUSD property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMMidvalueUSD() {
        return examMidvalueUSD;
    }

    /**
     * Sets the value of the examMidvalueUSD property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMMidvalueUSD(BigDecimal value) {
        this.examMidvalueUSD = value;
    }

    /**
     * Gets the value of the examFeeWaiver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMFeeWaiver() {
        return examFeeWaiver;
    }

    /**
     * Sets the value of the examFeeWaiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMFeeWaiver(String value) {
        this.examFeeWaiver = value;
    }

    /**
     * Gets the value of the examFeeAcctFromInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DepAcctIdType }
     *     
     */
    public DepAcctIdType getEXAMFeeAcctFromInfo() {
        return examFeeAcctFromInfo;
    }

    /**
     * Sets the value of the examFeeAcctFromInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAcctIdType }
     *     
     */
    public void setEXAMFeeAcctFromInfo(DepAcctIdType value) {
        this.examFeeAcctFromInfo = value;
    }

    /**
     * Gets the value of the examFeeAcctToInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DepAcctIdType }
     *     
     */
    public DepAcctIdType getEXAMFeeAcctToInfo() {
        return examFeeAcctToInfo;
    }

    /**
     * Sets the value of the examFeeAcctToInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAcctIdType }
     *     
     */
    public void setEXAMFeeAcctToInfo(DepAcctIdType value) {
        this.examFeeAcctToInfo = value;
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
     * Gets the value of the examChargeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMChargeCode() {
        return examChargeCode;
    }

    /**
     * Sets the value of the examChargeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMChargeCode(String value) {
        this.examChargeCode = value;
    }

}
