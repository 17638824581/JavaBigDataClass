public class StudentTest {
    // 测试Student类
    public static void main(String[] args) {
        // 使用 Student 类创建了一个 Student对象 s

        // 封装可以对外部隐藏类内部的细节
        // 避免类内部的一些重要属性被修改

        Student s1 = new Student("小明", 18, "女", "S12345");

        Student s2 = new Student("小张", "男");

        s2.show();

    }
}

