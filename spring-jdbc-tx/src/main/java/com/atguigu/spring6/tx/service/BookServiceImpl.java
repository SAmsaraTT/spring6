package com.atguigu.spring6.tx.service;

import com.atguigu.spring6.tx.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

/**
 * @Description
 * @Author hliu
 * @Date 2023/6/2 21:53
 * @Version 1.0
 */
@Transactional(propagation = Propagation.REQUIRES_NEW)
@Service
public class BookServiceImpl implements BookService{
    @Autowired
    private BookDao bookDao;


    @Override
    public void buyBook(Integer bookId, Integer userId) {
//        try {
//            TimeUnit.SECONDS.sleep(5);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        Integer price = bookDao.getBookPriceByBookId(bookId);

        bookDao.updateStock(bookId);

        bookDao.updateUserBalance(userId, price);

//        System.out.println(1 / 0);
    }
}
