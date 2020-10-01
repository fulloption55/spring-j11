
package com.theerut.springj11.client.webservice.accountsummary;

import com.theerut.springj11.client.webservice.common.CompositeCurAmtType;
import com.theerut.springj11.client.webservice.common.CurAmtType;
import com.theerut.springj11.client.webservice.common.LoanAcctIdType;
import com.theerut.springj11.client.webservice.common.TermType;
import com.theerut.springj11.utils.LocalDateAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for EXAM_LoanAcctInfo_Type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="EXAM_LoanAcctInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_FirstPymtDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_FinalMaturityDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastInstPaidAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PastDueDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PayDueDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MaturityDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}LastPmtDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AmtPaidToDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NextSchdPayDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_FullReleaseDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MonthsOverdue" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_InstAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NPLStatus" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PartialPayAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_VehicalNum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ProbStatus" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ProgPayment" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CurrMntPay" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LegalStatus" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Rate" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DailyIntAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LoanTerm" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_UnpaidCurAmt" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NPLClassCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RateFlag" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BranchId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_InstallmentNo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastInstPrincipalAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastInstInterestAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastInstLateChargeAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PaidVia" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Indicator" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NPLDate" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Count" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ExtAcctBal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AppNum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}LoanAcctId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_FacilityId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SeqNum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PartID" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EntityNum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RelationshipCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AppType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Category" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Desc" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MultiCurIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NewAcctIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SPTFIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LedgerBalReqIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_InstOverdraftIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MaintenanceIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RecordIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IslamicInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_YearBase" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IntFreq" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SPTFLoanType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PaymentCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IntPaymentFreq" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IntPaymentFreqCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DayOfMonthIntPayment" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NextSchIntPaymentDueDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PaymentFreq" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PaymentFreqCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DayOfMonthPayment" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CapitalRepayment" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ResidueValue" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DealerCalMethod" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DealerRt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CalRateDepoBase" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MrtyIntRt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AdvMargin" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PrimeRtnum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PrimeVar" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PrimeVarCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RateVarFloor" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RateVarCeil" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PrimeRtFloor" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PrimeRtCeiling" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LoanIntRt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PrimeReviewDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PrimeRvwTerm" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PrimeRvwTermCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RateRvwDay" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ReviewDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RvwTerm" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RvwTermCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RtUsrRvwDay" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CalInstlNearestDollar" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CapAccrueOEM" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AvailLimit" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OfficerCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BankDeptCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_GraceFPDTCal" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IncludeOrgamt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LateChargeType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LateChargeRate" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AutoUpliftAdvPmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AutoUpdatePmtCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PmtCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CommisionChargeIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DealerNo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_FixedIntRt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MoraFixedIntRt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_InvestAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_InvestAmtVat" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DownPmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DownPmtVat" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CarPrice" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CarVat" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TotVat" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RemainingVat" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_VatPmtAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_VatFinalPmtAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CloseAcctMinVat" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_StopVatFlag" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_StopVatDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AltDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MaturityRtNo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MaturityRtVar" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MaturityRtVarCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MaturityRtFloor" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MaturityRtCeiling" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MaturityRtRvwDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MaturityRtRvwDay" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MaturityRtRvwTerm" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MaturityRtRvwTM" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MaturityDealerRt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DefaultRtFlag" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ReinstateNormalRt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DefaultRt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DefaultRtNo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DefaultRtVar" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DefaultRtVarCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MthDaySwitch" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_GracePrdCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AltPmtSch" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_EmployerCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TrancheMax" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TrancheMin" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PrincipalAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ReleaseAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CummulativeDrawAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DrawingLimit" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IslamicIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RelationshipAccountNo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ScheduledBalance" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TotalPayableAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CurrentBillAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RedrawFacilityFlag" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AvailableRedrawLimit" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CumulativeWithdrawLimit" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CumulativeUtilizedAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RedrawMinAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NextPaymentDueDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AllowRedraw" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AllowPrepayment" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RelationshipAcctType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_FacilityStatus" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NumOfMnthInst" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NumOfDayInst" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_WriteOffIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SoldIndicator" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_LoanAcctInfo_Type", propOrder = {
        "examFirstPymtDt",
        "examFinalMaturityDt",
        "examLastInstPaidAmt",
        "examPastDueDt",
        "examPayDueDt",
        "examMaturityDt",
        "lastPmtDt",
        "examAmtPaidToDt",
        "examNextSchdPayDt",
        "examFullReleaseDt",
        "examMonthsOverdue",
        "examInstAmt",
        "examnplStatus",
        "examPartialPayAmt",
        "examVehicalNum",
        "examProbStatus",
        "examProgPayment",
        "examCurrMntPay",
        "examLegalStatus",
        "rate",
        "examDailyIntAmt",
        "examLoanTerm",
        "examUnpaidCurAmt",
        "examnplClassCode",
        "examRateFlag",
        "branchId",
        "examInstallmentNo",
        "examLastInstPrincipalAmt",
        "examLastInstInterestAmt",
        "examLastInstLateChargeAmt",
        "examPaidVia",
        "examIndicator",
        "examnplDate",
        "count",
        "extAcctBal",
        "examAppNum",
        "acctId",
        "loanAcctId",
        "examFacilityId",
        "seqNum",
        "examPartID",
        "examEntityNum",
        "examRelationshipCode",
        "examAppType",
        "category",
        "desc",
        "examMultiCurIndicator",
        "examNewAcctIndicator",
        "examsptfIndicator",
        "examLedgerBalReqIndicator",
        "examInstOverdraftIndicator",
        "examMaintenanceIndicator",
        "examRecordIndicator",
        "examIslamicInd",
        "examYearBase",
        "examIntFreq",
        "examsptfLoanType",
        "examPaymentCode",
        "examIntPaymentFreq",
        "examIntPaymentFreqCode",
        "examDayOfMonthIntPayment",
        "examNextSchIntPaymentDueDt",
        "examPaymentFreq",
        "examPaymentFreqCode",
        "examDayOfMonthPayment",
        "examCapitalRepayment",
        "examResidueValue",
        "examDealerCalMethod",
        "examDealerRt",
        "examCalRateDepoBase",
        "examMrtyIntRt",
        "examAdvMargin",
        "examPrimeRtnum",
        "examPrimeVar",
        "examPrimeVarCode",
        "examRateVarFloor",
        "examRateVarCeil",
        "examPrimeRtFloor",
        "examPrimeRtCeiling",
        "examLoanIntRt",
        "examPrimeReviewDt",
        "examPrimeRvwTerm",
        "examPrimeRvwTermCode",
        "examRateRvwDay",
        "examReviewDt",
        "examRvwTerm",
        "examRvwTermCode",
        "examRtUsrRvwDay",
        "examCalInstlNearestDollar",
        "examCapAccrueOEM",
        "examAvailLimit",
        "examOfficerCode",
        "examBankDeptCode",
        "examGraceFPDTCal",
        "examIncludeOrgamt",
        "examLateChargeType",
        "examLateChargeRate",
        "examAutoUpliftAdvPmt",
        "examAutoUpdatePmtCode",
        "examPmtCode",
        "examCommisionChargeIndicator",
        "examDealerNo",
        "examFixedIntRt",
        "examMoraFixedIntRt",
        "examInvestAmt",
        "examInvestAmtVat",
        "examDownPmt",
        "examDownPmtVat",
        "examCarPrice",
        "examCarVat",
        "examTotVat",
        "examRemainingVat",
        "examVatPmtAmt",
        "examVatFinalPmtAmt",
        "examCloseAcctMinVat",
        "examStopVatFlag",
        "examStopVatDt",
        "examAltDt",
        "examMaturityRtNo",
        "examMaturityRtVar",
        "examMaturityRtVarCode",
        "examMaturityRtFloor",
        "examMaturityRtCeiling",
        "examMaturityRtRvwDt",
        "examMaturityRtRvwDay",
        "examMaturityRtRvwTerm",
        "examMaturityRtRvwTM",
        "examMaturityDealerRt",
        "examDefaultRtFlag",
        "examReinstateNormalRt",
        "examDefaultRt",
        "examDefaultRtNo",
        "examDefaultRtVar",
        "examDefaultRtVarCode",
        "examMthDaySwitch",
        "examGracePrdCode",
        "examAltPmtSch",
        "examEmployerCode",
        "examTrancheMax",
        "examTrancheMin",
        "examPrincipalAmt",
        "examReleaseAmt",
        "examCummulativeDrawAmt",
        "examDrawingLimit",
        "examIslamicIndicator",
        "curCode",
        "examRelationshipAccountNo",
        "examScheduledBalance",
        "examTotalPayableAmt",
        "examCurrentBillAmt",
        "examRedrawFacilityFlag",
        "examAvailableRedrawLimit",
        "examCumulativeWithdrawLimit",
        "examCumulativeUtilizedAmt",
        "examRedrawMinAmt",
        "examNextPaymentDueDt",
        "examAllowRedraw",
        "examAllowPrepayment",
        "examRelationshipAcctType",
        "examFacilityStatus",
        "examNumOfMnthInst",
        "examNumOfDayInst",
        "examWriteOffIndicator",
        "examSoldIndicator"
})
public class EXAMLoanAcctInfoType {

    @XmlElement(name = "EXAM_FirstPymtDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examFirstPymtDt;
    @XmlElement(name = "EXAM_FinalMaturityDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examFinalMaturityDt;
    @XmlElement(name = "EXAM_LastInstPaidAmt")
    protected BigDecimal examLastInstPaidAmt;
    @XmlElement(name = "EXAM_PastDueDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examPastDueDt;
    @XmlElement(name = "EXAM_PayDueDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examPayDueDt;
    @XmlElement(name = "EXAM_MaturityDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examMaturityDt;
    @XmlElement(name = "LastPmtDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate lastPmtDt;
    @XmlElement(name = "EXAM_AmtPaidToDt")
    protected BigDecimal examAmtPaidToDt;
    @XmlElement(name = "EXAM_NextSchdPayDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examNextSchdPayDt;
    @XmlElement(name = "EXAM_FullReleaseDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examFullReleaseDt;
    @XmlElement(name = "EXAM_MonthsOverdue")
    protected Long examMonthsOverdue;
    @XmlElement(name = "EXAM_InstAmt")
    protected BigDecimal examInstAmt;
    @XmlElement(name = "EXAM_NPLStatus")
    protected String examnplStatus;
    @XmlElement(name = "EXAM_PartialPayAmt")
    protected BigDecimal examPartialPayAmt;
    @XmlElement(name = "EXAM_VehicalNum")
    protected String examVehicalNum;
    @XmlElement(name = "EXAM_ProbStatus")
    protected String examProbStatus;
    @XmlElement(name = "EXAM_ProgPayment")
    protected String examProgPayment;
    @XmlElement(name = "EXAM_CurrMntPay")
    protected BigDecimal examCurrMntPay;
    @XmlElement(name = "EXAM_LegalStatus")
    protected String examLegalStatus;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "EXAM_DailyIntAmt")
    protected BigDecimal examDailyIntAmt;
    @XmlElement(name = "EXAM_LoanTerm")
    protected TermType examLoanTerm;
    @XmlElement(name = "EXAM_UnpaidCurAmt")
    protected List<CompositeCurAmtType> examUnpaidCurAmt;
    @XmlElement(name = "EXAM_NPLClassCode")
    protected String examnplClassCode;
    @XmlElement(name = "EXAM_RateFlag")
    protected String examRateFlag;
    @XmlElement(name = "BranchId")
    protected String branchId;
    @XmlElement(name = "EXAM_InstallmentNo")
    protected Long examInstallmentNo;
    @XmlElement(name = "EXAM_LastInstPrincipalAmt")
    protected BigDecimal examLastInstPrincipalAmt;
    @XmlElement(name = "EXAM_LastInstInterestAmt")
    protected BigDecimal examLastInstInterestAmt;
    @XmlElement(name = "EXAM_LastInstLateChargeAmt")
    protected BigDecimal examLastInstLateChargeAmt;
    @XmlElement(name = "EXAM_PaidVia")
    protected String examPaidVia;
    @XmlElement(name = "EXAM_Indicator")
    protected String examIndicator;
    @XmlElement(name = "EXAM_NPLDate", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examnplDate;
    @XmlElement(name = "Count")
    protected Long count;
    @XmlElement(name = "ExtAcctBal")
    protected List<ExtAcctBalType> extAcctBal;
    @XmlElement(name = "EXAM_AppNum")
    protected String examAppNum;
    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "LoanAcctId")
    protected LoanAcctIdType loanAcctId;
    @XmlElement(name = "EXAM_FacilityId")
    protected String examFacilityId;
    @XmlElement(name = "SeqNum")
    protected Long seqNum;
    @XmlElement(name = "EXAM_PartID")
    protected String examPartID;
    @XmlElement(name = "EXAM_EntityNum")
    protected String examEntityNum;
    @XmlElement(name = "EXAM_RelationshipCode")
    protected String examRelationshipCode;
    @XmlElement(name = "EXAM_AppType")
    protected String examAppType;
    @XmlElement(name = "Category")
    protected String category;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "EXAM_MultiCurIndicator")
    protected String examMultiCurIndicator;
    @XmlElement(name = "EXAM_NewAcctIndicator")
    protected String examNewAcctIndicator;
    @XmlElement(name = "EXAM_SPTFIndicator")
    protected String examsptfIndicator;
    @XmlElement(name = "EXAM_LedgerBalReqIndicator")
    protected String examLedgerBalReqIndicator;
    @XmlElement(name = "EXAM_InstOverdraftIndicator")
    protected String examInstOverdraftIndicator;
    @XmlElement(name = "EXAM_MaintenanceIndicator")
    protected String examMaintenanceIndicator;
    @XmlElement(name = "EXAM_RecordIndicator")
    protected String examRecordIndicator;
    @XmlElement(name = "EXAM_IslamicInd")
    protected String examIslamicInd;
    @XmlElement(name = "EXAM_YearBase")
    protected String examYearBase;
    @XmlElement(name = "EXAM_IntFreq")
    protected String examIntFreq;
    @XmlElement(name = "EXAM_SPTFLoanType")
    protected String examsptfLoanType;
    @XmlElement(name = "EXAM_PaymentCode")
    protected String examPaymentCode;
    @XmlElement(name = "EXAM_IntPaymentFreq")
    protected String examIntPaymentFreq;
    @XmlElement(name = "EXAM_IntPaymentFreqCode")
    protected String examIntPaymentFreqCode;
    @XmlElement(name = "EXAM_DayOfMonthIntPayment")
    protected String examDayOfMonthIntPayment;
    @XmlElement(name = "EXAM_NextSchIntPaymentDueDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examNextSchIntPaymentDueDt;
    @XmlElement(name = "EXAM_PaymentFreq")
    protected String examPaymentFreq;
    @XmlElement(name = "EXAM_PaymentFreqCode")
    protected String examPaymentFreqCode;
    @XmlElement(name = "EXAM_DayOfMonthPayment")
    protected String examDayOfMonthPayment;
    @XmlElement(name = "EXAM_CapitalRepayment")
    protected String examCapitalRepayment;
    @XmlElement(name = "EXAM_ResidueValue")
    protected String examResidueValue;
    @XmlElement(name = "EXAM_DealerCalMethod")
    protected String examDealerCalMethod;
    @XmlElement(name = "EXAM_DealerRt")
    protected BigDecimal examDealerRt;
    @XmlElement(name = "EXAM_CalRateDepoBase")
    protected String examCalRateDepoBase;
    @XmlElement(name = "EXAM_MrtyIntRt")
    protected BigDecimal examMrtyIntRt;
    @XmlElement(name = "EXAM_AdvMargin")
    protected BigDecimal examAdvMargin;
    @XmlElement(name = "EXAM_PrimeRtnum")
    protected BigDecimal examPrimeRtnum;
    @XmlElement(name = "EXAM_PrimeVar")
    protected BigDecimal examPrimeVar;
    @XmlElement(name = "EXAM_PrimeVarCode")
    protected String examPrimeVarCode;
    @XmlElement(name = "EXAM_RateVarFloor")
    protected String examRateVarFloor;
    @XmlElement(name = "EXAM_RateVarCeil")
    protected String examRateVarCeil;
    @XmlElement(name = "EXAM_PrimeRtFloor")
    protected BigDecimal examPrimeRtFloor;
    @XmlElement(name = "EXAM_PrimeRtCeiling")
    protected BigDecimal examPrimeRtCeiling;
    @XmlElement(name = "EXAM_LoanIntRt")
    protected BigDecimal examLoanIntRt;
    @XmlElement(name = "EXAM_PrimeReviewDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examPrimeReviewDt;
    @XmlElement(name = "EXAM_PrimeRvwTerm")
    protected String examPrimeRvwTerm;
    @XmlElement(name = "EXAM_PrimeRvwTermCode")
    protected String examPrimeRvwTermCode;
    @XmlElement(name = "EXAM_RateRvwDay")
    protected String examRateRvwDay;
    @XmlElement(name = "EXAM_ReviewDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examReviewDt;
    @XmlElement(name = "EXAM_RvwTerm")
    protected String examRvwTerm;
    @XmlElement(name = "EXAM_RvwTermCode")
    protected String examRvwTermCode;
    @XmlElement(name = "EXAM_RtUsrRvwDay")
    protected String examRtUsrRvwDay;
    @XmlElement(name = "EXAM_CalInstlNearestDollar")
    protected String examCalInstlNearestDollar;
    @XmlElement(name = "EXAM_CapAccrueOEM")
    protected String examCapAccrueOEM;
    @XmlElement(name = "EXAM_AvailLimit")
    protected String examAvailLimit;
    @XmlElement(name = "EXAM_OfficerCode")
    protected String examOfficerCode;
    @XmlElement(name = "EXAM_BankDeptCode")
    protected String examBankDeptCode;
    @XmlElement(name = "EXAM_GraceFPDTCal")
    protected String examGraceFPDTCal;
    @XmlElement(name = "EXAM_IncludeOrgamt")
    protected String examIncludeOrgamt;
    @XmlElement(name = "EXAM_LateChargeType")
    protected BigDecimal examLateChargeType;
    @XmlElement(name = "EXAM_LateChargeRate")
    protected BigDecimal examLateChargeRate;
    @XmlElement(name = "EXAM_AutoUpliftAdvPmt")
    protected String examAutoUpliftAdvPmt;
    @XmlElement(name = "EXAM_AutoUpdatePmtCode")
    protected String examAutoUpdatePmtCode;
    @XmlElement(name = "EXAM_PmtCode")
    protected String examPmtCode;
    @XmlElement(name = "EXAM_CommisionChargeIndicator")
    protected String examCommisionChargeIndicator;
    @XmlElement(name = "EXAM_DealerNo")
    protected String examDealerNo;
    @XmlElement(name = "EXAM_FixedIntRt")
    protected BigDecimal examFixedIntRt;
    @XmlElement(name = "EXAM_MoraFixedIntRt")
    protected BigDecimal examMoraFixedIntRt;
    @XmlElement(name = "EXAM_InvestAmt")
    protected BigDecimal examInvestAmt;
    @XmlElement(name = "EXAM_InvestAmtVat")
    protected BigDecimal examInvestAmtVat;
    @XmlElement(name = "EXAM_DownPmt")
    protected BigDecimal examDownPmt;
    @XmlElement(name = "EXAM_DownPmtVat")
    protected BigDecimal examDownPmtVat;
    @XmlElement(name = "EXAM_CarPrice")
    protected BigDecimal examCarPrice;
    @XmlElement(name = "EXAM_CarVat")
    protected BigDecimal examCarVat;
    @XmlElement(name = "EXAM_TotVat")
    protected BigDecimal examTotVat;
    @XmlElement(name = "EXAM_RemainingVat")
    protected BigDecimal examRemainingVat;
    @XmlElement(name = "EXAM_VatPmtAmt")
    protected BigDecimal examVatPmtAmt;
    @XmlElement(name = "EXAM_VatFinalPmtAmt")
    protected BigDecimal examVatFinalPmtAmt;
    @XmlElement(name = "EXAM_CloseAcctMinVat")
    protected String examCloseAcctMinVat;
    @XmlElement(name = "EXAM_StopVatFlag")
    protected String examStopVatFlag;
    @XmlElement(name = "EXAM_StopVatDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examStopVatDt;
    @XmlElement(name = "EXAM_AltDt")
    protected String examAltDt;
    @XmlElement(name = "EXAM_MaturityRtNo")
    protected String examMaturityRtNo;
    @XmlElement(name = "EXAM_MaturityRtVar")
    protected BigDecimal examMaturityRtVar;
    @XmlElement(name = "EXAM_MaturityRtVarCode")
    protected String examMaturityRtVarCode;
    @XmlElement(name = "EXAM_MaturityRtFloor")
    protected BigDecimal examMaturityRtFloor;
    @XmlElement(name = "EXAM_MaturityRtCeiling")
    protected String examMaturityRtCeiling;
    @XmlElement(name = "EXAM_MaturityRtRvwDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examMaturityRtRvwDt;
    @XmlElement(name = "EXAM_MaturityRtRvwDay")
    protected String examMaturityRtRvwDay;
    @XmlElement(name = "EXAM_MaturityRtRvwTerm")
    protected String examMaturityRtRvwTerm;
    @XmlElement(name = "EXAM_MaturityRtRvwTM")
    protected String examMaturityRtRvwTM;
    @XmlElement(name = "EXAM_MaturityDealerRt")
    protected BigDecimal examMaturityDealerRt;
    @XmlElement(name = "EXAM_DefaultRtFlag")
    protected String examDefaultRtFlag;
    @XmlElement(name = "EXAM_ReinstateNormalRt")
    protected String examReinstateNormalRt;
    @XmlElement(name = "EXAM_DefaultRt")
    protected BigDecimal examDefaultRt;
    @XmlElement(name = "EXAM_DefaultRtNo")
    protected String examDefaultRtNo;
    @XmlElement(name = "EXAM_DefaultRtVar")
    protected BigDecimal examDefaultRtVar;
    @XmlElement(name = "EXAM_DefaultRtVarCode")
    protected String examDefaultRtVarCode;
    @XmlElement(name = "EXAM_MthDaySwitch")
    protected String examMthDaySwitch;
    @XmlElement(name = "EXAM_GracePrdCode")
    protected String examGracePrdCode;
    @XmlElement(name = "EXAM_AltPmtSch")
    protected String examAltPmtSch;
    @XmlElement(name = "EXAM_EmployerCode")
    protected String examEmployerCode;
    @XmlElement(name = "EXAM_TrancheMax")
    protected String examTrancheMax;
    @XmlElement(name = "EXAM_TrancheMin")
    protected String examTrancheMin;
    @XmlElement(name = "EXAM_PrincipalAmt")
    protected CurAmtType examPrincipalAmt;
    @XmlElement(name = "EXAM_ReleaseAmt")
    protected BigDecimal examReleaseAmt;
    @XmlElement(name = "EXAM_CummulativeDrawAmt")
    protected BigDecimal examCummulativeDrawAmt;
    @XmlElement(name = "EXAM_DrawingLimit")
    protected BigDecimal examDrawingLimit;
    @XmlElement(name = "EXAM_IslamicIndicator")
    protected String examIslamicIndicator;
    @XmlElement(name = "CurCode")
    protected String curCode;
    @XmlElement(name = "EXAM_RelationshipAccountNo")
    protected BigDecimal examRelationshipAccountNo;
    @XmlElement(name = "EXAM_ScheduledBalance")
    protected BigDecimal examScheduledBalance;
    @XmlElement(name = "EXAM_TotalPayableAmt")
    protected BigDecimal examTotalPayableAmt;
    @XmlElement(name = "EXAM_CurrentBillAmt")
    protected BigDecimal examCurrentBillAmt;
    @XmlElement(name = "EXAM_RedrawFacilityFlag")
    protected String examRedrawFacilityFlag;
    @XmlElement(name = "EXAM_AvailableRedrawLimit")
    protected BigDecimal examAvailableRedrawLimit;
    @XmlElement(name = "EXAM_CumulativeWithdrawLimit")
    protected BigDecimal examCumulativeWithdrawLimit;
    @XmlElement(name = "EXAM_CumulativeUtilizedAmt")
    protected BigDecimal examCumulativeUtilizedAmt;
    @XmlElement(name = "EXAM_RedrawMinAmt")
    protected BigDecimal examRedrawMinAmt;
    @XmlElement(name = "EXAM_NextPaymentDueDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examNextPaymentDueDt;
    @XmlElement(name = "EXAM_AllowRedraw")
    protected String examAllowRedraw;
    @XmlElement(name = "EXAM_AllowPrepayment")
    protected String examAllowPrepayment;
    @XmlElement(name = "EXAM_RelationshipAcctType")
    protected String examRelationshipAcctType;
    @XmlElement(name = "EXAM_FacilityStatus")
    protected String examFacilityStatus;
    @XmlElement(name = "EXAM_NumOfMnthInst")
    protected Long examNumOfMnthInst;
    @XmlElement(name = "EXAM_NumOfDayInst")
    protected Long examNumOfDayInst;
    @XmlElement(name = "EXAM_WriteOffIndicator")
    protected String examWriteOffIndicator;
    @XmlElement(name = "EXAM_SoldIndicator")
    protected String examSoldIndicator;

    /**
     * Gets the value of the examFirstPymtDt property.
     *
     * @return possible object is
     * {@link String }
     */
    public LocalDate getEXAMFirstPymtDt() {
        return examFirstPymtDt;
    }

    /**
     * Sets the value of the examFirstPymtDt property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMFirstPymtDt(LocalDate value) {
        this.examFirstPymtDt = value;
    }

    /**
     * Gets the value of the examFinalMaturityDt property.
     *
     * @return possible object is
     * {@link String }
     */
    public LocalDate getEXAMFinalMaturityDt() {
        return examFinalMaturityDt;
    }

    /**
     * Sets the value of the examFinalMaturityDt property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMFinalMaturityDt(LocalDate value) {
        this.examFinalMaturityDt = value;
    }

    /**
     * Gets the value of the examLastInstPaidAmt property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMLastInstPaidAmt() {
        return examLastInstPaidAmt;
    }

    /**
     * Sets the value of the examLastInstPaidAmt property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMLastInstPaidAmt(BigDecimal value) {
        this.examLastInstPaidAmt = value;
    }

    /**
     * Gets the value of the examPastDueDt property.
     *
     * @return possible object is
     * {@link String }
     */
    public LocalDate getEXAMPastDueDt() {
        return examPastDueDt;
    }

    /**
     * Sets the value of the examPastDueDt property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMPastDueDt(LocalDate value) {
        this.examPastDueDt = value;
    }

    /**
     * Gets the value of the examPayDueDt property.
     *
     * @return possible object is
     * {@link String }
     */
    public LocalDate getEXAMPayDueDt() {
        return examPayDueDt;
    }

    /**
     * Sets the value of the examPayDueDt property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMPayDueDt(LocalDate value) {
        this.examPayDueDt = value;
    }

    /**
     * Gets the value of the examMaturityDt property.
     *
     * @return possible object is
     * {@link String }
     */
    public LocalDate getEXAMMaturityDt() {
        return examMaturityDt;
    }

    /**
     * Sets the value of the examMaturityDt property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMMaturityDt(LocalDate value) {
        this.examMaturityDt = value;
    }

    /**
     * Gets the value of the lastPmtDt property.
     *
     * @return possible object is
     * {@link String }
     */
    public LocalDate getLastPmtDt() {
        return lastPmtDt;
    }

    /**
     * Sets the value of the lastPmtDt property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLastPmtDt(LocalDate value) {
        this.lastPmtDt = value;
    }

    /**
     * Gets the value of the examAmtPaidToDt property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMAmtPaidToDt() {
        return examAmtPaidToDt;
    }

    /**
     * Sets the value of the examAmtPaidToDt property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMAmtPaidToDt(BigDecimal value) {
        this.examAmtPaidToDt = value;
    }

    /**
     * Gets the value of the examNextSchdPayDt property.
     *
     * @return possible object is
     * {@link String }
     */
    public LocalDate getEXAMNextSchdPayDt() {
        return examNextSchdPayDt;
    }

    /**
     * Sets the value of the examNextSchdPayDt property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMNextSchdPayDt(LocalDate value) {
        this.examNextSchdPayDt = value;
    }

    /**
     * Gets the value of the examFullReleaseDt property.
     *
     * @return possible object is
     * {@link String }
     */
    public LocalDate getEXAMFullReleaseDt() {
        return examFullReleaseDt;
    }

    /**
     * Sets the value of the examFullReleaseDt property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMFullReleaseDt(LocalDate value) {
        this.examFullReleaseDt = value;
    }

    /**
     * Gets the value of the examMonthsOverdue property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getEXAMMonthsOverdue() {
        return examMonthsOverdue;
    }

    /**
     * Sets the value of the examMonthsOverdue property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setEXAMMonthsOverdue(Long value) {
        this.examMonthsOverdue = value;
    }

    /**
     * Gets the value of the examInstAmt property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMInstAmt() {
        return examInstAmt;
    }

    /**
     * Sets the value of the examInstAmt property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMInstAmt(BigDecimal value) {
        this.examInstAmt = value;
    }

    /**
     * Gets the value of the examnplStatus property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMNPLStatus() {
        return examnplStatus;
    }

    /**
     * Sets the value of the examnplStatus property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMNPLStatus(String value) {
        this.examnplStatus = value;
    }

    /**
     * Gets the value of the examPartialPayAmt property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMPartialPayAmt() {
        return examPartialPayAmt;
    }

    /**
     * Sets the value of the examPartialPayAmt property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMPartialPayAmt(BigDecimal value) {
        this.examPartialPayAmt = value;
    }

    /**
     * Gets the value of the examVehicalNum property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMVehicalNum() {
        return examVehicalNum;
    }

    /**
     * Sets the value of the examVehicalNum property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMVehicalNum(String value) {
        this.examVehicalNum = value;
    }

    /**
     * Gets the value of the examProbStatus property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMProbStatus() {
        return examProbStatus;
    }

    /**
     * Sets the value of the examProbStatus property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMProbStatus(String value) {
        this.examProbStatus = value;
    }

    /**
     * Gets the value of the examProgPayment property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMProgPayment() {
        return examProgPayment;
    }

    /**
     * Sets the value of the examProgPayment property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMProgPayment(String value) {
        this.examProgPayment = value;
    }

    /**
     * Gets the value of the examCurrMntPay property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMCurrMntPay() {
        return examCurrMntPay;
    }

    /**
     * Sets the value of the examCurrMntPay property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMCurrMntPay(BigDecimal value) {
        this.examCurrMntPay = value;
    }

    /**
     * Gets the value of the examLegalStatus property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMLegalStatus() {
        return examLegalStatus;
    }

    /**
     * Sets the value of the examLegalStatus property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMLegalStatus(String value) {
        this.examLegalStatus = value;
    }

    /**
     * Gets the value of the rate property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the examDailyIntAmt property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMDailyIntAmt() {
        return examDailyIntAmt;
    }

    /**
     * Sets the value of the examDailyIntAmt property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMDailyIntAmt(BigDecimal value) {
        this.examDailyIntAmt = value;
    }

    /**
     * Gets the value of the examLoanTerm property.
     *
     * @return possible object is
     * {@link TermType }
     */
    public TermType getEXAMLoanTerm() {
        return examLoanTerm;
    }

    /**
     * Sets the value of the examLoanTerm property.
     *
     * @param value allowed object is
     *              {@link TermType }
     */
    public void setEXAMLoanTerm(TermType value) {
        this.examLoanTerm = value;
    }

    /**
     * Gets the value of the examUnpaidCurAmt property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examUnpaidCurAmt property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMUnpaidCurAmt().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompositeCurAmtType }
     */
    public List<CompositeCurAmtType> getEXAMUnpaidCurAmt() {
        if (examUnpaidCurAmt == null) {
            examUnpaidCurAmt = new ArrayList<>();
        }
        return this.examUnpaidCurAmt;
    }

    /**
     * Gets the value of the examnplClassCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMNPLClassCode() {
        return examnplClassCode;
    }

    /**
     * Sets the value of the examnplClassCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMNPLClassCode(String value) {
        this.examnplClassCode = value;
    }

    /**
     * Gets the value of the examRateFlag property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMRateFlag() {
        return examRateFlag;
    }

    /**
     * Sets the value of the examRateFlag property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMRateFlag(String value) {
        this.examRateFlag = value;
    }

    /**
     * Gets the value of the branchId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBranchId() {
        return branchId;
    }

    /**
     * Sets the value of the branchId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBranchId(String value) {
        this.branchId = value;
    }

    /**
     * Gets the value of the examInstallmentNo property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getEXAMInstallmentNo() {
        return examInstallmentNo;
    }

    /**
     * Sets the value of the examInstallmentNo property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setEXAMInstallmentNo(Long value) {
        this.examInstallmentNo = value;
    }

    /**
     * Gets the value of the examLastInstPrincipalAmt property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMLastInstPrincipalAmt() {
        return examLastInstPrincipalAmt;
    }

    /**
     * Sets the value of the examLastInstPrincipalAmt property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMLastInstPrincipalAmt(BigDecimal value) {
        this.examLastInstPrincipalAmt = value;
    }

    /**
     * Gets the value of the examLastInstInterestAmt property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMLastInstInterestAmt() {
        return examLastInstInterestAmt;
    }

    /**
     * Sets the value of the examLastInstInterestAmt property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMLastInstInterestAmt(BigDecimal value) {
        this.examLastInstInterestAmt = value;
    }

    /**
     * Gets the value of the examLastInstLateChargeAmt property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMLastInstLateChargeAmt() {
        return examLastInstLateChargeAmt;
    }

    /**
     * Sets the value of the examLastInstLateChargeAmt property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMLastInstLateChargeAmt(BigDecimal value) {
        this.examLastInstLateChargeAmt = value;
    }

    /**
     * Gets the value of the examPaidVia property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMPaidVia() {
        return examPaidVia;
    }

    /**
     * Sets the value of the examPaidVia property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMPaidVia(String value) {
        this.examPaidVia = value;
    }

    /**
     * Gets the value of the examIndicator property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMIndicator() {
        return examIndicator;
    }

    /**
     * Sets the value of the examIndicator property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMIndicator(String value) {
        this.examIndicator = value;
    }

    /**
     * Gets the value of the examnplDate property.
     *
     * @return possible object is
     * {@link String }
     */
    public LocalDate getEXAMNPLDate() {
        return examnplDate;
    }

    /**
     * Sets the value of the examnplDate property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMNPLDate(LocalDate value) {
        this.examnplDate = value;
    }

    /**
     * Gets the value of the count property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setCount(Long value) {
        this.count = value;
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
     */
    public List<ExtAcctBalType> getExtAcctBal() {
        if (extAcctBal == null) {
            extAcctBal = new ArrayList<>();
        }
        return this.extAcctBal;
    }

    /**
     * Gets the value of the examAppNum property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMAppNum() {
        return examAppNum;
    }

    /**
     * Sets the value of the examAppNum property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMAppNum(String value) {
        this.examAppNum = value;
    }

    /**
     * Gets the value of the acctId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAcctId(String value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the loanAcctId property.
     *
     * @return possible object is
     * {@link LoanAcctIdType }
     */
    public LoanAcctIdType getLoanAcctId() {
        return loanAcctId;
    }

    /**
     * Sets the value of the loanAcctId property.
     *
     * @param value allowed object is
     *              {@link LoanAcctIdType }
     */
    public void setLoanAcctId(LoanAcctIdType value) {
        this.loanAcctId = value;
    }

    /**
     * Gets the value of the examFacilityId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMFacilityId() {
        return examFacilityId;
    }

    /**
     * Sets the value of the examFacilityId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMFacilityId(String value) {
        this.examFacilityId = value;
    }

    /**
     * Gets the value of the seqNum property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getSeqNum() {
        return seqNum;
    }

    /**
     * Sets the value of the seqNum property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setSeqNum(Long value) {
        this.seqNum = value;
    }

    /**
     * Gets the value of the examPartID property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMPartID() {
        return examPartID;
    }

    /**
     * Sets the value of the examPartID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMPartID(String value) {
        this.examPartID = value;
    }

    /**
     * Gets the value of the examEntityNum property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMEntityNum() {
        return examEntityNum;
    }

    /**
     * Sets the value of the examEntityNum property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMEntityNum(String value) {
        this.examEntityNum = value;
    }

    /**
     * Gets the value of the examRelationshipCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMRelationshipCode() {
        return examRelationshipCode;
    }

    /**
     * Sets the value of the examRelationshipCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMRelationshipCode(String value) {
        this.examRelationshipCode = value;
    }

    /**
     * Gets the value of the examAppType property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMAppType() {
        return examAppType;
    }

    /**
     * Sets the value of the examAppType property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMAppType(String value) {
        this.examAppType = value;
    }

    /**
     * Gets the value of the category property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the desc property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the examMultiCurIndicator property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMMultiCurIndicator() {
        return examMultiCurIndicator;
    }

    /**
     * Sets the value of the examMultiCurIndicator property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMMultiCurIndicator(String value) {
        this.examMultiCurIndicator = value;
    }

    /**
     * Gets the value of the examNewAcctIndicator property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMNewAcctIndicator() {
        return examNewAcctIndicator;
    }

    /**
     * Sets the value of the examNewAcctIndicator property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMNewAcctIndicator(String value) {
        this.examNewAcctIndicator = value;
    }

    /**
     * Gets the value of the examsptfIndicator property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMSPTFIndicator() {
        return examsptfIndicator;
    }

    /**
     * Sets the value of the examsptfIndicator property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMSPTFIndicator(String value) {
        this.examsptfIndicator = value;
    }

    /**
     * Gets the value of the examLedgerBalReqIndicator property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMLedgerBalReqIndicator() {
        return examLedgerBalReqIndicator;
    }

    /**
     * Sets the value of the examLedgerBalReqIndicator property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMLedgerBalReqIndicator(String value) {
        this.examLedgerBalReqIndicator = value;
    }

    /**
     * Gets the value of the examInstOverdraftIndicator property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMInstOverdraftIndicator() {
        return examInstOverdraftIndicator;
    }

    /**
     * Sets the value of the examInstOverdraftIndicator property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMInstOverdraftIndicator(String value) {
        this.examInstOverdraftIndicator = value;
    }

    /**
     * Gets the value of the examMaintenanceIndicator property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMMaintenanceIndicator() {
        return examMaintenanceIndicator;
    }

    /**
     * Sets the value of the examMaintenanceIndicator property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMMaintenanceIndicator(String value) {
        this.examMaintenanceIndicator = value;
    }

    /**
     * Gets the value of the examRecordIndicator property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMRecordIndicator() {
        return examRecordIndicator;
    }

    /**
     * Sets the value of the examRecordIndicator property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMRecordIndicator(String value) {
        this.examRecordIndicator = value;
    }

    /**
     * Gets the value of the examIslamicInd property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMIslamicInd() {
        return examIslamicInd;
    }

    /**
     * Sets the value of the examIslamicInd property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMIslamicInd(String value) {
        this.examIslamicInd = value;
    }

    /**
     * Gets the value of the examYearBase property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMYearBase() {
        return examYearBase;
    }

    /**
     * Sets the value of the examYearBase property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMYearBase(String value) {
        this.examYearBase = value;
    }

    /**
     * Gets the value of the examIntFreq property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMIntFreq() {
        return examIntFreq;
    }

    /**
     * Sets the value of the examIntFreq property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMIntFreq(String value) {
        this.examIntFreq = value;
    }

    /**
     * Gets the value of the examsptfLoanType property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMSPTFLoanType() {
        return examsptfLoanType;
    }

    /**
     * Sets the value of the examsptfLoanType property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMSPTFLoanType(String value) {
        this.examsptfLoanType = value;
    }

    /**
     * Gets the value of the examPaymentCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMPaymentCode() {
        return examPaymentCode;
    }

    /**
     * Sets the value of the examPaymentCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMPaymentCode(String value) {
        this.examPaymentCode = value;
    }

    /**
     * Gets the value of the examIntPaymentFreq property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMIntPaymentFreq() {
        return examIntPaymentFreq;
    }

    /**
     * Sets the value of the examIntPaymentFreq property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMIntPaymentFreq(String value) {
        this.examIntPaymentFreq = value;
    }

    /**
     * Gets the value of the examIntPaymentFreqCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMIntPaymentFreqCode() {
        return examIntPaymentFreqCode;
    }

    /**
     * Sets the value of the examIntPaymentFreqCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMIntPaymentFreqCode(String value) {
        this.examIntPaymentFreqCode = value;
    }

    /**
     * Gets the value of the examDayOfMonthIntPayment property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMDayOfMonthIntPayment() {
        return examDayOfMonthIntPayment;
    }

    /**
     * Sets the value of the examDayOfMonthIntPayment property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMDayOfMonthIntPayment(String value) {
        this.examDayOfMonthIntPayment = value;
    }

    /**
     * Gets the value of the examNextSchIntPaymentDueDt property.
     *
     * @return possible object is
     * {@link String }
     */
    public LocalDate getEXAMNextSchIntPaymentDueDt() {
        return examNextSchIntPaymentDueDt;
    }

    /**
     * Sets the value of the examNextSchIntPaymentDueDt property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMNextSchIntPaymentDueDt(LocalDate value) {
        this.examNextSchIntPaymentDueDt = value;
    }

    /**
     * Gets the value of the examPaymentFreq property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMPaymentFreq() {
        return examPaymentFreq;
    }

    /**
     * Sets the value of the examPaymentFreq property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMPaymentFreq(String value) {
        this.examPaymentFreq = value;
    }

    /**
     * Gets the value of the examPaymentFreqCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMPaymentFreqCode() {
        return examPaymentFreqCode;
    }

    /**
     * Sets the value of the examPaymentFreqCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMPaymentFreqCode(String value) {
        this.examPaymentFreqCode = value;
    }

    /**
     * Gets the value of the examDayOfMonthPayment property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMDayOfMonthPayment() {
        return examDayOfMonthPayment;
    }

    /**
     * Sets the value of the examDayOfMonthPayment property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMDayOfMonthPayment(String value) {
        this.examDayOfMonthPayment = value;
    }

    /**
     * Gets the value of the examCapitalRepayment property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMCapitalRepayment() {
        return examCapitalRepayment;
    }

    /**
     * Sets the value of the examCapitalRepayment property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMCapitalRepayment(String value) {
        this.examCapitalRepayment = value;
    }

    /**
     * Gets the value of the examResidueValue property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMResidueValue() {
        return examResidueValue;
    }

    /**
     * Sets the value of the examResidueValue property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMResidueValue(String value) {
        this.examResidueValue = value;
    }

    /**
     * Gets the value of the examDealerCalMethod property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMDealerCalMethod() {
        return examDealerCalMethod;
    }

    /**
     * Sets the value of the examDealerCalMethod property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMDealerCalMethod(String value) {
        this.examDealerCalMethod = value;
    }

    /**
     * Gets the value of the examDealerRt property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMDealerRt() {
        return examDealerRt;
    }

    /**
     * Sets the value of the examDealerRt property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMDealerRt(BigDecimal value) {
        this.examDealerRt = value;
    }

    /**
     * Gets the value of the examCalRateDepoBase property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMCalRateDepoBase() {
        return examCalRateDepoBase;
    }

    /**
     * Sets the value of the examCalRateDepoBase property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMCalRateDepoBase(String value) {
        this.examCalRateDepoBase = value;
    }

    /**
     * Gets the value of the examMrtyIntRt property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMMrtyIntRt() {
        return examMrtyIntRt;
    }

    /**
     * Sets the value of the examMrtyIntRt property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMMrtyIntRt(BigDecimal value) {
        this.examMrtyIntRt = value;
    }

    /**
     * Gets the value of the examAdvMargin property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMAdvMargin() {
        return examAdvMargin;
    }

    /**
     * Sets the value of the examAdvMargin property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMAdvMargin(BigDecimal value) {
        this.examAdvMargin = value;
    }

    /**
     * Gets the value of the examPrimeRtnum property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMPrimeRtnum() {
        return examPrimeRtnum;
    }

    /**
     * Sets the value of the examPrimeRtnum property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMPrimeRtnum(BigDecimal value) {
        this.examPrimeRtnum = value;
    }

    /**
     * Gets the value of the examPrimeVar property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMPrimeVar() {
        return examPrimeVar;
    }

    /**
     * Sets the value of the examPrimeVar property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMPrimeVar(BigDecimal value) {
        this.examPrimeVar = value;
    }

    /**
     * Gets the value of the examPrimeVarCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMPrimeVarCode() {
        return examPrimeVarCode;
    }

    /**
     * Sets the value of the examPrimeVarCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMPrimeVarCode(String value) {
        this.examPrimeVarCode = value;
    }

    /**
     * Gets the value of the examRateVarFloor property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMRateVarFloor() {
        return examRateVarFloor;
    }

    /**
     * Sets the value of the examRateVarFloor property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMRateVarFloor(String value) {
        this.examRateVarFloor = value;
    }

    /**
     * Gets the value of the examRateVarCeil property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMRateVarCeil() {
        return examRateVarCeil;
    }

    /**
     * Sets the value of the examRateVarCeil property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMRateVarCeil(String value) {
        this.examRateVarCeil = value;
    }

    /**
     * Gets the value of the examPrimeRtFloor property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMPrimeRtFloor() {
        return examPrimeRtFloor;
    }

    /**
     * Sets the value of the examPrimeRtFloor property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMPrimeRtFloor(BigDecimal value) {
        this.examPrimeRtFloor = value;
    }

    /**
     * Gets the value of the examPrimeRtCeiling property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMPrimeRtCeiling() {
        return examPrimeRtCeiling;
    }

    /**
     * Sets the value of the examPrimeRtCeiling property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMPrimeRtCeiling(BigDecimal value) {
        this.examPrimeRtCeiling = value;
    }

    /**
     * Gets the value of the examLoanIntRt property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMLoanIntRt() {
        return examLoanIntRt;
    }

    /**
     * Sets the value of the examLoanIntRt property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMLoanIntRt(BigDecimal value) {
        this.examLoanIntRt = value;
    }

    /**
     * Gets the value of the examPrimeReviewDt property.
     *
     * @return possible object is
     * {@link String }
     */
    public LocalDate getEXAMPrimeReviewDt() {
        return examPrimeReviewDt;
    }

    /**
     * Sets the value of the examPrimeReviewDt property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMPrimeReviewDt(LocalDate value) {
        this.examPrimeReviewDt = value;
    }

    /**
     * Gets the value of the examPrimeRvwTerm property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMPrimeRvwTerm() {
        return examPrimeRvwTerm;
    }

    /**
     * Sets the value of the examPrimeRvwTerm property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMPrimeRvwTerm(String value) {
        this.examPrimeRvwTerm = value;
    }

    /**
     * Gets the value of the examPrimeRvwTermCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMPrimeRvwTermCode() {
        return examPrimeRvwTermCode;
    }

    /**
     * Sets the value of the examPrimeRvwTermCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMPrimeRvwTermCode(String value) {
        this.examPrimeRvwTermCode = value;
    }

    /**
     * Gets the value of the examRateRvwDay property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMRateRvwDay() {
        return examRateRvwDay;
    }

    /**
     * Sets the value of the examRateRvwDay property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMRateRvwDay(String value) {
        this.examRateRvwDay = value;
    }

    /**
     * Gets the value of the examReviewDt property.
     *
     * @return possible object is
     * {@link String }
     */
    public LocalDate getEXAMReviewDt() {
        return examReviewDt;
    }

    /**
     * Sets the value of the examReviewDt property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMReviewDt(LocalDate value) {
        this.examReviewDt = value;
    }

    /**
     * Gets the value of the examRvwTerm property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMRvwTerm() {
        return examRvwTerm;
    }

    /**
     * Sets the value of the examRvwTerm property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMRvwTerm(String value) {
        this.examRvwTerm = value;
    }

    /**
     * Gets the value of the examRvwTermCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMRvwTermCode() {
        return examRvwTermCode;
    }

    /**
     * Sets the value of the examRvwTermCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMRvwTermCode(String value) {
        this.examRvwTermCode = value;
    }

    /**
     * Gets the value of the examRtUsrRvwDay property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMRtUsrRvwDay() {
        return examRtUsrRvwDay;
    }

    /**
     * Sets the value of the examRtUsrRvwDay property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMRtUsrRvwDay(String value) {
        this.examRtUsrRvwDay = value;
    }

    /**
     * Gets the value of the examCalInstlNearestDollar property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMCalInstlNearestDollar() {
        return examCalInstlNearestDollar;
    }

    /**
     * Sets the value of the examCalInstlNearestDollar property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMCalInstlNearestDollar(String value) {
        this.examCalInstlNearestDollar = value;
    }

    /**
     * Gets the value of the examCapAccrueOEM property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMCapAccrueOEM() {
        return examCapAccrueOEM;
    }

    /**
     * Sets the value of the examCapAccrueOEM property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMCapAccrueOEM(String value) {
        this.examCapAccrueOEM = value;
    }

    /**
     * Gets the value of the examAvailLimit property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMAvailLimit() {
        return examAvailLimit;
    }

    /**
     * Sets the value of the examAvailLimit property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMAvailLimit(String value) {
        this.examAvailLimit = value;
    }

    /**
     * Gets the value of the examOfficerCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMOfficerCode() {
        return examOfficerCode;
    }

    /**
     * Sets the value of the examOfficerCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMOfficerCode(String value) {
        this.examOfficerCode = value;
    }

    /**
     * Gets the value of the examBankDeptCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMBankDeptCode() {
        return examBankDeptCode;
    }

    /**
     * Sets the value of the examBankDeptCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMBankDeptCode(String value) {
        this.examBankDeptCode = value;
    }

    /**
     * Gets the value of the examGraceFPDTCal property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMGraceFPDTCal() {
        return examGraceFPDTCal;
    }

    /**
     * Sets the value of the examGraceFPDTCal property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMGraceFPDTCal(String value) {
        this.examGraceFPDTCal = value;
    }

    /**
     * Gets the value of the examIncludeOrgamt property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMIncludeOrgamt() {
        return examIncludeOrgamt;
    }

    /**
     * Sets the value of the examIncludeOrgamt property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMIncludeOrgamt(String value) {
        this.examIncludeOrgamt = value;
    }

    /**
     * Gets the value of the examLateChargeType property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMLateChargeType() {
        return examLateChargeType;
    }

    /**
     * Sets the value of the examLateChargeType property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMLateChargeType(BigDecimal value) {
        this.examLateChargeType = value;
    }

    /**
     * Gets the value of the examLateChargeRate property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMLateChargeRate() {
        return examLateChargeRate;
    }

    /**
     * Sets the value of the examLateChargeRate property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMLateChargeRate(BigDecimal value) {
        this.examLateChargeRate = value;
    }

    /**
     * Gets the value of the examAutoUpliftAdvPmt property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMAutoUpliftAdvPmt() {
        return examAutoUpliftAdvPmt;
    }

    /**
     * Sets the value of the examAutoUpliftAdvPmt property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMAutoUpliftAdvPmt(String value) {
        this.examAutoUpliftAdvPmt = value;
    }

    /**
     * Gets the value of the examAutoUpdatePmtCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMAutoUpdatePmtCode() {
        return examAutoUpdatePmtCode;
    }

    /**
     * Sets the value of the examAutoUpdatePmtCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMAutoUpdatePmtCode(String value) {
        this.examAutoUpdatePmtCode = value;
    }

    /**
     * Gets the value of the examPmtCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMPmtCode() {
        return examPmtCode;
    }

    /**
     * Sets the value of the examPmtCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMPmtCode(String value) {
        this.examPmtCode = value;
    }

    /**
     * Gets the value of the examCommisionChargeIndicator property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMCommisionChargeIndicator() {
        return examCommisionChargeIndicator;
    }

    /**
     * Sets the value of the examCommisionChargeIndicator property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMCommisionChargeIndicator(String value) {
        this.examCommisionChargeIndicator = value;
    }

    /**
     * Gets the value of the examDealerNo property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMDealerNo() {
        return examDealerNo;
    }

    /**
     * Sets the value of the examDealerNo property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMDealerNo(String value) {
        this.examDealerNo = value;
    }

    /**
     * Gets the value of the examFixedIntRt property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMFixedIntRt() {
        return examFixedIntRt;
    }

    /**
     * Sets the value of the examFixedIntRt property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMFixedIntRt(BigDecimal value) {
        this.examFixedIntRt = value;
    }

    /**
     * Gets the value of the examMoraFixedIntRt property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMMoraFixedIntRt() {
        return examMoraFixedIntRt;
    }

    /**
     * Sets the value of the examMoraFixedIntRt property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMMoraFixedIntRt(BigDecimal value) {
        this.examMoraFixedIntRt = value;
    }

    /**
     * Gets the value of the examInvestAmt property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMInvestAmt() {
        return examInvestAmt;
    }

    /**
     * Sets the value of the examInvestAmt property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMInvestAmt(BigDecimal value) {
        this.examInvestAmt = value;
    }

    /**
     * Gets the value of the examInvestAmtVat property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMInvestAmtVat() {
        return examInvestAmtVat;
    }

    /**
     * Sets the value of the examInvestAmtVat property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMInvestAmtVat(BigDecimal value) {
        this.examInvestAmtVat = value;
    }

    /**
     * Gets the value of the examDownPmt property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMDownPmt() {
        return examDownPmt;
    }

    /**
     * Sets the value of the examDownPmt property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMDownPmt(BigDecimal value) {
        this.examDownPmt = value;
    }

    /**
     * Gets the value of the examDownPmtVat property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMDownPmtVat() {
        return examDownPmtVat;
    }

    /**
     * Sets the value of the examDownPmtVat property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMDownPmtVat(BigDecimal value) {
        this.examDownPmtVat = value;
    }

    /**
     * Gets the value of the examCarPrice property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMCarPrice() {
        return examCarPrice;
    }

    /**
     * Sets the value of the examCarPrice property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMCarPrice(BigDecimal value) {
        this.examCarPrice = value;
    }

    /**
     * Gets the value of the examCarVat property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMCarVat() {
        return examCarVat;
    }

    /**
     * Sets the value of the examCarVat property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMCarVat(BigDecimal value) {
        this.examCarVat = value;
    }

    /**
     * Gets the value of the examTotVat property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMTotVat() {
        return examTotVat;
    }

    /**
     * Sets the value of the examTotVat property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMTotVat(BigDecimal value) {
        this.examTotVat = value;
    }

    /**
     * Gets the value of the examRemainingVat property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMRemainingVat() {
        return examRemainingVat;
    }

    /**
     * Sets the value of the examRemainingVat property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMRemainingVat(BigDecimal value) {
        this.examRemainingVat = value;
    }

    /**
     * Gets the value of the examVatPmtAmt property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMVatPmtAmt() {
        return examVatPmtAmt;
    }

    /**
     * Sets the value of the examVatPmtAmt property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMVatPmtAmt(BigDecimal value) {
        this.examVatPmtAmt = value;
    }

    /**
     * Gets the value of the examVatFinalPmtAmt property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMVatFinalPmtAmt() {
        return examVatFinalPmtAmt;
    }

    /**
     * Sets the value of the examVatFinalPmtAmt property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMVatFinalPmtAmt(BigDecimal value) {
        this.examVatFinalPmtAmt = value;
    }

    /**
     * Gets the value of the examCloseAcctMinVat property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMCloseAcctMinVat() {
        return examCloseAcctMinVat;
    }

    /**
     * Sets the value of the examCloseAcctMinVat property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMCloseAcctMinVat(String value) {
        this.examCloseAcctMinVat = value;
    }

    /**
     * Gets the value of the examStopVatFlag property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMStopVatFlag() {
        return examStopVatFlag;
    }

    /**
     * Sets the value of the examStopVatFlag property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMStopVatFlag(String value) {
        this.examStopVatFlag = value;
    }

    /**
     * Gets the value of the examStopVatDt property.
     *
     * @return possible object is
     * {@link String }
     */
    public LocalDate getEXAMStopVatDt() {
        return examStopVatDt;
    }

    /**
     * Sets the value of the examStopVatDt property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMStopVatDt(LocalDate value) {
        this.examStopVatDt = value;
    }

    /**
     * Gets the value of the examAltDt property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMAltDt() {
        return examAltDt;
    }

    /**
     * Sets the value of the examAltDt property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMAltDt(String value) {
        this.examAltDt = value;
    }

    /**
     * Gets the value of the examMaturityRtNo property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMMaturityRtNo() {
        return examMaturityRtNo;
    }

    /**
     * Sets the value of the examMaturityRtNo property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMMaturityRtNo(String value) {
        this.examMaturityRtNo = value;
    }

    /**
     * Gets the value of the examMaturityRtVar property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMMaturityRtVar() {
        return examMaturityRtVar;
    }

    /**
     * Sets the value of the examMaturityRtVar property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMMaturityRtVar(BigDecimal value) {
        this.examMaturityRtVar = value;
    }

    /**
     * Gets the value of the examMaturityRtVarCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMMaturityRtVarCode() {
        return examMaturityRtVarCode;
    }

    /**
     * Sets the value of the examMaturityRtVarCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMMaturityRtVarCode(String value) {
        this.examMaturityRtVarCode = value;
    }

    /**
     * Gets the value of the examMaturityRtFloor property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMMaturityRtFloor() {
        return examMaturityRtFloor;
    }

    /**
     * Sets the value of the examMaturityRtFloor property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMMaturityRtFloor(BigDecimal value) {
        this.examMaturityRtFloor = value;
    }

    /**
     * Gets the value of the examMaturityRtCeiling property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMMaturityRtCeiling() {
        return examMaturityRtCeiling;
    }

    /**
     * Sets the value of the examMaturityRtCeiling property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMMaturityRtCeiling(String value) {
        this.examMaturityRtCeiling = value;
    }

    /**
     * Gets the value of the examMaturityRtRvwDt property.
     *
     * @return possible object is
     * {@link String }
     */
    public LocalDate getEXAMMaturityRtRvwDt() {
        return examMaturityRtRvwDt;
    }

    /**
     * Sets the value of the examMaturityRtRvwDt property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMMaturityRtRvwDt(LocalDate value) {
        this.examMaturityRtRvwDt = value;
    }

    /**
     * Gets the value of the examMaturityRtRvwDay property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMMaturityRtRvwDay() {
        return examMaturityRtRvwDay;
    }

    /**
     * Sets the value of the examMaturityRtRvwDay property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMMaturityRtRvwDay(String value) {
        this.examMaturityRtRvwDay = value;
    }

    /**
     * Gets the value of the examMaturityRtRvwTerm property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMMaturityRtRvwTerm() {
        return examMaturityRtRvwTerm;
    }

    /**
     * Sets the value of the examMaturityRtRvwTerm property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMMaturityRtRvwTerm(String value) {
        this.examMaturityRtRvwTerm = value;
    }

    /**
     * Gets the value of the examMaturityRtRvwTM property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMMaturityRtRvwTM() {
        return examMaturityRtRvwTM;
    }

    /**
     * Sets the value of the examMaturityRtRvwTM property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMMaturityRtRvwTM(String value) {
        this.examMaturityRtRvwTM = value;
    }

    /**
     * Gets the value of the examMaturityDealerRt property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMMaturityDealerRt() {
        return examMaturityDealerRt;
    }

    /**
     * Sets the value of the examMaturityDealerRt property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMMaturityDealerRt(BigDecimal value) {
        this.examMaturityDealerRt = value;
    }

    /**
     * Gets the value of the examDefaultRtFlag property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMDefaultRtFlag() {
        return examDefaultRtFlag;
    }

    /**
     * Sets the value of the examDefaultRtFlag property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMDefaultRtFlag(String value) {
        this.examDefaultRtFlag = value;
    }

    /**
     * Gets the value of the examReinstateNormalRt property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMReinstateNormalRt() {
        return examReinstateNormalRt;
    }

    /**
     * Sets the value of the examReinstateNormalRt property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMReinstateNormalRt(String value) {
        this.examReinstateNormalRt = value;
    }

    /**
     * Gets the value of the examDefaultRt property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMDefaultRt() {
        return examDefaultRt;
    }

    /**
     * Sets the value of the examDefaultRt property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMDefaultRt(BigDecimal value) {
        this.examDefaultRt = value;
    }

    /**
     * Gets the value of the examDefaultRtNo property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMDefaultRtNo() {
        return examDefaultRtNo;
    }

    /**
     * Sets the value of the examDefaultRtNo property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMDefaultRtNo(String value) {
        this.examDefaultRtNo = value;
    }

    /**
     * Gets the value of the examDefaultRtVar property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMDefaultRtVar() {
        return examDefaultRtVar;
    }

    /**
     * Sets the value of the examDefaultRtVar property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMDefaultRtVar(BigDecimal value) {
        this.examDefaultRtVar = value;
    }

    /**
     * Gets the value of the examDefaultRtVarCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMDefaultRtVarCode() {
        return examDefaultRtVarCode;
    }

    /**
     * Sets the value of the examDefaultRtVarCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMDefaultRtVarCode(String value) {
        this.examDefaultRtVarCode = value;
    }

    /**
     * Gets the value of the examMthDaySwitch property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMMthDaySwitch() {
        return examMthDaySwitch;
    }

    /**
     * Sets the value of the examMthDaySwitch property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMMthDaySwitch(String value) {
        this.examMthDaySwitch = value;
    }

    /**
     * Gets the value of the examGracePrdCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMGracePrdCode() {
        return examGracePrdCode;
    }

    /**
     * Sets the value of the examGracePrdCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMGracePrdCode(String value) {
        this.examGracePrdCode = value;
    }

    /**
     * Gets the value of the examAltPmtSch property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMAltPmtSch() {
        return examAltPmtSch;
    }

    /**
     * Sets the value of the examAltPmtSch property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMAltPmtSch(String value) {
        this.examAltPmtSch = value;
    }

    /**
     * Gets the value of the examEmployerCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMEmployerCode() {
        return examEmployerCode;
    }

    /**
     * Sets the value of the examEmployerCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMEmployerCode(String value) {
        this.examEmployerCode = value;
    }

    /**
     * Gets the value of the examTrancheMax property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMTrancheMax() {
        return examTrancheMax;
    }

    /**
     * Sets the value of the examTrancheMax property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMTrancheMax(String value) {
        this.examTrancheMax = value;
    }

    /**
     * Gets the value of the examTrancheMin property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMTrancheMin() {
        return examTrancheMin;
    }

    /**
     * Sets the value of the examTrancheMin property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMTrancheMin(String value) {
        this.examTrancheMin = value;
    }

    /**
     * Gets the value of the examPrincipalAmt property.
     *
     * @return possible object is
     * {@link CurAmtType }
     */
    public CurAmtType getEXAMPrincipalAmt() {
        return examPrincipalAmt;
    }

    /**
     * Sets the value of the examPrincipalAmt property.
     *
     * @param value allowed object is
     *              {@link CurAmtType }
     */
    public void setEXAMPrincipalAmt(CurAmtType value) {
        this.examPrincipalAmt = value;
    }

    /**
     * Gets the value of the examReleaseAmt property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMReleaseAmt() {
        return examReleaseAmt;
    }

    /**
     * Sets the value of the examReleaseAmt property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMReleaseAmt(BigDecimal value) {
        this.examReleaseAmt = value;
    }

    /**
     * Gets the value of the examCummulativeDrawAmt property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMCummulativeDrawAmt() {
        return examCummulativeDrawAmt;
    }

    /**
     * Sets the value of the examCummulativeDrawAmt property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMCummulativeDrawAmt(BigDecimal value) {
        this.examCummulativeDrawAmt = value;
    }

    /**
     * Gets the value of the examDrawingLimit property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMDrawingLimit() {
        return examDrawingLimit;
    }

    /**
     * Sets the value of the examDrawingLimit property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMDrawingLimit(BigDecimal value) {
        this.examDrawingLimit = value;
    }

    /**
     * Gets the value of the examIslamicIndicator property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMIslamicIndicator() {
        return examIslamicIndicator;
    }

    /**
     * Sets the value of the examIslamicIndicator property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMIslamicIndicator(String value) {
        this.examIslamicIndicator = value;
    }

    /**
     * Gets the value of the curCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCurCode() {
        return curCode;
    }

    /**
     * Sets the value of the curCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCurCode(String value) {
        this.curCode = value;
    }

    /**
     * Gets the value of the examRelationshipAccountNo property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMRelationshipAccountNo() {
        return examRelationshipAccountNo;
    }

    /**
     * Sets the value of the examRelationshipAccountNo property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMRelationshipAccountNo(BigDecimal value) {
        this.examRelationshipAccountNo = value;
    }

    /**
     * Gets the value of the examScheduledBalance property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMScheduledBalance() {
        return examScheduledBalance;
    }

    /**
     * Sets the value of the examScheduledBalance property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMScheduledBalance(BigDecimal value) {
        this.examScheduledBalance = value;
    }

    /**
     * Gets the value of the examTotalPayableAmt property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMTotalPayableAmt() {
        return examTotalPayableAmt;
    }

    /**
     * Sets the value of the examTotalPayableAmt property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMTotalPayableAmt(BigDecimal value) {
        this.examTotalPayableAmt = value;
    }

    /**
     * Gets the value of the examCurrentBillAmt property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMCurrentBillAmt() {
        return examCurrentBillAmt;
    }

    /**
     * Sets the value of the examCurrentBillAmt property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMCurrentBillAmt(BigDecimal value) {
        this.examCurrentBillAmt = value;
    }

    /**
     * Gets the value of the examRedrawFacilityFlag property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMRedrawFacilityFlag() {
        return examRedrawFacilityFlag;
    }

    /**
     * Sets the value of the examRedrawFacilityFlag property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMRedrawFacilityFlag(String value) {
        this.examRedrawFacilityFlag = value;
    }

    /**
     * Gets the value of the examAvailableRedrawLimit property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMAvailableRedrawLimit() {
        return examAvailableRedrawLimit;
    }

    /**
     * Sets the value of the examAvailableRedrawLimit property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMAvailableRedrawLimit(BigDecimal value) {
        this.examAvailableRedrawLimit = value;
    }

    /**
     * Gets the value of the examCumulativeWithdrawLimit property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMCumulativeWithdrawLimit() {
        return examCumulativeWithdrawLimit;
    }

    /**
     * Sets the value of the examCumulativeWithdrawLimit property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMCumulativeWithdrawLimit(BigDecimal value) {
        this.examCumulativeWithdrawLimit = value;
    }

    /**
     * Gets the value of the examCumulativeUtilizedAmt property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMCumulativeUtilizedAmt() {
        return examCumulativeUtilizedAmt;
    }

    /**
     * Sets the value of the examCumulativeUtilizedAmt property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMCumulativeUtilizedAmt(BigDecimal value) {
        this.examCumulativeUtilizedAmt = value;
    }

    /**
     * Gets the value of the examRedrawMinAmt property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getEXAMRedrawMinAmt() {
        return examRedrawMinAmt;
    }

    /**
     * Sets the value of the examRedrawMinAmt property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEXAMRedrawMinAmt(BigDecimal value) {
        this.examRedrawMinAmt = value;
    }

    /**
     * Gets the value of the examNextPaymentDueDt property.
     *
     * @return possible object is
     * {@link String }
     */
    public LocalDate getEXAMNextPaymentDueDt() {
        return examNextPaymentDueDt;
    }

    /**
     * Sets the value of the examNextPaymentDueDt property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMNextPaymentDueDt(LocalDate value) {
        this.examNextPaymentDueDt = value;
    }

    /**
     * Gets the value of the examAllowRedraw property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMAllowRedraw() {
        return examAllowRedraw;
    }

    /**
     * Sets the value of the examAllowRedraw property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMAllowRedraw(String value) {
        this.examAllowRedraw = value;
    }

    /**
     * Gets the value of the examAllowPrepayment property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMAllowPrepayment() {
        return examAllowPrepayment;
    }

    /**
     * Sets the value of the examAllowPrepayment property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMAllowPrepayment(String value) {
        this.examAllowPrepayment = value;
    }

    /**
     * Gets the value of the examRelationshipAcctType property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMRelationshipAcctType() {
        return examRelationshipAcctType;
    }

    /**
     * Sets the value of the examRelationshipAcctType property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMRelationshipAcctType(String value) {
        this.examRelationshipAcctType = value;
    }

    /**
     * Gets the value of the examFacilityStatus property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMFacilityStatus() {
        return examFacilityStatus;
    }

    /**
     * Sets the value of the examFacilityStatus property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMFacilityStatus(String value) {
        this.examFacilityStatus = value;
    }

    /**
     * Gets the value of the examNumOfMnthInst property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getEXAMNumOfMnthInst() {
        return examNumOfMnthInst;
    }

    /**
     * Sets the value of the examNumOfMnthInst property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setEXAMNumOfMnthInst(Long value) {
        this.examNumOfMnthInst = value;
    }

    /**
     * Gets the value of the examNumOfDayInst property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getEXAMNumOfDayInst() {
        return examNumOfDayInst;
    }

    /**
     * Sets the value of the examNumOfDayInst property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setEXAMNumOfDayInst(Long value) {
        this.examNumOfDayInst = value;
    }

    /**
     * Gets the value of the examWriteOffIndicator property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMWriteOffIndicator() {
        return examWriteOffIndicator;
    }

    /**
     * Sets the value of the examWriteOffIndicator property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMWriteOffIndicator(String value) {
        this.examWriteOffIndicator = value;
    }

    /**
     * Gets the value of the examSoldIndicator property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMSoldIndicator() {
        return examSoldIndicator;
    }

    /**
     * Sets the value of the examSoldIndicator property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMSoldIndicator(String value) {
        this.examSoldIndicator = value;
    }

}
