package com.atguigu.spring6.validator.one;

import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

/**
 * @Description
 * @Author hliu
 * @Date 2023/6/6 21:27
 * @Version 1.0
 */
public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Lucy");
        person.setAge(250);

        DataBinder binder = new DataBinder(person);

        binder.setValidator(new PersonValidator());

        binder.validate();

        BindingResult result = binder.getBindingResult();

        System.out.println(result.getAllErrors());
    }
}
