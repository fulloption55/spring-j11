
package com.theerut.springj11.client.webservice.accountinquiry;

import com.theerut.springj11.client.webservice.ExamResponseInterface;
import com.theerut.springj11.client.webservice.accountsummary.EXAMAcctInfoType;
import com.theerut.springj11.client.webservice.common.EXAMContactDetailsType;
import com.theerut.springj11.client.webservice.common.EXAMExtensionInfoType;
import com.theerut.springj11.client.webservice.common.EXAMStatusType;
import com.theerut.springj11.client.webservice.common.StatusType;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_AcctInqRs_Type", propOrder = {
        "examRqUID",
        "examStatus",
        "status",
        "examAcctInfo",
        "examCardAcctRel",
        "examContactDetails",
        "examExtnInfo",
        "examTaxReliefInd",
        "examPrintTaxInvInd"
})
public class EXAMAcctInqRsType implements ExamResponseInterface {

    @XmlElement(name = "EXAM_RqUID", required = true)
    protected String examRqUID;
    @XmlElement(name = "EXAM_Status")
    protected EXAMStatusType examStatus;
    @XmlElement(name = "Status")
    protected StatusType status;
    @XmlElement(name = "EXAM_AcctInfo")
    protected List<EXAMAcctInfoType> examAcctInfo;
    @XmlElement(name = "EXAM_CardAcctRel")
    protected String examCardAcctRel;
    @XmlElement(name = "EXAM_ContactDetails")
    protected List<EXAMContactDetailsType> examContactDetails;
    @XmlElement(name = "EXAM_ExtnInfo")
    protected List<EXAMExtensionInfoType> examExtnInfo;
    @XmlElement(name = "EXAM_TaxReliefInd")
    protected String examTaxReliefInd;
    @XmlElement(name = "EXAM_PrintTaxInvInd")
    protected String examPrintTaxInvInd;

}