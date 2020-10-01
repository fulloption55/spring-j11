
package com.theerut.springj11.client.webservice.accountsummary;

import com.theerut.springj11.utils.LocalDateAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for EXAM_Overseas_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_Overseas_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EXAM_OverseasInd" type="{urn:ifxforum-org:XSD:1}NC"/>
 *         &lt;element name="EXAM_OverseasEffDt" type="{urn:ifxforum-org:XSD:1}Date"/>
 *         &lt;element name="EXAM_OverseasEffDate" type="{urn:ifxforum-org:XSD:1}NC"/>
 *         &lt;element name="EXAM_OverseasExpDt" type="{urn:ifxforum-org:XSD:1}Date"/>
 *         &lt;element name="EXAM_OverseasExpDate" type="{urn:ifxforum-org:XSD:1}NC"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CardInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Country" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_Overseas_Type", propOrder = {
    "examOverseasInd",
    "examOverseasEffDt",
    "examOverseasEffDate",
    "examOverseasExpDt",
    "examOverseasExpDate",
    "examCardInd",
    "country"
})
public class EXAMOverseasType {

    @XmlElement(name = "EXAM_OverseasInd", required = true)
    protected String examOverseasInd;
    @XmlElement(name = "EXAM_OverseasEffDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examOverseasEffDt;
    @XmlElement(name = "EXAM_OverseasEffDate", required = true)
    protected String examOverseasEffDate;
    @XmlElement(name = "EXAM_OverseasExpDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examOverseasExpDt;
    @XmlElement(name = "EXAM_OverseasExpDate", required = true)
    protected String examOverseasExpDate;
    @XmlElement(name = "EXAM_CardInd")
    protected String examCardInd;
    @XmlElement(name = "Country")
    protected List<String> country;

    /**
     * Gets the value of the examOverseasInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOverseasInd() {
        return examOverseasInd;
    }

    /**
     * Sets the value of the examOverseasInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOverseasInd(String value) {
        this.examOverseasInd = value;
    }

    /**
     * Gets the value of the examOverseasEffDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMOverseasEffDt() {
        return examOverseasEffDt;
    }

    /**
     * Sets the value of the examOverseasEffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOverseasEffDt(LocalDate value) {
        this.examOverseasEffDt = value;
    }

    /**
     * Gets the value of the examOverseasEffDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOverseasEffDate() {
        return examOverseasEffDate;
    }

    /**
     * Sets the value of the examOverseasEffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOverseasEffDate(String value) {
        this.examOverseasEffDate = value;
    }

    /**
     * Gets the value of the examOverseasExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMOverseasExpDt() {
        return examOverseasExpDt;
    }

    /**
     * Sets the value of the examOverseasExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOverseasExpDt(LocalDate value) {
        this.examOverseasExpDt = value;
    }

    /**
     * Gets the value of the examOverseasExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOverseasExpDate() {
        return examOverseasExpDate;
    }

    /**
     * Sets the value of the examOverseasExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOverseasExpDate(String value) {
        this.examOverseasExpDate = value;
    }

    /**
     * Gets the value of the examCardInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCardInd() {
        return examCardInd;
    }

    /**
     * Sets the value of the examCardInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCardInd(String value) {
        this.examCardInd = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the country property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCountry() {
        if (country == null) {
            country = new ArrayList<>();
        }
        return this.country;
    }

}
