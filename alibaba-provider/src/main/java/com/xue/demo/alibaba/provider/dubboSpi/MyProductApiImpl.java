package com.xue.demo.alibaba.provider.dubboSpi;

import com.xue.demo.alibaba.dubbo.api.MyProductApi;
import com.xue.demo.alibaba.dubbo.api.model.MyProductModel;
import com.xue.demo.alibaba.provider.mapper.MyProductMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

@DubboService
@Slf4j
public class MyProductApiImpl implements MyProductApi {
    @Autowired
    private MyProductMapper myProductMapper;
    @Override
    public Long insertOne(MyProductModel myProductModel) {
        return myProductMapper.insertOne(myProductModel);
    }
}
