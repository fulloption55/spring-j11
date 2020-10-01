
package com.theerut.springj11.client.webservice.accounttrxhistory;

import com.theerut.springj11.client.webservice.common.DepAcctIdType;
import com.theerut.springj11.client.webservice.common.LoanAcctIdType;
import com.theerut.springj11.client.webservice.common.RefInfoType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for CounterpartyInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CounterpartyInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}LegalName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RefInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}DepAcctId"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CardAcctId"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}LoanAcctId"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterpartyInfo_Type", propOrder = {
    "legalName",
    "refInfo",
    "depAcctId",
    "cardAcctId",
    "loanAcctId"
})
public class CounterpartyInfoType {

    @XmlElement(name = "LegalName")
    protected String legalName;
    @XmlElement(name = "RefInfo")
    protected List<RefInfoType> refInfo;
    @XmlElement(name = "DepAcctId")
    protected DepAcctIdType depAcctId;
    @XmlElement(name = "CardAcctId")
    protected CardAcctIdType cardAcctId;
    @XmlElement(name = "LoanAcctId")
    protected LoanAcctIdType loanAcctId;

    /**
     * Gets the value of the legalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalName() {
        return legalName;
    }

    /**
     * Sets the value of the legalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalName(String value) {
        this.legalName = value;
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
     * Gets the value of the depAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link DepAcctIdType }
     *     
     */
    public DepAcctIdType getDepAcctId() {
        return depAcctId;
    }

    /**
     * Sets the value of the depAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAcctIdType }
     *     
     */
    public void setDepAcctId(DepAcctIdType value) {
        this.depAcctId = value;
    }

    /**
     * Gets the value of the cardAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link CardAcctIdType }
     *     
     */
    public CardAcctIdType getCardAcctId() {
        return cardAcctId;
    }

    /**
     * Sets the value of the cardAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAcctIdType }
     *     
     */
    public void setCardAcctId(CardAcctIdType value) {
        this.cardAcctId = value;
    }

    /**
     * Gets the value of the loanAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link LoanAcctIdType }
     *     
     */
    public LoanAcctIdType getLoanAcctId() {
        return loanAcctId;
    }

    /**
     * Sets the value of the loanAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanAcctIdType }
     *     
     */
    public void setLoanAcctId(LoanAcctIdType value) {
        this.loanAcctId = value;
    }

}
