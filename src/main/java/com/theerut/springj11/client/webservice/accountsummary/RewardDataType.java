
package com.theerut.springj11.client.webservice.accountsummary;

import com.theerut.springj11.utils.LocalDateAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.time.LocalDate;


/**
 * <p>Java class for RewardData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RewardData_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ActionCode"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ProgramIdent"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Desc"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Amt"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OpenDt"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RewardStatusCode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RewardData_Type", propOrder = {
    "examActionCode",
    "examProgramIdent",
    "desc",
    "amt",
    "openDt",
    "examRewardStatusCode"
})
public class RewardDataType {

    @XmlElement(name = "EXAM_ActionCode", required = true)
    protected String examActionCode;
    @XmlElement(name = "EXAM_ProgramIdent", required = true)
    protected String examProgramIdent;
    @XmlElement(name = "Desc", required = true)
    protected String desc;
    @XmlElement(name = "Amt", required = true)
    protected BigDecimal amt;
    @XmlElement(name = "OpenDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate openDt;
    @XmlElement(name = "EXAM_RewardStatusCode", required = true)
    protected String examRewardStatusCode;

    /**
     * Gets the value of the examActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMActionCode() {
        return examActionCode;
    }

    /**
     * Sets the value of the examActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMActionCode(String value) {
        this.examActionCode = value;
    }

    /**
     * Gets the value of the examProgramIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMProgramIdent() {
        return examProgramIdent;
    }

    /**
     * Sets the value of the examProgramIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMProgramIdent(String value) {
        this.examProgramIdent = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmt(BigDecimal value) {
        this.amt = value;
    }

    /**
     * Gets the value of the openDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getOpenDt() {
        return openDt;
    }

    /**
     * Sets the value of the openDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenDt(LocalDate value) {
        this.openDt = value;
    }

    /**
     * Gets the value of the examRewardStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMRewardStatusCode() {
        return examRewardStatusCode;
    }

    /**
     * Sets the value of the examRewardStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMRewardStatusCode(String value) {
        this.examRewardStatusCode = value;
    }

}
