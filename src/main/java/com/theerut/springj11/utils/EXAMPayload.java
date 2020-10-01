package com.theerut.springj11.utils;

import lombok.Data;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

@Data
public class EXAMPayload {
    private String userId;
    private String userType;
    private String accessToken;
    private String ipAddress;
    private String correlationId;
    private String clientId;
    private String deviceId;
    private String agent;
    private String deviceModel;
    private String osVersion;
    private String applicationVersion;
    private String sessionId;
    private String language;

    public HttpHeaders generateHeader() {
        HttpHeaders requestHeader = new HttpHeaders();
        requestHeader.set("user_id", this.userId);
        requestHeader.set("user_type", this.userType);
        requestHeader.set("access_token", this.accessToken);
        requestHeader.set("correlation_id", this.correlationId);
        requestHeader.set("ip_address", this.ipAddress);
        requestHeader.set("client_id", this.clientId);
        requestHeader.set("device_id", this.deviceId);
        requestHeader.set("model", this.deviceModel);
        requestHeader.set("os_version", this.osVersion);
        requestHeader.set("agent", this.agent);
        requestHeader.set("application_version", this.applicationVersion);
        requestHeader.set("session_id", this.sessionId);
        requestHeader.set("language", this.language);
        requestHeader.setContentType(MediaType.APPLICATION_JSON);
        return requestHeader;
    }

    public EXAMPayload generateEXAMPayload() {
        EXAMPayload examPayload = new EXAMPayload();
        examPayload.setUserId(this.userId);
        examPayload.setUserType(this.userType);
        examPayload.setAccessToken(this.accessToken);
        examPayload.setIpAddress(this.ipAddress);
        examPayload.setCorrelationId(this.correlationId);
        examPayload.setClientId(this.clientId);
        examPayload.setDeviceId(this.deviceId);
        examPayload.setAgent(this.agent);
        examPayload.setDeviceModel(this.deviceModel);
        examPayload.setOsVersion(this.osVersion);
        examPayload.setApplicationVersion(this.applicationVersion);
        examPayload.setSessionId(this.sessionId);
        examPayload.setLanguage(this.language);
        return examPayload;
    }
}
