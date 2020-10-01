package com.theerut.springj11.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class AgreementDocumentResponse {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("device_id")
    private String deviceId;

    @JsonProperty("device_agent")
    private String deviceAgent;

    @JsonProperty("application_version")
    private String applicationVersion;

    @JsonProperty("created_timestamp")
    private Timestamp createdTimestamp;

    @JsonProperty("reference_id")
    private String referenceId;

    @JsonProperty("remark")
    private String remark;

    @JsonProperty("identity")
    private String identity;

    @JsonProperty("identity_type")
    private String identityType;

    @JsonProperty("client_id")
    private String clientId;

    @JsonProperty("is_accepted")
    private Integer isAccepted;

    @JsonProperty("document")
    private DocumentResponse document;
}
