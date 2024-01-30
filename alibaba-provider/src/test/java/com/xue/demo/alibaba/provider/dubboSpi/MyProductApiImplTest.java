package com.xue.demo.alibaba.provider.dubboSpi;

import com.xue.demo.alibaba.dubbo.api.model.MyProductModel;
import com.xue.demo.alibaba.provider.Application;
import com.xue.demo.alibaba.provider.mapper.MyProductMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class MyProductApiImplTest {
    @Autowired
    private MyProductMapper myProductMapper;
    @Test
    public void insertOne(){
        MyProductModel demo = new MyProductModel();
        demo.setDescription("asdfasdf");
        demo.setName("asdfasdfasdfsad");
        demo.setPrice(12L);
        myProductMapper.insertOne(demo);
    }


}