package com.theerut.springj11.client.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TestoAccountDetailRequest {

    @JsonProperty("AccountType")
    private String accountType;
}
