package com.theerut.springj11.controller.request;

import com.theerut.springj11.constant.AccountTypeEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class AccountDetailRequest {

    @Min(value = 6)
    @JsonProperty("id")
    private String id;

    @NotNull
    @JsonProperty("type")
    private AccountTypeEnum type;

}
