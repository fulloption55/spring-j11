
package com.theerut.springj11.client.webservice.accountsummary;

import com.theerut.springj11.client.webservice.common.IndustIdType;
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
 * <p>Java class for OrgInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrgInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IndustId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Name" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}LegalName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CompositeContactInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TINInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EstablishDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}NumEmployees" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrgInfo_Type", propOrder = {
    "industId",
    "name",
    "legalName",
    "compositeContactInfo",
    "tinInfo",
    "establishDt",
    "numEmployees"
})
public class OrgInfoType {

    @XmlElement(name = "IndustId")
    protected IndustIdType industId;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "LegalName")
    protected String legalName;
    @XmlElement(name = "CompositeContactInfo")
    protected List<CompositeContactInfoType> compositeContactInfo;
    @XmlElement(name = "TINInfo")
    protected TINInfoType tinInfo;
    @XmlElement(name = "EstablishDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate establishDt;
    @XmlElement(name = "NumEmployees")
    protected Long numEmployees;

    /**
     * Gets the value of the industId property.
     * 
     * @return
     *     possible object is
     *     {@link IndustIdType }
     *     
     */
    public IndustIdType getIndustId() {
        return industId;
    }

    /**
     * Sets the value of the industId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustIdType }
     *     
     */
    public void setIndustId(IndustIdType value) {
        this.industId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the legalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalName() {
        return legalName;
    }

    /**
     * Sets the value of the legalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalName(String value) {
        this.legalName = value;
    }

    /**
     * Gets the value of the compositeContactInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compositeContactInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompositeContactInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompositeContactInfoType }
     * 
     * 
     */
    public List<CompositeContactInfoType> getCompositeContactInfo() {
        if (compositeContactInfo == null) {
            compositeContactInfo = new ArrayList<>();
        }
        return this.compositeContactInfo;
    }

    /**
     * Gets the value of the tinInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TINInfoType }
     *     
     */
    public TINInfoType getTINInfo() {
        return tinInfo;
    }

    /**
     * Sets the value of the tinInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TINInfoType }
     *     
     */
    public void setTINInfo(TINInfoType value) {
        this.tinInfo = value;
    }

    /**
     * Gets the value of the establishDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEstablishDt() {
        return establishDt;
    }

    /**
     * Sets the value of the establishDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishDt(LocalDate value) {
        this.establishDt = value;
    }

    /**
     * Gets the value of the numEmployees property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumEmployees() {
        return numEmployees;
    }

    /**
     * Sets the value of the numEmployees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumEmployees(Long value) {
        this.numEmployees = value;
    }

}
