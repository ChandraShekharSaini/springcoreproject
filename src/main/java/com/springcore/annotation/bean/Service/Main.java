package com.springcore.annotation.bean.Service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.annotation.bean");
        Employe employe = context.getBean("logic", Employe.class);

        employe.display();
    }
}
