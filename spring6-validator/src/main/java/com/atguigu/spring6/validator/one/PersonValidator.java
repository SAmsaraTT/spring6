package com.atguigu.spring6.validator.one;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @Description
 * @Author hliu
 * @Date 2023/6/6 21:02
 * @Version 1.0
 */
public class PersonValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "name", "name.empty", "name is null");
        Person person = (Person) target;

        if (person.getAge() < 0) {
            errors.rejectValue("age", "age.value.error", "age < 0");
        } else if (person.getAge() > 200) {
            errors.rejectValue("age", "age.value.error.old", "age > 200");
        }
    }
}
