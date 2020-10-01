package com.theerut.springj11.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.client.RestClientException;

import java.net.SocketTimeoutException;

@Slf4j
class RestBaseClient {

    void handleConnectError(RestClientException rcEx, String endpoint) {
        throw verifyConnectError(rcEx, endpoint);
    }

    IllegalStateException verifyConnectError(RestClientException rcEx, String endpoint) {
        if (rcEx.getRootCause() instanceof SocketTimeoutException) {
            log.error("Sending request was failed due to SocketTimeoutException from [{}] : {}", endpoint, rcEx.toString());
            return new IllegalStateException("Error Timeout");
        }
        log.error("Sending request was failed due to Connection from [{}] : {}", endpoint, rcEx.toString());
        return new IllegalStateException("Error Connection");
    }
}
