package com.theerut.springj11.client.webservice;

import com.theerut.springj11.client.webservice.common.EXAMStatusType;

public interface ExamResponseInterface {
    EXAMStatusType getExamStatus();

    String getExamRqUID();
}
