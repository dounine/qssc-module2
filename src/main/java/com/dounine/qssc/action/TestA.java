package com.dounine.qssc.action;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestA {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/")
    public String aa(){
        return restTemplate.getForObject("http://qssc-module1/test",String.class);
    }
}
