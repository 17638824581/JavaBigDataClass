public class Student {

    public String name;
    private int age;
    public String sex;
    private String studentNumber;

    public Student() {
    }

    public Student(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public Student(String name, int age, String sex, String studentNumber) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.studentNumber = studentNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void sutudy(String title){
        System.out.println(this.name+"疯狂学习"+title);
    }

    public void doHomeWork(){
        System.out.println(this.name+"开始熬夜写作业！");
    }

    public void show(){
        System.out.println("我叫"+this.name+"我的学号是:"+this.studentNumber+"我今年"+this.age+"岁了,我是个"+this.sex+"生");
    }

}
