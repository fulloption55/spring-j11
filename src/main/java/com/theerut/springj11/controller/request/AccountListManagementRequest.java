package com.theerut.springj11.controller.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
public class AccountListManagementRequest {

    @NotNull
    @JsonProperty("user_id")
    private String userId;

    @Min(value = 6)
    @JsonProperty("id")
    private String id;

    @NotEmpty
    @JsonProperty("status_codes")
    private List<String> statusCodes;

    @NotEmpty
    @JsonProperty("types")
    private List<String> types;

}

