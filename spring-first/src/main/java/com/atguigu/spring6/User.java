package com.atguigu.spring6;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/4 14:25
 * @Version 1.0
 */
public class User {
    private String name;

    private Person person;

    // none constructor
    public User() {
        System.out.println("0: none constructor");
    }

    public void add() {
        System.out.println("add.......");
    }
}
