package com.theerut.springj11.client.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TestoCreateAccountDataResponse {
    @JsonProperty("account_no")
    private String accountNo;

    @JsonProperty("cif")
    private String cif;

    @JsonProperty("account_type")
    private String accountType;

    @JsonProperty("errors")
    private List<ErrorResponse> errorResponse;
}
