package com.xue.demo.alibaba.dubbo.api.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class MyProductModel implements Serializable {
    private Long id;
    private String name;
    private String description;
    private Long price;
}
