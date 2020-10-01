
package com.theerut.springj11.client.webservice.accounttrxhistory;

import com.theerut.springj11.client.webservice.common.CurAmtType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceAdj_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceAdj_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}InvoiceAdjNum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AdjType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurAmt"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EffDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Desc" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceAdj_Type", propOrder = {
    "invoiceAdjNum",
    "adjType",
    "curAmt",
    "effDt",
    "desc"
})
public class InvoiceAdjType {

    @XmlElement(name = "InvoiceAdjNum")
    protected String invoiceAdjNum;
    @XmlElement(name = "AdjType")
    protected String adjType;
    @XmlElement(name = "CurAmt", required = true)
    protected CurAmtType curAmt;
    @XmlElement(name = "EffDt")
    protected String effDt;
    @XmlElement(name = "Desc")
    protected String desc;

    /**
     * Gets the value of the invoiceAdjNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceAdjNum() {
        return invoiceAdjNum;
    }

    /**
     * Sets the value of the invoiceAdjNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceAdjNum(String value) {
        this.invoiceAdjNum = value;
    }

    /**
     * Gets the value of the adjType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjType() {
        return adjType;
    }

    /**
     * Sets the value of the adjType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjType(String value) {
        this.adjType = value;
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

}
