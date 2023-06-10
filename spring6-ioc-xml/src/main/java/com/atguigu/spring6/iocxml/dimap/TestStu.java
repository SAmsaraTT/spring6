package com.atguigu.spring6.iocxml.dimap;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/16 19:03
 * @Version 1.0
 */
public class TestStu {
    @Test
    public void testStu() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-diref.xml");
        Student student = applicationContext.getBean("studentp", Student.class);

        System.out.println(student);
    }
}
