
package com.theerut.springj11.client.webservice.accounttrxhistory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for BillerPayInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillerPayInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtInst" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DaysToEPost" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PrenoteReqd" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillerPayInfo_Type", propOrder = {
    "pmtInst",
    "daysToEPost",
    "prenoteReqd"
})
public class BillerPayInfoType {

    @XmlElement(name = "PmtInst")
    protected List<PmtInstType> pmtInst;
    @XmlElement(name = "DaysToEPost")
    protected Long daysToEPost;
    @XmlElement(name = "PrenoteReqd")
    protected String prenoteReqd;

    /**
     * Gets the value of the pmtInst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtInst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtInst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmtInstType }
     * 
     * 
     */
    public List<PmtInstType> getPmtInst() {
        if (pmtInst == null) {
            pmtInst = new ArrayList<>();
        }
        return this.pmtInst;
    }

    /**
     * Gets the value of the daysToEPost property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDaysToEPost() {
        return daysToEPost;
    }

    /**
     * Sets the value of the daysToEPost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDaysToEPost(Long value) {
        this.daysToEPost = value;
    }

    /**
     * Gets the value of the prenoteReqd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrenoteReqd() {
        return prenoteReqd;
    }

    /**
     * Sets the value of the prenoteReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrenoteReqd(String value) {
        this.prenoteReqd = value;
    }

}
