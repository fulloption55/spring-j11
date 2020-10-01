package com.theerut.springj11.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

public class PaymentProcessorException extends Exception {

    @Getter
    private HttpStatus httpStatus;

    @Getter
    private String errorCode;

    public PaymentProcessorException(HttpStatus httpStatus, String errorCode) {
        super(errorCode);
        this.httpStatus = httpStatus;
        this.errorCode = errorCode;
    }
}
