package com.springcore.annotation.bean;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component("employe")
@Log4j2
public class Employe {

    private String name;
    private int age;

    public Employe() {
        this.name = "Chandra878";
        this.age = 9770;
    }

    public  void display() {
        log.info("Name: " + name);
        log.info("Age: " + age);
    }
}
