package com.theerut.springj11.client.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class TestoAccountCasaTransactionRequest {
    @JsonProperty("AccountType")
    private String accountType;

    @JsonProperty("StartDate")
    private String startDate;

    @JsonProperty("StartTime")
    private String startTime;

}
