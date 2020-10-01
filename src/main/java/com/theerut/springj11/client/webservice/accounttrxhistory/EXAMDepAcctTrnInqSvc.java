
package com.theerut.springj11.client.webservice.accounttrxhistory;

import com.theerut.springj11.client.webservice.common.EXAMSignonRqType;
import com.theerut.springj11.client.webservice.common.EXAMSignonRsType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SignonRq"/>
 *           &lt;element name="EXAM_DepAcctTrnInqRq" type="{urn:ifxforum-org:XSD:1}EXAM_DepAcctTrnInqRq_Type"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SignonRs"/>
 *           &lt;element name="EXAM_DepAcctTrnInqRs" type="{urn:ifxforum-org:XSD:1}EXAM_DepAcctTrnInqRs_Type"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *       &lt;attribute name="coreSchemaVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "examSignonRq",
    "examDepAcctTrnInqRq",
    "examSignonRs",
    "examDepAcctTrnInqRs"
})
@XmlRootElement(name = "EXAM_DepAcctTrnInqSvc")
public class EXAMDepAcctTrnInqSvc {

    @XmlElement(name = "EXAM_SignonRq")
    protected EXAMSignonRqType examSignonRq;
    @XmlElement(name = "EXAM_DepAcctTrnInqRq")
    protected EXAMDepAcctTrnInqRqType examDepAcctTrnInqRq;
    @XmlElement(name = "EXAM_SignonRs")
    protected EXAMSignonRsType examSignonRs;
    @XmlElement(name = "EXAM_DepAcctTrnInqRs")
    protected EXAMDepAcctTrnInqRsType examDepAcctTrnInqRs;
    @XmlAttribute(name = "coreSchemaVersion", required = true)
    protected BigDecimal coreSchemaVersion;

    /**
     * Gets the value of the examSignonRq property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMSignonRqType }
     *     
     */
    public EXAMSignonRqType getEXAMSignonRq() {
        return examSignonRq;
    }

    /**
     * Sets the value of the examSignonRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMSignonRqType }
     *     
     */
    public void setExamSignonRq(EXAMSignonRqType value) {
        this.examSignonRq = value;
    }

    /**
     * Gets the value of the examDepAcctTrnInqRq property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMDepAcctTrnInqRqType }
     *     
     */
    public EXAMDepAcctTrnInqRqType getEXAMDepAcctTrnInqRq() {
        return examDepAcctTrnInqRq;
    }

    /**
     * Sets the value of the examDepAcctTrnInqRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMDepAcctTrnInqRqType }
     *     
     */
    public void setEXAMDepAcctTrnInqRq(EXAMDepAcctTrnInqRqType value) {
        this.examDepAcctTrnInqRq = value;
    }

    /**
     * Gets the value of the examSignonRs property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMSignonRsType }
     *     
     */
    public EXAMSignonRsType getEXAMSignonRs() {
        return examSignonRs;
    }

    /**
     * Sets the value of the examSignonRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMSignonRsType }
     *     
     */
    public void setEXAMSignonRs(EXAMSignonRsType value) {
        this.examSignonRs = value;
    }

    /**
     * Gets the value of the examDepAcctTrnInqRs property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMDepAcctTrnInqRsType }
     *     
     */
    public EXAMDepAcctTrnInqRsType getEXAMDepAcctTrnInqRs() {
        return examDepAcctTrnInqRs;
    }

    /**
     * Sets the value of the examDepAcctTrnInqRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMDepAcctTrnInqRsType }
     *     
     */
    public void setEXAMDepAcctTrnInqRs(EXAMDepAcctTrnInqRsType value) {
        this.examDepAcctTrnInqRs = value;
    }

    /**
     * Gets the value of the coreSchemaVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoreSchemaVersion() {
        return coreSchemaVersion;
    }

    /**
     * Sets the value of the coreSchemaVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoreSchemaVersion(BigDecimal value) {
        this.coreSchemaVersion = value;
    }

}
