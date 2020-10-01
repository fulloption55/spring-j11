
package com.theerut.springj11.client.webservice.customersearch;

import com.theerut.springj11.client.webservice.common.EXAMExtensionInfoType;
import com.theerut.springj11.client.webservice.common.CurAmtType;
import com.theerut.springj11.client.webservice.common.DepAcctIdType;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_ChkStatusRec_Type", propOrder = {
    "depAcctId",
    "chkNum",
    "origDt",
    "curAmt",
    "chkIssueStatus",
    "paidDt",
    "examChkBookNum",
    "examPaidTm",
    "examExtnInfo"
})
public class EXAMChkStatusRecType {

    @XmlElement(name = "DepAcctId")
    protected DepAcctIdType depAcctId;
    @XmlElement(name = "ChkNum")
    protected String chkNum;
    @XmlElement(name = "OrigDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar origDt;
    @XmlElement(name = "CurAmt")
    protected CurAmtType curAmt;
    @XmlElement(name = "ChkIssueStatus")
    protected ChkIssueStatusType chkIssueStatus;
    @XmlElement(name = "PaidDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar paidDt;
    @XmlElement(name = "EXAM_ChkBookNum")
    protected String examChkBookNum;
    @XmlElement(name = "EXAM_PaidTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar examPaidTm;
    @XmlElement(name = "EXAM_ExtnInfo")
    protected List<EXAMExtensionInfoType> examExtnInfo;

    /**
     * Gets the value of the depAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link DepAcctIdType }
     *     
     */
    public DepAcctIdType getDepAcctId() {
        return depAcctId;
    }

    /**
     * Sets the value of the depAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAcctIdType }
     *     
     */
    public void setDepAcctId(DepAcctIdType value) {
        this.depAcctId = value;
    }

    /**
     * Gets the value of the chkNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChkNum() {
        return chkNum;
    }

    /**
     * Sets the value of the chkNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChkNum(String value) {
        this.chkNum = value;
    }

    /**
     * Gets the value of the origDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrigDt() {
        return origDt;
    }

    /**
     * Sets the value of the origDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrigDt(XMLGregorianCalendar value) {
        this.origDt = value;
    }

    /**
     * Gets the value of the curAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurAmtType }
     *     
     */
    public CurAmtType getCurAmt() {
        return curAmt;
    }

    /**
     * Sets the value of the curAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmtType }
     *     
     */
    public void setCurAmt(CurAmtType value) {
        this.curAmt = value;
    }

    /**
     * Gets the value of the chkIssueStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ChkIssueStatusType }
     *     
     */
    public ChkIssueStatusType getChkIssueStatus() {
        return chkIssueStatus;
    }

    /**
     * Sets the value of the chkIssueStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkIssueStatusType }
     *     
     */
    public void setChkIssueStatus(ChkIssueStatusType value) {
        this.chkIssueStatus = value;
    }

    /**
     * Gets the value of the paidDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaidDt() {
        return paidDt;
    }

    /**
     * Sets the value of the paidDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaidDt(XMLGregorianCalendar value) {
        this.paidDt = value;
    }

    /**
     * Gets the value of the examChkBookNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMChkBookNum() {
        return examChkBookNum;
    }

    /**
     * Sets the value of the examChkBookNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMChkBookNum(String value) {
        this.examChkBookNum = value;
    }

    /**
     * Gets the value of the examPaidTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEXAMPaidTm() {
        return examPaidTm;
    }

    /**
     * Sets the value of the examPaidTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEXAMPaidTm(XMLGregorianCalendar value) {
        this.examPaidTm = value;
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
