package com.theerut.springj11.service.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ExamStatus {
    private String requestId;
    private List<Long> statusCodes;
    private List<String> statusDescriptions;
    private List<String> severities;
}