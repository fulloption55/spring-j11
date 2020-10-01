package com.theerut.springj11.utils;

import org.springframework.util.StringUtils;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class AccountUtil {
    private static final String MARK_X5DIGITS = "xxxxx";
    private static final String REGEX_ACCOUNT_ID_FORMAT = "(?:^[0-9]{7})(.{10})(?:[0-9]{2})";
    private static final int RAW_SIZE_ACCOUNT_ID = 19;

    private AccountUtil() {
        throw new IllegalStateException("Utility class");
    }

    public static String markAccountId(String text) {
        if (!StringUtils.isEmpty(text) && text.length() > 4) {
            return MARK_X5DIGITS + text.substring(text.length() - 5);
        }
        return text;
    }

    public static String getLastDigits(String text, int digits) {
        return text.substring(text.length() - digits);
    }

    public static String format(String accountId) {
        if (!StringUtils.isEmpty(accountId) && accountId.length() == RAW_SIZE_ACCOUNT_ID) {
            return accountId.replaceAll(REGEX_ACCOUNT_ID_FORMAT, "$1");
        }
        return accountId;
    }

}
