package com.xue.demo.alibaba.consumer.spi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 远程调用
 */
@FeignClient("alibaba-provider")
public interface HelloSpi {

    /**
     * 获取service服务
     */
    @GetMapping(value = "/config/get" )
    String getHello(String name);
}
