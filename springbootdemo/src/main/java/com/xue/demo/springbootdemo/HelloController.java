package com.xue.demo.springbootdemo;

import com.xue.demo.springbootdemo.bean.MyPerson;
import com.xue.demo.springbootdemo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private DemoService demoService;

    @GetMapping("/hello123")
    public String hello() {
        return demoService.hello();
    }
}