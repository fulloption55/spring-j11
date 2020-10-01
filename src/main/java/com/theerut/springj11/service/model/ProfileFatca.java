package com.theerut.springj11.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ProfileFatca {
    @JsonProperty("us_person")
    private Boolean usPerson;

    @JsonProperty("non_us_person")
    private Boolean nonUsPerson;

    @JsonProperty("non_us_person_indicia")
    private Boolean nonUsPersonIndicia;

}

