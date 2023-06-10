package com.atguigu.spring6.iocxml.ditest;

import java.util.Arrays;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/10 17:04
 * @Version 1.0
 */
public class Emp {
    private String ename;
    private Integer age;
    private Dept dept;
    private String[] loves;

    public String[] getLoves() {
        return loves;
    }

    public void setLoves(String[] loves) {
        this.loves = loves;
    }

    public void work() {
        System.out.println(ename + " emp work...... " + age);
        //dept.info();
        //System.out.println(Arrays.toString(loves));
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
