
package com.theerut.springj11.client.webservice.accountsummary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXAM_HighRisk_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_HighRisk_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Nationality" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CountryResidentInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OrigFundSrcCountryInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Occupation" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NationalityInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CountryResident" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OrigFundSrcCountry" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OccupationInd" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_HighRisk_Type", propOrder = {
    "examNationality",
    "examCountryResidentInd",
    "examOrigFundSrcCountryInd",
    "occupation",
    "examNationalityInd",
    "examCountryResident",
    "examOrigFundSrcCountry",
    "examOccupationInd"
})
public class EXAMHighRiskType {

    @XmlElement(name = "EXAM_Nationality")
    protected String examNationality;
    @XmlElement(name = "EXAM_CountryResidentInd")
    protected String examCountryResidentInd;
    @XmlElement(name = "EXAM_OrigFundSrcCountryInd")
    protected String examOrigFundSrcCountryInd;
    @XmlElement(name = "Occupation")
    protected String occupation;
    @XmlElement(name = "EXAM_NationalityInd")
    protected String examNationalityInd;
    @XmlElement(name = "EXAM_CountryResident")
    protected String examCountryResident;
    @XmlElement(name = "EXAM_OrigFundSrcCountry")
    protected String examOrigFundSrcCountry;
    @XmlElement(name = "EXAM_OccupationInd")
    protected String examOccupationInd;

    /**
     * Gets the value of the examNationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMNationality() {
        return examNationality;
    }

    /**
     * Sets the value of the examNationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMNationality(String value) {
        this.examNationality = value;
    }

    /**
     * Gets the value of the examCountryResidentInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCountryResidentInd() {
        return examCountryResidentInd;
    }

    /**
     * Sets the value of the examCountryResidentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCountryResidentInd(String value) {
        this.examCountryResidentInd = value;
    }

    /**
     * Gets the value of the examOrigFundSrcCountryInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOrigFundSrcCountryInd() {
        return examOrigFundSrcCountryInd;
    }

    /**
     * Sets the value of the examOrigFundSrcCountryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOrigFundSrcCountryInd(String value) {
        this.examOrigFundSrcCountryInd = value;
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
     * Gets the value of the examNationalityInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMNationalityInd() {
        return examNationalityInd;
    }

    /**
     * Sets the value of the examNationalityInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMNationalityInd(String value) {
        this.examNationalityInd = value;
    }

    /**
     * Gets the value of the examCountryResident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCountryResident() {
        return examCountryResident;
    }

    /**
     * Sets the value of the examCountryResident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCountryResident(String value) {
        this.examCountryResident = value;
    }

    /**
     * Gets the value of the examOrigFundSrcCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOrigFundSrcCountry() {
        return examOrigFundSrcCountry;
    }

    /**
     * Sets the value of the examOrigFundSrcCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOrigFundSrcCountry(String value) {
        this.examOrigFundSrcCountry = value;
    }

    /**
     * Gets the value of the examOccupationInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOccupationInd() {
        return examOccupationInd;
    }

    /**
     * Sets the value of the examOccupationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOccupationInd(String value) {
        this.examOccupationInd = value;
    }

}
