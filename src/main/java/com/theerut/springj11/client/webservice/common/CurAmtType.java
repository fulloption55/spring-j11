
package com.theerut.springj11.client.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurAmt_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurAmt_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}CurrencyAmount">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurAmt_Type")
@XmlSeeAlso({
    EXAMCurAmtType.class
})
public class CurAmtType
    extends CurrencyAmount
{


}
