package com.xty._2_Extends;

public class TestDemo {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("老张", '男', 48);
        teacher.prosession = "数学";
        Student student = new Student("小明", '男', 16);

        teacher.speak();
        student.speak();

    }
}
