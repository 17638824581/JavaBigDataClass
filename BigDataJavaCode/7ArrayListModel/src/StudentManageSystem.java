import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class StudentManageSystem {

    // ArrayList 用来存储学生对象
    public static ArrayList<Student> students = new ArrayList<>();

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
        String id;

        while (true){
            System.out.println("请输入学生学号：");
            id = sc.next();

            if (findStudent(id) != null){
                System.out.println("这个学号已被占用，请重新输入");
            }else{
                break;
            }
        }

        // 同过输入的信息创建学生对象
        Student new_studnt = new Student(name, age, sex, id);

        // 将学生对象存储到ArrayList中
        students.add(new_studnt);
    }

    /*
    *   获取用户输入方法
    *
    *   @prarm mess：表示要求用户输入内容时的提示信息
    *   @return: String类型的，表示获取到用户输入的内容
    *
    * */
    public static String getInput(String mess){
        // 根据学号删除学生
        System.out.println(mess);
        Scanner sc = new Scanner(System.in);

        return sc.next();
    }

    // 删除学生的方法
    public static void deleteStudent(){

        // 先判断students中有没有学生
        if (students.size() == 0){
            System.out.println("暂无学生信息，无法删除。");
            return;
        }

        // 获取输入的学号
        String s_id = getInput("请输入您要删除学生的学号：");
        Student stu = findStudent(s_id);

        if (stu != null){
            // 找学生？要遍历students，直到找到其中一个学生的序号与 输入的需要一致
            String next = getInput("您确认要删除"+stu.name+"这个学生的信息吗？(y/n):").toUpperCase(Locale.ROOT);

            if (next.equals("YES")||next.equals("Y")){
                // 在删除之前通常做一个确认的步骤
                students.remove(stu);
                System.out.println("删除成功");
                return;
            }else {
                System.out.println("撤销删除");
                return;
            }
        }else{
            System.out.println("没有这个学号的学生！");
        }

    }

    // 修改学生信息的方法
    public static void alterStudent(){
        // 判断有没有学生
        if(students.size() == 0){
            System.out.println("暂无学生信息，无法修改！");
            return;
        }

        // 获取学号
        String s_id = getInput("请输入您要修改学生的学号：");

        // 查找这个学生
        Student stu = findStudent(s_id);
        if (stu != null){
            showStudent(stu);

            // 询问要修改什么信息？
            System.out.println("1.修改姓名\n2.修改年龄\n3.修改性别\n4.取消修改");
            String input = getInput("请输入您对应的序号：");
            switch (input){
                case "1":
                    String new_name = getInput("请输入新姓名：");
                    stu.name = new_name;
                    System.out.println("修改成功");
                    break;
                case "2":
                    //Integer.parseInt() 方法可以将字符串转为 int 类型
                    int new_age = Integer.parseInt(getInput("请输入新年龄："));
                    stu.age = new_age;
                    System.out.println("修改成功");
                    break;
                case "3":
                    char new_sex = getInput("请输入新性别：").charAt(0);
                    stu.sex = new_sex;
                    System.out.println("修改成功");
                    break;
                default:
                    System.out.println("撤销修改");
                    break;
            }
            return;
        }else{
            System.out.println("没有这个学号的学生!");
        }
    }



    // 根据学号找学生
    public static Student findStudent(String id){
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getNumber().equals(id)){
                return s;
            }
        }
        return null;
    }

    // 展示传入的学生信息的方法
    public static void showStudent(Student stu){
        System.out.println("------------学生信息-------------");
        System.out.println("姓名："+stu.name);
        System.out.println("性别："+stu.sex);
        System.out.println("年龄："+stu.age);
        System.out.println("学号："+stu.getNumber());
        System.out.println("-------------------------------");
    }


    // 展示学生信息的方法
    public static void showStudent(){
        if (students.size() == 0){
            System.out.println("暂无学生信息，无法查找学生!");
            return;
        }

        String input = getInput("请输入你要查询的学生学号：");
        Student stu = findStudent(input);
        if (stu != null){
            showStudent(stu);
        }else{
            System.out.println("没有这个学生的信息！");
        }
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
                    deleteStudent();
                    break;
                case "3":
                    System.out.println("修改学生相关代码");
                    alterStudent();
                    break;
                case "4":
                    System.out.println("查看学生相关代码");
                    showStudent();
                    break;
                case "5":
                    System.out.println("退出系统");
                    return;
            }

        }

    }
}
