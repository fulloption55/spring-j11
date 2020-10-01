
package com.theerut.springj11.client.webservice.accountopen;

import com.theerut.springj11.client.webservice.ExamResponseInterface;
import com.theerut.springj11.client.webservice.accountsummary.EXAMAcctInfoType;
import com.theerut.springj11.client.webservice.accountsummary.EXAMAcctNameType;
import com.theerut.springj11.client.webservice.common.EXAMExtensionInfoType;
import com.theerut.springj11.client.webservice.common.EXAMStatusType;
import com.theerut.springj11.client.webservice.common.StatusType;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.util.List;


@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_AcctOpnRs_Type", propOrder = {
        "examRqUID",
        "examStatus",
        "status",
        "acctId",
        "acctType",
        "examExtnInfo",
        "rate",
        "branchId",
        "examAcctName",
        "examCardNum",
        "birthDt",
        "examCardStatus",
        "examIdentSerialNum",
        "examAnnulFeeDt",
        "examAddDt",
        "count",
        "examAcctInfo"
})
public class EXAMAcctOpnRsType implements ExamResponseInterface {

    @XmlElement(name = "EXAM_RqUID", required = true)
    protected String examRqUID;
    @XmlElement(name = "EXAM_Status")
    protected EXAMStatusType examStatus;
    @XmlElement(name = "Status")
    protected StatusType status;
    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "AcctType")
    protected String acctType;
    @XmlElement(name = "EXAM_ExtnInfo")
    protected List<EXAMExtensionInfoType> examExtnInfo;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "BranchId")
    protected String branchId;
    @XmlElement(name = "EXAM_AcctName")
    protected EXAMAcctNameType examAcctName;
    @XmlElement(name = "EXAM_CardNum")
    protected String examCardNum;
    @XmlElement(name = "BirthDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDt;
    @XmlElement(name = "EXAM_CardStatus")
    protected String examCardStatus;
    @XmlElement(name = "EXAM_IdentSerialNum")
    protected String examIdentSerialNum;
    @XmlElement(name = "EXAM_AnnulFeeDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar examAnnulFeeDt;
    @XmlElement(name = "EXAM_AddDt")
    protected Object examAddDt;
    @XmlElement(name = "Count")
    protected Long count;
    @XmlElement(name = "EXAM_AcctInfo")
    protected List<EXAMAcctInfoType> examAcctInfo;
}

