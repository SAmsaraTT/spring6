package com.atguigu.spring6.springi18n;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @Description
 * @Author hliu
 * @Date 2023/6/6 20:33
 * @Version 1.0
 */
public class ResourceI18n {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        var objs = new Object[]{"atguigu", new Date().toString()};
        String val = context.getMessage("www.atguigu.com", objs, Locale.UK);

        System.out.println(val);
    }
}
