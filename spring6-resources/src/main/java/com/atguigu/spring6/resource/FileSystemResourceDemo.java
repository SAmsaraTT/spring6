package com.atguigu.spring6.resource;

import org.springframework.core.io.FileSystemResource;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Description visit the resource in the system
 * @Author hliu
 * @Date 2023/6/5 19:42
 * @Version 1.0
 */
public class FileSystemResourceDemo {
    public static void main(String[] args) {
        loadFileResource("atguigu.txt");
    }
    public static void loadFileResource(String path) {
        FileSystemResource resource = new FileSystemResource(path);

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
}
