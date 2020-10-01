package com.theerut.springj11.service.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class FixedAccount implements Serializable {
    private String id;
    private String type;
    private String statusCode;
    private String currency;
    private String name;
    private String branchId;
    private String availableBalance;
    private String currentBalance;
    private String productId;
    private String productDescription;
}
