package com.xue.demo.alibaba.dubbo.api.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class MyOrderModel implements Serializable {
    private Long id;
    private Long addressId;
    private Long customerId;
    private Long createTime;
}
