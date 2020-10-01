
package com.theerut.springj11.client.webservice.customersearch;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_ChkMaintInfoRec_Type", propOrder = {
    "examChkStatusRec",
    "examLastMaintUID",
    "examLastMaintWrkSt",
    "examLastMaintDt",
    "examLastMaintTm",
    "examLastMaintTmStamp",
    "examLastMaintSrc"
})
public class EXAMChkMaintInfoRecType {

    @XmlElement(name = "EXAM_ChkStatusRec")
    protected EXAMChkStatusRecType examChkStatusRec;
    @XmlElement(name = "EXAM_LastMaintUID")
    protected String examLastMaintUID;
    @XmlElement(name = "EXAM_LastMaintWrkSt")
    protected String examLastMaintWrkSt;
    @XmlElement(name = "EXAM_LastMaintDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar examLastMaintDt;
    @XmlElement(name = "EXAM_LastMaintTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar examLastMaintTm;
    @XmlElement(name = "EXAM_LastMaintTmStamp")
    protected String examLastMaintTmStamp;
    @XmlElement(name = "EXAM_LastMaintSrc")
    protected String examLastMaintSrc;

    /**
     * Gets the value of the examChkStatusRec property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMChkStatusRecType }
     *     
     */
    public EXAMChkStatusRecType getEXAMChkStatusRec() {
        return examChkStatusRec;
    }

    /**
     * Sets the value of the examChkStatusRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMChkStatusRecType }
     *     
     */
    public void setEXAMChkStatusRec(EXAMChkStatusRecType value) {
        this.examChkStatusRec = value;
    }

    /**
     * Gets the value of the examLastMaintUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMLastMaintUID() {
        return examLastMaintUID;
    }

    /**
     * Sets the value of the examLastMaintUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMLastMaintUID(String value) {
        this.examLastMaintUID = value;
    }

    /**
     * Gets the value of the examLastMaintWrkSt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMLastMaintWrkSt() {
        return examLastMaintWrkSt;
    }

    /**
     * Sets the value of the examLastMaintWrkSt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMLastMaintWrkSt(String value) {
        this.examLastMaintWrkSt = value;
    }

    /**
     * Gets the value of the examLastMaintDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEXAMLastMaintDt() {
        return examLastMaintDt;
    }

    /**
     * Sets the value of the examLastMaintDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEXAMLastMaintDt(XMLGregorianCalendar value) {
        this.examLastMaintDt = value;
    }

    /**
     * Gets the value of the examLastMaintTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEXAMLastMaintTm() {
        return examLastMaintTm;
    }

    /**
     * Sets the value of the examLastMaintTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEXAMLastMaintTm(XMLGregorianCalendar value) {
        this.examLastMaintTm = value;
    }

    /**
     * Gets the value of the examLastMaintTmStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMLastMaintTmStamp() {
        return examLastMaintTmStamp;
    }

    /**
     * Sets the value of the examLastMaintTmStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMLastMaintTmStamp(String value) {
        this.examLastMaintTmStamp = value;
    }

    /**
     * Gets the value of the examLastMaintSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMLastMaintSrc() {
        return examLastMaintSrc;
    }

    /**
     * Sets the value of the examLastMaintSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMLastMaintSrc(String value) {
        this.examLastMaintSrc = value;
    }


}
