package com.theerut.springj11.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CasaAccountTransactionResponse {
    @JsonProperty("account_id")
    private String accountId;

    @JsonProperty("description")
    private String description;

    @JsonProperty("amount")
    private String amount;

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("effective_datetime")
    private String effectiveDatetime;

    @JsonProperty("type")
    private String type;

    @JsonProperty("channel_code")
    private String channelCode;

    @JsonProperty("order_id")
    private String orderId;
}
