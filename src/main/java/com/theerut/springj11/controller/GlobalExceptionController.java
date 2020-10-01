package com.theerut.springj11.controller;

import com.theerut.springj11.constant.ResponseMapEnum;
import com.theerut.springj11.controller.response.GeneralResponse;
import com.theerut.springj11.factory.response.ResponseFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.HttpHostConnectException;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.RestClientException;
import org.springframework.ws.client.WebServiceIOException;

import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
@ControllerAdvice
@RequiredArgsConstructor
public class GlobalExceptionController {
    private final ResponseFactory responseFactory;
    private static final String CONTROLLER_PACKAGE_PATH = "com.theerut.springj11.controller";
    private static final String EXAM_DIGITAL_PACKAGE_PATH = "com.exam.digital";

    @ExceptionHandler({MethodArgumentNotValidException.class, HttpMessageNotReadableException.class})
    public ResponseEntity<GeneralResponse<Object>> handleInvalidRequestException(final Exception e) {
        this.writeOccurredClass(e);
        return responseFactory.error(
                HttpStatus.BAD_REQUEST,
                ResponseMapEnum.INVALID_PARAMETER.getText()
        );
    }

    @ExceptionHandler(WebServiceIOException.class)
    public ResponseEntity<GeneralResponse<Object>> handleSoapConnectionException(final Exception e) {
        this.writeOccurredClass(e);
        if (e.getCause() instanceof SocketTimeoutException) {
            log.debug("Error SOAP connection timeout");
            return responseFactory.error(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    ResponseMapEnum.ERROR_TIMEOUT.getText()
            );
        } else if (e.getCause() instanceof ConnectTimeoutException) {
            log.debug("Error SOAP read timeout");
            return responseFactory.error(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    ResponseMapEnum.ERROR_TIMEOUT.getText()
            );
        }

        return responseFactory.error(
                HttpStatus.INTERNAL_SERVER_ERROR,
                ResponseMapEnum.ERROR_CONNECTION.getText()
        );
    }

    @ExceptionHandler(RestClientException.class)
    public ResponseEntity<GeneralResponse<Object>> handleRestConnectionException(final Exception e) {
        this.writeOccurredClass(e);
        if (e.getCause() instanceof SocketTimeoutException) {
            log.debug("Error REST read timeout");
            return responseFactory.error(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    ResponseMapEnum.ERROR_TIMEOUT.getText()
            );
        } else if (e.getCause() instanceof ConnectTimeoutException) {
            log.debug("Error REST connection timeout");
            return responseFactory.error(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    ResponseMapEnum.ERROR_TIMEOUT.getText()
            );
        } else if (e.getCause() instanceof HttpHostConnectException) {
            log.debug("Error happens when you attempt to open a TCP connection to an IP address/port where there is nothing currently listening for connections");
            return responseFactory.error(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    ResponseMapEnum.ERROR_CONNECTION.getText()
            );
        }
        return responseFactory.error(
                HttpStatus.INTERNAL_SERVER_ERROR,
                ResponseMapEnum.ERROR_CONNECTION.getText()
        );
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<GeneralResponse<Object>> handleDefaultException(final Exception e) {
        this.writeOccurredClass(e);
        return responseFactory.error(
                HttpStatus.INTERNAL_SERVER_ERROR,
                ResponseMapEnum.GENERAL_ERROR.getText()
        );
    }

    private void writeOccurredClass(Exception e) {
        Logger logger = LoggerFactory.getLogger(this.getClass());
        List<String> errorCauseList = new ArrayList<>();
        for (final StackTraceElement ste : e.getStackTrace()) {
            if (ste.getClassName().contains(CONTROLLER_PACKAGE_PATH) && !ste.getClassName().contains("$$")) {
                logger = LoggerFactory.getLogger(ste.getClassName());
            }
            if (ste.getClassName().contains(EXAM_DIGITAL_PACKAGE_PATH) && !ste.getClassName().contains("$$") && !ste.getClassName().contains("aop.LogAspect")) {
                errorCauseList.add(String.format("%s(%d) - %s", ste.getClassName(), ste.getLineNumber(), ste.getMethodName()));
            }
        }
        logger.error("Error cause : {}", e.toString());
        logger.error("Error from classes : {}", Arrays.toString(errorCauseList.toArray()));
    }

}
