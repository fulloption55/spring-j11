
package com.theerut.springj11.client.webservice.accountsummary;

import com.theerut.springj11.client.webservice.common.EXAMContactDetailsType;
import com.theerut.springj11.client.webservice.common.EXAMExtensionInfoType;
import com.theerut.springj11.client.webservice.common.EXAMGovIssueIdentType;
import com.theerut.springj11.client.webservice.common.EXAMPostAddrType;
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
 * <p>Java class for EXAM_PersonInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_PersonInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustPermId"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_HomeCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AddressFormat" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustomerName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PersonInfo"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ContactDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_GovIssueId"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AltId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TaxId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustCategory" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustSubCategory" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ResStatus" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustStatus" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CountryofCitizenship" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CitizenCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustRace" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Religion" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PrefLang" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustEducCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BusinessSector" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_VIPIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SubVIPInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SMEIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SubSMEIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustSegmentCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BusinessType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_StaffInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustCreatedDt"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustTemplateCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustCreationBankID" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustCreationBrnID" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustServicingBrn" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ServicingRM" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LPInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OtherContactsInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IdentVerifyMethod" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PersonName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IncomeRange" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OrigFundSrcCountry" minOccurs="0"/>
 *         &lt;element name="EXAM_RegAddrSameAsMail" type="{urn:ifxforum-org:XSD:1}NC" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CountryofCitizenshipInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CitizenInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OrigFundSrcCountryInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BusinessSectorInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NameFormat" minOccurs="0"/>
 *         &lt;group ref="{urn:ifxforum-org:XSD:1}EXAM_ExtnGroup" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SubClass" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MaritalStatus" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MaritalStatusDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IsDeceased" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DeceasedDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SectorCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NumDependantKid" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NumDependantTeen" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BOIFlag" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PostAddr" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BusinessSector2" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BusinessSector3" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MoreContactDetailsIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MoreIDDetailsIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_InsufficientAddr" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ShortName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Nickname" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Alt2Id" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SourceOfFund" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BIIndustryCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DefaultCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Village" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_District" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FullName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BirthDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PersonName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_GovIssueIdent" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ContactInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustNameDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OtherInc" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Occupation" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EmployerName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Business_SegCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TitleName" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_PersonInfo_Type", propOrder = {
    "custPermId",
    "examHomeCode",
    "examAddressFormat",
    "examCustomerName",
    "personInfo",
    "examContactDetails",
    "examGovIssueId",
    "examAltId",
    "examTaxId",
    "custType",
    "examCustCategory",
    "examCustSubCategory",
    "examResStatus",
    "custStatus",
    "examCountryofCitizenship",
    "examCitizenCode",
    "examCustRace",
    "examReligion",
    "examPrefLang",
    "examCustEducCode",
    "examBusinessSector",
    "examvipIndicator",
    "examSubVIPInd",
    "examsmeIndicator",
    "examSubSMEIndicator",
    "examCustSegmentCode",
    "examBusinessType",
    "examStaffInd",
    "examCustCreatedDt",
    "examCustTemplateCode",
    "examCustCreationBankID",
    "examCustCreationBrnID",
    "examCustServicingBrn",
    "examServicingRM",
    "examlpInd",
    "examOtherContactsInfo",
    "identVerifyMethod",
    "examPersonName",
    "examIncomeRange",
    "examOrigFundSrcCountry",
    "examRegAddrSameAsMail",
    "examCountryofCitizenshipInd",
    "examCitizenInd",
    "examOrigFundSrcCountryInd",
    "examBusinessSectorInd",
    "examNameFormat",
    "examExtnInfo",
    "examSubClass",
    "maritalStatus",
    "examMaritalStatusDt",
    "examIsDeceased",
    "examDeceasedDt",
    "examSectorCode",
    "examNumDependantKid",
    "examNumDependantTeen",
    "examboiFlag",
    "examPostAddr",
    "examBusinessSector2",
    "examBusinessSector3",
    "examMoreContactDetailsIndicator",
    "examMoreIDDetailsIndicator",
    "examInsufficientAddr",
    "examShortName",
    "nickname",
    "examAlt2Id",
    "examSourceOfFund",
    "exambiIndustryCode",
    "examDefaultCode",
    "examVillage",
    "examDistrict",
    "fullName",
    "birthDt",
    "personName",
    "examGovIssueIdent",
    "examContactInfo",
    "examCustNameDetail",
    "examOtherInc",
    "examOccupation",
    "examEmployerName",
    "examBusinessSegCode",
    "examTitleName"
})
public class EXAMPersonInfoType {

    @XmlElement(name = "CustPermId", required = true)
    protected String custPermId;
    @XmlElement(name = "EXAM_HomeCode")
    protected List<String> examHomeCode;
    @XmlElement(name = "EXAM_AddressFormat")
    protected List<String> examAddressFormat;
    @XmlElement(name = "EXAM_CustomerName")
    protected List<String> examCustomerName;
    @XmlElement(name = "PersonInfo", required = true)
    protected PersonInfoType personInfo;
    @XmlElement(name = "EXAM_ContactDetails")
    protected List<EXAMContactDetailsType> examContactDetails;
    @XmlElement(name = "EXAM_GovIssueId", required = true)
    protected EXAMGovIssueIdentType examGovIssueId;
    @XmlElement(name = "EXAM_AltId")
    protected EXAMGovIssueIdentType examAltId;
    @XmlElement(name = "EXAM_TaxId")
    protected EXAMGovIssueIdentType examTaxId;
    @XmlElement(name = "CustType")
    protected String custType;
    @XmlElement(name = "EXAM_CustCategory")
    protected String examCustCategory;
    @XmlElement(name = "EXAM_CustSubCategory")
    protected String examCustSubCategory;
    @XmlElement(name = "EXAM_ResStatus")
    protected String examResStatus;
    @XmlElement(name = "CustStatus")
    protected CustStatusType custStatus;
    @XmlElement(name = "EXAM_CountryofCitizenship")
    protected String examCountryofCitizenship;
    @XmlElement(name = "EXAM_CitizenCode")
    protected String examCitizenCode;
    @XmlElement(name = "EXAM_CustRace")
    protected String examCustRace;
    @XmlElement(name = "EXAM_Religion")
    protected String examReligion;
    @XmlElement(name = "EXAM_PrefLang")
    protected String examPrefLang;
    @XmlElement(name = "EXAM_CustEducCode")
    protected String examCustEducCode;
    @XmlElement(name = "EXAM_BusinessSector")
    protected String examBusinessSector;
    @XmlElement(name = "EXAM_VIPIndicator")
    protected String examvipIndicator;
    @XmlElement(name = "EXAM_SubVIPInd")
    protected String examSubVIPInd;
    @XmlElement(name = "EXAM_SMEIndicator")
    protected String examsmeIndicator;
    @XmlElement(name = "EXAM_SubSMEIndicator")
    protected String examSubSMEIndicator;
    @XmlElement(name = "EXAM_CustSegmentCode")
    protected String examCustSegmentCode;
    @XmlElement(name = "EXAM_BusinessType")
    protected String examBusinessType;
    @XmlElement(name = "EXAM_StaffInd")
    protected String examStaffInd;
    @XmlElement(name = "EXAM_CustCreatedDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examCustCreatedDt;
    @XmlElement(name = "EXAM_CustTemplateCode")
    protected String examCustTemplateCode;
    @XmlElement(name = "EXAM_CustCreationBankID")
    protected String examCustCreationBankID;
    @XmlElement(name = "EXAM_CustCreationBrnID")
    protected String examCustCreationBrnID;
    @XmlElement(name = "EXAM_CustServicingBrn")
    protected String examCustServicingBrn;
    @XmlElement(name = "EXAM_ServicingRM")
    protected String examServicingRM;
    @XmlElement(name = "EXAM_LPInd")
    protected String examlpInd;
    @XmlElement(name = "EXAM_OtherContactsInfo")
    protected List<EXAMOtherContactsInfoType> examOtherContactsInfo;
    @XmlElement(name = "IdentVerifyMethod")
    protected String identVerifyMethod;
    @XmlElement(name = "EXAM_PersonName")
    protected EXAMPersonNameType examPersonName;
    @XmlElement(name = "EXAM_IncomeRange")
    protected String examIncomeRange;
    @XmlElement(name = "EXAM_OrigFundSrcCountry")
    protected String examOrigFundSrcCountry;
    @XmlElement(name = "EXAM_RegAddrSameAsMail")
    protected String examRegAddrSameAsMail;
    @XmlElement(name = "EXAM_CountryofCitizenshipInd")
    protected String examCountryofCitizenshipInd;
    @XmlElement(name = "EXAM_CitizenInd")
    protected String examCitizenInd;
    @XmlElement(name = "EXAM_OrigFundSrcCountryInd")
    protected String examOrigFundSrcCountryInd;
    @XmlElement(name = "EXAM_BusinessSectorInd")
    protected String examBusinessSectorInd;
    @XmlElement(name = "EXAM_NameFormat")
    protected String examNameFormat;
    @XmlElement(name = "EXAM_ExtnInfo")
    protected List<EXAMExtensionInfoType> examExtnInfo;
    @XmlElement(name = "EXAM_SubClass")
    protected String examSubClass;
    @XmlElement(name = "MaritalStatus")
    protected String maritalStatus;
    @XmlElement(name = "EXAM_MaritalStatusDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examMaritalStatusDt;
    @XmlElement(name = "EXAM_IsDeceased")
    protected String examIsDeceased;
    @XmlElement(name = "EXAM_DeceasedDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examDeceasedDt;
    @XmlElement(name = "EXAM_SectorCode")
    protected String examSectorCode;
    @XmlElement(name = "EXAM_NumDependantKid")
    protected String examNumDependantKid;
    @XmlElement(name = "EXAM_NumDependantTeen")
    protected String examNumDependantTeen;
    @XmlElement(name = "EXAM_BOIFlag")
    protected String examboiFlag;
    @XmlElement(name = "EXAM_PostAddr")
    protected List<EXAMPostAddrType> examPostAddr;
    @XmlElement(name = "EXAM_BusinessSector2")
    protected String examBusinessSector2;
    @XmlElement(name = "EXAM_BusinessSector3")
    protected String examBusinessSector3;
    @XmlElement(name = "EXAM_MoreContactDetailsIndicator")
    protected String examMoreContactDetailsIndicator;
    @XmlElement(name = "EXAM_MoreIDDetailsIndicator")
    protected String examMoreIDDetailsIndicator;
    @XmlElement(name = "EXAM_InsufficientAddr")
    protected String examInsufficientAddr;
    @XmlElement(name = "EXAM_ShortName")
    protected String examShortName;
    @XmlElement(name = "Nickname")
    protected String nickname;
    @XmlElement(name = "EXAM_Alt2Id")
    protected List<EXAMGovIssueIdentType> examAlt2Id;
    @XmlElement(name = "EXAM_SourceOfFund")
    protected String examSourceOfFund;
    @XmlElement(name = "EXAM_BIIndustryCode")
    protected String exambiIndustryCode;
    @XmlElement(name = "EXAM_DefaultCode")
    protected List<String> examDefaultCode;
    @XmlElement(name = "EXAM_Village")
    protected String examVillage;
    @XmlElement(name = "EXAM_District")
    protected String examDistrict;
    @XmlElement(name = "FullName")
    protected String fullName;
    @XmlElement(name = "BirthDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate birthDt;
    @XmlElement(name = "PersonName")
    protected PersonNameType personName;
    @XmlElement(name = "EXAM_GovIssueIdent")
    protected EXAMGovIssueIdentType examGovIssueIdent;
    @XmlElement(name = "EXAM_ContactInfo")
    protected EXAMContactInfoType examContactInfo;
    @XmlElement(name = "EXAM_CustNameDetail")
    protected List<EXAMCustNameDetailType> examCustNameDetail;
    @XmlElement(name = "EXAM_OtherInc")
    protected String examOtherInc;
    @XmlElement(name = "EXAM_Occupation")
    protected EXAMOccupationType examOccupation;
    @XmlElement(name = "EXAM_EmployerName")
    protected String examEmployerName;
    @XmlElement(name = "EXAM_Business_SegCode")
    protected String examBusinessSegCode;
    @XmlElement(name = "EXAM_TitleName")
    protected String examTitleName;

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
     * Gets the value of the examHomeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examHomeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMHomeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMHomeCode() {
        if (examHomeCode == null) {
            examHomeCode = new ArrayList<>();
        }
        return this.examHomeCode;
    }

    /**
     * Gets the value of the examAddressFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examAddressFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMAddressFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMAddressFormat() {
        if (examAddressFormat == null) {
            examAddressFormat = new ArrayList<>();
        }
        return this.examAddressFormat;
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
     * Gets the value of the personInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PersonInfoType }
     *     
     */
    public PersonInfoType getPersonInfo() {
        return personInfo;
    }

    /**
     * Sets the value of the personInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInfoType }
     *     
     */
    public void setPersonInfo(PersonInfoType value) {
        this.personInfo = value;
    }

    /**
     * Gets the value of the examContactDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examContactDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMContactDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMContactDetailsType }
     * 
     * 
     */
    public List<EXAMContactDetailsType> getEXAMContactDetails() {
        if (examContactDetails == null) {
            examContactDetails = new ArrayList<>();
        }
        return this.examContactDetails;
    }

    /**
     * Gets the value of the examGovIssueId property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMGovIssueIdentType }
     *     
     */
    public EXAMGovIssueIdentType getEXAMGovIssueId() {
        return examGovIssueId;
    }

    /**
     * Sets the value of the examGovIssueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMGovIssueIdentType }
     *     
     */
    public void setEXAMGovIssueId(EXAMGovIssueIdentType value) {
        this.examGovIssueId = value;
    }

    /**
     * Gets the value of the examAltId property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMGovIssueIdentType }
     *     
     */
    public EXAMGovIssueIdentType getEXAMAltId() {
        return examAltId;
    }

    /**
     * Sets the value of the examAltId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMGovIssueIdentType }
     *     
     */
    public void setEXAMAltId(EXAMGovIssueIdentType value) {
        this.examAltId = value;
    }

    /**
     * Gets the value of the examTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMGovIssueIdentType }
     *     
     */
    public EXAMGovIssueIdentType getEXAMTaxId() {
        return examTaxId;
    }

    /**
     * Sets the value of the examTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMGovIssueIdentType }
     *     
     */
    public void setEXAMTaxId(EXAMGovIssueIdentType value) {
        this.examTaxId = value;
    }

    /**
     * Gets the value of the custType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustType() {
        return custType;
    }

    /**
     * Sets the value of the custType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustType(String value) {
        this.custType = value;
    }

    /**
     * Gets the value of the examCustCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCustCategory() {
        return examCustCategory;
    }

    /**
     * Sets the value of the examCustCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCustCategory(String value) {
        this.examCustCategory = value;
    }

    /**
     * Gets the value of the examCustSubCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCustSubCategory() {
        return examCustSubCategory;
    }

    /**
     * Sets the value of the examCustSubCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCustSubCategory(String value) {
        this.examCustSubCategory = value;
    }

    /**
     * Gets the value of the examResStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMResStatus() {
        return examResStatus;
    }

    /**
     * Sets the value of the examResStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMResStatus(String value) {
        this.examResStatus = value;
    }

    /**
     * Gets the value of the custStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CustStatusType }
     *     
     */
    public CustStatusType getCustStatus() {
        return custStatus;
    }

    /**
     * Sets the value of the custStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustStatusType }
     *     
     */
    public void setCustStatus(CustStatusType value) {
        this.custStatus = value;
    }

    /**
     * Gets the value of the examCountryofCitizenship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCountryofCitizenship() {
        return examCountryofCitizenship;
    }

    /**
     * Sets the value of the examCountryofCitizenship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCountryofCitizenship(String value) {
        this.examCountryofCitizenship = value;
    }

    /**
     * Gets the value of the examCitizenCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCitizenCode() {
        return examCitizenCode;
    }

    /**
     * Sets the value of the examCitizenCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCitizenCode(String value) {
        this.examCitizenCode = value;
    }

    /**
     * Gets the value of the examCustRace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCustRace() {
        return examCustRace;
    }

    /**
     * Sets the value of the examCustRace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCustRace(String value) {
        this.examCustRace = value;
    }

    /**
     * Gets the value of the examReligion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMReligion() {
        return examReligion;
    }

    /**
     * Sets the value of the examReligion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMReligion(String value) {
        this.examReligion = value;
    }

    /**
     * Gets the value of the examPrefLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPrefLang() {
        return examPrefLang;
    }

    /**
     * Sets the value of the examPrefLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPrefLang(String value) {
        this.examPrefLang = value;
    }

    /**
     * Gets the value of the examCustEducCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCustEducCode() {
        return examCustEducCode;
    }

    /**
     * Sets the value of the examCustEducCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCustEducCode(String value) {
        this.examCustEducCode = value;
    }

    /**
     * Gets the value of the examBusinessSector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBusinessSector() {
        return examBusinessSector;
    }

    /**
     * Sets the value of the examBusinessSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBusinessSector(String value) {
        this.examBusinessSector = value;
    }

    /**
     * Gets the value of the examvipIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMVIPIndicator() {
        return examvipIndicator;
    }

    /**
     * Sets the value of the examvipIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMVIPIndicator(String value) {
        this.examvipIndicator = value;
    }

    /**
     * Gets the value of the examSubVIPInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSubVIPInd() {
        return examSubVIPInd;
    }

    /**
     * Sets the value of the examSubVIPInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSubVIPInd(String value) {
        this.examSubVIPInd = value;
    }

    /**
     * Gets the value of the examsmeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSMEIndicator() {
        return examsmeIndicator;
    }

    /**
     * Sets the value of the examsmeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSMEIndicator(String value) {
        this.examsmeIndicator = value;
    }

    /**
     * Gets the value of the examSubSMEIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSubSMEIndicator() {
        return examSubSMEIndicator;
    }

    /**
     * Sets the value of the examSubSMEIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSubSMEIndicator(String value) {
        this.examSubSMEIndicator = value;
    }

    /**
     * Gets the value of the examCustSegmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCustSegmentCode() {
        return examCustSegmentCode;
    }

    /**
     * Sets the value of the examCustSegmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCustSegmentCode(String value) {
        this.examCustSegmentCode = value;
    }

    /**
     * Gets the value of the examBusinessType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBusinessType() {
        return examBusinessType;
    }

    /**
     * Sets the value of the examBusinessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBusinessType(String value) {
        this.examBusinessType = value;
    }

    /**
     * Gets the value of the examStaffInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMStaffInd() {
        return examStaffInd;
    }

    /**
     * Sets the value of the examStaffInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMStaffInd(String value) {
        this.examStaffInd = value;
    }

    /**
     * Gets the value of the examCustCreatedDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMCustCreatedDt() {
        return examCustCreatedDt;
    }

    /**
     * Sets the value of the examCustCreatedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCustCreatedDt(LocalDate value) {
        this.examCustCreatedDt = value;
    }

    /**
     * Gets the value of the examCustTemplateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCustTemplateCode() {
        return examCustTemplateCode;
    }

    /**
     * Sets the value of the examCustTemplateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCustTemplateCode(String value) {
        this.examCustTemplateCode = value;
    }

    /**
     * Gets the value of the examCustCreationBankID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCustCreationBankID() {
        return examCustCreationBankID;
    }

    /**
     * Sets the value of the examCustCreationBankID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCustCreationBankID(String value) {
        this.examCustCreationBankID = value;
    }

    /**
     * Gets the value of the examCustCreationBrnID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCustCreationBrnID() {
        return examCustCreationBrnID;
    }

    /**
     * Sets the value of the examCustCreationBrnID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCustCreationBrnID(String value) {
        this.examCustCreationBrnID = value;
    }

    /**
     * Gets the value of the examCustServicingBrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCustServicingBrn() {
        return examCustServicingBrn;
    }

    /**
     * Sets the value of the examCustServicingBrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCustServicingBrn(String value) {
        this.examCustServicingBrn = value;
    }

    /**
     * Gets the value of the examServicingRM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMServicingRM() {
        return examServicingRM;
    }

    /**
     * Sets the value of the examServicingRM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMServicingRM(String value) {
        this.examServicingRM = value;
    }

    /**
     * Gets the value of the examlpInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMLPInd() {
        return examlpInd;
    }

    /**
     * Sets the value of the examlpInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMLPInd(String value) {
        this.examlpInd = value;
    }

    /**
     * Gets the value of the examOtherContactsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examOtherContactsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMOtherContactsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMOtherContactsInfoType }
     * 
     * 
     */
    public List<EXAMOtherContactsInfoType> getEXAMOtherContactsInfo() {
        if (examOtherContactsInfo == null) {
            examOtherContactsInfo = new ArrayList<>();
        }
        return this.examOtherContactsInfo;
    }

    /**
     * Gets the value of the identVerifyMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentVerifyMethod() {
        return identVerifyMethod;
    }

    /**
     * Sets the value of the identVerifyMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentVerifyMethod(String value) {
        this.identVerifyMethod = value;
    }

    /**
     * Gets the value of the examPersonName property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMPersonNameType }
     *     
     */
    public EXAMPersonNameType getEXAMPersonName() {
        return examPersonName;
    }

    /**
     * Sets the value of the examPersonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMPersonNameType }
     *     
     */
    public void setEXAMPersonName(EXAMPersonNameType value) {
        this.examPersonName = value;
    }

    /**
     * Gets the value of the examIncomeRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIncomeRange() {
        return examIncomeRange;
    }

    /**
     * Sets the value of the examIncomeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIncomeRange(String value) {
        this.examIncomeRange = value;
    }

    /**
     * Gets the value of the examOrigFundSrcCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOrigFundSrcCountry() {
        return examOrigFundSrcCountry;
    }

    /**
     * Sets the value of the examOrigFundSrcCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOrigFundSrcCountry(String value) {
        this.examOrigFundSrcCountry = value;
    }

    /**
     * Gets the value of the examRegAddrSameAsMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMRegAddrSameAsMail() {
        return examRegAddrSameAsMail;
    }

    /**
     * Sets the value of the examRegAddrSameAsMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMRegAddrSameAsMail(String value) {
        this.examRegAddrSameAsMail = value;
    }

    /**
     * Gets the value of the examCountryofCitizenshipInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCountryofCitizenshipInd() {
        return examCountryofCitizenshipInd;
    }

    /**
     * Sets the value of the examCountryofCitizenshipInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCountryofCitizenshipInd(String value) {
        this.examCountryofCitizenshipInd = value;
    }

    /**
     * Gets the value of the examCitizenInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCitizenInd() {
        return examCitizenInd;
    }

    /**
     * Sets the value of the examCitizenInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCitizenInd(String value) {
        this.examCitizenInd = value;
    }

    /**
     * Gets the value of the examOrigFundSrcCountryInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOrigFundSrcCountryInd() {
        return examOrigFundSrcCountryInd;
    }

    /**
     * Sets the value of the examOrigFundSrcCountryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOrigFundSrcCountryInd(String value) {
        this.examOrigFundSrcCountryInd = value;
    }

    /**
     * Gets the value of the examBusinessSectorInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBusinessSectorInd() {
        return examBusinessSectorInd;
    }

    /**
     * Sets the value of the examBusinessSectorInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBusinessSectorInd(String value) {
        this.examBusinessSectorInd = value;
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
     * Gets the value of the examExtnInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examExtnInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMExtnInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMExtensionInfoType }
     * 
     * 
     */
    public List<EXAMExtensionInfoType> getEXAMExtnInfo() {
        if (examExtnInfo == null) {
            examExtnInfo = new ArrayList<>();
        }
        return this.examExtnInfo;
    }

    /**
     * Gets the value of the examSubClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSubClass() {
        return examSubClass;
    }

    /**
     * Sets the value of the examSubClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSubClass(String value) {
        this.examSubClass = value;
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
     * Gets the value of the examMaritalStatusDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMMaritalStatusDt() {
        return examMaritalStatusDt;
    }

    /**
     * Sets the value of the examMaritalStatusDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMaritalStatusDt(LocalDate value) {
        this.examMaritalStatusDt = value;
    }

    /**
     * Gets the value of the examIsDeceased property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIsDeceased() {
        return examIsDeceased;
    }

    /**
     * Sets the value of the examIsDeceased property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIsDeceased(String value) {
        this.examIsDeceased = value;
    }

    /**
     * Gets the value of the examDeceasedDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMDeceasedDt() {
        return examDeceasedDt;
    }

    /**
     * Sets the value of the examDeceasedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMDeceasedDt(LocalDate value) {
        this.examDeceasedDt = value;
    }

    /**
     * Gets the value of the examSectorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSectorCode() {
        return examSectorCode;
    }

    /**
     * Sets the value of the examSectorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSectorCode(String value) {
        this.examSectorCode = value;
    }

    /**
     * Gets the value of the examNumDependantKid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMNumDependantKid() {
        return examNumDependantKid;
    }

    /**
     * Sets the value of the examNumDependantKid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMNumDependantKid(String value) {
        this.examNumDependantKid = value;
    }

    /**
     * Gets the value of the examNumDependantTeen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMNumDependantTeen() {
        return examNumDependantTeen;
    }

    /**
     * Sets the value of the examNumDependantTeen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMNumDependantTeen(String value) {
        this.examNumDependantTeen = value;
    }

    /**
     * Gets the value of the examboiFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBOIFlag() {
        return examboiFlag;
    }

    /**
     * Sets the value of the examboiFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBOIFlag(String value) {
        this.examboiFlag = value;
    }

    /**
     * Gets the value of the examPostAddr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examPostAddr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMPostAddr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMPostAddrType }
     * 
     * 
     */
    public List<EXAMPostAddrType> getEXAMPostAddr() {
        if (examPostAddr == null) {
            examPostAddr = new ArrayList<>();
        }
        return this.examPostAddr;
    }

    /**
     * Gets the value of the examBusinessSector2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBusinessSector2() {
        return examBusinessSector2;
    }

    /**
     * Sets the value of the examBusinessSector2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBusinessSector2(String value) {
        this.examBusinessSector2 = value;
    }

    /**
     * Gets the value of the examBusinessSector3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBusinessSector3() {
        return examBusinessSector3;
    }

    /**
     * Sets the value of the examBusinessSector3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBusinessSector3(String value) {
        this.examBusinessSector3 = value;
    }

    /**
     * Gets the value of the examMoreContactDetailsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMoreContactDetailsIndicator() {
        return examMoreContactDetailsIndicator;
    }

    /**
     * Sets the value of the examMoreContactDetailsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMoreContactDetailsIndicator(String value) {
        this.examMoreContactDetailsIndicator = value;
    }

    /**
     * Gets the value of the examMoreIDDetailsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMoreIDDetailsIndicator() {
        return examMoreIDDetailsIndicator;
    }

    /**
     * Sets the value of the examMoreIDDetailsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMoreIDDetailsIndicator(String value) {
        this.examMoreIDDetailsIndicator = value;
    }

    /**
     * Gets the value of the examInsufficientAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMInsufficientAddr() {
        return examInsufficientAddr;
    }

    /**
     * Sets the value of the examInsufficientAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMInsufficientAddr(String value) {
        this.examInsufficientAddr = value;
    }

    /**
     * Gets the value of the examShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMShortName() {
        return examShortName;
    }

    /**
     * Sets the value of the examShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMShortName(String value) {
        this.examShortName = value;
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

    /**
     * Gets the value of the examAlt2Id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examAlt2Id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMAlt2Id().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMGovIssueIdentType }
     * 
     * 
     */
    public List<EXAMGovIssueIdentType> getEXAMAlt2Id() {
        if (examAlt2Id == null) {
            examAlt2Id = new ArrayList<>();
        }
        return this.examAlt2Id;
    }

    /**
     * Gets the value of the examSourceOfFund property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSourceOfFund() {
        return examSourceOfFund;
    }

    /**
     * Sets the value of the examSourceOfFund property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSourceOfFund(String value) {
        this.examSourceOfFund = value;
    }

    /**
     * Gets the value of the exambiIndustryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBIIndustryCode() {
        return exambiIndustryCode;
    }

    /**
     * Sets the value of the exambiIndustryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBIIndustryCode(String value) {
        this.exambiIndustryCode = value;
    }

    /**
     * Gets the value of the examDefaultCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examDefaultCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMDefaultCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMDefaultCode() {
        if (examDefaultCode == null) {
            examDefaultCode = new ArrayList<>();
        }
        return this.examDefaultCode;
    }

    /**
     * Gets the value of the examVillage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMVillage() {
        return examVillage;
    }

    /**
     * Sets the value of the examVillage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMVillage(String value) {
        this.examVillage = value;
    }

    /**
     * Gets the value of the examDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMDistrict() {
        return examDistrict;
    }

    /**
     * Sets the value of the examDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMDistrict(String value) {
        this.examDistrict = value;
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
     * Gets the value of the examGovIssueIdent property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMGovIssueIdentType }
     *     
     */
    public EXAMGovIssueIdentType getEXAMGovIssueIdent() {
        return examGovIssueIdent;
    }

    /**
     * Sets the value of the examGovIssueIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMGovIssueIdentType }
     *     
     */
    public void setEXAMGovIssueIdent(EXAMGovIssueIdentType value) {
        this.examGovIssueIdent = value;
    }

    /**
     * Gets the value of the examContactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMContactInfoType }
     *     
     */
    public EXAMContactInfoType getEXAMContactInfo() {
        return examContactInfo;
    }

    /**
     * Sets the value of the examContactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMContactInfoType }
     *     
     */
    public void setEXAMContactInfo(EXAMContactInfoType value) {
        this.examContactInfo = value;
    }

    /**
     * Gets the value of the examCustNameDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examCustNameDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMCustNameDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMCustNameDetailType }
     * 
     * 
     */
    public List<EXAMCustNameDetailType> getEXAMCustNameDetail() {
        if (examCustNameDetail == null) {
            examCustNameDetail = new ArrayList<>();
        }
        return this.examCustNameDetail;
    }

    /**
     * Gets the value of the examOtherInc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOtherInc() {
        return examOtherInc;
    }

    /**
     * Sets the value of the examOtherInc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOtherInc(String value) {
        this.examOtherInc = value;
    }

    /**
     * Gets the value of the examOccupation property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMOccupationType }
     *     
     */
    public EXAMOccupationType getEXAMOccupation() {
        return examOccupation;
    }

    /**
     * Sets the value of the examOccupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMOccupationType }
     *     
     */
    public void setEXAMOccupation(EXAMOccupationType value) {
        this.examOccupation = value;
    }

    /**
     * Gets the value of the examEmployerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMEmployerName() {
        return examEmployerName;
    }

    /**
     * Sets the value of the examEmployerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEmployerName(String value) {
        this.examEmployerName = value;
    }

    /**
     * Gets the value of the examBusinessSegCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBusinessSegCode() {
        return examBusinessSegCode;
    }

    /**
     * Sets the value of the examBusinessSegCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBusinessSegCode(String value) {
        this.examBusinessSegCode = value;
    }

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

}
