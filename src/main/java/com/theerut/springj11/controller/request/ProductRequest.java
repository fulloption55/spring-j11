package com.theerut.springj11.controller.request;

import com.theerut.springj11.constant.CurrencyEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class ProductRequest {

    @NotNull
    @JsonProperty("currency")
    private CurrencyEnum currency;

}
