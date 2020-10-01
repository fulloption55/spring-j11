
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for EXAM_ProviderErrorAttrList_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_ProviderErrorAttrList_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EXAM_ErrorAttribute" type="{urn:ifxforum-org:XSD:1}EXAM_ErrorAttribute_Type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_ProviderErrorAttrList_Type", propOrder = {
    "examErrorAttribute"
})
public class EXAMProviderErrorAttrListType {

    @XmlElement(name = "EXAM_ErrorAttribute")
    protected List<EXAMErrorAttributeType> examErrorAttribute;

    /**
     * Gets the value of the examErrorAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examErrorAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXAMErrorAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXAMErrorAttributeType }
     * 
     * 
     */
    public List<EXAMErrorAttributeType> getEXAMErrorAttribute() {
        if (examErrorAttribute == null) {
            examErrorAttribute = new ArrayList<>();
        }
        return this.examErrorAttribute;
    }

}
