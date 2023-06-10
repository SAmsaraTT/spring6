package com.atguigu.spring6.iocxml.auto.service;

import com.atguigu.spring6.iocxml.auto.dao.UserDao;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/22 17:46
 * @Version 1.0
 */
public class UserServiceImpl implements UserService{
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUserService() {
        System.out.println("userService method have been called.....");
        userDao.addUserDao();
    }
}
