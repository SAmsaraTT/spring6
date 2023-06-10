package com.atguigu.spring6.iocxml.ditest;

import java.util.List;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/10 17:04
 * @Version 1.0
 */
public class Dept {

    private String dname;

    private List<Emp> empList;

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }

    public void info() {
        System.out.println("部门名称: " + dname);
       for (var x : empList) {
           x.work();
       }
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}
