package com.atguigu.spring6.iocxml.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/18 22:17
 * @Version 1.0
 */
public class TestUser {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-life.xml");

        User user = context.getBean("user", User.class);
        System.out.println("6 the bean has been made!");
        System.out.println(user);

        context.close();
    }
}
