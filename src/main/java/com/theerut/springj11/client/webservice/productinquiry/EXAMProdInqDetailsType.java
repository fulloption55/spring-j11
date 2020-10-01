
package com.theerut.springj11.client.webservice.productinquiry;

import com.theerut.springj11.client.webservice.accountsummary.EXAMAcctInfoType;
import com.theerut.springj11.client.webservice.common.EXAMExtensionInfoType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for EXAM_ProdInqDetails_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_ProdInqDetails_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_ExtnInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_AcctInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_ProdInqDetails_Type", propOrder = {
    "examExtnInfo",
    "examAcctInfo"
})
public class EXAMProdInqDetailsType {

    @XmlElement(name = "EXAM_ExtnInfo")
    protected List<EXAMExtensionInfoType> examExtnInfo;
    @XmlElement(name = "EXAM_AcctInfo")
    protected EXAMAcctInfoType examAcctInfo;

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

    /**
     * Gets the value of the examAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EXAMAcctInfoType }
     *     
     */
    public EXAMAcctInfoType getExamAcctInfo() {
        return examAcctInfo;
    }

    /**
     * Sets the value of the examAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXAMAcctInfoType }
     *     
     */
    public void setEXAMAcctInfo(EXAMAcctInfoType value) {
        this.examAcctInfo = value;
    }

}
