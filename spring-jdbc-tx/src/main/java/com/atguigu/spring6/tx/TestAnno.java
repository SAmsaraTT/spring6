package com.atguigu.spring6.tx;

import com.atguigu.spring6.tx.config.SpringConfig;
import com.atguigu.spring6.tx.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description
 * @Author hliu
 * @Date 2023/6/3 21:05
 * @Version 1.0
 */


public class TestAnno {

    @Test
    public void testTxAllAnnotation(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookController accountService = applicationContext.getBean("bookController", BookController.class);
        Integer[] bookIds = {1, 2};
        accountService.checkout(bookIds, 1);
    }
}
