package com.theerut.springj11.client.webservice.accountinquiry;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {
    }

    public EXAMAcctInqRqType createEXAMAcctInqRqType() {
        return new EXAMAcctInqRqType();
    }

    public EXAMAcctInqRsType createEXAMAcctInqRsType() {
        return new EXAMAcctInqRsType();
    }

    public EXAMAcctInqSvc createEXAMAcctInqSvc() {
        return new EXAMAcctInqSvc();
    }

}
