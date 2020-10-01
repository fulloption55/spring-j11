package com.theerut.springj11.controller.response;

import com.theerut.springj11.constant.AccountStatusEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TestoFixedAccountGroupResponse {
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
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("available_balance")
    private String availableBalance;
    @JsonProperty("status_code")
    private AccountStatusEnum statusCode;
    @JsonProperty("is_joint_type")
    private Boolean jointIndicator;
}
