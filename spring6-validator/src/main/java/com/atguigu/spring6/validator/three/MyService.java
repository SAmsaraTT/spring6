package com.atguigu.spring6.validator.three;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * @Description
 * @Author hliu
 * @Date 2023/6/8 20:53
 * @Version 1.0
 */
@Service
@Validated
public class MyService {
    public String testMethod(@NotNull @Valid User user) {
        return user.toString();
    }

}
