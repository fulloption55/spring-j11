
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXAM_ProviderRespStatus_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_ProviderRespStatus_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EXAM_StatusRqUID" type="{urn:ifxforum-org:XSD:1}EXAM_RqUID_Type"/>
 *         &lt;element name="EXAM_StatusCode" type="{urn:ifxforum-org:XSD:1}NC"/>
 *         &lt;element name="EXAM_StatusDesc" type="{urn:ifxforum-org:XSD:1}NC" minOccurs="0"/>
 *         &lt;element name="EXAM_Severity" type="{urn:ifxforum-org:XSD:1}Severity_Type" minOccurs="0"/>
 *         &lt;element name="EXAM_ServiceName" type="{urn:ifxforum-org:XSD:1}EXAM_ServiceName_Type" minOccurs="0"/>
 *         &lt;element name="EXAM_AtomicServiceName" type="{urn:ifxforum-org:XSD:1}EXAM_ServiceName_Type" minOccurs="0"/>
 *         &lt;element name="EXAM_ProviderErrorAttrList" type="{urn:ifxforum-org:XSD:1}EXAM_ProviderErrorAttrList_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_ProviderRespStatus_Type", propOrder = {
    "examStatusRqUID",
    "examStatusCode",
    "examStatusDesc",
    "examSeverity",
    "examServiceName",
    "examAtomicServiceName",
    "examProviderErrorAttrList"
})
public class EXAMProviderRespStatusType {

    @XmlElement(name = "EXAM_StatusRqUID", required = true)
    protected String examStatusRqUID;
    @XmlElement(name = "EXAM_StatusCode", required = true)
    protected String examStatusCode;
    @XmlElement(name = "EXAM_StatusDesc")
    protected String examStatusDesc;
    @XmlElement(name = "EXAM_Severity")
    protected String examSeverity;
    @XmlElement(name = "EXAM_ServiceName")
    protected String examServiceName;
    @XmlElement(name = "EXAM_AtomicServiceName")
    protected String examAtomicServiceName;
    @XmlElement(name = "EXAM_ProviderErrorAttrList")
    protected EXAMProviderErrorAttrListType examProviderErrorAttrList;

    /**
     * Gets the value of the examStatusRqUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMStatusRqUID() {
        return examStatusRqUID;
    }

    /**
     * Sets the value of the examStatusRqUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMStatusRqUID(String value) {
        this.examStatusRqUID = value;
    }

    /**
     * Gets the value of the examStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMStatusCode() {
        return examStatusCode;
    }

    /**
     * Sets the value of the examStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMStatusCode(String value) {
        this.examStatusCode = value;
    }

    /**
     * Gets the value of the examStatusDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMStatusDesc() {
        return examStatusDesc;
    }

    /**
     * Sets the value of the examStatusDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMStatusDesc(String value) {
        this.examStatusDesc = value;
    }

    /**
     * Gets the value of the examSeverity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSeverity() {
        return examSeverity;
    }

    /**
     * Sets the value of the examSeverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSeverity(String value) {
        this.examSeverity = value;
    }

    /**
     * Gets the value of the examServiceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMServiceName() {
        return examServiceName;
    }

    /**
     * Sets the value of the examServiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMServiceName(String value) {
        this.examServiceName = value;
    }

    /**
     * Gets the value of the examAtomicServiceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMAtomicServiceName() {
        return examAtomicServiceName;
    }

    /**
     * Sets the value of the examAtomicServiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMAtomicServiceName(String value) {
        this.examAtomicServiceName = value;
    }

    /**
     * Gets the value of the examProviderErrorAttrList property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMProviderErrorAttrListType }
     *     
     */
    public EXAMProviderErrorAttrListType getEXAMProviderErrorAttrList() {
        return examProviderErrorAttrList;
    }

    /**
     * Sets the value of the examProviderErrorAttrList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMProviderErrorAttrListType }
     *     
     */
    public void setEXAMProviderErrorAttrList(EXAMProviderErrorAttrListType value) {
        this.examProviderErrorAttrList = value;
    }

}
