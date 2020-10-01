package com.theerut.springj11.client.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class InquiryAddressListRequest {

    @JsonProperty("AddressFormat")
    private String  addressFormat;

    @JsonProperty("AddressType")
    private String  addressType;

    @JsonProperty("NextPageIndicator")
    private String  nextPageIndicator;
}
