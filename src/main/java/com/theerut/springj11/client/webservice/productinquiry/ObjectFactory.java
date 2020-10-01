package com.theerut.springj11.client.webservice.productinquiry;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {
    }

    public EXAMProdInqDetailsType createEXAMProdInqDetailsType() {
        return new EXAMProdInqDetailsType();
    }

    public EXAMProductInquiry createEXAMProductInquiry(){
        return new EXAMProductInquiry();
    }

    public EXAMProductInquiryRqType createEXAMProductInquiryRqType(){
        return new EXAMProductInquiryRqType();
    }

    public EXAMProductInquiryRsType createEXAMProductInquiryRsType(){
        return new EXAMProductInquiryRsType();
    }
}
