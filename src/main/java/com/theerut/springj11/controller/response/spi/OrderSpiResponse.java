package com.theerut.springj11.controller.response.spi;

import com.theerut.springj11.controller.request.spi.Initiator;
import com.theerut.springj11.controller.request.spi.Payee;
import com.theerut.springj11.controller.request.spi.Payer;
import com.theerut.springj11.controller.request.spi.Product;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderSpiResponse {
    @JsonProperty("external_reference_id")
    private String externalReferenceId;

    @JsonProperty("order_id")
    private String orderId;

    @JsonProperty("service_id")
    private String serviceId;

    @JsonProperty("method_type")
    private String methodType;

    @JsonProperty("initiator")
    private Initiator initiator;

    @JsonProperty("sof_fee")
    private BigDecimal sourceOfFundFee;

    @JsonProperty("biz_fee")
    private BigDecimal businessFee;

    @JsonProperty("amount")
    private BigDecimal amount;

    @JsonProperty("currency_code")
    private String currency;

    @JsonProperty("payer_info")
    private Payer payer;

    @JsonProperty("payee_info")
    private Payee payee;

    @JsonProperty("product_detail")
    private Product product;

    @JsonProperty("note")
    private String note;

    @JsonProperty("order_status")
    private String orderStatus;

    @JsonProperty("error_code")
    private String errorCode;

    @JsonProperty("error_description")
    private String errorDescription;
}
