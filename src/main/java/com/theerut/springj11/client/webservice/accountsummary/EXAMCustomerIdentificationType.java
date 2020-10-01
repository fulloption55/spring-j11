
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
 * <p>Java class for EXAM_CustomerIdentification_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_CustomerIdentification_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EXAM_Id" type="{urn:ifxforum-org:XSD:1}EXAM_Id_Type"/>
 *         &lt;element name="EXAM_IdTp" type="{urn:ifxforum-org:XSD:1}OpenEnum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Country" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IdStatus" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IdExpDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustEntityNum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_CustomerIdentification_Type", propOrder = {
    "examId",
    "examIdTp",
    "country",
    "examIdStatus",
    "examIdExpDt",
    "examCustEntityNum"
})
public class EXAMCustomerIdentificationType {

    @XmlElement(name = "EXAM_Id", required = true)
    protected String examId;
    @XmlElement(name = "EXAM_IdTp")
    protected String examIdTp;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "EXAM_IdStatus")
    protected String examIdStatus;
    @XmlElement(name = "EXAM_IdExpDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examIdExpDt;
    @XmlElement(name = "EXAM_CustEntityNum")
    protected String examCustEntityNum;

    /**
     * Gets the value of the examId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMId() {
        return examId;
    }

    /**
     * Sets the value of the examId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMId(String value) {
        this.examId = value;
    }

    /**
     * Gets the value of the examIdTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIdTp() {
        return examIdTp;
    }

    /**
     * Sets the value of the examIdTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIdTp(String value) {
        this.examIdTp = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the examIdStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIdStatus() {
        return examIdStatus;
    }

    /**
     * Sets the value of the examIdStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIdStatus(String value) {
        this.examIdStatus = value;
    }

    /**
     * Gets the value of the examIdExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMIdExpDt() {
        return examIdExpDt;
    }

    /**
     * Sets the value of the examIdExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIdExpDt(LocalDate value) {
        this.examIdExpDt = value;
    }

    /**
     * Gets the value of the examCustEntityNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCustEntityNum() {
        return examCustEntityNum;
    }

    /**
     * Sets the value of the examCustEntityNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCustEntityNum(String value) {
        this.examCustEntityNum = value;
    }

}
