package com.springcore.javanaseconfiguration;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

@Log4j2
public class Mian {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.javanaseconfiguration");
        Date currentDate = context.getBean("getCurrentDate", Date.class);

         log.info("I am Good");
        log.info("Current---- Date:", currentDate);
    }
}
