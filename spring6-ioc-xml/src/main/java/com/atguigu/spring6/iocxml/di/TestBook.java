package com.atguigu.spring6.iocxml.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/5 16:19
 * @Version 1.0
 */
public class TestBook {
    @Test
    public void testSetter() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = applicationContext.getBean("book", Book.class);

        System.out.println(book);
    }

    @Test
    public void testConstructor() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = applicationContext.getBean("bookCon", Book.class);

        System.out.println(book);
    }
}
