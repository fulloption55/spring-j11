
package com.theerut.springj11.client.webservice.fixedgroupsummary;

import com.theerut.springj11.client.webservice.ExamResponseInterface;
import com.theerut.springj11.client.webservice.accountsummary.EXAMAcctInfoType;
import com.theerut.springj11.client.webservice.common.EXAMExtensionInfoType;
import com.theerut.springj11.client.webservice.common.EXAMStatusType;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;


@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_FDGrpSummRs_Type", propOrder = {
        "examRqUID",
        "examStatus",
        "examAcctInfo",
        "examExtnInfo"
})
public class EXAMFDGrpSummRsType implements ExamResponseInterface {

    @XmlElement(name = "EXAM_RqUID", required = true)
    protected String examRqUID;
    @XmlElement(name = "EXAM_Status", required = true)
    protected EXAMStatusType examStatus;
    @XmlElement(name = "EXAM_AcctInfo")
    protected List<EXAMAcctInfoType> examAcctInfo;
    @XmlElement(name = "EXAM_ExtnInfo")
    protected List<EXAMExtensionInfoType> examExtnInfo;

}
