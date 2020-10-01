
package com.theerut.springj11.client.webservice.accountsummary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EXAM_CustRelationship_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_CustRelationship_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastMaintUID" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastMaintTm" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SeqNum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OrgnFormRefId" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ApprovedLimit" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RelationshipCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_OwnerRelationshipCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_CustRelationship_Type", propOrder = {
    "examLastMaintUID",
    "examLastMaintTm",
    "examSeqNum",
    "examOrgnFormRefId",
    "examApprovedLimit",
    "curCode",
    "examRelationshipCode",
    "examOwnerRelationshipCode"
})
public class EXAMCustRelationshipType {

    @XmlElement(name = "EXAM_LastMaintUID")
    protected String examLastMaintUID;
    @XmlElement(name = "EXAM_LastMaintTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar examLastMaintTm;
    @XmlElement(name = "EXAM_SeqNum")
    protected Long examSeqNum;
    @XmlElement(name = "EXAM_OrgnFormRefId")
    protected Long examOrgnFormRefId;
    @XmlElement(name = "EXAM_ApprovedLimit")
    protected String examApprovedLimit;
    @XmlElement(name = "CurCode")
    protected String curCode;
    @XmlElement(name = "EXAM_RelationshipCode")
    protected String examRelationshipCode;
    @XmlElement(name = "EXAM_OwnerRelationshipCode")
    protected String examOwnerRelationshipCode;

    /**
     * Gets the value of the examLastMaintUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMLastMaintUID() {
        return examLastMaintUID;
    }

    /**
     * Sets the value of the examLastMaintUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMLastMaintUID(String value) {
        this.examLastMaintUID = value;
    }

    /**
     * Gets the value of the examLastMaintTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEXAMLastMaintTm() {
        return examLastMaintTm;
    }

    /**
     * Sets the value of the examLastMaintTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEXAMLastMaintTm(XMLGregorianCalendar value) {
        this.examLastMaintTm = value;
    }

    /**
     * Gets the value of the examSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEXAMSeqNum() {
        return examSeqNum;
    }

    /**
     * Sets the value of the examSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEXAMSeqNum(Long value) {
        this.examSeqNum = value;
    }

    /**
     * Gets the value of the examOrgnFormRefId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEXAMOrgnFormRefId() {
        return examOrgnFormRefId;
    }

    /**
     * Sets the value of the examOrgnFormRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEXAMOrgnFormRefId(Long value) {
        this.examOrgnFormRefId = value;
    }

    /**
     * Gets the value of the examApprovedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMApprovedLimit() {
        return examApprovedLimit;
    }

    /**
     * Sets the value of the examApprovedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMApprovedLimit(String value) {
        this.examApprovedLimit = value;
    }

    /**
     * Gets the value of the curCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurCode() {
        return curCode;
    }

    /**
     * Sets the value of the curCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurCode(String value) {
        this.curCode = value;
    }

    /**
     * Gets the value of the examRelationshipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMRelationshipCode() {
        return examRelationshipCode;
    }

    /**
     * Sets the value of the examRelationshipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMRelationshipCode(String value) {
        this.examRelationshipCode = value;
    }

    /**
     * Gets the value of the examOwnerRelationshipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMOwnerRelationshipCode() {
        return examOwnerRelationshipCode;
    }

    /**
     * Sets the value of the examOwnerRelationshipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMOwnerRelationshipCode(String value) {
        this.examOwnerRelationshipCode = value;
    }

}
