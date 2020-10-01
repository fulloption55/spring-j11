
package com.theerut.springj11.client.webservice.accounttrxhistory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for PmtInst_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtInst_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtInstType"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Brand" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SettlementInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PmtInst_Type", propOrder = {
    "pmtInstType",
    "brand",
    "settlementInfo"
})
public class PmtInstType {

    @XmlElement(name = "PmtInstType", required = true)
    protected String pmtInstType;
    @XmlElement(name = "Brand")
    protected String brand;
    @XmlElement(name = "SettlementInfo")
    protected List<SettlementInfoType> settlementInfo;

    /**
     * Gets the value of the pmtInstType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtInstType() {
        return pmtInstType;
    }

    /**
     * Sets the value of the pmtInstType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtInstType(String value) {
        this.pmtInstType = value;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the settlementInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settlementInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettlementInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementInfoType }
     * 
     * 
     */
    public List<SettlementInfoType> getSettlementInfo() {
        if (settlementInfo == null) {
            settlementInfo = new ArrayList<>();
        }
        return this.settlementInfo;
    }

}
