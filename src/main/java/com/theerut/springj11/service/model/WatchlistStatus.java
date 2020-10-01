package com.theerut.springj11.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WatchlistStatus {

    @JsonProperty("status")
    private boolean status;

    @JsonProperty("status_code")
    private long statusCode;

    @JsonProperty("status_description")
    private String statusDescription;

}
