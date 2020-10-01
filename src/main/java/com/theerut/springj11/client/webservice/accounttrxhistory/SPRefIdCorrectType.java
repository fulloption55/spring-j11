
package com.theerut.springj11.client.webservice.accounttrxhistory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SPRefIdCorrect_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SPRefIdCorrect_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SPRefId"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CorrectAction"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SPRefIdCorrect_Type", propOrder = {
    "spRefId",
    "correctAction"
})
public class SPRefIdCorrectType {

    @XmlElement(name = "SPRefId", required = true)
    protected String spRefId;
    @XmlElement(name = "CorrectAction", required = true)
    protected String correctAction;

    /**
     * Gets the value of the spRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPRefId() {
        return spRefId;
    }

    /**
     * Sets the value of the spRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPRefId(String value) {
        this.spRefId = value;
    }

    /**
     * Gets the value of the correctAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrectAction() {
        return correctAction;
    }

    /**
     * Sets the value of the correctAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrectAction(String value) {
        this.correctAction = value;
    }

}
