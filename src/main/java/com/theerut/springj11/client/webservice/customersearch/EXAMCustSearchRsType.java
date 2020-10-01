//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.04 at 02:50:30 PM ICT 
//


package com.theerut.springj11.client.webservice.customersearch;

import com.theerut.springj11.client.webservice.ExamResponseInterface;
import com.theerut.springj11.client.webservice.accountsummary.EXAMPersonInfoType;
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
 * <p>Java class for EXAM_CustSearchRs_Type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="EXAM_CustSearchRs_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RqUID"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Status"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}Status"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PersonInfo" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;group ref="{urn:ifxforum-org:XSD:1}EXAM_ExtnGroup"/>
 *         &lt;/sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CustSearch" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_CustSearchRs_Type", propOrder = {
        "examRqUID",
        "examStatus",
        "status",
        "examPersonInfo",
        "examExtnInfo",
        "examCustSearch"
})
public class EXAMCustSearchRsType implements ExamResponseInterface {

    @XmlElement(name = "EXAM_RqUID", required = true)
    protected String examRqUID;
    @XmlElement(name = "EXAM_Status")
    protected EXAMStatusType examStatus;
    @XmlElement(name = "Status")
    protected StatusType status;
    @XmlElement(name = "EXAM_PersonInfo")
    protected List<EXAMPersonInfoType> examPersonInfo;
    @XmlElement(name = "EXAM_ExtnInfo")
    protected List<EXAMExtensionInfoType> examExtnInfo;
    @XmlElement(name = "EXAM_CustSearch")
    protected List<EXAMCustSearchType> examCustSearch;


}