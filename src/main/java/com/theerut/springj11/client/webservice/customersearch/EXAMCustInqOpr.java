
package com.theerut.springj11.client.webservice.customersearch;

import com.theerut.springj11.client.webservice.common.EXAMSignonRqType;
import com.theerut.springj11.client.webservice.common.EXAMSignonRsType;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "examSignonRq",
    "examCustInqRq",
    "examSignonRs",
    "examCustInqRs"
})
@XmlRootElement(name = "EXAM_CustInqOpr")
public class EXAMCustInqOpr {

    @XmlElement(name = "EXAM_SignonRq")
    protected EXAMSignonRqType examSignonRq;
    @XmlElement(name = "EXAM_CustInqRq")
    protected EXAMCustInqRqType examCustInqRq;
    @XmlElement(name = "EXAM_SignonRs")
    protected EXAMSignonRsType examSignonRs;
    @XmlElement(name = "EXAM_CustInqRs")
    protected EXAMCustInqRsType examCustInqRs;
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
    public void setEXAMSignonRq(EXAMSignonRqType value) {
        this.examSignonRq = value;
    }

    /**
     * Gets the value of the examCustInqRq property.
     *
     * @return
     *     possible object is
     *     {@link EXAMCustInqRqType }
     *
     */
    public EXAMCustInqRqType getEXAMCustInqRq() {
        return examCustInqRq;
    }

    /**
     * Sets the value of the examCustInqRq property.
     *
     * @param value
     *     allowed object is
     *     {@link EXAMCustInqRqType }
     *
     */
    public void setEXAMCustInqRq(EXAMCustInqRqType value) {
        this.examCustInqRq = value;
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
     * Gets the value of the examCustInqRs property.
     *
     * @return
     *     possible object is
     *     {@link EXAMCustInqRsType }
     *
     */
    public EXAMCustInqRsType getEXAMCustInqRs() {
        return examCustInqRs;
    }

    /**
     * Sets the value of the examCustInqRs property.
     *
     * @param value
     *     allowed object is
     *     {@link EXAMCustInqRsType }
     *     
     */
    public void setEXAMCustInqRs(EXAMCustInqRsType value) {
        this.examCustInqRs = value;
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
