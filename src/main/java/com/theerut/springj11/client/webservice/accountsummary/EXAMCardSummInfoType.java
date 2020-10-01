
package com.theerut.springj11.client.webservice.accountsummary;

import com.theerut.springj11.client.webservice.common.AcctBalType;
import com.theerut.springj11.utils.LocalDateAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;


/**
 * <p>Java class for EXAM_CardSummInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_CardSummInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CardAcctRel" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CardAcctType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CardNum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CardAcctName" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CardBal" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CardExpDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EffDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CardActCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NewCardNum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_NewCardExpDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ActionCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_IssueDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CardLastExpDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_CardStatus" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Org" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_BlockCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AuthType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MSICCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_MSICCodeFlg" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_CardSummInfo_Type", propOrder = {
    "examCardAcctRel",
    "examCardAcctType",
    "examCardNum",
    "examCardAcctName",
    "examCardBal",
    "examCardExpDt",
    "effDt",
    "examCardActCode",
    "examNewCardNum",
    "examNewCardExpDt",
    "examActionCode",
    "examIssueDt",
    "examCardLastExpDt",
    "examCardStatus",
    "cardType",
    "org",
    "examBlockCode",
    "examAuthType",
    "exammsicCode",
    "exammsicCodeFlg"
})
public class EXAMCardSummInfoType {

    @XmlElement(name = "EXAM_CardAcctRel")
    protected String examCardAcctRel;
    @XmlElement(name = "EXAM_CardAcctType")
    protected String examCardAcctType;
    @XmlElement(name = "EXAM_CardNum")
    protected String examCardNum;
    @XmlElement(name = "EXAM_CardAcctName")
    protected String examCardAcctName;
    @XmlElement(name = "EXAM_CardBal")
    protected AcctBalType examCardBal;
    @XmlElement(name = "EXAM_CardExpDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examCardExpDt;
    @XmlElement(name = "EffDt")
    protected String effDt;
    @XmlElement(name = "EXAM_CardActCode")
    protected String examCardActCode;
    @XmlElement(name = "EXAM_NewCardNum")
    protected String examNewCardNum;
    @XmlElement(name = "EXAM_NewCardExpDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examNewCardExpDt;
    @XmlElement(name = "EXAM_ActionCode")
    protected String examActionCode;
    @XmlElement(name = "EXAM_IssueDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examIssueDt;
    @XmlElement(name = "EXAM_CardLastExpDt", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate examCardLastExpDt;
    @XmlElement(name = "EXAM_CardStatus")
    protected String examCardStatus;
    @XmlElement(name = "CardType")
    protected String cardType;
    @XmlElement(name = "Org")
    protected String org;
    @XmlElement(name = "EXAM_BlockCode")
    protected String examBlockCode;
    @XmlElement(name = "EXAM_AuthType")
    protected String examAuthType;
    @XmlElement(name = "EXAM_MSICCode")
    protected String exammsicCode;
    @XmlElement(name = "EXAM_MSICCodeFlg")
    protected String exammsicCodeFlg;

    /**
     * Gets the value of the examCardAcctRel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCardAcctRel() {
        return examCardAcctRel;
    }

    /**
     * Sets the value of the examCardAcctRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCardAcctRel(String value) {
        this.examCardAcctRel = value;
    }

    /**
     * Gets the value of the examCardAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCardAcctType() {
        return examCardAcctType;
    }

    /**
     * Sets the value of the examCardAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCardAcctType(String value) {
        this.examCardAcctType = value;
    }

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
     * Gets the value of the examCardAcctName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCardAcctName() {
        return examCardAcctName;
    }

    /**
     * Sets the value of the examCardAcctName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCardAcctName(String value) {
        this.examCardAcctName = value;
    }

    /**
     * Gets the value of the examCardBal property.
     * 
     * @return
     *     possible object is
     *     {@link AcctBalType }
     *     
     */
    public AcctBalType getEXAMCardBal() {
        return examCardBal;
    }

    /**
     * Sets the value of the examCardBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctBalType }
     *     
     */
    public void setEXAMCardBal(AcctBalType value) {
        this.examCardBal = value;
    }

    /**
     * Gets the value of the examCardExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMCardExpDt() {
        return examCardExpDt;
    }

    /**
     * Sets the value of the examCardExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCardExpDt(LocalDate value) {
        this.examCardExpDt = value;
    }

    /**
     * Gets the value of the effDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffDt() {
        return effDt;
    }

    /**
     * Sets the value of the effDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffDt(String value) {
        this.effDt = value;
    }

    /**
     * Gets the value of the examCardActCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCardActCode() {
        return examCardActCode;
    }

    /**
     * Sets the value of the examCardActCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCardActCode(String value) {
        this.examCardActCode = value;
    }

    /**
     * Gets the value of the examNewCardNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMNewCardNum() {
        return examNewCardNum;
    }

    /**
     * Sets the value of the examNewCardNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMNewCardNum(String value) {
        this.examNewCardNum = value;
    }

    /**
     * Gets the value of the examNewCardExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMNewCardExpDt() {
        return examNewCardExpDt;
    }

    /**
     * Sets the value of the examNewCardExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMNewCardExpDt(LocalDate value) {
        this.examNewCardExpDt = value;
    }

    /**
     * Gets the value of the examActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMActionCode() {
        return examActionCode;
    }

    /**
     * Sets the value of the examActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMActionCode(String value) {
        this.examActionCode = value;
    }

    /**
     * Gets the value of the examIssueDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMIssueDt() {
        return examIssueDt;
    }

    /**
     * Sets the value of the examIssueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMIssueDt(LocalDate value) {
        this.examIssueDt = value;
    }

    /**
     * Gets the value of the examCardLastExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEXAMCardLastExpDt() {
        return examCardLastExpDt;
    }

    /**
     * Sets the value of the examCardLastExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCardLastExpDt(LocalDate value) {
        this.examCardLastExpDt = value;
    }

    /**
     * Gets the value of the examCardStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMCardStatus() {
        return examCardStatus;
    }

    /**
     * Sets the value of the examCardStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMCardStatus(String value) {
        this.examCardStatus = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the org property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrg() {
        return org;
    }

    /**
     * Sets the value of the org property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrg(String value) {
        this.org = value;
    }

    /**
     * Gets the value of the examBlockCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBlockCode() {
        return examBlockCode;
    }

    /**
     * Sets the value of the examBlockCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBlockCode(String value) {
        this.examBlockCode = value;
    }

    /**
     * Gets the value of the examAuthType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMAuthType() {
        return examAuthType;
    }

    /**
     * Sets the value of the examAuthType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMAuthType(String value) {
        this.examAuthType = value;
    }

    /**
     * Gets the value of the exammsicCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMSICCode() {
        return exammsicCode;
    }

    /**
     * Sets the value of the exammsicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMSICCode(String value) {
        this.exammsicCode = value;
    }

    /**
     * Gets the value of the exammsicCodeFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMMSICCodeFlg() {
        return exammsicCodeFlg;
    }

    /**
     * Sets the value of the exammsicCodeFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMMSICCodeFlg(String value) {
        this.exammsicCodeFlg = value;
    }

}
