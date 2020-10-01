package com.theerut.springj11.service.model;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AccountEmailForm {

    private String userId;
    private String referenceId;
    private String accountId;

    private String productId;
    private int factSheetVersion;
    private int termAndConditionVersion;
    private String productNameTh;
    private String productNameEn;
    private String accountTypeTh;
    private String accountTypeEn;
    private String branchNameTh;
    private String branchNameEn;
    private String email;

    private String customerNameTh;
    private String customerNameEn;

    private String createdDateTh;
    private String createdDateEn;
    private String createdTime;

    private String titleNameTh;
    private String titleNameEn;

    private LegalDocument termProduct;
    private LegalDocument factSheetProduct;


}
