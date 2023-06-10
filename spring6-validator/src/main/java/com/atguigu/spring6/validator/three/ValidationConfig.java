package com.atguigu.spring6.validator.three;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

/**
 * @Description
 * @Author hliu
 * @Date 2023/6/8 18:37
 * @Version 1.0
 */
@Configuration
@ComponentScan("com.atguigu.spring6.validator.three")
public class ValidationConfig {
    @Bean
    public MethodValidationPostProcessor validationPostProcessor() {
        return new MethodValidationPostProcessor();
    }
}
