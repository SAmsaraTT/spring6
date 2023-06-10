package com.atguigu.spring6.iocxml.auto.controller;

import com.atguigu.spring6.iocxml.auto.service.UserService;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/22 17:44
 * @Version 1.0
 */
public class UserController {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void addUser() {
        System.out.println("controller method has been called......");

        userService.addUserService();
    }
}
