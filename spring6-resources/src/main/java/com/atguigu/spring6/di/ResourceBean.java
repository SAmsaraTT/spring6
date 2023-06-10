package com.atguigu.spring6.di;

import org.springframework.core.io.Resource;

/**
 * @Description
 * @Author hliu
 * @Date 2023/6/5 20:25
 * @Version 1.0
 */
public class ResourceBean {
    private Resource resource;

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public void parse() {
        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());
    }
}
