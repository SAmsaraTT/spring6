package com.atguigu.bean;

import com.atguigu.anno.Bean;
import com.atguigu.anno.Di;

import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/25 20:51
 * @Version 1.0
 */
public class AnnotationApplicationContext implements ApplicationContext {
    // create a map to store the bean
    private Map<Class, Object> beanFactory = new HashMap<>();
    private static String rootPath;

    @Override
    public Object getBean(Class clazz) {
        return beanFactory.get(clazz);
    }

    // set the scan rule
    public AnnotationApplicationContext(String basePackage) {
        try {
            // repalce the . to \

            String packagePath = basePackage.replaceAll("\\.", "\\\\");

            // get the absolute path
            Enumeration<URL> dirs = Thread.currentThread().getContextClassLoader().getResources(packagePath);

            while (dirs.hasMoreElements()) {
                URL url = dirs.nextElement();
                String filePath = URLDecoder.decode(url.getFile(), "utf-8");
                // get the first base path
                rootPath = filePath.substring(0, filePath.length() - packagePath.length());

                loadBean(new File(filePath));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        loadDi();
    }

    private void loadDi() {
        for (var e : beanFactory.entrySet()) {
            Object obj = e.getValue();

            Class<?> clazz = obj.getClass();

            Field[] declaredFields = clazz.getDeclaredFields();

            for (Field field : declaredFields) {
                Di annotation = field.getAnnotation(Di.class);

                if (annotation != null) {
                    field.setAccessible(true);

                    try {
                        field.set(obj, beanFactory.get(field.getType()));
                    } catch (IllegalAccessException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        }
    }

    private void loadBean(File file) throws Exception {
        if (file.isDirectory()) {
            File[] childrenFiles = file.listFiles();

            if (childrenFiles == null || childrenFiles.length == 0) {
                return;
            }

            for (File child : childrenFiles) {
                if (child.isDirectory()) {
                    loadBean(child);
                } else {
                    String pathWithClass = child.getAbsolutePath().substring(rootPath.length() - 1);

                    if (pathWithClass.contains(".class")) {
                        String fullName = pathWithClass.replaceAll("\\\\", ".").replace(".class", "");
                        Class<?> aClass = Class.forName(fullName);
                        if (!aClass.isInterface()) {
                            Bean annotation = aClass.getAnnotation(Bean.class);
                            if (annotation != null) {
                                Object instance = aClass.getConstructor().newInstance();
                                //判断一下有没有接口
                                if (aClass.getInterfaces().length > 0) {
                                    //如果有接口把接口的class当成key，实例对象当成value
                                    System.out.println("正在加载【" + aClass.getInterfaces()[0] + "】,实例对象是：" + instance.getClass().getName());
                                    beanFactory.put(aClass.getInterfaces()[0], instance);
                                } else {
                                    //如果有接口把自己的class当成key，实例对象当成value
                                    System.out.println("正在加载【" + aClass.getName() + "】,实例对象是：" + instance.getClass().getName());
                                    beanFactory.put(aClass, instance);
                                }
                            }

                        }
                    }
                }
            }
        }

    }

}
