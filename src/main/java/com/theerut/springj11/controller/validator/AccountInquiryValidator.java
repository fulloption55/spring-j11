package com.theerut.springj11.controller.validator;

import com.theerut.springj11.client.webservice.accountinquiry.EXAMAcctInqRsType;
import com.theerut.springj11.config.ErrorMessageConfig;
import com.theerut.springj11.controller.request.AccountInquiryRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
@RequiredArgsConstructor
public class AccountInquiryValidator {
    private final ErrorMessageConfig errorMessageConfig;

    public String validateRequest(final AccountInquiryRequest request) {
        if (StringUtils.isEmpty(request.getAccountNo()) || StringUtils.isEmpty(request.getAccountType())) {
            return errorMessageConfig.getAcInquiryRequestValidateError();
        }
        return "";
    }

    public String validateResponse(final EXAMAcctInqRsType response) {
        if (response != null && response.getExamStatus() != null) {
            if (response.getExamStatus().getStatusCode() != 0) {
                return response.getExamStatus().getStatusDesc();
            } else {
                return "";
            }
        } else {
            return errorMessageConfig.getResponseValidateNullError();
        }
    }
}
