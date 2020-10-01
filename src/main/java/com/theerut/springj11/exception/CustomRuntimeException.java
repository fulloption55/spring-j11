package com.theerut.springj11.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

public class CustomRuntimeException extends RuntimeException {

    @Getter
    private final HttpStatus httpStatus;

    @Getter
    private final String errorCode;

    public CustomRuntimeException(HttpStatus httpStatus, String errorCode) {
        super(errorCode);
        this.httpStatus = httpStatus;
        this.errorCode = errorCode;
    }

    @Override
    public String toString() {
        return httpStatus.toString() + ": " + errorCode;
    }
}
