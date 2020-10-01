
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Java class for CurrencyAmount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyAmount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Amt"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurCode" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CurRate"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CurConvertRule"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyAmount", propOrder = {
    "amt",
    "curCode",
    "curRate",
    "curConvertRule"
})
@XmlSeeAlso({
    InvoicePremiumType.class,
    LowCurAmtType.class,
    DomXferFeeCurAmtType.class,
    IntlXferFeeCurAmtType.class,
    TotalCurAmtType.class,
    CurAmtType.class
})
public class CurrencyAmount {

    @XmlElement(name = "Amt", required = true)
    protected BigDecimal amt;
    @XmlElement(name = "CurCode")
    protected String curCode;
    @XmlElement(name = "CurRate")
    protected BigDecimal curRate;
    @XmlElement(name = "CurConvertRule")
    protected String curConvertRule;

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
     * Gets the value of the curConvertRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurConvertRule() {
        return curConvertRule;
    }

    /**
     * Sets the value of the curConvertRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurConvertRule(String value) {
        this.curConvertRule = value;
    }

}
