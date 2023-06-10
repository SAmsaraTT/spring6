package com.atguigu;

import com.atguigu.bean.AnnotationApplicationContext;
import com.atguigu.bean.ApplicationContext;
import com.atguigu.service.UserService;
import com.atguigu.service.impl.UserServiceImpl;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/26 21:26
 * @Version 1.0
 */
public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationApplicationContext("com.atguigu");
        UserService userService = (UserService) context.getBean(UserService.class);
        userService.add();
    }
}
