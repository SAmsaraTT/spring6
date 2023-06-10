package com.atguigu.spring6.autowired;

import com.atguigu.spring6.autowired.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/23 20:02
 * @Version 1.0
 */
public class TestUserController {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");

        UserController bean = applicationContext.getBean(UserController.class);

        bean.add();
    }
}
