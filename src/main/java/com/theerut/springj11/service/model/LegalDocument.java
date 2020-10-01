package com.theerut.springj11.service.model;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class LegalDocument {
    private String id;
    private String name;
    private String type;
    private Integer version;
    private String businessType;
    private String productGroupName;
    private Timestamp createdTimestamp;
    private String productReference;
    private String language;
}
