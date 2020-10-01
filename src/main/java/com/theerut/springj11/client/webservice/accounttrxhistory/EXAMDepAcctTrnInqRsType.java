
package com.theerut.springj11.client.webservice.accounttrxhistory;

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


/**
 * <p>Java class for EXAM_DepAcctTrnInqRs_Type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="EXAM_DepAcctTrnInqRs_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RqUID"/>
 *         &lt;choice>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Status"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}Status"/>
 *         &lt;/choice>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DepAcctTrnRec" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;group ref="{urn:ifxforum-org:XSD:1}EXAM_ExtnGroup" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_DepAcctTrnInqRs_Type", propOrder = {
        "examRqUID",
        "examStatus",
        "status",
        "examDepAcctTrnRec",
        "examExtnInfo"
})
public class EXAMDepAcctTrnInqRsType implements ExamResponseInterface {

    @XmlElement(name = "EXAM_RqUID", required = true)
    protected String examRqUID;
    @XmlElement(name = "EXAM_Status")
    protected EXAMStatusType examStatus;
    @XmlElement(name = "Status")
    protected StatusType status;
    @XmlElement(name = "DepAcctTrnRec")
    protected List<EXAMDepAcctTrnRecType> examDepAcctTrnRec;
    @XmlElement(name = "EXAM_ExtnInfo")
    protected List<EXAMExtensionInfoType> examExtnInfo;

}
