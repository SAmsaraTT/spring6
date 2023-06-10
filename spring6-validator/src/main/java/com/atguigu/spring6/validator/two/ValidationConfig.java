package com.atguigu.spring6.validator.two;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * @Description
 * @Author hliu
 * @Date 2023/6/7 22:28
 * @Version 1.0
 */
@Configuration
@ComponentScan("com.atguigu.spring6.validator.two")
public class ValidationConfig {
    @Bean
    public LocalValidatorFactoryBean validator() {
        return new LocalValidatorFactoryBean();
    }
}
