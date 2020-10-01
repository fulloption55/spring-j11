package com.theerut.springj11.service.base;

import brave.Tracer;
import com.theerut.springj11.controller.response.GeneralResponse;
import io.micrometer.core.instrument.MeterRegistry;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import static com.theerut.springj11.constant.ResponseMapEnum.SUCCESS;

@Service
@RequiredArgsConstructor
public class LocalBaseService {
    private final Tracer tracer;
    private final MeterRegistry registry;

    public boolean isFailed(String className, String serviceName, ResponseEntity<?> responseEntity) {
        this.logStatus(className, serviceName, responseEntity);
        if (HttpStatus.OK.equals(responseEntity.getStatusCode())) {
            final GeneralResponse<?> generalResponse = (GeneralResponse) responseEntity.getBody();
            return !SUCCESS.getText().equals(generalResponse == null ? null : generalResponse.getCode());
        }
        return true;
    }

    private void logStatus(String className, String serviceName, ResponseEntity<?> responseEntity) {
        final HttpStatus httpStatus = responseEntity.getStatusCode();
        final Object responseBody = responseEntity.getBody();
        final Logger log = LoggerFactory.getLogger(className);
        final String transaction = tracer.currentSpan().toString();

        if (responseBody == null) {
            log.info("Result from Digital EXAM: ServiceName [{}] TransactionID [{}], HTTPStatus [{}] and got empty response body", serviceName, transaction, httpStatus);
            registry.counter("external_requests_result_count",
                    "name", "exam_digital",
                    "service_name", serviceName,
                    "http_status", httpStatus.name(),
                    "code", "null",
                    "description", "null"
            ).increment();
            return;
        }

        final GeneralResponse<?> generalResponse = (GeneralResponse) responseBody;
        log.info("Result from Digital EXAM : ServiceName [{}] TransactionID [{}], HTTPStatus [{}], EXAM Status [{}]"
                , serviceName
                , transaction
                , httpStatus
                , generalResponse.getCode());

        registry.counter("external_requests_result_count",
                "name", "exam_digital",
                "service_name", serviceName,
                "http_status", httpStatus.name(),
                "code", generalResponse.getCode(),
                "description", "null"
        ).increment();
    }
}
