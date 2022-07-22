public class Father {
    // Father 类自己的属性
    public static String name = "张三";            // 类属性（静态属性）
    public int age;                // 对象属性（非静态属性）
    protected double money;         // 对象属性（非静态属性）

    // 构造方法
    //  方法名和类名一致
    // （在创建对象的时候，这个方法会自动执行
    public Father() {
    }

    public Father(String name) {
        this.name = name;
    }

    public Father(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Father(String name, int age, double money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    // 间接访问 money
    // 没有 static 就是对象方法
    // 方法加上了 static 关键字 ，代表方法变成了  类方法
    // 在类方法中，只能用类属性
    public final String get_money(){
        if(money>1000000){
            return "有钱";
        }else if(money>500000){
            return "有点小钱";
        }else if(money>100000){
            return "我也穷啊！";
        }else{
            return "没钱，滚！";
        }
    }

}
