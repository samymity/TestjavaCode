package com.example.demo.controller;


import com.example.demo.service.OutageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OutageController {

    @Autowired
    OutageService outageService;

    @RequestMapping("/Outage")
    public int greeting(@RequestParam(value = "OutageRegion", defaultValue = "US") String name) {
        return new Integer("3000");

    }

    /*
     * @RequestMapping("/Outage1") public ResponseEntity<List<FisFuelOutageBO>>
     * channels() { List<FisFuelOutageBO> channels = outageService.findAll(); return
     * ResponseEntity.ok(channels); }
     */


}