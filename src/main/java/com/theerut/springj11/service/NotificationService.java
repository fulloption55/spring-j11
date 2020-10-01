package com.theerut.springj11.service;

import com.theerut.springj11.client.RestNotificationServiceClient;
import com.theerut.springj11.client.response.DocumentListResponse;
import com.theerut.springj11.config.EmailConfiguration;
import com.theerut.springj11.config.FileConfiguration;
import com.theerut.springj11.constant.*;
import com.theerut.springj11.controller.response.GeneralResponse;
import com.theerut.springj11.service.model.AccountEmailForm;
import com.theerut.springj11.service.model.AccountFileForm;
import com.theerut.springj11.service.model.LegalDocument;
import com.theerut.springj11.service.model.Product;
import com.theerut.springj11.utils.StringUtil;
import com.theerut.springj11.utils.EXAMPayload;
import com.theerut.springj11.service.base.LocalBaseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STRawGroupDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.chrono.ThaiBuddhistDate;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.Locale;


@Slf4j
@Service
@RequiredArgsConstructor
public class NotificationService {
    private static final String DOCUMENT_FILE_TYPE = ".pdf";
    private static final String TEMPLATE_NAME_ACCOUNT_OPENING = "etb_email_form";
    private static final String TEMPLATE_NAME_ACCOUNT_OPENING_ERROR = "etb_email_form_error";
    private static final String TEMPLATE_FOLDER = "form_templates";
    private static final String TERM_FOLDER = "document_files/term_condition/";
    private static final String FACT_FOLDER = "document_files/fact_sheet/";
    private static final String FOLDERNAME_PATTERN_ACCOUNT_OPENING = "REF_%s";
    private static final String UNDER_SCORE = "_";
    private static final String FILES = "files";
    private static final String CREATE_DATE_FORMAT = "%d %s %d";

    private final RestNotificationServiceClient restNotificationServiceClient;
    private final FileConfiguration fileConfiguration;
    private final EmailConfiguration emailConfiguration;
    private final LegalDocumentService legalDocumentService;
    private final LocalBaseService baseService;

    public void sendEmailAccountSaving(EXAMPayload payload, String applicationOriginalFileName, AccountEmailForm formParameter) throws IOException {
        String destinationEmail = formParameter.getEmail();
        log.info("Sending email [{}] for reference ID [{}] with language [{}]", destinationEmail, formParameter.getReferenceId(), payload.getLanguage());


        Integer termProductVersion;
        Integer factSheetProductVersion;

        String termProductLanguage = LanguageConstant.TH + "/";
        String factSheetProductLanguage = LanguageConstant.TH + "/";

        if (formParameter.getTermProduct() != null) {
            termProductVersion = formParameter.getTermProduct().getVersion();
            factSheetProductVersion = formParameter.getFactSheetProduct().getVersion();
            // Language
            termProductLanguage = formParameter.getTermProduct().getLanguage() + "/";
            factSheetProductLanguage = formParameter.getFactSheetProduct().getLanguage() + "/";
        } else {
            termProductVersion = formParameter.getTermAndConditionVersion();
            factSheetProductVersion = formParameter.getFactSheetVersion();
        }

        String language = payload.getLanguage().toLowerCase();
        String applicationFileName = "en".equals(language) ? fileConfiguration.getAppFileNameEn() : fileConfiguration.getAppFileName();
        String termConditionFileName = "en".equals(language) ? fileConfiguration.getTermFileNameEn() : fileConfiguration.getTermFileName();
        String factFileName = "en".equals(language) ? fileConfiguration.getFactFileNameEn() : fileConfiguration.getFactFileName();

        Path folderPath = Paths.get(fileConfiguration.getAppFolderPath(), String.format(FOLDERNAME_PATTERN_ACCOUNT_OPENING, formParameter.getReferenceId()));
        Path applicationFilePath = Paths.get(folderPath.toString(), applicationOriginalFileName);

        File applicationOriginalFile = new File(applicationFilePath.toString());
        File appFile = new File(Paths.get(folderPath.toString(), applicationFileName + DOCUMENT_FILE_TYPE).toString());
        FileUtils.copyFile(applicationOriginalFile, appFile);

        ClassPathResource termOriginalFile = new ClassPathResource(TERM_FOLDER + termProductLanguage + formParameter.getProductId() + UNDER_SCORE + termProductVersion + DOCUMENT_FILE_TYPE);
        File termFile = new File(Paths.get(folderPath.toString(), termConditionFileName + DOCUMENT_FILE_TYPE).toString());
        Files.copy(termOriginalFile.getInputStream(), Paths.get(folderPath.toString(), termConditionFileName + DOCUMENT_FILE_TYPE));

        ClassPathResource factOriginalFile = new ClassPathResource(FACT_FOLDER + factSheetProductLanguage + formParameter.getProductId() + UNDER_SCORE + factSheetProductVersion + DOCUMENT_FILE_TYPE);
        File factFile = new File(Paths.get(folderPath.toString(), factFileName + DOCUMENT_FILE_TYPE).toString());
        Files.copy(factOriginalFile.getInputStream(), Paths.get(folderPath.toString(), factFileName + DOCUMENT_FILE_TYPE));

        String templateName = TEMPLATE_NAME_ACCOUNT_OPENING;
        ST page = this.getStringTemplate(templateName);
        page.add("form", formParameter);
        String content = page.render();

        MultiValueMap<String, Object> request = new LinkedMultiValueMap<>();
        request.add("sender_name", emailConfiguration.getSenderName());
        request.add("email_to", destinationEmail);
        for (String bccEmail : emailConfiguration.getBccEmail()) {
            request.add("bcc_email", bccEmail);
        }
        String subject;

        if ("en".equals(language)) {
            String subjectConfig = emailConfiguration.getSubjectEn();
            subject = String.format(subjectConfig, formParameter.getProductNameEn(), formParameter.getCustomerNameEn());
        } else {
            String subjectConfig = emailConfiguration.getSubject();
            subject = String.format(subjectConfig, formParameter.getProductNameTh(), formParameter.getCustomerNameTh());
        }

        request.add("subject", subject);
        request.add("content", content);
        request.add(FILES, new FileSystemResource(appFile));
        request.add(FILES, new FileSystemResource(termFile));
        request.add(FILES, new FileSystemResource(factFile));

        ResponseEntity<GeneralResponse> response = restNotificationServiceClient.sendEmailNotification(payload, request);

        if (baseService.isFailed(this.getClass().getSimpleName(), "sendEmailNotification", response)) {
            throw new IllegalStateException(ResponseMapEnum.ERROR_CONNECTION.getText());
        }
        log.info("Sent email for reference ID [{}] ", formParameter.getReferenceId());
    }

    @Async("threadPoolTaskExecutor")
    public void sendErrorEmailAccountSaving(EXAMPayload payload, String email, String customerNameTh, String customerNameEn, Product product,
                                            String titleNameTh, String titleNameEn) {
        log.info("Sending error email to email [{}] for user ID [{}]", email, payload.getUserId());

        String errorSubject;

        if ("en".equals(payload.getLanguage())) {
            String subjectConfig = emailConfiguration.getSubjectErrorEn();
            errorSubject = String.format(subjectConfig, customerNameEn);
        } else {
            String subjectConfig = emailConfiguration.getSubjectError();
            errorSubject = String.format(subjectConfig, product.getLocalName(), customerNameTh);
        }

        ST page = this.getStringTemplate(TEMPLATE_NAME_ACCOUNT_OPENING_ERROR);
        page.add("customerNameTh", customerNameTh);
        page.add("customerNameEn", customerNameEn);
        page.add("productNameTh", product.getLocalName());
        page.add("productNameEn", product.getName());
        page.add("titleNameTh", titleNameTh);
        page.add("titleNameEn", titleNameEn);
        String content = page.render();

        MultiValueMap<String, Object> request = new LinkedMultiValueMap<>();
        request.add("sender_name", emailConfiguration.getSenderName());
        request.add("email_to", email);
        request.add("subject", errorSubject);
        request.add("content", content);

        ResponseEntity<GeneralResponse> response = restNotificationServiceClient.sendEmailNotification(payload, request);

        if (baseService.isFailed(this.getClass().getSimpleName(), "sendEmailNotification", response)) {
            throw new IllegalStateException(ResponseMapEnum.ERROR_CONNECTION.getText());
        }
        log.info("Sent error email to email [{}]", email);
    }


    AccountEmailForm createForm(final EXAMPayload payload, AccountFileForm accountFileForm) throws ParseException {

        final Locale localeTh = new Locale("th", "TH");
        final LocalDateTime createdDatetime = accountFileForm.getCreatedDatetime();
        final int createdDay = createdDatetime.getDayOfMonth();
        final String createdMonthNameTh = createdDatetime.getMonth().getDisplayName(TextStyle.FULL, localeTh);
        final String createdMonthNameEn = createdDatetime.getMonth().getDisplayName(TextStyle.FULL, Locale.US);
        final int createdBeYear = ThaiBuddhistDate.from(createdDatetime).get(ChronoField.YEAR);
        final int createdYear = createdDatetime.getYear();
        final String createdDateTh = String.format(CREATE_DATE_FORMAT, createdDay, createdMonthNameTh, createdBeYear);
        final String createdDateEn = String.format(CREATE_DATE_FORMAT, createdDay, createdMonthNameEn, createdYear);

        final int factSheetVersion = this.getDocumentVersion(payload, DocumentTypeEnum.FACT_SHEET, ProductGroupNameEnum.ACCOUNT_OPENING, accountFileForm.getProductId());
        final int termAndConditionVersion = this.getDocumentVersion(payload, DocumentTypeEnum.TERM_AND_CONDITION, ProductGroupNameEnum.ACCOUNT_OPENING, accountFileForm.getProductId());

        return AccountEmailForm.builder()
                .accountId(StringUtil.formatterAccountId(accountFileForm.getAccountId()))
                .accountTypeTh(AccountTypeEnum.SAVING.getDescription())
                .accountTypeEn(AccountTypeEnum.SAVING.getText())
                .email(accountFileForm.getEmail())
                .productId(accountFileForm.getProductId())
                .productNameEn(accountFileForm.getProductNameEn())
                .productNameTh(accountFileForm.getProductNameTh())
                .branchNameTh(fileConfiguration.getAppAccountOpeningBranchNameTh())
                .branchNameEn(fileConfiguration.getAppAccountOpeningBranchNameEn())
                .customerNameTh(accountFileForm.getCustomerNameTh())
                .customerNameEn(accountFileForm.getCustomerNameEn())
                .referenceId(accountFileForm.getReferenceId())
                .createdDateTh(createdDateTh)
                .createdDateEn(createdDateEn)
                .createdTime(accountFileForm.getCreatedTime())
                .factSheetVersion(factSheetVersion)
                .termAndConditionVersion(termAndConditionVersion)
                .titleNameTh(accountFileForm.getTitleNameTh())
                .titleNameEn(accountFileForm.getTitleNameEn())
                .build();
    }

    AccountEmailForm createForm(AccountFileForm accountFileForm, List<LegalDocument> documents) throws ParseException {

        final Locale localeTh = new Locale("th", "TH");
        final LocalDateTime createdDatetime = accountFileForm.getCreatedDatetime();
        final int createdDay = createdDatetime.getDayOfMonth();
        final String createdMonthNameTh = createdDatetime.getMonth().getDisplayName(TextStyle.FULL, localeTh);
        final String createdMonthNameEn = createdDatetime.getMonth().getDisplayName(TextStyle.FULL, Locale.US);
        final int createdBeYear = ThaiBuddhistDate.from(createdDatetime).get(ChronoField.YEAR);
        final int createdYear = createdDatetime.getYear();
        final String createdDateTh = String.format(CREATE_DATE_FORMAT, createdDay, createdMonthNameTh, createdBeYear);
        final String createdDateEn = String.format(CREATE_DATE_FORMAT, createdDay, createdMonthNameEn, createdYear);

        final LegalDocument factSheetProduct = this.getDocument(documents, DocumentTypeEnum.FACT_SHEET, ProductGroupNameEnum.ACCOUNT_OPENING, accountFileForm.getProductId());
        final LegalDocument termProduct = this.getDocument(documents, DocumentTypeEnum.TERM_AND_CONDITION, ProductGroupNameEnum.ACCOUNT_OPENING, accountFileForm.getProductId());

        return AccountEmailForm.builder()
                .accountId(StringUtil.formatterAccountId(accountFileForm.getAccountId()))
                .accountTypeTh(AccountTypeEnum.SAVING.getDescription())
                .accountTypeEn(AccountTypeEnum.SAVING.getText())
                .email(accountFileForm.getEmail())
                .productId(accountFileForm.getProductId())
                .productNameEn(accountFileForm.getProductNameEn())
                .productNameTh(accountFileForm.getProductNameTh())
                .branchNameTh(fileConfiguration.getAppAccountOpeningBranchNameTh())
                .branchNameEn(fileConfiguration.getAppAccountOpeningBranchNameEn())
                .customerNameTh(accountFileForm.getCustomerNameTh())
                .customerNameEn(accountFileForm.getCustomerNameEn())
                .referenceId(accountFileForm.getReferenceId())
                .createdDateTh(createdDateTh)
                .createdDateEn(createdDateEn)
                .createdTime(accountFileForm.getCreatedTime())
                .factSheetProduct(factSheetProduct)
                .termProduct(termProduct)
                .titleNameTh(accountFileForm.getTitleNameTh())
                .titleNameEn(accountFileForm.getTitleNameEn())
                .build();
    }

    private ST getStringTemplate(String templateName) {
        final STGroup group = new STRawGroupDir(TEMPLATE_FOLDER);
        group.delimiterStartChar = '$';
        group.delimiterStopChar = '$';
        return group.getInstanceOf(templateName);
    }

    private Integer getDocumentVersion(final EXAMPayload payload, final DocumentTypeEnum documentTypeEnum, final ProductGroupNameEnum productGroupNameEnum, final String productId) {
        final ProductReferenceEnum productReferenceEnum = ProductReferenceEnum.getEnum(productId);
        GeneralResponse<DocumentListResponse> response = legalDocumentService.searchDocument(payload, documentTypeEnum, productReferenceEnum, productGroupNameEnum);
        return response.getData().getDocumentResponseList().stream().findFirst().orElseThrow(() -> new RuntimeException("Got the empty list of legal document in the response mapping")).getVersion();
    }

    private LegalDocument getDocument(List<LegalDocument> documentList, final DocumentTypeEnum documentTypeEnum, final ProductGroupNameEnum productGroupNameEnum, final String productId) {
        LegalDocument expectedDocument = null;
        for (LegalDocument document : documentList) {
            if (document.getBusinessType().equals("Deposit")
                    && document.getProductGroupName().equals(productGroupNameEnum.getText())
                    && document.getType().equals(documentTypeEnum.getText())
                    && document.getProductReference().equals(productId)) {
                expectedDocument = document;
            }
        }
        if (expectedDocument == null) {
            throw new IllegalArgumentException("Got the empty list of legal document in the response mapping");
        }
        return expectedDocument;


    }
}
