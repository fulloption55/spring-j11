
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for EXAM_ProviderRespStatusList_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_ProviderRespStatusList_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EXAM_ProviderRespStatus" type="{urn:ifxforum-org:XSD:1}EXAM_ProviderRespStatus_Type" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_ProviderRespStatusList_Type", propOrder = {
    "examProviderRespStatus"
})
public class EXAMProviderRespStatusListType {

    @XmlElement(name = "EXAM_ProviderRespStatus", required = true)
    protected List<EXAMProviderRespStatusType> examProviderRespStatus;

    /**
     * Gets the value of the examProviderRespStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examProviderRespStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMProviderRespStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMProviderRespStatusType }
     * 
     * 
     */
    public List<EXAMProviderRespStatusType> getEXAMProviderRespStatus() {
        if (examProviderRespStatus == null) {
            examProviderRespStatus = new ArrayList<>();
        }
        return this.examProviderRespStatus;
    }

    public void setExamProviderRespStatus(List<EXAMProviderRespStatusType> respStatusTypeList) {
        this.examProviderRespStatus = respStatusTypeList;
    }

}
