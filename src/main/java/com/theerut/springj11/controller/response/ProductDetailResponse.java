package com.theerut.springj11.controller.response;

import com.theerut.springj11.controller.model.AccountType;
import com.theerut.springj11.controller.model.InterestTier;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDetailResponse {

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("account_type")
    private AccountType accountType;

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("description")
    private String description;

    @JsonProperty("account_limit")
    private Integer accountLimit;

    @JsonProperty("interest_tiers")
    private List<InterestTier> interestTiers;

}
