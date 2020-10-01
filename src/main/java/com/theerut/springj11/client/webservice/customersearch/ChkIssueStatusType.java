
package com.theerut.springj11.client.webservice.customersearch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChkIssueStatus_Type", propOrder = {
    "chkIssueStatusCode",
    "statusDesc",
    "effDt",
    "statusModBy"
})
public class ChkIssueStatusType {

    @XmlElement(name = "ChkIssueStatusCode", required = true)
    protected String chkIssueStatusCode;
    @XmlElement(name = "StatusDesc")
    protected String statusDesc;
    @XmlElement(name = "EffDt")
    protected String effDt;
    @XmlElement(name = "StatusModBy")
    protected String statusModBy;

    /**
     * Gets the value of the chkIssueStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChkIssueStatusCode() {
        return chkIssueStatusCode;
    }

    /**
     * Sets the value of the chkIssueStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChkIssueStatusCode(String value) {
        this.chkIssueStatusCode = value;
    }

    /**
     * Gets the value of the statusDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDesc() {
        return statusDesc;
    }

    /**
     * Sets the value of the statusDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDesc(String value) {
        this.statusDesc = value;
    }

    /**
     * Gets the value of the effDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffDt() {
        return effDt;
    }

    /**
     * Sets the value of the effDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffDt(String value) {
        this.effDt = value;
    }

    /**
     * Gets the value of the statusModBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusModBy() {
        return statusModBy;
    }

    /**
     * Sets the value of the statusModBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusModBy(String value) {
        this.statusModBy = value;
    }


}
