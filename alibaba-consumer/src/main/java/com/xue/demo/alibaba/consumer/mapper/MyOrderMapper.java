package com.xue.demo.alibaba.consumer.mapper;

import com.xue.demo.alibaba.dubbo.api.model.MyOrderModel;
import com.xue.demo.alibaba.dubbo.api.model.MyProductModel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MyOrderMapper {
    @Insert(
            "INSERT INTO `t_order` (`address_id`, `customer_id`, `create_time`) VALUES (#{addressId}, #{customerId}, #{createTime})"
    )
    Long insertOne(MyOrderModel myOrderModel);

}
