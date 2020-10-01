package com.theerut.springj11.service.base;

import brave.Tracer;
import com.theerut.springj11.client.response.TestoBaseResponse;
import com.theerut.springj11.service.model.TestoResponseStatus;
import io.micrometer.core.instrument.MeterRegistry;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestoBaseService {
    private final Tracer tracer;
    private final MeterRegistry registry;

    public boolean isFailed(TestoResponseStatus response) {
        if (response.getHttpStatus().is2xxSuccessful()) {
            return !response.isSuccess();
        }
        return true;
    }

    public String generateTransactionId() {
        return tracer.currentSpan().context().traceIdString();
    }

    public TestoResponseStatus extractStatus(String className, String serviceName, ResponseEntity<?> responseEntity, String transaction) {
        final HttpStatus httpStatus = responseEntity.getStatusCode();
        final Object responseBody = responseEntity.getBody();
        final Logger log = LoggerFactory.getLogger(className);

        if (responseBody != null) {
            final TestoBaseResponse TestoResponse = (TestoBaseResponse) responseBody;
            log.info("Result from Testo: ServiceName [{}] TransactionID [{}], HTTPStatus [{}], TestoStatus [{}] and TestoDescription [{}]"
                    , serviceName
                    , transaction
                    , httpStatus
                    , TestoResponse.getResponseCode()
                    , TestoResponse.getResponseMessage());
            registry.counter("external_requests_result_count",
                    "name", "Testo",
                    "service_name", serviceName,
                    "http_status", httpStatus.name(),
                    "code", TestoResponse.getResponseCode(),
                    "description", TestoResponse.getResponseMessage()
            ).increment();
            return TestoResponseStatus.builder()
                    .httpStatus(httpStatus)
                    .code(TestoResponse.getResponseCode())
                    .description(TestoResponse.getResponseMessage())
                    .isSuccess(TestoResponse.getSuccess())
                    .build();
        }

        log.info("Result from Testo: ServiceName [{}] TransactionID [{}], HTTPStatus [{}] and got empty response body", serviceName, transaction, httpStatus);

        registry.counter("external_requests_result_count",
                "name", "Testo",
                "service_name", serviceName,
                "http_status", httpStatus.name(),
                "code", "null",
                "description", "null"
        ).increment();
        return TestoResponseStatus.builder()
                .httpStatus(httpStatus)
                .code(null)
                .description(null)
                .isSuccess(Boolean.FALSE)
                .build();

    }
}
