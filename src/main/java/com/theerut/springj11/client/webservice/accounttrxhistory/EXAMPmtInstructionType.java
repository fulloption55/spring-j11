
package com.theerut.springj11.client.webservice.accounttrxhistory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXAM_PmtInstruction_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_PmtInstruction_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PmtInstruction1" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PmtInstruction2" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PmtInstruction3" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PmtInstruction4" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PmtInstruction5" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PmtInstruction6" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_PmtInstruction_Type", propOrder = {
    "examPmtInstruction1",
    "examPmtInstruction2",
    "examPmtInstruction3",
    "examPmtInstruction4",
    "examPmtInstruction5",
    "examPmtInstruction6"
})
public class EXAMPmtInstructionType {

    @XmlElement(name = "EXAM_PmtInstruction1")
    protected String examPmtInstruction1;
    @XmlElement(name = "EXAM_PmtInstruction2")
    protected String examPmtInstruction2;
    @XmlElement(name = "EXAM_PmtInstruction3")
    protected String examPmtInstruction3;
    @XmlElement(name = "EXAM_PmtInstruction4")
    protected String examPmtInstruction4;
    @XmlElement(name = "EXAM_PmtInstruction5")
    protected String examPmtInstruction5;
    @XmlElement(name = "EXAM_PmtInstruction6")
    protected String examPmtInstruction6;

    /**
     * Gets the value of the examPmtInstruction1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPmtInstruction1() {
        return examPmtInstruction1;
    }

    /**
     * Sets the value of the examPmtInstruction1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPmtInstruction1(String value) {
        this.examPmtInstruction1 = value;
    }

    /**
     * Gets the value of the examPmtInstruction2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPmtInstruction2() {
        return examPmtInstruction2;
    }

    /**
     * Sets the value of the examPmtInstruction2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPmtInstruction2(String value) {
        this.examPmtInstruction2 = value;
    }

    /**
     * Gets the value of the examPmtInstruction3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPmtInstruction3() {
        return examPmtInstruction3;
    }

    /**
     * Sets the value of the examPmtInstruction3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPmtInstruction3(String value) {
        this.examPmtInstruction3 = value;
    }

    /**
     * Gets the value of the examPmtInstruction4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPmtInstruction4() {
        return examPmtInstruction4;
    }

    /**
     * Sets the value of the examPmtInstruction4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPmtInstruction4(String value) {
        this.examPmtInstruction4 = value;
    }

    /**
     * Gets the value of the examPmtInstruction5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPmtInstruction5() {
        return examPmtInstruction5;
    }

    /**
     * Sets the value of the examPmtInstruction5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPmtInstruction5(String value) {
        this.examPmtInstruction5 = value;
    }

    /**
     * Gets the value of the examPmtInstruction6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPmtInstruction6() {
        return examPmtInstruction6;
    }

    /**
     * Sets the value of the examPmtInstruction6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPmtInstruction6(String value) {
        this.examPmtInstruction6 = value;
    }

}
