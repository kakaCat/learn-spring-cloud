//package com.learn.config;
//
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.client.RestTemplate;
//
//@ConfigurationProperties
//public class RestTemplateConfig {
//
//    //@Bean 应用在方法上，用来将方法返回值设为为bean
//    @Bean
//    @LoadBalanced  //@LoadBalanced实现负载均衡
//    public RestTemplate restTemplate() {
//        return new RestTemplate();
//    }
//}
