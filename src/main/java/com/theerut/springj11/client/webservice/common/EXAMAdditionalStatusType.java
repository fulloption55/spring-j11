
package com.theerut.springj11.client.webservice.common;

import lombok.ToString;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for EXAM_AdditionalStatus_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_AdditionalStatus_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StatusCode"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Severity"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StatusDesc" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_SubjectElement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_AdditionalStatus_Type", propOrder = {
    "statusCode",
    "severity",
    "statusDesc",
    "examSubjectElement"
})
@ToString
public class EXAMAdditionalStatusType {

    @XmlElement(name = "StatusCode")
    protected long statusCode;
    @XmlElement(name = "Severity", required = true)
    protected String severity;
    @XmlElement(name = "StatusDesc")
    protected String statusDesc;
    @XmlElement(name = "EXAM_SubjectElement")
    protected List<EXAMSubjectElementType> examSubjectElement;

    /**
     * Gets the value of the statusCode property.
     * 
     */
    public long getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     */
    public void setStatusCode(long value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverity(String value) {
        this.severity = value;
    }

    /**
     * Gets the value of the statusDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDesc() {
        return statusDesc;
    }

    /**
     * Sets the value of the statusDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDesc(String value) {
        this.statusDesc = value;
    }

    /**
     * Gets the value of the examSubjectElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examSubjectElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMSubjectElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMSubjectElementType }
     * 
     * 
     */
    public List<EXAMSubjectElementType> getEXAMSubjectElement() {
        if (examSubjectElement == null) {
            examSubjectElement = new ArrayList<>();
        }
        return this.examSubjectElement;
    }

}
