package com.theerut.springj11.service.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TestoAccount implements FilterableAccount {

    @JsonProperty("AccountNo")
    private String id;
    @JsonProperty("AccountType")
    private String type;
    @JsonProperty("AccountName")
    private String name;
    @JsonProperty("AccountShortName")
    private String shortName;
    @JsonProperty("BranchNo")
    private String branchId;
    @JsonProperty("DepositTypeCode")
    private String productId;
    @JsonProperty("TypeDescription")
    private String productName;
    @JsonProperty("LocalDescription")
    private String productLocalName;
    @JsonProperty("CurrencyCode")
    private String currency;
    @JsonProperty("LedgerBalance")
    private BigDecimal currentBalance;
    @JsonProperty("AvailableBalance")
    private BigDecimal availableBalance;
    @JsonProperty("CustomerNo")
    private String userId;
    @JsonProperty("RelationshipCode")
    private String relationshipCode;
    @JsonProperty("DrawingLimit")
    private Integer drawingLimit;
    @JsonProperty("AccountStatus")
    private String status;
    @JsonProperty("AccumulateIntBalance")
    private BigDecimal accumulateIntBalance;
    @JsonProperty("AllowDebit")
    private String allowDebit;
    @JsonProperty("AllowCredit")
    private String allowCredit;
}
