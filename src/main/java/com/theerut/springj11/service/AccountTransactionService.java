package com.theerut.springj11.service;

import com.theerut.springj11.client.ExamSoapClient;
import com.theerut.springj11.client.webservice.ExamResponseInterface;
import com.theerut.springj11.client.webservice.accounttrxhistory.EXAMDepAcctTrnInqRsType;
import com.theerut.springj11.client.webservice.accounttrxhistory.EXAMDepAcctTrnInqSvc;
import com.theerut.springj11.client.webservice.common.EXAMStatusType;
import com.theerut.springj11.constant.AccountTypeEnum;
import com.theerut.springj11.factory.request.AccountTrxHistoryRequestFactory;
import com.theerut.springj11.factory.response.AccountTrxHistoryResponseFactory;
import com.theerut.springj11.service.model.AccountTransaction;
import com.theerut.springj11.service.model.ExamStatus;
import com.theerut.springj11.utils.AccountUtil;
import com.theerut.springj11.service.base.ExamBaseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.theerut.springj11.constant.ExamStatusEnum.GENERAL_ERROR;
import static com.theerut.springj11.constant.ExamStatusEnum.NO_RECORD;


@Slf4j
@Service
@RequiredArgsConstructor
public class AccountTransactionService {
    private final AccountTrxHistoryRequestFactory transactionRequestFactory;
    private final AccountTrxHistoryResponseFactory transactionResponseFactory;
    private final ExamSoapClient examSoapClient;
    private final WebServiceTemplate examWebServiceTemplate;
    private final ExamBaseService examBaseService;

    public List<AccountTransaction> getTransactionList(String accountId, AccountTypeEnum accountType, LocalDateTime startDatetime, LocalDateTime endDatetime) {
        final String lastDigitsAccount = AccountUtil.getLastDigits(accountId, 4);
        final String requestId = examBaseService.generateRequestId();

        log.info("Getting transaction list for account ID [****{}] with EXAM request ID [{}]", lastDigitsAccount, requestId);
        final EXAMDepAcctTrnInqSvc soapRequest = transactionRequestFactory.getRequest(requestId, accountId, accountType, startDatetime, endDatetime);
        final EXAMDepAcctTrnInqRsType soapResponse = Optional.ofNullable(examSoapClient.send(soapRequest, examWebServiceTemplate))
                .map(EXAMDepAcctTrnInqSvc::getEXAMDepAcctTrnInqRs)
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
                log.info("User has no any transactions");
                return new ArrayList<>();
            }
            throw new IllegalStateException("EXAM Error code: " + errorCode);
        }

        log.info("Mapping transaction list from EXAM format account ID [****{}].", lastDigitsAccount);
        return soapResponse.getExamDepAcctTrnRec()
                .stream().map(transactionResponseFactory::mapTransaction)
                .collect(Collectors.toList());
    }
}