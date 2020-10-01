package com.theerut.springj11.controller.response;

import com.theerut.springj11.constant.AccountTypeEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Setter;

@Builder
@Setter
public class AccountAddingResponse {

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private AccountTypeEnum type;

    @JsonProperty("reference_id")
    private String referenceId;

}

