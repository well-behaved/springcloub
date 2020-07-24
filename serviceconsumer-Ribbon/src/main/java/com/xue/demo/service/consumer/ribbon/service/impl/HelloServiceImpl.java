package com.xue.demo.service.consumer.ribbon.service.impl;

import com.xue.demo.service.consumer.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 服务实现
 * Created by hsh on 2017/12/25.
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String getHello(String name) throws Exception {
        return restTemplate.getForObject("http://SERVICEPROVIDER/hi?name=" + name, String.class);
    }
}
