package com.atguigu.spring6.iocxml.auto;

import com.atguigu.spring6.iocxml.auto.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/22 17:59
 * @Version 1.0
 */
public class TestUser {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-auto.xml");

        UserController userController = applicationContext.getBean("userController", UserController.class);

        userController.addUser();
    }
}
