
package com.theerut.springj11.client.webservice.accountsummary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for EXAM_PersonName_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_PersonName_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EXAM_TitleName" type="{urn:ifxforum-org:XSD:1}NC" minOccurs="0"/>
 *         &lt;element name="EXAM_FirstName" type="{urn:ifxforum-org:XSD:1}NC"/>
 *         &lt;element name="EXAM_LastName" type="{urn:ifxforum-org:XSD:1}NC"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MiddleName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}NameSuffix" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Nickname" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_PersonName_Type", propOrder = {
    "examTitleName",
    "examFirstName",
    "examLastName",
    "middleName",
    "nameSuffix",
    "nickname"
})
public class EXAMPersonNameType {

    @XmlElement(name = "EXAM_TitleName")
    protected String examTitleName;
    @XmlElement(name = "EXAM_FirstName", required = true)
    protected String examFirstName;
    @XmlElement(name = "EXAM_LastName", required = true)
    protected String examLastName;
    @XmlElement(name = "MiddleName")
    protected List<String> middleName;
    @XmlElement(name = "NameSuffix")
    protected String nameSuffix;
    @XmlElement(name = "Nickname")
    protected String nickname;

    /**
     * Gets the value of the examTitleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMTitleName() {
        return examTitleName;
    }

    /**
     * Sets the value of the examTitleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMTitleName(String value) {
        this.examTitleName = value;
    }

    /**
     * Gets the value of the examFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMFirstName() {
        return examFirstName;
    }

    /**
     * Sets the value of the examFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMFirstName(String value) {
        this.examFirstName = value;
    }

    /**
     * Gets the value of the examLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMLastName() {
        return examLastName;
    }

    /**
     * Sets the value of the examLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMLastName(String value) {
        this.examLastName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the middleName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiddleName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMiddleName() {
        if (middleName == null) {
            middleName = new ArrayList<>();
        }
        return this.middleName;
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
     * Gets the value of the nickname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Sets the value of the nickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickname(String value) {
        this.nickname = value;
    }

}
