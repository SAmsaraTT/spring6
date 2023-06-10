package com.atguigu.spring6.resource.dao;


import org.springframework.stereotype.Repository;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/23 19:55
 * @Version 1.0
 */
@Repository("myUserDao")
public class UserDaoImpl implements UserDao {

    @Override
    public void add() {
        System.out.println("dao.........");
    }
}
