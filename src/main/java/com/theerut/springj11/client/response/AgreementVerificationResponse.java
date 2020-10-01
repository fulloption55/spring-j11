package com.theerut.springj11.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class AgreementVerificationResponse {

    @JsonProperty("agreements")
    List<AgreementDocumentResponse> agreementList;
}
