public class Dog {
    // 定义狗的属性
    // 1. 品种
    String breed = "哈士奇";
    // 2. 颜色
    String color = "黑色";
    // 3. 名字
    String name = "二哈";
    // 4. 年龄
    int age = 2;

    // 定义狗的行为
    // 1. 叫
    public void crow(){
        System.out.println(name+"叫了：呜呜呜~~~");
    }
    // 2. 跑
    public void run(){
        System.out.println(name+"跑起来了~");
    }
    // 3. 吃
    public void eat(String food){
        System.out.println(name+"吃了"+food);
    }
}
