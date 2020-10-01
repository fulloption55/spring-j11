package com.theerut.springj11.utils;

import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class EXAMPayloadInterceptor extends HandlerInterceptorAdapter {
    private final EXAMPayload examPayload;

    public EXAMPayloadInterceptor() {
        this.examPayload = new EXAMPayload();
    }

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        String accessTokenKey = request.getHeader("access_token");
        String userId = request.getHeader("user_id");
        String userType = request.getHeader("user_type");
        String correlationId = request.getHeader("correlation_id");
        String ipAddress = request.getHeader("ip_address");
        String clientId = request.getHeader("client_id");
        String deviceId = request.getHeader("device_id");
        String agent = request.getHeader("agent");
        String deviceModel = request.getHeader("model");
        String osVersion = request.getHeader("os_version");
        String applicationVersion = request.getHeader("application_version");
        String sessionId = request.getHeader("session_id");
        String language = request.getHeader("language");
        this.examPayload.setUserId(userId);
        this.examPayload.setUserType(userType);
        this.examPayload.setAccessToken(accessTokenKey);
        this.examPayload.setIpAddress(ipAddress);
        this.examPayload.setCorrelationId(correlationId);
        this.examPayload.setClientId(clientId);
        this.examPayload.setDeviceId(deviceId);
        this.examPayload.setAgent(agent);
        this.examPayload.setDeviceModel(deviceModel);
        this.examPayload.setOsVersion(osVersion);
        this.examPayload.setApplicationVersion(applicationVersion);
        this.examPayload.setSessionId(sessionId);
        this.examPayload.setLanguage(language);
        MDC.put("UserType", userType);
        MDC.put("UserId", userId);
        MDC.put("CorrelationId", correlationId);
        MDC.put("IPAddress", ipAddress);
        MDC.put("SessionId", sessionId);
        return true;
    }
}
