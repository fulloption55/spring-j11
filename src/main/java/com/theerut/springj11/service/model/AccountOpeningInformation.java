package com.theerut.springj11.service.model;

import com.theerut.springj11.constant.AccountTypeEnum;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountOpeningInformation {
    private String userId;
    private String productId;
    private String customerNameTh;
    private String customerNameEn;
    private AccountTypeEnum accountType;
    private ProfileAddress mailingAddress;
    private String mobile;
    private String mobileType;
    private String email;
    private String emailType;
}
