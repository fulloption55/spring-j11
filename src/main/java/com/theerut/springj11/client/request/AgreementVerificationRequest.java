package com.theerut.springj11.client.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
public class AgreementVerificationRequest {

    @NotEmpty
    @JsonProperty("agreement_ids")
    private List<String> agreementIdList;
}
