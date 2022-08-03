public class Persion {
    public String name;
    public int age;
    public Esex sex;
    public ShuXiang shuXiang;

    public Season like_season;

    public Persion() {
    }

    public Persion(String name, int age, Esex sex, ShuXiang shuXiang, Season like_season) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.shuXiang = shuXiang;
        this.like_season = like_season;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", shuXiang=" + shuXiang +
                ", like_season=" + like_season +
                '}';
    }
}
