
package com.theerut.springj11.client.webservice.accountsummary;

import com.theerut.springj11.utils.LocalDateAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.time.LocalDate;


/**
 * <p>Java class for EXAM_CashLiteDtlInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_CashLiteDtlInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Term" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BillingCycleDate" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_InstAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IntEarnedAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_UnbilledIntBal" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PrincipalAmtBal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_CashLiteDtlInfo_Type", propOrder = {
    "examTerm",
    "examBillingCycleDate",
    "examInstAmt",
    "examIntEarnedAmt",
    "examUnbilledIntBal",
    "examPrincipalAmtBal"
})
public class EXAMCashLiteDtlInfoType {

    @XmlElement(name = "EXAM_Term")
    protected Long examTerm;
    @XmlElement(name = "EXAM_BillingCycleDate", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examBillingCycleDate;
    @XmlElement(name = "EXAM_InstAmt")
    protected BigDecimal examInstAmt;
    @XmlElement(name = "EXAM_IntEarnedAmt")
    protected BigDecimal examIntEarnedAmt;
    @XmlElement(name = "EXAM_UnbilledIntBal")
    protected BigDecimal examUnbilledIntBal;
    @XmlElement(name = "EXAM_PrincipalAmtBal")
    protected BigDecimal examPrincipalAmtBal;

    /**
     * Gets the value of the examTerm property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEXAMTerm() {
        return examTerm;
    }

    /**
     * Sets the value of the examTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEXAMTerm(Long value) {
        this.examTerm = value;
    }

    /**
     * Gets the value of the examBillingCycleDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMBillingCycleDate() {
        return examBillingCycleDate;
    }

    /**
     * Sets the value of the examBillingCycleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBillingCycleDate(LocalDate value) {
        this.examBillingCycleDate = value;
    }

    /**
     * Gets the value of the examInstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMInstAmt() {
        return examInstAmt;
    }

    /**
     * Sets the value of the examInstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMInstAmt(BigDecimal value) {
        this.examInstAmt = value;
    }

    /**
     * Gets the value of the examIntEarnedAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMIntEarnedAmt() {
        return examIntEarnedAmt;
    }

    /**
     * Sets the value of the examIntEarnedAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMIntEarnedAmt(BigDecimal value) {
        this.examIntEarnedAmt = value;
    }

    /**
     * Gets the value of the examUnbilledIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMUnbilledIntBal() {
        return examUnbilledIntBal;
    }

    /**
     * Sets the value of the examUnbilledIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMUnbilledIntBal(BigDecimal value) {
        this.examUnbilledIntBal = value;
    }

    /**
     * Gets the value of the examPrincipalAmtBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMPrincipalAmtBal() {
        return examPrincipalAmtBal;
    }

    /**
     * Sets the value of the examPrincipalAmtBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMPrincipalAmtBal(BigDecimal value) {
        this.examPrincipalAmtBal = value;
    }

}
