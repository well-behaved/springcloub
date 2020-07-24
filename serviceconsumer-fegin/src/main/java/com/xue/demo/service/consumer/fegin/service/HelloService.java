package com.xue.demo.service.consumer.fegin.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 通过@ FeignClient（“服务名”），来指定调用哪个服务
 * Created by hsh on 2017/12/25.
 */
@FeignClient(value = "serviceprovider")
public interface HelloService {

    /**
     * 匹配提供者对应的服务
     */
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
