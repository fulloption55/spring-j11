package com.theerut.springj11.client.response;

import com.theerut.springj11.service.model.TestoProductDetail;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class TestoProductDetailResponse extends TestoBaseResponse {
    @JsonProperty("Product")
    private TestoProductDetail product;
}
