package com.theerut.springj11.constant;

public enum TestoV2ResponseCode {

    EXCEED_LIMIT_PRODUCT_PER_UID("881111", "Exceed maximum number account per UID for this product");

    private String code;
    private String message;

    TestoV2ResponseCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }
}
