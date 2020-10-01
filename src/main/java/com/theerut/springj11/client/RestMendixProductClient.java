package com.theerut.springj11.client;

import com.theerut.springj11.annotation.LogTime;
import com.theerut.springj11.client.request.TestoBaseRequest;
import com.theerut.springj11.client.response.TestoProductDetailResponse;
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

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Component
@RequiredArgsConstructor
public class RestTestoProductClient extends RestBaseClient {
    private final RestTemplate productDetailRestTemplate;
    private final TestoConfiguration TestoConfiguration;

    @Timed(value = "external_requests_seconds", extraTags = {"name", "call_Testo_product_detail"})
    @LogTime
    public ResponseEntity<TestoProductDetailResponse> getProductDetail(String productId, TestoBaseRequest request, String transaction) {
        final String host = TestoConfiguration.getTestoHost();
        final String path = TestoConfiguration.getTestoEndpointProductDetail();
        final UriComponents uriComponents = UriComponentsBuilder.fromHttpUrl(host).path(path).build();

        final Map<String, String> uriParams = new HashMap<>();
        uriParams.put("productId", productId);
        final String endpoint = uriComponents.expand(uriParams).toUriString();

        final String credential = PayloadUtils.encodeTestoCredential(TestoConfiguration.getUsername(), TestoConfiguration.getPassword());
        final HttpHeaders requestHeader = PayloadUtils.generateTestoHeader(credential, transaction, TestoConfiguration.getTellerId(), TestoConfiguration.getBranchId());
        final HttpEntity<?> httpEntity = new HttpEntity<>(request, requestHeader);

        ResponseEntity<TestoProductDetailResponse> responseEntity = null;
        try {
            log.info("Start to get product detail from Testo [{}]", endpoint);
            responseEntity = productDetailRestTemplate.exchange(
                    endpoint,
                    HttpMethod.POST,
                    httpEntity,
                    new ParameterizedTypeReference<TestoProductDetailResponse>() {
                    });

        } catch (RestClientException rcEx) {
            this.handleConnectError(rcEx, endpoint);
        } finally {
            log.info("End to get product detail from Testo [{}]", endpoint);
        }
        return responseEntity;
    }

}