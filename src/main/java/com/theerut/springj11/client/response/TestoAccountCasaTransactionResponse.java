package com.theerut.springj11.client.response;

import com.theerut.springj11.service.model.TestoAccountCasaTransaction;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class TestoAccountCasaTransactionResponse extends TestoBaseResponse {

    @JsonProperty("TransactionList")
    private List<TestoAccountCasaTransaction> transactionList;

}


