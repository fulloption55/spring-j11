
package com.theerut.springj11.client.webservice.accountsummary;

import com.theerut.springj11.client.webservice.common.BankInfoType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXAM_AffAcctInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_AffAcctInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AcctName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BankAcctStatus" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AcctMode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BankInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ProductId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustPermId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_AffAcctInfo_Type", propOrder = {
    "acctType",
    "acctId",
    "examAcctName",
    "bankAcctStatus",
    "examAcctMode",
    "bankInfo",
    "productId",
    "curCode",
    "custPermId"
})
public class EXAMAffAcctInfoType {

    @XmlElement(name = "AcctType")
    protected String acctType;
    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "EXAM_AcctName")
    protected EXAMAcctNameType examAcctName;
    @XmlElement(name = "BankAcctStatus")
    protected BankAcctStatusType bankAcctStatus;
    @XmlElement(name = "EXAM_AcctMode")
    protected String examAcctMode;
    @XmlElement(name = "BankInfo")
    protected BankInfoType bankInfo;
    @XmlElement(name = "ProductId")
    protected String productId;
    @XmlElement(name = "CurCode")
    protected String curCode;
    @XmlElement(name = "CustPermId")
    protected String custPermId;

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

    /**
     * Gets the value of the examAcctName property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMAcctNameType }
     *     
     */
    public EXAMAcctNameType getEXAMAcctName() {
        return examAcctName;
    }

    /**
     * Sets the value of the examAcctName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMAcctNameType }
     *     
     */
    public void setEXAMAcctName(EXAMAcctNameType value) {
        this.examAcctName = value;
    }

    /**
     * Gets the value of the bankAcctStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BankAcctStatusType }
     *     
     */
    public BankAcctStatusType getBankAcctStatus() {
        return bankAcctStatus;
    }

    /**
     * Sets the value of the bankAcctStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAcctStatusType }
     *     
     */
    public void setBankAcctStatus(BankAcctStatusType value) {
        this.bankAcctStatus = value;
    }

    /**
     * Gets the value of the examAcctMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMAcctMode() {
        return examAcctMode;
    }

    /**
     * Sets the value of the examAcctMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMAcctMode(String value) {
        this.examAcctMode = value;
    }

    /**
     * Gets the value of the bankInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BankInfoType }
     *     
     */
    public BankInfoType getBankInfo() {
        return bankInfo;
    }

    /**
     * Sets the value of the bankInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankInfoType }
     *     
     */
    public void setBankInfo(BankInfoType value) {
        this.bankInfo = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
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
     * Gets the value of the custPermId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustPermId() {
        return custPermId;
    }

    /**
     * Sets the value of the custPermId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustPermId(String value) {
        this.custPermId = value;
    }

}
