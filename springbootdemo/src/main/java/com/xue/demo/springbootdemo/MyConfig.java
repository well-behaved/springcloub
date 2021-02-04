package com.xue.demo.springbootdemo;

import com.xue.demo.springbootdemo.bean.MyPerson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import java.util.Optional;

/**
 * @author: xuexiong@souche.com
 * @date: 2021/2/2 11:16
 * @description:
 */
@Configuration // 注解将该类声明为一个配置类。
public class MyConfig {
    @Bean(initMethod = "myPersonInit", destroyMethod = "myPersonDestroy") //等同于xml的<bean>
    @Scope//单列or其他
    @Lazy //是否懒加载
    public MyPerson onePerson() {
        return new MyPerson("薛雄", "爱咋咋第");
    }


    @Bean
    @DependsOn("onePerson") // 表示在当前 Bean 创建之前需要先创建特定的其他 Bean
    public MyPerson secondPerson(MyPerson onePerson) {
        MyPerson secondPerson = new MyPerson();
        secondPerson.setName(
                Optional.ofNullable(onePerson)
                        .map(MyPerson::getName)
                        .map(item -> item + "2")
                        .orElse(null)
        );
        secondPerson.setWord(
                Optional.ofNullable(onePerson)
                        .map(MyPerson::getWord)
                        .map(item -> item + "2")
                        .orElse(null)
        );
        return secondPerson;
    }
}
