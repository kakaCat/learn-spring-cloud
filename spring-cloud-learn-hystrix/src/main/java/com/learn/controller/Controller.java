package com.learn.controller;

import com.learn.server.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {


    private final ConsumerService consumerService;

    @Autowired
    public Controller(ConsumerService consumerService){
        this.consumerService = consumerService;
    }



    @RequestMapping("/hello-consumer")
    public String helloConsumer() {
        return consumerService.consumer();
    }



}
