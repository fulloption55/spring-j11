
package com.theerut.springj11.client.webservice.accounttrxhistory;

import com.theerut.springj11.client.webservice.common.RefInfoType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for PmtInstruction_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtInstruction_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Country" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtFormat" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RefInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IntermediaryDepAcct" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FeeChargeAlloc" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PmtInstruction_Type", propOrder = {
    "country",
    "pmtFormat",
    "refInfo",
    "intermediaryDepAcct",
    "feeChargeAlloc"
})
public class PmtInstructionType {

    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "PmtFormat")
    protected String pmtFormat;
    @XmlElement(name = "RefInfo")
    protected List<RefInfoType> refInfo;
    @XmlElement(name = "IntermediaryDepAcct")
    protected List<IntermediaryDepAcctType> intermediaryDepAcct;
    @XmlElement(name = "FeeChargeAlloc")
    protected FeeChargeAllocType feeChargeAlloc;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the pmtFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtFormat() {
        return pmtFormat;
    }

    /**
     * Sets the value of the pmtFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtFormat(String value) {
        this.pmtFormat = value;
    }

    /**
     * Gets the value of the refInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefInfoType }
     * 
     * 
     */
    public List<RefInfoType> getRefInfo() {
        if (refInfo == null) {
            refInfo = new ArrayList<>();
        }
        return this.refInfo;
    }

    /**
     * Gets the value of the intermediaryDepAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intermediaryDepAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntermediaryDepAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntermediaryDepAcctType }
     * 
     * 
     */
    public List<IntermediaryDepAcctType> getIntermediaryDepAcct() {
        if (intermediaryDepAcct == null) {
            intermediaryDepAcct = new ArrayList<>();
        }
        return this.intermediaryDepAcct;
    }

    /**
     * Gets the value of the feeChargeAlloc property.
     * 
     * @return
     *     possible object is
     *     {@link FeeChargeAllocType }
     *     
     */
    public FeeChargeAllocType getFeeChargeAlloc() {
        return feeChargeAlloc;
    }

    /**
     * Sets the value of the feeChargeAlloc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeChargeAllocType }
     *     
     */
    public void setFeeChargeAlloc(FeeChargeAllocType value) {
        this.feeChargeAlloc = value;
    }

}
