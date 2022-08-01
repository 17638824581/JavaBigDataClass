package com.xty.HomeWork.KaoShi;

import java.util.ArrayList;

/*
 *  书籍仓库类，用于存储书籍信息
 *
 * */
public class Books {
    // 成员属性
    public String name;
    private ArrayList<Book> books;

    // 构造
    public Books(String name) {
        this.name = name;
        // 初始化books
        books = new ArrayList<>();
    }

    // 成员方法
    /*
     *  返回书籍数量
     * */
    public int bookCount() {
        return this.books.size();
    }

    /*
     * 判断指定id的书籍是否存在
     * */
    public boolean bookIsExist(int id) {
        // 如果books长度为0
        if (books.size() == 0) {
            return false;
        }
        // 需要遍历books来找这个id的书籍
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getId() == id) {
                return true;
            }
        }
        return false;
    }

    /*
     *   添加一本书到 books 中
     * */
    public boolean addBook(Book b) {
        if (bookIsExist(b.getId())) {
            return false;
        }
        this.books.add(b);
        return true;
    }

    /*
     * 删除指定id的书籍
     * */

    public boolean removeBook(int id) {
        // 判断books是否为空,或者这个id不存在
        if (books.size() == 0 || bookIsExist(id) == false) {
            return false;
        }

        // 先获取要删除书籍
        Book book = getBook(id);

        // 删除书籍
        this.books.remove(book);
        return true;
    }

    /*
     *
     *   获取指定id的书籍
     * */
    public Book getBook(int id) {
        // 判断books是否为空,或者这个id不存在
        if (books.size() == 0 || bookIsExist(id) == false) {
            return null;
        }

        // 找书
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                return books.get(i);
            }
        }

        return null;
    }

    /*
     *
     *   获取指定索引的书籍
     * */
    public Book getIndexBook(int index) {
        // 判断books是否为空,或者这个id不存在
        if (index < 0 || index >= this.books.size()) {
            return null;
        }

        return this.books.get(index);
    }


}
