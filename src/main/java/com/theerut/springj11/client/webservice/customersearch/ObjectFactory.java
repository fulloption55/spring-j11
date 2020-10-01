package com.theerut.springj11.client.webservice.customersearch;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {
    }

    public ChkIssueStatusType createChkIssueStatusType(){
        return new ChkIssueStatusType();
    }

    public EXAMChkMaintInfoRecType createEXAMChkMaintInfoRecType(){
        return new EXAMChkMaintInfoRecType();
    }

    public EXAMChkStatusRecType createEXAMChkStatusRecType(){
        return  new EXAMChkStatusRecType();
    }

    public EXAMCustInqOpr createEXAMCustInqOpr(){
        return new EXAMCustInqOpr();
    }

    public EXAMCustInqRqType createEXAMCustInqRqType(){
        return new EXAMCustInqRqType();
    }

    public EXAMCustInqRsType createEXAMCustInqRsType(){
        return new EXAMCustInqRsType();
    }

    public EXAMCustSearchOpr createEXAMCustSearchOpr(){ return new  EXAMCustSearchOpr(); }

    public EXAMCustSearchRqType createEXAMCustSearchRqType(){ return new  EXAMCustSearchRqType(); }

    public EXAMCustSearchRsType createEXAMCustSearchRsType(){ return new  EXAMCustSearchRsType(); }

    public EXAMCustSearchType createEXAMCustSearchType(){ return new  EXAMCustSearchType(); }

}
