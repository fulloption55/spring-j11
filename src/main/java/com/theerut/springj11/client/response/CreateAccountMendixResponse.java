package com.theerut.springj11.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateAccountTestoResponse {
    @JsonProperty("data")
    private TestoCreateAccountDataResponse data;
}
