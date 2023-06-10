package com.atguigu.spring6.iocxml.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.cglib.proxy.Factory;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/18 22:40
 * @Version 1.0
 */
public class MyFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
