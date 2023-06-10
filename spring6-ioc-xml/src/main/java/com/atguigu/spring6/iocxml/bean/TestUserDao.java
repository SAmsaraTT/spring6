package com.atguigu.spring6.iocxml.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/5 16:06
 * @Version 1.0
 */
public class TestUserDao {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        // get the bean by type

        UserDao bean = applicationContext.getBean("personDaoImpl", UserDao.class);
        System.out.println(bean);
        bean.run();
    }
}
