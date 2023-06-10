package com.atguigu.spring6.validator.two;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description
 * @Author hliu
 * @Date 2023/6/8 18:28
 * @Version 1.0
 */
public class TestUser {
    @Test
    public void testValidationOne() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ValidationConfig.class);

        MyValidation1 validation1 = context.getBean(MyValidation1.class);

        User user = new User();
        user.setName("Lucy");
        user.setAge(20);

        boolean message = validation1.validatorByUserOne(user);

        System.out.println(message);
    }

    @Test
    public void testValidationTwo() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ValidationConfig.class);

        MyValidation2 validation2 = context.getBean(MyValidation2.class);

        User user = new User();
        user.setName("Lucy");
        user.setAge(200);

        boolean message = validation2.validatorByUserTwo(user);

        System.out.println(message);
    }
}
