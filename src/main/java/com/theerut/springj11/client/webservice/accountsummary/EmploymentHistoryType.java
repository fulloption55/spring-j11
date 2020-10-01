
package com.theerut.springj11.client.webservice.accountsummary;

import com.theerut.springj11.client.webservice.common.CurrencyAmount;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmploymentHistory_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmploymentHistory_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EmploymentStatus" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OrgInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Occupation"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Income" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}JobTitle" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StartDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EndDt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmploymentHistory_Type", propOrder = {
    "employmentStatus",
    "orgInfo",
    "occupation",
    "income",
    "jobTitle",
    "startDt",
    "endDt"
})
public class EmploymentHistoryType {

    @XmlElement(name = "EmploymentStatus")
    protected String employmentStatus;
    @XmlElement(name = "OrgInfo")
    protected OrgInfoType orgInfo;
    @XmlElement(name = "Occupation", required = true)
    protected String occupation;
    @XmlElement(name = "Income")
    protected CurrencyAmount income;
    @XmlElement(name = "JobTitle")
    protected String jobTitle;
    @XmlElement(name = "StartDt")
    protected String startDt;
    @XmlElement(name = "EndDt")
    protected String endDt;

    /**
     * Gets the value of the employmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmploymentStatus() {
        return employmentStatus;
    }

    /**
     * Sets the value of the employmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmploymentStatus(String value) {
        this.employmentStatus = value;
    }

    /**
     * Gets the value of the orgInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OrgInfoType }
     *     
     */
    public OrgInfoType getOrgInfo() {
        return orgInfo;
    }

    /**
     * Sets the value of the orgInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgInfoType }
     *     
     */
    public void setOrgInfo(OrgInfoType value) {
        this.orgInfo = value;
    }

    /**
     * Gets the value of the occupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Sets the value of the occupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupation(String value) {
        this.occupation = value;
    }

    /**
     * Gets the value of the income property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getIncome() {
        return income;
    }

    /**
     * Sets the value of the income property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setIncome(CurrencyAmount value) {
        this.income = value;
    }

    /**
     * Gets the value of the jobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the value of the jobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitle(String value) {
        this.jobTitle = value;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDt(String value) {
        this.startDt = value;
    }

    /**
     * Gets the value of the endDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDt(String value) {
        this.endDt = value;
    }

}
