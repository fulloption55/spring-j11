
package com.theerut.springj11.client.webservice.accountsummary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXAM_CreditCardInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_CreditCardInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CreditCardCompany" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CreditCardNo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CreditCardLimit" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CreditCardJoinYr" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BankorBrchHold" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TyeOfAcct" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AcctNo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_CreditCardInfo_Type", propOrder = {
    "examCreditCardCompany",
    "examCreditCardNo",
    "examCreditCardLimit",
    "examCreditCardJoinYr",
    "examBankorBrchHold",
    "examTyeOfAcct",
    "examAcctNo"
})
public class EXAMCreditCardInfoType {

    @XmlElement(name = "EXAM_CreditCardCompany")
    protected String examCreditCardCompany;
    @XmlElement(name = "EXAM_CreditCardNo")
    protected String examCreditCardNo;
    @XmlElement(name = "EXAM_CreditCardLimit")
    protected String examCreditCardLimit;
    @XmlElement(name = "EXAM_CreditCardJoinYr")
    protected String examCreditCardJoinYr;
    @XmlElement(name = "EXAM_BankorBrchHold")
    protected String examBankorBrchHold;
    @XmlElement(name = "EXAM_TyeOfAcct")
    protected String examTyeOfAcct;
    @XmlElement(name = "EXAM_AcctNo")
    protected String examAcctNo;

    /**
     * Gets the value of the examCreditCardCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCreditCardCompany() {
        return examCreditCardCompany;
    }

    /**
     * Sets the value of the examCreditCardCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCreditCardCompany(String value) {
        this.examCreditCardCompany = value;
    }

    /**
     * Gets the value of the examCreditCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCreditCardNo() {
        return examCreditCardNo;
    }

    /**
     * Sets the value of the examCreditCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCreditCardNo(String value) {
        this.examCreditCardNo = value;
    }

    /**
     * Gets the value of the examCreditCardLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCreditCardLimit() {
        return examCreditCardLimit;
    }

    /**
     * Sets the value of the examCreditCardLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCreditCardLimit(String value) {
        this.examCreditCardLimit = value;
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
     * Gets the value of the examTyeOfAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMTyeOfAcct() {
        return examTyeOfAcct;
    }

    /**
     * Sets the value of the examTyeOfAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMTyeOfAcct(String value) {
        this.examTyeOfAcct = value;
    }

    /**
     * Gets the value of the examAcctNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMAcctNo() {
        return examAcctNo;
    }

    /**
     * Sets the value of the examAcctNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMAcctNo(String value) {
        this.examAcctNo = value;
    }

}
