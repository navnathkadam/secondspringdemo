package com.edusol.secondspringdemo.controller;

import com.edusol.secondspringdemo.dto.Customer;
import com.edusol.secondspringdemo.servive.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController("/edu")
@RequestMapping
@Slf4j
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/get")
    public List<Customer> Helloworld() {
        log.info("Inside get mapping");

        
        return testService.getHelloworld();
    }
    
}
