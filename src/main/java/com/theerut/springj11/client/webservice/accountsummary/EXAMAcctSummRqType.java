
package com.theerut.springj11.client.webservice.accountsummary;

import com.theerut.springj11.client.webservice.common.EXAMNonFinSvcHeaderInfoType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXAM_AcctSummRq_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_AcctSummRq_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RqUID"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NonFinSvcHeaderInfo"/>
 *         &lt;choice>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CustPermId"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CardNum"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PrimaryId"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_FDAcctGrpNum"/>
 *         &lt;/choice>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IdentSerialNum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Indicator" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OrgNo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SecuredInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TandemKey" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IslamicInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SeqNum" minOccurs="0"/>
 *         &lt;group ref="{urn:ifxforum-org:XSD:1}EXAM_ExtnGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_AcctSummRq_Type", propOrder = {
    "examRqUID",
    "examNonFinSvcHeaderInfo",
    "custPermId",
    "examCardNum",
    "examfdAcctGrpNum",
    "acctType"
})
public class EXAMAcctSummRqType {

    @XmlElement(name = "EXAM_RqUID", required = true)
    protected String examRqUID;
    @XmlElement(name = "EXAM_NonFinSvcHeaderInfo", required = true)
    protected EXAMNonFinSvcHeaderInfoType examNonFinSvcHeaderInfo;
    @XmlElement(name = "CustPermId")
    protected String custPermId;
    @XmlElement(name = "EXAM_CardNum")
    protected String examCardNum;
    @XmlElement(name = "AcctType")
    protected String acctType;
    @XmlElement(name = "EXAM_FDAcctGrpNum")
    protected String examfdAcctGrpNum;

    /**
     * Gets the value of the examRqUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMRqUID() {
        return examRqUID;
    }

    /**
     * Sets the value of the examRqUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMRqUID(String value) {
        this.examRqUID = value;
    }

    /**
     * Gets the value of the examNonFinSvcHeaderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMNonFinSvcHeaderInfoType }
     *     
     */
    public EXAMNonFinSvcHeaderInfoType getEXAMNonFinSvcHeaderInfo() {
        return examNonFinSvcHeaderInfo;
    }

    /**
     * Sets the value of the examNonFinSvcHeaderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMNonFinSvcHeaderInfoType }
     *     
     */
    public void setEXAMNonFinSvcHeaderInfo(EXAMNonFinSvcHeaderInfoType value) {
        this.examNonFinSvcHeaderInfo = value;
    }

    /**
     * Gets the value of the custPermId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustPermId() {
        return custPermId;
    }

    /**
     * Sets the value of the custPermId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustPermId(String value) {
        this.custPermId = value;
    }

    /**
     * Gets the value of the examCardNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCardNum() {
        return examCardNum;
    }

    /**
     * Sets the value of the examCardNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCardNum(String value) {
        this.examCardNum = value;
    }
    /**
     * Gets the value of the acctType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctType() {
        return acctType;
    }

    /**
     * Sets the value of the acctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctType(String value) {
        this.acctType = value;
    }

    /**
     * Gets the value of the examfdAcctGrpNum property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEXAMFDAcctGrpNum() {
        return examfdAcctGrpNum;
    }

    /**
     * Sets the value of the examfdAcctGrpNum property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEXAMFDAcctGrpNum(String value) {
        this.examfdAcctGrpNum = value;
    }

}
