package com.theerut.springj11.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TestoBaseResponse {
    @JsonProperty("ResponseCode")
    private String responseCode;

    @JsonProperty("ResponseMessage")
    private String responseMessage;

    @JsonProperty("UsageTime")
    private Integer usageTime;

    @JsonProperty("Success")
    private Boolean success;
}
