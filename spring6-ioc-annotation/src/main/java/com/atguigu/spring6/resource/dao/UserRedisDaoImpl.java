package com.atguigu.spring6.resource.dao;

import org.springframework.stereotype.Repository;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/23 20:14
 * @Version 1.0
 */
@Repository("myUserRedisDaoImpl")
public class UserRedisDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao redis.........");
    }
}
