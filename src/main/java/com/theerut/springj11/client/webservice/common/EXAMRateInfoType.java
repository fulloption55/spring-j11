
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Java class for EXAM_RateInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_RateInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Rate1" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Rate2" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Rate3" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CurrentRate1" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CurrentRate2" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CurrentRate3" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CurrentRate4" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CurrentRate5" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CurrentRate6" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CurrentRate7" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CurrentRate8" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CurrentRate9" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CurrentRate10" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CurrentRate11" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CurrentRate12" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CurrentRate13" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CurrentRate14" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CurrentRate15" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_RateInfoType", propOrder = {
    "examRate1",
    "examRate2",
    "examRate3",
    "examCurrentRate1",
    "examCurrentRate2",
    "examCurrentRate3",
    "examCurrentRate4",
    "examCurrentRate5",
    "examCurrentRate6",
    "examCurrentRate7",
    "examCurrentRate8",
    "examCurrentRate9",
    "examCurrentRate10",
    "examCurrentRate11",
    "examCurrentRate12",
    "examCurrentRate13",
    "examCurrentRate14",
    "examCurrentRate15"
})
public class EXAMRateInfoType {

    @XmlElement(name = "EXAM_Rate1")
    protected BigDecimal examRate1;
    @XmlElement(name = "EXAM_Rate2")
    protected BigDecimal examRate2;
    @XmlElement(name = "EXAM_Rate3")
    protected BigDecimal examRate3;
    @XmlElement(name = "EXAM_CurrentRate1")
    protected BigDecimal examCurrentRate1;
    @XmlElement(name = "EXAM_CurrentRate2")
    protected BigDecimal examCurrentRate2;
    @XmlElement(name = "EXAM_CurrentRate3")
    protected BigDecimal examCurrentRate3;
    @XmlElement(name = "EXAM_CurrentRate4")
    protected BigDecimal examCurrentRate4;
    @XmlElement(name = "EXAM_CurrentRate5")
    protected BigDecimal examCurrentRate5;
    @XmlElement(name = "EXAM_CurrentRate6")
    protected BigDecimal examCurrentRate6;
    @XmlElement(name = "EXAM_CurrentRate7")
    protected BigDecimal examCurrentRate7;
    @XmlElement(name = "EXAM_CurrentRate8")
    protected BigDecimal examCurrentRate8;
    @XmlElement(name = "EXAM_CurrentRate9")
    protected BigDecimal examCurrentRate9;
    @XmlElement(name = "EXAM_CurrentRate10")
    protected BigDecimal examCurrentRate10;
    @XmlElement(name = "EXAM_CurrentRate11")
    protected BigDecimal examCurrentRate11;
    @XmlElement(name = "EXAM_CurrentRate12")
    protected BigDecimal examCurrentRate12;
    @XmlElement(name = "EXAM_CurrentRate13")
    protected BigDecimal examCurrentRate13;
    @XmlElement(name = "EXAM_CurrentRate14")
    protected BigDecimal examCurrentRate14;
    @XmlElement(name = "EXAM_CurrentRate15")
    protected BigDecimal examCurrentRate15;

    /**
     * Gets the value of the examRate1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMRate1() {
        return examRate1;
    }

    /**
     * Sets the value of the examRate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMRate1(BigDecimal value) {
        this.examRate1 = value;
    }

    /**
     * Gets the value of the examRate2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMRate2() {
        return examRate2;
    }

    /**
     * Sets the value of the examRate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMRate2(BigDecimal value) {
        this.examRate2 = value;
    }

    /**
     * Gets the value of the examRate3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMRate3() {
        return examRate3;
    }

    /**
     * Sets the value of the examRate3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMRate3(BigDecimal value) {
        this.examRate3 = value;
    }

    /**
     * Gets the value of the examCurrentRate1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMCurrentRate1() {
        return examCurrentRate1;
    }

    /**
     * Sets the value of the examCurrentRate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMCurrentRate1(BigDecimal value) {
        this.examCurrentRate1 = value;
    }

    /**
     * Gets the value of the examCurrentRate2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMCurrentRate2() {
        return examCurrentRate2;
    }

    /**
     * Sets the value of the examCurrentRate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMCurrentRate2(BigDecimal value) {
        this.examCurrentRate2 = value;
    }

    /**
     * Gets the value of the examCurrentRate3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMCurrentRate3() {
        return examCurrentRate3;
    }

    /**
     * Sets the value of the examCurrentRate3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMCurrentRate3(BigDecimal value) {
        this.examCurrentRate3 = value;
    }

    /**
     * Gets the value of the examCurrentRate4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMCurrentRate4() {
        return examCurrentRate4;
    }

    /**
     * Sets the value of the examCurrentRate4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMCurrentRate4(BigDecimal value) {
        this.examCurrentRate4 = value;
    }

    /**
     * Gets the value of the examCurrentRate5 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMCurrentRate5() {
        return examCurrentRate5;
    }

    /**
     * Sets the value of the examCurrentRate5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMCurrentRate5(BigDecimal value) {
        this.examCurrentRate5 = value;
    }

    /**
     * Gets the value of the examCurrentRate6 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMCurrentRate6() {
        return examCurrentRate6;
    }

    /**
     * Sets the value of the examCurrentRate6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMCurrentRate6(BigDecimal value) {
        this.examCurrentRate6 = value;
    }

    /**
     * Gets the value of the examCurrentRate7 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMCurrentRate7() {
        return examCurrentRate7;
    }

    /**
     * Sets the value of the examCurrentRate7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMCurrentRate7(BigDecimal value) {
        this.examCurrentRate7 = value;
    }

    /**
     * Gets the value of the examCurrentRate8 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMCurrentRate8() {
        return examCurrentRate8;
    }

    /**
     * Sets the value of the examCurrentRate8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMCurrentRate8(BigDecimal value) {
        this.examCurrentRate8 = value;
    }

    /**
     * Gets the value of the examCurrentRate9 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMCurrentRate9() {
        return examCurrentRate9;
    }

    /**
     * Sets the value of the examCurrentRate9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMCurrentRate9(BigDecimal value) {
        this.examCurrentRate9 = value;
    }

    /**
     * Gets the value of the examCurrentRate10 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMCurrentRate10() {
        return examCurrentRate10;
    }

    /**
     * Sets the value of the examCurrentRate10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMCurrentRate10(BigDecimal value) {
        this.examCurrentRate10 = value;
    }

    /**
     * Gets the value of the examCurrentRate11 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMCurrentRate11() {
        return examCurrentRate11;
    }

    /**
     * Sets the value of the examCurrentRate11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMCurrentRate11(BigDecimal value) {
        this.examCurrentRate11 = value;
    }

    /**
     * Gets the value of the examCurrentRate12 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMCurrentRate12() {
        return examCurrentRate12;
    }

    /**
     * Sets the value of the examCurrentRate12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMCurrentRate12(BigDecimal value) {
        this.examCurrentRate12 = value;
    }

    /**
     * Gets the value of the examCurrentRate13 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMCurrentRate13() {
        return examCurrentRate13;
    }

    /**
     * Sets the value of the examCurrentRate13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMCurrentRate13(BigDecimal value) {
        this.examCurrentRate13 = value;
    }

    /**
     * Gets the value of the examCurrentRate14 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMCurrentRate14() {
        return examCurrentRate14;
    }

    /**
     * Sets the value of the examCurrentRate14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMCurrentRate14(BigDecimal value) {
        this.examCurrentRate14 = value;
    }

    /**
     * Gets the value of the examCurrentRate15 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXAMCurrentRate15() {
        return examCurrentRate15;
    }

    /**
     * Sets the value of the examCurrentRate15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXAMCurrentRate15(BigDecimal value) {
        this.examCurrentRate15 = value;
    }

}
