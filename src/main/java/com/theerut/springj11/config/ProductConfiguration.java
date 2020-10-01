package com.theerut.springj11.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class ProductConfiguration {

    @Value("${feature.account-opening.products.allow}")
    private String[] allowAccountOpeningProductList;

}
