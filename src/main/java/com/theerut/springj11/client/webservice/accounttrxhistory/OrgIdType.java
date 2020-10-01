
package com.theerut.springj11.client.webservice.accounttrxhistory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrgId_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrgId_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OrgIdType"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OrgIdNum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrgId_Type", propOrder = {
    "orgIdType",
    "orgIdNum"
})
public class OrgIdType {

    @XmlElement(name = "OrgIdType", required = true)
    protected String orgIdType;
    @XmlElement(name = "OrgIdNum", required = true)
    protected String orgIdNum;

    /**
     * Gets the value of the orgIdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgIdType() {
        return orgIdType;
    }

    /**
     * Sets the value of the orgIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgIdType(String value) {
        this.orgIdType = value;
    }

    /**
     * Gets the value of the orgIdNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgIdNum() {
        return orgIdNum;
    }

    /**
     * Sets the value of the orgIdNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgIdNum(String value) {
        this.orgIdNum = value;
    }

}
