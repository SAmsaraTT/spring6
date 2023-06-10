package com.atguigu.spring6.xmltx;

import com.atguigu.spring6.xmltx.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @Description
 * @Author hliu
 * @Date 2023/6/2 22:26
 * @Version 1.0
 */
@SpringJUnitConfig(locations = "classpath:beans-xml.xml")
public class TestBookTx {
    @Autowired
    private BookController bookController;

    @Test
    public void testBuyBook() {
        bookController.buyBook(1, 1);
    }
}
