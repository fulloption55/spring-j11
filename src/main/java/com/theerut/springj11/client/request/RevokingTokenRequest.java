package com.theerut.springj11.client.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RevokingTokenRequest {

    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("client_id")
    private String clientId;

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("user_type")
    private String userType;
}
