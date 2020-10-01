
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Java class for EXAM_Charge_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_Charge_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}EXAM_Fee_Type">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_TransAmt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ChrgCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_GLAcctInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_HostTellerTaxCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_Charge_Type", propOrder = {
    "examTransAmt",
    "examChrgCode",
    "examglAcctInfo",
    "examHostTellerTaxCode"
})
public class EXAMChargeType
    extends EXAMFeeType
{

    @XmlElement(name = "EXAM_TransAmt")
    protected BigDecimal examTransAmt;
    @XmlElement(name = "EXAM_ChrgCode")
    protected String examChrgCode;
    @XmlElement(name = "EXAM_GLAcctInfo")
    protected DepAcctIdType examglAcctInfo;
    @XmlElement(name = "EXAM_HostTellerTaxCode")
    protected String examHostTellerTaxCode;

    /**
     * Gets the value of the examTransAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMTransAmt() {
        return examTransAmt;
    }

    /**
     * Sets the value of the examTransAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMTransAmt(BigDecimal value) {
        this.examTransAmt = value;
    }

    /**
     * Gets the value of the examChrgCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMChrgCode() {
        return examChrgCode;
    }

    /**
     * Sets the value of the examChrgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMChrgCode(String value) {
        this.examChrgCode = value;
    }

    /**
     * Gets the value of the examglAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DepAcctIdType }
     *     
     */
    public DepAcctIdType getEXAMGLAcctInfo() {
        return examglAcctInfo;
    }

    /**
     * Sets the value of the examglAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAcctIdType }
     *     
     */
    public void setEXAMGLAcctInfo(DepAcctIdType value) {
        this.examglAcctInfo = value;
    }

    /**
     * Gets the value of the examHostTellerTaxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMHostTellerTaxCode() {
        return examHostTellerTaxCode;
    }

    /**
     * Sets the value of the examHostTellerTaxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMHostTellerTaxCode(String value) {
        this.examHostTellerTaxCode = value;
    }

}
