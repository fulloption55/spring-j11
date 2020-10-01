package com.theerut.springj11.client;

import com.theerut.springj11.annotation.LogTime;
import com.theerut.springj11.client.request.NotificationRequest;
import com.theerut.springj11.config.EndpointConfiguration;
import com.theerut.springj11.controller.response.GeneralResponse;
import com.theerut.springj11.utils.EXAMPayload;
import com.theerut.springj11.utils.PayloadUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Map;

@Slf4j
@Component
@RequiredArgsConstructor
public class RestNotificationServiceClient extends RestBaseClient {
    private final RestTemplate notificationRestTemplate;
    private final EndpointConfiguration endpointConfiguration;
    private static final String NOTIFICATION_SMS_CHANNEL = "SMS";

    @LogTime
    public ResponseEntity<GeneralResponse> sendEmailNotification(EXAMPayload payload, MultiValueMap<String, Object> request) {
        String host = endpointConfiguration.getNotificationHost();
        String path = endpointConfiguration.getNotificationEndpointEmail();

        UriComponents uriComponents = UriComponentsBuilder.fromHttpUrl(host).path(path).build();

        String endpoint = uriComponents.toUriString();
        HttpHeaders requestHeader = PayloadUtils.generateHeader(payload);
        requestHeader.setContentType(MediaType.MULTIPART_FORM_DATA);

        HttpEntity<MultiValueMap<String, Object>> httpEntity = new HttpEntity<>(request, requestHeader);
        ResponseEntity<GeneralResponse> responseEntity = null;
        try {

            log.info("Start to send e-mail with endpoint [{}]", endpoint);
            responseEntity = notificationRestTemplate.exchange(
                    endpoint,
                    HttpMethod.POST,
                    httpEntity,
                    new ParameterizedTypeReference<GeneralResponse>() {
                    });

        } catch (RestClientException rcEx) {
            this.handleConnectError(rcEx, endpoint);
        } finally {
            log.info("End to send e-mail with endpoint [{}]", endpoint);
        }

        return responseEntity;
    }

    public ResponseEntity<GeneralResponse> sendSms(String mobileNumber, Integer templateId, Map<String, String> replacementContent, EXAMPayload payload) {

        HttpHeaders requestHeaders = payload.generateHeader();
        requestHeaders.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<NotificationRequest> httpEntity = new HttpEntity<>(
                new NotificationRequest(mobileNumber, NOTIFICATION_SMS_CHANNEL, templateId, replacementContent),
                requestHeaders
        );
        String endpoint = endpointConfiguration.getNotificationHost() + "/notification/v1/notifications";

        log.info(" Call send Notification channel SMS API to [{}] with POST http method", endpoint);
        ResponseEntity<GeneralResponse> responseEntity = null;
        try {
            responseEntity = notificationRestTemplate.exchange(
                    endpoint,
                    HttpMethod.POST,
                    httpEntity,
                    new ParameterizedTypeReference<GeneralResponse>() {
                    });
        } catch (RestClientException rcEx) {
            this.handleConnectError(rcEx, endpoint);
        }

        return responseEntity;
    }
}
