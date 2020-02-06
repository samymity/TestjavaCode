package com.example.demo.example3;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Pillar {

    public Pillar() {

        this.name = "name";
        System.out.println(" Pillar Object Created-----------------------------------------------------");
    }

    String name;


    public void f1() {
        System.out.println("Hello");
    }


}
