
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXAM_Provider_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_Provider_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EXAM_ProviderRqUID" type="{urn:ifxforum-org:XSD:1}NC" minOccurs="0"/>
 *         &lt;element name="EXAM_ProviderSystemCode" type="{urn:ifxforum-org:XSD:1}NC"/>
 *         &lt;element name="EXAM_ProviderAuthDetail" type="{urn:ifxforum-org:XSD:1}EXAM_ProviderAuthDetail_Type" minOccurs="0"/>
 *         &lt;element name="EXAM_ProviderRespDateTime" type="{urn:ifxforum-org:XSD:1}DateTime" minOccurs="0"/>
 *         &lt;element name="EXAM_ProviderRespStatusList" type="{urn:ifxforum-org:XSD:1}EXAM_ProviderRespStatusList_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_Provider_Type", propOrder = {
    "examProviderRqUID",
    "examProviderSystemCode",
    "examProviderAuthDetail",
    "examProviderRespDateTime",
    "examProviderRespStatusList"
})
public class EXAMProviderType {

    @XmlElement(name = "EXAM_ProviderRqUID")
    protected String examProviderRqUID;
    @XmlElement(name = "EXAM_ProviderSystemCode", required = true)
    protected String examProviderSystemCode;
    @XmlElement(name = "EXAM_ProviderAuthDetail")
    protected EXAMProviderAuthDetailType examProviderAuthDetail;
    @XmlElement(name = "EXAM_ProviderRespDateTime")
    protected String examProviderRespDateTime;
    @XmlElement(name = "EXAM_ProviderRespStatusList")
    protected EXAMProviderRespStatusListType examProviderRespStatusList;

    /**
     * Gets the value of the examProviderRqUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMProviderRqUID() {
        return examProviderRqUID;
    }

    /**
     * Sets the value of the examProviderRqUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMProviderRqUID(String value) {
        this.examProviderRqUID = value;
    }

    /**
     * Gets the value of the examProviderSystemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMProviderSystemCode() {
        return examProviderSystemCode;
    }

    /**
     * Sets the value of the examProviderSystemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMProviderSystemCode(String value) {
        this.examProviderSystemCode = value;
    }

    /**
     * Gets the value of the examProviderAuthDetail property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMProviderAuthDetailType }
     *     
     */
    public EXAMProviderAuthDetailType getEXAMProviderAuthDetail() {
        return examProviderAuthDetail;
    }

    /**
     * Sets the value of the examProviderAuthDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMProviderAuthDetailType }
     *     
     */
    public void setEXAMProviderAuthDetail(EXAMProviderAuthDetailType value) {
        this.examProviderAuthDetail = value;
    }

    /**
     * Gets the value of the examProviderRespDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMProviderRespDateTime() {
        return examProviderRespDateTime;
    }

    /**
     * Sets the value of the examProviderRespDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMProviderRespDateTime(String value) {
        this.examProviderRespDateTime = value;
    }

    /**
     * Gets the value of the examProviderRespStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMProviderRespStatusListType }
     *     
     */
    public EXAMProviderRespStatusListType getEXAMProviderRespStatusList() {
        return examProviderRespStatusList;
    }

    /**
     * Sets the value of the examProviderRespStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMProviderRespStatusListType }
     *     
     */
    public void setEXAMProviderRespStatusList(EXAMProviderRespStatusListType value) {
        this.examProviderRespStatusList = value;
    }

}
