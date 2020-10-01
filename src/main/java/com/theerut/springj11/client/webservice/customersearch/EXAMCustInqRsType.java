
package com.theerut.springj11.client.webservice.customersearch;

import com.theerut.springj11.client.webservice.accountsummary.EXAMPersonInfoType;
import com.theerut.springj11.client.webservice.common.EXAMExtensionInfoType;
import com.theerut.springj11.client.webservice.common.EXAMStatusType;
import com.theerut.springj11.client.webservice.common.StatusType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_CustInqRs_Type", propOrder = {
    "examRqUID",
    "examStatus",
    "status",
    "examPersonInfo",
    "examLastMaintInfo",
    "examExtnInfo"
})
public class EXAMCustInqRsType {

    @XmlElement(name = "EXAM_RqUID", required = true)
    protected String examRqUID;
    @XmlElement(name = "EXAM_Status")
    protected EXAMStatusType examStatus;
    @XmlElement(name = "Status")
    protected StatusType status;
    @XmlElement(name = "EXAM_PersonInfo")
    protected EXAMPersonInfoType examPersonInfo;
    @XmlElement(name = "EXAM_LastMaintInfo")
    protected EXAMChkMaintInfoRecType examLastMaintInfo;
    @XmlElement(name = "EXAM_ExtnInfo")
    protected List<EXAMExtensionInfoType> examExtnInfo;

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
     * Gets the value of the examStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMStatusType }
     *     
     */
    public EXAMStatusType getEXAMStatus() {
        return examStatus;
    }

    /**
     * Sets the value of the examStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMStatusType }
     *     
     */
    public void setEXAMStatus(EXAMStatusType value) {
        this.examStatus = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the examPersonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMPersonInfoType }
     *     
     */
    public EXAMPersonInfoType getEXAMPersonInfo() {
        return examPersonInfo;
    }

    /**
     * Sets the value of the examPersonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMPersonInfoType }
     *     
     */
    public void setEXAMPersonInfo(EXAMPersonInfoType value) {
        this.examPersonInfo = value;
    }

    /**
     * Gets the value of the examLastMaintInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMChkMaintInfoRecType }
     *     
     */
    public EXAMChkMaintInfoRecType getEXAMLastMaintInfo() {
        return examLastMaintInfo;
    }

    /**
     * Sets the value of the examLastMaintInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMChkMaintInfoRecType }
     *     
     */
    public void setEXAMLastMaintInfo(EXAMChkMaintInfoRecType value) {
        this.examLastMaintInfo = value;
    }

    /**
     * Gets the value of the examExtnInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examExtnInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMExtnInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMExtensionInfoType }
     * 
     * 
     */
    public List<EXAMExtensionInfoType> getEXAMExtnInfo() {
        if (examExtnInfo == null) {
            examExtnInfo = new ArrayList<>();
        }
        return this.examExtnInfo;
    }


}
