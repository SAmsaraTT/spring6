package com.atguigu.spring6.iocxml.ditest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/10 17:26
 * @Version 1.0
 */
public class TestEmp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-diarray.xml");

        Emp emp = applicationContext.getBean("emp", Emp.class);

        emp.work();
    }
}
