package com.theerut.springj11.service.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TestoFixedAccountGroup implements FilterableAccount {
    @JsonProperty("AccountGroupNo")
    private String id;
    @JsonProperty("AccountGroupType")
    private String type;
    @JsonProperty("AccountGroupName")
    private String name;
    @JsonProperty("AccountGroupShortName")
    private String shortName;
    @JsonProperty("AccountBranch")
    private String branchId;
    @JsonProperty("GroupCurrency")
    private String currency;
    @JsonProperty("GroupBalance")
    private BigDecimal availableBalance;
    @JsonProperty("CustomerNo")
    private String userId;
    @JsonProperty("AccountGroupMode")
    private String relationshipCode;
    @JsonProperty("AccountGroupStatus")
    private String status;
}
