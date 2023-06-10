package com.atguigu.spring6.tx.dao;

/**
 * @Description
 * @Author hliu
 * @Date 2023/6/2 21:53
 * @Version 1.0
 */
public interface BookDao {
    Integer getBookPriceByBookId(Integer bookId);

    void updateStock(Integer bookId);

    void updateUserBalance(Integer userId, Integer price);
}
