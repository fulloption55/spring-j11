package com.theerut.springj11.controller.request;

import com.theerut.springj11.constant.AccountStatusEnum;
import com.theerut.springj11.constant.AccountTypeEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Getter
@Setter
public class AccountListRequest {

    @Min(value = 6)
    @JsonProperty("id")
    private String id;

    @NotEmpty
    @JsonProperty("status_codes")
    private List<AccountStatusEnum> statusCodes;

    @NotEmpty
    @JsonProperty("types")
    private List<AccountTypeEnum> types;

}
