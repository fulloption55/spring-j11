package com.theerut.springj11.controller.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InterestTier {

    @JsonProperty("level")
    private Integer level;

    @JsonProperty("interest_id")
    private String interestId;

    @JsonProperty("balance_rate")
    private String balanceRate;

    @JsonProperty("interest_rate")
    private String interestRate;

}
