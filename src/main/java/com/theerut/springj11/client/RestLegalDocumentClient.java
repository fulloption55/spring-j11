package com.theerut.springj11.client;

import com.theerut.springj11.annotation.LogTime;
import com.theerut.springj11.client.request.ActiveDocumentSearchRequest;
import com.theerut.springj11.client.request.AgreementVerificationRequest;
import com.theerut.springj11.client.response.AgreementVerificationResponse;
import com.theerut.springj11.client.response.DocumentListResponse;
import com.theerut.springj11.config.EndpointConfiguration;
import com.theerut.springj11.controller.response.GeneralResponse;
import com.theerut.springj11.utils.PayloadUtils;
import com.theerut.springj11.utils.EXAMPayload;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Slf4j
@Component
@RequiredArgsConstructor
public class RestLegalDocumentClient extends RestBaseClient {
    private final RestTemplate customerRestTemplate;
    private final EndpointConfiguration endpointConfiguration;
    private final EXAMPayload payload;

    @LogTime
    public ResponseEntity<GeneralResponse<DocumentListResponse>> searchDocument(EXAMPayload payload, final ActiveDocumentSearchRequest requestBody) {
        String host = endpointConfiguration.getLegalDocumentHost();
        String path = endpointConfiguration.getLegalDocumentEndpointDocument();

        UriComponents uriComponents = UriComponentsBuilder.fromHttpUrl(host).path(path).build();

        String endpoint = uriComponents.toUriString();
        HttpHeaders requestHeader = PayloadUtils.generateHeader(payload);
        requestHeader.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<ActiveDocumentSearchRequest> httpEntity = new HttpEntity<>(requestBody, requestHeader);
        ResponseEntity<GeneralResponse<DocumentListResponse>> responseEntity = null;

        try {

            log.info("Start to call to search the Legal Document with endpoint [{}]", endpoint);
            responseEntity = customerRestTemplate.exchange(
                    endpoint,
                    HttpMethod.POST,
                    httpEntity,
                    new ParameterizedTypeReference<GeneralResponse<DocumentListResponse>>() {
                    });

        } catch (RestClientException rcEx) {
            throw verifyConnectError(rcEx, endpoint);
        } finally {
            log.info("End to calling to search the Legal Document with endpoint [{}]", endpoint);
        }

        return responseEntity;
    }

    @LogTime
    public ResponseEntity<GeneralResponse<AgreementVerificationResponse>> verifyAgreement(final AgreementVerificationRequest requestBody) {
        final String host = endpointConfiguration.getLegalDocumentHost();
        final String path = endpointConfiguration.getLegalDocumentEndpointAgreementVerification();
        final UriComponents uriComponents = UriComponentsBuilder.fromHttpUrl(host).path(path).build();
        final String endpoint = uriComponents.toUriString();

        HttpHeaders requestHeader = PayloadUtils.generateHeader(payload);
        requestHeader.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<AgreementVerificationRequest> httpEntity = new HttpEntity<>(requestBody, requestHeader);
        ResponseEntity<GeneralResponse<AgreementVerificationResponse>> responseEntity = null;

        try {

            log.info("Start to call to verify agreement with endpoint [{}]", endpoint);
            responseEntity = customerRestTemplate.exchange(
                    endpoint,
                    HttpMethod.POST,
                    httpEntity,
                    new ParameterizedTypeReference<GeneralResponse<AgreementVerificationResponse>>() {
                    });

        } catch (RestClientException rcEx) {
            throw verifyConnectError(rcEx, endpoint);
        } finally {
            log.info("End to calling to verify agreement with endpoint [{}]", endpoint);
        }

        return responseEntity;
    }
}
