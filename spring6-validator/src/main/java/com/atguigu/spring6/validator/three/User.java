package com.atguigu.spring6.validator.three;

import com.atguigu.spring6.validator.four.CannotBlank;
import jakarta.validation.constraints.*;

/**
 * @Description
 * @Author hliu
 * @Date 2023/6/8 20:49
 * @Version 1.0
 */
public class User {
    @NotNull
    private String name;

    @Min(0)
    @Max(150)
    private int age;

    @CannotBlank
    private String message;


    @Pattern(regexp = "^1(3|4|5|7|8)\\d{9}$",message = "手机号码格式错误")
    @NotBlank(message = "手机号码不能为空")
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", message='" + message + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
