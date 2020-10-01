
package com.theerut.springj11.client.webservice.accounttrxhistory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StdPayeeId_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StdPayeeId_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SPName"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BillerNum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StdPayeeId_Type", propOrder = {
    "spName",
    "billerNum"
})
@XmlSeeAlso({
    EXAMStdPayeeIdType.class
})
public class StdPayeeIdType {

    @XmlElement(name = "SPName", required = true)
    protected String spName;
    @XmlElement(name = "BillerNum", required = true)
    protected String billerNum;

    /**
     * Gets the value of the spName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPName() {
        return spName;
    }

    /**
     * Sets the value of the spName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPName(String value) {
        this.spName = value;
    }

    /**
     * Gets the value of the billerNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillerNum() {
        return billerNum;
    }

    /**
     * Sets the value of the billerNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillerNum(String value) {
        this.billerNum = value;
    }

}
