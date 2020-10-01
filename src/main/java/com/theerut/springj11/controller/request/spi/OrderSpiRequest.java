package com.theerut.springj11.controller.request.spi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderSpiRequest {
    @JsonProperty("external_reference_id")
    private String externalReferenceId;

    @JsonProperty("order_id")
    private String orderId;

    @JsonProperty("method_type")
    private String methodType;

    @JsonProperty("service_id")
    private String serviceId;

    @JsonProperty("initiator")
    private Initiator initiator;

    @JsonProperty("sof_fee")
    private BigDecimal sourceOfFundFee = BigDecimal.ZERO;

    @JsonProperty("biz_fee")
    private BigDecimal businessFee = BigDecimal.ZERO;

    @NotNull
    @JsonProperty("amount")
    private BigDecimal amount;

    @NotBlank
    @JsonProperty("currency_code")
    private String currencyCode;

    @JsonProperty("payer_info")
    private Payer payer;

    @JsonProperty("payee_info")
    private Payee payee;

    @JsonProperty("product_detail")
    private Product product;

    @JsonProperty("note")
    private String note;

}
