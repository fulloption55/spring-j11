
package com.theerut.springj11.client.webservice.fixedgroupsummary;

import com.theerut.springj11.client.webservice.common.EXAMNonFinSvcHeaderInfoType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXAM_FDGrpSummRq_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_FDGrpSummRq_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RqUID"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NonFinSvcHeaderInfo"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustPermId"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_FDGrpSummRq_Type", propOrder = {
    "examRqUID",
    "examNonFinSvcHeaderInfo",
    "custPermId"
})
public class EXAMFDGrpSummRqType {

    @XmlElement(name = "EXAM_RqUID", required = true)
    protected String examRqUID;
    @XmlElement(name = "EXAM_NonFinSvcHeaderInfo", required = true)
    protected EXAMNonFinSvcHeaderInfoType examNonFinSvcHeaderInfo;
    @XmlElement(name = "CustPermId", required = true)
    protected String custPermId;

    /**
     * Gets the value of the examRqUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMRqUID() {
        return examRqUID;
    }

    /**
     * Sets the value of the examRqUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMRqUID(String value) {
        this.examRqUID = value;
    }

    /**
     * Gets the value of the examNonFinSvcHeaderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMNonFinSvcHeaderInfoType }
     *     
     */
    public EXAMNonFinSvcHeaderInfoType getEXAMNonFinSvcHeaderInfo() {
        return examNonFinSvcHeaderInfo;
    }

    /**
     * Sets the value of the examNonFinSvcHeaderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMNonFinSvcHeaderInfoType }
     *     
     */
    public void setEXAMNonFinSvcHeaderInfo(EXAMNonFinSvcHeaderInfoType value) {
        this.examNonFinSvcHeaderInfo = value;
    }

    /**
     * Gets the value of the custPermId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustPermId() {
        return custPermId;
    }

    /**
     * Sets the value of the custPermId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustPermId(String value) {
        this.custPermId = value;
    }

}
