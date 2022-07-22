public class DogTest {
    public static void main(String[] args) {
        // 创建Dog类的对象d
        Dog d = new Dog();

        System.out.println(d.name);
        System.out.println(d.age);
        System.out.println(d.breed);
        System.out.println(d.color);


        // 调用了 d 的 run() 方法
        d.run();

        d.crow();

        d.eat("大骨头");


    }
}
