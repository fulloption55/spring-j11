package com.theerut.springj11.client.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class TestoGetAddressRequest {

    @JsonProperty("TransactionNo")
    private String  transactionNo;

    @JsonProperty("TransactionDateTime")
    private String  transactionDateTime;

    @NotBlank
    @JsonProperty("TellerID")
    private String  tellerID;

    @NotBlank
    @JsonProperty("InquiryAddressListRequest")
    private InquiryAddressListRequest  inquiryAddressListRequest;

}
