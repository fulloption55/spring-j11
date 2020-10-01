package com.theerut.springj11.controller.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountInquiryRequest {
    @JsonProperty("account_no")
    private String  accountNo;
    @JsonProperty("account_type")
    private String  accountType;
}
