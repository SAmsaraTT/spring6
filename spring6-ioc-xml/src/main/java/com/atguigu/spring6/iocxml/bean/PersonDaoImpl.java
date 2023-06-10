package com.atguigu.spring6.iocxml.bean;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/5 16:09
 * @Version 1.0
 */
public class PersonDaoImpl implements UserDao {
    @Override
    public void run() {
        System.out.println("Person run........");
    }
}
