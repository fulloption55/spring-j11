
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
 * <p>Java class for EXAM_MaintInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_MaintInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastMaintUID" minOccurs="0"/>
 *         &lt;element name="EXAM_LastMaintWrkSt" type="{urn:ifxforum-org:XSD:1}NC" minOccurs="0"/>
 *         &lt;element name="EXAM_LastMaintDt" type="{urn:ifxforum-org:XSD:1}Date" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastMaintTm" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastMaintTmStamp" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastMaintSrc" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_MaintInfo_Type", propOrder = {
    "examLastMaintUID",
    "examLastMaintWrkSt",
    "examLastMaintDt",
    "examLastMaintTm",
    "examLastMaintTmStamp",
    "examLastMaintSrc"
})
public class EXAMMaintInfoType {

    @XmlElement(name = "EXAM_LastMaintUID")
    protected String examLastMaintUID;
    @XmlElement(name = "EXAM_LastMaintWrkSt")
    protected String examLastMaintWrkSt;
    @XmlElement(name = "EXAM_LastMaintDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examLastMaintDt;
    @XmlElement(name = "EXAM_LastMaintTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar examLastMaintTm;
    @XmlElement(name = "EXAM_LastMaintTmStamp")
    protected String examLastMaintTmStamp;
    @XmlElement(name = "EXAM_LastMaintSrc")
    protected String examLastMaintSrc;

    /**
     * Gets the value of the examLastMaintUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMLastMaintUID() {
        return examLastMaintUID;
    }

    /**
     * Sets the value of the examLastMaintUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMLastMaintUID(String value) {
        this.examLastMaintUID = value;
    }

    /**
     * Gets the value of the examLastMaintWrkSt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMLastMaintWrkSt() {
        return examLastMaintWrkSt;
    }

    /**
     * Sets the value of the examLastMaintWrkSt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMLastMaintWrkSt(String value) {
        this.examLastMaintWrkSt = value;
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

    /**
     * Gets the value of the examLastMaintTmStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMLastMaintTmStamp() {
        return examLastMaintTmStamp;
    }

    /**
     * Sets the value of the examLastMaintTmStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMLastMaintTmStamp(String value) {
        this.examLastMaintTmStamp = value;
    }

    /**
     * Gets the value of the examLastMaintSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMLastMaintSrc() {
        return examLastMaintSrc;
    }

    /**
     * Sets the value of the examLastMaintSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMLastMaintSrc(String value) {
        this.examLastMaintSrc = value;
    }

}
