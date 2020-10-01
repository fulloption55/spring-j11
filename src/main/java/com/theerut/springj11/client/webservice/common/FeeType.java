
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Java class for Fee_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Fee_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FeeType"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Rate" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MinCurAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MaxCurAmt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fee_Type", propOrder = {
    "feeType",
    "curAmt",
    "rate",
    "minCurAmt",
    "maxCurAmt"
})
public class FeeType {

    @XmlElement(name = "FeeType", required = true)
    protected String feeType;
    @XmlElement(name = "CurAmt")
    protected CurAmtType curAmt;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "MinCurAmt")
    protected CurrencyAmount minCurAmt;
    @XmlElement(name = "MaxCurAmt")
    protected CurrencyAmount maxCurAmt;

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

}
