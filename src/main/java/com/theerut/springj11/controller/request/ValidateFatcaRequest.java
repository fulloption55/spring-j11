package com.theerut.springj11.controller.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ValidateFatcaRequest {

    @JsonProperty("user_id")
    private String userId;

}
