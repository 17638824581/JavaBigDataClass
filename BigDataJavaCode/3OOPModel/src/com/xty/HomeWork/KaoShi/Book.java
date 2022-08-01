package com.xty.HomeWork.KaoShi;

/*
 *  书籍类，用于表示一本书相关的信息
 *
 * */
public class Book {
    public String name;
    public String date;
    // 成员属性
    private int id;
    private String author;
    private String press;

    // 构造方法
    public Book() {
    }

    public Book(int id, String name, String author, String press, String date) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.press = press;
        this.date = date;
    }

    public Book(String name, String date) {
        this.name = name;
        this.date = date;
    }

    // get&set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    @Override
    public String toString() {
        return "书籍编号：" + id +
                ", 书籍名：《" + name + "》" +
                ", 作者：" + author +
                ", 出版社：" + press +
                ", 印刷日期：" + date;
    }
}
