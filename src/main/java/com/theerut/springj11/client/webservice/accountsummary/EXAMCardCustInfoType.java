
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
 * <p>Java class for EXAM_CardCustInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_CardCustInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustStatusCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustBScore" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ExtAcctBal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EffDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ExpDt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_CardCustInfo_Type", propOrder = {
    "custStatusCode",
    "examCustBScore",
    "extAcctBal",
    "examEffDt",
    "examExpDt"
})
public class EXAMCardCustInfoType {

    @XmlElement(name = "CustStatusCode")
    protected String custStatusCode;
    @XmlElement(name = "EXAM_CustBScore")
    protected String examCustBScore;
    @XmlElement(name = "ExtAcctBal")
    protected List<ExtAcctBalType> extAcctBal;
    @XmlElement(name = "EXAM_EffDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examEffDt;
    @XmlElement(name = "EXAM_ExpDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examExpDt;

    /**
     * Gets the value of the custStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustStatusCode() {
        return custStatusCode;
    }

    /**
     * Sets the value of the custStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustStatusCode(String value) {
        this.custStatusCode = value;
    }

    /**
     * Gets the value of the examCustBScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCustBScore() {
        return examCustBScore;
    }

    /**
     * Sets the value of the examCustBScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCustBScore(String value) {
        this.examCustBScore = value;
    }

    /**
     * Gets the value of the extAcctBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extAcctBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtAcctBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtAcctBalType }
     * 
     * 
     */
    public List<ExtAcctBalType> getExtAcctBal() {
        if (extAcctBal == null) {
            extAcctBal = new ArrayList<>();
        }
        return this.extAcctBal;
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
     * Gets the value of the examExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMExpDt() {
        return examExpDt;
    }

    /**
     * Sets the value of the examExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMExpDt(LocalDate value) {
        this.examExpDt = value;
    }

}
