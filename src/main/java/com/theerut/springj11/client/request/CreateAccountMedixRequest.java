package com.theerut.springj11.client.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateAccountMedixRequest {

    @JsonProperty("journal_seq")
    private String  journalSeq;

    @NotBlank
    @JsonProperty("product_code")
    private String  productCode;

    @NotBlank
    @JsonProperty("account_type")
    private String  accountType;

    @JsonProperty("account_name")
    private String  accountName;

    @JsonProperty("account_short_name")
    private String  accountShortName;

    @JsonProperty("account_amount")
    private BigDecimal accountAmount;

    @JsonProperty("account_currency_code")
    private String  accountCurrencyCode;

    @NotBlank
    @JsonProperty("cif")
    private String  cif;

    @NotBlank
    @JsonProperty("signing_condition")
    private String  signingCondition;

    @JsonProperty("servicing_rm")
    private String  servicingRm;

    @JsonProperty("opening_date")
    private LocalDateTime openingDate;

    @NotBlank
    @JsonProperty("address_id")
    private Integer addressId;

    @JsonProperty("mobile")
    private String  mobile;

    @JsonProperty("email")
    private String  email;
}
