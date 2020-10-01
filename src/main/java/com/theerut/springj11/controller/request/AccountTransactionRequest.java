package com.theerut.springj11.controller.request;

import com.theerut.springj11.constant.AccountTypeEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
public class AccountTransactionRequest {

    @NotNull
    @JsonProperty("account_id")
    private String accountId;

    @NotNull
    @JsonProperty("account_type")
    private AccountTypeEnum accountType;

    @NotNull
    @JsonProperty("start_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;

    @NotNull
    @JsonProperty("end_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate;

}
