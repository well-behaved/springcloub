package com.xue.demo.alibaba.consumer.service;

import com.xue.demo.alibaba.consumer.Application;
import com.xue.demo.alibaba.dubbo.api.model.MyOrderModel;
import com.xue.demo.alibaba.dubbo.api.model.MyProductModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class MyOrderServiceImplTest {
    @Autowired
    private MyOrderService myOrderService;
    @Test
    public void insertOne(){
        MyOrderModel demo = new MyOrderModel();
        demo.setCreateTime(123123123L);
        demo.setCustomerId(12937L);
        demo.setAddressId(1232L);
        myOrderService.insertOne(demo);
    }

}