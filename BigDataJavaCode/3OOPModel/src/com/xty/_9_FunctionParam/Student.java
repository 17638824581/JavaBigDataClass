package com.xty._9_FunctionParam;

public class Student extends Person implements Study {
    private int score;

    public Student() {
    }

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    @Override
    public void sleep() {
        System.out.println(this.name + "开始睡觉！");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public void study() {
        System.out.println("学生" + this.name + "开始学习！");
    }
}
