package com.theerut.springj11.service;

import com.theerut.springj11.annotation.LogTime;
import com.theerut.springj11.config.FileConfiguration;
import com.theerut.springj11.constant.AccountTypeEnum;
import com.theerut.springj11.service.model.AccountEmailForm;
import com.theerut.springj11.service.model.AccountFileForm;
import com.theerut.springj11.service.model.AccountOpening;
import com.theerut.springj11.service.model.Contact;
import com.theerut.springj11.service.model.LegalDocument;
import com.theerut.springj11.service.model.Product;
import com.theerut.springj11.service.model.Profile;
import com.theerut.springj11.service.model.ProfileAddress;
import com.theerut.springj11.utils.EXAMPayload;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerFontProvider;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STRawGroupDir;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.chrono.ThaiBuddhistChronology;
import java.time.chrono.ThaiBuddhistDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class DocumentFormService {
    private static final String FILE_ENCRYPTION_PATTERN = "ddMMMyyyy";
    private static final String FILE_TYPE_PDF = "pdf";
    private static final String TEMPLATE_NAME_ACCOUNT_OPENING = "etb_app_form";
    private static final String FILENAME_PATTERN_ACCOUNT_OPENING = "UID_%s.%s";
    private static final String FOLDERNAME_PATTERN_ACCOUNT_OPENING = "REF_%s";
    private static final String TEMPLATE_FOLDER = "form_templates";

    private final FileConfiguration fileConfiguration;
    private final NotificationService notificationService;

    @LogTime
    @Async("threadPoolTaskExecutor")
    public void exportFile(EXAMPayload payload, AccountFileForm formParameter, Product product) {
        log.info("payload = [{}]", payload);
        exportFile(payload, formParameter, product, Collections.emptyList());
    }

    @LogTime
    @Async("threadPoolTaskExecutor")
    public void exportFile(EXAMPayload payload, AccountFileForm formParameter, Product product, List<LegalDocument> documents) {
        String referenceId = formParameter.getReferenceId();
        try {
            log.info("======  Start Async task to export account opening application file for reference ID [{}]", referenceId);
            formParameter.setProductNameTh(product.getLocalName());
            formParameter.setProductNameEn(product.getName());
            final String applicationFileName = this.generateApplicationPDF(formParameter);
            AccountEmailForm emailForm;
            if (documents.isEmpty()) {
                emailForm = notificationService.createForm(payload, formParameter);
            } else {
                emailForm = notificationService.createForm(formParameter, documents);
            }
            notificationService.sendEmailAccountSaving(payload, applicationFileName, emailForm);
        } catch (ParseException | IOException e) {
            log.error("Error {}", e.toString());
        } finally {
            log.info("======  End Async task to export account opening application file for reference ID [{}]", referenceId);
        }
    }


    public String generateApplicationPDF(AccountFileForm formParameter) {
        log.info("Generating account opening application file as PDF for reference ID [{}]", formParameter.getReferenceId());
        try {
            final String adminPassword = fileConfiguration.getAppAccountOpeningAdminPassword();
            final String userPassword = formParameter.getBirthDate().format(DateTimeFormatter.ofPattern(FILE_ENCRYPTION_PATTERN));

            ST page = this.getStringTemplate();

            if (formParameter.isRequestDebit()) {
                formParameter.setDisplayCheckBoxDebit("&#9745;");
            }else{
                formParameter.setDisplayCheckBoxDebit("&#9744;");
            }

            page.add("form", formParameter);


            String content = page.render();
            final HtmlCleaner htmlCleaner = new HtmlCleaner();
            final TagNode tagNode = htmlCleaner.clean(content);
            content = htmlCleaner.getInnerHtml(tagNode);
            Document document = new Document(PageSize.A4);

            final String fileName = String.format(FILENAME_PATTERN_ACCOUNT_OPENING, formParameter.getUserId(), FILE_TYPE_PDF);
            Path folderPath = Paths.get(fileConfiguration.getAppFolderPath(), String.format(FOLDERNAME_PATTERN_ACCOUNT_OPENING, formParameter.getReferenceId()));
            this.createDirectory(folderPath);
            Path filePath = Paths.get(folderPath.toString(), fileName);

            final PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(filePath.toString()));
            writer.setEncryption(userPassword.getBytes(), adminPassword.getBytes(), PdfWriter.ALLOW_PRINTING, PdfWriter.ENCRYPTION_AES_256);

            document.open();
            XMLWorkerFontProvider fontImp = new XMLWorkerFontProvider(XMLWorkerFontProvider.DONTLOOKFORFONTS);
            fontImp.register("fonts/DejavuSans.ttf");
            fontImp.register("fonts/Cordia.ttf");
            FontFactory.setFontImp(fontImp);
            InputStream is = new ByteArrayInputStream(content.getBytes());
            XMLWorkerHelper.getInstance().parseXHtml(writer, document, is, null, StandardCharsets.UTF_8, fontImp);
            document.close();
            return fileName;
        } catch (final IOException | DocumentException e) {
            log.info("Error [{}]", e.toString());
            throw new IllegalStateException("Error while generate file");
        }
    }

    private ST getStringTemplate() {
        final STGroup group = new STRawGroupDir(TEMPLATE_FOLDER);
        group.delimiterStartChar = '$';
        group.delimiterStopChar = '$';
        return group.getInstanceOf(DocumentFormService.TEMPLATE_NAME_ACCOUNT_OPENING);
    }

    private void createDirectory(Path path) {
        if (!path.toFile().exists()) {
            try {
                log.info("Directory does not existed, create new directories [{}]", path.toString());
                Files.createDirectories(path);
            } catch (IOException e) {
                throw new RuntimeException("Could not create directory " + path.toString() + ". Please try again!", e);
            }
        }
    }

    public AccountFileForm createForm(String purposeName, AccountOpening accountOpening, Profile profile) {
        log.info("Creating parameters of account opening application for reference ID [{}]", accountOpening.getReferenceId());

        final Locale localeTh = new Locale("th", "TH");
        final ProfileAddress registerAddress = Optional.ofNullable(profile.getRegisterAddress()).orElseGet(ProfileAddress::new);
        final ProfileAddress mailingAddress = Optional.ofNullable(profile.getMailingAddress()).orElseGet(ProfileAddress::new);
        final ProfileAddress officeAddress = Optional.ofNullable(profile.getOfficeAddress()).orElseGet(ProfileAddress::new);
        final Contact homePhone = Optional.ofNullable(profile.getPhone()).orElseGet(Contact::new);
        final Contact officePhone = Optional.ofNullable(profile.getOfficePhone()).orElseGet(Contact::new);

        final LocalDateTime createdDatetime = accountOpening.getCreatedDatetime();
        final int createdDay = createdDatetime.getDayOfMonth();
        final String createdMonthName = createdDatetime.getMonth().getDisplayName(TextStyle.FULL, localeTh);
        final int createdBeYear = ThaiBuddhistDate.from(createdDatetime).get(ChronoField.YEAR);
        final LocalTime createdTime = createdDatetime.toLocalTime();

        final ThaiBuddhistDate birthDateBe = this.getBuddhistDate(profile.getDateOfBirth());
        final LocalDate birthDateIso = LocalDate.from(birthDateBe);
        final int birthDay = birthDateBe.get(ChronoField.DAY_OF_MONTH);
        final String birthMonthName = Month.of(birthDateBe.get(ChronoField.MONTH_OF_YEAR)).getDisplayName(TextStyle.FULL, localeTh);
        final int birthBeYear = ThaiBuddhistDate.from(birthDateBe).get(ChronoField.YEAR);

        return AccountFileForm.builder()
                .accountId(accountOpening.getId())
                .userId(accountOpening.getUserId())
                .referenceId(accountOpening.getReferenceId())
                .createdDatetime(createdDatetime)
                .createdDay(createdDay)
                .createdMonth(createdMonthName)
                .createdYear(createdBeYear)

                .purposeName(purposeName)
                .productId(accountOpening.getProductId())
                .productNameTh(accountOpening.getProductDescription())
                .accountTypeName(AccountTypeEnum.getEnum(accountOpening.getType()).getDescription())
                .branchName(fileConfiguration.getAppAccountOpeningBranchNameTh())
                .personalId(profile.getIdNumber())
                .titleNameTh(profile.getTitleNameTh())
                .titleNameEn(profile.getTitleNameEn())
                .customerNameTh(profile.getFullNameTh())
                .customerNameEn(profile.getFullNameEn())
                .birthDateBe(String.format("%d %s %d", birthDay, birthMonthName, birthBeYear))
                .birthDate(birthDateIso)
                .nationality(profile.getNationalityName())
                .gender(profile.getGenderName())

                .mobile(profile.getMobile().getDetail())
                .email(profile.getEmail().getDetail())

                .rAddressHomeNumber(registerAddress.getHomeNumber())
                .rAddressRoomNumber("")
                .rAddressFloor("")
                .rAddressVillageBuilding("")
                .rAddressMoo("")
                .rAddressSoi("")
                .rAddressRoad(registerAddress.getRoad())
                .rAddressSubDistrict(registerAddress.getSubDistrictNameTh())
                .rAddressDistrict(registerAddress.getDistrictNameTh())
                .rAddressProvince(registerAddress.getStateProvinceNameTh())
                .rAddressPostCode(registerAddress.getPostalCode())
                .homePhone(homePhone.getDetail())

                .mAddressHomeNumber(mailingAddress.getHomeNumber())
                .mAddressRoomNumber("")
                .mAddressFloor("")
                .mAddressVillageBuilding("")
                .mAddressMoo("")
                .mAddressSoi("")
                .mAddressRoad(mailingAddress.getRoad())
                .mAddressSubDistrict(mailingAddress.getSubDistrictNameTh())
                .mAddressDistrict(mailingAddress.getDistrictNameTh())
                .mAddressProvince(mailingAddress.getStateProvinceNameTh())
                .mAddressPostCode(mailingAddress.getPostalCode())

                .occupationName(profile.getOccupationName())
                .businessTypeName(profile.getSectorCode())
                .companyName(profile.getEmployerName())
                .oAddressHomeNumber(officeAddress.getHomeNumber())
                .oAddressRoomNumber("")
                .oAddressFloor("")
                .oAddressVillageBuilding("")
                .oAddressMoo("")
                .oAddressSoi("")
                .oAddressRoad(officeAddress.getRoad())
                .oAddressSubDistrict(officeAddress.getSubDistrictNameTh())
                .oAddressDistrict(officeAddress.getDistrictNameTh())
                .oAddressProvince(officeAddress.getStateProvinceNameTh())
                .oAddressPostCode(officeAddress.getPostalCode())
                .officePhone(officePhone.getDetail())
                .createdTime(createdTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")))

                .requestDebit(false)

                .build();
    }

    private ThaiBuddhistDate getBuddhistDate(String yyyyMMdd) {
        final int birthYear = Integer.parseInt(yyyyMMdd.substring(0, 4));
        final int birthMonth = Integer.parseInt(yyyyMMdd.substring(4, 6));
        final int birthDayOfMonth = Integer.parseInt(yyyyMMdd.substring(6, 8));
        return ThaiBuddhistChronology.INSTANCE.date(birthYear, birthMonth, birthDayOfMonth);
    }
}
