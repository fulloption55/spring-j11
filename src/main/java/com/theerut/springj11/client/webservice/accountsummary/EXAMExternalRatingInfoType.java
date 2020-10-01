
package com.theerut.springj11.client.webservice.accountsummary;

import com.theerut.springj11.utils.LocalDateAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;


/**
 * <p>Java class for EXAM_ExternalRatingInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_ExternalRatingInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ExternalRatingSrc" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ExternalRatingCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ExternalRating_EffecDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ExternalRating_ExpiryDt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_ExternalRatingInfo_Type", propOrder = {
    "examExternalRatingSrc",
    "examExternalRatingCode",
    "examExternalRatingEffecDt",
    "examExternalRatingExpiryDt"
})
public class EXAMExternalRatingInfoType {

    @XmlElement(name = "EXAM_ExternalRatingSrc")
    protected String examExternalRatingSrc;
    @XmlElement(name = "EXAM_ExternalRatingCode")
    protected String examExternalRatingCode;
    @XmlElement(name = "EXAM_ExternalRating_EffecDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examExternalRatingEffecDt;
    @XmlElement(name = "EXAM_ExternalRating_ExpiryDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examExternalRatingExpiryDt;

    /**
     * Gets the value of the examExternalRatingSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMExternalRatingSrc() {
        return examExternalRatingSrc;
    }

    /**
     * Sets the value of the examExternalRatingSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMExternalRatingSrc(String value) {
        this.examExternalRatingSrc = value;
    }

    /**
     * Gets the value of the examExternalRatingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMExternalRatingCode() {
        return examExternalRatingCode;
    }

    /**
     * Sets the value of the examExternalRatingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMExternalRatingCode(String value) {
        this.examExternalRatingCode = value;
    }

    /**
     * Gets the value of the examExternalRatingEffecDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMExternalRatingEffecDt() {
        return examExternalRatingEffecDt;
    }

    /**
     * Sets the value of the examExternalRatingEffecDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMExternalRatingEffecDt(LocalDate value) {
        this.examExternalRatingEffecDt = value;
    }

    /**
     * Gets the value of the examExternalRatingExpiryDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMExternalRatingExpiryDt() {
        return examExternalRatingExpiryDt;
    }

    /**
     * Sets the value of the examExternalRatingExpiryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMExternalRatingExpiryDt(LocalDate value) {
        this.examExternalRatingExpiryDt = value;
    }

}
