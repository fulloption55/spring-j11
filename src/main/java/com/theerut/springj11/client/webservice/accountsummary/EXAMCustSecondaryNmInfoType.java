
package com.theerut.springj11.client.webservice.accountsummary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for EXAM_CustSecondaryNmInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_CustSecondaryNmInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NameFormat" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}NameSuffix" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustomerName" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_CustSecondaryNmInfo_Type", propOrder = {
    "examNameFormat",
    "nameSuffix",
    "examCustomerName"
})
public class EXAMCustSecondaryNmInfoType {

    @XmlElement(name = "EXAM_NameFormat")
    protected String examNameFormat;
    @XmlElement(name = "NameSuffix")
    protected String nameSuffix;
    @XmlElement(name = "EXAM_CustomerName")
    protected List<String> examCustomerName;

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
     * Gets the value of the nameSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameSuffix() {
        return nameSuffix;
    }

    /**
     * Sets the value of the nameSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameSuffix(String value) {
        this.nameSuffix = value;
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

}
