
package com.theerut.springj11.client.webservice.accountsummary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for EXAM_CardBonus_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_CardBonus_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CardNum" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CardBonusBalance" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Pool" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MarketingMsg" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_CardBonus_Type", propOrder = {
    "examCardNum",
    "examCardBonusBalance",
    "examPool",
    "examMarketingMsg"
})
public class EXAMCardBonusType {

    @XmlElement(name = "EXAM_CardNum")
    protected String examCardNum;
    @XmlElement(name = "EXAM_CardBonusBalance")
    protected List<EXAMCardBonusBalanceType> examCardBonusBalance;
    @XmlElement(name = "EXAM_Pool")
    protected EXAMCardBonusPoolType examPool;
    @XmlElement(name = "EXAM_MarketingMsg")
    protected String examMarketingMsg;

    /**
     * Gets the value of the examCardNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCardNum() {
        return examCardNum;
    }

    /**
     * Sets the value of the examCardNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCardNum(String value) {
        this.examCardNum = value;
    }

    /**
     * Gets the value of the examCardBonusBalance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examCardBonusBalance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMCardBonusBalance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMCardBonusBalanceType }
     * 
     * 
     */
    public List<EXAMCardBonusBalanceType> getEXAMCardBonusBalance() {
        if (examCardBonusBalance == null) {
            examCardBonusBalance = new ArrayList<>();
        }
        return this.examCardBonusBalance;
    }

    /**
     * Gets the value of the examPool property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMCardBonusPoolType }
     *     
     */
    public EXAMCardBonusPoolType getEXAMPool() {
        return examPool;
    }

    /**
     * Sets the value of the examPool property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMCardBonusPoolType }
     *     
     */
    public void setEXAMPool(EXAMCardBonusPoolType value) {
        this.examPool = value;
    }

    /**
     * Gets the value of the examMarketingMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMarketingMsg() {
        return examMarketingMsg;
    }

    /**
     * Sets the value of the examMarketingMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMarketingMsg(String value) {
        this.examMarketingMsg = value;
    }

}
