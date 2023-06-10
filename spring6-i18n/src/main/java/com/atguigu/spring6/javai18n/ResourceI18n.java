package com.atguigu.spring6.javai18n;


import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @Description
 * @Author hliu
 * @Date 2023/6/6 20:33
 * @Version 1.0
 */
public class ResourceI18n {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("zh", "CN"));
        String val1 = bundle.getString("test");
        System.out.println(val1);

        ResourceBundle bundle1 = ResourceBundle.getBundle("messages", new Locale("en", "GB"));
        String val2 = bundle1.getString("test");
        System.out.println(val2);
    }
}
