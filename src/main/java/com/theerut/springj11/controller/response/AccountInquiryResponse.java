package com.theerut.springj11.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountInquiryResponse {
    @JsonProperty("account_primary_name")
    private String priacctname;
    @JsonProperty("account_second_name")
    private String secacctname;
    @JsonProperty("account_person_first_name")
    private String personfirstname;
    @JsonProperty("account_person_last_name")
    private String personlastname;
    @JsonProperty("account_person_nick_name")
    private String personnickname;
    @JsonProperty("account_type")
    private String accounttype;
    @JsonProperty("account_number")
    private String accountnumber;
    @JsonProperty("account_currency")
    private String currency;
    @JsonProperty("account_productid")
    private String productid;
    @JsonProperty("account_status")
    private String accountstatus;
    @JsonProperty("account_resident_status")
    private String resstatus;
    @JsonProperty("account_branch_id")
    private String branchid;
    @JsonProperty("account_mode")
    private String accountmode;
    @JsonProperty("account_interest_rate")
    private BigDecimal interestrate;
    @JsonProperty("account_interest_loading")
    private String interestloading;
    @JsonProperty("account_interest_rate_no")
    private String productinterestrateno;
    @JsonProperty("product_interest_rate")
    private String productinterestrate;
    @JsonProperty("account_desc")
    private String desc;
    @JsonProperty("account_full_desc")
    private String fulldesc;
    @JsonProperty("current_balance")
    private BigDecimal currentbalance;
    @JsonProperty("available_balance")
    private BigDecimal availablebalance;
    @JsonProperty("od_limit")
    private BigDecimal odlimit;
    @JsonProperty("credit_limit")
    private BigDecimal accountcreditlimit;
    @JsonProperty("account_interest")
    private BigDecimal accountinterest;
}
