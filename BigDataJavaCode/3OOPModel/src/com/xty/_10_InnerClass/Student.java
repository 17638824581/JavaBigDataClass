package com.xty._10_InnerClass;

public class Student {

    public String name;
    public int age;
    private Score s;

    public Student(String name, int age, double s1, double s2, double s3) {
        this.name = name;
        this.age = age;
        this.s = new Score(s1, s2, s3);
    }

    /*获取成绩的方法*/
    /*获取语文成绩*/
    public double getChineseScore() {
        return s.chineseScore;
    }

    /*获取数学成绩*/
    public double getMathScore() {
        return s.mathScore;
    }

    /*获取英语成绩*/
    public double getEnglishScore() {
        return s.englishScore;
    }


    /*成绩类*/
    private class Score {

        public double chineseScore;
        public double englishScore;
        public double mathScore;

        public Score(double chineseScore, double englishScore, double mathScore) {
            this.chineseScore = chineseScore;
            this.englishScore = englishScore;
            this.mathScore = mathScore;
        }
    }


}
