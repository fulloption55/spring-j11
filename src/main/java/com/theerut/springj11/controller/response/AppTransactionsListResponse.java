package com.theerut.springj11.controller.response;

import com.theerut.springj11.controller.model.Pagination;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class AppTransactionsListResponse {
    @JsonProperty("pagination")
    private Pagination pagination;

    @JsonProperty("application_transactions")
    private List<AppTransactionsResponse> transactionsResponses;
}
