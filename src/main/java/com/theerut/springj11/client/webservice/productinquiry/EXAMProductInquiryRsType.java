
package com.theerut.springj11.client.webservice.productinquiry;

import com.theerut.springj11.client.webservice.ExamResponseInterface;
import com.theerut.springj11.client.webservice.common.EXAMStatusType;
import com.theerut.springj11.client.webservice.common.StatusType;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;


/**
 * <p>Java class for EXAM_ProductInquiryRs_Type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="EXAM_ProductInquiryRs_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_RqUID"/>
 *         &lt;choice>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}EXAM_Status"/>
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}Status"/>
 *         &lt;/choice>
 *         &lt;element name="EXAM_ProdInqDetails" type="{urn:ifxforum-org:XSD:1}EXAM_ProdInqDetails_Type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXAM_ProductInquiryRs_Type", propOrder = {
        "examRqUID",
        "examStatus",
        "status",
        "examProdInqDetails"
})
public class EXAMProductInquiryRsType implements ExamResponseInterface {

    @XmlElement(name = "EXAM_RqUID", required = true)
    protected String examRqUID;
    @XmlElement(name = "EXAM_Status")
    protected EXAMStatusType examStatus;
    @XmlElement(name = "Status")
    protected StatusType status;
    @XmlElement(name = "EXAM_ProdInqDetails")
    protected List<EXAMProdInqDetailsType> examProdInqDetails;

}
