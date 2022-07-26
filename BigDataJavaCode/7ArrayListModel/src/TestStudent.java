import java.util.ArrayList;
import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {

//        ArrayList<Student> students = new ArrayList<>();
//
//        Student student1 = new Student("小明", 18, '男',"s001");
//        Student student2 = new Student("小红", 15, '女',"s002");
//        Student student3 = new Student("小刚", 20, '男',"s003");
//        Student student4 = new Student("小王", 32, '男',"s004");
//        Student student5 = new Student("小美", 20, '女',"s005");
//
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);
//        students.add(student4);
//        students.add(student5);
//
//        System.out.println(students);
//        System.out.println(students.size());
//
//        // 遍历 Arraylist
//        for (int i = 0; i < students.size(); i++) {
//            Student s = students.get(i);
//            System.out.println("学生姓名："+s.name);
//            System.out.println("学生年龄："+s.age);
//            System.out.println("学生性别："+s.sex);
//            System.out.println("学生学号："+s.getNumber());
//            System.out.println("---------------------");
//        }

        // 做一个程序，可以通过键盘录入学生的相关信息，创建一个学生对象，将这个学生对象存储到 ArrayList中。

        // 创建一个存储学生对象的 ArrayList
        ArrayList<Student> students = new ArrayList<>();

        // 连续录入三个学生信息
        for (int i = 0; i < 3; i++) {
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

        // 遍历 ArrayList 打印学生信息
        System.out.println("您录入了"+students.size()+"个学生，学生相关信息如下：");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println("学生姓名："+s.name);
            System.out.println("学生年龄："+s.age);
            System.out.println("学生性别："+s.sex);
            System.out.println("学生学号："+s.getNumber());
            System.out.println("---------------------");
        }

    }
}
