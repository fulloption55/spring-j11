
package com.theerut.springj11.client.webservice.accounttrxhistory;

import com.theerut.springj11.client.webservice.common.CompositeCurAmtType;
import com.theerut.springj11.client.webservice.common.CurAmtType;
import com.theerut.springj11.client.webservice.common.CurrencyAmount;
import com.theerut.springj11.client.webservice.common.IndustIdType;
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
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for BankAcctTrnRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankAcctTrnRec_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TrnType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TrnSrc" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PostedDt"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OrigDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EffDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurAmt"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OrigCurAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CompositeCurAmt" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IndustId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Memo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Name" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CounterpartyInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RefInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BillRefInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RemitAdviceRefId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustPayeeInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}InvoiceInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CSPRefId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SPRefId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SPRefIdCorrect" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankAcctTrnRec_Type", propOrder = {
    "trnType",
    "trnSrc",
    "postedDt",
    "origDt",
    "effDt",
    "curAmt",
    "origCurAmt",
    "compositeCurAmt",
    "industId",
    "memo",
    "name",
    "counterpartyInfo",
    "refInfo",
    "billRefInfo",
    "remitAdviceRefId",
    "custPayeeInfo",
    "invoiceInfo",
    "cspRefId",
    "spRefId",
    "spRefIdCorrect"
})
public class BankAcctTrnRecType {

    @XmlElement(name = "TrnType")
    protected String trnType;
    @XmlElement(name = "TrnSrc")
    protected String trnSrc;
    @XmlElement(name = "PostedDt", required = true)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate postedDt;
    @XmlElement(name = "OrigDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar origDt;
    @XmlElement(name = "EffDt")
    protected String effDt;
    @XmlElement(name = "CurAmt", required = true)
    protected CurAmtType curAmt;
    @XmlElement(name = "OrigCurAmt")
    protected CurrencyAmount origCurAmt;
    @XmlElement(name = "CompositeCurAmt")
    protected List<CompositeCurAmtType> compositeCurAmt;
    @XmlElement(name = "IndustId")
    protected IndustIdType industId;
    @XmlElement(name = "Memo")
    protected List<String> memo;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "CounterpartyInfo")
    protected CounterpartyInfoType counterpartyInfo;
    @XmlElement(name = "RefInfo")
    protected List<RefInfoType> refInfo;
    @XmlElement(name = "BillRefInfo")
    protected String billRefInfo;
    @XmlElement(name = "RemitAdviceRefId")
    protected String remitAdviceRefId;
    @XmlElement(name = "CustPayeeInfo")
    protected CustPayeeInfoType custPayeeInfo;
    @XmlElement(name = "InvoiceInfo")
    protected InvoiceInfoType invoiceInfo;
    @XmlElement(name = "CSPRefId")
    protected String cspRefId;
    @XmlElement(name = "SPRefId")
    protected String spRefId;
    @XmlElement(name = "SPRefIdCorrect")
    protected SPRefIdCorrectType spRefIdCorrect;

    public BankAcctTrnRecType() {
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
     * Gets the value of the trnSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnSrc() {
        return trnSrc;
    }

    /**
     * Sets the value of the trnSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnSrc(String value) {
        this.trnSrc = value;
    }

    /**
     * Gets the value of the postedDt property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDate }
     *     
     */
    public LocalDate getPostedDt() {
        return postedDt;
    }

    /**
     * Sets the value of the postedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDate }
     *     
     */
    public void setPostedDt(LocalDate value) {
        this.postedDt = value;
    }

    /**
     * Gets the value of the origDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrigDt() {
        return origDt;
    }

    /**
     * Sets the value of the origDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrigDt(XMLGregorianCalendar value) {
        this.origDt = value;
    }

    /**
     * Gets the value of the effDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffDt() {
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
    public void setEffDt(String value) {
        this.effDt = value;
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
     * Gets the value of the origCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getOrigCurAmt() {
        return origCurAmt;
    }

    /**
     * Sets the value of the origCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setOrigCurAmt(CurrencyAmount value) {
        this.origCurAmt = value;
    }

    /**
     * Gets the value of the compositeCurAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compositeCurAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompositeCurAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompositeCurAmtType }
     * 
     * 
     */
    public List<CompositeCurAmtType> getCompositeCurAmt() {
        if (compositeCurAmt == null) {
            compositeCurAmt = new ArrayList<>();
        }
        return this.compositeCurAmt;
    }

    /**
     * Gets the value of the industId property.
     * 
     * @return
     *     possible object is
     *     {@link IndustIdType }
     *     
     */
    public IndustIdType getIndustId() {
        return industId;
    }

    /**
     * Sets the value of the industId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustIdType }
     *     
     */
    public void setIndustId(IndustIdType value) {
        this.industId = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMemo() {
        if (memo == null) {
            memo = new ArrayList<>();
        }
        return this.memo;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the counterpartyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyInfoType }
     *     
     */
    public CounterpartyInfoType getCounterpartyInfo() {
        return counterpartyInfo;
    }

    /**
     * Sets the value of the counterpartyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyInfoType }
     *     
     */
    public void setCounterpartyInfo(CounterpartyInfoType value) {
        this.counterpartyInfo = value;
    }

    /**
     * Gets the value of the refInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefInfoType }
     * 
     * 
     */
    public List<RefInfoType> getRefInfo() {
        if (refInfo == null) {
            refInfo = new ArrayList<>();
        }
        return this.refInfo;
    }

    /**
     * Gets the value of the billRefInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillRefInfo() {
        return billRefInfo;
    }

    /**
     * Sets the value of the billRefInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillRefInfo(String value) {
        this.billRefInfo = value;
    }

    /**
     * Gets the value of the remitAdviceRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemitAdviceRefId() {
        return remitAdviceRefId;
    }

    /**
     * Sets the value of the remitAdviceRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemitAdviceRefId(String value) {
        this.remitAdviceRefId = value;
    }

    /**
     * Gets the value of the custPayeeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustPayeeInfoType }
     *     
     */
    public CustPayeeInfoType getCustPayeeInfo() {
        return custPayeeInfo;
    }

    /**
     * Sets the value of the custPayeeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustPayeeInfoType }
     *     
     */
    public void setCustPayeeInfo(CustPayeeInfoType value) {
        this.custPayeeInfo = value;
    }

    /**
     * Gets the value of the invoiceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceInfoType }
     *     
     */
    public InvoiceInfoType getInvoiceInfo() {
        return invoiceInfo;
    }

    /**
     * Sets the value of the invoiceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceInfoType }
     *     
     */
    public void setInvoiceInfo(InvoiceInfoType value) {
        this.invoiceInfo = value;
    }

    /**
     * Gets the value of the cspRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSPRefId() {
        return cspRefId;
    }

    /**
     * Sets the value of the cspRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSPRefId(String value) {
        this.cspRefId = value;
    }

    /**
     * Gets the value of the spRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPRefId() {
        return spRefId;
    }

    /**
     * Sets the value of the spRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPRefId(String value) {
        this.spRefId = value;
    }

    /**
     * Gets the value of the spRefIdCorrect property.
     * 
     * @return
     *     possible object is
     *     {@link SPRefIdCorrectType }
     *     
     */
    public SPRefIdCorrectType getSPRefIdCorrect() {
        return spRefIdCorrect;
    }

    /**
     * Sets the value of the spRefIdCorrect property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPRefIdCorrectType }
     *     
     */
    public void setSPRefIdCorrect(SPRefIdCorrectType value) {
        this.spRefIdCorrect = value;
    }

}
