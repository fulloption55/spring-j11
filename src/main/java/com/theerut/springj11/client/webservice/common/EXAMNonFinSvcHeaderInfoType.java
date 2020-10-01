
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXAM_NonFinSvcHeaderInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_NonFinSvcHeaderInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BankId"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BranchId"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BranchUserId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BIC" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_NonFinSvcHeaderInfo_Type", propOrder = {
    "bankId",
    "branchId",
    "examBranchUserId",
    "exambic"
})
public class EXAMNonFinSvcHeaderInfoType {

    @XmlElement(name = "BankId", required = true)
    protected String bankId;
    @XmlElement(name = "BranchId", required = true)
    protected String branchId;
    @XmlElement(name = "EXAM_BranchUserId")
    protected String examBranchUserId;
    @XmlElement(name = "EXAM_BIC")
    protected String exambic;

    /**
     * Gets the value of the bankId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankId() {
        return bankId;
    }

    /**
     * Sets the value of the bankId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankId(String value) {
        this.bankId = value;
    }

    /**
     * Gets the value of the branchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchId() {
        return branchId;
    }

    /**
     * Sets the value of the branchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchId(String value) {
        this.branchId = value;
    }

    /**
     * Gets the value of the examBranchUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBranchUserId() {
        return examBranchUserId;
    }

    /**
     * Sets the value of the examBranchUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBranchUserId(String value) {
        this.examBranchUserId = value;
    }

    /**
     * Gets the value of the exambic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBIC() {
        return exambic;
    }

    /**
     * Sets the value of the exambic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBIC(String value) {
        this.exambic = value;
    }

}
