
package com.theerut.springj11.client.webservice.accountsummary;

import com.theerut.springj11.client.webservice.common.CurrencyAmount;
import com.theerut.springj11.client.webservice.common.LowCurAmtType;
import com.theerut.springj11.client.webservice.common.TermType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Java class for IntRateInfo_Type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="IntRateInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Rate"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Desc" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IntAPY" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Term" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}LowCurAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}HighCurAmt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntRateInfo_Type", propOrder = {
        "rate",
        "desc",
        "intAPY",
        "term",
        "lowCurAmt",
        "highCurAmt"
})
public class IntRateInfoType {

    @XmlElement(name = "Rate", required = true)
    protected BigDecimal rate;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "IntAPY")
    protected BigDecimal intAPY;
    @XmlElement(name = "Term")
    protected TermType term;
    @XmlElement(name = "LowCurAmt")
    protected LowCurAmtType lowCurAmt;
    @XmlElement(name = "HighCurAmt")
    protected CurrencyAmount highCurAmt;

    /**
     * Gets the value of the rate property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the desc property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the intAPY property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getIntAPY() {
        return intAPY;
    }

    /**
     * Sets the value of the intAPY property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setIntAPY(BigDecimal value) {
        this.intAPY = value;
    }

    /**
     * Gets the value of the term property.
     *
     * @return possible object is
     * {@link TermType }
     */
    public TermType getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     *
     * @param value allowed object is
     *              {@link TermType }
     */
    public void setTerm(TermType value) {
        this.term = value;
    }

    /**
     * Gets the value of the lowCurAmt property.
     *
     * @return possible object is
     * {@link LowCurAmtType }
     */
    public LowCurAmtType getLowCurAmt() {
        return lowCurAmt;
    }

    /**
     * Sets the value of the lowCurAmt property.
     *
     * @param value allowed object is
     *              {@link LowCurAmtType }
     */
    public void setLowCurAmt(LowCurAmtType value) {
        this.lowCurAmt = value;
    }

    /**
     * Gets the value of the highCurAmt property.
     *
     * @return possible object is
     * {@link CurrencyAmount }
     */
    public CurrencyAmount getHighCurAmt() {
        return highCurAmt;
    }

    /**
     * Sets the value of the highCurAmt property.
     *
     * @param value allowed object is
     *              {@link CurrencyAmount }
     */
    public void setHighCurAmt(CurrencyAmount value) {
        this.highCurAmt = value;
    }

}
