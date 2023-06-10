package com.atguigu.spring6.iocxml.di;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/5 16:12
 * @Version 1.0
 */
public class Book {
    private String bname;
    private String author;

    private String others;

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public Book(String bname, String author, String others) {
        this.bname = bname;
        this.author = author;
        this.others = others;
    }

    public Book() {
        System.out.println("constructor with none have been invoked !");
    }

    public Book(String bname, String author) {
        System.out.println("the constructor with params have been invoked !");
        this.bname = bname;
        this.author = author;
    }

    // get and set method

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                ", others='" + others + '\'' +
                '}';
    }
}
