package com.theerut.springj11.controller;

import com.theerut.springj11.annotation.LogStartEnd;
import com.theerut.springj11.annotation.LogTime;
import com.theerut.springj11.constant.AccountTransactionTypeEnum;
import com.theerut.springj11.constant.AccountTypeEnum;
import com.theerut.springj11.constant.ResponseMapEnum;
import com.theerut.springj11.controller.request.AccountCasaTransactionRequest;
import com.theerut.springj11.controller.request.AccountTransactionRequest;
import com.theerut.springj11.controller.response.AccountTransactionResponse;
import com.theerut.springj11.controller.response.CasaAccountTransactionResponse;
import com.theerut.springj11.controller.response.CasaTransactionResponse;
import com.theerut.springj11.controller.response.GeneralResponse;
import com.theerut.springj11.factory.response.ResponseFactory;
import com.theerut.springj11.service.AccountService;
import com.theerut.springj11.service.AccountTransactionService;
import com.theerut.springj11.service.TestoAccountService;
import com.theerut.springj11.service.model.AccountTransaction;
import com.theerut.springj11.service.model.TestoAccount;
import com.theerut.springj11.service.model.TestoAccountCasaTransaction;
import com.theerut.springj11.utils.EXAMPayload;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequiredArgsConstructor
public class AccountTransactionController {
    private final AccountTransactionService accountTransactionService;
    private final AccountService accountService;
    private final TestoAccountService TestoAccountService;
    private final ResponseFactory responseFactory;
    private final EXAMPayload payload;

    @LogStartEnd
    @LogTime
    @PostMapping(value = "/v1/accounts/transactions/search")
    public ResponseEntity<GeneralResponse<List<AccountTransactionResponse>>> searchAccountTransactionList(@Valid @RequestBody AccountTransactionRequest request) {
        final String userId = payload.getUserId();
        try {
            accountService.isAccountBelongUser(request.getAccountId(), userId);
            final LocalDateTime start = request.getStartDate().atStartOfDay().truncatedTo(ChronoUnit.DAYS);
            final LocalDateTime end = request.getEndDate().atTime(23, 59, 59, 999999999);

            final List<AccountTransaction> accountTransactionList = accountTransactionService.getTransactionList(request.getAccountId(), request.getAccountType(), start, end);
            return responseFactory.success(this.buildAccountTransactionResponseList(accountTransactionList));
        } catch (IllegalArgumentException iae) {
            log.error("Error {}", iae.toString());
            return responseFactory.error(HttpStatus.BAD_REQUEST, ResponseMapEnum.GENERAL_ERROR.getText());
        }
    }


    @LogStartEnd
    @LogTime
    @PostMapping("/v1/casa-accounts/transactions")
    public ResponseEntity<GeneralResponse<CasaTransactionResponse>> getAccountCasaTransactions(@RequestBody AccountCasaTransactionRequest request) {
        final AccountTypeEnum accountType = TestoAccountService.getAccountType(request.getAccountId());
        final TestoAccount accountDetail = TestoAccountService.getAccount(request.getAccountId(), accountType.getTestoCode());
        TestoAccountService.isAccountBelongUser(payload.getUserId(), accountDetail.getUserId(), accountDetail.getId());

        List<TestoAccountCasaTransaction> TestoResponseList = TestoAccountService.getAccountCasaTransaction(request.getAccountId(), request.getStartDateTime(), request.getLimit());
        final DateTimeFormatter effectiveDatetimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        final LocalDateTime previousDate = request.getStartDateTime().minusYears(1);

        List<CasaAccountTransactionResponse> transactionResponseList = TestoResponseList.stream().filter(it ->
                !LocalDateTime.parse(it.getPostingTimestamp(), effectiveDatetimeFormatter).isBefore(previousDate)).map(it ->
                CasaAccountTransactionResponse.builder()
                        .accountId(it.getAccountNo())
                        .amount(it.getTransactionAmount() != null ? it.getTransactionAmount().toString() : "0.00")
                        .description(it.getTransactionDescription())
                        .channelCode(it.getChannelCode())
                        .currency(it.getCurrencyCode())
                        .effectiveDatetime(it.getPostingTimestamp())
                        .orderId(it.getOrderID())
                        .type(AccountTransactionTypeEnum.getTransactionType(it.getDebitCreditCode()).getValue())
                        .build())
                .collect(Collectors.toList());

        return responseFactory.success(new CasaTransactionResponse(transactionResponseList));
    }

    private List<AccountTransactionResponse> buildAccountTransactionResponseList(List<AccountTransaction> accountTransactionList) {
        final List<AccountTransactionResponse> responseList = new ArrayList<>();
        for (AccountTransaction transaction : accountTransactionList) {
            responseList.add(AccountTransactionResponse.builder()
                    .source(transaction.getSource())
                    .type(transaction.getType())
                    .referenceId(transaction.getReferenceId())
                    .referenceType(transaction.getReferenceType())
                    .amount(transaction.getAmount().toPlainString())
                    .currency(transaction.getCurrency())
                    .postedDate(transaction.getPostedDate())
                    .effectiveDatetime(transaction.getEffectiveDatetime())
                    .memo(transaction.getMemo())
                    .build());
        }
        return responseList;
    }
}
