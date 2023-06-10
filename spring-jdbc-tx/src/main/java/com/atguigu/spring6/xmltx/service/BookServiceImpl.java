package com.atguigu.spring6.xmltx.service;

import com.atguigu.spring6.xmltx.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description
 * @Author hliu
 * @Date 2023/6/2 21:53
 * @Version 1.0
 */

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;


    @Override
    public void buyBook(Integer bookId, Integer userId) {


        Integer price = bookDao.getBookPriceByBookId(bookId);

        bookDao.updateStock(bookId);

        bookDao.updateUserBalance(userId, price);

//        System.out.println(1 / 0);
    }
}
