package com.theerut.springj11.client;


import com.theerut.springj11.annotation.LogTime;
import com.theerut.springj11.config.ExamConfiguration;
import io.micrometer.core.annotation.Timed;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.cloud.sleuth.annotation.SpanTag;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@Slf4j
@Component
@RequiredArgsConstructor
public class ExamSoapClient {
    private final ExamConfiguration examConfiguration;

    @Timed(value = "external_requests_seconds", extraTags = {"name", "call_exam"})
    @LogTime
    @NewSpan(name = "callExam")
    @SuppressWarnings("unchecked")
    public <T> T send(@SpanTag(value = "request_class") final T request, final WebServiceTemplate webServiceTemplate) {
        log.info("Start to send {} to EXAM", request.getClass().getSimpleName());
        final String endpoint = examConfiguration.getHost();
        final T response = (T) webServiceTemplate
                .marshalSendAndReceive(
                        endpoint,
                        request,
                        new SoapActionCallback("")
                );
        log.info("End to send {} to EXAM", request.getClass().getSimpleName());
        return response;
    }

}
