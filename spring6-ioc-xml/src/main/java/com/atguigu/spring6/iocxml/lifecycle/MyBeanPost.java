package com.atguigu.spring6.iocxml.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/18 22:21
 * @Version 1.0
 */
public class MyBeanPost implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("3 postProcessBeforeInitialization");
        System.out.println(beanName + " :: " + bean);
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("5 postProcessAfterInitialization");
        System.out.println(beanName + " :: " + bean);
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
