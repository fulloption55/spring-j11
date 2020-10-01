package com.theerut.springj11.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class EmailConfiguration {

    @Value("${notification.email.account.opening.sender.name}")
    private String senderName;

    @Value("${notification.email.account.opening.subject}")
    private String subject;

    @Value("${notification.email.account.opening.subject.en}")
    private String subjectEn;

    @Value("${notification.email.account.opening.subject.error}")
    private String subjectError;

    @Value("${notification.email.account.opening.subject.error.en}")
    private String subjectErrorEn;

    @Value("${notification.email.account.opening.bcc.email}")
    private String[] bccEmail;

}
