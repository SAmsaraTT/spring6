package com.atguigu.spring6.junit.junit5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/31 19:53
 * @Version 1.0
 */
@SpringJUnitConfig(locations = "classpath:bean.xml")
public class SpringTestJunit5 {
    @Autowired
    private User user;

    @Test
    public void testUser() {
        System.out.println(user);
        user.run();
    }
}
