package com.atguigu.spring.aop.annoaop;

import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/27 19:13
 * @Version 1.0
 */
@Component
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int i, int j) {
        int result = i + j;

        System.out.println("方法内部 result = " + result);

        //int a = 1 / 0;
        return result;
    }

    @Override
    public int sub(int i, int j) {

        int result = i - j;

        System.out.println("方法内部 result = " + result);

        return result;
    }

    @Override
    public int mul(int i, int j) {

        int result = i * j;

        System.out.println("方法内部 result = " + result);

        return result;
    }

    @Override
    public int div(int i, int j) {

        int result = i / j;

        System.out.println("方法内部 result = " + result);

        return result;
    }
}
