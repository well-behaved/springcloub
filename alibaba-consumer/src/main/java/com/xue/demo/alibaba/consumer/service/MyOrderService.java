package com.xue.demo.alibaba.consumer.service;

import com.xue.demo.alibaba.dubbo.api.model.MyOrderModel;

public interface MyOrderService {
    Long insertOne(MyOrderModel myOrderModel);

}
