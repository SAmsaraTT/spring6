package com.atguigu.spring6.resource;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Description visit file in the classpath
 * @Author hliu
 * @Date 2023/6/4 21:57
 * @Version 1.0
 */
public class ClassPathResourceDemo {
    public static void loadClasspathResource(String path) {
        ClassPathResource resource = new ClassPathResource(path);

        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());
        try {
            InputStream in = resource.getInputStream();
            byte[] b = new byte[1024];
            int len;
            while ((len = in.read(b)) != -1) {
                System.out.println(new String(b, 0, len));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        loadClasspathResource("atguigu.txt");
    }


}
