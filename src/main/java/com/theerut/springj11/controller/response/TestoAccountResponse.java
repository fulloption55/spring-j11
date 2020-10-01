package com.theerut.springj11.controller.response;

import com.theerut.springj11.constant.AccountStatusEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TestoAccountResponse {

    @JsonProperty("id")
    private String id;

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("type")
    private String type;

    @JsonProperty("relationship")
    private String relationship;

    @JsonProperty("primary_name")
    private String primaryName;

    @JsonProperty("nick_name")
    private String nickName;

    @JsonProperty("branch_id")
    private String branchId;

    @JsonProperty("product_id")
    private String productId;

    @JsonProperty("product_name")
    private String productName;

    @JsonProperty("product_name_local")
    private String productNameLocal;

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("current_balance")
    private String currentBalance;

    @JsonProperty("available_balance")
    private String availableBalance;

    @JsonProperty("drawing_limit")
    private String drawingLimit;

    @JsonProperty("status_code")
    private AccountStatusEnum statusCode;

    @JsonProperty("accumulate_interest_balance")
    private String accumulateInterestBalance;

    @JsonProperty("is_joint_type")
    private Boolean jointIndicator;

    @JsonProperty("allow_debit")
    private Boolean allowDebit;

    @JsonProperty("allow_credit")
    private Boolean allowCredit;
}
