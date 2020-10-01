package com.theerut.springj11.client.response;

import com.theerut.springj11.service.model.TestoFixedAccountGroup;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class TestoFixedAccountGroupListResponse extends TestoBaseResponse {
    @JsonProperty("InquiryFixedAccountsGroupListResponse")
    private List<TestoFixedAccountGroup> accounts;
}
