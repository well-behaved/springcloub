package com.xue.demo.alibaba.provider.mapper;

import com.xue.demo.alibaba.dubbo.api.model.MyProductModel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MyProductMapper {
    @Insert(
            "INSERT INTO `t_product` (`name`, `description`, `price`) VALUES (#{name}, #{description}, #{price})"
    )
    Long insertOne(MyProductModel myProductModel);
}
