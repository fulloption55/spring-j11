
package com.theerut.springj11.client.webservice.accountsummary;

import com.theerut.springj11.utils.LocalDateAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.time.LocalDate;


/**
 * <p>Java class for EXAM_FDCycle_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_FDCycle_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CycleNumber" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Term" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TermCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Rate1" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_InterestAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_StartDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PayDt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_FDCycle_Type", propOrder = {
    "examCycleNumber",
    "examTerm",
    "examTermCode",
    "examRate1",
    "examInterestAmt",
    "examStartDt",
    "examPayDt"
})
public class EXAMFDCycleType {

    @XmlElement(name = "EXAM_CycleNumber")
    protected String examCycleNumber;
    @XmlElement(name = "EXAM_Term")
    protected Long examTerm;
    @XmlElement(name = "EXAM_TermCode")
    protected String examTermCode;
    @XmlElement(name = "EXAM_Rate1")
    protected BigDecimal examRate1;
    @XmlElement(name = "EXAM_InterestAmt")
    protected BigDecimal examInterestAmt;
    @XmlElement(name = "EXAM_StartDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examStartDt;
    @XmlElement(name = "EXAM_PayDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examPayDt;

    /**
     * Gets the value of the examCycleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCycleNumber() {
        return examCycleNumber;
    }

    /**
     * Sets the value of the examCycleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCycleNumber(String value) {
        this.examCycleNumber = value;
    }

    /**
     * Gets the value of the examTerm property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEXAMTerm() {
        return examTerm;
    }

    /**
     * Sets the value of the examTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEXAMTerm(Long value) {
        this.examTerm = value;
    }

    /**
     * Gets the value of the examTermCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMTermCode() {
        return examTermCode;
    }

    /**
     * Sets the value of the examTermCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMTermCode(String value) {
        this.examTermCode = value;
    }

    /**
     * Gets the value of the examRate1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMRate1() {
        return examRate1;
    }

    /**
     * Sets the value of the examRate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMRate1(BigDecimal value) {
        this.examRate1 = value;
    }

    /**
     * Gets the value of the examInterestAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMInterestAmt() {
        return examInterestAmt;
    }

    /**
     * Sets the value of the examInterestAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMInterestAmt(BigDecimal value) {
        this.examInterestAmt = value;
    }

    /**
     * Gets the value of the examStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMStartDt() {
        return examStartDt;
    }

    /**
     * Sets the value of the examStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMStartDt(LocalDate value) {
        this.examStartDt = value;
    }

    /**
     * Gets the value of the examPayDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMPayDt() {
        return examPayDt;
    }

    /**
     * Sets the value of the examPayDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPayDt(LocalDate value) {
        this.examPayDt = value;
    }

}
