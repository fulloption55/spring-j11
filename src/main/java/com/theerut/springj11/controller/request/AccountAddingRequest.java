package com.theerut.springj11.controller.request;

import com.theerut.springj11.constant.AccountTypeEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class AccountAddingRequest {

    @NotNull
    @JsonProperty("product_id")
    private String productId;

    @NotNull
    @JsonProperty("purpose_id")
    private String purposeId;

    @NotNull
    @JsonProperty("type")
    private AccountTypeEnum accountType;

    @NotNull
    @JsonProperty("user_id")
    private String userId;


}
