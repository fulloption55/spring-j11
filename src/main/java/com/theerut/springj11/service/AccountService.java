package com.theerut.springj11.service;

import com.theerut.springj11.annotation.LogTime;
import com.theerut.springj11.client.ExamSoapClient;
import com.theerut.springj11.client.webservice.ExamResponseInterface;
import com.theerut.springj11.client.webservice.accountsummary.EXAMAcctSummRsType;
import com.theerut.springj11.client.webservice.accountsummary.EXAMAcctSummSvc;
import com.theerut.springj11.client.webservice.common.EXAMStatusType;
import com.theerut.springj11.constant.AccountSummaryConstant;
import com.theerut.springj11.factory.request.AccountSummaryRequestFactory;
import com.theerut.springj11.factory.response.AccountSummaryResponseFactory;
import com.theerut.springj11.service.model.Account;
import com.theerut.springj11.service.model.AccountFilter;
import com.theerut.springj11.service.model.ExamStatus;
import com.theerut.springj11.utils.AccountUtil;
import com.theerut.springj11.service.base.ExamBaseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.theerut.springj11.constant.ExamStatusEnum.GENERAL_ERROR;
import static com.theerut.springj11.constant.ExamStatusEnum.NO_RECORD;


@Slf4j
@Service
@RequiredArgsConstructor
public class AccountService {
    private final AccountSummaryRequestFactory soapSummaryRequestFactory;
    private final AccountSummaryResponseFactory soapSummaryResponseFactory;
    private final ExamSoapClient examSoapClient;
    private final WebServiceTemplate examAccountSummaryTemplate;
    private final ExamBaseService examBaseService;

    public List<Account> getAccountList(String cifId) {
        final String requestId = examBaseService.generateRequestId();
        log.info("Getting account list for UIDID [{}] and EXAM request ID [{}]", cifId, requestId);
        final EXAMAcctSummSvc soapRequest = soapSummaryRequestFactory.getRequest(requestId, cifId);
        final EXAMAcctSummRsType soapResponse = Optional.ofNullable(examSoapClient.send(soapRequest, examAccountSummaryTemplate))
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
                log.info("User has no any CASA account types");
                return new ArrayList<>();
            }
            throw new IllegalStateException("EXAM Error code: " + errorCode);
        }
        return soapResponse.getExamAcctInfo()
                .stream().map(soapSummaryResponseFactory::mapAccount)
                .collect(Collectors.toList());
    }


    public List<Account> filter(List<Account> originalList, AccountFilter accountFilter) {
        Stream<Account> stream = originalList.stream();
        if (accountFilter.getId() != null) {
            stream = stream.filter(account -> accountFilter.getId().equals(account.getId()));
        }
        if (accountFilter.getStatusCodes() != null && !accountFilter.getStatusCodes().isEmpty()) {
            stream = stream.filter(account -> accountFilter.getStatusCodes()
                    .stream()
                    .anyMatch(status -> status.getCode().equals(account.getStatusCode())));
        }
        if (accountFilter.getTypes() != null && !accountFilter.getTypes().isEmpty()) {
            stream = stream.filter(account -> accountFilter.getTypes()
                    .stream()
                    .anyMatch(status -> status.getCode().equals(account.getType())));
        }
        if (accountFilter.getCurrencies() != null && !accountFilter.getCurrencies().isEmpty()) {
            stream = stream.filter(account -> accountFilter.getCurrencies()
                    .stream()
                    .anyMatch(status -> status.getCode().equals(account.getCurrency())));
        }
        List<Account> filteredList = stream.collect(Collectors.toList());
        log.info("Filter out with search criteria in account list size from [{}] to [{}]", originalList.size(), filteredList.size());
        return filteredList;
    }

    public List<Account> filterJointAccount(List<Account> originalList) {
        final List<Account> accountList = originalList.stream()
                .filter(account -> Boolean.FALSE == account.isJointIndicator())
                .filter(account -> !AccountSummaryConstant.CONDITION_JOIN_AND.equalsIgnoreCase(account.getSigningCond()))
                .filter(account -> !AccountSummaryConstant.CONDITION_JOIN_OR.equalsIgnoreCase(account.getSigningCond()))
                .filter(account -> !AccountSummaryConstant.MODE_MINOR.equalsIgnoreCase(account.getMode()))
                .filter(account -> !AccountSummaryConstant.MODE_JOIN.equalsIgnoreCase(account.getMode()))
                .collect(Collectors.toList());
        log.info("Filter out joint type and minor type in account list size from [{}] to [{}]", originalList.size(), accountList.size());
        return accountList;
    }

    @Deprecated
    public boolean isAccountBelongToCif(String accountId, String accountType, List<Account> accounts) {
        final Predicate<Account> accountPredicate = account ->
                accountId.equals(account.getId()) && accountType.equals(account.getType());

        return accounts.stream().anyMatch(accountPredicate);
    }

    @LogTime
    public boolean isAccountBelongUser(String accountId, String userId) {
        final List<Account> accounts = this.getAccountList(userId);
        final Predicate<Account> accountPredicate = account -> account.getId().startsWith(accountId);
        if (accounts.stream().noneMatch(accountPredicate)) {
            String maskedAccountId = AccountUtil.getLastDigits(accountId, 4);
            log.error("Account ID [****{}] is not be long to user ID [{}]", maskedAccountId, userId);
            throw new IllegalArgumentException("Account is not belong to user");
        }
        return true;
    }


}
