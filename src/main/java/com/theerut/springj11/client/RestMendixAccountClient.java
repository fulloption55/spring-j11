package com.theerut.springj11.client;

import com.theerut.springj11.annotation.LogTime;
import com.theerut.springj11.client.request.CreateAccountMedixRequest;
import com.theerut.springj11.client.request.TestoBaseRequest;
import com.theerut.springj11.client.request.TestoFixedAccountsGroupRequest;
import com.theerut.springj11.client.request.TestoInquiryFixedAccountsGroupListRequest;
import com.theerut.springj11.client.response.CreateAccountTestoResponse;
import com.theerut.springj11.client.response.TestoAccountDetailResponse;
import com.theerut.springj11.client.response.TestoAccountListResponse;
import com.theerut.springj11.client.response.TestoFixedAccountGroupListResponse;
import com.theerut.springj11.config.TestoConfiguration;
import com.theerut.springj11.utils.AccountUtil;
import com.theerut.springj11.utils.PayloadUtils;
import io.micrometer.core.annotation.Timed;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
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

import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Component
@RequiredArgsConstructor
public class RestTestoAccountClient extends RestBaseClient {

    private final RestTemplate productDetailRestTemplate;

    @Qualifier("openAccountRestTemplate")
    private final RestTemplate openAccountRestTemplate;

    private final TestoConfiguration TestoConfiguration;

    @Timed(value = "external_requests_seconds", extraTags = {"name", "call_Testo_account_detail"})
    @LogTime
    public ResponseEntity<TestoAccountDetailResponse> getAccountDetail(String accountId, TestoBaseRequest request, String transaction) {
        final String host = TestoConfiguration.getTestoHost();
        final String path = TestoConfiguration.getTestoEndpointAccountDetail();
        final UriComponents uriComponents = UriComponentsBuilder.fromHttpUrl(host).path(path).build();

        final Map<String, String> uriParams = new HashMap<>();
        uriParams.put("accountId", accountId);
        final String endpoint = uriComponents.expand(uriParams).toUriString();

        final String credential = PayloadUtils.encodeTestoCredential(TestoConfiguration.getUsername(), TestoConfiguration.getPassword());
        final HttpHeaders requestHeader = PayloadUtils.generateTestoHeader(credential, transaction, TestoConfiguration.getTellerId(), TestoConfiguration.getBranchId());
        final HttpEntity<?> httpEntity = new HttpEntity<>(request, requestHeader);
        ResponseEntity<TestoAccountDetailResponse> responseEntity = null;
//        final String endpointMask = AccountUtil.maskAccountIdOnUrl(endpoint, accountId);
        try {
            log.info("Start to get account detail from Testo");
            responseEntity = productDetailRestTemplate.exchange(
                    endpoint,
                    HttpMethod.POST,
                    httpEntity,
                    new ParameterizedTypeReference<TestoAccountDetailResponse>() {
                    });

        } catch (RestClientException rcEx) {
            this.handleConnectError(rcEx, endpoint);
        } finally {
            log.info("End to get account detail from Testo ");
        }
        return responseEntity;
    }

    @Timed(value = "external_requests_seconds", extraTags = {"name", "call_Testo_casa_accounts"})
    @LogTime
    public ResponseEntity<TestoAccountListResponse> getCasaAccounts(String customerId, String transaction) {
        final String host = TestoConfiguration.getTestoHost();
        final String path = TestoConfiguration.getTestoEndpointCasaAccountList();
        final UriComponents uriComponents = UriComponentsBuilder.fromHttpUrl(host).path(path).build();
        final Map<String, String> uriParams = Collections.singletonMap("customerId", customerId);
        final String endpoint = uriComponents.expand(uriParams).toUriString();

        final String credential = PayloadUtils.encodeTestoCredential(TestoConfiguration.getUsername(), TestoConfiguration.getPassword());
        final HttpHeaders requestHeader = PayloadUtils.generateTestoHeader(credential, transaction, TestoConfiguration.getTellerId(), TestoConfiguration.getBranchId());
        final TestoBaseRequest<Object> TestoRequest = new TestoBaseRequest<>();
        final HttpEntity<TestoBaseRequest<Object>> httpEntity = new HttpEntity<>(TestoRequest, requestHeader);

        ResponseEntity<TestoAccountListResponse> responseEntity = null;
        try {
            log.info("Start to get account list from Testo [{}]", endpoint);
            responseEntity = productDetailRestTemplate.exchange(
                    endpoint,
                    HttpMethod.POST,
                    httpEntity,
                    new ParameterizedTypeReference<TestoAccountListResponse>() {
                    });

        } catch (RestClientException rcEx) {
            handleConnectError(rcEx, endpoint);
        } finally {
            log.info("End to get account list from Testo [{}]", endpoint);
        }
        return responseEntity;
    }

    @Timed(value = "external_requests_seconds", extraTags = {"name", "call_Testo_fixed_account_groups"})
    @LogTime
    public ResponseEntity<TestoFixedAccountGroupListResponse> getFixedAccountGroups(String customerId, String transaction) {
        final String host = TestoConfiguration.getTestoHost();
        final String path = TestoConfiguration.getTestoEndpointFixedAccountList();
        final UriComponents uriComponents = UriComponentsBuilder.fromHttpUrl(host).path(path).build();
        final Map<String, String> uriParams = Collections.singletonMap("customerId", customerId);
        final String endpoint = uriComponents.expand(uriParams).toUriString();

        final String credential = PayloadUtils.encodeTestoCredential(TestoConfiguration.getUsername(), TestoConfiguration.getPassword());
        final HttpHeaders requestHeader = PayloadUtils.generateTestoHeader(credential, transaction, TestoConfiguration.getTellerId(), TestoConfiguration.getBranchId());
        final TestoInquiryFixedAccountsGroupListRequest TestoRequest = new TestoInquiryFixedAccountsGroupListRequest();
        TestoRequest.setRequest(new TestoFixedAccountsGroupRequest(customerId));
        final HttpEntity<TestoInquiryFixedAccountsGroupListRequest> httpEntity = new HttpEntity<>(TestoRequest, requestHeader);

        ResponseEntity<TestoFixedAccountGroupListResponse> responseEntity = null;
        try {
            log.info("Start to get account list from Testo [{}]", endpoint);
            responseEntity = productDetailRestTemplate.exchange(
                    endpoint,
                    HttpMethod.POST,
                    httpEntity,
                    new ParameterizedTypeReference<TestoFixedAccountGroupListResponse>() {
                    });

        } catch (RestClientException rcEx) {
            handleConnectError(rcEx, endpoint);
        } finally {
            log.info("End to get account list from Testo [{}]", endpoint);
        }
        return responseEntity;
    }

    @Timed(value = "external_requests_seconds", extraTags = {"name", "call_Testo_create_account"})
    @LogTime
    public ResponseEntity<CreateAccountTestoResponse> createAccount(CreateAccountMedixRequest request, String transaction) throws NoSuchAlgorithmException {

        final String host = TestoConfiguration.getTestoHost();
        final String path = TestoConfiguration.getTestoEndpointCreateAccount();
        final UriComponents uriComponents = UriComponentsBuilder.fromHttpUrl(host).path(path).build();
        final String endpoint = uriComponents.toUriString();

        final String credential = PayloadUtils.encodeTestoCredential(TestoConfiguration.getUsername(), TestoConfiguration.getPassword());
        final HttpHeaders requestHeader = PayloadUtils.generateTestoHeader(credential, transaction, TestoConfiguration.getCreateAccountTellerId(), TestoConfiguration.getBranchId());
        final HttpEntity<CreateAccountMedixRequest> httpEntity = new HttpEntity<>(request, requestHeader);

        ResponseEntity<CreateAccountTestoResponse> responseEntity = null;
        try {
            log.info("Start to create account from Testo [{}]", endpoint);
            responseEntity = openAccountRestTemplate.exchange(
                    endpoint,
                    HttpMethod.POST,
                    httpEntity,
                    new ParameterizedTypeReference<CreateAccountTestoResponse>() {
                    });

        } catch (RestClientException rcEx) {
            handleConnectError(rcEx, endpoint);
        } finally {
            log.info("End to create account from Testo [{}]", endpoint);
        }
        return responseEntity;
    }
}