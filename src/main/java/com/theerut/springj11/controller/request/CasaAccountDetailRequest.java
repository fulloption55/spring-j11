package com.theerut.springj11.controller.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.Min;

@Data
public class CasaAccountDetailRequest {
    @Min(value = 6)
    @JsonProperty("id")
    private String id;
}
