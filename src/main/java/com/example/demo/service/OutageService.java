package com.example.demo.service;

import com.example.demo.entity.FisFuelOutageBO;

import java.util.List;


public interface OutageService {


    List<FisFuelOutageBO> findAll();

    FisFuelOutageBO findBysNo(Integer id);
}

