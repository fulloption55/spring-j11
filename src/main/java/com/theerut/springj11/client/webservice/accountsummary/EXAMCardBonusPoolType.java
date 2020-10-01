
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
 * <p>Java class for EXAM_CardBonusPool_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_CardBonusPool_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PoolID" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PoolName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RedeemAmount" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AwardAmount" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BalanceAmount" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EEBBalance" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EEBDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_CardBonusPool_Type", propOrder = {
    "examPoolID",
    "examPoolName",
    "examRedeemAmount",
    "examAwardAmount",
    "examBalanceAmount",
    "exameebBalance",
    "exameebDate"
})
public class EXAMCardBonusPoolType {

    @XmlElement(name = "EXAM_PoolID")
    protected String examPoolID;
    @XmlElement(name = "EXAM_PoolName")
    protected String examPoolName;
    @XmlElement(name = "EXAM_RedeemAmount")
    protected BigDecimal examRedeemAmount;
    @XmlElement(name = "EXAM_AwardAmount")
    protected BigDecimal examAwardAmount;
    @XmlElement(name = "EXAM_BalanceAmount")
    protected BigDecimal examBalanceAmount;
    @XmlElement(name = "EXAM_EEBBalance")
    protected BigDecimal exameebBalance;
    @XmlElement(name = "EXAM_EEBDate", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate exameebDate;

    /**
     * Gets the value of the examPoolID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPoolID() {
        return examPoolID;
    }

    /**
     * Sets the value of the examPoolID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPoolID(String value) {
        this.examPoolID = value;
    }

    /**
     * Gets the value of the examPoolName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPoolName() {
        return examPoolName;
    }

    /**
     * Sets the value of the examPoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPoolName(String value) {
        this.examPoolName = value;
    }

    /**
     * Gets the value of the examRedeemAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMRedeemAmount() {
        return examRedeemAmount;
    }

    /**
     * Sets the value of the examRedeemAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMRedeemAmount(BigDecimal value) {
        this.examRedeemAmount = value;
    }

    /**
     * Gets the value of the examAwardAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMAwardAmount() {
        return examAwardAmount;
    }

    /**
     * Sets the value of the examAwardAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMAwardAmount(BigDecimal value) {
        this.examAwardAmount = value;
    }

    /**
     * Gets the value of the examBalanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMBalanceAmount() {
        return examBalanceAmount;
    }

    /**
     * Sets the value of the examBalanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMBalanceAmount(BigDecimal value) {
        this.examBalanceAmount = value;
    }

    /**
     * Gets the value of the exameebBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMEEBBalance() {
        return exameebBalance;
    }

    /**
     * Sets the value of the exameebBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMEEBBalance(BigDecimal value) {
        this.exameebBalance = value;
    }

    /**
     * Gets the value of the exameebDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMEEBDate() {
        return exameebDate;
    }

    /**
     * Sets the value of the exameebDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEEBDate(LocalDate value) {
        this.exameebDate = value;
    }

}
