
package com.theerut.springj11.client.webservice.accountsummary;

import com.theerut.springj11.utils.LocalDateAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for EXAM_Occupation_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_Occupation_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NumberOfYear" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EmploymentStartYear" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EmployerCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_JobDesignation" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OccupationInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EmployerName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Remarks" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastMaintDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastMaintTm" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EmploymentStartDate" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EmploymentMonthlyIncome" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OccupationCode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_Occupation_Type", propOrder = {
    "examNumberOfYear",
    "examEmploymentStartYear",
    "examEmployerCode",
    "examJobDesignation",
    "examOccupationInd",
    "examEmployerName",
    "examRemarks",
    "examLastMaintDt",
    "examLastMaintTm",
    "examEmploymentStartDate",
    "examEmploymentMonthlyIncome",
    "examOccupationCode"
})
public class EXAMOccupationType {

    @XmlElement(name = "EXAM_NumberOfYear")
    protected BigDecimal examNumberOfYear;
    @XmlElement(name = "EXAM_EmploymentStartYear")
    protected BigInteger examEmploymentStartYear;
    @XmlElement(name = "EXAM_EmployerCode")
    protected String examEmployerCode;
    @XmlElement(name = "EXAM_JobDesignation")
    protected String examJobDesignation;
    @XmlElement(name = "EXAM_OccupationInd")
    protected String examOccupationInd;
    @XmlElement(name = "EXAM_EmployerName")
    protected String examEmployerName;
    @XmlElement(name = "EXAM_Remarks")
    protected List<String> examRemarks;
    @XmlElement(name = "EXAM_LastMaintDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examLastMaintDt;
    @XmlElement(name = "EXAM_LastMaintTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar examLastMaintTm;
    @XmlElement(name = "EXAM_EmploymentStartDate")
    protected String examEmploymentStartDate;
    @XmlElement(name = "EXAM_EmploymentMonthlyIncome")
    protected String examEmploymentMonthlyIncome;
    @XmlElement(name = "EXAM_OccupationCode", required = true)
    protected String examOccupationCode;

    /**
     * Gets the value of the examNumberOfYear property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMNumberOfYear() {
        return examNumberOfYear;
    }

    /**
     * Sets the value of the examNumberOfYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMNumberOfYear(BigDecimal value) {
        this.examNumberOfYear = value;
    }

    /**
     * Gets the value of the examEmploymentStartYear property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEXAMEmploymentStartYear() {
        return examEmploymentStartYear;
    }

    /**
     * Sets the value of the examEmploymentStartYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEXAMEmploymentStartYear(BigInteger value) {
        this.examEmploymentStartYear = value;
    }

    /**
     * Gets the value of the examEmployerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMEmployerCode() {
        return examEmployerCode;
    }

    /**
     * Sets the value of the examEmployerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEmployerCode(String value) {
        this.examEmployerCode = value;
    }

    /**
     * Gets the value of the examJobDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMJobDesignation() {
        return examJobDesignation;
    }

    /**
     * Sets the value of the examJobDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMJobDesignation(String value) {
        this.examJobDesignation = value;
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

    /**
     * Gets the value of the examEmployerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMEmployerName() {
        return examEmployerName;
    }

    /**
     * Sets the value of the examEmployerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEmployerName(String value) {
        this.examEmployerName = value;
    }

    /**
     * Gets the value of the examRemarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examRemarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMRemarks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMRemarks() {
        if (examRemarks == null) {
            examRemarks = new ArrayList<>();
        }
        return this.examRemarks;
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
     * Gets the value of the examEmploymentStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMEmploymentStartDate() {
        return examEmploymentStartDate;
    }

    /**
     * Sets the value of the examEmploymentStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEmploymentStartDate(String value) {
        this.examEmploymentStartDate = value;
    }

    /**
     * Gets the value of the examEmploymentMonthlyIncome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMEmploymentMonthlyIncome() {
        return examEmploymentMonthlyIncome;
    }

    /**
     * Sets the value of the examEmploymentMonthlyIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEmploymentMonthlyIncome(String value) {
        this.examEmploymentMonthlyIncome = value;
    }

    /**
     * Gets the value of the examOccupationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOccupationCode() {
        return examOccupationCode;
    }

    /**
     * Sets the value of the examOccupationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOccupationCode(String value) {
        this.examOccupationCode = value;
    }

}
