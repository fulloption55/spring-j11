package com.theerut.springj11.client.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TestoProductDetailRequest {
    @JsonProperty("CurrencyCode")
    private String currencyCode;

    @JsonProperty("CustomerSubType")
    private String customerSubType;
}
