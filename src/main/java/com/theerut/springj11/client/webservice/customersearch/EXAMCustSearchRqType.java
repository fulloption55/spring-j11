package com.theerut.springj11.client.webservice.customersearch;

import com.theerut.springj11.client.webservice.common.EXAMNonFinSvcHeaderInfoType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_CustSearchRq_Type", propOrder = {
        "examRqUID",
        "examNonFinSvcHeaderInfo",
        "examIdentSerialNum",
        "examGovIssueIdentType",
        "country",
        "custPermId",
        "examCustSearch"
})
public class EXAMCustSearchRqType {

    @XmlElement(name = "EXAM_RqUID", required = true)
    protected String examRqUID;
    @XmlElement(name = "EXAM_NonFinSvcHeaderInfo", required = true)
    protected EXAMNonFinSvcHeaderInfoType examNonFinSvcHeaderInfo;
    @XmlElement(name = "EXAM_IdentSerialNum", required = true)
    protected String examIdentSerialNum;
    @XmlElement(name = "EXAM_GovIssueIdentType")
    protected String examGovIssueIdentType;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "CustPermId")
    protected String custPermId;
    @XmlElement(name = "EXAM_CustSearch")
    protected EXAMCustSearchType examCustSearch;

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
     * Gets the value of the examIdentSerialNum property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEXAMIdentSerialNum() {
        return examIdentSerialNum;
    }

    /**
     * Sets the value of the examIdentSerialNum property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEXAMIdentSerialNum(String value) {
        this.examIdentSerialNum = value;
    }

    /**
     * Gets the value of the examGovIssueIdentType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEXAMGovIssueIdentType() {
        return examGovIssueIdentType;
    }

    /**
     * Sets the value of the examGovIssueIdentType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEXAMGovIssueIdentType(String value) {
        this.examGovIssueIdentType = value;
    }

    /**
     * Gets the value of the country property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCountry(String value) {
        this.country = value;
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
     * Gets the value of the examCustSearch property.
     *
     * @return
     *     possible object is
     *     {@link EXAMCustSearchType }
     *
     */
    public EXAMCustSearchType getEXAMCustSearch() {
        return examCustSearch;
    }

    /**
     * Sets the value of the examCustSearch property.
     *
     * @param value
     *     allowed object is
     *     {@link EXAMCustSearchType }
     *
     */
    public void setEXAMCustSearch(EXAMCustSearchType value) {
        this.examCustSearch = value;
    }


}
