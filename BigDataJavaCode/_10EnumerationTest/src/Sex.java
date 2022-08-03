/*
 *  这个类代表一个性别
 * */
public class Sex {

    public static final Sex man = new Sex('男');
    public static final Sex woman = new Sex('女');
    private char sex;

    // 构造写成私有的，外部没方法构造Sex对象
    private Sex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return String.valueOf(this.sex);
    }
}
