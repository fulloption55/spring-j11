package com.theerut.springj11.client.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FatcaProfileRequest {

    @JsonProperty("user_id")
    private String userId;

}
