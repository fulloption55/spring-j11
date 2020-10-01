
package com.theerut.springj11.client.webservice.accountsummary;

import com.theerut.springj11.client.webservice.common.EXAMGovIssueIdentType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXAM_DirectPartnerDetails_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_DirectPartnerDetails_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PriId"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AltId"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_DirectPartnerDetails_Type", propOrder = {
    "examPriId",
    "examAltId"
})
public class EXAMDirectPartnerDetailsType {

    @XmlElement(name = "EXAM_PriId", required = true)
    protected EXAMGovIssueIdentType examPriId;
    @XmlElement(name = "EXAM_AltId", required = true)
    protected EXAMGovIssueIdentType examAltId;

    /**
     * Gets the value of the examPriId property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMGovIssueIdentType }
     *     
     */
    public EXAMGovIssueIdentType getEXAMPriId() {
        return examPriId;
    }

    /**
     * Sets the value of the examPriId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMGovIssueIdentType }
     *     
     */
    public void setEXAMPriId(EXAMGovIssueIdentType value) {
        this.examPriId = value;
    }

    /**
     * Gets the value of the examAltId property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMGovIssueIdentType }
     *     
     */
    public EXAMGovIssueIdentType getEXAMAltId() {
        return examAltId;
    }

    /**
     * Sets the value of the examAltId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMGovIssueIdentType }
     *     
     */
    public void setEXAMAltId(EXAMGovIssueIdentType value) {
        this.examAltId = value;
    }

}
