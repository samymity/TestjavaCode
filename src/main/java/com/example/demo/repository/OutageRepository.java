package com.example.demo.repository;

import com.example.demo.entity.FisFuelOutageBO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OutageRepository extends JpaRepository<FisFuelOutageBO, Integer> {


    FisFuelOutageBO findBysNo(Integer sNo);

    @Override
    List<FisFuelOutageBO> findAll();


}
