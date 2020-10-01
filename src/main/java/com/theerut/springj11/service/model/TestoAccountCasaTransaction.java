package com.theerut.springj11.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class TestoAccountCasaTransaction {
    @JsonProperty("AccountNo")
    private String accountNo;

    @JsonProperty("TransactionDescription")
    private String transactionDescription;

    @JsonProperty("TransactionAmount")
    private BigDecimal transactionAmount;

    @JsonProperty("CurrencyCode")
    private String currencyCode;

    @JsonProperty("PostingTimestamp")
    private String postingTimestamp;

    @JsonProperty("DebitCreditCode")
    private String debitCreditCode;

    @JsonProperty("ChannelCode")
    private String channelCode;

    @JsonProperty("OrderID")
    private String orderID;
}
