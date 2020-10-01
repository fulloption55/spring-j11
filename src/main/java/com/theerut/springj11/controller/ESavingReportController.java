package com.theerut.springj11.controller;

import com.theerut.springj11.constant.ActionTransactionTypeEnum;
import com.theerut.springj11.controller.model.Pagination;
import com.theerut.springj11.controller.request.ApplicationTransactionRequest;
import com.theerut.springj11.controller.response.AppTransactionsListResponse;
import com.theerut.springj11.controller.response.AppTransactionsResponse;
import com.theerut.springj11.controller.response.ApplicationActivityResponse;
import com.theerut.springj11.controller.response.GeneralResponse;
import com.theerut.springj11.factory.response.ResponseFactory;
import com.theerut.springj11.repository.entity.ApplicationTransactionEntity;
import com.theerut.springj11.service.ESavingReportService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/v1")
public class ESavingReportController {
    private final ResponseFactory responseFactory;
    private final ESavingReportService eSavingReportService;

    @PostMapping(value = "/reports/applications/transactions")
    public ResponseEntity<GeneralResponse<AppTransactionsListResponse>> inquiryApplicationTransaction(@Valid @RequestBody ApplicationTransactionRequest request) {

        log.info("========== Start get application transaction ==========");
        LocalDateTime startDate = LocalDateTime.of(request.getStartDate(), LocalTime.MIN);
        LocalDateTime endDate = LocalDateTime.of(request.getEndDate(), LocalTime.MAX);
        // Pagination from request starts from 1 while code starts from 0
        int pageIndex = request.getPagination().getPageIndex() - 1;
        int recordPerPage = request.getPagination().getRecordPerPage();
        Page<ApplicationTransactionEntity> applicationTransactionEntityPage = eSavingReportService
                .getApplicationByCriteria(startDate, endDate, request.getUserId(), request.getActionId(), pageIndex, recordPerPage);
        List<ApplicationTransactionEntity> applicationTransactionEntities = applicationTransactionEntityPage.getContent();
        List<AppTransactionsResponse> appTransactions = appTransactionsResponse(applicationTransactionEntities);

        AppTransactionsListResponse transactionsListResponse = new AppTransactionsListResponse();
        if (!appTransactions.isEmpty()) {
            transactionsListResponse.setTransactionsResponses(appTransactions);

            Pagination paginationResponse = Pagination
                    .builder(request.getPagination().getPageIndex(), request.getPagination().getRecordPerPage())
                    .totalRecord(applicationTransactionEntityPage.getTotalElements())
                    .build();
            transactionsListResponse.setPagination(paginationResponse);
        }
        log.info("Total application activity : " + appTransactions.size());
        log.info("========== End get application transaction ==========");

        return responseFactory.success(transactionsListResponse);
    }

    private List<AppTransactionsResponse> appTransactionsResponse(List<ApplicationTransactionEntity> applicationTransactionEntities) {
        List<AppTransactionsResponse> appTransactionsResponses = new ArrayList<>();

        applicationTransactionEntities.forEach(appTransaction -> {
            ApplicationActivityResponse activityResponse = new ApplicationActivityResponse();
            activityResponse.setId(appTransaction.getActivity());
            activityResponse.setActivityName(ActionTransactionTypeEnum.getEnum(appTransaction.getActivity()).getName());

            AppTransactionsResponse appTransactionsResponse = AppTransactionsResponse.builder()
                    .id(appTransaction.getId().toString())
                    .userId(appTransaction.getUserId())
                    .activity(activityResponse)
                    .info1(appTransaction.getInfo1())
                    .info2(appTransaction.getInfo2())
                    .info3(appTransaction.getInfo3())
                    .info4(appTransaction.getInfo4())
                    .info5(appTransaction.getInfo5())
                    .info6(appTransaction.getInfo6())
                    .statusCode(appTransaction.getStatusCode())
                    .statusDescription(appTransaction.getStatusDescription())
                    .createdDatetime(appTransaction.getCreatedDatetime())
                    .build();

            appTransactionsResponses.add(appTransactionsResponse);
        });

        return appTransactionsResponses;
    }
}
