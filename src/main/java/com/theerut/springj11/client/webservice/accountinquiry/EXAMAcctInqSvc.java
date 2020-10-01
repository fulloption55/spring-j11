
package com.theerut.springj11.client.webservice.accountinquiry;

import com.theerut.springj11.client.webservice.common.EXAMSignonRqType;
import com.theerut.springj11.client.webservice.common.EXAMSignonRsType;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "examSignonRq",
        "examAcctInqRq",
        "examSignonRs",
        "examAcctInqRs"
})
@XmlRootElement(name = "EXAM_AcctInqSvc")
public class EXAMAcctInqSvc {

    @XmlElement(name = "EXAM_SignonRq")
    protected EXAMSignonRqType examSignonRq;
    @XmlElement(name = "EXAM_AcctInqRq")
    protected EXAMAcctInqRqType examAcctInqRq;
    @XmlElement(name = "EXAM_SignonRs")
    protected EXAMSignonRsType examSignonRs;
    @XmlElement(name = "EXAM_AcctInqRs")
    protected EXAMAcctInqRsType examAcctInqRs;
    @XmlAttribute(name = "coreSchemaVersion", required = true)
    protected BigDecimal coreSchemaVersion;

}
