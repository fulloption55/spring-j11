
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Java class for CompositeCurAmt_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompositeCurAmt_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CompositeCurAmtId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CompositeCurAmtType"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Rate" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MinCurAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MaxCurAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SpecialHandling" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Memo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositeCurAmt_Type", propOrder = {
    "compositeCurAmtId",
    "compositeCurAmtType",
    "curAmt",
    "rate",
    "minCurAmt",
    "maxCurAmt",
    "specialHandling",
    "memo"
})
@XmlSeeAlso({
    EXAMCompositeCurAmtType.class
})
public class CompositeCurAmtType {

    @XmlElement(name = "CompositeCurAmtId")
    protected String compositeCurAmtId;
    @XmlElement(name = "CompositeCurAmtType", required = true)
    protected String compositeCurAmtType;
    @XmlElement(name = "CurAmt")
    protected CurAmtType curAmt;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "MinCurAmt")
    protected CurrencyAmount minCurAmt;
    @XmlElement(name = "MaxCurAmt")
    protected CurrencyAmount maxCurAmt;
    @XmlElement(name = "SpecialHandling")
    protected String specialHandling;
    @XmlElement(name = "Memo")
    protected String memo;

    /**
     * Gets the value of the compositeCurAmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompositeCurAmtId() {
        return compositeCurAmtId;
    }

    /**
     * Sets the value of the compositeCurAmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompositeCurAmtId(String value) {
        this.compositeCurAmtId = value;
    }

    /**
     * Gets the value of the compositeCurAmtType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompositeCurAmtType() {
        return compositeCurAmtType;
    }

    /**
     * Sets the value of the compositeCurAmtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompositeCurAmtType(String value) {
        this.compositeCurAmtType = value;
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
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the minCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getMinCurAmt() {
        return minCurAmt;
    }

    /**
     * Sets the value of the minCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setMinCurAmt(CurrencyAmount value) {
        this.minCurAmt = value;
    }

    /**
     * Gets the value of the maxCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getMaxCurAmt() {
        return maxCurAmt;
    }

    /**
     * Sets the value of the maxCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setMaxCurAmt(CurrencyAmount value) {
        this.maxCurAmt = value;
    }

    /**
     * Gets the value of the specialHandling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialHandling() {
        return specialHandling;
    }

    /**
     * Sets the value of the specialHandling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialHandling(String value) {
        this.specialHandling = value;
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

}
