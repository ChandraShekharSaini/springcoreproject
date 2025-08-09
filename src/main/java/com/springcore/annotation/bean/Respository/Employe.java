package com.springcore.annotation.bean.Respository;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;


@Log4j2
@Repository("logic")
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
