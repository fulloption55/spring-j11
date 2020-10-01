package com.theerut.springj11.client.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TestoInquiryFixedAccountsGroupListRequest {

    @JsonProperty("InquiryFixedAccountsGroupListRequest")
    private TestoFixedAccountsGroupRequest request;
}
