package com.theerut.springj11.client;

import com.theerut.springj11.annotation.LogTime;
import com.theerut.springj11.client.request.TestoAccountCasaTransactionRequest;
import com.theerut.springj11.client.request.TestoBaseRequest;
import com.theerut.springj11.client.response.TestoAccountCasaTransactionResponse;
import com.theerut.springj11.config.TestoConfiguration;
import com.theerut.springj11.utils.AccountUtil;
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
public class RestTestoAccountCasaTransactionClient extends RestBaseClient {
    private final RestTemplate productDetailRestTemplate;
    private final TestoConfiguration TestoConfiguration;

    @Timed(value = "external_requests_seconds", extraTags = {"name", "call_Testo_casa_transaction"})
    @LogTime
    public ResponseEntity<TestoAccountCasaTransactionResponse> getAccountCasaTransaction(String accountId, Integer limit, TestoBaseRequest<TestoAccountCasaTransactionRequest> request, String transaction) {
        final String host = TestoConfiguration.getTestoHost();
        final String path = TestoConfiguration.getTestoEndpointCasaAccountTransaction();
        final UriComponents uriComponents = UriComponentsBuilder.fromHttpUrl(host)
                .path(path)
                .queryParam("limit", limit)
                .build();

        final Map<String, String> pathVariables = new HashMap<>();
        pathVariables.put("accountId", accountId);
        final String endpoint = uriComponents.expand(pathVariables).toUriString();

        final String credential = PayloadUtils.encodeTestoCredential(TestoConfiguration.getUsername(), TestoConfiguration.getPassword());
        final HttpHeaders requestHeader = PayloadUtils.generateTestoHeader(credential, transaction, TestoConfiguration.getTellerId(), TestoConfiguration.getBranchId());
        final HttpEntity<TestoBaseRequest<TestoAccountCasaTransactionRequest>> httpEntity = new HttpEntity<>(request, requestHeader);
//        final String endpointMask = AccountUtil.maskAccountIdOnUrl(endpoint, accountId);
        try {
//            log.info("Start to get account casa transaction from Testo [{}]", endpointMask);
            return productDetailRestTemplate.exchange(
                    endpoint,
                    HttpMethod.POST,
                    httpEntity,
                    new ParameterizedTypeReference<TestoAccountCasaTransactionResponse>() {
                    });
        } catch (RestClientException rcEx) {
            this.handleConnectError(rcEx, endpoint);
        } finally {
            log.info("End to get account casa transaction from Testo");
        }
        return null;
    }
}