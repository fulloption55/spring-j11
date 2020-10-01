
package com.theerut.springj11.client.webservice.accountsummary;

import com.theerut.springj11.client.webservice.ExamResponseInterface;
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
@XmlType(name = "EXAM_AcctSummRs_Type", propOrder = {
    "examRqUID",
    "status",
    "examStatus",
    "examAcctInfo",
    "examExtnInfo"
})
public class EXAMAcctSummRsType implements ExamResponseInterface {

    @XmlElement(name = "EXAM_RqUID", required = true)
    protected String examRqUID;
    @XmlElement(name = "Status", required = true)
    protected StatusType status;
    @XmlElement(name = "EXAM_Status", required = true)
    protected EXAMStatusType examStatus;
    @XmlElement(name = "EXAM_AcctInfo")
    protected List<EXAMAcctInfoType> examAcctInfo;
    @XmlElement(name = "EXAM_ExtnInfo")
    protected List<EXAMExtensionInfoType> examExtnInfo;

}
