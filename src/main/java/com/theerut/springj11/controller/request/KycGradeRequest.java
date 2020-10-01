package com.theerut.springj11.controller.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class KycGradeRequest {


    @JsonProperty("user_id")
    private String userId;

}
