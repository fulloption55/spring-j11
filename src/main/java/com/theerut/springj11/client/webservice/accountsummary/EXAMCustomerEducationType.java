
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
 * <p>Java class for EXAM_CustomerEducation_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_CustomerEducation_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SeqNum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EducationLevel" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EductaionInst" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EductaionCrse" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EductaionCtry" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_GraduationYr" minOccurs="0"/>
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
@XmlType(name = "EXAM_CustomerEducation_Type", propOrder = {
    "examSeqNum",
    "examEducationLevel",
    "examEductaionInst",
    "examEductaionCrse",
    "examEductaionCtry",
    "examGraduationYr",
    "examLastMaintDt",
    "examLastMaintTm"
})
public class EXAMCustomerEducationType {

    @XmlElement(name = "EXAM_SeqNum")
    protected Long examSeqNum;
    @XmlElement(name = "EXAM_EducationLevel")
    protected String examEducationLevel;
    @XmlElement(name = "EXAM_EductaionInst")
    protected String examEductaionInst;
    @XmlElement(name = "EXAM_EductaionCrse")
    protected String examEductaionCrse;
    @XmlElement(name = "EXAM_EductaionCtry")
    protected String examEductaionCtry;
    @XmlElement(name = "EXAM_GraduationYr")
    protected String examGraduationYr;
    @XmlElement(name = "EXAM_LastMaintDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examLastMaintDt;
    @XmlElement(name = "EXAM_LastMaintTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar examLastMaintTm;

    /**
     * Gets the value of the examSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEXAMSeqNum() {
        return examSeqNum;
    }

    /**
     * Sets the value of the examSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEXAMSeqNum(Long value) {
        this.examSeqNum = value;
    }

    /**
     * Gets the value of the examEducationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMEducationLevel() {
        return examEducationLevel;
    }

    /**
     * Sets the value of the examEducationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEducationLevel(String value) {
        this.examEducationLevel = value;
    }

    /**
     * Gets the value of the examEductaionInst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMEductaionInst() {
        return examEductaionInst;
    }

    /**
     * Sets the value of the examEductaionInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEductaionInst(String value) {
        this.examEductaionInst = value;
    }

    /**
     * Gets the value of the examEductaionCrse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMEductaionCrse() {
        return examEductaionCrse;
    }

    /**
     * Sets the value of the examEductaionCrse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEductaionCrse(String value) {
        this.examEductaionCrse = value;
    }

    /**
     * Gets the value of the examEductaionCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMEductaionCtry() {
        return examEductaionCtry;
    }

    /**
     * Sets the value of the examEductaionCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEductaionCtry(String value) {
        this.examEductaionCtry = value;
    }

    /**
     * Gets the value of the examGraduationYr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMGraduationYr() {
        return examGraduationYr;
    }

    /**
     * Sets the value of the examGraduationYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMGraduationYr(String value) {
        this.examGraduationYr = value;
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
