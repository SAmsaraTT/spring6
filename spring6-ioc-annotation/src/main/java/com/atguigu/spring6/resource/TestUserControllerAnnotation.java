package com.atguigu.spring6.resource;

import com.atguigu.spring6.config.SpringConfig;
import com.atguigu.spring6.resource.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/23 20:02
 * @Version 1.0
 */
public class TestUserControllerAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        UserController bean = applicationContext.getBean(UserController.class);

        bean.add();
    }
}
