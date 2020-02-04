package com.example.demo.service.implementation;

import com.example.demo.entity.FisFuelOutageBO;
import com.example.demo.repository.OutageRepository;
import com.example.demo.service.OutageService;
import lombok.NonNull;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j


public class OutageServiceImplementation implements OutageService {


    @NonNull
    private OutageRepository outageRepository;


    @Override
    public List<FisFuelOutageBO> findAll() {
        // TODO Auto-generated method stub
        return outageRepository.findAll();

    }


    @Override
    public FisFuelOutageBO findBysNo(Integer id) {
        // TODO Auto-generated method stub
        return outageRepository.findBysNo(id);
    }






    /*
     * @Override public Channel findOne(String id) { return
     * channelRepository.findOne(id); }
     */

}

