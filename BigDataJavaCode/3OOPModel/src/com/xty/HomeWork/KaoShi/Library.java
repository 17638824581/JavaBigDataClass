package com.xty.HomeWork.KaoShi;

import java.util.Scanner;

/*
 *   图书馆类，有书库，还提供书籍相关的服务
 *
 * */
public class Library {

    // 成员属性
    public String name;
    private Books books;

    // 构造方法
    public Library(String name) {
        this.name = name;
        // 初始化books
        books = new Books(this.name + "的书库");
    }

    private Book get_book() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要查找的书籍的id：");
        int id2 = sc.nextInt();

        // 获取书籍对象
        Book book = this.books.getBook(id2);

        if (book == null) {
            System.out.println("查无此书！");
            return null;
        } else {
            System.out.println("id为" + id2 + "的书籍的信息如下所示：");
            System.out.println(book);
            return book;
        }
    }


    // 成员方法
    public void startOperation() {
        while (true) {
            System.out.println("欢迎来到" + this.name);
            System.out.println("1、添加书籍\n" +
                    "2、查找书籍\n" +
                    "3、修改书籍信息\n" +
                    "4、删除书籍\n" +
                    "5、展示所有书籍名\n" +
                    "6、退出系统\n");
            System.out.println("请输入序号：");
            Scanner sc = new Scanner(System.in);
            switch (sc.next()) {
                // 添加书籍
                case "1":
                    int id;
                    while (true) {
                        System.out.println("请输入要添加的书籍编号：");
                        id = sc.nextInt();
                        // 验证id是否重复
                        if (this.books.bookIsExist(id)) {
                            System.out.println("此id以占用!");
                        } else {
                            break;
                        }
                    }
                    System.out.println("请输入要添加的书籍名称：");
                    String name = sc.next();
                    System.out.println("请输入要添加的书籍作者：");
                    String author = sc.next();
                    System.out.println("请输入要添加的书籍出版社：");
                    String press = sc.next();
                    System.out.println("请输入要添加的书籍印刷日期：");
                    String date = sc.next();

                    // 创建 Book 对象
                    Book new_book = new Book(id, name, author, press, date);

                    // 添加书籍
                    this.books.addBook(new_book);

                    System.out.println("添加书籍成功！");

                    break;
                // 查找书籍
                case "2":
                    get_book();
                    break;
                // 修改书籍
                case "3":
                    Book book = get_book();

                    if (book == null) {
                        break;
                    }

                    boolean b = true;
                    while (b) {
                        System.out.println("1.修改书籍名称\n2.修改书籍作者\n3.修改书籍出版社\n4.修改日期\n5.退出修改\n");
                        System.out.println("请输入您要修改的内容序号:");
                        int i = sc.nextInt();
                        switch (i) {
                            case 1:
                                System.out.println("请输入您要修改的新的书籍名称：");
                                book.name = sc.next();
                                break;
                            case 2:
                                System.out.println("请输入您要修改的新的书籍作者：");
                                book.setAuthor(sc.next());
                                break;
                            case 3:
                                System.out.println("请输入您要修改的新的书籍出版社：");
                                book.setPress(sc.next());
                                break;
                            case 4:
                                System.out.println("请输入您要修改的新的书籍印刷日期：");
                                book.date = sc.next();
                                break;
                            case 5:
                                b = false;
                                break;
                        }
                    }
                    break;
                // 删除书籍
                case "4":
                    System.out.println("请输入您要删除的书籍id：");
                    if (this.books.removeBook(sc.nextInt())) {
                        System.out.println("删除成功！");
                    } else {
                        System.out.println("查无此书！");
                    }
                    break;
                // 展示所有书籍名
                case "5":
                    if (this.books.bookCount() == 0) {
                        System.out.println("当前书库为空！");
                    } else {
                        System.out.println("书籍id\t书籍名：");
                        for (int i = 0; i < this.books.bookCount(); i++) {
                            Book book1 = this.books.getIndexBook(i);
                            System.out.println(book1.getId() + "\t" + book1.name);
                        }
                    }
                    break;
                // 退出
                case "6":
                    System.out.println("bye!");
                    return;
                default:
                    System.out.println("请输入正确的选项！");
            }
        }


    }


}
