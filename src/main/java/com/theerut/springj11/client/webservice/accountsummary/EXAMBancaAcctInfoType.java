
package com.theerut.springj11.client.webservice.accountsummary;

import com.theerut.springj11.client.webservice.common.TermType;
import com.theerut.springj11.utils.LocalDateAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;


/**
 * <p>Java class for EXAM_BancaAcctInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_BancaAcctInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SPRefId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SPName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EffDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MaturityDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PmtTerm" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_BancaAcctInfo_Type", propOrder = {
    "spRefId",
    "spName",
    "examEffDt",
    "examMaturityDt",
    "examPmtTerm"
})
public class EXAMBancaAcctInfoType {

    @XmlElement(name = "SPRefId")
    protected String spRefId;
    @XmlElement(name = "SPName")
    protected String spName;
    @XmlElement(name = "EXAM_EffDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examEffDt;
    @XmlElement(name = "EXAM_MaturityDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examMaturityDt;
    @XmlElement(name = "EXAM_PmtTerm")
    protected TermType examPmtTerm;

    /**
     * Gets the value of the spRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPRefId() {
        return spRefId;
    }

    /**
     * Sets the value of the spRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPRefId(String value) {
        this.spRefId = value;
    }

    /**
     * Gets the value of the spName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPName() {
        return spName;
    }

    /**
     * Sets the value of the spName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPName(String value) {
        this.spName = value;
    }

    /**
     * Gets the value of the examEffDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMEffDt() {
        return examEffDt;
    }

    /**
     * Sets the value of the examEffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEffDt(LocalDate value) {
        this.examEffDt = value;
    }

    /**
     * Gets the value of the examMaturityDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMMaturityDt() {
        return examMaturityDt;
    }

    /**
     * Sets the value of the examMaturityDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMaturityDt(LocalDate value) {
        this.examMaturityDt = value;
    }

    /**
     * Gets the value of the examPmtTerm property.
     * 
     * @return
     *     possible object is
     *     {@link TermType }
     *     
     */
    public TermType getEXAMPmtTerm() {
        return examPmtTerm;
    }

    /**
     * Sets the value of the examPmtTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermType }
     *     
     */
    public void setEXAMPmtTerm(TermType value) {
        this.examPmtTerm = value;
    }

}
