package com.atguigu.spring6.validator.four;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * @Description
 * @Author hliu
 * @Date 2023/6/8 21:20
 * @Version 1.0
 */
public class CannotBlankValidation implements ConstraintValidator<CannotBlank, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value != null && value.contains(" ")) {
            //获取默认提示信息
            String defaultConstraintMessageTemplate = context.getDefaultConstraintMessageTemplate();
            System.out.println("default message :" + defaultConstraintMessageTemplate);
            //禁用默认提示信息
            context.disableDefaultConstraintViolation();
            //设置提示语
            context.buildConstraintViolationWithTemplate("can not contains blank").addConstraintViolation();
            return false;
        }
        return true;
    }
}
