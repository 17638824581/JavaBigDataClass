public class Student {
    public String name;
    public int age;
    public char sex;
    private String number;

    public Student() {
    }

    public Student(String name, int age, char sex, String number) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void toStudy(){
        System.out.println("好好学习，天天向上！");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("{");
        sb.append("姓名："+this.name);
        sb.append("，性别："+this.sex);
        sb.append("，年龄："+this.age);
        sb.append("，学号："+this.number);
        sb.append("}");

        return sb.toString();
    }
}
