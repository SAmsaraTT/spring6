package com.atguigu.reflect;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/24 19:31
 * @Version 1.0
 */
public class TestCar {
    //1 get the Class Object
    @Test
    public void test01() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Car> clazz1 = Car.class;
        Class<? extends Car> clazz2 = new Car().getClass();
        Class<?> clazz3 = Class.forName("com.atguigu.reflect.Car");

        Car car = (Car) clazz3.getDeclaredConstructor().newInstance();

        System.out.println(car);
    }

    //2 get the constructor
    @Test
    public void test02() throws Exception {
        Class<Car> clazz = Car.class;

//        Constructor<?>[] constructors = clazz.getConstructors();
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();

        for (var c : constructors) {
            System.out.println(c.getName() + "  " +  c.getParameterCount());
        }


        //1 public

        Constructor<Car> constructor = clazz.getConstructor();
        Car car = constructor.newInstance();

        //2 private

        Constructor<Car> declaredConstructor = clazz.getDeclaredConstructor(String.class, int.class, String.class);
        declaredConstructor.setAccessible(true);

        Car car1 = declaredConstructor.newInstance("捷达", 15, "白色");

        System.out.println(car1);

    }


    //3 get the fields
    @Test
    public void test03() throws Exception {
        Class<Car> clazz = Car.class;
        Car car = clazz.getDeclaredConstructor().newInstance();

        Field[] declaredFields = clazz.getDeclaredFields();

        for (var f : declaredFields) {
            if (f.getName().equals("name")) {
                f.setAccessible(true);
                f.set(car, "五菱宏光");
            }


            System.out.println(f.getName());

        }

        System.out.println(car);
    }


    // 4 get the method

    @Test
    public void test04() throws Exception {
        Car car = new Car("奔驰", 10, "黑色");
        Class<? extends Car> clazz = car.getClass();

        //1 public
        Method[] methods = clazz.getMethods();
        for (var m : methods) {
            //System.out.println(m.getName());

            if (m.getName().equals("toString")) {
                String invoke = (String) m.invoke(car);
                System.out.println(invoke);
            }
        }

        //2 private
        Method[] declaredMethods = clazz.getDeclaredMethods();

        for (var m : declaredMethods) {
            if (m.getName().equals("run")) {
                m.setAccessible(true);
                m.invoke(car);
            }
        }
    }
}
