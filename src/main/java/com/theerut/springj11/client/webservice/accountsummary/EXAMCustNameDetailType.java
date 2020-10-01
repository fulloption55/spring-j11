
package com.theerut.springj11.client.webservice.accountsummary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXAM_CustNameDetail_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_CustNameDetail_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustomerName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PrimaryName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AlternateName" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_CustNameDetail_Type", propOrder = {
    "examCustomerName",
    "examPrimaryName",
    "examAlternateName"
})
public class EXAMCustNameDetailType {

    @XmlElement(name = "EXAM_CustomerName")
    protected String examCustomerName;
    @XmlElement(name = "EXAM_PrimaryName")
    protected String examPrimaryName;
    @XmlElement(name = "EXAM_AlternateName")
    protected String examAlternateName;

    /**
     * Gets the value of the examCustomerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCustomerName() {
        return examCustomerName;
    }

    /**
     * Sets the value of the examCustomerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCustomerName(String value) {
        this.examCustomerName = value;
    }

    /**
     * Gets the value of the examPrimaryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPrimaryName() {
        return examPrimaryName;
    }

    /**
     * Sets the value of the examPrimaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPrimaryName(String value) {
        this.examPrimaryName = value;
    }

    /**
     * Gets the value of the examAlternateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMAlternateName() {
        return examAlternateName;
    }

    /**
     * Sets the value of the examAlternateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMAlternateName(String value) {
        this.examAlternateName = value;
    }

}
