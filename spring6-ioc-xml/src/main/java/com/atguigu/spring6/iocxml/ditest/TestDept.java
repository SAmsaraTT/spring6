package com.atguigu.spring6.iocxml.ditest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description \
 * @Author hliu
 * @Date 2023/5/16 18:45
 * @Version 1.0
 */
public class TestDept {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-dilist.xml");
        Dept dept = applicationContext.getBean("dept", Dept.class);

        dept.info();
    }

}
