package com.xue.demo.alibaba.provider.dubboSpi;

import com.xue.demo.alibaba.dubbo.api.UserApi;
import com.xue.demo.alibaba.dubbo.api.model.UserModel;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

@Slf4j
//旧版本的dubbo使用该包下的@Service直接，后来为了防止与spring混淆改为了@DubboService。
@DubboService
public class UserApiImpl implements UserApi {
    @Override
    public UserModel getUser(Long userId) {
        log.info("UserApiImpl getUser:{}", userId);
        UserModel userModel = new UserModel();
        userModel.setName("123123123");
        userModel.setUserId(1L);
        return userModel;
    }
}
