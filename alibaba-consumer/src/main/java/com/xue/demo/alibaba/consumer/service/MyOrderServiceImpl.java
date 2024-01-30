package com.xue.demo.alibaba.consumer.service;

import com.xue.demo.alibaba.consumer.mapper.MyOrderMapper;
import com.xue.demo.alibaba.dubbo.api.model.MyOrderModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MyOrderServiceImpl implements MyOrderService {
    @Autowired
    private MyOrderMapper myOrderMapper;

    public Long insertOne(MyOrderModel myOrderModel) {
        return myOrderMapper.insertOne(myOrderModel);
    }
}
