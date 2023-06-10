package com.atguigu.spring6.tx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description
 * @Author hliu
 * @Date 2023/6/3 20:43
 * @Version 1.0
 */

@Service
public class CheckoutServiceImpl implements CheckoutService {
    @Autowired
    private BookService bookService;
    @Transactional
    @Override
    public void checkout(Integer[] bookIds, Integer userId) {
        for (var bookId : bookIds) {
            bookService.buyBook(bookId, userId);
        }
    }
}
