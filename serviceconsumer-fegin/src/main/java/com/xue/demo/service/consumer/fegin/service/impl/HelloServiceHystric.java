package com.xue.demo.service.consumer.fegin.service.impl;

import com.xue.demo.service.consumer.fegin.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author: xuexiong@souche.com
 * @date: 2020-07-24 17:28
 * @description:
 */
@Service
public class HelloServiceHystric implements HelloService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "HelloServiceHystric sayHiFromClientOne";
    }
}
