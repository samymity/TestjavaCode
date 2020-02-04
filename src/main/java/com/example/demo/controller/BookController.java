package com.example.demo.controller;


import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.implementation.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    private static final Logger log = LoggerFactory.getLogger(BookController.class);

    @Autowired
    private BookService bookService;

    @Autowired
    BookRepository repository;


    @RequestMapping("/books")
    public ResponseEntity<List<Book>> channels() {

        List<Book> books = (List<Book>) repository.findAll();

        System.out.println("Books are " + books.get(0));

        log.info("Sandeep..");
        List<Book> channels = bookService.getAllBooks();
        return ResponseEntity.ok(channels);
    }


}