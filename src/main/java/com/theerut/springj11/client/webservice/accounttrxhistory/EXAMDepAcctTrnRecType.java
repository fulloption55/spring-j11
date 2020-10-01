
package com.theerut.springj11.client.webservice.accounttrxhistory;

import com.theerut.springj11.client.webservice.common.CurAmtType;
import com.theerut.springj11.client.webservice.common.CurrencyAmount;
import com.theerut.springj11.client.webservice.common.DepAcctIdType;
import com.theerut.springj11.client.webservice.common.RefInfoType;
import com.theerut.springj11.utils.LocalDateAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;


/**
 * <p>Java class for EXAM_DepAcctTrnRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_DepAcctTrnRec_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TrnDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DepAcctId"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkNum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EffDt"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TrnType"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurAmt"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Desc"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StmtRunningBal" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TrnCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BankAcctTrnRec" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PostedTime" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RefInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Memo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FullName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ChannelCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_DepAcctTrnRec_Type", propOrder = {
    "trnDt",
    "depAcctId",
    "chkNum",
    "effDt",
    "trnType",
    "curAmt",
    "desc",
    "stmtRunningBal",
    "examTrnCode",
    "bankAcctTrnRec",
    "examPostedTime",
    "refInfo",
    "memo",
    "fullName",
    "examChannelCode"
})
public class EXAMDepAcctTrnRecType {

    @XmlElement(name = "TrnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar trnDt;
    @XmlElement(name = "DepAcctId", required = true)
    protected DepAcctIdType depAcctId;
    @XmlElement(name = "ChkNum")
    protected String chkNum;
    @XmlElement(name = "EffDt", required = true)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate effDt;
    @XmlElement(name = "TrnType", required = true)
    protected String trnType;
    @XmlElement(name = "CurAmt", required = true)
    protected CurAmtType curAmt;
    @XmlElement(name = "Desc", required = true)
    protected String desc;
    @XmlElement(name = "StmtRunningBal")
    protected CurrencyAmount stmtRunningBal;
    @XmlElement(name = "EXAM_TrnCode")
    protected String examTrnCode;
    @XmlElement(name = "BankAcctTrnRec")
    protected BankAcctTrnRecType bankAcctTrnRec;
    @XmlElement(name = "EXAM_PostedTime")
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "time")
    protected LocalDate examPostedTime;
    @XmlElement(name = "RefInfo")
    protected RefInfoType refInfo;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "FullName")
    protected String fullName;
    @XmlElement(name = "EXAM_ChannelCode")
    protected String examChannelCode;

    /**
     * Gets the value of the trnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTrnDt() {
        return trnDt;
    }

    /**
     * Sets the value of the trnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTrnDt(XMLGregorianCalendar value) {
        this.trnDt = value;
    }

    /**
     * Gets the value of the depAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link DepAcctIdType }
     *     
     */
    public DepAcctIdType getDepAcctId() {
        return depAcctId;
    }

    /**
     * Sets the value of the depAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAcctIdType }
     *     
     */
    public void setDepAcctId(DepAcctIdType value) {
        this.depAcctId = value;
    }

    /**
     * Gets the value of the chkNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChkNum() {
        return chkNum;
    }

    /**
     * Sets the value of the chkNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChkNum(String value) {
        this.chkNum = value;
    }

    /**
     * Gets the value of the effDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEffDt() {
        return effDt;
    }

    /**
     * Sets the value of the effDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffDt(LocalDate value) {
        this.effDt = value;
    }

    /**
     * Gets the value of the trnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnType() {
        return trnType;
    }

    /**
     * Sets the value of the trnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnType(String value) {
        this.trnType = value;
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
     * Gets the value of the stmtRunningBal property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getStmtRunningBal() {
        return stmtRunningBal;
    }

    /**
     * Sets the value of the stmtRunningBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setStmtRunningBal(CurrencyAmount value) {
        this.stmtRunningBal = value;
    }

    /**
     * Gets the value of the examTrnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMTrnCode() {
        return examTrnCode;
    }

    /**
     * Sets the value of the examTrnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMTrnCode(String value) {
        this.examTrnCode = value;
    }

    /**
     * Gets the value of the bankAcctTrnRec property.
     * 
     * @return
     *     possible object is
     *     {@link BankAcctTrnRecType }
     *     
     */
    public BankAcctTrnRecType getBankAcctTrnRec() {
        return bankAcctTrnRec;
    }

    /**
     * Sets the value of the bankAcctTrnRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAcctTrnRecType }
     *     
     */
    public void setBankAcctTrnRec(BankAcctTrnRecType value) {
        this.bankAcctTrnRec = value;
    }

    /**
     * Gets the value of the examPostedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public LocalDate getEXAMPostedTime() {
        return examPostedTime;
    }

    /**
     * Sets the value of the examPostedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEXAMPostedTime(LocalDate value) {
        this.examPostedTime = value;
    }

    /**
     * Gets the value of the refInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RefInfoType }
     *     
     */
    public RefInfoType getRefInfo() {
        return refInfo;
    }

    /**
     * Sets the value of the refInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefInfoType }
     *     
     */
    public void setRefInfo(RefInfoType value) {
        this.refInfo = value;
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

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the examChannelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMChannelCode() {
        return examChannelCode;
    }

    /**
     * Sets the value of the examChannelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMChannelCode(String value) {
        this.examChannelCode = value;
    }

}
