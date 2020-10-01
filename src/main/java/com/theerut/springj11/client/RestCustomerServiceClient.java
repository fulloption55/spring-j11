package com.theerut.springj11.client;

import com.theerut.springj11.annotation.LogTime;
import com.theerut.springj11.client.request.CustomerSearchRequest;
import com.theerut.springj11.client.request.FatcaProfileRequest;
import com.theerut.springj11.client.request.PasscodeAuthenticationRequest;
import com.theerut.springj11.client.request.ProfileFatcaManagementRequest;
import com.theerut.springj11.client.request.ProfileFatcaRequest;
import com.theerut.springj11.client.request.WatchlistStatusRequest;
import com.theerut.springj11.config.EndpointConfiguration;
import com.theerut.springj11.controller.response.GeneralResponse;
import com.theerut.springj11.service.model.PasscodeAuthentication;
import com.theerut.springj11.service.model.Profile;
import com.theerut.springj11.service.model.ProfileFatca;
import com.theerut.springj11.service.model.ProfileFatcaAnswer;
import com.theerut.springj11.service.model.WatchlistStatus;
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
public class RestCustomerServiceClient extends RestBaseClient {
    private final RestTemplate customerRestTemplate;
    private final EndpointConfiguration endpointConfiguration;

    @LogTime
    public ResponseEntity<GeneralResponse<Profile>> getProfile(EXAMPayload payload) {
        String host = endpointConfiguration.getCustomerHost();
        String path = endpointConfiguration.getCustomerEndpointProfile();

        UriComponents uriComponents = UriComponentsBuilder.fromHttpUrl(host).path(path).build();

        String endpoint = uriComponents.toUriString();
        HttpHeaders requestHeader = PayloadUtils.generateHeader(payload);
        requestHeader.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> httpEntity = new HttpEntity<>(requestHeader);

        ResponseEntity<GeneralResponse<Profile>> responseEntity = null;
        try {

            log.info("Start to call getting profile with endpoint [{}]", endpoint);
            responseEntity = customerRestTemplate.exchange(
                    endpoint,
                    HttpMethod.GET,
                    httpEntity,
                    new ParameterizedTypeReference<GeneralResponse<Profile>>() {
                    });

        } catch (RestClientException rcEx) {
            this.handleConnectError(rcEx, endpoint);
        } finally {
            log.info("End to call getting profile with endpoint [{}]", endpoint);
        }

        return responseEntity;
    }

    @LogTime
    public ResponseEntity<GeneralResponse<ProfileFatca>> getProfileFatca(EXAMPayload payload) {
        String host = endpointConfiguration.getCustomerHost();
        String path = endpointConfiguration.getProfileFatcaEndpointProfile();

        UriComponents uriComponents = UriComponentsBuilder.fromHttpUrl(host).path(path).build();

        String endpoint = uriComponents.toUriString();
        HttpHeaders requestHeader = PayloadUtils.generateHeader(payload);
        requestHeader.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> httpEntity = new HttpEntity<>(requestHeader);

        ResponseEntity<GeneralResponse<ProfileFatca>> responseEntity = null;

        try {

            log.info("Start to call check FATCA status with endpoint [{}]", endpoint);
            responseEntity = customerRestTemplate.exchange(
                    endpoint,
                    HttpMethod.GET,
                    httpEntity,
                    new ParameterizedTypeReference<GeneralResponse<ProfileFatca>>() {
                    });

        } catch (RestClientException rcEx) {
            this.handleConnectError(rcEx, endpoint);
        } finally {
            log.info("End to call check FATCA status with endpoint [{}]", endpoint);
        }

        return responseEntity;
    }

    @LogTime
    public ResponseEntity<GeneralResponse<ProfileFatca>> getProfileFatca(EXAMPayload payload, FatcaProfileRequest fatcaProfileRequest) {
        String host = endpointConfiguration.getCustomerHost();
        String path = endpointConfiguration.getSearchProfileFatcaEndpointManagement();

        UriComponents uriComponents = UriComponentsBuilder.fromHttpUrl(host).path(path).build();

        String endpoint = uriComponents.toUriString();
        HttpHeaders requestHeader = PayloadUtils.generateHeader(payload);
        requestHeader.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<FatcaProfileRequest> httpEntity = new HttpEntity<>(fatcaProfileRequest, requestHeader);

        ResponseEntity<GeneralResponse<ProfileFatca>> responseEntity = null;

        try {

            log.info("Start to call check FATCA status with endpoint [{}]", endpoint);
            responseEntity = customerRestTemplate.exchange(
                    endpoint,
                    HttpMethod.POST,
                    httpEntity,
                    new ParameterizedTypeReference<GeneralResponse<ProfileFatca>>() {
                    });

        } catch (RestClientException rcEx) {
            this.handleConnectError(rcEx, endpoint);
        } finally {
            log.info("End to call check FATCA status with endpoint [{}]", endpoint);
        }

        return responseEntity;
    }

    @LogTime
    public ResponseEntity<GeneralResponse<ProfileFatcaAnswer>> addProfileFatca(final EXAMPayload payload, final ProfileFatcaRequest requestBody) {
        String host = endpointConfiguration.getCustomerHost();
        String path = endpointConfiguration.getProfileFatcaEndpointProfile();

        UriComponents uriComponents = UriComponentsBuilder.fromHttpUrl(host).path(path).build();

        String endpoint = uriComponents.toUriString();
        HttpHeaders requestHeader = PayloadUtils.generateHeader(payload);
        requestHeader.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<ProfileFatcaRequest> httpEntity = new HttpEntity<>(requestBody, requestHeader);
        return addFatcaStatus(endpoint, httpEntity);
    }

    @LogTime
    public ResponseEntity<GeneralResponse<ProfileFatcaAnswer>> addProfileFatcaManagement(final EXAMPayload payload, final ProfileFatcaManagementRequest requestBody) {
        String host = endpointConfiguration.getCustomerHost();
        String path = endpointConfiguration.getProfileFatcaEndpointProfileManagement();

        UriComponents uriComponents = UriComponentsBuilder.fromHttpUrl(host).path(path).build();

        String endpoint = uriComponents.toUriString();
        HttpHeaders requestHeader = PayloadUtils.generateHeader(payload);
        requestHeader.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<ProfileFatcaManagementRequest> httpEntity = new HttpEntity<>(requestBody, requestHeader);
        return addFatcaStatus(endpoint, httpEntity);
    }

    private <T> ResponseEntity<GeneralResponse<ProfileFatcaAnswer>> addFatcaStatus(String endpoint, HttpEntity<T> httpEntity) {
        ResponseEntity<GeneralResponse<ProfileFatcaAnswer>> responseEntity = null;
        try {
            log.info("Start to call add FATCA status with endpoint [{}]", endpoint);
            responseEntity = customerRestTemplate.exchange(
                    endpoint,
                    HttpMethod.POST,
                    httpEntity,
                    new ParameterizedTypeReference<GeneralResponse<ProfileFatcaAnswer>>() {
                    });

        } catch (RestClientException rcEx) {
            this.handleConnectError(rcEx, endpoint);
        } finally {
            log.info("End to calling add FATCA status with endpoint [{}]", endpoint);
        }
        return responseEntity;
    }

    @LogTime
    public ResponseEntity<GeneralResponse<WatchlistStatus>> getWatchlistStatus(EXAMPayload payload) {
        String host = endpointConfiguration.getCustomerHost();
        String path = endpointConfiguration.getCustomerEndpointProfileWatchList();

        UriComponents uriComponents = UriComponentsBuilder.fromHttpUrl(host).path(path).build();

        String endpoint = uriComponents.toUriString();
        HttpHeaders requestHeader = PayloadUtils.generateHeader(payload);
        requestHeader.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> httpEntity = new HttpEntity<>(requestHeader);

        ResponseEntity<GeneralResponse<WatchlistStatus>> responseEntity = null;
        try {

            log.info("Start to call getting profile WatchlistABC with endpoint [{}]", endpoint);
            responseEntity = customerRestTemplate.exchange(
                    endpoint,
                    HttpMethod.GET,
                    httpEntity,
                    new ParameterizedTypeReference<GeneralResponse<WatchlistStatus>>() {
                    });

        } catch (RestClientException rcEx) {
            this.handleConnectError(rcEx, endpoint);
        } finally {
            log.info("End to getting profile WatchlistABC with endpoint [{}]", endpoint);
        }

        return responseEntity;
    }

    @LogTime
    public ResponseEntity<GeneralResponse<PasscodeAuthentication>> validatePasscode(EXAMPayload payload, PasscodeAuthenticationRequest request) {
        String host = endpointConfiguration.getCustomerHost();
        String path = endpointConfiguration.getCustomerEndpointPasscodeValidation();

        UriComponents uriComponents = UriComponentsBuilder.fromHttpUrl(host).path(path).build();

        String endpoint = uriComponents.toUriString();
        HttpHeaders requestHeader = PayloadUtils.generateHeader(payload);
        requestHeader.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<PasscodeAuthenticationRequest> httpEntity = new HttpEntity<>(request, requestHeader);

        ResponseEntity<GeneralResponse<PasscodeAuthentication>> responseEntity = null;
        try {

            log.info("Start to call passcode validation with endpoint [{}]", endpoint);
            responseEntity = customerRestTemplate.exchange(
                    endpoint,
                    HttpMethod.POST,
                    httpEntity,
                    new ParameterizedTypeReference<GeneralResponse<PasscodeAuthentication>>() {
                    });

        } catch (RestClientException rcEx) {
            this.handleConnectError(rcEx, endpoint);
        } finally {
            log.info("End to call passcode validation with endpoint [{}]", endpoint);
        }

        return responseEntity;
    }

    public ResponseEntity<GeneralResponse<Profile>> getProfile(EXAMPayload payload, CustomerSearchRequest requestBody) {
        String host = endpointConfiguration.getCustomerHost();
        String path = endpointConfiguration.getCustomerEndpointProfileManagement();

        UriComponents uriComponents = UriComponentsBuilder.fromHttpUrl(host).path(path).build();

        String endpoint = uriComponents.toUriString();
        HttpHeaders requestHeader = PayloadUtils.generateHeader(payload);
        requestHeader.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<CustomerSearchRequest> httpEntity = new HttpEntity<>(requestBody, requestHeader);
        ResponseEntity<GeneralResponse<Profile>> responseEntity = null;

        try {

            log.info("Start to call search profile with endpoint [{}]", endpoint);
            responseEntity = customerRestTemplate.exchange(
                    endpoint,
                    HttpMethod.POST,
                    httpEntity,
                    new ParameterizedTypeReference<GeneralResponse<Profile>>() {
                    });

        } catch (RestClientException rcEx) {
            this.handleConnectError(rcEx, endpoint);
        } finally {
            log.info("End to calling search profile with endpoint [{}]", endpoint);
        }

        return responseEntity;
    }

    public ResponseEntity<GeneralResponse<WatchlistStatus>> getWatchlistStatus(EXAMPayload payload, WatchlistStatusRequest watchlistStatusRequest) {
        String host = endpointConfiguration.getCustomerHost();
        String path = endpointConfiguration.getCustomerEndpointProfileWatchListManagement();

        UriComponents uriComponents = UriComponentsBuilder.fromHttpUrl(host).path(path).build();

        String endpoint = uriComponents.toUriString();
        HttpHeaders requestHeader = PayloadUtils.generateHeader(payload);
        requestHeader.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<WatchlistStatusRequest> httpEntity = new HttpEntity<>(watchlistStatusRequest, requestHeader);

        ResponseEntity<GeneralResponse<WatchlistStatus>> responseEntity = null;
        try {

            log.info("Start to call getting profile WatchlistABC with endpoint [{}]", endpoint);
            responseEntity = customerRestTemplate.exchange(
                    endpoint,
                    HttpMethod.POST,
                    httpEntity,
                    new ParameterizedTypeReference<GeneralResponse<WatchlistStatus>>() {
                    });

        } catch (RestClientException rcEx) {
            this.handleConnectError(rcEx, endpoint);
        } finally {
            log.info("End to getting profile WatchlistABC with endpoint [{}]", endpoint);
        }

        return responseEntity;
    }
}
