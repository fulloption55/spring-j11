
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXAM_PmtDtls_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_PmtDtls_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PmtDtls1" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PmtDtls2" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PmtDtls3" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PmtDtls4" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_PmtDtls_Type", propOrder = {
    "examPmtDtls1",
    "examPmtDtls2",
    "examPmtDtls3",
    "examPmtDtls4"
})
public class EXAMPmtDtlsType {

    @XmlElement(name = "EXAM_PmtDtls1")
    protected String examPmtDtls1;
    @XmlElement(name = "EXAM_PmtDtls2")
    protected String examPmtDtls2;
    @XmlElement(name = "EXAM_PmtDtls3")
    protected String examPmtDtls3;
    @XmlElement(name = "EXAM_PmtDtls4")
    protected String examPmtDtls4;

    /**
     * Gets the value of the examPmtDtls1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPmtDtls1() {
        return examPmtDtls1;
    }

    /**
     * Sets the value of the examPmtDtls1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPmtDtls1(String value) {
        this.examPmtDtls1 = value;
    }

    /**
     * Gets the value of the examPmtDtls2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPmtDtls2() {
        return examPmtDtls2;
    }

    /**
     * Sets the value of the examPmtDtls2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPmtDtls2(String value) {
        this.examPmtDtls2 = value;
    }

    /**
     * Gets the value of the examPmtDtls3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPmtDtls3() {
        return examPmtDtls3;
    }

    /**
     * Sets the value of the examPmtDtls3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPmtDtls3(String value) {
        this.examPmtDtls3 = value;
    }

    /**
     * Gets the value of the examPmtDtls4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPmtDtls4() {
        return examPmtDtls4;
    }

    /**
     * Sets the value of the examPmtDtls4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPmtDtls4(String value) {
        this.examPmtDtls4 = value;
    }

}
