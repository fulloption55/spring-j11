package com.theerut.springj11.controller.request;

import com.theerut.springj11.controller.model.Pagination;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Builder
public class ApplicationTransactionRequest {
    @JsonProperty("user_id")
    private String userId;

    @NotNull
    @JsonProperty("start_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;

    @NotNull
    @JsonProperty("end_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate;

    @NotNull
    @Valid
    @JsonProperty("pagination")
    private Pagination pagination;

    @JsonProperty("action_id")
    private Integer actionId;
}
