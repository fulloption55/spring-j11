
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXAM_Header_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_Header_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EXAM_ConsumerId" type="{urn:ifxforum-org:XSD:1}EXAM_ConsumerId_Type"/>
 *         &lt;element name="EXAM_ConsumerPasswd" type="{urn:ifxforum-org:XSD:1}EXAM_ConsumerPasswd_Type"/>
 *         &lt;element name="EXAM_ServiceName" type="{urn:ifxforum-org:XSD:1}EXAM_ServiceName_Type"/>
 *         &lt;element name="EXAM_ServiceVersion" type="{urn:ifxforum-org:XSD:1}EXAM_ServiceVersion_Type"/>
 *         &lt;element name="EXAM_SrcSystem" type="{urn:ifxforum-org:XSD:1}EXAM_SrcSystem_Type" minOccurs="0"/>
 *         &lt;element name="EXAM_ProviderList" type="{urn:ifxforum-org:XSD:1}EXAM_ProviderList_Type" minOccurs="0"/>
 *         &lt;element name="EXAM_SrcCountryCode" type="{urn:ifxforum-org:XSD:1}EXAM_CountryCode_Type" minOccurs="0"/>
 *         &lt;element name="EXAM_ServicePagingFlag" type="{urn:ifxforum-org:XSD:1}EXAM_PagingFlag_Type" minOccurs="0"/>
 *         &lt;element name="EXAM_PaginationList" type="{urn:ifxforum-org:XSD:1}EXAM_PaginationList_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_Header_Type", propOrder = {
    "examConsumerId",
    "examConsumerPasswd",
    "examServiceName",
    "examServiceVersion",
    "examSrcSystem",
    "examProviderList",
    "examSrcCountryCode",
    "examServicePagingFlag",
    "examPaginationList"
})
public class EXAMHeaderType {

    @XmlElement(name = "EXAM_ConsumerId", required = true)
    protected String examConsumerId;
    @XmlElement(name = "EXAM_ConsumerPasswd", required = true)
    protected String examConsumerPasswd;
    @XmlElement(name = "EXAM_ServiceName", required = true)
    protected String examServiceName;
    @XmlElement(name = "EXAM_ServiceVersion", required = true)
    protected String examServiceVersion;
    @XmlElement(name = "EXAM_SrcSystem")
    protected String examSrcSystem;
    @XmlElement(name = "EXAM_ProviderList")
    protected EXAMProviderListType examProviderList;
    @XmlElement(name = "EXAM_SrcCountryCode")
    protected String examSrcCountryCode;
    @XmlElement(name = "EXAM_ServicePagingFlag")
    protected String examServicePagingFlag;
    @XmlElement(name = "EXAM_PaginationList")
    protected EXAMPaginationListType examPaginationList;

    /**
     * Gets the value of the examConsumerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMConsumerId() {
        return examConsumerId;
    }

    /**
     * Sets the value of the examConsumerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMConsumerId(String value) {
        this.examConsumerId = value;
    }

    /**
     * Gets the value of the examConsumerPasswd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMConsumerPasswd() {
        return examConsumerPasswd;
    }

    /**
     * Sets the value of the examConsumerPasswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMConsumerPasswd(String value) {
        this.examConsumerPasswd = value;
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
     * Gets the value of the examServiceVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMServiceVersion() {
        return examServiceVersion;
    }

    /**
     * Sets the value of the examServiceVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMServiceVersion(String value) {
        this.examServiceVersion = value;
    }

    /**
     * Gets the value of the examSrcSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSrcSystem() {
        return examSrcSystem;
    }

    /**
     * Sets the value of the examSrcSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSrcSystem(String value) {
        this.examSrcSystem = value;
    }

    /**
     * Gets the value of the examProviderList property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMProviderListType }
     *     
     */
    public EXAMProviderListType getEXAMProviderList() {
        return examProviderList;
    }

    /**
     * Sets the value of the examProviderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMProviderListType }
     *     
     */
    public void setEXAMProviderList(EXAMProviderListType value) {
        this.examProviderList = value;
    }

    /**
     * Gets the value of the examSrcCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSrcCountryCode() {
        return examSrcCountryCode;
    }

    /**
     * Sets the value of the examSrcCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSrcCountryCode(String value) {
        this.examSrcCountryCode = value;
    }

    /**
     * Gets the value of the examServicePagingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMServicePagingFlag() {
        return examServicePagingFlag;
    }

    /**
     * Sets the value of the examServicePagingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMServicePagingFlag(String value) {
        this.examServicePagingFlag = value;
    }

    /**
     * Gets the value of the examPaginationList property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMPaginationListType }
     *     
     */
    public EXAMPaginationListType getEXAMPaginationList() {
        return examPaginationList;
    }

    /**
     * Sets the value of the examPaginationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMPaginationListType }
     *     
     */
    public void setEXAMPaginationList(EXAMPaginationListType value) {
        this.examPaginationList = value;
    }

}
