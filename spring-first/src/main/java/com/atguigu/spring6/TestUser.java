package com.atguigu.spring6;



import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/4 14:28
 * @Version 1.0
 */
public class TestUser {
    // create the logger Object
   private Logger logger = LoggerFactory.getLogger(TestUser.class);

    @Test
    public void testUserObject() {
        //load the xml
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");

        //get the object
        User user = (User) applicationContext.getBean("user");

        //invoke the method of the object
        user.add();


        logger.info("inovke successfully*********");
    }

    /**
    * @Description: reflection to get the object
    * @Param: []
    * @return: void
    * @Author: hliu
    * @Date: 2023/5/4
    */
    @Test
    public void testUserObject1() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = Class.forName("com.atguigu.spring6.User");

        User user = (User) clazz.getDeclaredConstructor().newInstance();

        System.out.println(user);


    }
}
