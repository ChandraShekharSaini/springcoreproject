package com.springcore.javanaseconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class ApplicationConfig {

    @Bean
    public Date getCurrentDate() {
        return new Date();
    }



}
