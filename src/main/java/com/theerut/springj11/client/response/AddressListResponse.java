package com.theerut.springj11.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddressListResponse {

    @JsonProperty("CustomerNo")
    private String customerNo;

    @JsonProperty("AddressSequence")
    private Integer addressSequence;

    @JsonProperty("AddressFormat")
    private String addressFormat;

    @JsonProperty("AddressType")
    private String AddressType;
}
