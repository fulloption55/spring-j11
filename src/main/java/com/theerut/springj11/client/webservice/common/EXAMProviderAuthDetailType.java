
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXAM_ProviderAuthDetail_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_ProviderAuthDetail_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EXAM_ProviderUserId" type="{urn:ifxforum-org:XSD:1}NC" minOccurs="0"/>
 *         &lt;element name="EXAM_ProviderUserPasswd" type="{urn:ifxforum-org:XSD:1}NC" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_ProviderAuthDetail_Type", propOrder = {
    "examProviderUserId",
    "examProviderUserPasswd"
})
public class EXAMProviderAuthDetailType {

    @XmlElement(name = "EXAM_ProviderUserId")
    protected String examProviderUserId;
    @XmlElement(name = "EXAM_ProviderUserPasswd")
    protected String examProviderUserPasswd;

    /**
     * Gets the value of the examProviderUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMProviderUserId() {
        return examProviderUserId;
    }

    /**
     * Sets the value of the examProviderUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMProviderUserId(String value) {
        this.examProviderUserId = value;
    }

    /**
     * Gets the value of the examProviderUserPasswd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMProviderUserPasswd() {
        return examProviderUserPasswd;
    }

    /**
     * Sets the value of the examProviderUserPasswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMProviderUserPasswd(String value) {
        this.examProviderUserPasswd = value;
    }

}
