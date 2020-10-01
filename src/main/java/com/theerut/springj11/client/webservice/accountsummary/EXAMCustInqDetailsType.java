
package com.theerut.springj11.client.webservice.accountsummary;

import com.theerut.springj11.client.webservice.common.EXAMGovIssueIdentType;
import com.theerut.springj11.utils.LocalDateAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for EXAM_CustInqDetails_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_CustInqDetails_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SeqNum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SourceOfAsst" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IdentSerialNum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Country" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_GovIssueIdentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Remarks" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_UserCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustIdChkDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ElectronicType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ElectronicCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AlertMsgInd" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AlertMsgLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DirectorName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustStatusCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CreditCardCompany" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CreditCardNo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CreditCardJoinYr" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BankorBrchHold" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TyeOfAcct" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AcctNo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CreditCardLimit" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AliasSeqNo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NameTypeCd" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustAlias" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Salutation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MoreAliasInd" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LifeStyInd" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_UserCd" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AddrTypeCd" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EmailAddrCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustPermId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_InqCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OrgnFormRefId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastRetCheck" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastSt_ChgDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TitType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AltFormtName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MailColBrch" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MailDelMd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PromoMailColBrch" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PromoMailDelMd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ProfitAnlz" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CostInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ProfitRevDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PreCrRating" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LstCrRtgDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CrRating" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PreKycRtg" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PreKycRevDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PreKycRl_ResnDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Cur_KycRlResCd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PreOblRskGrd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OblRskGrd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Last_Obg_RevDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_FedWHChgDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_StatWHCd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_StatWHChgDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BankCmpCd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BankEmpDptCd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Rel_StartDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IntroducerCmpny" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IntroducerDeptCd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IntroducerName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IsFamilyOwned" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BusinessSize" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PowertoArtNo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PowertoGuarNo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_FinanceYrEnd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AuthCapital" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PaidupCaptial" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PaidupCaptialDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CurSalTnOver" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EstAssetVal" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OtherInc" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OtherExp" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NoStaffMgrLvl" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NoStaffOtherLvl" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IsAddProof" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ComplexCompStruc" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IsPayTax" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IsCashIncome" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PoliticalRelationship" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IsDocProof" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ReturnedMailAssess" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IsNonProfitOrg" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EstAssetRange" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastMaintsrc" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CreatedUserId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CreatedDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CreatedTime" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CreatedSrc" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Addr5" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Addr6" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Addr7" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CountryOfExp" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SecurityVerfyCd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BenefitCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BenefitApplnDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CtyMjrShareHolder" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PercOfCapOwnMjHolder" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_YearOfRes" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NameOfRef" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IdNoOfRef" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MobilePhRef" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Pager" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EmployeeInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastMaitainWrkId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OriginationType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AcctMode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SystemID" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ValidApp" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_FoundPepLst" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OfficerName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IntroducerCodeUID" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Title" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PrimCustFrmtName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AlterIDNo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AlterIDType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AlterIDIssCtry" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OrgType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OwnerRelationshipCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EmploymentStartDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_StaffBen" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_HeadingCd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PoliticalExposed" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RevenueInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NoStaffExeLvl" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Cust_OrgcreDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustomerNumber" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IsLinkToGUID" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ProfitInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BlackListInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BlackListShtResn" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IsMoreBlackList" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DealInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IncomeRange" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CpfNumber" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CdpNumber" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_UserWorkstName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PrimIndCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SecondIndCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TerIndCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NoOfYr" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EmpoyeeStartYr" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EmployeeCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_JobDesgnCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_GraduationYr" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EductaionInst" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EductaionCrse" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EductaionCtry" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BlackLstReasonCd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BlackLstReasonDes" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MoreIdInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MoreLifeStlyInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ExistingCustFlag" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CountryOfSecExpo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AddrFormatCd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_InSuffAddrInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LendContrlUnit" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Prev_KycRlResCd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EmailAddrDesc" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ContactName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DeptName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_JobDesignation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastMaintTm" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastMaintUID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ProviderSystemCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EmailAddr" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustomerName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CentralBankCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CentralBankCode2" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CentralBankCode3" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CentralBankCode4" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CentralBankCode5" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PrimaryName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AlternateName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_UsPerson" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NonUsPerson" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TaxId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PriorStatus" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CreationSrc" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EmployerName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_KycRevDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AuthCapitalDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastMaintDt" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NameAliasInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_JobTitle" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RegistrationType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_HoldMailCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_HouseNo" maxOccurs="unbounded" minOccurs="2"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Unit" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Storey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Building_Name" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Street_Name" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}City" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PostalCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EAddresCodeType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EAddress" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ContactPerson" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RMCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BusinessSectorInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustSubCategory" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ShortName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Mas757_Ind" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Customer_RiskCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PoBox" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Hold_Code" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ExternalRatingSrc" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ExternalRatingCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ExternalRating_EffecDt" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ExternalRating_ExpiryDt" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_HandleOption" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Business_SegCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AcctOpenDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OtherNameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OtherName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RelationshipCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TaxId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PlaceOfBirth" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TitleAftrName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LoyaltyPrgStatus" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Membership_No" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MembershipEndDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MembershipAcceptStatus" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MembershipAcceptDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MembershipCd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MembershipApprovalCd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_InfoDiscosure1" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BankEmployeeIDNo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastMaintTmStamp" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BIIndustryCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SectorL1" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SectorL2" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_FatcaDetails" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MsgInd" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BusinessSector" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BusinessSubSector" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_CustInqDetails_Type", propOrder = {
    "examSeqNum",
    "examSourceOfAsst",
    "examIdentSerialNum",
    "country",
    "examGovIssueIdentType",
    "examRemarks",
    "examUserCode",
    "examCustIdChkDetail",
    "examElectronicType",
    "examElectronicCode",
    "examAlertMsgInd",
    "examAlertMsgLine",
    "examDirectorName",
    "custStatusCode",
    "examCreditCardCompany",
    "examCreditCardNo",
    "examCreditCardJoinYr",
    "examBankorBrchHold",
    "examTyeOfAcct",
    "examAcctNo",
    "examCreditCardLimit",
    "examAliasSeqNo",
    "examNameTypeCd",
    "examCustAlias",
    "examSalutation",
    "examMoreAliasInd",
    "examLifeStyInd",
    "examUserCd",
    "examAddrTypeCd",
    "examEmailAddrCode",
    "custPermId",
    "examInqCode",
    "examOrgnFormRefId",
    "examLastRetCheck",
    "examLastStChgDt",
    "examTitType",
    "examAltFormtName",
    "examMailColBrch",
    "examMailDelMd",
    "examPromoMailColBrch",
    "examPromoMailDelMd",
    "examProfitAnlz",
    "examCostInd",
    "examProfitRevDt",
    "examPreCrRating",
    "examLstCrRtgDt",
    "examCrRating",
    "examPreKycRtg",
    "examPreKycRevDt",
    "examPreKycRlResnDt",
    "examCurKycRlResCd",
    "examPreOblRskGrd",
    "examOblRskGrd",
    "examLastObgRevDt",
    "examFedWHChgDt",
    "examStatWHCd",
    "examStatWHChgDt",
    "examBankCmpCd",
    "examBankEmpDptCd",
    "examRelStartDt",
    "examIntroducerCmpny",
    "examIntroducerDeptCd",
    "examIntroducerName",
    "examIsFamilyOwned",
    "examBusinessSize",
    "examPowertoArtNo",
    "examPowertoGuarNo",
    "examFinanceYrEnd",
    "examAuthCapital",
    "examPaidupCaptial",
    "examPaidupCaptialDt",
    "examCurSalTnOver",
    "examEstAssetVal",
    "examOtherInc",
    "examOtherExp",
    "examNoStaffMgrLvl",
    "examNoStaffOtherLvl",
    "examIsAddProof",
    "examComplexCompStruc",
    "examIsPayTax",
    "examIsCashIncome",
    "examPoliticalRelationship",
    "examIsDocProof",
    "examReturnedMailAssess",
    "examIsNonProfitOrg",
    "examEstAssetRange",
    "examLastMaintsrc",
    "examCreatedUserId",
    "examCreatedDt",
    "examCreatedTime",
    "examCreatedSrc",
    "examAddr5",
    "examAddr6",
    "examAddr7",
    "examCountryOfExp",
    "examSecurityVerfyCd",
    "examBenefitCode",
    "examBenefitApplnDt",
    "examCtyMjrShareHolder",
    "examPercOfCapOwnMjHolder",
    "examYearOfRes",
    "examNameOfRef",
    "examIdNoOfRef",
    "examMobilePhRef",
    "examPager",
    "examEmployeeInd",
    "examLastMaitainWrkId",
    "examOriginationType",
    "examAcctMode",
    "examSystemID",
    "examValidApp",
    "examFoundPepLst",
    "examOfficerName",
    "examIntroducerCodeUID",
    "examTitle",
    "examPrimCustFrmtName",
    "examAlterIDNo",
    "examAlterIDType",
    "examAlterIDIssCtry",
    "examOrgType",
    "examOwnerRelationshipCode",
    "examEmploymentStartDt",
    "examStaffBen",
    "examHeadingCd",
    "examPoliticalExposed",
    "examRevenueInd",
    "examNoStaffExeLvl",
    "examCustOrgcreDt",
    "examCustomerNumber",
    "examIsLinkToGUID",
    "examProfitInd",
    "examBlackListInd",
    "examBlackListShtResn",
    "examIsMoreBlackList",
    "examDealInd",
    "examIncomeRange",
    "examCpfNumber",
    "examCdpNumber",
    "examUserWorkstName",
    "examPrimIndCode",
    "examSecondIndCode",
    "examTerIndCode",
    "examNoOfYr",
    "examEmpoyeeStartYr",
    "examEmployeeCode",
    "examJobDesgnCode",
    "examGraduationYr",
    "examEductaionInst",
    "examEductaionCrse",
    "examEductaionCtry",
    "examBlackLstReasonCd",
    "examBlackLstReasonDes",
    "examMoreIdInd",
    "examMoreLifeStlyInd",
    "examExistingCustFlag",
    "examCountryOfSecExpo",
    "examAddrFormatCd",
    "examInSuffAddrInd",
    "examLendContrlUnit",
    "examPrevKycRlResCd",
    "examEmailAddrDesc",
    "examContactName",
    "examDeptName",
    "examJobDesignation",
    "examLastMaintTm",
    "examLastMaintUID",
    "examProviderSystemCode",
    "emailAddr",
    "examCustomerName",
    "examCentralBankCode",
    "examCentralBankCode2",
    "examCentralBankCode3",
    "examCentralBankCode4",
    "examCentralBankCode5",
    "examPrimaryName",
    "examAlternateName",
    "examUsPerson",
    "examNonUsPerson",
    "taxId",
    "curCode",
    "examPriorStatus",
    "examCreationSrc",
    "examEmployerName",
    "examKycRevDt",
    "examAuthCapitalDt",
    "examLastMaintDt",
    "examNameAliasInd",
    "examJobTitle",
    "examRegistrationType",
    "examHoldMailCode",
    "examHouseNo",
    "examUnit",
    "examStorey",
    "examBuildingName",
    "examStreetName",
    "city",
    "postalCode",
    "exameAddresCodeType",
    "exameAddress",
    "examContactPerson",
    "examrmCode",
    "examBusinessSectorInd",
    "examCustSubCategory",
    "examShortName",
    "examMas757Ind",
    "examCustomerRiskCode",
    "examPoBox",
    "examHoldCode",
    "examExternalRatingSrc",
    "examExternalRatingCode",
    "examExternalRatingEffecDt",
    "examExternalRatingExpiryDt",
    "examHandleOption",
    "examBusinessSegCode",
    "examAcctOpenDt",
    "examOtherNameType",
    "examOtherName",
    "examRelationshipCode",
    "examTaxId",
    "examPlaceOfBirth",
    "examTitleAftrName",
    "examLoyaltyPrgStatus",
    "examMembershipNo",
    "examMembershipEndDt",
    "examMembershipAcceptStatus",
    "examMembershipAcceptDt",
    "examMembershipCd",
    "examMembershipApprovalCd",
    "examInfoDiscosure1",
    "examBankEmployeeIDNo",
    "examLastMaintTmStamp",
    "exambiIndustryCode",
    "examSectorL1",
    "examSectorL2",
    "examFatcaDetails",
    "examMsgInd",
    "examBusinessSector",
    "examBusinessSubSector"
})
public class EXAMCustInqDetailsType {

    @XmlElement(name = "EXAM_SeqNum", type = Long.class)
    protected List<Long> examSeqNum;
    @XmlElement(name = "EXAM_SourceOfAsst")
    protected List<String> examSourceOfAsst;
    @XmlElement(name = "EXAM_IdentSerialNum")
    protected List<String> examIdentSerialNum;
    @XmlElement(name = "Country")
    protected List<String> country;
    @XmlElement(name = "EXAM_GovIssueIdentType")
    protected List<String> examGovIssueIdentType;
    @XmlElement(name = "EXAM_Remarks")
    protected List<String> examRemarks;
    @XmlElement(name = "EXAM_UserCode")
    protected List<String> examUserCode;
    @XmlElement(name = "EXAM_CustIdChkDetail")
    protected List<EXAMCustIdChkDetailType> examCustIdChkDetail;
    @XmlElement(name = "EXAM_ElectronicType")
    protected List<String> examElectronicType;
    @XmlElement(name = "EXAM_ElectronicCode")
    protected List<String> examElectronicCode;
    @XmlElement(name = "EXAM_AlertMsgInd")
    protected List<String> examAlertMsgInd;
    @XmlElement(name = "EXAM_AlertMsgLine")
    protected List<String> examAlertMsgLine;
    @XmlElement(name = "EXAM_DirectorName")
    protected List<String> examDirectorName;
    @XmlElement(name = "CustStatusCode")
    protected List<String> custStatusCode;
    @XmlElement(name = "EXAM_CreditCardCompany")
    protected List<String> examCreditCardCompany;
    @XmlElement(name = "EXAM_CreditCardNo")
    protected List<String> examCreditCardNo;
    @XmlElement(name = "EXAM_CreditCardJoinYr")
    protected List<String> examCreditCardJoinYr;
    @XmlElement(name = "EXAM_BankorBrchHold")
    protected List<String> examBankorBrchHold;
    @XmlElement(name = "EXAM_TyeOfAcct")
    protected List<String> examTyeOfAcct;
    @XmlElement(name = "EXAM_AcctNo")
    protected List<String> examAcctNo;
    @XmlElement(name = "EXAM_CreditCardLimit")
    protected List<String> examCreditCardLimit;
    @XmlElement(name = "EXAM_AliasSeqNo")
    protected List<String> examAliasSeqNo;
    @XmlElement(name = "EXAM_NameTypeCd")
    protected List<String> examNameTypeCd;
    @XmlElement(name = "EXAM_CustAlias")
    protected List<String> examCustAlias;
    @XmlElement(name = "EXAM_Salutation")
    protected List<String> examSalutation;
    @XmlElement(name = "EXAM_MoreAliasInd")
    protected List<String> examMoreAliasInd;
    @XmlElement(name = "EXAM_LifeStyInd")
    protected List<String> examLifeStyInd;
    @XmlElement(name = "EXAM_UserCd")
    protected List<String> examUserCd;
    @XmlElement(name = "EXAM_AddrTypeCd")
    protected List<String> examAddrTypeCd;
    @XmlElement(name = "EXAM_EmailAddrCode")
    protected List<String> examEmailAddrCode;
    @XmlElement(name = "CustPermId")
    protected String custPermId;
    @XmlElement(name = "EXAM_InqCode")
    protected String examInqCode;
    @XmlElement(name = "EXAM_OrgnFormRefId")
    protected Long examOrgnFormRefId;
    @XmlElement(name = "EXAM_LastRetCheck")
    protected String examLastRetCheck;
    @XmlElement(name = "EXAM_LastSt_ChgDt")
    protected String examLastStChgDt;
    @XmlElement(name = "EXAM_TitType")
    protected String examTitType;
    @XmlElement(name = "EXAM_AltFormtName")
    protected String examAltFormtName;
    @XmlElement(name = "EXAM_MailColBrch")
    protected String examMailColBrch;
    @XmlElement(name = "EXAM_MailDelMd")
    protected String examMailDelMd;
    @XmlElement(name = "EXAM_PromoMailColBrch")
    protected String examPromoMailColBrch;
    @XmlElement(name = "EXAM_PromoMailDelMd")
    protected String examPromoMailDelMd;
    @XmlElement(name = "EXAM_ProfitAnlz")
    protected String examProfitAnlz;
    @XmlElement(name = "EXAM_CostInd")
    protected String examCostInd;
    @XmlElement(name = "EXAM_ProfitRevDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examProfitRevDt;
    @XmlElement(name = "EXAM_PreCrRating")
    protected String examPreCrRating;
    @XmlElement(name = "EXAM_LstCrRtgDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examLstCrRtgDt;
    @XmlElement(name = "EXAM_CrRating")
    protected String examCrRating;
    @XmlElement(name = "EXAM_PreKycRtg")
    protected String examPreKycRtg;
    @XmlElement(name = "EXAM_PreKycRevDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examPreKycRevDt;
    @XmlElement(name = "EXAM_PreKycRl_ResnDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examPreKycRlResnDt;
    @XmlElement(name = "EXAM_Cur_KycRlResCd")
    protected String examCurKycRlResCd;
    @XmlElement(name = "EXAM_PreOblRskGrd")
    protected String examPreOblRskGrd;
    @XmlElement(name = "EXAM_OblRskGrd")
    protected String examOblRskGrd;
    @XmlElement(name = "EXAM_Last_Obg_RevDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examLastObgRevDt;
    @XmlElement(name = "EXAM_FedWHChgDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examFedWHChgDt;
    @XmlElement(name = "EXAM_StatWHCd")
    protected String examStatWHCd;
    @XmlElement(name = "EXAM_StatWHChgDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examStatWHChgDt;
    @XmlElement(name = "EXAM_BankCmpCd")
    protected String examBankCmpCd;
    @XmlElement(name = "EXAM_BankEmpDptCd")
    protected String examBankEmpDptCd;
    @XmlElement(name = "EXAM_Rel_StartDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examRelStartDt;
    @XmlElement(name = "EXAM_IntroducerCmpny")
    protected String examIntroducerCmpny;
    @XmlElement(name = "EXAM_IntroducerDeptCd")
    protected String examIntroducerDeptCd;
    @XmlElement(name = "EXAM_IntroducerName")
    protected String examIntroducerName;
    @XmlElement(name = "EXAM_IsFamilyOwned")
    protected String examIsFamilyOwned;
    @XmlElement(name = "EXAM_BusinessSize")
    protected String examBusinessSize;
    @XmlElement(name = "EXAM_PowertoArtNo")
    protected String examPowertoArtNo;
    @XmlElement(name = "EXAM_PowertoGuarNo")
    protected String examPowertoGuarNo;
    @XmlElement(name = "EXAM_FinanceYrEnd")
    protected String examFinanceYrEnd;
    @XmlElement(name = "EXAM_AuthCapital")
    protected String examAuthCapital;
    @XmlElement(name = "EXAM_PaidupCaptial")
    protected String examPaidupCaptial;
    @XmlElement(name = "EXAM_PaidupCaptialDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examPaidupCaptialDt;
    @XmlElement(name = "EXAM_CurSalTnOver")
    protected String examCurSalTnOver;
    @XmlElement(name = "EXAM_EstAssetVal")
    protected String examEstAssetVal;
    @XmlElement(name = "EXAM_OtherInc")
    protected String examOtherInc;
    @XmlElement(name = "EXAM_OtherExp")
    protected String examOtherExp;
    @XmlElement(name = "EXAM_NoStaffMgrLvl")
    protected String examNoStaffMgrLvl;
    @XmlElement(name = "EXAM_NoStaffOtherLvl")
    protected String examNoStaffOtherLvl;
    @XmlElement(name = "EXAM_IsAddProof")
    protected String examIsAddProof;
    @XmlElement(name = "EXAM_ComplexCompStruc")
    protected String examComplexCompStruc;
    @XmlElement(name = "EXAM_IsPayTax")
    protected String examIsPayTax;
    @XmlElement(name = "EXAM_IsCashIncome")
    protected String examIsCashIncome;
    @XmlElement(name = "EXAM_PoliticalRelationship")
    protected String examPoliticalRelationship;
    @XmlElement(name = "EXAM_IsDocProof")
    protected String examIsDocProof;
    @XmlElement(name = "EXAM_ReturnedMailAssess")
    protected String examReturnedMailAssess;
    @XmlElement(name = "EXAM_IsNonProfitOrg")
    protected String examIsNonProfitOrg;
    @XmlElement(name = "EXAM_EstAssetRange")
    protected String examEstAssetRange;
    @XmlElement(name = "EXAM_LastMaintsrc")
    protected String examLastMaintsrc;
    @XmlElement(name = "EXAM_CreatedUserId")
    protected String examCreatedUserId;
    @XmlElement(name = "EXAM_CreatedDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examCreatedDt;
    @XmlElement(name = "EXAM_CreatedTime")
    protected String examCreatedTime;
    @XmlElement(name = "EXAM_CreatedSrc")
    protected String examCreatedSrc;
    @XmlElement(name = "EXAM_Addr5")
    protected String examAddr5;
    @XmlElement(name = "EXAM_Addr6")
    protected String examAddr6;
    @XmlElement(name = "EXAM_Addr7")
    protected String examAddr7;
    @XmlElement(name = "EXAM_CountryOfExp")
    protected String examCountryOfExp;
    @XmlElement(name = "EXAM_SecurityVerfyCd")
    protected String examSecurityVerfyCd;
    @XmlElement(name = "EXAM_BenefitCode")
    protected String examBenefitCode;
    @XmlElement(name = "EXAM_BenefitApplnDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examBenefitApplnDt;
    @XmlElement(name = "EXAM_CtyMjrShareHolder")
    protected String examCtyMjrShareHolder;
    @XmlElement(name = "EXAM_PercOfCapOwnMjHolder")
    protected String examPercOfCapOwnMjHolder;
    @XmlElement(name = "EXAM_YearOfRes")
    protected String examYearOfRes;
    @XmlElement(name = "EXAM_NameOfRef")
    protected String examNameOfRef;
    @XmlElement(name = "EXAM_IdNoOfRef")
    protected String examIdNoOfRef;
    @XmlElement(name = "EXAM_MobilePhRef")
    protected String examMobilePhRef;
    @XmlElement(name = "EXAM_Pager")
    protected String examPager;
    @XmlElement(name = "EXAM_EmployeeInd")
    protected String examEmployeeInd;
    @XmlElement(name = "EXAM_LastMaitainWrkId")
    protected String examLastMaitainWrkId;
    @XmlElement(name = "EXAM_OriginationType")
    protected String examOriginationType;
    @XmlElement(name = "EXAM_AcctMode")
    protected String examAcctMode;
    @XmlElement(name = "EXAM_SystemID")
    protected String examSystemID;
    @XmlElement(name = "EXAM_ValidApp")
    protected String examValidApp;
    @XmlElement(name = "EXAM_FoundPepLst")
    protected String examFoundPepLst;
    @XmlElement(name = "EXAM_OfficerName")
    protected String examOfficerName;
    @XmlElement(name = "EXAM_IntroducerCodeUID")
    protected String examIntroducerCodeUID;
    @XmlElement(name = "EXAM_Title")
    protected String examTitle;
    @XmlElement(name = "EXAM_PrimCustFrmtName")
    protected String examPrimCustFrmtName;
    @XmlElement(name = "EXAM_AlterIDNo")
    protected String examAlterIDNo;
    @XmlElement(name = "EXAM_AlterIDType")
    protected String examAlterIDType;
    @XmlElement(name = "EXAM_AlterIDIssCtry")
    protected String examAlterIDIssCtry;
    @XmlElement(name = "EXAM_OrgType")
    protected String examOrgType;
    @XmlElement(name = "EXAM_OwnerRelationshipCode")
    protected String examOwnerRelationshipCode;
    @XmlElement(name = "EXAM_EmploymentStartDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examEmploymentStartDt;
    @XmlElement(name = "EXAM_StaffBen")
    protected String examStaffBen;
    @XmlElement(name = "EXAM_HeadingCd")
    protected String examHeadingCd;
    @XmlElement(name = "EXAM_PoliticalExposed")
    protected String examPoliticalExposed;
    @XmlElement(name = "EXAM_RevenueInd")
    protected String examRevenueInd;
    @XmlElement(name = "EXAM_NoStaffExeLvl")
    protected String examNoStaffExeLvl;
    @XmlElement(name = "EXAM_Cust_OrgcreDt")
    protected String examCustOrgcreDt;
    @XmlElement(name = "EXAM_CustomerNumber")
    protected String examCustomerNumber;
    @XmlElement(name = "EXAM_IsLinkToGUID")
    protected String examIsLinkToGUID;
    @XmlElement(name = "EXAM_ProfitInd")
    protected String examProfitInd;
    @XmlElement(name = "EXAM_BlackListInd")
    protected String examBlackListInd;
    @XmlElement(name = "EXAM_BlackListShtResn")
    protected String examBlackListShtResn;
    @XmlElement(name = "EXAM_IsMoreBlackList")
    protected String examIsMoreBlackList;
    @XmlElement(name = "EXAM_DealInd")
    protected String examDealInd;
    @XmlElement(name = "EXAM_IncomeRange")
    protected String examIncomeRange;
    @XmlElement(name = "EXAM_CpfNumber")
    protected String examCpfNumber;
    @XmlElement(name = "EXAM_CdpNumber")
    protected String examCdpNumber;
    @XmlElement(name = "EXAM_UserWorkstName")
    protected String examUserWorkstName;
    @XmlElement(name = "EXAM_PrimIndCode")
    protected String examPrimIndCode;
    @XmlElement(name = "EXAM_SecondIndCode")
    protected String examSecondIndCode;
    @XmlElement(name = "EXAM_TerIndCode")
    protected String examTerIndCode;
    @XmlElement(name = "EXAM_NoOfYr")
    protected String examNoOfYr;
    @XmlElement(name = "EXAM_EmpoyeeStartYr")
    protected String examEmpoyeeStartYr;
    @XmlElement(name = "EXAM_EmployeeCode")
    protected String examEmployeeCode;
    @XmlElement(name = "EXAM_JobDesgnCode")
    protected String examJobDesgnCode;
    @XmlElement(name = "EXAM_GraduationYr")
    protected String examGraduationYr;
    @XmlElement(name = "EXAM_EductaionInst")
    protected String examEductaionInst;
    @XmlElement(name = "EXAM_EductaionCrse")
    protected String examEductaionCrse;
    @XmlElement(name = "EXAM_EductaionCtry")
    protected String examEductaionCtry;
    @XmlElement(name = "EXAM_BlackLstReasonCd")
    protected String examBlackLstReasonCd;
    @XmlElement(name = "EXAM_BlackLstReasonDes")
    protected String examBlackLstReasonDes;
    @XmlElement(name = "EXAM_MoreIdInd")
    protected String examMoreIdInd;
    @XmlElement(name = "EXAM_MoreLifeStlyInd")
    protected String examMoreLifeStlyInd;
    @XmlElement(name = "EXAM_ExistingCustFlag")
    protected String examExistingCustFlag;
    @XmlElement(name = "EXAM_CountryOfSecExpo")
    protected String examCountryOfSecExpo;
    @XmlElement(name = "EXAM_AddrFormatCd")
    protected String examAddrFormatCd;
    @XmlElement(name = "EXAM_InSuffAddrInd")
    protected String examInSuffAddrInd;
    @XmlElement(name = "EXAM_LendContrlUnit")
    protected String examLendContrlUnit;
    @XmlElement(name = "EXAM_Prev_KycRlResCd")
    protected String examPrevKycRlResCd;
    @XmlElement(name = "EXAM_EmailAddrDesc")
    protected List<String> examEmailAddrDesc;
    @XmlElement(name = "EXAM_ContactName")
    protected List<String> examContactName;
    @XmlElement(name = "EXAM_DeptName")
    protected List<String> examDeptName;
    @XmlElement(name = "EXAM_JobDesignation")
    protected List<String> examJobDesignation;
    @XmlElement(name = "EXAM_LastMaintTm")
    @XmlSchemaType(name = "time")
    protected List<XMLGregorianCalendar> examLastMaintTm;
    @XmlElement(name = "EXAM_LastMaintUID")
    protected List<String> examLastMaintUID;
    @XmlElement(name = "EXAM_ProviderSystemCode")
    protected String examProviderSystemCode;
    @XmlElement(name = "EmailAddr")
    protected List<String> emailAddr;
    @XmlElement(name = "EXAM_CustomerName")
    protected List<String> examCustomerName;
    @XmlElement(name = "EXAM_CentralBankCode")
    protected String examCentralBankCode;
    @XmlElement(name = "EXAM_CentralBankCode2")
    protected String examCentralBankCode2;
    @XmlElement(name = "EXAM_CentralBankCode3")
    protected String examCentralBankCode3;
    @XmlElement(name = "EXAM_CentralBankCode4")
    protected String examCentralBankCode4;
    @XmlElement(name = "EXAM_CentralBankCode5")
    protected String examCentralBankCode5;
    @XmlElement(name = "EXAM_PrimaryName")
    protected List<String> examPrimaryName;
    @XmlElement(name = "EXAM_AlternateName")
    protected List<String> examAlternateName;
    @XmlElement(name = "EXAM_UsPerson")
    protected String examUsPerson;
    @XmlElement(name = "EXAM_NonUsPerson")
    protected String examNonUsPerson;
    @XmlElement(name = "TaxId")
    protected String taxId;
    @XmlElement(name = "CurCode")
    protected String curCode;
    @XmlElement(name = "EXAM_PriorStatus")
    protected String examPriorStatus;
    @XmlElement(name = "EXAM_CreationSrc")
    protected String examCreationSrc;
    @XmlElement(name = "EXAM_EmployerName")
    protected String examEmployerName;
    @XmlElement(name = "EXAM_KycRevDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examKycRevDt;
    @XmlElement(name = "EXAM_AuthCapitalDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examAuthCapitalDt;
    @XmlElement(name = "EXAM_LastMaintDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected List<LocalDate> examLastMaintDt;
    @XmlElement(name = "EXAM_NameAliasInd")
    protected String examNameAliasInd;
    @XmlElement(name = "EXAM_JobTitle")
    protected String examJobTitle;
    @XmlElement(name = "EXAM_RegistrationType")
    protected String examRegistrationType;
    @XmlElement(name = "EXAM_HoldMailCode")
    protected String examHoldMailCode;
    @XmlElement(name = "EXAM_HouseNo", required = true)
    protected List<String> examHouseNo;
    @XmlElement(name = "EXAM_Unit")
    protected String examUnit;
    @XmlElement(name = "EXAM_Storey")
    protected List<String> examStorey;
    @XmlElement(name = "EXAM_Building_Name")
    protected List<String> examBuildingName;
    @XmlElement(name = "EXAM_Street_Name")
    protected List<String> examStreetName;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "EXAM_EAddresCodeType")
    protected String exameAddresCodeType;
    @XmlElement(name = "EXAM_EAddress")
    protected String exameAddress;
    @XmlElement(name = "EXAM_ContactPerson")
    protected String examContactPerson;
    @XmlElement(name = "EXAM_RMCode")
    protected String examrmCode;
    @XmlElement(name = "EXAM_BusinessSectorInd")
    protected String examBusinessSectorInd;
    @XmlElement(name = "EXAM_CustSubCategory")
    protected String examCustSubCategory;
    @XmlElement(name = "EXAM_ShortName")
    protected String examShortName;
    @XmlElement(name = "EXAM_Mas757_Ind")
    protected String examMas757Ind;
    @XmlElement(name = "EXAM_Customer_RiskCode")
    protected String examCustomerRiskCode;
    @XmlElement(name = "EXAM_PoBox")
    protected List<String> examPoBox;
    @XmlElement(name = "EXAM_Hold_Code")
    protected String examHoldCode;
    @XmlElement(name = "EXAM_ExternalRatingSrc")
    protected List<String> examExternalRatingSrc;
    @XmlElement(name = "EXAM_ExternalRatingCode")
    protected List<String> examExternalRatingCode;
    @XmlElement(name = "EXAM_ExternalRating_EffecDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected List<LocalDate> examExternalRatingEffecDt;
    @XmlElement(name = "EXAM_ExternalRating_ExpiryDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected List<LocalDate> examExternalRatingExpiryDt;
    @XmlElement(name = "EXAM_HandleOption")
    protected String examHandleOption;
    @XmlElement(name = "EXAM_Business_SegCode")
    protected String examBusinessSegCode;
    @XmlElement(name = "EXAM_AcctOpenDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examAcctOpenDt;
    @XmlElement(name = "EXAM_OtherNameType")
    protected List<String> examOtherNameType;
    @XmlElement(name = "EXAM_OtherName")
    protected List<String> examOtherName;
    @XmlElement(name = "EXAM_RelationshipCode")
    protected String examRelationshipCode;
    @XmlElement(name = "EXAM_TaxId")
    protected EXAMGovIssueIdentType examTaxId;
    @XmlElement(name = "EXAM_PlaceOfBirth")
    protected String examPlaceOfBirth;
    @XmlElement(name = "EXAM_TitleAftrName")
    protected String examTitleAftrName;
    @XmlElement(name = "EXAM_LoyaltyPrgStatus")
    protected String examLoyaltyPrgStatus;
    @XmlElement(name = "EXAM_Membership_No")
    protected String examMembershipNo;
    @XmlElement(name = "EXAM_MembershipEndDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examMembershipEndDt;
    @XmlElement(name = "EXAM_MembershipAcceptStatus")
    protected String examMembershipAcceptStatus;
    @XmlElement(name = "EXAM_MembershipAcceptDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examMembershipAcceptDt;
    @XmlElement(name = "EXAM_MembershipCd")
    protected String examMembershipCd;
    @XmlElement(name = "EXAM_MembershipApprovalCd")
    protected String examMembershipApprovalCd;
    @XmlElement(name = "EXAM_InfoDiscosure1")
    protected String examInfoDiscosure1;
    @XmlElement(name = "EXAM_BankEmployeeIDNo")
    protected String examBankEmployeeIDNo;
    @XmlElement(name = "EXAM_LastMaintTmStamp")
    protected String examLastMaintTmStamp;
    @XmlElement(name = "EXAM_BIIndustryCode")
    protected String exambiIndustryCode;
    @XmlElement(name = "EXAM_SectorL1")
    protected String examSectorL1;
    @XmlElement(name = "EXAM_SectorL2")
    protected String examSectorL2;
    @XmlElement(name = "EXAM_FatcaDetails")
    protected EXAMFatcaDetailsType examFatcaDetails;
    @XmlElement(name = "EXAM_MsgInd")
    protected List<String> examMsgInd;
    @XmlElement(name = "EXAM_BusinessSector")
    protected String examBusinessSector;
    @XmlElement(name = "EXAM_BusinessSubSector")
    protected String examBusinessSubSector;

    /**
     * Gets the value of the examSeqNum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examSeqNum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMSeqNum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getEXAMSeqNum() {
        if (examSeqNum == null) {
            examSeqNum = new ArrayList<>();
        }
        return this.examSeqNum;
    }

    /**
     * Gets the value of the examSourceOfAsst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examSourceOfAsst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMSourceOfAsst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMSourceOfAsst() {
        if (examSourceOfAsst == null) {
            examSourceOfAsst = new ArrayList<>();
        }
        return this.examSourceOfAsst;
    }

    /**
     * Gets the value of the examIdentSerialNum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examIdentSerialNum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMIdentSerialNum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMIdentSerialNum() {
        if (examIdentSerialNum == null) {
            examIdentSerialNum = new ArrayList<>();
        }
        return this.examIdentSerialNum;
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

    /**
     * Gets the value of the examGovIssueIdentType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examGovIssueIdentType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMGovIssueIdentType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMGovIssueIdentType() {
        if (examGovIssueIdentType == null) {
            examGovIssueIdentType = new ArrayList<>();
        }
        return this.examGovIssueIdentType;
    }

    /**
     * Gets the value of the examRemarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examRemarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMRemarks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMRemarks() {
        if (examRemarks == null) {
            examRemarks = new ArrayList<>();
        }
        return this.examRemarks;
    }

    /**
     * Gets the value of the examUserCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examUserCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMUserCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMUserCode() {
        if (examUserCode == null) {
            examUserCode = new ArrayList<>();
        }
        return this.examUserCode;
    }

    /**
     * Gets the value of the examCustIdChkDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examCustIdChkDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMCustIdChkDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMCustIdChkDetailType }
     * 
     * 
     */
    public List<EXAMCustIdChkDetailType> getEXAMCustIdChkDetail() {
        if (examCustIdChkDetail == null) {
            examCustIdChkDetail = new ArrayList<>();
        }
        return this.examCustIdChkDetail;
    }

    /**
     * Gets the value of the examElectronicType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examElectronicType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMElectronicType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMElectronicType() {
        if (examElectronicType == null) {
            examElectronicType = new ArrayList<>();
        }
        return this.examElectronicType;
    }

    /**
     * Gets the value of the examElectronicCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examElectronicCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMElectronicCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMElectronicCode() {
        if (examElectronicCode == null) {
            examElectronicCode = new ArrayList<>();
        }
        return this.examElectronicCode;
    }

    /**
     * Gets the value of the examAlertMsgInd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examAlertMsgInd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMAlertMsgInd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMAlertMsgInd() {
        if (examAlertMsgInd == null) {
            examAlertMsgInd = new ArrayList<>();
        }
        return this.examAlertMsgInd;
    }

    /**
     * Gets the value of the examAlertMsgLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examAlertMsgLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMAlertMsgLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMAlertMsgLine() {
        if (examAlertMsgLine == null) {
            examAlertMsgLine = new ArrayList<>();
        }
        return this.examAlertMsgLine;
    }

    /**
     * Gets the value of the examDirectorName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examDirectorName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMDirectorName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMDirectorName() {
        if (examDirectorName == null) {
            examDirectorName = new ArrayList<>();
        }
        return this.examDirectorName;
    }

    /**
     * Gets the value of the custStatusCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custStatusCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustStatusCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCustStatusCode() {
        if (custStatusCode == null) {
            custStatusCode = new ArrayList<>();
        }
        return this.custStatusCode;
    }

    /**
     * Gets the value of the examCreditCardCompany property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examCreditCardCompany property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMCreditCardCompany().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMCreditCardCompany() {
        if (examCreditCardCompany == null) {
            examCreditCardCompany = new ArrayList<>();
        }
        return this.examCreditCardCompany;
    }

    /**
     * Gets the value of the examCreditCardNo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examCreditCardNo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMCreditCardNo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMCreditCardNo() {
        if (examCreditCardNo == null) {
            examCreditCardNo = new ArrayList<>();
        }
        return this.examCreditCardNo;
    }

    /**
     * Gets the value of the examCreditCardJoinYr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examCreditCardJoinYr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMCreditCardJoinYr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMCreditCardJoinYr() {
        if (examCreditCardJoinYr == null) {
            examCreditCardJoinYr = new ArrayList<>();
        }
        return this.examCreditCardJoinYr;
    }

    /**
     * Gets the value of the examBankorBrchHold property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examBankorBrchHold property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMBankorBrchHold().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMBankorBrchHold() {
        if (examBankorBrchHold == null) {
            examBankorBrchHold = new ArrayList<>();
        }
        return this.examBankorBrchHold;
    }

    /**
     * Gets the value of the examTyeOfAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examTyeOfAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMTyeOfAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMTyeOfAcct() {
        if (examTyeOfAcct == null) {
            examTyeOfAcct = new ArrayList<>();
        }
        return this.examTyeOfAcct;
    }

    /**
     * Gets the value of the examAcctNo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examAcctNo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMAcctNo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMAcctNo() {
        if (examAcctNo == null) {
            examAcctNo = new ArrayList<>();
        }
        return this.examAcctNo;
    }

    /**
     * Gets the value of the examCreditCardLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examCreditCardLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMCreditCardLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMCreditCardLimit() {
        if (examCreditCardLimit == null) {
            examCreditCardLimit = new ArrayList<>();
        }
        return this.examCreditCardLimit;
    }

    /**
     * Gets the value of the examAliasSeqNo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examAliasSeqNo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMAliasSeqNo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMAliasSeqNo() {
        if (examAliasSeqNo == null) {
            examAliasSeqNo = new ArrayList<>();
        }
        return this.examAliasSeqNo;
    }

    /**
     * Gets the value of the examNameTypeCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examNameTypeCd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMNameTypeCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMNameTypeCd() {
        if (examNameTypeCd == null) {
            examNameTypeCd = new ArrayList<>();
        }
        return this.examNameTypeCd;
    }

    /**
     * Gets the value of the examCustAlias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examCustAlias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMCustAlias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMCustAlias() {
        if (examCustAlias == null) {
            examCustAlias = new ArrayList<>();
        }
        return this.examCustAlias;
    }

    /**
     * Gets the value of the examSalutation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examSalutation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMSalutation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMSalutation() {
        if (examSalutation == null) {
            examSalutation = new ArrayList<>();
        }
        return this.examSalutation;
    }

    /**
     * Gets the value of the examMoreAliasInd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examMoreAliasInd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMMoreAliasInd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMMoreAliasInd() {
        if (examMoreAliasInd == null) {
            examMoreAliasInd = new ArrayList<>();
        }
        return this.examMoreAliasInd;
    }

    /**
     * Gets the value of the examLifeStyInd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examLifeStyInd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMLifeStyInd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMLifeStyInd() {
        if (examLifeStyInd == null) {
            examLifeStyInd = new ArrayList<>();
        }
        return this.examLifeStyInd;
    }

    /**
     * Gets the value of the examUserCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examUserCd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMUserCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMUserCd() {
        if (examUserCd == null) {
            examUserCd = new ArrayList<>();
        }
        return this.examUserCd;
    }

    /**
     * Gets the value of the examAddrTypeCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examAddrTypeCd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMAddrTypeCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMAddrTypeCd() {
        if (examAddrTypeCd == null) {
            examAddrTypeCd = new ArrayList<>();
        }
        return this.examAddrTypeCd;
    }

    /**
     * Gets the value of the examEmailAddrCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examEmailAddrCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMEmailAddrCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMEmailAddrCode() {
        if (examEmailAddrCode == null) {
            examEmailAddrCode = new ArrayList<>();
        }
        return this.examEmailAddrCode;
    }

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
     * Gets the value of the examLastRetCheck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMLastRetCheck() {
        return examLastRetCheck;
    }

    /**
     * Sets the value of the examLastRetCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMLastRetCheck(String value) {
        this.examLastRetCheck = value;
    }

    /**
     * Gets the value of the examLastStChgDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMLastStChgDt() {
        return examLastStChgDt;
    }

    /**
     * Sets the value of the examLastStChgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMLastStChgDt(String value) {
        this.examLastStChgDt = value;
    }

    /**
     * Gets the value of the examTitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMTitType() {
        return examTitType;
    }

    /**
     * Sets the value of the examTitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMTitType(String value) {
        this.examTitType = value;
    }

    /**
     * Gets the value of the examAltFormtName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMAltFormtName() {
        return examAltFormtName;
    }

    /**
     * Sets the value of the examAltFormtName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMAltFormtName(String value) {
        this.examAltFormtName = value;
    }

    /**
     * Gets the value of the examMailColBrch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMailColBrch() {
        return examMailColBrch;
    }

    /**
     * Sets the value of the examMailColBrch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMailColBrch(String value) {
        this.examMailColBrch = value;
    }

    /**
     * Gets the value of the examMailDelMd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMailDelMd() {
        return examMailDelMd;
    }

    /**
     * Sets the value of the examMailDelMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMailDelMd(String value) {
        this.examMailDelMd = value;
    }

    /**
     * Gets the value of the examPromoMailColBrch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPromoMailColBrch() {
        return examPromoMailColBrch;
    }

    /**
     * Sets the value of the examPromoMailColBrch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPromoMailColBrch(String value) {
        this.examPromoMailColBrch = value;
    }

    /**
     * Gets the value of the examPromoMailDelMd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPromoMailDelMd() {
        return examPromoMailDelMd;
    }

    /**
     * Sets the value of the examPromoMailDelMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPromoMailDelMd(String value) {
        this.examPromoMailDelMd = value;
    }

    /**
     * Gets the value of the examProfitAnlz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMProfitAnlz() {
        return examProfitAnlz;
    }

    /**
     * Sets the value of the examProfitAnlz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMProfitAnlz(String value) {
        this.examProfitAnlz = value;
    }

    /**
     * Gets the value of the examCostInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCostInd() {
        return examCostInd;
    }

    /**
     * Sets the value of the examCostInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCostInd(String value) {
        this.examCostInd = value;
    }

    /**
     * Gets the value of the examProfitRevDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMProfitRevDt() {
        return examProfitRevDt;
    }

    /**
     * Sets the value of the examProfitRevDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMProfitRevDt(LocalDate value) {
        this.examProfitRevDt = value;
    }

    /**
     * Gets the value of the examPreCrRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPreCrRating() {
        return examPreCrRating;
    }

    /**
     * Sets the value of the examPreCrRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPreCrRating(String value) {
        this.examPreCrRating = value;
    }

    /**
     * Gets the value of the examLstCrRtgDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMLstCrRtgDt() {
        return examLstCrRtgDt;
    }

    /**
     * Sets the value of the examLstCrRtgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMLstCrRtgDt(LocalDate value) {
        this.examLstCrRtgDt = value;
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
     * Gets the value of the examPreKycRtg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPreKycRtg() {
        return examPreKycRtg;
    }

    /**
     * Sets the value of the examPreKycRtg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPreKycRtg(String value) {
        this.examPreKycRtg = value;
    }

    /**
     * Gets the value of the examPreKycRevDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMPreKycRevDt() {
        return examPreKycRevDt;
    }

    /**
     * Sets the value of the examPreKycRevDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPreKycRevDt(LocalDate value) {
        this.examPreKycRevDt = value;
    }

    /**
     * Gets the value of the examPreKycRlResnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMPreKycRlResnDt() {
        return examPreKycRlResnDt;
    }

    /**
     * Sets the value of the examPreKycRlResnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPreKycRlResnDt(LocalDate value) {
        this.examPreKycRlResnDt = value;
    }

    /**
     * Gets the value of the examCurKycRlResCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCurKycRlResCd() {
        return examCurKycRlResCd;
    }

    /**
     * Sets the value of the examCurKycRlResCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCurKycRlResCd(String value) {
        this.examCurKycRlResCd = value;
    }

    /**
     * Gets the value of the examPreOblRskGrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPreOblRskGrd() {
        return examPreOblRskGrd;
    }

    /**
     * Sets the value of the examPreOblRskGrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPreOblRskGrd(String value) {
        this.examPreOblRskGrd = value;
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
     * Gets the value of the examLastObgRevDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMLastObgRevDt() {
        return examLastObgRevDt;
    }

    /**
     * Sets the value of the examLastObgRevDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMLastObgRevDt(LocalDate value) {
        this.examLastObgRevDt = value;
    }

    /**
     * Gets the value of the examFedWHChgDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMFedWHChgDt() {
        return examFedWHChgDt;
    }

    /**
     * Sets the value of the examFedWHChgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMFedWHChgDt(LocalDate value) {
        this.examFedWHChgDt = value;
    }

    /**
     * Gets the value of the examStatWHCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMStatWHCd() {
        return examStatWHCd;
    }

    /**
     * Sets the value of the examStatWHCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMStatWHCd(String value) {
        this.examStatWHCd = value;
    }

    /**
     * Gets the value of the examStatWHChgDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMStatWHChgDt() {
        return examStatWHChgDt;
    }

    /**
     * Sets the value of the examStatWHChgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMStatWHChgDt(LocalDate value) {
        this.examStatWHChgDt = value;
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
     * Gets the value of the examRelStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMRelStartDt() {
        return examRelStartDt;
    }

    /**
     * Sets the value of the examRelStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMRelStartDt(LocalDate value) {
        this.examRelStartDt = value;
    }

    /**
     * Gets the value of the examIntroducerCmpny property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIntroducerCmpny() {
        return examIntroducerCmpny;
    }

    /**
     * Sets the value of the examIntroducerCmpny property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIntroducerCmpny(String value) {
        this.examIntroducerCmpny = value;
    }

    /**
     * Gets the value of the examIntroducerDeptCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIntroducerDeptCd() {
        return examIntroducerDeptCd;
    }

    /**
     * Sets the value of the examIntroducerDeptCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIntroducerDeptCd(String value) {
        this.examIntroducerDeptCd = value;
    }

    /**
     * Gets the value of the examIntroducerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIntroducerName() {
        return examIntroducerName;
    }

    /**
     * Sets the value of the examIntroducerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIntroducerName(String value) {
        this.examIntroducerName = value;
    }

    /**
     * Gets the value of the examIsFamilyOwned property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIsFamilyOwned() {
        return examIsFamilyOwned;
    }

    /**
     * Sets the value of the examIsFamilyOwned property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIsFamilyOwned(String value) {
        this.examIsFamilyOwned = value;
    }

    /**
     * Gets the value of the examBusinessSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBusinessSize() {
        return examBusinessSize;
    }

    /**
     * Sets the value of the examBusinessSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBusinessSize(String value) {
        this.examBusinessSize = value;
    }

    /**
     * Gets the value of the examPowertoArtNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPowertoArtNo() {
        return examPowertoArtNo;
    }

    /**
     * Sets the value of the examPowertoArtNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPowertoArtNo(String value) {
        this.examPowertoArtNo = value;
    }

    /**
     * Gets the value of the examPowertoGuarNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPowertoGuarNo() {
        return examPowertoGuarNo;
    }

    /**
     * Sets the value of the examPowertoGuarNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPowertoGuarNo(String value) {
        this.examPowertoGuarNo = value;
    }

    /**
     * Gets the value of the examFinanceYrEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMFinanceYrEnd() {
        return examFinanceYrEnd;
    }

    /**
     * Sets the value of the examFinanceYrEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMFinanceYrEnd(String value) {
        this.examFinanceYrEnd = value;
    }

    /**
     * Gets the value of the examAuthCapital property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMAuthCapital() {
        return examAuthCapital;
    }

    /**
     * Sets the value of the examAuthCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMAuthCapital(String value) {
        this.examAuthCapital = value;
    }

    /**
     * Gets the value of the examPaidupCaptial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPaidupCaptial() {
        return examPaidupCaptial;
    }

    /**
     * Sets the value of the examPaidupCaptial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPaidupCaptial(String value) {
        this.examPaidupCaptial = value;
    }

    /**
     * Gets the value of the examPaidupCaptialDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMPaidupCaptialDt() {
        return examPaidupCaptialDt;
    }

    /**
     * Sets the value of the examPaidupCaptialDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPaidupCaptialDt(LocalDate value) {
        this.examPaidupCaptialDt = value;
    }

    /**
     * Gets the value of the examCurSalTnOver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCurSalTnOver() {
        return examCurSalTnOver;
    }

    /**
     * Sets the value of the examCurSalTnOver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCurSalTnOver(String value) {
        this.examCurSalTnOver = value;
    }

    /**
     * Gets the value of the examEstAssetVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMEstAssetVal() {
        return examEstAssetVal;
    }

    /**
     * Sets the value of the examEstAssetVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEstAssetVal(String value) {
        this.examEstAssetVal = value;
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
     * Gets the value of the examOtherExp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOtherExp() {
        return examOtherExp;
    }

    /**
     * Sets the value of the examOtherExp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOtherExp(String value) {
        this.examOtherExp = value;
    }

    /**
     * Gets the value of the examNoStaffMgrLvl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMNoStaffMgrLvl() {
        return examNoStaffMgrLvl;
    }

    /**
     * Sets the value of the examNoStaffMgrLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMNoStaffMgrLvl(String value) {
        this.examNoStaffMgrLvl = value;
    }

    /**
     * Gets the value of the examNoStaffOtherLvl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMNoStaffOtherLvl() {
        return examNoStaffOtherLvl;
    }

    /**
     * Sets the value of the examNoStaffOtherLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMNoStaffOtherLvl(String value) {
        this.examNoStaffOtherLvl = value;
    }

    /**
     * Gets the value of the examIsAddProof property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIsAddProof() {
        return examIsAddProof;
    }

    /**
     * Sets the value of the examIsAddProof property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIsAddProof(String value) {
        this.examIsAddProof = value;
    }

    /**
     * Gets the value of the examComplexCompStruc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMComplexCompStruc() {
        return examComplexCompStruc;
    }

    /**
     * Sets the value of the examComplexCompStruc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMComplexCompStruc(String value) {
        this.examComplexCompStruc = value;
    }

    /**
     * Gets the value of the examIsPayTax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIsPayTax() {
        return examIsPayTax;
    }

    /**
     * Sets the value of the examIsPayTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIsPayTax(String value) {
        this.examIsPayTax = value;
    }

    /**
     * Gets the value of the examIsCashIncome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIsCashIncome() {
        return examIsCashIncome;
    }

    /**
     * Sets the value of the examIsCashIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIsCashIncome(String value) {
        this.examIsCashIncome = value;
    }

    /**
     * Gets the value of the examPoliticalRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPoliticalRelationship() {
        return examPoliticalRelationship;
    }

    /**
     * Sets the value of the examPoliticalRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPoliticalRelationship(String value) {
        this.examPoliticalRelationship = value;
    }

    /**
     * Gets the value of the examIsDocProof property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIsDocProof() {
        return examIsDocProof;
    }

    /**
     * Sets the value of the examIsDocProof property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIsDocProof(String value) {
        this.examIsDocProof = value;
    }

    /**
     * Gets the value of the examReturnedMailAssess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMReturnedMailAssess() {
        return examReturnedMailAssess;
    }

    /**
     * Sets the value of the examReturnedMailAssess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMReturnedMailAssess(String value) {
        this.examReturnedMailAssess = value;
    }

    /**
     * Gets the value of the examIsNonProfitOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIsNonProfitOrg() {
        return examIsNonProfitOrg;
    }

    /**
     * Sets the value of the examIsNonProfitOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIsNonProfitOrg(String value) {
        this.examIsNonProfitOrg = value;
    }

    /**
     * Gets the value of the examEstAssetRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMEstAssetRange() {
        return examEstAssetRange;
    }

    /**
     * Sets the value of the examEstAssetRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEstAssetRange(String value) {
        this.examEstAssetRange = value;
    }

    /**
     * Gets the value of the examLastMaintsrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMLastMaintsrc() {
        return examLastMaintsrc;
    }

    /**
     * Sets the value of the examLastMaintsrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMLastMaintsrc(String value) {
        this.examLastMaintsrc = value;
    }

    /**
     * Gets the value of the examCreatedUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCreatedUserId() {
        return examCreatedUserId;
    }

    /**
     * Sets the value of the examCreatedUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCreatedUserId(String value) {
        this.examCreatedUserId = value;
    }

    /**
     * Gets the value of the examCreatedDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMCreatedDt() {
        return examCreatedDt;
    }

    /**
     * Sets the value of the examCreatedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCreatedDt(LocalDate value) {
        this.examCreatedDt = value;
    }

    /**
     * Gets the value of the examCreatedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCreatedTime() {
        return examCreatedTime;
    }

    /**
     * Sets the value of the examCreatedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCreatedTime(String value) {
        this.examCreatedTime = value;
    }

    /**
     * Gets the value of the examCreatedSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCreatedSrc() {
        return examCreatedSrc;
    }

    /**
     * Sets the value of the examCreatedSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCreatedSrc(String value) {
        this.examCreatedSrc = value;
    }

    /**
     * Gets the value of the examAddr5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMAddr5() {
        return examAddr5;
    }

    /**
     * Sets the value of the examAddr5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMAddr5(String value) {
        this.examAddr5 = value;
    }

    /**
     * Gets the value of the examAddr6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMAddr6() {
        return examAddr6;
    }

    /**
     * Sets the value of the examAddr6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMAddr6(String value) {
        this.examAddr6 = value;
    }

    /**
     * Gets the value of the examAddr7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMAddr7() {
        return examAddr7;
    }

    /**
     * Sets the value of the examAddr7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMAddr7(String value) {
        this.examAddr7 = value;
    }

    /**
     * Gets the value of the examCountryOfExp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCountryOfExp() {
        return examCountryOfExp;
    }

    /**
     * Sets the value of the examCountryOfExp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCountryOfExp(String value) {
        this.examCountryOfExp = value;
    }

    /**
     * Gets the value of the examSecurityVerfyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSecurityVerfyCd() {
        return examSecurityVerfyCd;
    }

    /**
     * Sets the value of the examSecurityVerfyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSecurityVerfyCd(String value) {
        this.examSecurityVerfyCd = value;
    }

    /**
     * Gets the value of the examBenefitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBenefitCode() {
        return examBenefitCode;
    }

    /**
     * Sets the value of the examBenefitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBenefitCode(String value) {
        this.examBenefitCode = value;
    }

    /**
     * Gets the value of the examBenefitApplnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMBenefitApplnDt() {
        return examBenefitApplnDt;
    }

    /**
     * Sets the value of the examBenefitApplnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBenefitApplnDt(LocalDate value) {
        this.examBenefitApplnDt = value;
    }

    /**
     * Gets the value of the examCtyMjrShareHolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCtyMjrShareHolder() {
        return examCtyMjrShareHolder;
    }

    /**
     * Sets the value of the examCtyMjrShareHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCtyMjrShareHolder(String value) {
        this.examCtyMjrShareHolder = value;
    }

    /**
     * Gets the value of the examPercOfCapOwnMjHolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPercOfCapOwnMjHolder() {
        return examPercOfCapOwnMjHolder;
    }

    /**
     * Sets the value of the examPercOfCapOwnMjHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPercOfCapOwnMjHolder(String value) {
        this.examPercOfCapOwnMjHolder = value;
    }

    /**
     * Gets the value of the examYearOfRes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMYearOfRes() {
        return examYearOfRes;
    }

    /**
     * Sets the value of the examYearOfRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMYearOfRes(String value) {
        this.examYearOfRes = value;
    }

    /**
     * Gets the value of the examNameOfRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMNameOfRef() {
        return examNameOfRef;
    }

    /**
     * Sets the value of the examNameOfRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMNameOfRef(String value) {
        this.examNameOfRef = value;
    }

    /**
     * Gets the value of the examIdNoOfRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIdNoOfRef() {
        return examIdNoOfRef;
    }

    /**
     * Sets the value of the examIdNoOfRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIdNoOfRef(String value) {
        this.examIdNoOfRef = value;
    }

    /**
     * Gets the value of the examMobilePhRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMobilePhRef() {
        return examMobilePhRef;
    }

    /**
     * Sets the value of the examMobilePhRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMobilePhRef(String value) {
        this.examMobilePhRef = value;
    }

    /**
     * Gets the value of the examPager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPager() {
        return examPager;
    }

    /**
     * Sets the value of the examPager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPager(String value) {
        this.examPager = value;
    }

    /**
     * Gets the value of the examEmployeeInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMEmployeeInd() {
        return examEmployeeInd;
    }

    /**
     * Sets the value of the examEmployeeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEmployeeInd(String value) {
        this.examEmployeeInd = value;
    }

    /**
     * Gets the value of the examLastMaitainWrkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMLastMaitainWrkId() {
        return examLastMaitainWrkId;
    }

    /**
     * Sets the value of the examLastMaitainWrkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMLastMaitainWrkId(String value) {
        this.examLastMaitainWrkId = value;
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
     * Gets the value of the examValidApp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMValidApp() {
        return examValidApp;
    }

    /**
     * Sets the value of the examValidApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMValidApp(String value) {
        this.examValidApp = value;
    }

    /**
     * Gets the value of the examFoundPepLst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMFoundPepLst() {
        return examFoundPepLst;
    }

    /**
     * Sets the value of the examFoundPepLst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMFoundPepLst(String value) {
        this.examFoundPepLst = value;
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
     * Gets the value of the examIntroducerCodeUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIntroducerCodeUID() {
        return examIntroducerCodeUID;
    }

    /**
     * Sets the value of the examIntroducerCodeUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIntroducerCodeUID(String value) {
        this.examIntroducerCodeUID = value;
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
     * Gets the value of the examPrimCustFrmtName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPrimCustFrmtName() {
        return examPrimCustFrmtName;
    }

    /**
     * Sets the value of the examPrimCustFrmtName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPrimCustFrmtName(String value) {
        this.examPrimCustFrmtName = value;
    }

    /**
     * Gets the value of the examAlterIDNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMAlterIDNo() {
        return examAlterIDNo;
    }

    /**
     * Sets the value of the examAlterIDNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMAlterIDNo(String value) {
        this.examAlterIDNo = value;
    }

    /**
     * Gets the value of the examAlterIDType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMAlterIDType() {
        return examAlterIDType;
    }

    /**
     * Sets the value of the examAlterIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMAlterIDType(String value) {
        this.examAlterIDType = value;
    }

    /**
     * Gets the value of the examAlterIDIssCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMAlterIDIssCtry() {
        return examAlterIDIssCtry;
    }

    /**
     * Sets the value of the examAlterIDIssCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMAlterIDIssCtry(String value) {
        this.examAlterIDIssCtry = value;
    }

    /**
     * Gets the value of the examOrgType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOrgType() {
        return examOrgType;
    }

    /**
     * Sets the value of the examOrgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOrgType(String value) {
        this.examOrgType = value;
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
     * Gets the value of the examEmploymentStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMEmploymentStartDt() {
        return examEmploymentStartDt;
    }

    /**
     * Sets the value of the examEmploymentStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEmploymentStartDt(LocalDate value) {
        this.examEmploymentStartDt = value;
    }

    /**
     * Gets the value of the examStaffBen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMStaffBen() {
        return examStaffBen;
    }

    /**
     * Sets the value of the examStaffBen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMStaffBen(String value) {
        this.examStaffBen = value;
    }

    /**
     * Gets the value of the examHeadingCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMHeadingCd() {
        return examHeadingCd;
    }

    /**
     * Sets the value of the examHeadingCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMHeadingCd(String value) {
        this.examHeadingCd = value;
    }

    /**
     * Gets the value of the examPoliticalExposed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPoliticalExposed() {
        return examPoliticalExposed;
    }

    /**
     * Sets the value of the examPoliticalExposed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPoliticalExposed(String value) {
        this.examPoliticalExposed = value;
    }

    /**
     * Gets the value of the examRevenueInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMRevenueInd() {
        return examRevenueInd;
    }

    /**
     * Sets the value of the examRevenueInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMRevenueInd(String value) {
        this.examRevenueInd = value;
    }

    /**
     * Gets the value of the examNoStaffExeLvl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMNoStaffExeLvl() {
        return examNoStaffExeLvl;
    }

    /**
     * Sets the value of the examNoStaffExeLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMNoStaffExeLvl(String value) {
        this.examNoStaffExeLvl = value;
    }

    /**
     * Gets the value of the examCustOrgcreDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCustOrgcreDt() {
        return examCustOrgcreDt;
    }

    /**
     * Sets the value of the examCustOrgcreDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCustOrgcreDt(String value) {
        this.examCustOrgcreDt = value;
    }

    /**
     * Gets the value of the examCustomerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCustomerNumber() {
        return examCustomerNumber;
    }

    /**
     * Sets the value of the examCustomerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCustomerNumber(String value) {
        this.examCustomerNumber = value;
    }

    /**
     * Gets the value of the examIsLinkToGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIsLinkToGUID() {
        return examIsLinkToGUID;
    }

    /**
     * Sets the value of the examIsLinkToGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIsLinkToGUID(String value) {
        this.examIsLinkToGUID = value;
    }

    /**
     * Gets the value of the examProfitInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMProfitInd() {
        return examProfitInd;
    }

    /**
     * Sets the value of the examProfitInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMProfitInd(String value) {
        this.examProfitInd = value;
    }

    /**
     * Gets the value of the examBlackListInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBlackListInd() {
        return examBlackListInd;
    }

    /**
     * Sets the value of the examBlackListInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBlackListInd(String value) {
        this.examBlackListInd = value;
    }

    /**
     * Gets the value of the examBlackListShtResn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBlackListShtResn() {
        return examBlackListShtResn;
    }

    /**
     * Sets the value of the examBlackListShtResn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBlackListShtResn(String value) {
        this.examBlackListShtResn = value;
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
     * Gets the value of the examDealInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMDealInd() {
        return examDealInd;
    }

    /**
     * Sets the value of the examDealInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMDealInd(String value) {
        this.examDealInd = value;
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
     * Gets the value of the examUserWorkstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMUserWorkstName() {
        return examUserWorkstName;
    }

    /**
     * Sets the value of the examUserWorkstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMUserWorkstName(String value) {
        this.examUserWorkstName = value;
    }

    /**
     * Gets the value of the examPrimIndCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPrimIndCode() {
        return examPrimIndCode;
    }

    /**
     * Sets the value of the examPrimIndCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPrimIndCode(String value) {
        this.examPrimIndCode = value;
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
     * Gets the value of the examJobDesgnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMJobDesgnCode() {
        return examJobDesgnCode;
    }

    /**
     * Sets the value of the examJobDesgnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMJobDesgnCode(String value) {
        this.examJobDesgnCode = value;
    }

    /**
     * Gets the value of the examGraduationYr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMGraduationYr() {
        return examGraduationYr;
    }

    /**
     * Sets the value of the examGraduationYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMGraduationYr(String value) {
        this.examGraduationYr = value;
    }

    /**
     * Gets the value of the examEductaionInst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMEductaionInst() {
        return examEductaionInst;
    }

    /**
     * Sets the value of the examEductaionInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEductaionInst(String value) {
        this.examEductaionInst = value;
    }

    /**
     * Gets the value of the examEductaionCrse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMEductaionCrse() {
        return examEductaionCrse;
    }

    /**
     * Sets the value of the examEductaionCrse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEductaionCrse(String value) {
        this.examEductaionCrse = value;
    }

    /**
     * Gets the value of the examEductaionCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMEductaionCtry() {
        return examEductaionCtry;
    }

    /**
     * Sets the value of the examEductaionCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEductaionCtry(String value) {
        this.examEductaionCtry = value;
    }

    /**
     * Gets the value of the examBlackLstReasonCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBlackLstReasonCd() {
        return examBlackLstReasonCd;
    }

    /**
     * Sets the value of the examBlackLstReasonCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBlackLstReasonCd(String value) {
        this.examBlackLstReasonCd = value;
    }

    /**
     * Gets the value of the examBlackLstReasonDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBlackLstReasonDes() {
        return examBlackLstReasonDes;
    }

    /**
     * Sets the value of the examBlackLstReasonDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBlackLstReasonDes(String value) {
        this.examBlackLstReasonDes = value;
    }

    /**
     * Gets the value of the examMoreIdInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMoreIdInd() {
        return examMoreIdInd;
    }

    /**
     * Sets the value of the examMoreIdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMoreIdInd(String value) {
        this.examMoreIdInd = value;
    }

    /**
     * Gets the value of the examMoreLifeStlyInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMoreLifeStlyInd() {
        return examMoreLifeStlyInd;
    }

    /**
     * Sets the value of the examMoreLifeStlyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMoreLifeStlyInd(String value) {
        this.examMoreLifeStlyInd = value;
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
     * Gets the value of the examAddrFormatCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMAddrFormatCd() {
        return examAddrFormatCd;
    }

    /**
     * Sets the value of the examAddrFormatCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMAddrFormatCd(String value) {
        this.examAddrFormatCd = value;
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
     * Gets the value of the examLendContrlUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMLendContrlUnit() {
        return examLendContrlUnit;
    }

    /**
     * Sets the value of the examLendContrlUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMLendContrlUnit(String value) {
        this.examLendContrlUnit = value;
    }

    /**
     * Gets the value of the examPrevKycRlResCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPrevKycRlResCd() {
        return examPrevKycRlResCd;
    }

    /**
     * Sets the value of the examPrevKycRlResCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPrevKycRlResCd(String value) {
        this.examPrevKycRlResCd = value;
    }

    /**
     * Gets the value of the examEmailAddrDesc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examEmailAddrDesc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMEmailAddrDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMEmailAddrDesc() {
        if (examEmailAddrDesc == null) {
            examEmailAddrDesc = new ArrayList<>();
        }
        return this.examEmailAddrDesc;
    }

    /**
     * Gets the value of the examContactName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examContactName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMContactName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMContactName() {
        if (examContactName == null) {
            examContactName = new ArrayList<>();
        }
        return this.examContactName;
    }

    /**
     * Gets the value of the examDeptName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examDeptName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMDeptName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMDeptName() {
        if (examDeptName == null) {
            examDeptName = new ArrayList<>();
        }
        return this.examDeptName;
    }

    /**
     * Gets the value of the examJobDesignation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examJobDesignation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMJobDesignation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMJobDesignation() {
        if (examJobDesignation == null) {
            examJobDesignation = new ArrayList<>();
        }
        return this.examJobDesignation;
    }

    /**
     * Gets the value of the examLastMaintTm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examLastMaintTm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMLastMaintTm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getEXAMLastMaintTm() {
        if (examLastMaintTm == null) {
            examLastMaintTm = new ArrayList<>();
        }
        return this.examLastMaintTm;
    }

    /**
     * Gets the value of the examLastMaintUID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examLastMaintUID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMLastMaintUID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMLastMaintUID() {
        if (examLastMaintUID == null) {
            examLastMaintUID = new ArrayList<>();
        }
        return this.examLastMaintUID;
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
     * Gets the value of the emailAddr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailAddr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailAddr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEmailAddr() {
        if (emailAddr == null) {
            emailAddr = new ArrayList<>();
        }
        return this.emailAddr;
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
     * Gets the value of the examCentralBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCentralBankCode() {
        return examCentralBankCode;
    }

    /**
     * Sets the value of the examCentralBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCentralBankCode(String value) {
        this.examCentralBankCode = value;
    }

    /**
     * Gets the value of the examCentralBankCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCentralBankCode2() {
        return examCentralBankCode2;
    }

    /**
     * Sets the value of the examCentralBankCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCentralBankCode2(String value) {
        this.examCentralBankCode2 = value;
    }

    /**
     * Gets the value of the examCentralBankCode3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCentralBankCode3() {
        return examCentralBankCode3;
    }

    /**
     * Sets the value of the examCentralBankCode3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCentralBankCode3(String value) {
        this.examCentralBankCode3 = value;
    }

    /**
     * Gets the value of the examCentralBankCode4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCentralBankCode4() {
        return examCentralBankCode4;
    }

    /**
     * Sets the value of the examCentralBankCode4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCentralBankCode4(String value) {
        this.examCentralBankCode4 = value;
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
     * Gets the value of the examPrimaryName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examPrimaryName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMPrimaryName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMPrimaryName() {
        if (examPrimaryName == null) {
            examPrimaryName = new ArrayList<>();
        }
        return this.examPrimaryName;
    }

    /**
     * Gets the value of the examAlternateName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examAlternateName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMAlternateName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMAlternateName() {
        if (examAlternateName == null) {
            examAlternateName = new ArrayList<>();
        }
        return this.examAlternateName;
    }

    /**
     * Gets the value of the examUsPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMUsPerson() {
        return examUsPerson;
    }

    /**
     * Sets the value of the examUsPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMUsPerson(String value) {
        this.examUsPerson = value;
    }

    /**
     * Gets the value of the examNonUsPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMNonUsPerson() {
        return examNonUsPerson;
    }

    /**
     * Sets the value of the examNonUsPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMNonUsPerson(String value) {
        this.examNonUsPerson = value;
    }

    /**
     * Gets the value of the taxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxId() {
        return taxId;
    }

    /**
     * Sets the value of the taxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxId(String value) {
        this.taxId = value;
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
     * Gets the value of the examPriorStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPriorStatus() {
        return examPriorStatus;
    }

    /**
     * Sets the value of the examPriorStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPriorStatus(String value) {
        this.examPriorStatus = value;
    }

    /**
     * Gets the value of the examCreationSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCreationSrc() {
        return examCreationSrc;
    }

    /**
     * Sets the value of the examCreationSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCreationSrc(String value) {
        this.examCreationSrc = value;
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
     * Gets the value of the examKycRevDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMKycRevDt() {
        return examKycRevDt;
    }

    /**
     * Sets the value of the examKycRevDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMKycRevDt(LocalDate value) {
        this.examKycRevDt = value;
    }

    /**
     * Gets the value of the examAuthCapitalDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMAuthCapitalDt() {
        return examAuthCapitalDt;
    }

    /**
     * Sets the value of the examAuthCapitalDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMAuthCapitalDt(LocalDate value) {
        this.examAuthCapitalDt = value;
    }

    /**
     * Gets the value of the examLastMaintDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examLastMaintDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMLastMaintDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<LocalDate> getEXAMLastMaintDt() {
        if (examLastMaintDt == null) {
            examLastMaintDt = new ArrayList<>();
        }
        return this.examLastMaintDt;
    }

    /**
     * Gets the value of the examNameAliasInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMNameAliasInd() {
        return examNameAliasInd;
    }

    /**
     * Sets the value of the examNameAliasInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMNameAliasInd(String value) {
        this.examNameAliasInd = value;
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
     * Gets the value of the examHouseNo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examHouseNo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMHouseNo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMHouseNo() {
        if (examHouseNo == null) {
            examHouseNo = new ArrayList<>();
        }
        return this.examHouseNo;
    }

    /**
     * Gets the value of the examUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMUnit() {
        return examUnit;
    }

    /**
     * Sets the value of the examUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMUnit(String value) {
        this.examUnit = value;
    }

    /**
     * Gets the value of the examStorey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examStorey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMStorey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMStorey() {
        if (examStorey == null) {
            examStorey = new ArrayList<>();
        }
        return this.examStorey;
    }

    /**
     * Gets the value of the examBuildingName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examBuildingName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMBuildingName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMBuildingName() {
        if (examBuildingName == null) {
            examBuildingName = new ArrayList<>();
        }
        return this.examBuildingName;
    }

    /**
     * Gets the value of the examStreetName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examStreetName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMStreetName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMStreetName() {
        if (examStreetName == null) {
            examStreetName = new ArrayList<>();
        }
        return this.examStreetName;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the exameAddresCodeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMEAddresCodeType() {
        return exameAddresCodeType;
    }

    /**
     * Sets the value of the exameAddresCodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEAddresCodeType(String value) {
        this.exameAddresCodeType = value;
    }

    /**
     * Gets the value of the exameAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMEAddress() {
        return exameAddress;
    }

    /**
     * Sets the value of the exameAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMEAddress(String value) {
        this.exameAddress = value;
    }

    /**
     * Gets the value of the examContactPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMContactPerson() {
        return examContactPerson;
    }

    /**
     * Sets the value of the examContactPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMContactPerson(String value) {
        this.examContactPerson = value;
    }

    /**
     * Gets the value of the examrmCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMRMCode() {
        return examrmCode;
    }

    /**
     * Sets the value of the examrmCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMRMCode(String value) {
        this.examrmCode = value;
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
     * Gets the value of the examPoBox property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examPoBox property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMPoBox().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMPoBox() {
        if (examPoBox == null) {
            examPoBox = new ArrayList<>();
        }
        return this.examPoBox;
    }

    /**
     * Gets the value of the examHoldCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMHoldCode() {
        return examHoldCode;
    }

    /**
     * Sets the value of the examHoldCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMHoldCode(String value) {
        this.examHoldCode = value;
    }

    /**
     * Gets the value of the examExternalRatingSrc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examExternalRatingSrc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMExternalRatingSrc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMExternalRatingSrc() {
        if (examExternalRatingSrc == null) {
            examExternalRatingSrc = new ArrayList<>();
        }
        return this.examExternalRatingSrc;
    }

    /**
     * Gets the value of the examExternalRatingCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examExternalRatingCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMExternalRatingCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMExternalRatingCode() {
        if (examExternalRatingCode == null) {
            examExternalRatingCode = new ArrayList<>();
        }
        return this.examExternalRatingCode;
    }

    /**
     * Gets the value of the examExternalRatingEffecDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examExternalRatingEffecDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMExternalRatingEffecDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<LocalDate> getEXAMExternalRatingEffecDt() {
        if (examExternalRatingEffecDt == null) {
            examExternalRatingEffecDt = new ArrayList<>();
        }
        return this.examExternalRatingEffecDt;
    }

    /**
     * Gets the value of the examExternalRatingExpiryDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examExternalRatingExpiryDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMExternalRatingExpiryDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<LocalDate> getEXAMExternalRatingExpiryDt() {
        if (examExternalRatingExpiryDt == null) {
            examExternalRatingExpiryDt = new ArrayList<>();
        }
        return this.examExternalRatingExpiryDt;
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
     * Gets the value of the examOtherNameType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examOtherNameType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMOtherNameType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMOtherNameType() {
        if (examOtherNameType == null) {
            examOtherNameType = new ArrayList<>();
        }
        return this.examOtherNameType;
    }

    /**
     * Gets the value of the examOtherName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examOtherName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMOtherName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMOtherName() {
        if (examOtherName == null) {
            examOtherName = new ArrayList<>();
        }
        return this.examOtherName;
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
     * Gets the value of the examLoyaltyPrgStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMLoyaltyPrgStatus() {
        return examLoyaltyPrgStatus;
    }

    /**
     * Sets the value of the examLoyaltyPrgStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMLoyaltyPrgStatus(String value) {
        this.examLoyaltyPrgStatus = value;
    }

    /**
     * Gets the value of the examMembershipNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMembershipNo() {
        return examMembershipNo;
    }

    /**
     * Sets the value of the examMembershipNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMembershipNo(String value) {
        this.examMembershipNo = value;
    }

    /**
     * Gets the value of the examMembershipEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMMembershipEndDt() {
        return examMembershipEndDt;
    }

    /**
     * Sets the value of the examMembershipEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMembershipEndDt(LocalDate value) {
        this.examMembershipEndDt = value;
    }

    /**
     * Gets the value of the examMembershipAcceptStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMembershipAcceptStatus() {
        return examMembershipAcceptStatus;
    }

    /**
     * Sets the value of the examMembershipAcceptStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMembershipAcceptStatus(String value) {
        this.examMembershipAcceptStatus = value;
    }

    /**
     * Gets the value of the examMembershipAcceptDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMMembershipAcceptDt() {
        return examMembershipAcceptDt;
    }

    /**
     * Sets the value of the examMembershipAcceptDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMembershipAcceptDt(LocalDate value) {
        this.examMembershipAcceptDt = value;
    }

    /**
     * Gets the value of the examMembershipCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMembershipCd() {
        return examMembershipCd;
    }

    /**
     * Sets the value of the examMembershipCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMembershipCd(String value) {
        this.examMembershipCd = value;
    }

    /**
     * Gets the value of the examMembershipApprovalCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMembershipApprovalCd() {
        return examMembershipApprovalCd;
    }

    /**
     * Sets the value of the examMembershipApprovalCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMembershipApprovalCd(String value) {
        this.examMembershipApprovalCd = value;
    }

    /**
     * Gets the value of the examInfoDiscosure1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMInfoDiscosure1() {
        return examInfoDiscosure1;
    }

    /**
     * Sets the value of the examInfoDiscosure1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMInfoDiscosure1(String value) {
        this.examInfoDiscosure1 = value;
    }

    /**
     * Gets the value of the examBankEmployeeIDNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBankEmployeeIDNo() {
        return examBankEmployeeIDNo;
    }

    /**
     * Sets the value of the examBankEmployeeIDNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBankEmployeeIDNo(String value) {
        this.examBankEmployeeIDNo = value;
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
     * Gets the value of the examSectorL1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSectorL1() {
        return examSectorL1;
    }

    /**
     * Sets the value of the examSectorL1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSectorL1(String value) {
        this.examSectorL1 = value;
    }

    /**
     * Gets the value of the examSectorL2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSectorL2() {
        return examSectorL2;
    }

    /**
     * Sets the value of the examSectorL2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSectorL2(String value) {
        this.examSectorL2 = value;
    }

    /**
     * Gets the value of the examFatcaDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMFatcaDetailsType }
     *     
     */
    public EXAMFatcaDetailsType getEXAMFatcaDetails() {
        return examFatcaDetails;
    }

    /**
     * Sets the value of the examFatcaDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMFatcaDetailsType }
     *     
     */
    public void setEXAMFatcaDetails(EXAMFatcaDetailsType value) {
        this.examFatcaDetails = value;
    }

    /**
     * Gets the value of the examMsgInd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examMsgInd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMMsgInd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMMsgInd() {
        if (examMsgInd == null) {
            examMsgInd = new ArrayList<>();
        }
        return this.examMsgInd;
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
     * Gets the value of the examBusinessSubSector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBusinessSubSector() {
        return examBusinessSubSector;
    }

    /**
     * Sets the value of the examBusinessSubSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBusinessSubSector(String value) {
        this.examBusinessSubSector = value;
    }

}
