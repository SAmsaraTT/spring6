package com.atguigu.spring6.resourceloaderaware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ResourceLoader;

/**
 * @Description
 * @Author hliu
 * @Date 2023/6/5 20:22
 * @Version 1.0
 */
public class TestDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        TestBean testBean = context.getBean("testBean", TestBean.class);

        ResourceLoader resourceLoader = testBean.getResourceLoader();

        System.out.println(context == resourceLoader);
    }
}
