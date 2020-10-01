package com.theerut.springj11.client.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TestoFixedAccountsGroupRequest {
    @JsonProperty("CustomerNo")
    private String customerId;
}
