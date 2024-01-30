package com.xue.demo.alibaba.consumer.contorller;

import com.xue.demo.alibaba.consumer.service.MyOrderService;
import com.xue.demo.alibaba.dubbo.api.MyProductApi;
import com.xue.demo.alibaba.dubbo.api.UserApi;
import com.xue.demo.alibaba.dubbo.api.model.MyOrderModel;
import com.xue.demo.alibaba.dubbo.api.model.MyProductModel;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("transaction")
public class TransactionController {
    @Autowired
    private MyOrderService myOrderService;
    @DubboReference
    private MyProductApi myProductApi;
    @RequestMapping(value = "/get", method = GET)
    public String success(Long demoId){
        MyOrderModel oneOrder = new MyOrderModel();
        oneOrder.setAddressId(demoId);
        oneOrder.setCustomerId(demoId);
        oneOrder.setCreateTime(demoId+100);
        myOrderService.insertOne(oneOrder);
        MyProductModel oneProduct =  new MyProductModel();
        oneProduct.setPrice(demoId);
        oneProduct.setDescription("asdfadfasdf");
        oneProduct.setName("asdfasdf");
        myProductApi.insertOne(oneProduct);
        return "success";

    }

}
