package com.atguigu.spring6.iocxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/5 11:38
 * @Version 1.0
 */
public class TestUser {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");

        // get the bean
        User user = (User) applicationContext.getBean("user");

        System.out.println("id: " + user);

        // get the bean by type;

        User user1 = applicationContext.getBean(User.class);

        System.out.println("type: " + user1);

        // get the bean by id and type

        User user2 = applicationContext.getBean("user", User.class);
        System.out.println("id and type: " + user2);
    }
}
