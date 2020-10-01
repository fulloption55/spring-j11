package com.theerut.springj11.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class SmsConfiguration {

    @Value("${notification.open.account.success.template.id}")
    private int notificationOpenAccountSuccessTemplateId;

    @Value("${notification.open.account.failed.template.id}")
    private int notificationOpenAccountFailedTemplateId;
}
