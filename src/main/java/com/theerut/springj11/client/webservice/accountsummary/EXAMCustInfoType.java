
package com.theerut.springj11.client.webservice.accountsummary;

import com.theerut.springj11.client.webservice.common.BankInfoType;
import com.theerut.springj11.client.webservice.common.EXAMAmtType;
import com.theerut.springj11.client.webservice.common.EXAMContactDetailsType;
import com.theerut.springj11.client.webservice.common.EXAMGovIssueIdentType;
import com.theerut.springj11.utils.LocalDateAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for EXAM_CustInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_CustInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PersonInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OrgInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OrgnFormRefId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SeqNum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BumiputeraIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SarawakIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Religion" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DiscReqd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DiscReqdThirdParty" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BankId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RelationshipStatus" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RelationshipCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ResidencyStatus" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustSegmentCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BiometricIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TriggerCDDIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_StrategicBusinessUnit" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SBUCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ResidencyType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CostCenter" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Org" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OffshoreBusiness" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CountryofBusiness" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IsResident" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BusinessStartDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CountryofExposure" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MaritalStatusDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IsDeceased" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DeceasedDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_InqCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MailingCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PromotionalMailingCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CombinedStmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CombinedStmtCycle" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CRRatingReviewDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CRRatingReviewTerm" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CRRatingReviewTermCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Occupation" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_FedCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SubSegmentCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_GSTRegdIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OfficerCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IsAML" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IsIDProof" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IsFATF" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IsSMSAlert" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PriId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SeqNum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IslamicInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ConnectedParty" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TaxReliefInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PrintTaxInvInd" minOccurs="0"/>
 *         &lt;element name="EmployeeIdentlNum" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EducationCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MembershipDate" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BranchId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LEZCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SMSA" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Census" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EmploymentType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ForeignCountryInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_USPerson" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Non_USPerson" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_HighRisk" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastReviewDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustReviewDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustReviewTerm" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustReviewTermCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustOfficerRel" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_InsiderCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BusinessInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ChosenCustCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ApprovedLimit" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_HandleOption" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_HighLowInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DefCode1" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DefCode2" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DefCode3" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DefCode4" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IntroducerCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DPAInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IslamicIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RetentionCycle" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_UserCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Remarks" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_KYCGrade" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CurrentKYCRulesCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OverrideIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastMaintUID" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastMaintTm" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OwnerRelationshipCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ContactDetails" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustRelationship" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustClass" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BusinessDetails" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EduDetails" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustInqDetails" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PrimeIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OfficerCode2" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_WatchlistInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_WatchlistSeqNum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SourceCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ExtSysCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ExtSysUIDNum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EnteredDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Amt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustomerReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustomerLifeStyle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MoreLifestyleIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustomerAlias" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MoreAliasIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustomerEducation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MoreEducationIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CompanyCreditCard" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Blacklist" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MoreBlacklistIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NextReviewDate" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ExistingCustFlag" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Occupation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastMaintDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Village" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_District" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IssPlace" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CARCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastMaintTmStamp" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustOtherDtlInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TaxStatus" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CentralBankCode5" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PlaceOfBirth" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TranOption" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OriginationType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NoOfCustomer" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CreationPurposeCd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AcctMode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SourceApplnRef" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Country" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_HoldMailCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OblRskGrd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Mas757_Ind" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustSubCategory" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EmployerName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EmpoyeeStartYr" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NoOfYr" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_JobTitle" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SrcUIDRefNum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Customer_RiskCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RelateNameInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DirectPartnerInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DirectPartnerDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RegistrationType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SeqNumMultiple" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DefaultCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CentralBankCode6" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CentralBankCode7" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CentralBankCode8" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CentralBankCode9" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CentralBankCode10" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CTOSStatus" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OwnerOfFund" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AOVIRefNo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ForeignCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_WorkAtEXAM" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BloodType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BankInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustSecondaryNmInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ProviderSystemCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ExternalRatingInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SourceOfAssetInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustStatusDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CreditCardInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustLifeStyleInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastMaintInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DefaultCodeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustNameDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OmnibusBoardReso" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_UIDCreatedDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_FormattedShortNm" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_StaySince" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SystemID" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AcctOpenDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OfficerName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CreationDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Listed" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OtherRelNameRelshp" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BOIFlag" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SecondaryName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Title" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_GlobalCustInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CountryUIDNo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TitleAftrName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CdpNumber" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BankCmpCd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BankEmpDptCd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CpfNumber" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CrRating" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IsMoreBlackList" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EmployeeCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_InSuffAddrInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SecondIndCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TerIndCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CountryOfSecExpo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DataEnrich" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_InfoDisclosure" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SystemCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustomerType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MailingAddressFlag" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustMnemonicCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ColorCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PhotoFileName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ShareHolderPercentage" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OfficerName2" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MsgInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SecondaryCustSegmentDesc" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TierDesc" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_FatcaStatus" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EntryTierType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EntryTierDesc" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TierType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MemberId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PreferredName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BNMAssignedId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IndustrySector" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EmploymentSector" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NetIncome" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_JustifyCatDOB" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_JustifyRsnDOB" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_JustifyCatCountry" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_JustifyRsnCountry" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_JustifyCatGender" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_JustifyRsnGender" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_JustifyCatResident" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_JustifyRsnResident" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_JustifyCatCorpStatus" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_JustifyRsnCorpStatus" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_JustifyCatMSICCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_JustifyRsnMSICCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_CustInfo_Type", propOrder = {
    "examPersonInfo",
    "examOrgInfo",
    "examOrgnFormRefId",
    "seqNum",
    "examBumiputeraIndicator",
    "examSarawakIndicator",
    "examReligion",
    "examDiscReqd",
    "examDiscReqdThirdParty",
    "bankId",
    "examRelationshipStatus",
    "examRelationshipCode",
    "examResidencyStatus",
    "examCustSegmentCode",
    "examBiometricIndicator",
    "examTriggerCDDIndicator",
    "examStrategicBusinessUnit",
    "examsbuCode",
    "examResidencyType",
    "examCostCenter",
    "org",
    "examOffshoreBusiness",
    "examCountryofBusiness",
    "examIsResident",
    "examBusinessStartDt",
    "examCountryofExposure",
    "examMaritalStatusDt",
    "examIsDeceased",
    "examDeceasedDt",
    "examInqCode",
    "examMailingCode",
    "examPromotionalMailingCode",
    "examCombinedStmt",
    "examCombinedStmtCycle",
    "examcrRatingReviewDt",
    "examcrRatingReviewTerm",
    "examcrRatingReviewTermCode",
    "occupation",
    "examFedCode",
    "examSubSegmentCode",
    "examgstRegdIndicator",
    "examOfficerCode",
    "examIsAML",
    "examIsIDProof",
    "examIsFATF",
    "examIsSMSAlert",
    "examPriId",
    "examSeqNum",
    "curCode",
    "examIslamicInd",
    "examConnectedParty",
    "examTaxReliefInd",
    "examPrintTaxInvInd",
    "employeeIdentlNum",
    "examEducationCode",
    "examMembershipDate",
    "branchId",
    "examlezCode",
    "examsmsa",
    "examCensus",
    "examEmploymentType",
    "examForeignCountryInd",
    "examusPerson",
    "examNonUSPerson",
    "examHighRisk",
    "examLastReviewDt",
    "examCustReviewDt",
    "examCustReviewTerm",
    "examCustReviewTermCode",
    "examCustOfficerRel",
    "examInsiderCode",
    "examBusinessInfo",
    "examChosenCustCode",
    "examApprovedLimit",
    "examHandleOption",
    "examHighLowInd",
    "examDefCode1",
    "examDefCode2",
    "examDefCode3",
    "examDefCode4",
    "examIntroducerCode",
    "examdpaInd",
    "examIslamicIndicator",
    "examRetentionCycle",
    "examUserCode",
    "examRemarks",
    "examkycGrade",
    "examCurrentKYCRulesCode",
    "examOverrideIndicator",
    "examLastMaintUID",
    "examLastMaintTm",
    "examOwnerRelationshipCode",
    "examContactDetails",
    "examCustRelationship",
    "examCustClass",
    "examBusinessDetails",
    "examEduDetails",
    "examCustInqDetails",
    "examPrimeIndicator",
    "examOfficerCode2",
    "examWatchlistInd",
    "examWatchlistSeqNum",
    "examSourceCode",
    "examExtSysCode",
    "examExtSysUIDNum",
    "examEnteredDt",
    "examAmt",
    "examCustomerReference",
    "examCustomerLifeStyle",
    "examMoreLifestyleIndicator",
    "examCustomerAlias",
    "examMoreAliasIndicator",
    "examCustomerEducation",
    "examMoreEducationIndicator",
    "examCompanyCreditCard",
    "examBlacklist",
    "examMoreBlacklistIndicator",
    "examNextReviewDate",
    "examExistingCustFlag",
    "examOccupation",
    "examLastMaintDt",
    "examVillage",
    "examDistrict",
    "examIssPlace",
    "examcarCode",
    "examLastMaintTmStamp",
    "examCustOtherDtlInfo",
    "examTaxStatus",
    "examCentralBankCode5",
    "examPlaceOfBirth",
    "examTranOption",
    "examOriginationType",
    "examNoOfCustomer",
    "examCreationPurposeCd",
    "examAcctMode",
    "examSourceApplnRef",
    "country",
    "examHoldMailCode",
    "examOblRskGrd",
    "examMas757Ind",
    "examCustSubCategory",
    "examEmployerName",
    "examEmpoyeeStartYr",
    "examNoOfYr",
    "examJobTitle",
    "examSrcUIDRefNum",
    "examCustomerRiskCode",
    "examRelateNameInfo",
    "examDirectPartnerInfo",
    "examDirectPartnerDetails",
    "examRegistrationType",
    "examSeqNumMultiple",
    "examDefaultCode",
    "examCentralBankCode6",
    "examCentralBankCode7",
    "examCentralBankCode8",
    "examCentralBankCode9",
    "examCentralBankCode10",
    "examctosStatus",
    "examOwnerOfFund",
    "examaoviRefNo",
    "examForeignCode",
    "examWorkAtEXAM",
    "examBloodType",
    "bankInfo",
    "examCustSecondaryNmInfo",
    "examProviderSystemCode",
    "examExternalRatingInfo",
    "examSourceOfAssetInfo",
    "examCustStatusDetail",
    "examCreditCardInfo",
    "examCustLifeStyleInfo",
    "examLastMaintInfo",
    "examDefaultCodeInfo",
    "examCustNameDetail",
    "examOmnibusBoardReso",
    "examcifCreatedDt",
    "examFormattedShortNm",
    "examStaySince",
    "examSystemID",
    "examAcctOpenDt",
    "examOfficerName",
    "examCreationDt",
    "examListed",
    "examOtherRelNameRelshp",
    "examboiFlag",
    "examSecondaryName",
    "examTitle",
    "examGlobalCustInd",
    "examCountryUIDNo",
    "examTitleAftrName",
    "examCdpNumber",
    "examBankCmpCd",
    "examBankEmpDptCd",
    "examCpfNumber",
    "examCrRating",
    "examIsMoreBlackList",
    "examEmployeeCode",
    "examInSuffAddrInd",
    "examSecondIndCode",
    "examTerIndCode",
    "examCountryOfSecExpo",
    "examDataEnrich",
    "examInfoDisclosure",
    "examSystemCode",
    "examCustomerType",
    "examMailingAddressFlag",
    "examCustMnemonicCode",
    "examColorCode",
    "examPhotoFileName",
    "examShareHolderPercentage",
    "examOfficerName2",
    "examMsgInd",
    "examSecondaryCustSegmentDesc",
    "examTierDesc",
    "examFatcaStatus",
    "examEntryTierType",
    "examEntryTierDesc",
    "examTierType",
    "examMemberId",
    "examPreferredName",
    "exambnmAssignedId",
    "examIndustrySector",
    "examEmploymentSector",
    "examNetIncome",
    "examJustifyCatDOB",
    "examJustifyRsnDOB",
    "examJustifyCatCountry",
    "examJustifyRsnCountry",
    "examJustifyCatGender",
    "examJustifyRsnGender",
    "examJustifyCatResident",
    "examJustifyRsnResident",
    "examJustifyCatCorpStatus",
    "examJustifyRsnCorpStatus",
    "examJustifyCatMSICCode",
    "examJustifyRsnMSICCode"
})
public class EXAMCustInfoType {

    @XmlElement(name = "EXAM_PersonInfo")
    protected EXAMPersonInfoType examPersonInfo;
    @XmlElement(name = "EXAM_OrgInfo")
    protected EXAMOrgInfoType examOrgInfo;
    @XmlElement(name = "EXAM_OrgnFormRefId")
    protected Long examOrgnFormRefId;
    @XmlElement(name = "SeqNum")
    protected Long seqNum;
    @XmlElement(name = "EXAM_BumiputeraIndicator")
    protected String examBumiputeraIndicator;
    @XmlElement(name = "EXAM_SarawakIndicator")
    protected String examSarawakIndicator;
    @XmlElement(name = "EXAM_Religion")
    protected String examReligion;
    @XmlElement(name = "EXAM_DiscReqd")
    protected String examDiscReqd;
    @XmlElement(name = "EXAM_DiscReqdThirdParty")
    protected String examDiscReqdThirdParty;
    @XmlElement(name = "BankId")
    protected String bankId;
    @XmlElement(name = "EXAM_RelationshipStatus")
    protected String examRelationshipStatus;
    @XmlElement(name = "EXAM_RelationshipCode")
    protected String examRelationshipCode;
    @XmlElement(name = "EXAM_ResidencyStatus")
    protected String examResidencyStatus;
    @XmlElement(name = "EXAM_CustSegmentCode")
    protected String examCustSegmentCode;
    @XmlElement(name = "EXAM_BiometricIndicator")
    protected String examBiometricIndicator;
    @XmlElement(name = "EXAM_TriggerCDDIndicator")
    protected String examTriggerCDDIndicator;
    @XmlElement(name = "EXAM_StrategicBusinessUnit")
    protected String examStrategicBusinessUnit;
    @XmlElement(name = "EXAM_SBUCode")
    protected String examsbuCode;
    @XmlElement(name = "EXAM_ResidencyType")
    protected String examResidencyType;
    @XmlElement(name = "EXAM_CostCenter")
    protected String examCostCenter;
    @XmlElement(name = "Org")
    protected String org;
    @XmlElement(name = "EXAM_OffshoreBusiness")
    protected String examOffshoreBusiness;
    @XmlElement(name = "EXAM_CountryofBusiness")
    protected String examCountryofBusiness;
    @XmlElement(name = "EXAM_IsResident")
    protected String examIsResident;
    @XmlElement(name = "EXAM_BusinessStartDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examBusinessStartDt;
    @XmlElement(name = "EXAM_CountryofExposure")
    protected String examCountryofExposure;
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
    @XmlElement(name = "EXAM_InqCode")
    protected String examInqCode;
    @XmlElement(name = "EXAM_MailingCode")
    protected String examMailingCode;
    @XmlElement(name = "EXAM_PromotionalMailingCode")
    protected String examPromotionalMailingCode;
    @XmlElement(name = "EXAM_CombinedStmt")
    protected String examCombinedStmt;
    @XmlElement(name = "EXAM_CombinedStmtCycle")
    protected String examCombinedStmtCycle;
    @XmlElement(name = "EXAM_CRRatingReviewDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examcrRatingReviewDt;
    @XmlElement(name = "EXAM_CRRatingReviewTerm")
    protected String examcrRatingReviewTerm;
    @XmlElement(name = "EXAM_CRRatingReviewTermCode")
    protected String examcrRatingReviewTermCode;
    @XmlElement(name = "Occupation")
    protected String occupation;
    @XmlElement(name = "EXAM_FedCode")
    protected String examFedCode;
    @XmlElement(name = "EXAM_SubSegmentCode")
    protected String examSubSegmentCode;
    @XmlElement(name = "EXAM_GSTRegdIndicator")
    protected String examgstRegdIndicator;
    @XmlElement(name = "EXAM_OfficerCode")
    protected String examOfficerCode;
    @XmlElement(name = "EXAM_IsAML")
    protected String examIsAML;
    @XmlElement(name = "EXAM_IsIDProof")
    protected String examIsIDProof;
    @XmlElement(name = "EXAM_IsFATF")
    protected String examIsFATF;
    @XmlElement(name = "EXAM_IsSMSAlert")
    protected String examIsSMSAlert;
    @XmlElement(name = "EXAM_PriId")
    protected EXAMGovIssueIdentType examPriId;
    @XmlElement(name = "EXAM_SeqNum")
    protected Long examSeqNum;
    @XmlElement(name = "CurCode")
    protected String curCode;
    @XmlElement(name = "EXAM_IslamicInd")
    protected String examIslamicInd;
    @XmlElement(name = "EXAM_ConnectedParty")
    protected String examConnectedParty;
    @XmlElement(name = "EXAM_TaxReliefInd")
    protected String examTaxReliefInd;
    @XmlElement(name = "EXAM_PrintTaxInvInd")
    protected String examPrintTaxInvInd;
    @XmlElement(name = "EmployeeIdentlNum")
    protected Object employeeIdentlNum;
    @XmlElement(name = "EXAM_EducationCode")
    protected String examEducationCode;
    @XmlElement(name = "EXAM_MembershipDate", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examMembershipDate;
    @XmlElement(name = "BranchId")
    protected String branchId;
    @XmlElement(name = "EXAM_LEZCode")
    protected String examlezCode;
    @XmlElement(name = "EXAM_SMSA")
    protected String examsmsa;
    @XmlElement(name = "EXAM_Census")
    protected String examCensus;
    @XmlElement(name = "EXAM_EmploymentType")
    protected String examEmploymentType;
    @XmlElement(name = "EXAM_ForeignCountryInd")
    protected String examForeignCountryInd;
    @XmlElement(name = "EXAM_USPerson")
    protected String examusPerson;
    @XmlElement(name = "EXAM_Non_USPerson")
    protected String examNonUSPerson;
    @XmlElement(name = "EXAM_HighRisk")
    protected EXAMHighRiskType examHighRisk;
    @XmlElement(name = "EXAM_LastReviewDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examLastReviewDt;
    @XmlElement(name = "EXAM_CustReviewDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examCustReviewDt;
    @XmlElement(name = "EXAM_CustReviewTerm")
    protected String examCustReviewTerm;
    @XmlElement(name = "EXAM_CustReviewTermCode")
    protected String examCustReviewTermCode;
    @XmlElement(name = "EXAM_CustOfficerRel")
    protected String examCustOfficerRel;
    @XmlElement(name = "EXAM_InsiderCode")
    protected String examInsiderCode;
    @XmlElement(name = "EXAM_BusinessInfo")
    protected EXAMBusinessInfoType examBusinessInfo;
    @XmlElement(name = "EXAM_ChosenCustCode")
    protected String examChosenCustCode;
    @XmlElement(name = "EXAM_ApprovedLimit")
    protected String examApprovedLimit;
    @XmlElement(name = "EXAM_HandleOption")
    protected String examHandleOption;
    @XmlElement(name = "EXAM_HighLowInd")
    protected String examHighLowInd;
    @XmlElement(name = "EXAM_DefCode1")
    protected String examDefCode1;
    @XmlElement(name = "EXAM_DefCode2")
    protected String examDefCode2;
    @XmlElement(name = "EXAM_DefCode3")
    protected String examDefCode3;
    @XmlElement(name = "EXAM_DefCode4")
    protected String examDefCode4;
    @XmlElement(name = "EXAM_IntroducerCode")
    protected String examIntroducerCode;
    @XmlElement(name = "EXAM_DPAInd")
    protected String examdpaInd;
    @XmlElement(name = "EXAM_IslamicIndicator")
    protected String examIslamicIndicator;
    @XmlElement(name = "EXAM_RetentionCycle")
    protected String examRetentionCycle;
    @XmlElement(name = "EXAM_UserCode")
    protected String examUserCode;
    @XmlElement(name = "EXAM_Remarks")
    protected String examRemarks;
    @XmlElement(name = "EXAM_KYCGrade")
    protected String examkycGrade;
    @XmlElement(name = "EXAM_CurrentKYCRulesCode")
    protected String examCurrentKYCRulesCode;
    @XmlElement(name = "EXAM_OverrideIndicator")
    protected String examOverrideIndicator;
    @XmlElement(name = "EXAM_LastMaintUID")
    protected String examLastMaintUID;
    @XmlElement(name = "EXAM_LastMaintTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar examLastMaintTm;
    @XmlElement(name = "EXAM_OwnerRelationshipCode")
    protected String examOwnerRelationshipCode;
    @XmlElement(name = "EXAM_ContactDetails")
    protected EXAMContactDetailsType examContactDetails;
    @XmlElement(name = "EXAM_CustRelationship")
    protected EXAMCustRelationshipType examCustRelationship;
    @XmlElement(name = "EXAM_CustClass")
    protected String examCustClass;
    @XmlElement(name = "EXAM_BusinessDetails")
    protected EXAMBusinessDetailsType examBusinessDetails;
    @XmlElement(name = "EXAM_EduDetails")
    protected EXAMEduDetailsType examEduDetails;
    @XmlElement(name = "EXAM_CustInqDetails")
    protected EXAMCustInqDetailsType examCustInqDetails;
    @XmlElement(name = "EXAM_PrimeIndicator")
    protected String examPrimeIndicator;
    @XmlElement(name = "EXAM_OfficerCode2")
    protected String examOfficerCode2;
    @XmlElement(name = "EXAM_WatchlistInd")
    protected String examWatchlistInd;
    @XmlElement(name = "EXAM_WatchlistSeqNum")
    protected String examWatchlistSeqNum;
    @XmlElement(name = "EXAM_SourceCode")
    protected String examSourceCode;
    @XmlElement(name = "EXAM_ExtSysCode")
    protected String examExtSysCode;
    @XmlElement(name = "EXAM_ExtSysUIDNum")
    protected String examExtSysUIDNum;
    @XmlElement(name = "EXAM_EnteredDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examEnteredDt;
    @XmlElement(name = "EXAM_Amt")
    protected EXAMAmtType examAmt;
    @XmlElement(name = "EXAM_CustomerReference")
    protected List<EXAMCustomerReferenceType> examCustomerReference;
    @XmlElement(name = "EXAM_CustomerLifeStyle")
    protected List<EXAMCustomerLifeStyleType> examCustomerLifeStyle;
    @XmlElement(name = "EXAM_MoreLifestyleIndicator")
    protected String examMoreLifestyleIndicator;
    @XmlElement(name = "EXAM_CustomerAlias")
    protected List<EXAMCustomerAliasType> examCustomerAlias;
    @XmlElement(name = "EXAM_MoreAliasIndicator")
    protected String examMoreAliasIndicator;
    @XmlElement(name = "EXAM_CustomerEducation")
    protected List<EXAMCustomerEducationType> examCustomerEducation;
    @XmlElement(name = "EXAM_MoreEducationIndicator")
    protected String examMoreEducationIndicator;
    @XmlElement(name = "EXAM_CompanyCreditCard")
    protected List<EXAMCompanyCreditCardType> examCompanyCreditCard;
    @XmlElement(name = "EXAM_Blacklist")
    protected List<EXAMBlacklistType> examBlacklist;
    @XmlElement(name = "EXAM_MoreBlacklistIndicator")
    protected String examMoreBlacklistIndicator;
    @XmlElement(name = "EXAM_NextReviewDate")
    protected String examNextReviewDate;
    @XmlElement(name = "EXAM_ExistingCustFlag")
    protected String examExistingCustFlag;
    @XmlElement(name = "EXAM_Occupation")
    protected List<EXAMOccupationType> examOccupation;
    @XmlElement(name = "EXAM_LastMaintDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examLastMaintDt;
    @XmlElement(name = "EXAM_Village")
    protected String examVillage;
    @XmlElement(name = "EXAM_District")
    protected String examDistrict;
    @XmlElement(name = "EXAM_IssPlace")
    protected String examIssPlace;
    @XmlElement(name = "EXAM_CARCode")
    protected String examcarCode;
    @XmlElement(name = "EXAM_LastMaintTmStamp")
    protected String examLastMaintTmStamp;
    @XmlElement(name = "EXAM_CustOtherDtlInfo")
    protected List<EXAMCustOtherDtlInfoType> examCustOtherDtlInfo;
    @XmlElement(name = "EXAM_TaxStatus")
    protected String examTaxStatus;
    @XmlElement(name = "EXAM_CentralBankCode5")
    protected String examCentralBankCode5;
    @XmlElement(name = "EXAM_PlaceOfBirth")
    protected String examPlaceOfBirth;
    @XmlElement(name = "EXAM_TranOption")
    protected String examTranOption;
    @XmlElement(name = "EXAM_OriginationType")
    protected String examOriginationType;
    @XmlElement(name = "EXAM_NoOfCustomer")
    protected String examNoOfCustomer;
    @XmlElement(name = "EXAM_CreationPurposeCd")
    protected String examCreationPurposeCd;
    @XmlElement(name = "EXAM_AcctMode")
    protected String examAcctMode;
    @XmlElement(name = "EXAM_SourceApplnRef")
    protected String examSourceApplnRef;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "EXAM_HoldMailCode")
    protected String examHoldMailCode;
    @XmlElement(name = "EXAM_OblRskGrd")
    protected String examOblRskGrd;
    @XmlElement(name = "EXAM_Mas757_Ind")
    protected String examMas757Ind;
    @XmlElement(name = "EXAM_CustSubCategory")
    protected String examCustSubCategory;
    @XmlElement(name = "EXAM_EmployerName")
    protected String examEmployerName;
    @XmlElement(name = "EXAM_EmpoyeeStartYr")
    protected String examEmpoyeeStartYr;
    @XmlElement(name = "EXAM_NoOfYr")
    protected String examNoOfYr;
    @XmlElement(name = "EXAM_JobTitle")
    protected String examJobTitle;
    @XmlElement(name = "EXAM_SrcUIDRefNum")
    protected String examSrcUIDRefNum;
    @XmlElement(name = "EXAM_Customer_RiskCode")
    protected String examCustomerRiskCode;
    @XmlElement(name = "EXAM_RelateNameInfo")
    protected List<RelateNameInfoType> examRelateNameInfo;
    @XmlElement(name = "EXAM_DirectPartnerInfo")
    protected List<EXAMGovIssueIdentType> examDirectPartnerInfo;
    @XmlElement(name = "EXAM_DirectPartnerDetails")
    protected List<EXAMDirectPartnerDetailsType> examDirectPartnerDetails;
    @XmlElement(name = "EXAM_RegistrationType")
    protected String examRegistrationType;
    @XmlElement(name = "EXAM_SeqNumMultiple")
    protected List<EXAMSeqNumMultipleType> examSeqNumMultiple;
    @XmlElement(name = "EXAM_DefaultCode")
    protected List<String> examDefaultCode;
    @XmlElement(name = "EXAM_CentralBankCode6")
    protected String examCentralBankCode6;
    @XmlElement(name = "EXAM_CentralBankCode7")
    protected String examCentralBankCode7;
    @XmlElement(name = "EXAM_CentralBankCode8")
    protected String examCentralBankCode8;
    @XmlElement(name = "EXAM_CentralBankCode9")
    protected String examCentralBankCode9;
    @XmlElement(name = "EXAM_CentralBankCode10")
    protected String examCentralBankCode10;
    @XmlElement(name = "EXAM_CTOSStatus")
    protected String examctosStatus;
    @XmlElement(name = "EXAM_OwnerOfFund")
    protected String examOwnerOfFund;
    @XmlElement(name = "EXAM_AOVIRefNo")
    protected String examaoviRefNo;
    @XmlElement(name = "EXAM_ForeignCode")
    protected Long examForeignCode;
    @XmlElement(name = "EXAM_WorkAtEXAM")
    protected String examWorkAtEXAM;
    @XmlElement(name = "EXAM_BloodType")
    protected String examBloodType;
    @XmlElement(name = "BankInfo")
    protected BankInfoType bankInfo;
    @XmlElement(name = "EXAM_CustSecondaryNmInfo")
    protected EXAMCustSecondaryNmInfoType examCustSecondaryNmInfo;
    @XmlElement(name = "EXAM_ProviderSystemCode")
    protected String examProviderSystemCode;
    @XmlElement(name = "EXAM_ExternalRatingInfo")
    protected List<EXAMExternalRatingInfoType> examExternalRatingInfo;
    @XmlElement(name = "EXAM_SourceOfAssetInfo")
    protected List<EXAMSourceOfAssetInfoType> examSourceOfAssetInfo;
    @XmlElement(name = "EXAM_CustStatusDetail")
    protected List<EXAMCustStatusDetailType> examCustStatusDetail;
    @XmlElement(name = "EXAM_CreditCardInfo")
    protected List<EXAMCreditCardInfoType> examCreditCardInfo;
    @XmlElement(name = "EXAM_CustLifeStyleInfo")
    protected List<EXAMCustLifeStyleInfoType> examCustLifeStyleInfo;
    @XmlElement(name = "EXAM_LastMaintInfo")
    protected List<EXAMLastMaintInfoType> examLastMaintInfo;
    @XmlElement(name = "EXAM_DefaultCodeInfo")
    protected List<EXAMDefaultCodeInfoType> examDefaultCodeInfo;
    @XmlElement(name = "EXAM_CustNameDetail")
    protected List<EXAMCustNameDetailType> examCustNameDetail;
    @XmlElement(name = "EXAM_OmnibusBoardReso")
    protected String examOmnibusBoardReso;
    @XmlElement(name = "EXAM_UIDCreatedDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examcifCreatedDt;
    @XmlElement(name = "EXAM_FormattedShortNm")
    protected String examFormattedShortNm;
    @XmlElement(name = "EXAM_StaySince", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examStaySince;
    @XmlElement(name = "EXAM_SystemID")
    protected String examSystemID;
    @XmlElement(name = "EXAM_AcctOpenDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examAcctOpenDt;
    @XmlElement(name = "EXAM_OfficerName")
    protected String examOfficerName;
    @XmlElement(name = "EXAM_CreationDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examCreationDt;
    @XmlElement(name = "EXAM_Listed")
    protected String examListed;
    @XmlElement(name = "EXAM_OtherRelNameRelshp")
    protected String examOtherRelNameRelshp;
    @XmlElement(name = "EXAM_BOIFlag")
    protected String examboiFlag;
    @XmlElement(name = "EXAM_SecondaryName")
    protected String examSecondaryName;
    @XmlElement(name = "EXAM_Title")
    protected String examTitle;
    @XmlElement(name = "EXAM_GlobalCustInd")
    protected String examGlobalCustInd;
    @XmlElement(name = "EXAM_CountryUIDNo")
    protected String examCountryUIDNo;
    @XmlElement(name = "EXAM_TitleAftrName")
    protected String examTitleAftrName;
    @XmlElement(name = "EXAM_CdpNumber")
    protected String examCdpNumber;
    @XmlElement(name = "EXAM_BankCmpCd")
    protected String examBankCmpCd;
    @XmlElement(name = "EXAM_BankEmpDptCd")
    protected String examBankEmpDptCd;
    @XmlElement(name = "EXAM_CpfNumber")
    protected String examCpfNumber;
    @XmlElement(name = "EXAM_CrRating")
    protected String examCrRating;
    @XmlElement(name = "EXAM_IsMoreBlackList")
    protected String examIsMoreBlackList;
    @XmlElement(name = "EXAM_EmployeeCode")
    protected String examEmployeeCode;
    @XmlElement(name = "EXAM_InSuffAddrInd")
    protected String examInSuffAddrInd;
    @XmlElement(name = "EXAM_SecondIndCode")
    protected String examSecondIndCode;
    @XmlElement(name = "EXAM_TerIndCode")
    protected String examTerIndCode;
    @XmlElement(name = "EXAM_CountryOfSecExpo")
    protected String examCountryOfSecExpo;
    @XmlElement(name = "EXAM_DataEnrich")
    protected String examDataEnrich;
    @XmlElement(name = "EXAM_InfoDisclosure")
    protected String examInfoDisclosure;
    @XmlElement(name = "EXAM_SystemCode")
    protected String examSystemCode;
    @XmlElement(name = "EXAM_CustomerType")
    protected String examCustomerType;
    @XmlElement(name = "EXAM_MailingAddressFlag")
    protected String examMailingAddressFlag;
    @XmlElement(name = "EXAM_CustMnemonicCode")
    protected String examCustMnemonicCode;
    @XmlElement(name = "EXAM_ColorCode")
    protected String examColorCode;
    @XmlElement(name = "EXAM_PhotoFileName")
    protected String examPhotoFileName;
    @XmlElement(name = "EXAM_ShareHolderPercentage")
    protected BigDecimal examShareHolderPercentage;
    @XmlElement(name = "EXAM_OfficerName2")
    protected String examOfficerName2;
    @XmlElement(name = "EXAM_MsgInd")
    protected String examMsgInd;
    @XmlElement(name = "EXAM_SecondaryCustSegmentDesc")
    protected String examSecondaryCustSegmentDesc;
    @XmlElement(name = "EXAM_TierDesc")
    protected String examTierDesc;
    @XmlElement(name = "EXAM_FatcaStatus")
    protected String examFatcaStatus;
    @XmlElement(name = "EXAM_EntryTierType")
    protected String examEntryTierType;
    @XmlElement(name = "EXAM_EntryTierDesc")
    protected String examEntryTierDesc;
    @XmlElement(name = "EXAM_TierType")
    protected String examTierType;
    @XmlElement(name = "EXAM_MemberId")
    protected String examMemberId;
    @XmlElement(name = "EXAM_PreferredName")
    protected String examPreferredName;
    @XmlElement(name = "EXAM_BNMAssignedId")
    protected String exambnmAssignedId;
    @XmlElement(name = "EXAM_IndustrySector")
    protected String examIndustrySector;
    @XmlElement(name = "EXAM_EmploymentSector")
    protected String examEmploymentSector;
    @XmlElement(name = "EXAM_NetIncome")
    protected BigDecimal examNetIncome;
    @XmlElement(name = "EXAM_JustifyCatDOB")
    protected String examJustifyCatDOB;
    @XmlElement(name = "EXAM_JustifyRsnDOB")
    protected String examJustifyRsnDOB;
    @XmlElement(name = "EXAM_JustifyCatCountry")
    protected String examJustifyCatCountry;
    @XmlElement(name = "EXAM_JustifyRsnCountry")
    protected String examJustifyRsnCountry;
    @XmlElement(name = "EXAM_JustifyCatGender")
    protected String examJustifyCatGender;
    @XmlElement(name = "EXAM_JustifyRsnGender")
    protected String examJustifyRsnGender;
    @XmlElement(name = "EXAM_JustifyCatResident")
    protected String examJustifyCatResident;
    @XmlElement(name = "EXAM_JustifyRsnResident")
    protected String examJustifyRsnResident;
    @XmlElement(name = "EXAM_JustifyCatCorpStatus")
    protected String examJustifyCatCorpStatus;
    @XmlElement(name = "EXAM_JustifyRsnCorpStatus")
    protected String examJustifyRsnCorpStatus;
    @XmlElement(name = "EXAM_JustifyCatMSICCode")
    protected String examJustifyCatMSICCode;
    @XmlElement(name = "EXAM_JustifyRsnMSICCode")
    protected String examJustifyRsnMSICCode;

    /**
     * Gets the value of the examPersonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMPersonInfoType }
     *     
     */
    public EXAMPersonInfoType getEXAMPersonInfo() {
        return examPersonInfo;
    }

    /**
     * Sets the value of the examPersonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMPersonInfoType }
     *     
     */
    public void setEXAMPersonInfo(EXAMPersonInfoType value) {
        this.examPersonInfo = value;
    }

    /**
     * Gets the value of the examOrgInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMOrgInfoType }
     *     
     */
    public EXAMOrgInfoType getEXAMOrgInfo() {
        return examOrgInfo;
    }

    /**
     * Sets the value of the examOrgInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMOrgInfoType }
     *     
     */
    public void setEXAMOrgInfo(EXAMOrgInfoType value) {
        this.examOrgInfo = value;
    }

    /**
     * Gets the value of the examOrgnFormRefId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEXAMOrgnFormRefId() {
        return examOrgnFormRefId;
    }

    /**
     * Sets the value of the examOrgnFormRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEXAMOrgnFormRefId(Long value) {
        this.examOrgnFormRefId = value;
    }

    /**
     * Gets the value of the seqNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSeqNum() {
        return seqNum;
    }

    /**
     * Sets the value of the seqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeqNum(Long value) {
        this.seqNum = value;
    }

    /**
     * Gets the value of the examBumiputeraIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBumiputeraIndicator() {
        return examBumiputeraIndicator;
    }

    /**
     * Sets the value of the examBumiputeraIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBumiputeraIndicator(String value) {
        this.examBumiputeraIndicator = value;
    }

    /**
     * Gets the value of the examSarawakIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSarawakIndicator() {
        return examSarawakIndicator;
    }

    /**
     * Sets the value of the examSarawakIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSarawakIndicator(String value) {
        this.examSarawakIndicator = value;
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
     * Gets the value of the examDiscReqd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMDiscReqd() {
        return examDiscReqd;
    }

    /**
     * Sets the value of the examDiscReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMDiscReqd(String value) {
        this.examDiscReqd = value;
    }

    /**
     * Gets the value of the examDiscReqdThirdParty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMDiscReqdThirdParty() {
        return examDiscReqdThirdParty;
    }

    /**
     * Sets the value of the examDiscReqdThirdParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMDiscReqdThirdParty(String value) {
        this.examDiscReqdThirdParty = value;
    }

    /**
     * Gets the value of the bankId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankId() {
        return bankId;
    }

    /**
     * Sets the value of the bankId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankId(String value) {
        this.bankId = value;
    }

    /**
     * Gets the value of the examRelationshipStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMRelationshipStatus() {
        return examRelationshipStatus;
    }

    /**
     * Sets the value of the examRelationshipStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMRelationshipStatus(String value) {
        this.examRelationshipStatus = value;
    }

    /**
     * Gets the value of the examRelationshipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMRelationshipCode() {
        return examRelationshipCode;
    }

    /**
     * Sets the value of the examRelationshipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMRelationshipCode(String value) {
        this.examRelationshipCode = value;
    }

    /**
     * Gets the value of the examResidencyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMResidencyStatus() {
        return examResidencyStatus;
    }

    /**
     * Sets the value of the examResidencyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMResidencyStatus(String value) {
        this.examResidencyStatus = value;
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
     * Gets the value of the examBiometricIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBiometricIndicator() {
        return examBiometricIndicator;
    }

    /**
     * Sets the value of the examBiometricIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBiometricIndicator(String value) {
        this.examBiometricIndicator = value;
    }

    /**
     * Gets the value of the examTriggerCDDIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMTriggerCDDIndicator() {
        return examTriggerCDDIndicator;
    }

    /**
     * Sets the value of the examTriggerCDDIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMTriggerCDDIndicator(String value) {
        this.examTriggerCDDIndicator = value;
    }

    /**
     * Gets the value of the examStrategicBusinessUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMStrategicBusinessUnit() {
        return examStrategicBusinessUnit;
    }

    /**
     * Sets the value of the examStrategicBusinessUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMStrategicBusinessUnit(String value) {
        this.examStrategicBusinessUnit = value;
    }

    /**
     * Gets the value of the examsbuCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSBUCode() {
        return examsbuCode;
    }

    /**
     * Sets the value of the examsbuCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSBUCode(String value) {
        this.examsbuCode = value;
    }

    /**
     * Gets the value of the examResidencyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMResidencyType() {
        return examResidencyType;
    }

    /**
     * Sets the value of the examResidencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMResidencyType(String value) {
        this.examResidencyType = value;
    }

    /**
     * Gets the value of the examCostCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCostCenter() {
        return examCostCenter;
    }

    /**
     * Sets the value of the examCostCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCostCenter(String value) {
        this.examCostCenter = value;
    }

    /**
     * Gets the value of the org property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrg() {
        return org;
    }

    /**
     * Sets the value of the org property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrg(String value) {
        this.org = value;
    }

    /**
     * Gets the value of the examOffshoreBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOffshoreBusiness() {
        return examOffshoreBusiness;
    }

    /**
     * Sets the value of the examOffshoreBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOffshoreBusiness(String value) {
        this.examOffshoreBusiness = value;
    }

    /**
     * Gets the value of the examCountryofBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCountryofBusiness() {
        return examCountryofBusiness;
    }

    /**
     * Sets the value of the examCountryofBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCountryofBusiness(String value) {
        this.examCountryofBusiness = value;
    }

    /**
     * Gets the value of the examIsResident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIsResident() {
        return examIsResident;
    }

    /**
     * Sets the value of the examIsResident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIsResident(String value) {
        this.examIsResident = value;
    }

    /**
     * Gets the value of the examBusinessStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMBusinessStartDt() {
        return examBusinessStartDt;
    }

    /**
     * Sets the value of the examBusinessStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBusinessStartDt(LocalDate value) {
        this.examBusinessStartDt = value;
    }

    /**
     * Gets the value of the examCountryofExposure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCountryofExposure() {
        return examCountryofExposure;
    }

    /**
     * Sets the value of the examCountryofExposure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCountryofExposure(String value) {
        this.examCountryofExposure = value;
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
     * Gets the value of the examInqCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMInqCode() {
        return examInqCode;
    }

    /**
     * Sets the value of the examInqCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMInqCode(String value) {
        this.examInqCode = value;
    }

    /**
     * Gets the value of the examMailingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMailingCode() {
        return examMailingCode;
    }

    /**
     * Sets the value of the examMailingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMailingCode(String value) {
        this.examMailingCode = value;
    }

    /**
     * Gets the value of the examPromotionalMailingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPromotionalMailingCode() {
        return examPromotionalMailingCode;
    }

    /**
     * Sets the value of the examPromotionalMailingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPromotionalMailingCode(String value) {
        this.examPromotionalMailingCode = value;
    }

    /**
     * Gets the value of the examCombinedStmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCombinedStmt() {
        return examCombinedStmt;
    }

    /**
     * Sets the value of the examCombinedStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCombinedStmt(String value) {
        this.examCombinedStmt = value;
    }

    /**
     * Gets the value of the examCombinedStmtCycle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCombinedStmtCycle() {
        return examCombinedStmtCycle;
    }

    /**
     * Sets the value of the examCombinedStmtCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCombinedStmtCycle(String value) {
        this.examCombinedStmtCycle = value;
    }

    /**
     * Gets the value of the examcrRatingReviewDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMCRRatingReviewDt() {
        return examcrRatingReviewDt;
    }

    /**
     * Sets the value of the examcrRatingReviewDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCRRatingReviewDt(LocalDate value) {
        this.examcrRatingReviewDt = value;
    }

    /**
     * Gets the value of the examcrRatingReviewTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCRRatingReviewTerm() {
        return examcrRatingReviewTerm;
    }

    /**
     * Sets the value of the examcrRatingReviewTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCRRatingReviewTerm(String value) {
        this.examcrRatingReviewTerm = value;
    }

    /**
     * Gets the value of the examcrRatingReviewTermCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCRRatingReviewTermCode() {
        return examcrRatingReviewTermCode;
    }

    /**
     * Sets the value of the examcrRatingReviewTermCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCRRatingReviewTermCode(String value) {
        this.examcrRatingReviewTermCode = value;
    }

    /**
     * Gets the value of the occupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Sets the value of the occupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupation(String value) {
        this.occupation = value;
    }

    /**
     * Gets the value of the examFedCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMFedCode() {
        return examFedCode;
    }

    /**
     * Sets the value of the examFedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMFedCode(String value) {
        this.examFedCode = value;
    }

    /**
     * Gets the value of the examSubSegmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSubSegmentCode() {
        return examSubSegmentCode;
    }

    /**
     * Sets the value of the examSubSegmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSubSegmentCode(String value) {
        this.examSubSegmentCode = value;
    }

    /**
     * Gets the value of the examgstRegdIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMGSTRegdIndicator() {
        return examgstRegdIndicator;
    }

    /**
     * Sets the value of the examgstRegdIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMGSTRegdIndicator(String value) {
        this.examgstRegdIndicator = value;
    }

    /**
     * Gets the value of the examOfficerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOfficerCode() {
        return examOfficerCode;
    }

    /**
     * Sets the value of the examOfficerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOfficerCode(String value) {
        this.examOfficerCode = value;
    }

    /**
     * Gets the value of the examIsAML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIsAML() {
        return examIsAML;
    }

    /**
     * Sets the value of the examIsAML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIsAML(String value) {
        this.examIsAML = value;
    }

    /**
     * Gets the value of the examIsIDProof property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIsIDProof() {
        return examIsIDProof;
    }

    /**
     * Sets the value of the examIsIDProof property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIsIDProof(String value) {
        this.examIsIDProof = value;
    }

    /**
     * Gets the value of the examIsFATF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIsFATF() {
        return examIsFATF;
    }

    /**
     * Sets the value of the examIsFATF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIsFATF(String value) {
        this.examIsFATF = value;
    }

    /**
     * Gets the value of the examIsSMSAlert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIsSMSAlert() {
        return examIsSMSAlert;
    }

    /**
     * Sets the value of the examIsSMSAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIsSMSAlert(String value) {
        this.examIsSMSAlert = value;
    }

    /**
     * Gets the value of the examPriId property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMGovIssueIdentType }
     *     
     */
    public EXAMGovIssueIdentType getEXAMPriId() {
        return examPriId;
    }

    /**
     * Sets the value of the examPriId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMGovIssueIdentType }
     *     
     */
    public void setEXAMPriId(EXAMGovIssueIdentType value) {
        this.examPriId = value;
    }

    /**
     * Gets the value of the examSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEXAMSeqNum() {
        return examSeqNum;
    }

    /**
     * Sets the value of the examSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEXAMSeqNum(Long value) {
        this.examSeqNum = value;
    }

    /**
     * Gets the value of the curCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurCode() {
        return curCode;
    }

    /**
     * Sets the value of the curCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurCode(String value) {
        this.curCode = value;
    }

    /**
     * Gets the value of the examIslamicInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIslamicInd() {
        return examIslamicInd;
    }

    /**
     * Sets the value of the examIslamicInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIslamicInd(String value) {
        this.examIslamicInd = value;
    }

    /**
     * Gets the value of the examConnectedParty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMConnectedParty() {
        return examConnectedParty;
    }

    /**
     * Sets the value of the examConnectedParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMConnectedParty(String value) {
        this.examConnectedParty = value;
    }

    /**
     * Gets the value of the examTaxReliefInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMTaxReliefInd() {
        return examTaxReliefInd;
    }

    /**
     * Sets the value of the examTaxReliefInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMTaxReliefInd(String value) {
        this.examTaxReliefInd = value;
    }

    /**
     * Gets the value of the examPrintTaxInvInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPrintTaxInvInd() {
        return examPrintTaxInvInd;
    }

    /**
     * Sets the value of the examPrintTaxInvInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPrintTaxInvInd(String value) {
        this.examPrintTaxInvInd = value;
    }

    /**
     * Gets the value of the employeeIdentlNum property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEmployeeIdentlNum() {
        return employeeIdentlNum;
    }

    /**
     * Sets the value of the employeeIdentlNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEmployeeIdentlNum(Object value) {
        this.employeeIdentlNum = value;
    }

    /**
     * Gets the value of the examEducationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMEducationCode() {
        return examEducationCode;
    }

    /**
     * Sets the value of the examEducationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEducationCode(String value) {
        this.examEducationCode = value;
    }

    /**
     * Gets the value of the examMembershipDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMMembershipDate() {
        return examMembershipDate;
    }

    /**
     * Sets the value of the examMembershipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMembershipDate(LocalDate value) {
        this.examMembershipDate = value;
    }

    /**
     * Gets the value of the branchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchId() {
        return branchId;
    }

    /**
     * Sets the value of the branchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchId(String value) {
        this.branchId = value;
    }

    /**
     * Gets the value of the examlezCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMLEZCode() {
        return examlezCode;
    }

    /**
     * Sets the value of the examlezCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMLEZCode(String value) {
        this.examlezCode = value;
    }

    /**
     * Gets the value of the examsmsa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSMSA() {
        return examsmsa;
    }

    /**
     * Sets the value of the examsmsa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSMSA(String value) {
        this.examsmsa = value;
    }

    /**
     * Gets the value of the examCensus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCensus() {
        return examCensus;
    }

    /**
     * Sets the value of the examCensus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCensus(String value) {
        this.examCensus = value;
    }

    /**
     * Gets the value of the examEmploymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMEmploymentType() {
        return examEmploymentType;
    }

    /**
     * Sets the value of the examEmploymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEmploymentType(String value) {
        this.examEmploymentType = value;
    }

    /**
     * Gets the value of the examForeignCountryInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMForeignCountryInd() {
        return examForeignCountryInd;
    }

    /**
     * Sets the value of the examForeignCountryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMForeignCountryInd(String value) {
        this.examForeignCountryInd = value;
    }

    /**
     * Gets the value of the examusPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMUSPerson() {
        return examusPerson;
    }

    /**
     * Sets the value of the examusPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMUSPerson(String value) {
        this.examusPerson = value;
    }

    /**
     * Gets the value of the examNonUSPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMNonUSPerson() {
        return examNonUSPerson;
    }

    /**
     * Sets the value of the examNonUSPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMNonUSPerson(String value) {
        this.examNonUSPerson = value;
    }

    /**
     * Gets the value of the examHighRisk property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMHighRiskType }
     *     
     */
    public EXAMHighRiskType getEXAMHighRisk() {
        return examHighRisk;
    }

    /**
     * Sets the value of the examHighRisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMHighRiskType }
     *     
     */
    public void setEXAMHighRisk(EXAMHighRiskType value) {
        this.examHighRisk = value;
    }

    /**
     * Gets the value of the examLastReviewDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMLastReviewDt() {
        return examLastReviewDt;
    }

    /**
     * Sets the value of the examLastReviewDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMLastReviewDt(LocalDate value) {
        this.examLastReviewDt = value;
    }

    /**
     * Gets the value of the examCustReviewDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMCustReviewDt() {
        return examCustReviewDt;
    }

    /**
     * Sets the value of the examCustReviewDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCustReviewDt(LocalDate value) {
        this.examCustReviewDt = value;
    }

    /**
     * Gets the value of the examCustReviewTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCustReviewTerm() {
        return examCustReviewTerm;
    }

    /**
     * Sets the value of the examCustReviewTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCustReviewTerm(String value) {
        this.examCustReviewTerm = value;
    }

    /**
     * Gets the value of the examCustReviewTermCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCustReviewTermCode() {
        return examCustReviewTermCode;
    }

    /**
     * Sets the value of the examCustReviewTermCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCustReviewTermCode(String value) {
        this.examCustReviewTermCode = value;
    }

    /**
     * Gets the value of the examCustOfficerRel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCustOfficerRel() {
        return examCustOfficerRel;
    }

    /**
     * Sets the value of the examCustOfficerRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCustOfficerRel(String value) {
        this.examCustOfficerRel = value;
    }

    /**
     * Gets the value of the examInsiderCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMInsiderCode() {
        return examInsiderCode;
    }

    /**
     * Sets the value of the examInsiderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMInsiderCode(String value) {
        this.examInsiderCode = value;
    }

    /**
     * Gets the value of the examBusinessInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMBusinessInfoType }
     *     
     */
    public EXAMBusinessInfoType getEXAMBusinessInfo() {
        return examBusinessInfo;
    }

    /**
     * Sets the value of the examBusinessInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMBusinessInfoType }
     *     
     */
    public void setEXAMBusinessInfo(EXAMBusinessInfoType value) {
        this.examBusinessInfo = value;
    }

    /**
     * Gets the value of the examChosenCustCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMChosenCustCode() {
        return examChosenCustCode;
    }

    /**
     * Sets the value of the examChosenCustCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMChosenCustCode(String value) {
        this.examChosenCustCode = value;
    }

    /**
     * Gets the value of the examApprovedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMApprovedLimit() {
        return examApprovedLimit;
    }

    /**
     * Sets the value of the examApprovedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMApprovedLimit(String value) {
        this.examApprovedLimit = value;
    }

    /**
     * Gets the value of the examHandleOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMHandleOption() {
        return examHandleOption;
    }

    /**
     * Sets the value of the examHandleOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMHandleOption(String value) {
        this.examHandleOption = value;
    }

    /**
     * Gets the value of the examHighLowInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMHighLowInd() {
        return examHighLowInd;
    }

    /**
     * Sets the value of the examHighLowInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMHighLowInd(String value) {
        this.examHighLowInd = value;
    }

    /**
     * Gets the value of the examDefCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMDefCode1() {
        return examDefCode1;
    }

    /**
     * Sets the value of the examDefCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMDefCode1(String value) {
        this.examDefCode1 = value;
    }

    /**
     * Gets the value of the examDefCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMDefCode2() {
        return examDefCode2;
    }

    /**
     * Sets the value of the examDefCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMDefCode2(String value) {
        this.examDefCode2 = value;
    }

    /**
     * Gets the value of the examDefCode3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMDefCode3() {
        return examDefCode3;
    }

    /**
     * Sets the value of the examDefCode3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMDefCode3(String value) {
        this.examDefCode3 = value;
    }

    /**
     * Gets the value of the examDefCode4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMDefCode4() {
        return examDefCode4;
    }

    /**
     * Sets the value of the examDefCode4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMDefCode4(String value) {
        this.examDefCode4 = value;
    }

    /**
     * Gets the value of the examIntroducerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIntroducerCode() {
        return examIntroducerCode;
    }

    /**
     * Sets the value of the examIntroducerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIntroducerCode(String value) {
        this.examIntroducerCode = value;
    }

    /**
     * Gets the value of the examdpaInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMDPAInd() {
        return examdpaInd;
    }

    /**
     * Sets the value of the examdpaInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMDPAInd(String value) {
        this.examdpaInd = value;
    }

    /**
     * Gets the value of the examIslamicIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIslamicIndicator() {
        return examIslamicIndicator;
    }

    /**
     * Sets the value of the examIslamicIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIslamicIndicator(String value) {
        this.examIslamicIndicator = value;
    }

    /**
     * Gets the value of the examRetentionCycle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMRetentionCycle() {
        return examRetentionCycle;
    }

    /**
     * Sets the value of the examRetentionCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMRetentionCycle(String value) {
        this.examRetentionCycle = value;
    }

    /**
     * Gets the value of the examUserCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMUserCode() {
        return examUserCode;
    }

    /**
     * Sets the value of the examUserCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMUserCode(String value) {
        this.examUserCode = value;
    }

    /**
     * Gets the value of the examRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMRemarks() {
        return examRemarks;
    }

    /**
     * Sets the value of the examRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMRemarks(String value) {
        this.examRemarks = value;
    }

    /**
     * Gets the value of the examkycGrade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMKYCGrade() {
        return examkycGrade;
    }

    /**
     * Sets the value of the examkycGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMKYCGrade(String value) {
        this.examkycGrade = value;
    }

    /**
     * Gets the value of the examCurrentKYCRulesCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCurrentKYCRulesCode() {
        return examCurrentKYCRulesCode;
    }

    /**
     * Sets the value of the examCurrentKYCRulesCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCurrentKYCRulesCode(String value) {
        this.examCurrentKYCRulesCode = value;
    }

    /**
     * Gets the value of the examOverrideIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOverrideIndicator() {
        return examOverrideIndicator;
    }

    /**
     * Sets the value of the examOverrideIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOverrideIndicator(String value) {
        this.examOverrideIndicator = value;
    }

    /**
     * Gets the value of the examLastMaintUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMLastMaintUID() {
        return examLastMaintUID;
    }

    /**
     * Sets the value of the examLastMaintUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMLastMaintUID(String value) {
        this.examLastMaintUID = value;
    }

    /**
     * Gets the value of the examLastMaintTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEXAMLastMaintTm() {
        return examLastMaintTm;
    }

    /**
     * Sets the value of the examLastMaintTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEXAMLastMaintTm(XMLGregorianCalendar value) {
        this.examLastMaintTm = value;
    }

    /**
     * Gets the value of the examOwnerRelationshipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOwnerRelationshipCode() {
        return examOwnerRelationshipCode;
    }

    /**
     * Sets the value of the examOwnerRelationshipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOwnerRelationshipCode(String value) {
        this.examOwnerRelationshipCode = value;
    }

    /**
     * Gets the value of the examContactDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMContactDetailsType }
     *     
     */
    public EXAMContactDetailsType getEXAMContactDetails() {
        return examContactDetails;
    }

    /**
     * Sets the value of the examContactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMContactDetailsType }
     *     
     */
    public void setEXAMContactDetails(EXAMContactDetailsType value) {
        this.examContactDetails = value;
    }

    /**
     * Gets the value of the examCustRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMCustRelationshipType }
     *     
     */
    public EXAMCustRelationshipType getEXAMCustRelationship() {
        return examCustRelationship;
    }

    /**
     * Sets the value of the examCustRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMCustRelationshipType }
     *     
     */
    public void setEXAMCustRelationship(EXAMCustRelationshipType value) {
        this.examCustRelationship = value;
    }

    /**
     * Gets the value of the examCustClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCustClass() {
        return examCustClass;
    }

    /**
     * Sets the value of the examCustClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCustClass(String value) {
        this.examCustClass = value;
    }

    /**
     * Gets the value of the examBusinessDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMBusinessDetailsType }
     *     
     */
    public EXAMBusinessDetailsType getEXAMBusinessDetails() {
        return examBusinessDetails;
    }

    /**
     * Sets the value of the examBusinessDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMBusinessDetailsType }
     *     
     */
    public void setEXAMBusinessDetails(EXAMBusinessDetailsType value) {
        this.examBusinessDetails = value;
    }

    /**
     * Gets the value of the examEduDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMEduDetailsType }
     *     
     */
    public EXAMEduDetailsType getEXAMEduDetails() {
        return examEduDetails;
    }

    /**
     * Sets the value of the examEduDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMEduDetailsType }
     *     
     */
    public void setEXAMEduDetails(EXAMEduDetailsType value) {
        this.examEduDetails = value;
    }

    /**
     * Gets the value of the examCustInqDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMCustInqDetailsType }
     *     
     */
    public EXAMCustInqDetailsType getEXAMCustInqDetails() {
        return examCustInqDetails;
    }

    /**
     * Sets the value of the examCustInqDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMCustInqDetailsType }
     *     
     */
    public void setEXAMCustInqDetails(EXAMCustInqDetailsType value) {
        this.examCustInqDetails = value;
    }

    /**
     * Gets the value of the examPrimeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPrimeIndicator() {
        return examPrimeIndicator;
    }

    /**
     * Sets the value of the examPrimeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPrimeIndicator(String value) {
        this.examPrimeIndicator = value;
    }

    /**
     * Gets the value of the examOfficerCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOfficerCode2() {
        return examOfficerCode2;
    }

    /**
     * Sets the value of the examOfficerCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOfficerCode2(String value) {
        this.examOfficerCode2 = value;
    }

    /**
     * Gets the value of the examWatchlistInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMWatchlistInd() {
        return examWatchlistInd;
    }

    /**
     * Sets the value of the examWatchlistInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMWatchlistInd(String value) {
        this.examWatchlistInd = value;
    }

    /**
     * Gets the value of the examWatchlistSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMWatchlistSeqNum() {
        return examWatchlistSeqNum;
    }

    /**
     * Sets the value of the examWatchlistSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMWatchlistSeqNum(String value) {
        this.examWatchlistSeqNum = value;
    }

    /**
     * Gets the value of the examSourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSourceCode() {
        return examSourceCode;
    }

    /**
     * Sets the value of the examSourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSourceCode(String value) {
        this.examSourceCode = value;
    }

    /**
     * Gets the value of the examExtSysCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMExtSysCode() {
        return examExtSysCode;
    }

    /**
     * Sets the value of the examExtSysCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMExtSysCode(String value) {
        this.examExtSysCode = value;
    }

    /**
     * Gets the value of the examExtSysUIDNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMExtSysUIDNum() {
        return examExtSysUIDNum;
    }

    /**
     * Sets the value of the examExtSysUIDNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMExtSysUIDNum(String value) {
        this.examExtSysUIDNum = value;
    }

    /**
     * Gets the value of the examEnteredDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMEnteredDt() {
        return examEnteredDt;
    }

    /**
     * Sets the value of the examEnteredDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEnteredDt(LocalDate value) {
        this.examEnteredDt = value;
    }

    /**
     * Gets the value of the examAmt property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMAmtType }
     *     
     */
    public EXAMAmtType getEXAMAmt() {
        return examAmt;
    }

    /**
     * Sets the value of the examAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMAmtType }
     *     
     */
    public void setEXAMAmt(EXAMAmtType value) {
        this.examAmt = value;
    }

    /**
     * Gets the value of the examCustomerReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examCustomerReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMCustomerReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMCustomerReferenceType }
     * 
     * 
     */
    public List<EXAMCustomerReferenceType> getEXAMCustomerReference() {
        if (examCustomerReference == null) {
            examCustomerReference = new ArrayList<>();
        }
        return this.examCustomerReference;
    }

    /**
     * Gets the value of the examCustomerLifeStyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examCustomerLifeStyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMCustomerLifeStyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMCustomerLifeStyleType }
     * 
     * 
     */
    public List<EXAMCustomerLifeStyleType> getEXAMCustomerLifeStyle() {
        if (examCustomerLifeStyle == null) {
            examCustomerLifeStyle = new ArrayList<>();
        }
        return this.examCustomerLifeStyle;
    }

    /**
     * Gets the value of the examMoreLifestyleIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMoreLifestyleIndicator() {
        return examMoreLifestyleIndicator;
    }

    /**
     * Sets the value of the examMoreLifestyleIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMoreLifestyleIndicator(String value) {
        this.examMoreLifestyleIndicator = value;
    }

    /**
     * Gets the value of the examCustomerAlias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examCustomerAlias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMCustomerAlias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMCustomerAliasType }
     * 
     * 
     */
    public List<EXAMCustomerAliasType> getEXAMCustomerAlias() {
        if (examCustomerAlias == null) {
            examCustomerAlias = new ArrayList<>();
        }
        return this.examCustomerAlias;
    }

    /**
     * Gets the value of the examMoreAliasIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMoreAliasIndicator() {
        return examMoreAliasIndicator;
    }

    /**
     * Sets the value of the examMoreAliasIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMoreAliasIndicator(String value) {
        this.examMoreAliasIndicator = value;
    }

    /**
     * Gets the value of the examCustomerEducation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examCustomerEducation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMCustomerEducation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMCustomerEducationType }
     * 
     * 
     */
    public List<EXAMCustomerEducationType> getEXAMCustomerEducation() {
        if (examCustomerEducation == null) {
            examCustomerEducation = new ArrayList<>();
        }
        return this.examCustomerEducation;
    }

    /**
     * Gets the value of the examMoreEducationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMoreEducationIndicator() {
        return examMoreEducationIndicator;
    }

    /**
     * Sets the value of the examMoreEducationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMoreEducationIndicator(String value) {
        this.examMoreEducationIndicator = value;
    }

    /**
     * Gets the value of the examCompanyCreditCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examCompanyCreditCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMCompanyCreditCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMCompanyCreditCardType }
     * 
     * 
     */
    public List<EXAMCompanyCreditCardType> getEXAMCompanyCreditCard() {
        if (examCompanyCreditCard == null) {
            examCompanyCreditCard = new ArrayList<>();
        }
        return this.examCompanyCreditCard;
    }

    /**
     * Gets the value of the examBlacklist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examBlacklist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMBlacklist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMBlacklistType }
     * 
     * 
     */
    public List<EXAMBlacklistType> getEXAMBlacklist() {
        if (examBlacklist == null) {
            examBlacklist = new ArrayList<>();
        }
        return this.examBlacklist;
    }

    /**
     * Gets the value of the examMoreBlacklistIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMoreBlacklistIndicator() {
        return examMoreBlacklistIndicator;
    }

    /**
     * Sets the value of the examMoreBlacklistIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMoreBlacklistIndicator(String value) {
        this.examMoreBlacklistIndicator = value;
    }

    /**
     * Gets the value of the examNextReviewDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMNextReviewDate() {
        return examNextReviewDate;
    }

    /**
     * Sets the value of the examNextReviewDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMNextReviewDate(String value) {
        this.examNextReviewDate = value;
    }

    /**
     * Gets the value of the examExistingCustFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMExistingCustFlag() {
        return examExistingCustFlag;
    }

    /**
     * Sets the value of the examExistingCustFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMExistingCustFlag(String value) {
        this.examExistingCustFlag = value;
    }

    /**
     * Gets the value of the examOccupation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examOccupation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMOccupation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMOccupationType }
     * 
     * 
     */
    public List<EXAMOccupationType> getEXAMOccupation() {
        if (examOccupation == null) {
            examOccupation = new ArrayList<>();
        }
        return this.examOccupation;
    }

    /**
     * Gets the value of the examLastMaintDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMLastMaintDt() {
        return examLastMaintDt;
    }

    /**
     * Sets the value of the examLastMaintDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMLastMaintDt(LocalDate value) {
        this.examLastMaintDt = value;
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
     * Gets the value of the examIssPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIssPlace() {
        return examIssPlace;
    }

    /**
     * Sets the value of the examIssPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIssPlace(String value) {
        this.examIssPlace = value;
    }

    /**
     * Gets the value of the examcarCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCARCode() {
        return examcarCode;
    }

    /**
     * Sets the value of the examcarCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCARCode(String value) {
        this.examcarCode = value;
    }

    /**
     * Gets the value of the examLastMaintTmStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMLastMaintTmStamp() {
        return examLastMaintTmStamp;
    }

    /**
     * Sets the value of the examLastMaintTmStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMLastMaintTmStamp(String value) {
        this.examLastMaintTmStamp = value;
    }

    /**
     * Gets the value of the examCustOtherDtlInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examCustOtherDtlInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMCustOtherDtlInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMCustOtherDtlInfoType }
     * 
     * 
     */
    public List<EXAMCustOtherDtlInfoType> getEXAMCustOtherDtlInfo() {
        if (examCustOtherDtlInfo == null) {
            examCustOtherDtlInfo = new ArrayList<>();
        }
        return this.examCustOtherDtlInfo;
    }

    /**
     * Gets the value of the examTaxStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMTaxStatus() {
        return examTaxStatus;
    }

    /**
     * Sets the value of the examTaxStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMTaxStatus(String value) {
        this.examTaxStatus = value;
    }

    /**
     * Gets the value of the examCentralBankCode5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCentralBankCode5() {
        return examCentralBankCode5;
    }

    /**
     * Sets the value of the examCentralBankCode5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCentralBankCode5(String value) {
        this.examCentralBankCode5 = value;
    }

    /**
     * Gets the value of the examPlaceOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPlaceOfBirth() {
        return examPlaceOfBirth;
    }

    /**
     * Sets the value of the examPlaceOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPlaceOfBirth(String value) {
        this.examPlaceOfBirth = value;
    }

    /**
     * Gets the value of the examTranOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMTranOption() {
        return examTranOption;
    }

    /**
     * Sets the value of the examTranOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMTranOption(String value) {
        this.examTranOption = value;
    }

    /**
     * Gets the value of the examOriginationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOriginationType() {
        return examOriginationType;
    }

    /**
     * Sets the value of the examOriginationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOriginationType(String value) {
        this.examOriginationType = value;
    }

    /**
     * Gets the value of the examNoOfCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMNoOfCustomer() {
        return examNoOfCustomer;
    }

    /**
     * Sets the value of the examNoOfCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMNoOfCustomer(String value) {
        this.examNoOfCustomer = value;
    }

    /**
     * Gets the value of the examCreationPurposeCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCreationPurposeCd() {
        return examCreationPurposeCd;
    }

    /**
     * Sets the value of the examCreationPurposeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCreationPurposeCd(String value) {
        this.examCreationPurposeCd = value;
    }

    /**
     * Gets the value of the examAcctMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMAcctMode() {
        return examAcctMode;
    }

    /**
     * Sets the value of the examAcctMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMAcctMode(String value) {
        this.examAcctMode = value;
    }

    /**
     * Gets the value of the examSourceApplnRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSourceApplnRef() {
        return examSourceApplnRef;
    }

    /**
     * Sets the value of the examSourceApplnRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSourceApplnRef(String value) {
        this.examSourceApplnRef = value;
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
     * Gets the value of the examHoldMailCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMHoldMailCode() {
        return examHoldMailCode;
    }

    /**
     * Sets the value of the examHoldMailCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMHoldMailCode(String value) {
        this.examHoldMailCode = value;
    }

    /**
     * Gets the value of the examOblRskGrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOblRskGrd() {
        return examOblRskGrd;
    }

    /**
     * Sets the value of the examOblRskGrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOblRskGrd(String value) {
        this.examOblRskGrd = value;
    }

    /**
     * Gets the value of the examMas757Ind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMas757Ind() {
        return examMas757Ind;
    }

    /**
     * Sets the value of the examMas757Ind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMas757Ind(String value) {
        this.examMas757Ind = value;
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
     * Gets the value of the examEmpoyeeStartYr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMEmpoyeeStartYr() {
        return examEmpoyeeStartYr;
    }

    /**
     * Sets the value of the examEmpoyeeStartYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEmpoyeeStartYr(String value) {
        this.examEmpoyeeStartYr = value;
    }

    /**
     * Gets the value of the examNoOfYr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMNoOfYr() {
        return examNoOfYr;
    }

    /**
     * Sets the value of the examNoOfYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMNoOfYr(String value) {
        this.examNoOfYr = value;
    }

    /**
     * Gets the value of the examJobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMJobTitle() {
        return examJobTitle;
    }

    /**
     * Sets the value of the examJobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMJobTitle(String value) {
        this.examJobTitle = value;
    }

    /**
     * Gets the value of the examSrcUIDRefNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSrcUIDRefNum() {
        return examSrcUIDRefNum;
    }

    /**
     * Sets the value of the examSrcUIDRefNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSrcUIDRefNum(String value) {
        this.examSrcUIDRefNum = value;
    }

    /**
     * Gets the value of the examCustomerRiskCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCustomerRiskCode() {
        return examCustomerRiskCode;
    }

    /**
     * Sets the value of the examCustomerRiskCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCustomerRiskCode(String value) {
        this.examCustomerRiskCode = value;
    }

    /**
     * Gets the value of the examRelateNameInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examRelateNameInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMRelateNameInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelateNameInfoType }
     * 
     * 
     */
    public List<RelateNameInfoType> getEXAMRelateNameInfo() {
        if (examRelateNameInfo == null) {
            examRelateNameInfo = new ArrayList<>();
        }
        return this.examRelateNameInfo;
    }

    /**
     * Gets the value of the examDirectPartnerInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examDirectPartnerInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMDirectPartnerInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMGovIssueIdentType }
     * 
     * 
     */
    public List<EXAMGovIssueIdentType> getEXAMDirectPartnerInfo() {
        if (examDirectPartnerInfo == null) {
            examDirectPartnerInfo = new ArrayList<>();
        }
        return this.examDirectPartnerInfo;
    }

    /**
     * Gets the value of the examDirectPartnerDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examDirectPartnerDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMDirectPartnerDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMDirectPartnerDetailsType }
     * 
     * 
     */
    public List<EXAMDirectPartnerDetailsType> getEXAMDirectPartnerDetails() {
        if (examDirectPartnerDetails == null) {
            examDirectPartnerDetails = new ArrayList<>();
        }
        return this.examDirectPartnerDetails;
    }

    /**
     * Gets the value of the examRegistrationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMRegistrationType() {
        return examRegistrationType;
    }

    /**
     * Sets the value of the examRegistrationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMRegistrationType(String value) {
        this.examRegistrationType = value;
    }

    /**
     * Gets the value of the examSeqNumMultiple property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examSeqNumMultiple property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMSeqNumMultiple().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMSeqNumMultipleType }
     * 
     * 
     */
    public List<EXAMSeqNumMultipleType> getEXAMSeqNumMultiple() {
        if (examSeqNumMultiple == null) {
            examSeqNumMultiple = new ArrayList<>();
        }
        return this.examSeqNumMultiple;
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
     * Gets the value of the examCentralBankCode6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCentralBankCode6() {
        return examCentralBankCode6;
    }

    /**
     * Sets the value of the examCentralBankCode6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCentralBankCode6(String value) {
        this.examCentralBankCode6 = value;
    }

    /**
     * Gets the value of the examCentralBankCode7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCentralBankCode7() {
        return examCentralBankCode7;
    }

    /**
     * Sets the value of the examCentralBankCode7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCentralBankCode7(String value) {
        this.examCentralBankCode7 = value;
    }

    /**
     * Gets the value of the examCentralBankCode8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCentralBankCode8() {
        return examCentralBankCode8;
    }

    /**
     * Sets the value of the examCentralBankCode8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCentralBankCode8(String value) {
        this.examCentralBankCode8 = value;
    }

    /**
     * Gets the value of the examCentralBankCode9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCentralBankCode9() {
        return examCentralBankCode9;
    }

    /**
     * Sets the value of the examCentralBankCode9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCentralBankCode9(String value) {
        this.examCentralBankCode9 = value;
    }

    /**
     * Gets the value of the examCentralBankCode10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCentralBankCode10() {
        return examCentralBankCode10;
    }

    /**
     * Sets the value of the examCentralBankCode10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCentralBankCode10(String value) {
        this.examCentralBankCode10 = value;
    }

    /**
     * Gets the value of the examctosStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCTOSStatus() {
        return examctosStatus;
    }

    /**
     * Sets the value of the examctosStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCTOSStatus(String value) {
        this.examctosStatus = value;
    }

    /**
     * Gets the value of the examOwnerOfFund property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOwnerOfFund() {
        return examOwnerOfFund;
    }

    /**
     * Sets the value of the examOwnerOfFund property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOwnerOfFund(String value) {
        this.examOwnerOfFund = value;
    }

    /**
     * Gets the value of the examaoviRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMAOVIRefNo() {
        return examaoviRefNo;
    }

    /**
     * Sets the value of the examaoviRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMAOVIRefNo(String value) {
        this.examaoviRefNo = value;
    }

    /**
     * Gets the value of the examForeignCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEXAMForeignCode() {
        return examForeignCode;
    }

    /**
     * Sets the value of the examForeignCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEXAMForeignCode(Long value) {
        this.examForeignCode = value;
    }

    /**
     * Gets the value of the examWorkAtEXAM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMWorkAtEXAM() {
        return examWorkAtEXAM;
    }

    /**
     * Sets the value of the examWorkAtEXAM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMWorkAtEXAM(String value) {
        this.examWorkAtEXAM = value;
    }

    /**
     * Gets the value of the examBloodType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBloodType() {
        return examBloodType;
    }

    /**
     * Sets the value of the examBloodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBloodType(String value) {
        this.examBloodType = value;
    }

    /**
     * Gets the value of the bankInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BankInfoType }
     *     
     */
    public BankInfoType getBankInfo() {
        return bankInfo;
    }

    /**
     * Sets the value of the bankInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankInfoType }
     *     
     */
    public void setBankInfo(BankInfoType value) {
        this.bankInfo = value;
    }

    /**
     * Gets the value of the examCustSecondaryNmInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMCustSecondaryNmInfoType }
     *     
     */
    public EXAMCustSecondaryNmInfoType getEXAMCustSecondaryNmInfo() {
        return examCustSecondaryNmInfo;
    }

    /**
     * Sets the value of the examCustSecondaryNmInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMCustSecondaryNmInfoType }
     *     
     */
    public void setEXAMCustSecondaryNmInfo(EXAMCustSecondaryNmInfoType value) {
        this.examCustSecondaryNmInfo = value;
    }

    /**
     * Gets the value of the examProviderSystemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMProviderSystemCode() {
        return examProviderSystemCode;
    }

    /**
     * Sets the value of the examProviderSystemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMProviderSystemCode(String value) {
        this.examProviderSystemCode = value;
    }

    /**
     * Gets the value of the examExternalRatingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examExternalRatingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMExternalRatingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMExternalRatingInfoType }
     * 
     * 
     */
    public List<EXAMExternalRatingInfoType> getEXAMExternalRatingInfo() {
        if (examExternalRatingInfo == null) {
            examExternalRatingInfo = new ArrayList<>();
        }
        return this.examExternalRatingInfo;
    }

    /**
     * Gets the value of the examSourceOfAssetInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examSourceOfAssetInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMSourceOfAssetInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMSourceOfAssetInfoType }
     * 
     * 
     */
    public List<EXAMSourceOfAssetInfoType> getEXAMSourceOfAssetInfo() {
        if (examSourceOfAssetInfo == null) {
            examSourceOfAssetInfo = new ArrayList<>();
        }
        return this.examSourceOfAssetInfo;
    }

    /**
     * Gets the value of the examCustStatusDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examCustStatusDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMCustStatusDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMCustStatusDetailType }
     * 
     * 
     */
    public List<EXAMCustStatusDetailType> getEXAMCustStatusDetail() {
        if (examCustStatusDetail == null) {
            examCustStatusDetail = new ArrayList<>();
        }
        return this.examCustStatusDetail;
    }

    /**
     * Gets the value of the examCreditCardInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examCreditCardInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMCreditCardInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMCreditCardInfoType }
     * 
     * 
     */
    public List<EXAMCreditCardInfoType> getEXAMCreditCardInfo() {
        if (examCreditCardInfo == null) {
            examCreditCardInfo = new ArrayList<>();
        }
        return this.examCreditCardInfo;
    }

    /**
     * Gets the value of the examCustLifeStyleInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examCustLifeStyleInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMCustLifeStyleInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMCustLifeStyleInfoType }
     * 
     * 
     */
    public List<EXAMCustLifeStyleInfoType> getEXAMCustLifeStyleInfo() {
        if (examCustLifeStyleInfo == null) {
            examCustLifeStyleInfo = new ArrayList<>();
        }
        return this.examCustLifeStyleInfo;
    }

    /**
     * Gets the value of the examLastMaintInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examLastMaintInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMLastMaintInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMLastMaintInfoType }
     * 
     * 
     */
    public List<EXAMLastMaintInfoType> getEXAMLastMaintInfo() {
        if (examLastMaintInfo == null) {
            examLastMaintInfo = new ArrayList<>();
        }
        return this.examLastMaintInfo;
    }

    /**
     * Gets the value of the examDefaultCodeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examDefaultCodeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMDefaultCodeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMDefaultCodeInfoType }
     * 
     * 
     */
    public List<EXAMDefaultCodeInfoType> getEXAMDefaultCodeInfo() {
        if (examDefaultCodeInfo == null) {
            examDefaultCodeInfo = new ArrayList<>();
        }
        return this.examDefaultCodeInfo;
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
     * Gets the value of the examOmnibusBoardReso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOmnibusBoardReso() {
        return examOmnibusBoardReso;
    }

    /**
     * Sets the value of the examOmnibusBoardReso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOmnibusBoardReso(String value) {
        this.examOmnibusBoardReso = value;
    }

    /**
     * Gets the value of the examcifCreatedDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMUIDCreatedDt() {
        return examcifCreatedDt;
    }

    /**
     * Sets the value of the examcifCreatedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMUIDCreatedDt(LocalDate value) {
        this.examcifCreatedDt = value;
    }

    /**
     * Gets the value of the examFormattedShortNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMFormattedShortNm() {
        return examFormattedShortNm;
    }

    /**
     * Sets the value of the examFormattedShortNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMFormattedShortNm(String value) {
        this.examFormattedShortNm = value;
    }

    /**
     * Gets the value of the examStaySince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMStaySince() {
        return examStaySince;
    }

    /**
     * Sets the value of the examStaySince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMStaySince(LocalDate value) {
        this.examStaySince = value;
    }

    /**
     * Gets the value of the examSystemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSystemID() {
        return examSystemID;
    }

    /**
     * Sets the value of the examSystemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSystemID(String value) {
        this.examSystemID = value;
    }

    /**
     * Gets the value of the examAcctOpenDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMAcctOpenDt() {
        return examAcctOpenDt;
    }

    /**
     * Sets the value of the examAcctOpenDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMAcctOpenDt(LocalDate value) {
        this.examAcctOpenDt = value;
    }

    /**
     * Gets the value of the examOfficerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOfficerName() {
        return examOfficerName;
    }

    /**
     * Sets the value of the examOfficerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOfficerName(String value) {
        this.examOfficerName = value;
    }

    /**
     * Gets the value of the examCreationDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMCreationDt() {
        return examCreationDt;
    }

    /**
     * Sets the value of the examCreationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCreationDt(LocalDate value) {
        this.examCreationDt = value;
    }

    /**
     * Gets the value of the examListed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMListed() {
        return examListed;
    }

    /**
     * Sets the value of the examListed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMListed(String value) {
        this.examListed = value;
    }

    /**
     * Gets the value of the examOtherRelNameRelshp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOtherRelNameRelshp() {
        return examOtherRelNameRelshp;
    }

    /**
     * Sets the value of the examOtherRelNameRelshp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOtherRelNameRelshp(String value) {
        this.examOtherRelNameRelshp = value;
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
     * Gets the value of the examSecondaryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSecondaryName() {
        return examSecondaryName;
    }

    /**
     * Sets the value of the examSecondaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSecondaryName(String value) {
        this.examSecondaryName = value;
    }

    /**
     * Gets the value of the examTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMTitle() {
        return examTitle;
    }

    /**
     * Sets the value of the examTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMTitle(String value) {
        this.examTitle = value;
    }

    /**
     * Gets the value of the examGlobalCustInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMGlobalCustInd() {
        return examGlobalCustInd;
    }

    /**
     * Sets the value of the examGlobalCustInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMGlobalCustInd(String value) {
        this.examGlobalCustInd = value;
    }

    /**
     * Gets the value of the examCountryUIDNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCountryUIDNo() {
        return examCountryUIDNo;
    }

    /**
     * Sets the value of the examCountryUIDNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCountryUIDNo(String value) {
        this.examCountryUIDNo = value;
    }

    /**
     * Gets the value of the examTitleAftrName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMTitleAftrName() {
        return examTitleAftrName;
    }

    /**
     * Sets the value of the examTitleAftrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMTitleAftrName(String value) {
        this.examTitleAftrName = value;
    }

    /**
     * Gets the value of the examCdpNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCdpNumber() {
        return examCdpNumber;
    }

    /**
     * Sets the value of the examCdpNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCdpNumber(String value) {
        this.examCdpNumber = value;
    }

    /**
     * Gets the value of the examBankCmpCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBankCmpCd() {
        return examBankCmpCd;
    }

    /**
     * Sets the value of the examBankCmpCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBankCmpCd(String value) {
        this.examBankCmpCd = value;
    }

    /**
     * Gets the value of the examBankEmpDptCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBankEmpDptCd() {
        return examBankEmpDptCd;
    }

    /**
     * Sets the value of the examBankEmpDptCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBankEmpDptCd(String value) {
        this.examBankEmpDptCd = value;
    }

    /**
     * Gets the value of the examCpfNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCpfNumber() {
        return examCpfNumber;
    }

    /**
     * Sets the value of the examCpfNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCpfNumber(String value) {
        this.examCpfNumber = value;
    }

    /**
     * Gets the value of the examCrRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCrRating() {
        return examCrRating;
    }

    /**
     * Sets the value of the examCrRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCrRating(String value) {
        this.examCrRating = value;
    }

    /**
     * Gets the value of the examIsMoreBlackList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIsMoreBlackList() {
        return examIsMoreBlackList;
    }

    /**
     * Sets the value of the examIsMoreBlackList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIsMoreBlackList(String value) {
        this.examIsMoreBlackList = value;
    }

    /**
     * Gets the value of the examEmployeeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMEmployeeCode() {
        return examEmployeeCode;
    }

    /**
     * Sets the value of the examEmployeeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEmployeeCode(String value) {
        this.examEmployeeCode = value;
    }

    /**
     * Gets the value of the examInSuffAddrInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMInSuffAddrInd() {
        return examInSuffAddrInd;
    }

    /**
     * Sets the value of the examInSuffAddrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMInSuffAddrInd(String value) {
        this.examInSuffAddrInd = value;
    }

    /**
     * Gets the value of the examSecondIndCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSecondIndCode() {
        return examSecondIndCode;
    }

    /**
     * Sets the value of the examSecondIndCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSecondIndCode(String value) {
        this.examSecondIndCode = value;
    }

    /**
     * Gets the value of the examTerIndCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMTerIndCode() {
        return examTerIndCode;
    }

    /**
     * Sets the value of the examTerIndCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMTerIndCode(String value) {
        this.examTerIndCode = value;
    }

    /**
     * Gets the value of the examCountryOfSecExpo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCountryOfSecExpo() {
        return examCountryOfSecExpo;
    }

    /**
     * Sets the value of the examCountryOfSecExpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCountryOfSecExpo(String value) {
        this.examCountryOfSecExpo = value;
    }

    /**
     * Gets the value of the examDataEnrich property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMDataEnrich() {
        return examDataEnrich;
    }

    /**
     * Sets the value of the examDataEnrich property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMDataEnrich(String value) {
        this.examDataEnrich = value;
    }

    /**
     * Gets the value of the examInfoDisclosure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMInfoDisclosure() {
        return examInfoDisclosure;
    }

    /**
     * Sets the value of the examInfoDisclosure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMInfoDisclosure(String value) {
        this.examInfoDisclosure = value;
    }

    /**
     * Gets the value of the examSystemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSystemCode() {
        return examSystemCode;
    }

    /**
     * Sets the value of the examSystemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSystemCode(String value) {
        this.examSystemCode = value;
    }

    /**
     * Gets the value of the examCustomerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCustomerType() {
        return examCustomerType;
    }

    /**
     * Sets the value of the examCustomerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCustomerType(String value) {
        this.examCustomerType = value;
    }

    /**
     * Gets the value of the examMailingAddressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMailingAddressFlag() {
        return examMailingAddressFlag;
    }

    /**
     * Sets the value of the examMailingAddressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMailingAddressFlag(String value) {
        this.examMailingAddressFlag = value;
    }

    /**
     * Gets the value of the examCustMnemonicCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCustMnemonicCode() {
        return examCustMnemonicCode;
    }

    /**
     * Sets the value of the examCustMnemonicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCustMnemonicCode(String value) {
        this.examCustMnemonicCode = value;
    }

    /**
     * Gets the value of the examColorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMColorCode() {
        return examColorCode;
    }

    /**
     * Sets the value of the examColorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMColorCode(String value) {
        this.examColorCode = value;
    }

    /**
     * Gets the value of the examPhotoFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPhotoFileName() {
        return examPhotoFileName;
    }

    /**
     * Sets the value of the examPhotoFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPhotoFileName(String value) {
        this.examPhotoFileName = value;
    }

    /**
     * Gets the value of the examShareHolderPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMShareHolderPercentage() {
        return examShareHolderPercentage;
    }

    /**
     * Sets the value of the examShareHolderPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMShareHolderPercentage(BigDecimal value) {
        this.examShareHolderPercentage = value;
    }

    /**
     * Gets the value of the examOfficerName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOfficerName2() {
        return examOfficerName2;
    }

    /**
     * Sets the value of the examOfficerName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOfficerName2(String value) {
        this.examOfficerName2 = value;
    }

    /**
     * Gets the value of the examMsgInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMsgInd() {
        return examMsgInd;
    }

    /**
     * Sets the value of the examMsgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMsgInd(String value) {
        this.examMsgInd = value;
    }

    /**
     * Gets the value of the examSecondaryCustSegmentDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSecondaryCustSegmentDesc() {
        return examSecondaryCustSegmentDesc;
    }

    /**
     * Sets the value of the examSecondaryCustSegmentDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSecondaryCustSegmentDesc(String value) {
        this.examSecondaryCustSegmentDesc = value;
    }

    /**
     * Gets the value of the examTierDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMTierDesc() {
        return examTierDesc;
    }

    /**
     * Sets the value of the examTierDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMTierDesc(String value) {
        this.examTierDesc = value;
    }

    /**
     * Gets the value of the examFatcaStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMFatcaStatus() {
        return examFatcaStatus;
    }

    /**
     * Sets the value of the examFatcaStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMFatcaStatus(String value) {
        this.examFatcaStatus = value;
    }

    /**
     * Gets the value of the examEntryTierType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMEntryTierType() {
        return examEntryTierType;
    }

    /**
     * Sets the value of the examEntryTierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEntryTierType(String value) {
        this.examEntryTierType = value;
    }

    /**
     * Gets the value of the examEntryTierDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMEntryTierDesc() {
        return examEntryTierDesc;
    }

    /**
     * Sets the value of the examEntryTierDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEntryTierDesc(String value) {
        this.examEntryTierDesc = value;
    }

    /**
     * Gets the value of the examTierType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMTierType() {
        return examTierType;
    }

    /**
     * Sets the value of the examTierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMTierType(String value) {
        this.examTierType = value;
    }

    /**
     * Gets the value of the examMemberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMemberId() {
        return examMemberId;
    }

    /**
     * Sets the value of the examMemberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMemberId(String value) {
        this.examMemberId = value;
    }

    /**
     * Gets the value of the examPreferredName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPreferredName() {
        return examPreferredName;
    }

    /**
     * Sets the value of the examPreferredName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPreferredName(String value) {
        this.examPreferredName = value;
    }

    /**
     * Gets the value of the exambnmAssignedId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBNMAssignedId() {
        return exambnmAssignedId;
    }

    /**
     * Sets the value of the exambnmAssignedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBNMAssignedId(String value) {
        this.exambnmAssignedId = value;
    }

    /**
     * Gets the value of the examIndustrySector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIndustrySector() {
        return examIndustrySector;
    }

    /**
     * Sets the value of the examIndustrySector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIndustrySector(String value) {
        this.examIndustrySector = value;
    }

    /**
     * Gets the value of the examEmploymentSector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMEmploymentSector() {
        return examEmploymentSector;
    }

    /**
     * Sets the value of the examEmploymentSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEmploymentSector(String value) {
        this.examEmploymentSector = value;
    }

    /**
     * Gets the value of the examNetIncome property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMNetIncome() {
        return examNetIncome;
    }

    /**
     * Sets the value of the examNetIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMNetIncome(BigDecimal value) {
        this.examNetIncome = value;
    }

    /**
     * Gets the value of the examJustifyCatDOB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMJustifyCatDOB() {
        return examJustifyCatDOB;
    }

    /**
     * Sets the value of the examJustifyCatDOB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMJustifyCatDOB(String value) {
        this.examJustifyCatDOB = value;
    }

    /**
     * Gets the value of the examJustifyRsnDOB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMJustifyRsnDOB() {
        return examJustifyRsnDOB;
    }

    /**
     * Sets the value of the examJustifyRsnDOB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMJustifyRsnDOB(String value) {
        this.examJustifyRsnDOB = value;
    }

    /**
     * Gets the value of the examJustifyCatCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMJustifyCatCountry() {
        return examJustifyCatCountry;
    }

    /**
     * Sets the value of the examJustifyCatCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMJustifyCatCountry(String value) {
        this.examJustifyCatCountry = value;
    }

    /**
     * Gets the value of the examJustifyRsnCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMJustifyRsnCountry() {
        return examJustifyRsnCountry;
    }

    /**
     * Sets the value of the examJustifyRsnCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMJustifyRsnCountry(String value) {
        this.examJustifyRsnCountry = value;
    }

    /**
     * Gets the value of the examJustifyCatGender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMJustifyCatGender() {
        return examJustifyCatGender;
    }

    /**
     * Sets the value of the examJustifyCatGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMJustifyCatGender(String value) {
        this.examJustifyCatGender = value;
    }

    /**
     * Gets the value of the examJustifyRsnGender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMJustifyRsnGender() {
        return examJustifyRsnGender;
    }

    /**
     * Sets the value of the examJustifyRsnGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMJustifyRsnGender(String value) {
        this.examJustifyRsnGender = value;
    }

    /**
     * Gets the value of the examJustifyCatResident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMJustifyCatResident() {
        return examJustifyCatResident;
    }

    /**
     * Sets the value of the examJustifyCatResident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMJustifyCatResident(String value) {
        this.examJustifyCatResident = value;
    }

    /**
     * Gets the value of the examJustifyRsnResident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMJustifyRsnResident() {
        return examJustifyRsnResident;
    }

    /**
     * Sets the value of the examJustifyRsnResident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMJustifyRsnResident(String value) {
        this.examJustifyRsnResident = value;
    }

    /**
     * Gets the value of the examJustifyCatCorpStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMJustifyCatCorpStatus() {
        return examJustifyCatCorpStatus;
    }

    /**
     * Sets the value of the examJustifyCatCorpStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMJustifyCatCorpStatus(String value) {
        this.examJustifyCatCorpStatus = value;
    }

    /**
     * Gets the value of the examJustifyRsnCorpStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMJustifyRsnCorpStatus() {
        return examJustifyRsnCorpStatus;
    }

    /**
     * Sets the value of the examJustifyRsnCorpStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMJustifyRsnCorpStatus(String value) {
        this.examJustifyRsnCorpStatus = value;
    }

    /**
     * Gets the value of the examJustifyCatMSICCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMJustifyCatMSICCode() {
        return examJustifyCatMSICCode;
    }

    /**
     * Sets the value of the examJustifyCatMSICCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMJustifyCatMSICCode(String value) {
        this.examJustifyCatMSICCode = value;
    }

    /**
     * Gets the value of the examJustifyRsnMSICCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMJustifyRsnMSICCode() {
        return examJustifyRsnMSICCode;
    }

    /**
     * Sets the value of the examJustifyRsnMSICCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMJustifyRsnMSICCode(String value) {
        this.examJustifyRsnMSICCode = value;
    }

}
