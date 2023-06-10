package com.atguigu.spring6.iocxml.auto.dao;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/22 17:47
 * @Version 1.0
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void addUserDao() {
        System.out.println("userDao method has been called...");
    }
}
