package com.xue.demo.alibaba.dubbo.api.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class UserModel implements Serializable {
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 用户姓名
     */
    private String name;
}
