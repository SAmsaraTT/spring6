package com.atguigu.spring6.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/22 19:35
 * @Version 1.0
 */
public class TestUser {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");

        User bean = applicationContext.getBean("user", User.class);

        System.out.println(bean);
    }
}
