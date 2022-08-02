public class MathTest {
    public static void main(String[] args) {

        // Math类的两个常量

        System.out.println(Math.PI);        // 圆周率 PI

        System.out.println(Math.E);         // 自然对数 E


        // abs() 方法，计算绝对值
        System.out.println(Math.abs(-8.8));

        // ceil() 方法，向上取整
        System.out.println(Math.ceil(8.8));

        // floor() 方法，向下取整
        System.out.println(Math.floor(8.8));

        // max() 方法，取最大值
        System.out.println(Math.max(99, 55));

        // min() 方法，取最小值
        System.out.println(Math.min(99, 55));

        // pow() 方法，计算次方
        System.out.println(Math.pow(25, 0.5));

        // random() 方法，计算一个 [0~1) 之间的随机小数
        System.out.println(Math.random());

        // round() 方法, 根据第一位小数，四舍五入取整
        System.out.println(Math.round(6.4));


//        // 通过random() 做一个随机点名的小程序
//        ArrayList<String> names = new ArrayList<String>();
//        names.add("郭琳");
//        names.add("牛子毅");
//        names.add("老刘");
//        names.add("万家雪峰");
//        names.add("刘小康");
//
//        double v = Math.random() * names.size();        // 得到一[0~5) 之间的小数
//        int i = (int) v;                                // 得到一个 [0~4] 之间的整数
//        System.out.println("随机点名点到了："+names.get(i));


        /*
         *  写一个抽奖的小程序，一等奖（1%），二等奖（4%），三等奖（5%），参与奖（90%）
         * */

//        for (int j = 0; j < 10; j++) {
//            int i = (int) (Math.random() * 100 + 1);       // 得到一个[1~100]的随机整数
//
//            if(i<=1){
//                System.out.println("中了一等奖");
//            }else if(i<=5){
//                System.out.println("中了二等奖");
//            }else if(i<=10){
//                System.out.println("中了三等奖");
//            }else{
//                System.out.println("中了参与奖");
//            }
//        }


    }
}
