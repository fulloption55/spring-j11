
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for EXAM_XferInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_XferInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_XferAcct"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurAmt"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PrincipalAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CardExpDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DueDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AcctLen" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_GovIssueId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FullName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ContactInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ResStatus" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CitizenSts" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Remarks" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BaseEquAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CreditCardExpDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RefInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Reference" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CCTrnDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TrnDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Amt" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SellerId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BIC" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IPAddr" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IsResident" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ProductType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ShariahCompl" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ScndValInd" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_XferInfo_Type", propOrder = {
    "examXferAcct",
    "curAmt",
    "examPrincipalAmt",
    "examCardExpDt",
    "dueDt",
    "examAcctLen",
    "examGovIssueId",
    "fullName",
    "contactInfo",
    "examResStatus",
    "examCitizenSts",
    "examRemarks",
    "examBaseEquAmt",
    "examCreditCardExpDt",
    "custName",
    "refInfo",
    "examReference",
    "examccTrnDt",
    "examTrnDt",
    "examAmt",
    "examSellerId",
    "exambic",
    "examipAddr",
    "examIsResident",
    "examProductType",
    "examShariahCompl",
    "custType",
    "examScndValInd"
})
public class EXAMXferInfoType {

    @XmlElement(name = "EXAM_XferAcct", required = true)
    protected DepAcctIdType examXferAcct;
    @XmlElement(name = "CurAmt", required = true)
    protected CurAmtType curAmt;
    @XmlElement(name = "EXAM_PrincipalAmt")
    protected CurAmtType examPrincipalAmt;
    @XmlElement(name = "EXAM_CardExpDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar examCardExpDt;
    @XmlElement(name = "DueDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dueDt;
    @XmlElement(name = "EXAM_AcctLen")
    protected Long examAcctLen;
    @XmlElement(name = "EXAM_GovIssueId")
    protected EXAMGovIssueIdentType examGovIssueId;
    @XmlElement(name = "FullName")
    protected String fullName;
    @XmlElement(name = "ContactInfo")
    protected ContactInfoType contactInfo;
    @XmlElement(name = "EXAM_ResStatus")
    protected String examResStatus;
    @XmlElement(name = "EXAM_CitizenSts")
    protected String examCitizenSts;
    @XmlElement(name = "EXAM_Remarks")
    protected String examRemarks;
    @XmlElement(name = "EXAM_BaseEquAmt")
    protected CurAmtType examBaseEquAmt;
    @XmlElement(name = "EXAM_CreditCardExpDt")
    protected String examCreditCardExpDt;
    @XmlElement(name = "CustName")
    protected CustNameType custName;
    @XmlElement(name = "RefInfo")
    protected RefInfoType refInfo;
    @XmlElement(name = "EXAM_Reference")
    protected String examReference;
    @XmlElement(name = "EXAM_CCTrnDt")
    protected String examccTrnDt;
    @XmlElement(name = "EXAM_TrnDt")
    protected String examTrnDt;
    @XmlElement(name = "EXAM_Amt")
    protected List<EXAMAmtType> examAmt;
    @XmlElement(name = "EXAM_SellerId")
    protected String examSellerId;
    @XmlElement(name = "EXAM_BIC")
    protected String exambic;
    @XmlElement(name = "EXAM_IPAddr")
    protected String examipAddr;
    @XmlElement(name = "EXAM_IsResident")
    protected String examIsResident;
    @XmlElement(name = "EXAM_ProductType")
    protected String examProductType;
    @XmlElement(name = "EXAM_ShariahCompl")
    protected String examShariahCompl;
    @XmlElement(name = "CustType")
    protected String custType;
    @XmlElement(name = "EXAM_ScndValInd")
    protected String examScndValInd;

    /**
     * Gets the value of the examXferAcct property.
     * 
     * @return
     *     possible object is
     *     {@link DepAcctIdType }
     *     
     */
    public DepAcctIdType getEXAMXferAcct() {
        return examXferAcct;
    }

    /**
     * Sets the value of the examXferAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAcctIdType }
     *     
     */
    public void setEXAMXferAcct(DepAcctIdType value) {
        this.examXferAcct = value;
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
     * Gets the value of the examPrincipalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurAmtType }
     *     
     */
    public CurAmtType getEXAMPrincipalAmt() {
        return examPrincipalAmt;
    }

    /**
     * Sets the value of the examPrincipalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmtType }
     *     
     */
    public void setEXAMPrincipalAmt(CurAmtType value) {
        this.examPrincipalAmt = value;
    }

    /**
     * Gets the value of the examCardExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEXAMCardExpDt() {
        return examCardExpDt;
    }

    /**
     * Sets the value of the examCardExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEXAMCardExpDt(XMLGregorianCalendar value) {
        this.examCardExpDt = value;
    }

    /**
     * Gets the value of the dueDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDt() {
        return dueDt;
    }

    /**
     * Sets the value of the dueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDt(XMLGregorianCalendar value) {
        this.dueDt = value;
    }

    /**
     * Gets the value of the examAcctLen property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEXAMAcctLen() {
        return examAcctLen;
    }

    /**
     * Sets the value of the examAcctLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEXAMAcctLen(Long value) {
        this.examAcctLen = value;
    }

    /**
     * Gets the value of the examGovIssueId property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMGovIssueIdentType }
     *     
     */
    public EXAMGovIssueIdentType getEXAMGovIssueId() {
        return examGovIssueId;
    }

    /**
     * Sets the value of the examGovIssueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMGovIssueIdentType }
     *     
     */
    public void setEXAMGovIssueId(EXAMGovIssueIdentType value) {
        this.examGovIssueId = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfoType }
     *     
     */
    public ContactInfoType getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfoType }
     *     
     */
    public void setContactInfo(ContactInfoType value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the examResStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMResStatus() {
        return examResStatus;
    }

    /**
     * Sets the value of the examResStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMResStatus(String value) {
        this.examResStatus = value;
    }

    /**
     * Gets the value of the examCitizenSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCitizenSts() {
        return examCitizenSts;
    }

    /**
     * Sets the value of the examCitizenSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCitizenSts(String value) {
        this.examCitizenSts = value;
    }

    /**
     * Gets the value of the examRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMRemarks() {
        return examRemarks;
    }

    /**
     * Sets the value of the examRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMRemarks(String value) {
        this.examRemarks = value;
    }

    /**
     * Gets the value of the examBaseEquAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurAmtType }
     *     
     */
    public CurAmtType getEXAMBaseEquAmt() {
        return examBaseEquAmt;
    }

    /**
     * Sets the value of the examBaseEquAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmtType }
     *     
     */
    public void setEXAMBaseEquAmt(CurAmtType value) {
        this.examBaseEquAmt = value;
    }

    /**
     * Gets the value of the examCreditCardExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCreditCardExpDt() {
        return examCreditCardExpDt;
    }

    /**
     * Sets the value of the examCreditCardExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCreditCardExpDt(String value) {
        this.examCreditCardExpDt = value;
    }

    /**
     * Gets the value of the custName property.
     * 
     * @return
     *     possible object is
     *     {@link CustNameType }
     *     
     */
    public CustNameType getCustName() {
        return custName;
    }

    /**
     * Sets the value of the custName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustNameType }
     *     
     */
    public void setCustName(CustNameType value) {
        this.custName = value;
    }

    /**
     * Gets the value of the refInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RefInfoType }
     *     
     */
    public RefInfoType getRefInfo() {
        return refInfo;
    }

    /**
     * Sets the value of the refInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefInfoType }
     *     
     */
    public void setRefInfo(RefInfoType value) {
        this.refInfo = value;
    }

    /**
     * Gets the value of the examReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMReference() {
        return examReference;
    }

    /**
     * Sets the value of the examReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMReference(String value) {
        this.examReference = value;
    }

    /**
     * Gets the value of the examccTrnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCCTrnDt() {
        return examccTrnDt;
    }

    /**
     * Sets the value of the examccTrnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCCTrnDt(String value) {
        this.examccTrnDt = value;
    }

    /**
     * Gets the value of the examTrnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMTrnDt() {
        return examTrnDt;
    }

    /**
     * Sets the value of the examTrnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMTrnDt(String value) {
        this.examTrnDt = value;
    }

    /**
     * Gets the value of the examAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMAmtType }
     * 
     * 
     */
    public List<EXAMAmtType> getEXAMAmt() {
        if (examAmt == null) {
            examAmt = new ArrayList<>();
        }
        return this.examAmt;
    }

    /**
     * Gets the value of the examSellerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSellerId() {
        return examSellerId;
    }

    /**
     * Sets the value of the examSellerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSellerId(String value) {
        this.examSellerId = value;
    }

    /**
     * Gets the value of the exambic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBIC() {
        return exambic;
    }

    /**
     * Sets the value of the exambic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBIC(String value) {
        this.exambic = value;
    }

    /**
     * Gets the value of the examipAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIPAddr() {
        return examipAddr;
    }

    /**
     * Sets the value of the examipAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIPAddr(String value) {
        this.examipAddr = value;
    }

    /**
     * Gets the value of the examIsResident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMIsResident() {
        return examIsResident;
    }

    /**
     * Sets the value of the examIsResident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIsResident(String value) {
        this.examIsResident = value;
    }

    /**
     * Gets the value of the examProductType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMProductType() {
        return examProductType;
    }

    /**
     * Sets the value of the examProductType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMProductType(String value) {
        this.examProductType = value;
    }

    /**
     * Gets the value of the examShariahCompl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMShariahCompl() {
        return examShariahCompl;
    }

    /**
     * Sets the value of the examShariahCompl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMShariahCompl(String value) {
        this.examShariahCompl = value;
    }

    /**
     * Gets the value of the custType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustType() {
        return custType;
    }

    /**
     * Sets the value of the custType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustType(String value) {
        this.custType = value;
    }

    /**
     * Gets the value of the examScndValInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMScndValInd() {
        return examScndValInd;
    }

    /**
     * Sets the value of the examScndValInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMScndValInd(String value) {
        this.examScndValInd = value;
    }

}
