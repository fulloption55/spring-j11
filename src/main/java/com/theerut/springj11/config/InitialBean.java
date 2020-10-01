package com.theerut.springj11.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitialBean {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
