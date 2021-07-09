package com.xue.demo.springbootdemo.service.impl;

import com.xue.demo.springbootdemo.bean.MyPerson;
import com.xue.demo.springbootdemo.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * @author: xuexiong@souche.com
 * @date: 2021/7/9 10:52
 * @description:
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String hello() {
        return new MyPerson().toString();
    }
}
