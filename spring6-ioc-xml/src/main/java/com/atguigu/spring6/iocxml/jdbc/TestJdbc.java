package com.atguigu.spring6.iocxml.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/17 22:08
 * @Version 1.0
 */
public class TestJdbc {
    @Test
    public void demo1() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring?serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("soul990719");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
    }

    @Test
    public void demo2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-jdbc.xml");
        DruidDataSource dataSource = applicationContext.getBean(DruidDataSource.class);
        System.out.println(dataSource.getUrl());
    }
}
