package com.xue.demo.service.consumer.ribbon.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.xue.demo.service.consumer.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 消费者
 * Created by hsh on 2017/12/25.
 */
@RestController
public class HelloControler {


    @Autowired
    private HelloService helloService;

    @GetMapping("/getOne/{name}")
    /**
     * 测试hystrix
     *
     * 1、调用远程服务超时后，断路器打开，调用getOneFallBack (如果远程服务挂了，会立马调用getOneFallBack，超时时间不起作用)
     * 2、超时时间为2000毫秒(默认1秒)
     */
    @HystrixCommand(fallbackMethod = "hiFallBack", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000")})
    public String hi(@PathVariable String name) {
        try {
            return helloService.getHello(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 参数跟返回类型必须跟上面的一样，不然会报找不到该方法的错
     */
    public String hiFallBack(String name) {
        return "Hystrix:hiFallBack ";
    }


}
