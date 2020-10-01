package com.theerut.springj11.controller.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class AccountTransactionResponse {
    private String type;
    private String source;
    private String referenceId;
    private String referenceType;
    private LocalDate postedDate;
    private LocalDateTime effectiveDatetime;
    private String amount;
    private String currency;
    private String memo;
}
