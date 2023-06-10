package com.atguigu.spring6.tx.service;

/**
 * @Description
 * @Author hliu
 * @Date 2023/6/3 20:42
 * @Version 1.0
 */
public interface CheckoutService {
    void checkout(Integer[] bookIds, Integer userId);
}
