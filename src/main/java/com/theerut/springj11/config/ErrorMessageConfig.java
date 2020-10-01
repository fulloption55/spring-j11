package com.theerut.springj11.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class ErrorMessageConfig {
    @Value("${trxhistory.request.validate.error}")
    private String trxHistoryRequestValidateError;

    @Value("${acinquiry.request.validate.error}")
    private String acInquiryRequestValidateError;

    @Value("${prodinquiry.request.validate.error}")
    private String prodInquiryRequestValidateError;

    @Value("${prodbranchinquiry.request.validate.error}")
    private String prodBranchInquiryRequestValidateError;

    @Value("${payload.usertype.validate.error}")
    private String payloadUserTypeValidateError;

    @Value("${payload.userid.validate.error}")
    private String payloadUserIdValidateError;

    @Value("${watchlistinquiry.request.validate.error}")
    private String watchlistInquiryRequestValidateError;

    @Value("${response.validate.null.error}")
    private String responseValidateNullError;

}
