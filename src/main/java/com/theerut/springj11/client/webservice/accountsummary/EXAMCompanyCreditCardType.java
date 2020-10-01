
package com.theerut.springj11.client.webservice.accountsummary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Java class for EXAM_CompanyCreditCard_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_CompanyCreditCard_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CompanyId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CardNum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CreditLimit" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CreditCardJoinYr" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BankorBrchHold" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_CompanyCreditCard_Type", propOrder = {
    "examCompanyId",
    "examCardNum",
    "examCreditLimit",
    "examCreditCardJoinYr",
    "examBankorBrchHold",
    "acctType",
    "acctId"
})
public class EXAMCompanyCreditCardType {

    @XmlElement(name = "EXAM_CompanyId")
    protected String examCompanyId;
    @XmlElement(name = "EXAM_CardNum")
    protected String examCardNum;
    @XmlElement(name = "EXAM_CreditLimit")
    protected BigDecimal examCreditLimit;
    @XmlElement(name = "EXAM_CreditCardJoinYr")
    protected String examCreditCardJoinYr;
    @XmlElement(name = "EXAM_BankorBrchHold")
    protected String examBankorBrchHold;
    @XmlElement(name = "AcctType")
    protected String acctType;
    @XmlElement(name = "AcctId")
    protected String acctId;

    /**
     * Gets the value of the examCompanyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCompanyId() {
        return examCompanyId;
    }

    /**
     * Sets the value of the examCompanyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCompanyId(String value) {
        this.examCompanyId = value;
    }

    /**
     * Gets the value of the examCardNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCardNum() {
        return examCardNum;
    }

    /**
     * Sets the value of the examCardNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCardNum(String value) {
        this.examCardNum = value;
    }

    /**
     * Gets the value of the examCreditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMCreditLimit() {
        return examCreditLimit;
    }

    /**
     * Sets the value of the examCreditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMCreditLimit(BigDecimal value) {
        this.examCreditLimit = value;
    }

    /**
     * Gets the value of the examCreditCardJoinYr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCreditCardJoinYr() {
        return examCreditCardJoinYr;
    }

    /**
     * Sets the value of the examCreditCardJoinYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCreditCardJoinYr(String value) {
        this.examCreditCardJoinYr = value;
    }

    /**
     * Gets the value of the examBankorBrchHold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBankorBrchHold() {
        return examBankorBrchHold;
    }

    /**
     * Sets the value of the examBankorBrchHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBankorBrchHold(String value) {
        this.examBankorBrchHold = value;
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

}
