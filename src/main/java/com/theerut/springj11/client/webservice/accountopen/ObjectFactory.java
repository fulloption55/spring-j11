package com.theerut.springj11.client.webservice.accountopen;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {
    }

    public EXAMAcctOpnRqType createEXAMAcctOpnRqType() {
        return new EXAMAcctOpnRqType();
    }

    public EXAMAcctOpnRsType createEXAMAcctOpnRsType() {
        return new EXAMAcctOpnRsType();
    }

    public EXAMAcctOpnSvc createEXAMAcctOpnSvc() {
        return new EXAMAcctOpnSvc();
    }

}
