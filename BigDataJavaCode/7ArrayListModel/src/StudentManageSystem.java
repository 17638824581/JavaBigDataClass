import java.util.ArrayList;
import java.util.Scanner;

public class StudentManageSystem {

    // ArrayList 用来存储学生对象
    static ArrayList<Student> students = new ArrayList<>();

    // 添加学生的方法
    public static void addStudent(){
        // 通过键盘录入学生的信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生性别：");
        char sex = sc.next().charAt(0);
        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        System.out.println("请输入学生学号：");
        String id = sc.next();

        // 同过输入的信息创建学生对象
        Student new_studnt = new Student(name, age, sex, id);

        // 将学生对象存储到ArrayList中
        students.add(new_studnt);
    }

    public static void main(String[] args) {



        while (true){
            System.out.println("欢迎使用学生管理系统！您可以通过键盘输入序号来执行相应的功能：");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看学生");
            System.out.println("5.退出系统");

            System.out.println("请输入序号：");

            String item = new Scanner(System.in).next();        //让用户输入序号

            // 根据序号执行相应的功能
            switch (item){
                case "1":
                    System.out.println("开始添加学生");
                    addStudent();
                    System.out.println("--添加完成--");
                    break;
                case "2":
                    System.out.println("删除学生相关代码");
                    break;
                case "3":
                    System.out.println("修改学生相关代码");
                    break;
                case "4":
                    System.out.println("查看学生相关代码");
                    System.out.println(students);
                    break;
                case "5":
                    System.out.println("退出系统");
                    return;
            }

        }


    }
}
