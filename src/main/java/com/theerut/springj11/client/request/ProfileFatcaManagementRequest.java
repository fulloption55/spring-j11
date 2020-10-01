package com.theerut.springj11.client.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@AllArgsConstructor
public class ProfileFatcaManagementRequest {

    @NotEmpty
    @JsonProperty("is_non_us_indicia")
    private Boolean nonUsIndicia;

    @NotEmpty
    @JsonProperty("is_us_person")
    private Boolean usPerson;

    @JsonProperty("user_id")
    private String userId;

}
