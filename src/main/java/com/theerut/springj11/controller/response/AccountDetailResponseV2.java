package com.theerut.springj11.controller.response;

import com.theerut.springj11.controller.model.InterestTier;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class AccountDetailResponseV2 {
    private String id;
    private String userId;
    private String relationship;
    private String type;
    private String statusCode;
    private String currency;
    private String primaryName;
    private String nickName;
    private String branchId;
    private String availableBalance;
    private String currentBalance;
    private String accumulateInterestBalance;
    private String productId;
    private String productName;
    private String productNameEn;
    private Integer drawingLimit;
    private Boolean allowDebit;
    private Boolean allowCredit;
    private String interestType;
    private List<InterestTier> interestTiers;
}
