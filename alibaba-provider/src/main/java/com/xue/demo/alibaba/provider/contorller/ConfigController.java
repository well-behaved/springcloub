package com.xue.demo.alibaba.provider.contorller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("config")
// 通过 Spring Cloud 原生注解 @RefreshScope 实现配置自动更新
@RefreshScope
public class ConfigController {
    /**
     * 热更新自动配置
     */
    @Value(value = "${useLocalCache:false}")
    private boolean useLocalCache;

    @RequestMapping(value = "/get", method = POST)
    @ResponseBody
    public boolean get(@RequestParam(required = false) String name) {
        return useLocalCache;
    }
}