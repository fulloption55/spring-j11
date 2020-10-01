
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for EXAM_PostAddr_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_PostAddr_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SeqNum" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AddrType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AddressFormat" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Addr1" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Addr2" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Addr3" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Addr4" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Addr5" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Addr6" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Addr7" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Addr8" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}City" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Country" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StateProv" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PostalCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StartDt" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PostAddr" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastMaintUID" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastMaintTm" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_HouseNo" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Storey" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Unit" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Building_Name" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Street_Name" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_PoBox" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_HomeCode" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_LastMaintTmStamp" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AddrType" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_DefaultCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Fax" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Village" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_District" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RW" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RT" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Dati" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_InSuffAddrInd" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_JustifyCatAddr1" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_JustifyRsnAddr1" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_JustifyCatAddr2" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_JustifyRsnAddr2" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_JustifyCatAddr3" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_JustifyRsnAddr3" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_JustifyCatAddr4" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_JustifyRsnAddr4" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_JustifyCatAddr5" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_JustifyRsnAddr5" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_JustifyCatAddr6" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_JustifyRsnAddr6" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_JustifyCatAddr7" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_JustifyRsnAddr7" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ExtnInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_PostAddr_Type", propOrder = {
    "seqNum",
    "addrType",
    "examAddressFormat",
    "addr1",
    "addr2",
    "addr3",
    "addr4",
    "examAddr5",
    "examAddr6",
    "examAddr7",
    "examAddr8",
    "city",
    "country",
    "stateProv",
    "postalCode",
    "startDt",
    "postAddr",
    "examLastMaintUID",
    "examLastMaintTm",
    "examHouseNo",
    "examStorey",
    "examUnit",
    "examBuildingName",
    "examStreetName",
    "examPoBox",
    "examHomeCode",
    "examLastMaintTmStamp",
    "examAddrType",
    "examDefaultCode",
    "fax",
    "examVillage",
    "examDistrict",
    "examrw",
    "examrt",
    "examDati",
    "examInSuffAddrInd",
    "examJustifyCatAddr1",
    "examJustifyRsnAddr1",
    "examJustifyCatAddr2",
    "examJustifyRsnAddr2",
    "examJustifyCatAddr3",
    "examJustifyRsnAddr3",
    "examJustifyCatAddr4",
    "examJustifyRsnAddr4",
    "examJustifyCatAddr5",
    "examJustifyRsnAddr5",
    "examJustifyCatAddr6",
    "examJustifyRsnAddr6",
    "examJustifyCatAddr7",
    "examJustifyRsnAddr7",
    "examExtnInfo"
})
public class EXAMPostAddrType {

    @XmlElement(name = "SeqNum")
    protected Long seqNum;
    @XmlElement(name = "AddrType")
    protected String addrType;
    @XmlElement(name = "EXAM_AddressFormat")
    protected String examAddressFormat;
    @XmlElement(name = "Addr1")
    protected String addr1;
    @XmlElement(name = "Addr2")
    protected String addr2;
    @XmlElement(name = "Addr3")
    protected String addr3;
    @XmlElement(name = "Addr4")
    protected String addr4;
    @XmlElement(name = "EXAM_Addr5")
    protected String examAddr5;
    @XmlElement(name = "EXAM_Addr6")
    protected String examAddr6;
    @XmlElement(name = "EXAM_Addr7")
    protected String examAddr7;
    @XmlElement(name = "EXAM_Addr8")
    protected String examAddr8;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "StateProv")
    protected String stateProv;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "StartDt")
    protected String startDt;
    @XmlElement(name = "PostAddr")
    protected PostAddrType postAddr;
    @XmlElement(name = "EXAM_LastMaintUID")
    protected String examLastMaintUID;
    @XmlElement(name = "EXAM_LastMaintTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar examLastMaintTm;
    @XmlElement(name = "EXAM_HouseNo")
    protected String examHouseNo;
    @XmlElement(name = "EXAM_Storey")
    protected String examStorey;
    @XmlElement(name = "EXAM_Unit")
    protected String examUnit;
    @XmlElement(name = "EXAM_Building_Name")
    protected String examBuildingName;
    @XmlElement(name = "EXAM_Street_Name")
    protected String examStreetName;
    @XmlElement(name = "EXAM_PoBox")
    protected String examPoBox;
    @XmlElement(name = "EXAM_HomeCode")
    protected String examHomeCode;
    @XmlElement(name = "EXAM_LastMaintTmStamp")
    protected String examLastMaintTmStamp;
    @XmlElement(name = "EXAM_AddrType")
    protected String examAddrType;
    @XmlElement(name = "EXAM_DefaultCode")
    protected List<String> examDefaultCode;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "EXAM_Village")
    protected String examVillage;
    @XmlElement(name = "EXAM_District")
    protected String examDistrict;
    @XmlElement(name = "EXAM_RW")
    protected String examrw;
    @XmlElement(name = "EXAM_RT")
    protected String examrt;
    @XmlElement(name = "EXAM_Dati")
    protected String examDati;
    @XmlElement(name = "EXAM_InSuffAddrInd")
    protected String examInSuffAddrInd;
    @XmlElement(name = "EXAM_JustifyCatAddr1")
    protected String examJustifyCatAddr1;
    @XmlElement(name = "EXAM_JustifyRsnAddr1")
    protected String examJustifyRsnAddr1;
    @XmlElement(name = "EXAM_JustifyCatAddr2")
    protected String examJustifyCatAddr2;
    @XmlElement(name = "EXAM_JustifyRsnAddr2")
    protected String examJustifyRsnAddr2;
    @XmlElement(name = "EXAM_JustifyCatAddr3")
    protected String examJustifyCatAddr3;
    @XmlElement(name = "EXAM_JustifyRsnAddr3")
    protected String examJustifyRsnAddr3;
    @XmlElement(name = "EXAM_JustifyCatAddr4")
    protected String examJustifyCatAddr4;
    @XmlElement(name = "EXAM_JustifyRsnAddr4")
    protected String examJustifyRsnAddr4;
    @XmlElement(name = "EXAM_JustifyCatAddr5")
    protected String examJustifyCatAddr5;
    @XmlElement(name = "EXAM_JustifyRsnAddr5")
    protected String examJustifyRsnAddr5;
    @XmlElement(name = "EXAM_JustifyCatAddr6")
    protected String examJustifyCatAddr6;
    @XmlElement(name = "EXAM_JustifyRsnAddr6")
    protected String examJustifyRsnAddr6;
    @XmlElement(name = "EXAM_JustifyCatAddr7")
    protected String examJustifyCatAddr7;
    @XmlElement(name = "EXAM_JustifyRsnAddr7")
    protected String examJustifyRsnAddr7;
    @XmlElement(name = "EXAM_ExtnInfo")
    protected List<EXAMExtensionInfoType> examExtnInfo;

    /**
     * Gets the value of the seqNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSeqNum() {
        return seqNum;
    }

    /**
     * Sets the value of the seqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeqNum(Long value) {
        this.seqNum = value;
    }

    /**
     * Gets the value of the addrType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrType() {
        return addrType;
    }

    /**
     * Sets the value of the addrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrType(String value) {
        this.addrType = value;
    }

    /**
     * Gets the value of the examAddressFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMAddressFormat() {
        return examAddressFormat;
    }

    /**
     * Sets the value of the examAddressFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMAddressFormat(String value) {
        this.examAddressFormat = value;
    }

    /**
     * Gets the value of the addr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr1() {
        return addr1;
    }

    /**
     * Sets the value of the addr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr1(String value) {
        this.addr1 = value;
    }

    /**
     * Gets the value of the addr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr2() {
        return addr2;
    }

    /**
     * Sets the value of the addr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr2(String value) {
        this.addr2 = value;
    }

    /**
     * Gets the value of the addr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr3() {
        return addr3;
    }

    /**
     * Sets the value of the addr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr3(String value) {
        this.addr3 = value;
    }

    /**
     * Gets the value of the addr4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr4() {
        return addr4;
    }

    /**
     * Sets the value of the addr4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr4(String value) {
        this.addr4 = value;
    }

    /**
     * Gets the value of the examAddr5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMAddr5() {
        return examAddr5;
    }

    /**
     * Sets the value of the examAddr5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMAddr5(String value) {
        this.examAddr5 = value;
    }

    /**
     * Gets the value of the examAddr6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMAddr6() {
        return examAddr6;
    }

    /**
     * Sets the value of the examAddr6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMAddr6(String value) {
        this.examAddr6 = value;
    }

    /**
     * Gets the value of the examAddr7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMAddr7() {
        return examAddr7;
    }

    /**
     * Sets the value of the examAddr7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMAddr7(String value) {
        this.examAddr7 = value;
    }

    /**
     * Gets the value of the examAddr8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMAddr8() {
        return examAddr8;
    }

    /**
     * Sets the value of the examAddr8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMAddr8(String value) {
        this.examAddr8 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

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
     * Gets the value of the stateProv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateProv() {
        return stateProv;
    }

    /**
     * Sets the value of the stateProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateProv(String value) {
        this.stateProv = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDt(String value) {
        this.startDt = value;
    }

    /**
     * Gets the value of the postAddr property.
     * 
     * @return
     *     possible object is
     *     {@link PostAddrType }
     *     
     */
    public PostAddrType getPostAddr() {
        return postAddr;
    }

    /**
     * Sets the value of the postAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostAddrType }
     *     
     */
    public void setPostAddr(PostAddrType value) {
        this.postAddr = value;
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
     * Gets the value of the examHouseNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMHouseNo() {
        return examHouseNo;
    }

    /**
     * Sets the value of the examHouseNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMHouseNo(String value) {
        this.examHouseNo = value;
    }

    /**
     * Gets the value of the examStorey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMStorey() {
        return examStorey;
    }

    /**
     * Sets the value of the examStorey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMStorey(String value) {
        this.examStorey = value;
    }

    /**
     * Gets the value of the examUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMUnit() {
        return examUnit;
    }

    /**
     * Sets the value of the examUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMUnit(String value) {
        this.examUnit = value;
    }

    /**
     * Gets the value of the examBuildingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMBuildingName() {
        return examBuildingName;
    }

    /**
     * Sets the value of the examBuildingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMBuildingName(String value) {
        this.examBuildingName = value;
    }

    /**
     * Gets the value of the examStreetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMStreetName() {
        return examStreetName;
    }

    /**
     * Sets the value of the examStreetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMStreetName(String value) {
        this.examStreetName = value;
    }

    /**
     * Gets the value of the examPoBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMPoBox() {
        return examPoBox;
    }

    /**
     * Sets the value of the examPoBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMPoBox(String value) {
        this.examPoBox = value;
    }

    /**
     * Gets the value of the examHomeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMHomeCode() {
        return examHomeCode;
    }

    /**
     * Sets the value of the examHomeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMHomeCode(String value) {
        this.examHomeCode = value;
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
     * Gets the value of the examAddrType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMAddrType() {
        return examAddrType;
    }

    /**
     * Sets the value of the examAddrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMAddrType(String value) {
        this.examAddrType = value;
    }

    /**
     * Gets the value of the examDefaultCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examDefaultCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMDefaultCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEXAMDefaultCode() {
        if (examDefaultCode == null) {
            examDefaultCode = new ArrayList<>();
        }
        return this.examDefaultCode;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the examVillage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMVillage() {
        return examVillage;
    }

    /**
     * Sets the value of the examVillage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMVillage(String value) {
        this.examVillage = value;
    }

    /**
     * Gets the value of the examDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMDistrict() {
        return examDistrict;
    }

    /**
     * Sets the value of the examDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMDistrict(String value) {
        this.examDistrict = value;
    }

    /**
     * Gets the value of the examrw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMRW() {
        return examrw;
    }

    /**
     * Sets the value of the examrw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMRW(String value) {
        this.examrw = value;
    }

    /**
     * Gets the value of the examrt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMRT() {
        return examrt;
    }

    /**
     * Sets the value of the examrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMRT(String value) {
        this.examrt = value;
    }

    /**
     * Gets the value of the examDati property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMDati() {
        return examDati;
    }

    /**
     * Sets the value of the examDati property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMDati(String value) {
        this.examDati = value;
    }

    /**
     * Gets the value of the examInSuffAddrInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMInSuffAddrInd() {
        return examInSuffAddrInd;
    }

    /**
     * Sets the value of the examInSuffAddrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMInSuffAddrInd(String value) {
        this.examInSuffAddrInd = value;
    }

    /**
     * Gets the value of the examJustifyCatAddr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMJustifyCatAddr1() {
        return examJustifyCatAddr1;
    }

    /**
     * Sets the value of the examJustifyCatAddr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMJustifyCatAddr1(String value) {
        this.examJustifyCatAddr1 = value;
    }

    /**
     * Gets the value of the examJustifyRsnAddr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMJustifyRsnAddr1() {
        return examJustifyRsnAddr1;
    }

    /**
     * Sets the value of the examJustifyRsnAddr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMJustifyRsnAddr1(String value) {
        this.examJustifyRsnAddr1 = value;
    }

    /**
     * Gets the value of the examJustifyCatAddr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMJustifyCatAddr2() {
        return examJustifyCatAddr2;
    }

    /**
     * Sets the value of the examJustifyCatAddr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMJustifyCatAddr2(String value) {
        this.examJustifyCatAddr2 = value;
    }

    /**
     * Gets the value of the examJustifyRsnAddr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMJustifyRsnAddr2() {
        return examJustifyRsnAddr2;
    }

    /**
     * Sets the value of the examJustifyRsnAddr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMJustifyRsnAddr2(String value) {
        this.examJustifyRsnAddr2 = value;
    }

    /**
     * Gets the value of the examJustifyCatAddr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMJustifyCatAddr3() {
        return examJustifyCatAddr3;
    }

    /**
     * Sets the value of the examJustifyCatAddr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMJustifyCatAddr3(String value) {
        this.examJustifyCatAddr3 = value;
    }

    /**
     * Gets the value of the examJustifyRsnAddr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMJustifyRsnAddr3() {
        return examJustifyRsnAddr3;
    }

    /**
     * Sets the value of the examJustifyRsnAddr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMJustifyRsnAddr3(String value) {
        this.examJustifyRsnAddr3 = value;
    }

    /**
     * Gets the value of the examJustifyCatAddr4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMJustifyCatAddr4() {
        return examJustifyCatAddr4;
    }

    /**
     * Sets the value of the examJustifyCatAddr4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMJustifyCatAddr4(String value) {
        this.examJustifyCatAddr4 = value;
    }

    /**
     * Gets the value of the examJustifyRsnAddr4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMJustifyRsnAddr4() {
        return examJustifyRsnAddr4;
    }

    /**
     * Sets the value of the examJustifyRsnAddr4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMJustifyRsnAddr4(String value) {
        this.examJustifyRsnAddr4 = value;
    }

    /**
     * Gets the value of the examJustifyCatAddr5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMJustifyCatAddr5() {
        return examJustifyCatAddr5;
    }

    /**
     * Sets the value of the examJustifyCatAddr5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMJustifyCatAddr5(String value) {
        this.examJustifyCatAddr5 = value;
    }

    /**
     * Gets the value of the examJustifyRsnAddr5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMJustifyRsnAddr5() {
        return examJustifyRsnAddr5;
    }

    /**
     * Sets the value of the examJustifyRsnAddr5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMJustifyRsnAddr5(String value) {
        this.examJustifyRsnAddr5 = value;
    }

    /**
     * Gets the value of the examJustifyCatAddr6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMJustifyCatAddr6() {
        return examJustifyCatAddr6;
    }

    /**
     * Sets the value of the examJustifyCatAddr6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMJustifyCatAddr6(String value) {
        this.examJustifyCatAddr6 = value;
    }

    /**
     * Gets the value of the examJustifyRsnAddr6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMJustifyRsnAddr6() {
        return examJustifyRsnAddr6;
    }

    /**
     * Sets the value of the examJustifyRsnAddr6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMJustifyRsnAddr6(String value) {
        this.examJustifyRsnAddr6 = value;
    }

    /**
     * Gets the value of the examJustifyCatAddr7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMJustifyCatAddr7() {
        return examJustifyCatAddr7;
    }

    /**
     * Sets the value of the examJustifyCatAddr7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMJustifyCatAddr7(String value) {
        this.examJustifyCatAddr7 = value;
    }

    /**
     * Gets the value of the examJustifyRsnAddr7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMJustifyRsnAddr7() {
        return examJustifyRsnAddr7;
    }

    /**
     * Sets the value of the examJustifyRsnAddr7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMJustifyRsnAddr7(String value) {
        this.examJustifyRsnAddr7 = value;
    }

    /**
     * Gets the value of the examExtnInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examExtnInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMExtnInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMExtensionInfoType }
     * 
     * 
     */
    public List<EXAMExtensionInfoType> getEXAMExtnInfo() {
        if (examExtnInfo == null) {
            examExtnInfo = new ArrayList<>();
        }
        return this.examExtnInfo;
    }

}
