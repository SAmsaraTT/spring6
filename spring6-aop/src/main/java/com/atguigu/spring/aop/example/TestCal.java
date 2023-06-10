package com.atguigu.spring.aop.example;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/28 19:52
 * @Version 1.0
 */
public class TestCal {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator calculator  = (Calculator) proxyFactory.getProxy();

        calculator.add(1, 2);


        calculator.mul(2, 4);
    }
}
