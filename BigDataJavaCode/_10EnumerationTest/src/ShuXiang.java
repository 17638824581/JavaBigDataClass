/*属相类*/
public class ShuXiang {
    public static final ShuXiang mouse = new ShuXiang("子鼠");
    public static final ShuXiang cow = new ShuXiang("丑牛");
    public static final ShuXiang tiger = new ShuXiang("寅虎");
    public static final ShuXiang rabbit = new ShuXiang("卯兔");
    public static final ShuXiang dragon = new ShuXiang("辰龙");
    public static final ShuXiang snake = new ShuXiang("巳蛇");
    public static final ShuXiang horse = new ShuXiang("午马");
    public static final ShuXiang sheep = new ShuXiang("未羊");
    public static final ShuXiang monkey = new ShuXiang("申猴");
    public static final ShuXiang chicken = new ShuXiang("酉鸡");
    public static final ShuXiang dog = new ShuXiang("戌狗");
    public static final ShuXiang pig = new ShuXiang("亥猪");
    private String sx;

    private ShuXiang(String sx) {
        this.sx = sx;
    }

    @Override
    public String toString() {
        return this.sx;
    }
}
