package com.theerut.springj11.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class AppTransactionsResponse {
    @JsonProperty("id")
    private String id;

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("activity")
    private ApplicationActivityResponse activity;

    @JsonProperty("status_code")
    private String statusCode;

    @JsonProperty("status_description")
    private String statusDescription;

    @JsonProperty("info_1")
    private String info1;

    @JsonProperty("info_2")
    private String info2;

    @JsonProperty("info_3")
    private String info3;

    @JsonProperty("info_4")
    private String info4;

    @JsonProperty("info_5")
    private String info5;

    @JsonProperty("info_6")
    private String info6;

    //    @JsonSerialize(using = CustomDateTimeUtc7Serializer.class)
    @JsonProperty("created_datetime")
    private LocalDateTime createdDatetime;

}
