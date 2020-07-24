package com.xue.demo.service.consumer.ribbon.service;

/**
 * 服务接口
 * Created by hsh on 2017/12/25.
 */
public interface HelloService {

    /**
     * 获取service服务
     */
    String getHello(String name) throws Exception;
}
