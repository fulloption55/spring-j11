package com.theerut.springj11.controller.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AccountCasaTransactionRequest {

    @JsonProperty("account_id")
    private String accountId;

    @JsonProperty("start_date_time")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSSXXX", timezone="Asia/Bangkok")
    private LocalDateTime startDateTime;

    @JsonProperty("limit")
    private Integer limit = 20;
}
