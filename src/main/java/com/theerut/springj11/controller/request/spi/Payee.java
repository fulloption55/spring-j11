package com.theerut.springj11.controller.request.spi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;


@Data
@ToString(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Payee {

    @JsonProperty("account_no")
    private String accountNo;

    @JsonProperty("account_type")
    private String accountType;

    @JsonProperty("ref1")
    private String ref1;

    @JsonProperty("ref2")
    private String ref2;

    @JsonProperty("ref3")
    private String ref3;

    @JsonProperty("ref4")
    private String ref4;

    @JsonProperty("ref5")
    private String ref5;
}
