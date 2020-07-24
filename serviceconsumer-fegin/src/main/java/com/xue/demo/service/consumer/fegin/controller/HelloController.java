package com.xue.demo.service.consumer.fegin.controller;

import com.xue.demo.service.consumer.fegin.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 通过service定义的Feign客户端HelloService 来消费服务
 * Created by hsh on 2017/12/25.
 */
@RestController
public class HelloController {

    @Autowired
    HelloService schedualServiceHi;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
