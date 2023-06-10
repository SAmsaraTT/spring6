package com.atguigu.spring6.xmltx.controller;

import com.atguigu.spring6.xmltx.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Description
 * @Author hliu
 * @Date 2023/6/2 21:52
 * @Version 1.0
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    public void buyBook(Integer bookId, Integer userId) {
        bookService.buyBook(bookId, userId);
    }

}
