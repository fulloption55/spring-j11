
package com.theerut.springj11.client.webservice.accountopen;

import com.theerut.springj11.client.webservice.accountsummary.EXAMAcctInfoType;
import com.theerut.springj11.client.webservice.accountsummary.EXAMAcctNameType;
import com.theerut.springj11.client.webservice.common.BankInfoType;
import com.theerut.springj11.client.webservice.common.EXAMContactDetailsType;
import com.theerut.springj11.client.webservice.common.EXAMExtensionInfoType;
import com.theerut.springj11.client.webservice.common.EXAMFinSvcHeaderInfoType;
import com.theerut.springj11.client.webservice.common.EXAMSecAcctDetailsType;
import com.theerut.springj11.client.webservice.common.CurAmtType;
import com.theerut.springj11.client.webservice.common.DepAcctIdType;
import com.theerut.springj11.client.webservice.common.EXAMGenericIdentificationType;
import com.theerut.springj11.utils.LocalDateAdapter;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_AcctOpnRq_Type", propOrder = {
        "examRqUID",
        "examFinSvcHeaderInfo",
        "examChannelCode",
        "acctType",
        "examProdCode",
        "bankInfo",
        "examDebitAcctId",
        "examTransferAmt",
        "examDepositAmt",
        "examatmCardTagTo",
        "examCardNum",
        "examOrgnFormRefId",
        "examPriAcctName",
        "examSecAcctName",
        "examSigningCond",
        "seqNum",
        "examShortName",
        "examGenId",
        "examParentAppId",
        "examSecAcctDetails",
        "examExtnInfo",
        "custPermId",
        "examContactDetails",
        "examAcctName",
        "examAddrInd",
        "examServicingRM",
        "openDt",
        "examPartnerCustPermId",
        "nickname",
        "count",
        "examCardStatus",
        "examAcctInfo"
})
public class EXAMAcctOpnRqType {

    @XmlElement(name = "EXAM_RqUID", required = true)
    protected String examRqUID;
    @XmlElement(name = "EXAM_FinSvcHeaderInfo", required = true)
    protected EXAMFinSvcHeaderInfoType examFinSvcHeaderInfo;
    @XmlElement(name = "EXAM_ChannelCode")
    protected String examChannelCode;
    @XmlElement(name = "AcctType", required = true)
    protected String acctType;
    @XmlElement(name = "EXAM_ProdCode", required = true)
    protected String examProdCode;
    @XmlElement(name = "BankInfo", required = true)
    protected BankInfoType bankInfo;
    @XmlElement(name = "EXAM_DebitAcctId", required = true)
    protected DepAcctIdType examDebitAcctId;
    @XmlElement(name = "EXAM_TransferAmt", required = true)
    protected CurAmtType examTransferAmt;
    @XmlElement(name = "EXAM_DepositAmt", required = true)
    protected CurAmtType examDepositAmt;
    @XmlElement(name = "EXAM_ATMCardTagTo", required = true)
    protected String examatmCardTagTo;
    @XmlElement(name = "EXAM_CardNum")
    protected String examCardNum;
    @XmlElement(name = "EXAM_OrgnFormRefId")
    protected Long examOrgnFormRefId;
    @XmlElement(name = "EXAM_PriAcctName")
    protected String examPriAcctName;
    @XmlElement(name = "EXAM_SecAcctName")
    protected String examSecAcctName;
    @XmlElement(name = "EXAM_SigningCond")
    protected String examSigningCond;
    @XmlElement(name = "SeqNum")
    protected Long seqNum;
    @XmlElement(name = "EXAM_ShortName")
    protected String examShortName;
    @XmlElement(name = "EXAM_GenId")
    protected EXAMGenericIdentificationType examGenId;
    @XmlElement(name = "EXAM_ParentAppId")
    protected String examParentAppId;
    @XmlElement(name = "EXAM_SecAcctDetails")
    protected List<EXAMSecAcctDetailsType> examSecAcctDetails;
    @XmlElement(name = "EXAM_ExtnInfo")
    protected List<EXAMExtensionInfoType> examExtnInfo;
    @XmlElement(name = "CustPermId")
    protected String custPermId;
    @XmlElement(name = "EXAM_ContactDetails")
    protected List<EXAMContactDetailsType> examContactDetails;
    @XmlElement(name = "EXAM_AcctName")
    protected EXAMAcctNameType examAcctName;
    @XmlElement(name = "EXAM_AddrInd")
    protected String examAddrInd;
    @XmlElement(name = "EXAM_ServicingRM")
    protected String examServicingRM;
    @XmlElement(name = "OpenDt")
    @XmlSchemaType(name = "date")
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    protected LocalDate openDt;
    @XmlElement(name = "EXAM_PartnerCustPermId")
    protected String examPartnerCustPermId;
    @XmlElement(name = "Nickname")
    protected String nickname;
    @XmlElement(name = "Count")
    protected Long count;
    @XmlElement(name = "EXAM_CardStatus")
    protected String examCardStatus;
    @XmlElement(name = "EXAM_AcctInfo")
    protected List<EXAMAcctInfoType> examAcctInfo;


}
