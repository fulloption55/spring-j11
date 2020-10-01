package com.theerut.springj11.controller.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WatchListRequest {


    @JsonProperty("user_id")
    public String userId;

}
