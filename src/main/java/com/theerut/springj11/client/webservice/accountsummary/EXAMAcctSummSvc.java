
package com.theerut.springj11.client.webservice.accountsummary;

import com.theerut.springj11.client.webservice.common.EXAMSignonRqType;
import com.theerut.springj11.client.webservice.common.EXAMSignonRsType;
import lombok.ToString;

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
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AcctSummRq"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SignonRs"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AcctSummRs"/>
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
@ToString
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "examSignonRq",
    "examAcctSummRq",
    "examSignonRs",
    "examAcctSummRs"
})
@XmlRootElement(name = "EXAM_AcctSummSvc")
public class EXAMAcctSummSvc {

    @XmlElement(name = "EXAM_SignonRq")
    protected EXAMSignonRqType examSignonRq;
    @XmlElement(name = "EXAM_AcctSummRq")
    protected EXAMAcctSummRqType examAcctSummRq;
    @XmlElement(name = "EXAM_SignonRs")
    protected EXAMSignonRsType examSignonRs;
    @XmlElement(name = "EXAM_AcctSummRs")
    protected EXAMAcctSummRsType examAcctSummRs;
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
     * Gets the value of the examAcctSummRq property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMAcctSummRqType }
     *     
     */
    public EXAMAcctSummRqType getEXAMAcctSummRq() {
        return examAcctSummRq;
    }

    /**
     * Sets the value of the examAcctSummRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMAcctSummRqType }
     *     
     */
    public void setEXAMAcctSummRq(EXAMAcctSummRqType value) {
        this.examAcctSummRq = value;
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
     * Gets the value of the examAcctSummRs property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMAcctSummRsType }
     *     
     */
    public EXAMAcctSummRsType getEXAMAcctSummRs() {
        return examAcctSummRs;
    }

    /**
     * Sets the value of the examAcctSummRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMAcctSummRsType }
     *     
     */
    public void setEXAMAcctSummRs(EXAMAcctSummRsType value) {
        this.examAcctSummRs = value;
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
