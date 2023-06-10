package com.atguigu.spring6.iocxml.dimap;

import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/16 18:52
 * @Version 1.0
 */
public class Student {

    private List<Lesson> lessonList;

    public List<Lesson> getLessonList() {
        return lessonList;
    }

    public void setLessonList(List<Lesson> lessonList) {
        this.lessonList = lessonList;
    }

    private Map<String, Teacher> teacherMap;

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lessonList=" + lessonList +
                ", teacherMap=" + teacherMap +
                ", sid='" + sid + '\'' +
                ", sname='" + sname + '\'' +
                '}';
    }

    private String sid;
    private String sname;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }


}
