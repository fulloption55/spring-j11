
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardMagData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardMagData_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MagData1" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MagData2" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MagData3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardMagData_Type", propOrder = {
    "magData1",
    "magData2",
    "magData3"
})
public class CardMagDataType {

    @XmlElement(name = "MagData1")
    protected String magData1;
    @XmlElement(name = "MagData2")
    protected String magData2;
    @XmlElement(name = "MagData3")
    protected String magData3;

    /**
     * Gets the value of the magData1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMagData1() {
        return magData1;
    }

    /**
     * Sets the value of the magData1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMagData1(String value) {
        this.magData1 = value;
    }

    /**
     * Gets the value of the magData2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMagData2() {
        return magData2;
    }

    /**
     * Sets the value of the magData2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMagData2(String value) {
        this.magData2 = value;
    }

    /**
     * Gets the value of the magData3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMagData3() {
        return magData3;
    }

    /**
     * Sets the value of the magData3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMagData3(String value) {
        this.magData3 = value;
    }

}
