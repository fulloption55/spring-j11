package com.theerut.springj11.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ApplicationActivityResponse {
    @JsonProperty("id")
    private int id;

    @JsonProperty("name")
    private String activityName;
}
