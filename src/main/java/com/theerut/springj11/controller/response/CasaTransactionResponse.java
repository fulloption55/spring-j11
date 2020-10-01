package com.theerut.springj11.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CasaTransactionResponse {

    @JsonProperty("transactions")
    private List<CasaAccountTransactionResponse> casaAccountTransactionResponseList;
}
