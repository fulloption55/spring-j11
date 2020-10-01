package com.theerut.springj11.constant;

import lombok.Getter;

@Getter
public enum ResponseMapEnum {
    SUCCESS(0, "success", "Success"),
    GENERAL_ERROR(1, "general_error", "Unexpected error"),
    ERROR_TIMEOUT(2, "error_timeout", "Exceed time to connect"),
    ERROR_CONNECTION(3, "error_connection", "Error to connect with client"),
    INVALID_PARAMETER(11, "invalid_parameter", "Input is not match with conditions"),
    INVALID_CREDENTIAL(1001, "invalid_credential", "Wrong passcode input"),
    ERROR_EXCEED_PASSCODE_ATTEMPT(1002, "error_exceed_passcode_attempt", "Input wrong passcode exceed limit"),
    ERROR_NOT_FOUND_DATA(1003, "not_found_data", "Not found data"),
    ERROR_ACCOUNT_NOT_BELONG_TO_USER(1004, "error_account_not_belong_user", "Account is not belong to user"),
    ERROR_ACCOUNT_UNABLE_TO_DISBURSE(1005, "error_account_unable_to_disburse", "Account is not able to do disbursement"),
    ERROR_KYC_GRADE_NOT_PASS(4001, "error_kyc_grade_not_passed", "KYC grade is not passed"),
    ERROR_HAS_NO_FATCA(4002, "error_has_no_fatca", "Has no FATCA information"),
    ERROR_WATCHLIST_NOT_COMPLETE(4003, "error_watchlist_not_complete", "Watchlist status not complete"),
    ERROR_FATCA_NOT_COMPLETE(4004, "error_fatca_not_complete", "FATCA status not complete"),
    ERROR_KYC_GRADE_NOT_COMPLETE(4005, "error_kyc_grade_not_complete", "KYC Grade status not complete"),
    ERROR_NOT_ACCEPT_ALL_FATCA_ANSWER(4006, "error_not_accept_all_fatca_answer", "FATCA answers are not all accepted"),
    ERROR_EXCEED_ACCOUNT_FOR_PRODUCT(4007, "error_exceed_account_for_product", "Exceed maximum number account per UID for this product");

    private final int code;
    private final String text;
    private final String description;

    ResponseMapEnum(int code, String text, String description) {
        this.code = code;
        this.text = text;
        this.description = description;
    }

}
