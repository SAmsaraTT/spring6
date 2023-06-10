package com.atguigu.spring6.autowired.controller;

import com.atguigu.spring6.autowired.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/23 19:52
 * @Version 1.0
 */
@Controller
public class UserController {
// method 1
//    @Autowired
//    private UserService userService;
    // method 2 set
//    private UserService userService;
//
//    @Autowired
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }

    // method 3 constructor

//    private UserService userService;
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }

    //method 4 params
//    private UserService userService;
//
//
//    public UserController(@Autowired UserService userService) {
//        this.userService = userService;
//    }

    //method 5
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void add() {
        System.out.println("controller.......");
        userService.add();
    }
}
