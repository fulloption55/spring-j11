
package com.theerut.springj11.client.webservice.accountsummary;

import com.theerut.springj11.utils.LocalDateAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;


/**
 * <p>Java class for EXAM_CustomerLifeStyle_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_CustomerLifeStyle_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LifeStyleCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_UserCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastMaintDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastMaintTm" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_CustomerLifeStyle_Type", propOrder = {
    "examLifeStyleCode",
    "examUserCode",
    "examLastMaintDt",
    "examLastMaintTm"
})
public class EXAMCustomerLifeStyleType {

    @XmlElement(name = "EXAM_LifeStyleCode")
    protected String examLifeStyleCode;
    @XmlElement(name = "EXAM_UserCode")
    protected String examUserCode;
    @XmlElement(name = "EXAM_LastMaintDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examLastMaintDt;
    @XmlElement(name = "EXAM_LastMaintTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar examLastMaintTm;

    /**
     * Gets the value of the examLifeStyleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMLifeStyleCode() {
        return examLifeStyleCode;
    }

    /**
     * Sets the value of the examLifeStyleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMLifeStyleCode(String value) {
        this.examLifeStyleCode = value;
    }

    /**
     * Gets the value of the examUserCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMUserCode() {
        return examUserCode;
    }

    /**
     * Sets the value of the examUserCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMUserCode(String value) {
        this.examUserCode = value;
    }

    /**
     * Gets the value of the examLastMaintDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMLastMaintDt() {
        return examLastMaintDt;
    }

    /**
     * Sets the value of the examLastMaintDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMLastMaintDt(LocalDate value) {
        this.examLastMaintDt = value;
    }

    /**
     * Gets the value of the examLastMaintTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEXAMLastMaintTm() {
        return examLastMaintTm;
    }

    /**
     * Sets the value of the examLastMaintTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEXAMLastMaintTm(XMLGregorianCalendar value) {
        this.examLastMaintTm = value;
    }

}
