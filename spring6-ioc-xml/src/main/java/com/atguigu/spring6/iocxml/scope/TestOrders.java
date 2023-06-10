package com.atguigu.spring6.iocxml.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/17 22:22
 * @Version 1.0
 */
public class TestOrders {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-scope.xml");
        Orders orders = context.getBean("orders", Orders.class);

        System.out.println(orders);

        Orders orders1 = context.getBean("orders", Orders.class);

        System.out.println(orders1);
    }
}
