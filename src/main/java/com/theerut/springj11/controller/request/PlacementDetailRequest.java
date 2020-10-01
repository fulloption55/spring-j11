package com.theerut.springj11.controller.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class PlacementDetailRequest {

    @NotEmpty
    @NotNull
    @JsonProperty("id")
    private String id;

    @NotEmpty
    @NotNull
    @JsonProperty("account_id")
    private String accountId;


}
