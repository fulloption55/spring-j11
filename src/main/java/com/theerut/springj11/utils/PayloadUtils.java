package com.theerut.springj11.utils;

import com.theerut.springj11.constant.TestoPayloadConstant;
import com.theerut.springj11.constant.PayloadConstant;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PayloadUtils {

    private PayloadUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static HttpHeaders generateHeader(EXAMPayload payload) {
        HttpHeaders requestHeader = new HttpHeaders();
        requestHeader.set(PayloadConstant.USER_ID_KEY, payload.getUserId());
        requestHeader.set(PayloadConstant.USER_TYPE_KEY, payload.getUserType());
        requestHeader.set(PayloadConstant.CORRELATION_ID_KEY, payload.getCorrelationId());
        requestHeader.set(PayloadConstant.IP_ADDRESS_KEY, payload.getIpAddress());
        requestHeader.set(PayloadConstant.CLIENT_ID_KEY, payload.getClientId());
        requestHeader.set(PayloadConstant.DEVICE_ID_KEY, payload.getDeviceId());
        requestHeader.set(PayloadConstant.ACCESS_TOKEN_KEY, payload.getAccessToken());
        requestHeader.set(PayloadConstant.AGENT_KEY, payload.getAgent());
        requestHeader.set(PayloadConstant.LANGUAGE_KEY, payload.getLanguage());
        return requestHeader;
    }

    public static HttpHeaders generateTestoHeader(String base64Credential, String transaction, String tellerId, String branchId) {
        HttpHeaders requestHeader = new HttpHeaders();
        requestHeader.setContentType(MediaType.APPLICATION_JSON);
        requestHeader.add(TestoPayloadConstant.AUTHORIZATION, "Basic " + base64Credential);
        requestHeader.set(TestoPayloadConstant.TRANSACTION_ID, transaction);
        requestHeader.set(TestoPayloadConstant.TRANSACTION_DATETIME, generateTestoTransactionDate());
        requestHeader.set(TestoPayloadConstant.TELLER_ID, tellerId);
        requestHeader.set(TestoPayloadConstant.BRANCH_ID, branchId);
        return requestHeader;
    }

    public static String encodeTestoCredential(String username, String password) {
        final String plainCredential = username + ":" + password;
        byte[] plainCredentialBytes = plainCredential.getBytes();
        byte[] base64CredentialBytes = Base64.encodeBase64(plainCredentialBytes);
        return new String(base64CredentialBytes);
    }

    private static String generateTestoTransactionDate() {
        final String transactionDatePattern = "yyyyMMddHHmmssSSS";
        return DateTimeFormatter.ofPattern(transactionDatePattern).format(LocalDateTime.now());
    }

}
