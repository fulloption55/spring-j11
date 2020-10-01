package com.theerut.springj11.controller.request;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
public class ProfileFatcaAnswerManagementRequest {

    @NotEmpty
    @Size(min=9, max=9)
    @JsonProperty("answers")
    private List<Boolean> answers;

    @JsonProperty("user_id")
    private String userId;
}
