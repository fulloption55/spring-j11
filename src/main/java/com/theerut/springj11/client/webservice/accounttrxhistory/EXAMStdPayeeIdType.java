
package com.theerut.springj11.client.webservice.accounttrxhistory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXAM_StdPayeeId_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXAM_StdPayeeId_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}StdPayeeId_Type">
 *       &lt;sequence>
 *         &lt;element name="EXAM_ServCode" type="{urn:ifxforum-org:XSD:1}NC"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_StdPayeeId_Type", propOrder = {
    "examServCode"
})
public class EXAMStdPayeeIdType
    extends StdPayeeIdType
{

    @XmlElement(name = "EXAM_ServCode", required = true)
    protected String examServCode;

    /**
     * Gets the value of the examServCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXAMServCode() {
        return examServCode;
    }

    /**
     * Sets the value of the examServCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXAMServCode(String value) {
        this.examServCode = value;
    }

}
