import java.util.Arrays;

public class StringBuilderTest {
    public static void main(String[] args) {


//        //1. 创建StringBuilde对象
//        StringBuilder sb = new StringBuilder("我爱你中国！");
//
//        // 追加内容
//        sb.append("我爱你中国!");
//
//        // 插入内容
//        sb.insert(5, "我很爱你");
//
//        // 删除指定范围的内容
//        sb.delete(5,9);
//
//        // 删除一个字符
//        sb.deleteCharAt(5);
//
//        // 查找子字符串
//        System.out.println("'中国'在sb这个对象中的位置是："+sb.lastIndexOf("中国"));
//
//        // 反转
//        sb.reverse();
//        System.out.println(sb);

//        // 获取长度
//        System.out.println("sb的长度是"+sb.length());
//
//        // 替换子串
//        sb.replace(3,5,"河南");
//
//        // 截取子串
//        String new_str = sb.substring(5,10);
//        System.out.println(new_str);


        // 将一个数组中的内容拼接成字符串

        int[] arr = {12354,67,468,12,451,8775,9847,9,12,341,4};

        System.out.println(Arrays2String(arr));
    }

    public static String Arrays2String(int[] arr){
        StringBuilder sb = new StringBuilder("[");
        for (int i : arr) {
            sb.append(i);
            sb.append(", ");
        }
        // 删除最后一个逗号
        sb.deleteCharAt(sb.lastIndexOf(","));

        sb.append("]");
        return sb.toString();
    }

}
