package com.xue.demo.alibaba.dubbo.api;


import com.xue.demo.alibaba.dubbo.api.model.UserModel;

/**
 * 用户服务
 */
public interface UserApi {
    /**
     * 获取用户
     *
     * @param userId
     * @return
     */
    UserModel getUser(Long userId);
}
