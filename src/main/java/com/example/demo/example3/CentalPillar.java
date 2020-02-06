package com.example.demo.example3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CentalPillar {


    String name;


    Pillar pillar;


    public CentalPillar() {

        System.out.println("in central pillar-----------------");

    }


}
