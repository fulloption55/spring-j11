package com.theerut.springj11.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class TestoFixedAccountGroupListResponse {
    @JsonProperty("accounts")
    private List<TestoFixedAccountGroupResponse> accounts;
}
