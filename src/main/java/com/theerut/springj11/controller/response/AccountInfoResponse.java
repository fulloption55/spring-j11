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
public class AccountInfoResponse {

    @JsonProperty("account_id")
    private String accountId;

    @JsonProperty("account_type")
    private String accountType;

    @JsonProperty("prim_account_name")
    private String primAccountName;

    @JsonProperty("bank_account_status_code")
    private String bankAccountStatusCode;

    @JsonProperty("res_status")
    private String resStatus;

    @JsonProperty("branch_id")
    private String branchId;

    @JsonProperty("account_mode")
    private String accountMode;

    @JsonProperty("signing_cond")
    private String signingCond;

    @JsonProperty("pidm_flag")
    private String pidmFlag;

    @JsonProperty("available_amount")
    private BigDecimal availableAmount;

    @JsonProperty("current_amount")
    private BigDecimal currentAmount;

    @JsonProperty("currency_code")
    private String currentCode;

    @JsonProperty("product_id")
    private String productId;

    @JsonProperty("full_desc")
    private String fulldesc;

    @JsonProperty("joint_acc_indicator")
    private String jointacindicator;

    @JsonProperty("allow_debit")
    private String allowdebit;

    @JsonProperty("allow_credit")
    private String allowcredit;
}
