package com.theerut.springj11.controller.response;

import com.theerut.springj11.constant.AccountStatusEnum;
import com.theerut.springj11.constant.AccountTypeEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountResponse {

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private AccountTypeEnum type;

    @JsonProperty("primary_name")
    private String primaryName;

    @JsonProperty("status_code")
    private AccountStatusEnum statusCode;

    @JsonProperty("res_status")
    private String resStatus;

    @JsonProperty("branch_id")
    private String branchId;

    @JsonProperty("mode")
    private String mode;

    @JsonProperty("signing_cond")
    private String signingCond;

    @JsonProperty("available_balance")
    private String availableBalance;

    @JsonProperty("current_balance")
    private String currentBalance;

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("product_id")
    private String productId;

    @JsonProperty("product_desc")
    private String productDesc;

    @JsonProperty("pidm_flag")
    private Boolean pidmFlag;

    @JsonProperty("is_joint_type")
    private Boolean jointIndicator;

    @JsonProperty("is_allow_debit")
    private Boolean allowDebit;

    @JsonProperty("is_allow_credit")
    private Boolean allowCredit;

}
