
package com.theerut.springj11.client.webservice.accountopen;

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
    "examAcctOpnRq",
    "examSignonRs",
    "examAcctOpnRs"
})
@XmlRootElement(name = "EXAM_AcctOpnSvc")
public class EXAMAcctOpnSvc {

    @XmlElement(name = "EXAM_SignonRq")
    protected EXAMSignonRqType examSignonRq;
    @XmlElement(name = "EXAM_AcctOpnRq")
    protected EXAMAcctOpnRqType examAcctOpnRq;
    @XmlElement(name = "EXAM_SignonRs")
    protected EXAMSignonRsType examSignonRs;
    @XmlElement(name = "EXAM_AcctOpnRs")
    protected EXAMAcctOpnRsType examAcctOpnRs;
    @XmlAttribute(name = "coreSchemaVersion", required = true)
    protected BigDecimal coreSchemaVersion;

}
