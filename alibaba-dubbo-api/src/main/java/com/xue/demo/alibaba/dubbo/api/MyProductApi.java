package com.xue.demo.alibaba.dubbo.api;

import com.xue.demo.alibaba.dubbo.api.model.MyProductModel;

public interface MyProductApi {
    /**
     * 插入一条
     *
     * @param myProductModel
     * @return
     */
    Long insertOne(MyProductModel myProductModel);
}
