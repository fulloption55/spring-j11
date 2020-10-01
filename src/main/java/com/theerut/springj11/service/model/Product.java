package com.theerut.springj11.service.model;

import com.theerut.springj11.constant.AccountTypeEnum;
import com.theerut.springj11.controller.model.InterestTier;
import lombok.Data;

import java.util.List;

@Data
public class Product {
    private String id;
    private AccountTypeEnum type;
    private String name;
    private String localName;
    private String currency;
    private String localDescription;
    private String effectiveDate;
    private Integer accountLimit;
    private List<InterestTier> interestTier;
}
