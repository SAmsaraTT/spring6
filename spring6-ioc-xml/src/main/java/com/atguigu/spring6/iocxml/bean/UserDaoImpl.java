package com.atguigu.spring6.iocxml.bean;

import com.atguigu.spring6.iocxml.User;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/5 16:04
 * @Version 1.0
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void run() {
        System.out.println("run........");
    }
}
