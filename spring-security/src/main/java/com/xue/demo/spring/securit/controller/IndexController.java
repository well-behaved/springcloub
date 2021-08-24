package com.xue.demo.spring.securit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping("/index")
    public String index() {
        return "111123123Hello World ~";
    }
}