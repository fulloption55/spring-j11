package com.theerut.springj11.client.response;

import com.theerut.springj11.service.model.TestoAccount;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class TestoAccountDetailResponse extends TestoBaseResponse {
    @JsonProperty("Account")
    private TestoAccount account;
}
