package com.theerut.springj11.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class DocumentResponse {
    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("type")
    private String type;

    @JsonProperty("version")
    private Integer version;

    @JsonProperty("business_type")
    private String businessType;

    @JsonProperty("product_group_name")
    private String productGroupName;

    @JsonProperty("created_timestamp")
    private Timestamp createdTimestamp;

    @JsonProperty("product_reference")
    private String productReference;

    @JsonProperty("language")
    private String language;
}
