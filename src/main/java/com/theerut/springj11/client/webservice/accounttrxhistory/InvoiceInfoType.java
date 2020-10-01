
package com.theerut.springj11.client.webservice.accounttrxhistory;

import com.theerut.springj11.client.webservice.common.CurrencyAmount;
import com.theerut.springj11.client.webservice.common.FeeType;
import com.theerut.springj11.client.webservice.common.InvoicePremiumType;
import com.theerut.springj11.client.webservice.common.RefInfoType;
import com.theerut.springj11.client.webservice.common.TotalCurAmtType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for InvoiceInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}InvoiceType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}InvoiceNum"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RefInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TotalCurAmt"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PaidCurAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EffDt"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Desc" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}InvoiceVouchNum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Fee" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}InvoicePremium" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Discount" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TaxInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}InvoiceAdj" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}InvoiceLineItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceInfo_Type", propOrder = {
    "invoiceType",
    "invoiceNum",
    "refInfo",
    "totalCurAmt",
    "paidCurAmt",
    "effDt",
    "desc",
    "invoiceVouchNum",
    "fee",
    "invoicePremium",
    "discount",
    "taxInfo",
    "invoiceAdj",
    "invoiceLineItem"
})
public class InvoiceInfoType {

    @XmlElement(name = "InvoiceType")
    protected String invoiceType;
    @XmlElement(name = "InvoiceNum", required = true)
    protected String invoiceNum;
    @XmlElement(name = "RefInfo")
    protected List<RefInfoType> refInfo;
    @XmlElement(name = "TotalCurAmt", required = true)
    protected TotalCurAmtType totalCurAmt;
    @XmlElement(name = "PaidCurAmt")
    protected CurrencyAmount paidCurAmt;
    @XmlElement(name = "EffDt", required = true)
    protected String effDt;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "InvoiceVouchNum")
    protected String invoiceVouchNum;
    @XmlElement(name = "Fee")
    protected List<FeeType> fee;
    @XmlElement(name = "InvoicePremium")
    protected InvoicePremiumType invoicePremium;
    @XmlElement(name = "Discount")
    protected DiscountType discount;
    @XmlElement(name = "TaxInfo")
    protected TaxInfoType taxInfo;
    @XmlElement(name = "InvoiceAdj")
    protected InvoiceAdjType invoiceAdj;
    @XmlElement(name = "InvoiceLineItem")
    protected List<InvoiceLineItemType> invoiceLineItem;

    /**
     * Gets the value of the invoiceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceType() {
        return invoiceType;
    }

    /**
     * Sets the value of the invoiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceType(String value) {
        this.invoiceType = value;
    }

    /**
     * Gets the value of the invoiceNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNum() {
        return invoiceNum;
    }

    /**
     * Sets the value of the invoiceNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNum(String value) {
        this.invoiceNum = value;
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
     * Gets the value of the totalCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link TotalCurAmtType }
     *     
     */
    public TotalCurAmtType getTotalCurAmt() {
        return totalCurAmt;
    }

    /**
     * Sets the value of the totalCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalCurAmtType }
     *     
     */
    public void setTotalCurAmt(TotalCurAmtType value) {
        this.totalCurAmt = value;
    }

    /**
     * Gets the value of the paidCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getPaidCurAmt() {
        return paidCurAmt;
    }

    /**
     * Sets the value of the paidCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setPaidCurAmt(CurrencyAmount value) {
        this.paidCurAmt = value;
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
     * Gets the value of the invoiceVouchNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceVouchNum() {
        return invoiceVouchNum;
    }

    /**
     * Sets the value of the invoiceVouchNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceVouchNum(String value) {
        this.invoiceVouchNum = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeType }
     * 
     * 
     */
    public List<FeeType> getFee() {
        if (fee == null) {
            fee = new ArrayList<>();
        }
        return this.fee;
    }

    /**
     * Gets the value of the invoicePremium property.
     * 
     * @return
     *     possible object is
     *     {@link InvoicePremiumType }
     *     
     */
    public InvoicePremiumType getInvoicePremium() {
        return invoicePremium;
    }

    /**
     * Sets the value of the invoicePremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoicePremiumType }
     *     
     */
    public void setInvoicePremium(InvoicePremiumType value) {
        this.invoicePremium = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountType }
     *     
     */
    public DiscountType getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountType }
     *     
     */
    public void setDiscount(DiscountType value) {
        this.discount = value;
    }

    /**
     * Gets the value of the taxInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TaxInfoType }
     *     
     */
    public TaxInfoType getTaxInfo() {
        return taxInfo;
    }

    /**
     * Sets the value of the taxInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxInfoType }
     *     
     */
    public void setTaxInfo(TaxInfoType value) {
        this.taxInfo = value;
    }

    /**
     * Gets the value of the invoiceAdj property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceAdjType }
     *     
     */
    public InvoiceAdjType getInvoiceAdj() {
        return invoiceAdj;
    }

    /**
     * Sets the value of the invoiceAdj property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceAdjType }
     *     
     */
    public void setInvoiceAdj(InvoiceAdjType value) {
        this.invoiceAdj = value;
    }

    /**
     * Gets the value of the invoiceLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceLineItemType }
     * 
     * 
     */
    public List<InvoiceLineItemType> getInvoiceLineItem() {
        if (invoiceLineItem == null) {
            invoiceLineItem = new ArrayList<>();
        }
        return this.invoiceLineItem;
    }

}
