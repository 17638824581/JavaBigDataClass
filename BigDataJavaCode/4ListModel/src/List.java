public class List{

    private int[] data;     // data 是我们用来实际存储数据的数组
    public int length;      // 表示当前列表长度

    public List() {
        // 初始化data数组的长度，默认长度为10
        data = new int[10];
        // 初始化 length
        length = 0;
    }

    // 将元素 i 存到列表尾部
    public boolean add(int i){
        // 判断当前列表长度是否已经超过了 data 数组的长度，需要为data数组扩容
        if(length >= data.length){
            arrayExtends(10);
        }

        data[length] = i;       // 将 i 存储到数组列表长度的位置
        length++;               // 列表长度 + 1

        return true;
    }

    // 插入元素到指定的位置
    public boolean insert(int value, int index){
        // 1. 先判断 index 是否越界
        if(index < 0 || index > length){
            return false;
        }else if(index == length){
            add(value);
        }
        // 2. 判断 data 数组后面是否还有位置
        if(data.length == length){
            arrayExtends(10);
        }
        // 3. 再将 index 以及后面位置的元素 往后挪一位
        for (int i = length-1; i >= index; i--) {
            data[i+1] = data[i];
        }
        // 4. 再将 value 放到 index 位置上
        data[index] = value;
        // 5. 列表长度+1
        length++;

        return true;
    }

    // 删除指定的元素
    public boolean remove(int value){
        // 1. 先判断有没有这个元素
        int index = find(value);
        if (index == -1){
            return false;
        }
        // 2. 如果元素存在，只需要将它后面的元素往前移动一个位置
        for (int i = index+1; i < length; i++) {
            data[i-1] = data[i];
        }

        // 3. 列表长度 -1
        length--;

        return true;
    }

    // 返回index索引的元素值
    public int get(int index) {
        // 先判断index是否越界
        if(index >= length || index <0){
            System.out.println("索引越界了！");
            return -10001;
        }

        return data[index];
    }

    // 查找元素，若找到返回这个元素的索引位，若未找到返回 -1
    public int find(int value){
        // 遍历列表，查找元素
        for (int i = 0; i < length; i++) {
            if (data[i] == value){
                return i;
            }
        }

        return -1;
    }

    // 可以将数组arr指定范围的元素转为字符串表达形式
    private String arrayRangeToString(int[] arr, int length){
        if (arr == null)
            return "null";
        int iMax = arr.length - 1;
        if (iMax == -1)
            return "[]";

        String sarr = "[";

        for (int i = 0; i < length; i++) {
            if (i == length-1){
                sarr += arr[i]+ "]";
            }else {
                sarr += arr[i]+ ", ";
            }
        }

        return sarr;
    }

    // 扩充数组size长度
    private void arrayExtends(int size){
        // 给data扩容 10 个长度
        int[] new_data = new int[data.length+size];
        // 将data 中原本的数据 转移到 new_data 中
        for (int j = 0; j < data.length; j++) {
            new_data[j] = data[j];
        }
        // 用新数组替换掉老数组
        data = new_data;
    }

    @Override
    public String toString() {
        return "List{" +
                "data=" + arrayRangeToString(data, length) +
                ", length=" + length +
                '}';
    }

}
