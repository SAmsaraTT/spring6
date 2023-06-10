package com.atguigu.spring6.resource.controller;

import com.atguigu.spring6.resource.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/23 19:52
 * @Version 1.0
 */
@Controller("myUserController")
public class UserController {
//    @Resource(name = "myUserService")
//    private UserService userService;
    @Resource
    private UserService userService;
    public void add() {
        System.out.println("controller.......");
        userService.add();
    }
}
