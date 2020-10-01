package com.theerut.springj11.service.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@Builder
public class TestoResponseStatus {
    private String code;
    private String description;
    private HttpStatus httpStatus;
    private boolean isSuccess;


}
