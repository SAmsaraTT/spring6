package com.atguigu.bean;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/25 20:50
 * @Version 1.0
 */
public interface ApplicationContext {
    Object getBean(Class clazz);
}
