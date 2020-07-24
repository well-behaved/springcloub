package com.xue.demo.service.consumer.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker //开启断路器
public class ServiceconsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceconsumerApplication.class, args);
    }

    //注入restTemplate
    @Bean
    //开启负载均衡
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
