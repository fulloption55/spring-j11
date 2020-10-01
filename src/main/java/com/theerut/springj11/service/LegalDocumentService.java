package com.theerut.springj11.service;

import com.theerut.springj11.client.RestLegalDocumentClient;
import com.theerut.springj11.client.request.ActiveDocumentSearchRequest;
import com.theerut.springj11.client.request.AgreementVerificationRequest;
import com.theerut.springj11.client.response.AgreementVerificationResponse;
import com.theerut.springj11.client.response.DocumentListResponse;
import com.theerut.springj11.constant.DocumentTypeEnum;
import com.theerut.springj11.constant.ProductGroupNameEnum;
import com.theerut.springj11.constant.ProductReferenceEnum;
import com.theerut.springj11.constant.ResponseMapEnum;
import com.theerut.springj11.controller.response.GeneralResponse;
import com.theerut.springj11.service.model.LegalDocument;
import com.theerut.springj11.utils.EXAMPayload;
import com.theerut.springj11.service.base.LocalBaseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.theerut.springj11.constant.DocumentTypeEnum.FACT_SHEET;
import static com.theerut.springj11.constant.DocumentTypeEnum.TERM_AND_CONDITION;
import static com.theerut.springj11.constant.ProductGroupNameEnum.ACCOUNT_OPENING;

@Slf4j
@Service
@RequiredArgsConstructor
public class LegalDocumentService {

    private static final String BUSINESS_TYPE = "Deposit";
    private final RestLegalDocumentClient restLegalDocumentClient;
    private final LocalBaseService baseService;

    public GeneralResponse<DocumentListResponse> searchDocument(EXAMPayload payload, DocumentTypeEnum documentTypeEnum, ProductReferenceEnum productReferenceEnum, ProductGroupNameEnum productGroupNameEnum) {

        ActiveDocumentSearchRequest requestBody = new ActiveDocumentSearchRequest();
        requestBody.setBusinessType(BUSINESS_TYPE);
        requestBody.setDocumentType(documentTypeEnum.getText());
        final List<String> productReferenceList = new ArrayList<>();
        productReferenceList.add(productReferenceEnum.getText());
        requestBody.setProductReference(productReferenceList);
        requestBody.setProductGroupName(productGroupNameEnum.getText());
        ResponseEntity<GeneralResponse<DocumentListResponse>> response = restLegalDocumentClient.searchDocument(payload, requestBody);

        if (baseService.isFailed(this.getClass().getSimpleName(), "getLegalDocument", response)) {
            throw new IllegalStateException(ResponseMapEnum.ERROR_CONNECTION.getText());
        }
        return response.getBody();

    }

    public GeneralResponse<AgreementVerificationResponse> verifyAgreement(List<String> agreementIdList) {
        final AgreementVerificationRequest requestBody = new AgreementVerificationRequest();
        requestBody.setAgreementIdList(agreementIdList);
        ResponseEntity<GeneralResponse<AgreementVerificationResponse>> response = restLegalDocumentClient.verifyAgreement(requestBody);

        if (baseService.isFailed(this.getClass().getSimpleName(), "verifyAgreement", response)) {
            throw new IllegalStateException(ResponseMapEnum.ERROR_CONNECTION.getText());
        }
        return response.getBody();
    }

    public void validateDocumentForAccountProduct(List<LegalDocument> documentList, String productId) {
        int count = 0;
        final String expectedTermCon = BUSINESS_TYPE.concat(ACCOUNT_OPENING.getText()).concat(TERM_AND_CONDITION.getText()).concat(productId);
        final String expectedFactSheet = BUSINESS_TYPE.concat(ACCOUNT_OPENING.getText()).concat(FACT_SHEET.getText()).concat(productId);
        for (LegalDocument document : documentList) {
            final String businessType = document.getBusinessType();
            final String productGroup = document.getProductGroupName();
            final String documentType = document.getType();
            final String productRef = document.getProductReference();

            final String actualDocument = businessType
                    .concat(productGroup)
                    .concat(documentType)
                    .concat(productRef);

            if (expectedTermCon.equals(actualDocument) || expectedFactSheet.equals(actualDocument)) {
                count++;
            }
        }
        if (count != 2) {
            throw new IllegalArgumentException("Invalid number of expected document that accepted");
        }
    }

}
