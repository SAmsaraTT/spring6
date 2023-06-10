package com.atguigu.spring.aop.xmlaop;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/29 22:03
 * @Version 1.0
 */
public class TestAop {
    @Test
    public void testAdd() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanaop.xml");

        Calculator calculator = context.getBean(Calculator.class);

        calculator.add(4, 3);
    }


}
