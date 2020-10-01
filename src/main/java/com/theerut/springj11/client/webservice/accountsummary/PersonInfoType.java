
package com.theerut.springj11.client.webservice.accountsummary;

import com.theerut.springj11.client.webservice.common.ContactInfoType;
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
 * <p>Java class for PersonInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}NameAddrType"/>
 *         &lt;choice>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}FullName"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PersonName"/>
 *         &lt;/choice>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ContactInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TINInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BirthDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DriversLicense" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MotherMaidenName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SpouseName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EmploymentHistory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Gender" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MaritalStatus" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}USA.MilitaryRank" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Dependents" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PassportNumber" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PassportCountry" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OEDCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OEDInstitution" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonInfo_Type", propOrder = {
    "nameAddrType",
    "fullName",
    "personName",
    "contactInfo",
    "tinInfo",
    "birthDt",
    "driversLicense",
    "motherMaidenName",
    "spouseName",
    "employmentHistory",
    "gender",
    "maritalStatus",
    "usaMilitaryRank",
    "dependents",
    "passportNumber",
    "passportCountry",
    "oedCode",
    "oedInstitution"
})
public class PersonInfoType {

    @XmlElement(name = "NameAddrType", required = true)
    protected String nameAddrType;
    @XmlElement(name = "FullName")
    protected String fullName;
    @XmlElement(name = "PersonName")
    protected PersonNameType personName;
    @XmlElement(name = "ContactInfo")
    protected ContactInfoType contactInfo;
    @XmlElement(name = "TINInfo")
    protected TINInfoType tinInfo;
    @XmlElement(name = "BirthDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate birthDt;
    @XmlElement(name = "DriversLicense")
    protected DriversLicenseType driversLicense;
    @XmlElement(name = "MotherMaidenName")
    protected String motherMaidenName;
    @XmlElement(name = "SpouseName")
    protected String spouseName;
    @XmlElement(name = "EmploymentHistory")
    protected List<EmploymentHistoryType> employmentHistory;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElement(name = "MaritalStatus")
    protected String maritalStatus;
    @XmlElement(name = "USA.MilitaryRank")
    protected String usaMilitaryRank;
    @XmlElement(name = "Dependents")
    protected Long dependents;
    @XmlElement(name = "PassportNumber")
    protected String passportNumber;
    @XmlElement(name = "PassportCountry")
    protected String passportCountry;
    @XmlElement(name = "OEDCode")
    protected String oedCode;
    @XmlElement(name = "OEDInstitution")
    protected String oedInstitution;

    /**
     * Gets the value of the nameAddrType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameAddrType() {
        return nameAddrType;
    }

    /**
     * Sets the value of the nameAddrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameAddrType(String value) {
        this.nameAddrType = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setPersonName(PersonNameType value) {
        this.personName = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfoType }
     *     
     */
    public ContactInfoType getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfoType }
     *     
     */
    public void setContactInfo(ContactInfoType value) {
        this.contactInfo = value;
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
     * Gets the value of the driversLicense property.
     * 
     * @return
     *     possible object is
     *     {@link DriversLicenseType }
     *     
     */
    public DriversLicenseType getDriversLicense() {
        return driversLicense;
    }

    /**
     * Sets the value of the driversLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link DriversLicenseType }
     *     
     */
    public void setDriversLicense(DriversLicenseType value) {
        this.driversLicense = value;
    }

    /**
     * Gets the value of the motherMaidenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherMaidenName() {
        return motherMaidenName;
    }

    /**
     * Sets the value of the motherMaidenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherMaidenName(String value) {
        this.motherMaidenName = value;
    }

    /**
     * Gets the value of the spouseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseName() {
        return spouseName;
    }

    /**
     * Sets the value of the spouseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseName(String value) {
        this.spouseName = value;
    }

    /**
     * Gets the value of the employmentHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employmentHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmploymentHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmploymentHistoryType }
     * 
     * 
     */
    public List<EmploymentHistoryType> getEmploymentHistory() {
        if (employmentHistory == null) {
            employmentHistory = new ArrayList<>();
        }
        return this.employmentHistory;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatus(String value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the usaMilitaryRank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSAMilitaryRank() {
        return usaMilitaryRank;
    }

    /**
     * Sets the value of the usaMilitaryRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSAMilitaryRank(String value) {
        this.usaMilitaryRank = value;
    }

    /**
     * Gets the value of the dependents property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDependents() {
        return dependents;
    }

    /**
     * Sets the value of the dependents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDependents(Long value) {
        this.dependents = value;
    }

    /**
     * Gets the value of the passportNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportNumber() {
        return passportNumber;
    }

    /**
     * Sets the value of the passportNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportNumber(String value) {
        this.passportNumber = value;
    }

    /**
     * Gets the value of the passportCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportCountry() {
        return passportCountry;
    }

    /**
     * Sets the value of the passportCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportCountry(String value) {
        this.passportCountry = value;
    }

    /**
     * Gets the value of the oedCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOEDCode() {
        return oedCode;
    }

    /**
     * Sets the value of the oedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOEDCode(String value) {
        this.oedCode = value;
    }

    /**
     * Gets the value of the oedInstitution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOEDInstitution() {
        return oedInstitution;
    }

    /**
     * Sets the value of the oedInstitution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOEDInstitution(String value) {
        this.oedInstitution = value;
    }

}
