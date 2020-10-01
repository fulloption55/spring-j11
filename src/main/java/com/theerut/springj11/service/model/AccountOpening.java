package com.theerut.springj11.service.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
public class AccountOpening extends Account {
    private String referenceId;
    private LocalDateTime createdDatetime;
    private String userId;
}
