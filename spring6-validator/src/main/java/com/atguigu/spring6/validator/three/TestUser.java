package com.atguigu.spring6.validator.three;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description
 * @Author hliu
 * @Date 2023/6/8 20:55
 * @Version 1.0
 */
public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ValidationConfig.class);

        MyService service = context.getBean(MyService.class);
        User user = new User();
        user.setName("Lucy");
        user.setPhone("13566754321");
        user.setMessage("test a t guigu");
        service.testMethod(user);
    }
}
