
package com.theerut.springj11.client.webservice.accountsummary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXAM_CustomerReference_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_CustomerReference_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ReferenceName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ReferenceIDNumber" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ReferenceRelationship" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_HomeContact" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MobilePhone" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Pager" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_CustomerReference_Type", propOrder = {
    "examReferenceName",
    "examReferenceIDNumber",
    "examReferenceRelationship",
    "examHomeContact",
    "examMobilePhone",
    "examPager"
})
public class EXAMCustomerReferenceType {

    @XmlElement(name = "EXAM_ReferenceName")
    protected String examReferenceName;
    @XmlElement(name = "EXAM_ReferenceIDNumber")
    protected String examReferenceIDNumber;
    @XmlElement(name = "EXAM_ReferenceRelationship")
    protected String examReferenceRelationship;
    @XmlElement(name = "EXAM_HomeContact")
    protected String examHomeContact;
    @XmlElement(name = "EXAM_MobilePhone")
    protected String examMobilePhone;
    @XmlElement(name = "EXAM_Pager")
    protected String examPager;

    /**
     * Gets the value of the examReferenceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMReferenceName() {
        return examReferenceName;
    }

    /**
     * Sets the value of the examReferenceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMReferenceName(String value) {
        this.examReferenceName = value;
    }

    /**
     * Gets the value of the examReferenceIDNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMReferenceIDNumber() {
        return examReferenceIDNumber;
    }

    /**
     * Sets the value of the examReferenceIDNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMReferenceIDNumber(String value) {
        this.examReferenceIDNumber = value;
    }

    /**
     * Gets the value of the examReferenceRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMReferenceRelationship() {
        return examReferenceRelationship;
    }

    /**
     * Sets the value of the examReferenceRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMReferenceRelationship(String value) {
        this.examReferenceRelationship = value;
    }

    /**
     * Gets the value of the examHomeContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMHomeContact() {
        return examHomeContact;
    }

    /**
     * Sets the value of the examHomeContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMHomeContact(String value) {
        this.examHomeContact = value;
    }

    /**
     * Gets the value of the examMobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMobilePhone() {
        return examMobilePhone;
    }

    /**
     * Sets the value of the examMobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMobilePhone(String value) {
        this.examMobilePhone = value;
    }

    /**
     * Gets the value of the examPager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPager() {
        return examPager;
    }

    /**
     * Sets the value of the examPager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPager(String value) {
        this.examPager = value;
    }

}
