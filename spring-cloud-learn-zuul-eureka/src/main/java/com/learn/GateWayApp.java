package com.learn;


import com.learn.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class GateWayApp {
    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
    public static void main(String[] args) {
        SpringApplication.run(GateWayApp.class, args);
    }
}
