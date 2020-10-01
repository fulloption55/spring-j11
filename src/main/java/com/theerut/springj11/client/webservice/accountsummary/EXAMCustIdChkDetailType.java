
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
 * <p>Java class for EXAM_CustIdChkDetail_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_CustIdChkDetail_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustPermId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PrimaryId" minOccurs="0"/>
 *         &lt;element name="EXAM_AlternateId" type="{urn:ifxforum-org:XSD:1}EXAM_CustomerIdentification_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NameFormat" minOccurs="0"/>
 *         &lt;element name="EXAM_CustomerName" type="{urn:ifxforum-org:XSD:1}NC" maxOccurs="unbounded"/>
 *         &lt;element name="EXAM_OtherNameRelType" type="{urn:ifxforum-org:XSD:1}EXAM_OtherNameRelType_Type" minOccurs="0"/>
 *         &lt;element name="EXAM_OtherName" type="{urn:ifxforum-org:XSD:1}NC" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BirthDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MatchType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustStatusCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Restrict" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_CustIdChkDetail_Type", propOrder = {
    "custPermId",
    "examPrimaryId",
    "examAlternateId",
    "examNameFormat",
    "examCustomerName",
    "examOtherNameRelType",
    "examOtherName",
    "birthDt",
    "examMatchType",
    "custStatusCode",
    "examRestrict"
})
public class EXAMCustIdChkDetailType {

    @XmlElement(name = "CustPermId")
    protected String custPermId;
    @XmlElement(name = "EXAM_PrimaryId")
    protected EXAMCustomerIdentificationType examPrimaryId;
    @XmlElement(name = "EXAM_AlternateId")
    protected List<EXAMCustomerIdentificationType> examAlternateId;
    @XmlElement(name = "EXAM_NameFormat")
    protected String examNameFormat;
    @XmlElement(name = "EXAM_CustomerName", required = true)
    protected List<String> examCustomerName;
    @XmlElement(name = "EXAM_OtherNameRelType")
    protected String examOtherNameRelType;
    @XmlElement(name = "EXAM_OtherName")
    protected String examOtherName;
    @XmlElement(name = "BirthDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate birthDt;
    @XmlElement(name = "EXAM_MatchType")
    protected String examMatchType;
    @XmlElement(name = "CustStatusCode")
    protected String custStatusCode;
    @XmlElement(name = "EXAM_Restrict")
    protected String examRestrict;

    /**
     * Gets the value of the custPermId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustPermId() {
        return custPermId;
    }

    /**
     * Sets the value of the custPermId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustPermId(String value) {
        this.custPermId = value;
    }

    /**
     * Gets the value of the examPrimaryId property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMCustomerIdentificationType }
     *     
     */
    public EXAMCustomerIdentificationType getEXAMPrimaryId() {
        return examPrimaryId;
    }

    /**
     * Sets the value of the examPrimaryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMCustomerIdentificationType }
     *     
     */
    public void setEXAMPrimaryId(EXAMCustomerIdentificationType value) {
        this.examPrimaryId = value;
    }

    /**
     * Gets the value of the examAlternateId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examAlternateId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMAlternateId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMCustomerIdentificationType }
     * 
     * 
     */
    public List<EXAMCustomerIdentificationType> getEXAMAlternateId() {
        if (examAlternateId == null) {
            examAlternateId = new ArrayList<>();
        }
        return this.examAlternateId;
    }

    /**
     * Gets the value of the examNameFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMNameFormat() {
        return examNameFormat;
    }

    /**
     * Sets the value of the examNameFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMNameFormat(String value) {
        this.examNameFormat = value;
    }

    /**
     * Gets the value of the examCustomerName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examCustomerName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMCustomerName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMCustomerName() {
        if (examCustomerName == null) {
            examCustomerName = new ArrayList<>();
        }
        return this.examCustomerName;
    }

    /**
     * Gets the value of the examOtherNameRelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOtherNameRelType() {
        return examOtherNameRelType;
    }

    /**
     * Sets the value of the examOtherNameRelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOtherNameRelType(String value) {
        this.examOtherNameRelType = value;
    }

    /**
     * Gets the value of the examOtherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOtherName() {
        return examOtherName;
    }

    /**
     * Sets the value of the examOtherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOtherName(String value) {
        this.examOtherName = value;
    }

    /**
     * Gets the value of the birthDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getBirthDt() {
        return birthDt;
    }

    /**
     * Sets the value of the birthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDt(LocalDate value) {
        this.birthDt = value;
    }

    /**
     * Gets the value of the examMatchType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMatchType() {
        return examMatchType;
    }

    /**
     * Sets the value of the examMatchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMatchType(String value) {
        this.examMatchType = value;
    }

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
     * Gets the value of the examRestrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMRestrict() {
        return examRestrict;
    }

    /**
     * Sets the value of the examRestrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMRestrict(String value) {
        this.examRestrict = value;
    }

}
