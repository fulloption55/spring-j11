package com.theerut.springj11.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class PlacementDetailResponse {

    @JsonProperty("id")
    private String id;

    @JsonProperty("nickname")
    private String nickname;

    @JsonProperty("primary_name")
    private String primaryName;

    @JsonProperty("secondary_name")
    private String secondaryName;

    @JsonProperty("open_account_date")
    private String openAccountDate;

    @JsonProperty("placement_date")
    private String placementDate;

    @JsonProperty("maturity_date")
    private String maturityDate;

    @JsonProperty("status_code")
    private String statusCode;

    @JsonProperty("available_balance")
    private BigDecimal availableBalance;

    @JsonProperty("current_balance")
    private BigDecimal currentBalance;

    @JsonProperty("interest_rate")
    private BigDecimal interestRate;

    @JsonProperty("term_count")
    private Integer termCount;

    @JsonProperty("term_unit")
    private String termUnit;

    @JsonProperty("currency")
    private String currency;
}



