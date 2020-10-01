package com.theerut.springj11.service.model;


import com.theerut.springj11.constant.AccountStatusEnum;
import com.theerut.springj11.constant.AccountTypeEnum;
import com.theerut.springj11.constant.CurrencyEnum;
import com.theerut.springj11.controller.request.AccountListRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountFilter {

    private String id;
    List<AccountStatusEnum> statusCodes;
    List<AccountTypeEnum> types;
    List<CurrencyEnum> currencies;

    public AccountFilter(AccountListRequest accountListRequest, List<CurrencyEnum> currencies) {
        this.id = accountListRequest.getId();
        this.statusCodes = accountListRequest.getStatusCodes();
        this.types = accountListRequest.getTypes();
        this.currencies = currencies;
    }
}
