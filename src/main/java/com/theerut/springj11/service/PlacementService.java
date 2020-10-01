package com.theerut.springj11.service;

import com.theerut.springj11.annotation.LogTime;
import com.theerut.springj11.client.ExamSoapClient;
import com.theerut.springj11.client.webservice.ExamResponseInterface;
import com.theerut.springj11.client.webservice.accountsummary.EXAMAcctSummRsType;
import com.theerut.springj11.client.webservice.accountsummary.EXAMAcctSummSvc;
import com.theerut.springj11.client.webservice.common.EXAMStatusType;
import com.theerut.springj11.factory.request.AccountSummaryRequestFactory;
import com.theerut.springj11.factory.response.AccountSummaryResponseFactory;
import com.theerut.springj11.service.model.ExamStatus;
import com.theerut.springj11.service.model.Placement;
import com.theerut.springj11.utils.AccountUtil;
import com.theerut.springj11.service.base.ExamBaseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.theerut.springj11.constant.ExamStatusEnum.GENERAL_ERROR;
import static com.theerut.springj11.constant.ExamStatusEnum.NO_RECORD;

@Slf4j
@Service
@RequiredArgsConstructor
public class PlacementService {
    private final AccountSummaryRequestFactory summaryRequestFactory;
    private final AccountSummaryResponseFactory summaryResponseFactory;
    private final ExamSoapClient examSoapClient;
    private final WebServiceTemplate examWebServiceTemplate;
    private final ExamBaseService examBaseService;

    @LogTime
    public List<Placement> getPlacementList(String fixedAccountGroupId) {
        final String requestId = examBaseService.generateRequestId();
        final String lastDigitsAccount = AccountUtil.getLastDigits(fixedAccountGroupId, 4);
        log.info("Getting placement list for fixed group account ID [****{}] and EXAM request ID [{}]", lastDigitsAccount, requestId);
        final EXAMAcctSummSvc soapRequest = summaryRequestFactory.getPlacementRequest(requestId, fixedAccountGroupId);
        final EXAMAcctSummRsType soapResponse = Optional.ofNullable(examSoapClient.send(soapRequest, examWebServiceTemplate))
                .map(EXAMAcctSummSvc::getEXAMAcctSummRs)
                .orElseThrow(() -> new IllegalArgumentException("Got empty from EXAM response mapping"));

        final EXAMStatusType examStatus = Optional.of(soapResponse)
                .map(ExamResponseInterface::getExamStatus)
                .orElseThrow(() -> new IllegalArgumentException("Got empty from EXAM status mapping"));

        final ExamStatus status = examBaseService.extractStatus(requestId,
                soapRequest.getEXAMSignonRq().getEXAMHeaderRq().getEXAMServiceName(),
                examStatus, this.getClass());

        if (examBaseService.isFailedExamStatus(soapResponse)) {
            final Long errorCode = status.getStatusCodes().stream().findFirst().orElse(GENERAL_ERROR.getCode());
            if (NO_RECORD.getCode().equals(errorCode)) {
                log.info("User has no any placement");
                return new ArrayList<>();
            }
            throw new IllegalStateException("EXAM Error code: " + errorCode);
        }
        log.info("Mapping placement list from EXAM format fixed group account ID [****{}].", lastDigitsAccount);
        return soapResponse.getExamAcctInfo()
                .stream().map(summaryResponseFactory::mapPlacement)
                .collect(Collectors.toList());
    }


}
