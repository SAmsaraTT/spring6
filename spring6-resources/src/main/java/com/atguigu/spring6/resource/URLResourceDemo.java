package com.atguigu.spring6.resource;

import org.springframework.core.io.UrlResource;

import java.net.MalformedURLException;

/**
 * @Description the demo of visiting web resource
 * @Author hliu
 * @Date 2023/6/4 21:46
 * @Version 1.0
 */
public class URLResourceDemo {
    public static void main(String[] args) {
        // http
//        loadUrlResource("http://www.baidu.com");

        // file

        loadUrlResource("file:atguigu.txt");
    }
    // prefix:http, file

    public static void loadUrlResource(String path) {
        try {
            UrlResource url = new UrlResource(path);

            System.out.println(url.getFilename());
            System.out.println(url.getURI());
            System.out.println(url.getDescription());
            System.out.println(url.getInputStream().read());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
