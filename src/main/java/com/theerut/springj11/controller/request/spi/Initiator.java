package com.theerut.springj11.controller.request.spi;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Initiator {
    @JsonProperty("id")
    private String initiatorUserId;

    @JsonProperty("type")
    private String initiatorUserType;
}
