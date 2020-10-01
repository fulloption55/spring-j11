
package com.theerut.springj11.client.webservice.accountinquiry;

import com.theerut.springj11.client.webservice.common.EXAMContactDetailsType;
import com.theerut.springj11.client.webservice.common.EXAMGovIssueIdentType;
import com.theerut.springj11.client.webservice.common.EXAMNonFinSvcHeaderInfoType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>Java class for EXAM_AcctInqRq_Type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="EXAM_AcctInqRq_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RqUID"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NonFinSvcHeaderInfo"/>
 *         &lt;choice>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}AcctId"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CardNum"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CustPermId"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_FacilityId"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AppNum"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}Name"/>
 *         &lt;/choice>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctType"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurCode"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_GovIssueId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ContactDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RequestType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MSICCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_AcctInqRq_Type", propOrder = {
        "examRqUID",
        "examNonFinSvcHeaderInfo",
        "acctId",
        "examCardNum",
        "custPermId",
        "examFacilityId",
        "examAppNum",
        "name",
        "acctType",
        "curCode",
        "examGovIssueId",
        "examContactDetails",
        "examRequestType",
        "exammsicCode"
})
public class EXAMAcctInqRqType {

    @XmlElement(name = "EXAM_RqUID", required = true)
    protected String examRqUID;
    @XmlElement(name = "EXAM_NonFinSvcHeaderInfo", required = true)
    protected EXAMNonFinSvcHeaderInfoType examNonFinSvcHeaderInfo;
    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "EXAM_CardNum")
    protected String examCardNum;
    @XmlElement(name = "CustPermId")
    protected String custPermId;
    @XmlElement(name = "EXAM_FacilityId")
    protected String examFacilityId;
    @XmlElement(name = "EXAM_AppNum")
    protected String examAppNum;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "AcctType", required = true)
    protected String acctType;
    @XmlElement(name = "CurCode", required = true)
    protected String curCode;
    @XmlElement(name = "EXAM_GovIssueId")
    protected EXAMGovIssueIdentType examGovIssueId;
    @XmlElement(name = "EXAM_ContactDetails")
    protected List<EXAMContactDetailsType> examContactDetails;
    @XmlElement(name = "EXAM_RequestType")
    protected String examRequestType;
    @XmlElement(name = "EXAM_MSICCode")
    protected String exammsicCode;

    /**
     * Gets the value of the examRqUID property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMRqUID() {
        return examRqUID;
    }

    /**
     * Sets the value of the examRqUID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMRqUID(String value) {
        this.examRqUID = value;
    }

    /**
     * Gets the value of the examNonFinSvcHeaderInfo property.
     *
     * @return possible object is
     * {@link EXAMNonFinSvcHeaderInfoType }
     */
    public EXAMNonFinSvcHeaderInfoType getEXAMNonFinSvcHeaderInfo() {
        return examNonFinSvcHeaderInfo;
    }

    /**
     * Sets the value of the examNonFinSvcHeaderInfo property.
     *
     * @param value allowed object is
     *              {@link EXAMNonFinSvcHeaderInfoType }
     */
    public void setEXAMNonFinSvcHeaderInfo(EXAMNonFinSvcHeaderInfoType value) {
        this.examNonFinSvcHeaderInfo = value;
    }

    /**
     * Gets the value of the acctId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAcctId(String value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the examCardNum property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMCardNum() {
        return examCardNum;
    }

    /**
     * Sets the value of the examCardNum property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMCardNum(String value) {
        this.examCardNum = value;
    }

    /**
     * Gets the value of the custPermId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCustPermId() {
        return custPermId;
    }

    /**
     * Sets the value of the custPermId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCustPermId(String value) {
        this.custPermId = value;
    }

    /**
     * Gets the value of the examFacilityId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMFacilityId() {
        return examFacilityId;
    }

    /**
     * Sets the value of the examFacilityId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMFacilityId(String value) {
        this.examFacilityId = value;
    }

    /**
     * Gets the value of the examAppNum property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMAppNum() {
        return examAppNum;
    }

    /**
     * Sets the value of the examAppNum property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMAppNum(String value) {
        this.examAppNum = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the acctType property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAcctType() {
        return acctType;
    }

    /**
     * Sets the value of the acctType property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAcctType(String value) {
        this.acctType = value;
    }

    /**
     * Gets the value of the curCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCurCode() {
        return curCode;
    }

    /**
     * Sets the value of the curCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCurCode(String value) {
        this.curCode = value;
    }

    /**
     * Gets the value of the examGovIssueId property.
     *
     * @return possible object is
     * {@link EXAMGovIssueIdentType }
     */
    public EXAMGovIssueIdentType getEXAMGovIssueId() {
        return examGovIssueId;
    }

    /**
     * Sets the value of the examGovIssueId property.
     *
     * @param value allowed object is
     *              {@link EXAMGovIssueIdentType }
     */
    public void setEXAMGovIssueId(EXAMGovIssueIdentType value) {
        this.examGovIssueId = value;
    }

    /**
     * Gets the value of the examContactDetails property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examContactDetails property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMContactDetails().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMContactDetailsType }
     */
    public List<EXAMContactDetailsType> getEXAMContactDetails() {
        if (examContactDetails == null) {
            examContactDetails = new ArrayList<>();
        }
        return this.examContactDetails;
    }

    /**
     * Gets the value of the examRequestType property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMRequestType() {
        return examRequestType;
    }

    /**
     * Sets the value of the examRequestType property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMRequestType(String value) {
        this.examRequestType = value;
    }

    /**
     * Gets the value of the exammsicCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEXAMMSICCode() {
        return exammsicCode;
    }

    /**
     * Sets the value of the exammsicCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEXAMMSICCode(String value) {
        this.exammsicCode = value;
    }

}
