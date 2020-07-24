package com.xue.demo.service.consumer.ribbon.controller;

import com.xue.demo.service.consumer.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 消费者
 * Created by hsh on 2017/12/25.
 */
@RestController
public class HelloControler {


    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        try {
            return helloService.getHello(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
