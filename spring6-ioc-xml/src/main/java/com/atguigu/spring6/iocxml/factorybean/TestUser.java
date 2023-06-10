package com.atguigu.spring6.iocxml.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/18 22:43
 * @Version 1.0
 */
public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-factorybean.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);
    }
}
