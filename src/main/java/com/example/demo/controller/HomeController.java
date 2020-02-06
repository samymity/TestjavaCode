package com.example.demo.controller;


import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.implementation.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class HomeController {

    private static final Logger log = LoggerFactory.getLogger(HomeController.class);


    @RequestMapping("home")
    public String home() {


        System.out.println("Books are ");

        return "home.jsp";
    }


}