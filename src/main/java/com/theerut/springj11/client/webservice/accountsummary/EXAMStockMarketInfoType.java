
package com.theerut.springj11.client.webservice.accountsummary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for EXAM_StockMarketInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_StockMarketInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MarketName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_StockExchange" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ExtAcctBal" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_StockMarketInfo_Type", propOrder = {
    "examMarketName",
    "examStockExchange",
    "extAcctBal"
})
public class EXAMStockMarketInfoType {

    @XmlElement(name = "EXAM_MarketName")
    protected String examMarketName;
    @XmlElement(name = "EXAM_StockExchange")
    protected String examStockExchange;
    @XmlElement(name = "ExtAcctBal")
    protected List<ExtAcctBalType> extAcctBal;

    /**
     * Gets the value of the examMarketName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMarketName() {
        return examMarketName;
    }

    /**
     * Sets the value of the examMarketName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMarketName(String value) {
        this.examMarketName = value;
    }

    /**
     * Gets the value of the examStockExchange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMStockExchange() {
        return examStockExchange;
    }

    /**
     * Sets the value of the examStockExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMStockExchange(String value) {
        this.examStockExchange = value;
    }

    /**
     * Gets the value of the extAcctBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extAcctBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtAcctBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtAcctBalType }
     * 
     * 
     */
    public List<ExtAcctBalType> getExtAcctBal() {
        if (extAcctBal == null) {
            extAcctBal = new ArrayList<>();
        }
        return this.extAcctBal;
    }

}
