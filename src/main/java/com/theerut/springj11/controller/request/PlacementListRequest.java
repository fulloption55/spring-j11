package com.theerut.springj11.controller.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class PlacementListRequest {

    @NotEmpty
    @Min(value = 6)
    @JsonProperty("account_id")
    private String accountId;

}
