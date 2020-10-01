package com.theerut.springj11.client;

import com.theerut.springj11.annotation.LogTime;
import com.theerut.springj11.client.request.RevokingTokenRequest;
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
public class RestGatewayManagementClient extends RestBaseClient {
    private final RestTemplate gatewayRestTemplate;
    private final EndpointConfiguration endpointConfiguration;

    @LogTime
    public ResponseEntity<GeneralResponse> revokeToken(EXAMPayload payload, RevokingTokenRequest request) {
        String host = endpointConfiguration.getGatewayManagementHost();
        String path = endpointConfiguration.getGatewayEndpointPasscodeValidation();

        UriComponents uriComponents = UriComponentsBuilder.fromHttpUrl(host).path(path).build();

        String endpoint = uriComponents.toUriString();
        HttpHeaders requestHeader = PayloadUtils.generateHeader(payload);
        requestHeader.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<RevokingTokenRequest> httpEntity = new HttpEntity<>(request, requestHeader);
        ResponseEntity<GeneralResponse> responseEntity = null;
        try {

            log.info("Start to revoke token with endpoint [{}]", endpoint);
            responseEntity = gatewayRestTemplate.exchange(
                    endpoint,
                    HttpMethod.DELETE,
                    httpEntity,
                    new ParameterizedTypeReference<GeneralResponse>() {
                    });

        } catch (RestClientException rcEx) {
            this.handleConnectError(rcEx, endpoint);
        } finally {
            log.info("End to revoke token with endpoint [{}]", endpoint);
        }

        return responseEntity;
    }
}
