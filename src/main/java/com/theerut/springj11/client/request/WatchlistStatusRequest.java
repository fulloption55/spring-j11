package com.theerut.springj11.client.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WatchlistStatusRequest {

    @JsonProperty("id")
    private String cifId;


}
