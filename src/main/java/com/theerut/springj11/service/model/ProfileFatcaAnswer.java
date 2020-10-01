package com.theerut.springj11.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ProfileFatcaAnswer {

    @JsonProperty("status")
    private Boolean status;

    @JsonProperty("status_code")
    private String statusCode;

    @JsonProperty("status_description")
    private String statusDescription;

}
