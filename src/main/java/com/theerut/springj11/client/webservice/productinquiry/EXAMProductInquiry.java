
package com.theerut.springj11.client.webservice.productinquiry;

import com.theerut.springj11.client.webservice.common.EXAMSignonRqType;
import com.theerut.springj11.client.webservice.common.EXAMSignonRsType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SignonRq"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ProductInquiryRq"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SignonRs"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ProductInquiryRs"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "examSignonRq",
    "examProductInquiryRq",
    "examSignonRs",
    "examProductInquiryRs"
})
@XmlRootElement(name = "EXAM_ProductInquiry")
public class EXAMProductInquiry {

    @XmlElement(name = "EXAM_SignonRq")
    protected EXAMSignonRqType examSignonRq;
    @XmlElement(name = "EXAM_ProductInquiryRq")
    protected EXAMProductInquiryRqType examProductInquiryRq;
    @XmlElement(name = "EXAM_SignonRs")
    protected EXAMSignonRsType examSignonRs;
    @XmlElement(name = "EXAM_ProductInquiryRs")
    protected EXAMProductInquiryRsType examProductInquiryRs;

    /**
     * Gets the value of the examSignonRq property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMSignonRqType }
     *     
     */
    public EXAMSignonRqType getEXAMSignonRq() {
        return examSignonRq;
    }

    /**
     * Sets the value of the examSignonRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMSignonRqType }
     *     
     */
    public void setExamSignonRq(EXAMSignonRqType value) {
        this.examSignonRq = value;
    }

    /**
     * Gets the value of the examProductInquiryRq property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMProductInquiryRqType }
     *     
     */
    public EXAMProductInquiryRqType getEXAMProductInquiryRq() {
        return examProductInquiryRq;
    }

    /**
     * Sets the value of the examProductInquiryRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMProductInquiryRqType }
     *     
     */
    public void setEXAMProductInquiryRq(EXAMProductInquiryRqType value) {
        this.examProductInquiryRq = value;
    }

    /**
     * Gets the value of the examSignonRs property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMSignonRsType }
     *     
     */
    public EXAMSignonRsType getEXAMSignonRs() {
        return examSignonRs;
    }

    /**
     * Sets the value of the examSignonRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMSignonRsType }
     *     
     */
    public void setEXAMSignonRs(EXAMSignonRsType value) {
        this.examSignonRs = value;
    }

    /**
     * Gets the value of the examProductInquiryRs property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMProductInquiryRsType }
     *     
     */
    public EXAMProductInquiryRsType getEXAMProductInquiryRs() {
        return examProductInquiryRs;
    }

    /**
     * Sets the value of the examProductInquiryRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMProductInquiryRsType }
     *     
     */
    public void setEXAMProductInquiryRs(EXAMProductInquiryRsType value) {
        this.examProductInquiryRs = value;
    }

}
