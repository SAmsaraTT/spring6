package com.atguigu.dao.impl;

import com.atguigu.anno.Bean;
import com.atguigu.dao.UserDao;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/25 20:37
 * @Version 1.0
 */
@Bean
public class UserDaoImpl implements UserDao {

    @Override
    public void add() {
        System.out.println("dao.......");
    }
}
