
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SignonICC_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignonICC_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AppPan"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AppPanSeq" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AppId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PINBlock" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}GenSessKey" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignonICC_Type", propOrder = {
    "appPan",
    "appPanSeq",
    "appId",
    "pinBlock",
    "genSessKey"
})
public class SignonICCType {

    @XmlElement(name = "AppPan", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] appPan;
    @XmlElement(name = "AppPanSeq", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] appPanSeq;
    @XmlElement(name = "AppId", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] appId;
    @XmlElement(name = "PINBlock")
    protected String pinBlock;
    @XmlElement(name = "GenSessKey")
    protected String genSessKey;

    /**
     * Gets the value of the appPan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getAppPan() {
        return appPan;
    }

    /**
     * Sets the value of the appPan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppPan(byte[] value) {
        this.appPan = value;
    }

    /**
     * Gets the value of the appPanSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getAppPanSeq() {
        return appPanSeq;
    }

    /**
     * Sets the value of the appPanSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppPanSeq(byte[] value) {
        this.appPanSeq = value;
    }

    /**
     * Gets the value of the appId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getAppId() {
        return appId;
    }

    /**
     * Sets the value of the appId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppId(byte[] value) {
        this.appId = value;
    }

    /**
     * Gets the value of the pinBlock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPINBlock() {
        return pinBlock;
    }

    /**
     * Sets the value of the pinBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPINBlock(String value) {
        this.pinBlock = value;
    }

    /**
     * Gets the value of the genSessKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenSessKey() {
        return genSessKey;
    }

    /**
     * Sets the value of the genSessKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenSessKey(String value) {
        this.genSessKey = value;
    }

}
