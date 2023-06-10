package com.atguigu.spring6.resourceloader;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;

/**
 * @Description
 * @Author hliu
 * @Date 2023/6/5 20:13
 * @Version 1.0
 */
public class ResourceLoaderDemo {
    @Test
    public void demo1() {
        ApplicationContext context = new ClassPathXmlApplicationContext();
        Resource resource = context.getResource("atguigu.txt");

        System.out.println(resource.getFilename());


    }

    @Test
    public void demo2() {
        ApplicationContext context = new FileSystemXmlApplicationContext();
        Resource resource = context.getResource("atguigu.txt");

        System.out.println(resource.getFilename());
    }
}
