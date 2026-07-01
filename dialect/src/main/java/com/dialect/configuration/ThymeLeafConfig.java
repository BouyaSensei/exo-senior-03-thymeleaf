package com.dialect.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dialect.StatusDialect;

@Configuration
public class ThymeLeafConfig {
    @Bean
    public StatusDialect statusdialect() {
        return new StatusDialect();
    }
}
