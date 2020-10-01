package com.theerut.springj11.client.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
public class ActiveDocumentSearchRequest {
    @NotEmpty
    @JsonProperty("document_type")
    private String documentType;

    @NotEmpty
    @JsonProperty("product_reference")
    private List<String> productReference;

    @NotEmpty
    @JsonProperty("business_type")
    private String businessType;

    @NotEmpty
    @JsonProperty("product_group_name")
    private String productGroupName;
}
