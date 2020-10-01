package com.theerut.springj11.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class FileConfiguration {

    @Value("${file.application.folder.path}")
    private String appFolderPath;

    @Value("${file.application.filename}")
    private String appFileName;

    @Value("${file.application.filename.en}")
    private String appFileNameEn;

    @Value("${file.term-condition.filename}")
    private String termFileName;

    @Value("${file.term-condition.filename.en}")
    private String termFileNameEn;

    @Value("${file.fact-sheet.filename}")
    private String factFileName;

    @Value("${file.fact-sheet.filename.en}")
    private String factFileNameEn;

    @Value("${file.application.account.opening.admin.password}")
    private String appAccountOpeningAdminPassword;

    @Value("${file.application.account.opening.branch.name.th}")
    private String appAccountOpeningBranchNameTh;

    @Value("${file.application.account.opening.branch.name.en}")
    private String appAccountOpeningBranchNameEn;

}
