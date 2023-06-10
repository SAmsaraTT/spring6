package com.atguigu.spring6.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author hliu
 * @Date 2023/6/5 20:28
 * @Version 1.0
 */
public class TestBean {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ResourceBean resourceBean = context.getBean(ResourceBean.class);

        resourceBean.parse();
    }
}
