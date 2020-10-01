package com.theerut.springj11.service.base;

import brave.Tracer;
import com.theerut.springj11.client.webservice.ExamResponseInterface;
import com.theerut.springj11.client.webservice.common.EXAMAdditionalStatusType;
import com.theerut.springj11.client.webservice.common.EXAMStatusType;
import com.theerut.springj11.service.model.ExamStatus;
import io.micrometer.core.instrument.MeterRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.theerut.springj11.constant.ExamStatusEnum.SUCCESS;

@Service
public class ExamBaseService {
    protected final Tracer tracer;
    protected final MeterRegistry registry;
    private static final String PREFIX_DG = "DG";

    public ExamBaseService(Tracer tracer, MeterRegistry registry) {
        this.tracer = tracer;
        this.registry = registry;
    }

    public String generateRequestId() {
        final String correlationId = tracer.currentSpan().context().traceIdString();
        return PREFIX_DG.concat(correlationId);
    }

    public boolean isFailedExamStatus(ExamResponseInterface examResponse) {
        return !SUCCESS.getCode().equals(examResponse.getExamStatus().getStatusCode());
    }

    public ExamStatus extractStatus(String requestId, String serviceName, EXAMStatusType status, Class<?> clazz) {
        final List<Long> statusCodes = new ArrayList<>();
        final List<String> statusDescriptions = new ArrayList<>();
        final List<String> severities = new ArrayList<>();
        final Logger log = LoggerFactory.getLogger(clazz);

        if (status.getEXAMAdditionalStatus().isEmpty()) {
            statusCodes.add(status.getStatusCode());
            statusDescriptions.add(status.getStatusDesc());
            severities.add(status.getSeverity());
        } else {
            for (EXAMAdditionalStatusType errorDetail : status.getEXAMAdditionalStatus()) {
                statusCodes.add(errorDetail.getStatusCode());
                statusDescriptions.add(errorDetail.getStatusDesc());
                severities.add(errorDetail.getSeverity());
            }
        }

        log.info("Result from EXAM: ServiceName [{}] RequestID [{}], Code {}, Description {}, Severity {}"
                , serviceName
                , requestId
                , statusCodes.toString()
                , statusDescriptions.toString()
                , severities.toString());

        registry.counter("external_requests_result_count",
                "name", "exam",
                "service_name", serviceName,
                "code", statusCodes.toString(),
                "description", statusDescriptions.toString(),
                "http_status", "null"
        ).increment();

        return ExamStatus.builder()
                .requestId(requestId)
                .statusCodes(statusCodes)
                .statusDescriptions(statusDescriptions)
                .severities(severities)
                .build();
    }

}
