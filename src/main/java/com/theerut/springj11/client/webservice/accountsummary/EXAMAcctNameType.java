
package com.theerut.springj11.client.webservice.accountsummary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXAM_AcctName_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_AcctName_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PriAcctName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SecAcctName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TitlePrefix" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ShortName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Name" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_AcctName_Type", propOrder = {
    "examPriAcctName",
    "examSecAcctName",
    "titlePrefix",
    "examShortName",
    "name"
})
public class EXAMAcctNameType {

    @XmlElement(name = "EXAM_PriAcctName")
    protected String examPriAcctName;
    @XmlElement(name = "EXAM_SecAcctName")
    protected String examSecAcctName;
    @XmlElement(name = "TitlePrefix")
    protected String titlePrefix;
    @XmlElement(name = "EXAM_ShortName")
    protected String examShortName;
    @XmlElement(name = "Name")
    protected String name;

    /**
     * Gets the value of the examPriAcctName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPriAcctName() {
        return examPriAcctName;
    }

    /**
     * Sets the value of the examPriAcctName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPriAcctName(String value) {
        this.examPriAcctName = value;
    }

    /**
     * Gets the value of the examSecAcctName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSecAcctName() {
        return examSecAcctName;
    }

    /**
     * Sets the value of the examSecAcctName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSecAcctName(String value) {
        this.examSecAcctName = value;
    }

    /**
     * Gets the value of the titlePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitlePrefix() {
        return titlePrefix;
    }

    /**
     * Sets the value of the titlePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitlePrefix(String value) {
        this.titlePrefix = value;
    }

    /**
     * Gets the value of the examShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMShortName() {
        return examShortName;
    }

    /**
     * Sets the value of the examShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMShortName(String value) {
        this.examShortName = value;
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

}
