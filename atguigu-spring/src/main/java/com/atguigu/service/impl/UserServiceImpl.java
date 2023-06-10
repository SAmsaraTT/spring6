package com.atguigu.service.impl;

import com.atguigu.anno.Bean;
import com.atguigu.anno.Di;
import com.atguigu.dao.UserDao;
import com.atguigu.service.UserService;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/25 20:36
 * @Version 1.0
 */
@Bean
public class UserServiceImpl implements UserService {

    @Di
    private UserDao userDao;
    @Override
    public void add() {
        System.out.println("service........");
        userDao.add();
    }
}
