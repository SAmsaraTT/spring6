package com.atguigu.spring6.junit.junit4;

import com.atguigu.spring6.junit.junit5.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/31 20:02
 * @Version 1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:bean.xml")
public class SpringTestJunit4 {
    @Autowired
    private User user;

    @Test
    public void testUser4() {
        System.out.println(user);
        user.run();
    }
}
