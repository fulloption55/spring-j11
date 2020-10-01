package com.theerut.springj11.client;

import com.theerut.springj11.annotation.LogTime;
import com.theerut.springj11.client.request.TestoGetAddressRequest;
import com.theerut.springj11.client.response.TestoGetAddressResponse;
import com.theerut.springj11.config.TestoConfiguration;
import com.theerut.springj11.utils.PayloadUtils;
import io.micrometer.core.annotation.Timed;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Collections;
import java.util.Map;

@Slf4j
@Component
@RequiredArgsConstructor
public class RestTestoAddressClient extends RestBaseClient {
    private final RestTemplate productDetailRestTemplate;
    private final TestoConfiguration TestoConfiguration;

    @Timed(value = "external_requests_seconds", extraTags = {"name", "call_Testo_create_account"})
    @LogTime
    public ResponseEntity<TestoGetAddressResponse> getAddress(String cif, String tellerId, String transaction) {
        final String host = TestoConfiguration.getTestoHost();
        final String path = TestoConfiguration.getTestoEndpointGetAddress();
        final UriComponents uriComponents = UriComponentsBuilder.fromHttpUrl(host).path(path).build();
        final Map<String, String> uriParams = Collections.singletonMap("cif",cif);
        final String endpoint = uriComponents.expand(uriParams).toUriString();

        TestoGetAddressRequest request = new TestoGetAddressRequest();
        request.setTellerID(tellerId);
        final String credential = PayloadUtils.encodeTestoCredential(TestoConfiguration.getUsername(), TestoConfiguration.getPassword());
        final HttpHeaders requestHeader = PayloadUtils.generateTestoHeader(credential, transaction, TestoConfiguration.getTellerId(), TestoConfiguration.getBranchId());
        final HttpEntity<TestoGetAddressRequest> httpEntity = new HttpEntity<>(request, requestHeader);

        ResponseEntity<TestoGetAddressResponse> responseEntity = null;
        try {
            log.info("Start to get Address from Testo [{}]", endpoint);
            responseEntity = productDetailRestTemplate.exchange(
                    endpoint,
                    HttpMethod.POST,
                    httpEntity,
                    new ParameterizedTypeReference<TestoGetAddressResponse>() {
                    });

        } catch (RestClientException rcEx) {
            handleConnectError(rcEx, endpoint);
        } finally {
            log.info("End to get Address from Testo [{}]", endpoint);
        }
        return responseEntity;
    }
}