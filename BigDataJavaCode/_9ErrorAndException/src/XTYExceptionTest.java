public class XTYExceptionTest {

    public XTYExceptionTest() {
    }


    // 用户输入一个数，我们去计算这个数的平方
    public int square(int i) throws Exception {
        //先判断一下 i ， 看一看 i*i 是否会溢出，如果会溢出，就主动抛出错误
        if (i * (long) i > Integer.MAX_VALUE) {
            throw new XTYException("你传入的值太大了！");
        }
        return i * i;
    }

}
