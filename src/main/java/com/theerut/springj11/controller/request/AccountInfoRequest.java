package com.theerut.springj11.controller.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AccountInfoRequest {
    @JsonProperty("account_id")
    private String  accountId;
}
