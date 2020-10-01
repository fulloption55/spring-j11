package com.theerut.springj11.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KycStatus {

    @JsonProperty("type")
    private String type;
    @JsonProperty("grade")
    private Integer grade;
    @JsonProperty("reason_code")
    private String reasonCode;
    @JsonProperty("review_date")
    private LocalDate reviewDate;

}
