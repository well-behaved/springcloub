package com.xue.demo.spring.securit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: xuexiong@souche.com
 * @date: 2021/2/1 18:01
 * @description: 启动类
 */
//关闭spring securit
//@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@SpringBootApplication
public class SpringSecuritDemo {
    public static void main(String[] args) {
        SpringApplication.run(SpringSecuritDemo.class, args);
    }
}
