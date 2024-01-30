package com.xue.demo.alibaba.consumer.contorller;

import com.xue.demo.alibaba.consumer.spi.HelloSpi;
import com.xue.demo.alibaba.dubbo.api.UserApi;
import com.xue.demo.alibaba.dubbo.api.model.UserModel;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("config")
// 通过 Spring Cloud 原生注解 @RefreshScope 实现配置自动更新
@RefreshScope
public class ConfigController {
    @DubboReference
    private UserApi userApi;
    @Autowired
    private HelloSpi helloSpi;
    /**
     * 热更新自动配置
     */
    @Value(value = "${useLocalCache:false}")
    private boolean useLocalCache;

    @RequestMapping(value = "/get", method = GET)
    @ResponseBody
    public boolean get() {
        return useLocalCache;
    }

    @RequestMapping(value = "/get2", method = GET)
    @ResponseBody
    public String getHello(String name) {
        return helloSpi.getHello(name);
    }

    @RequestMapping(value = "/getUser", method = GET)
    @ResponseBody
    public UserModel getUser(Long userId){
        return userApi.getUser(userId);
    }
}