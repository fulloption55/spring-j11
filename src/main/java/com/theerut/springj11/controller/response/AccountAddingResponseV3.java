package com.theerut.springj11.controller.response;

import com.theerut.springj11.client.response.ErrorResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountAddingResponseV3 {

    @JsonProperty("account_no")
    private String accountNo;

    @JsonProperty("cif")
    private String cif;

    @JsonProperty("account_type")
    private String accountType;

    @JsonProperty("errors")
    private List<ErrorResponse> errorResponse;

    @JsonProperty("product_name_th")
    private String productNameTh;

    @JsonProperty("product_name_en")
    private String productNameEn;
}