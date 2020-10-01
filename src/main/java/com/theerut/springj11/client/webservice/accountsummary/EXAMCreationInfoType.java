
package com.theerut.springj11.client.webservice.accountsummary;

import com.theerut.springj11.utils.LocalDateAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;


/**
 * <p>Java class for EXAM_CreationInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_CreationInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CreatedUserId"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CreatedDt"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CreatedTm"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_WorkstationId"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SrcId"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CreatedTmStamp" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CreatedSpvId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_CreationInfo_Type", propOrder = {
    "examCreatedUserId",
    "examCreatedDt",
    "examCreatedTm",
    "examWorkstationId",
    "examSrcId",
    "examCreatedTmStamp",
    "examCreatedSpvId"
})
public class EXAMCreationInfoType {

    @XmlElement(name = "EXAM_CreatedUserId", required = true)
    protected String examCreatedUserId;
    @XmlElement(name = "EXAM_CreatedDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examCreatedDt;
    @XmlElement(name = "EXAM_CreatedTm", required = true)
    protected String examCreatedTm;
    @XmlElement(name = "EXAM_WorkstationId", required = true)
    protected String examWorkstationId;
    @XmlElement(name = "EXAM_SrcId", required = true)
    protected String examSrcId;
    @XmlElement(name = "EXAM_CreatedTmStamp")
    protected String examCreatedTmStamp;
    @XmlElement(name = "EXAM_CreatedSpvId")
    protected String examCreatedSpvId;

    /**
     * Gets the value of the examCreatedUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCreatedUserId() {
        return examCreatedUserId;
    }

    /**
     * Sets the value of the examCreatedUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCreatedUserId(String value) {
        this.examCreatedUserId = value;
    }

    /**
     * Gets the value of the examCreatedDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMCreatedDt() {
        return examCreatedDt;
    }

    /**
     * Sets the value of the examCreatedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCreatedDt(LocalDate value) {
        this.examCreatedDt = value;
    }

    /**
     * Gets the value of the examCreatedTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCreatedTm() {
        return examCreatedTm;
    }

    /**
     * Sets the value of the examCreatedTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCreatedTm(String value) {
        this.examCreatedTm = value;
    }

    /**
     * Gets the value of the examWorkstationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMWorkstationId() {
        return examWorkstationId;
    }

    /**
     * Sets the value of the examWorkstationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMWorkstationId(String value) {
        this.examWorkstationId = value;
    }

    /**
     * Gets the value of the examSrcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMSrcId() {
        return examSrcId;
    }

    /**
     * Sets the value of the examSrcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMSrcId(String value) {
        this.examSrcId = value;
    }

    /**
     * Gets the value of the examCreatedTmStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCreatedTmStamp() {
        return examCreatedTmStamp;
    }

    /**
     * Sets the value of the examCreatedTmStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCreatedTmStamp(String value) {
        this.examCreatedTmStamp = value;
    }

    /**
     * Gets the value of the examCreatedSpvId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCreatedSpvId() {
        return examCreatedSpvId;
    }

    /**
     * Sets the value of the examCreatedSpvId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCreatedSpvId(String value) {
        this.examCreatedSpvId = value;
    }

}
