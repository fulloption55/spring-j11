package com.theerut.springj11.controller.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountType {

    @JsonProperty("code")
    private String code;

    @JsonProperty("description")
    private String description;

}
