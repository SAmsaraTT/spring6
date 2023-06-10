package com.atguigu.spring6.iocxml.dimap;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/16 19:12
 * @Version 1.0
 */
public class Lesson {
    private String lessonName;

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lessonName='" + lessonName + '\'' +
                '}';
    }
}
