
package com.theerut.springj11.client.webservice.customersearch;

import com.theerut.springj11.client.webservice.common.EXAMExtensionInfoType;
import com.theerut.springj11.client.webservice.common.EXAMNonFinSvcHeaderInfoType;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_CustInqRq_Type", propOrder = {
        "examRqUID",
        "examNonFinSvcHeaderInfo",
        "custPermId",
        "examExtnInfo"
})
public class EXAMCustInqRqType {

    @XmlElement(name = "EXAM_RqUID", required = true)
    protected String examRqUID;
    @XmlElement(name = "EXAM_NonFinSvcHeaderInfo", required = true)
    protected EXAMNonFinSvcHeaderInfoType examNonFinSvcHeaderInfo;
    @XmlElement(name = "CustPermId", required = true)
    protected String custPermId;
    @XmlElement(name = "EXAM_ExtnInfo")
    protected List<EXAMExtensionInfoType> examExtnInfo;


}
