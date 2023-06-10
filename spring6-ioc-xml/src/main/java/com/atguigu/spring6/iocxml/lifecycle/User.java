package com.atguigu.spring6.iocxml.lifecycle;/**
 * @Description
 * @Author hliu
 * @Date 2023/5/18 22:09
 * @Version 1.0
 */
public class User {
    private String name;

    public User() {
        System.out.println("1 get the object by using none constructor");
    }

    /**
     * init method
     */
    public void initMethod() {
        System.out.println("4 invoke the init method");
    }

    /**
     * destroy method
     */
    public void destroyMethod() {
        System.out.println("5 destroy the bean");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("2 set the value of the fields in bean");
        this.name = name;
    }
}
