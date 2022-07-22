public class Son extends Father{
    // Son类自己的属性
    public String school_name;

    public Son(String name,int age,double money,String school_name){
        super.name = name;
        super.age = age;
        super.money = money;
        this.school_name = school_name;
    }

    public void get_name(){
        System.out.println(super.name);
    }


}
