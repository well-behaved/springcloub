package com.xue.demo.spring.securit.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity//开启Spring Security的功能
public class SecurityMemoryConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        /*
        通过内存创建用户名和密码
         */
        auth.inMemoryAuthentication()
                .withUser("user")
                // 通过注入获取编码器
                .password(passwordEncoder.encode("123456"))
                .roles();
        auth.inMemoryAuthentication()
                .withUser("admin")
                //指定编码器
                .password(new BCryptPasswordEncoder().encode("123456"))
                .roles();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        //SpringSecurity 提供的一种编码器，我们也可以自己实现PasswordEncoder
        return new BCryptPasswordEncoder();
    }
}
