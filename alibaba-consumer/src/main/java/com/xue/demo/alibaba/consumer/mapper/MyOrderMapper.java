package com.xue.demo.alibaba.consumer.mapper;

import com.xue.demo.alibaba.dubbo.api.model.MyOrderModel;
import com.xue.demo.alibaba.dubbo.api.model.MyProductModel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MyOrderMapper {
    @Insert(
            "INSERT INTO `t_product` (`address_id`, `customer_id`, `create_time`) VALUES (#{address_id}, #{customer_id}, #{create_time})"
    )
    Long insertOne(MyOrderModel myOrderModel);

}
