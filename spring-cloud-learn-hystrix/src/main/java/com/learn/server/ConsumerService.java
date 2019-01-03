package com.learn.server;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerService {

    private final RestTemplate restTemplate;

    @Autowired
    public ConsumerService(RestTemplate restTemplate){
        this.restTemplate =restTemplate;
    }

    @HystrixCommand(fallbackMethod = "errorMsg")
    public String consumer() {
        // 调用hello-service服务，注意这里用的是服务名，而不是具体的ip+port
        restTemplate.getForObject("http://hello-service/hello", String.class);
        return "hello consumer finish !!!";
    }

    public String errorMsg() {
        return "error!!!";
    }

}
