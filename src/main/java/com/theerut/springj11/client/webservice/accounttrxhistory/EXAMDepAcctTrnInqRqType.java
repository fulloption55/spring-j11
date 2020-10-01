
package com.theerut.springj11.client.webservice.accounttrxhistory;

import com.theerut.springj11.client.webservice.common.EXAMNonFinSvcHeaderInfoType;
import com.theerut.springj11.client.webservice.common.DepAcctIdType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EXAM_DepAcctTrnInqRq_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_DepAcctTrnInqRq_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RqUID"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NonFinSvcHeaderInfo"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DepAcctId"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_StartDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EndDt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_DepAcctTrnInqRq_Type", propOrder = {
    "examRqUID",
    "examNonFinSvcHeaderInfo",
    "depAcctId",
    "selRangeDt"
})
public class EXAMDepAcctTrnInqRqType {

    @XmlElement(name = "EXAM_RqUID", required = true)
    protected String examRqUID;
    @XmlElement(name = "EXAM_NonFinSvcHeaderInfo", required = true)
    protected EXAMNonFinSvcHeaderInfoType examNonFinSvcHeaderInfo;
    @XmlElement(name = "DepAcctId", required = true)
    protected DepAcctIdType depAcctId;
    @XmlElement(name="SelRangeDt")
    protected SelRangeDt selRangeDt;

    public SelRangeDt getSelRangeDt() {
        return selRangeDt;
    }

    public void setSelRangeDt(SelRangeDt selRangeDt) {
        this.selRangeDt = selRangeDt;
    }

    /**
     * Gets the value of the examRqUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMRqUID() {
        return examRqUID;
    }

    /**
     * Sets the value of the examRqUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMRqUID(String value) {
        this.examRqUID = value;
    }

    /**
     * Gets the value of the examNonFinSvcHeaderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMNonFinSvcHeaderInfoType }
     *     
     */
    public EXAMNonFinSvcHeaderInfoType getEXAMNonFinSvcHeaderInfo() {
        return examNonFinSvcHeaderInfo;
    }

    /**
     * Sets the value of the examNonFinSvcHeaderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMNonFinSvcHeaderInfoType }
     *     
     */
    public void setEXAMNonFinSvcHeaderInfo(EXAMNonFinSvcHeaderInfoType value) {
        this.examNonFinSvcHeaderInfo = value;
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
     * Gets the value of the examStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    /*public XMLGregorianCalendar getEXAMStartDt() {
        return examStartDt;
    }

    *//**
     * Sets the value of the examStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     *//*
    public void setEXAMStartDt(XMLGregorianCalendar value) {
        this.examStartDt = value;
    }

    *//**
     * Gets the value of the examEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     *//*
    public XMLGregorianCalendar getEXAMEndDt() {
        return examEndDt;
    }

    *//**
     * Sets the value of the examEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     *//*
    public void setEXAMEndDt(XMLGregorianCalendar value) {
        this.examEndDt = value;
    }*/

}
