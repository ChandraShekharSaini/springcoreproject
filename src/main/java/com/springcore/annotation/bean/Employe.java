package com.springcore.annotation.bean;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;


@Controller("logic")
@Log4j2
public class Employe {

    private String name;
    private int age;

    public Employe() {
        this.name = "Rahul ji EarBuds";
        this.age = 667;
    }

    public  void display() {
        log.info("Name: " + name);
        log.info("Age: " + age);
    }
}
