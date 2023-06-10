package com.atguigu.spring6.resourceloaderaware;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;

/**
 * @Description
 * @Author hliu
 * @Date 2023/6/5 20:19
 * @Version 1.0
 */
public class TestBean implements ResourceLoaderAware {
    private ResourceLoader resourceLoader;
    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
