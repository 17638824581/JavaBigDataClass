public class Link {
    /*
    *   Link 链表类，一个链表由多个节点串联组成的，链表只需要存储头节点就可以
    * */
    public Node root;       // root 存储链表的头节点
    public int length;      // length 表示当前链表长度

    public Link() {
    }
    
    // 写一个添加元素的方法
    // 接收一个要存储的数据，利用这个数据生成节点，将节点挂到链表的后面
    public void add(int value){
        // 如果链表为空
        if (this.root == null){
            Node n = new Node(value);
            this.root = n;
        }else{
            // 如果链表不为空，需要找到链表中最后一个节点，然后将新节点挂到最后一个节点的后面
            Node n = this.root;     // 当前头节点
            // 使用循环找下一个节点
            while(n.next != null){
                // 让 n  等于 它下一个节点
                n = n.next;
            }
            // 等到循环结束，n就是最后一个节点
            n.next = new Node(value);
        }
        // 链表长度+1
        this.length ++;
    }

    // 获取指定索引的元素值
    public int get(int index){
        if (this.length==0 || index >= this.length || index < 0){
            return -10086;      // 代表错误
        }else if(index == 0){
            return this.root.data;
        }else {
            // 取对应的元素
            Node n = this.root;     // 取头节点
            for (int i = 0; i < index; i++) {
                n = n.next;
            }
            return n.data;
        }
    }

    /*
    *  获取存储了指定元素的节点的索引
    *   @prarm value: 要查找的元素值
    *   @return : 节点的索引
    * */
    public int find(int value){
        if(this.length == 0){
            return -1;
        }
        // 找节点
        int index = 0;
        Node n = this.root;
        // 遍历整个链表去找节点
        do{
            // 对比节点的值
            if(n.data == value){
                return index;
            }

            n = n.next;
            index++;
        }while (n != null);

        return -1;
    }

    /*
    *   删除存储了指定值的元素
    *   @prarm value: 要删除的元素值
    *   @return: 返回删除的结果，删除成功返回true，失败返回false
    * */
    public boolean remove(int value){
        if (this.length==0){
            return false;
        }else if(this.root.data == value){      // 若要删除的是头节点
            this.root = this.root.next;
            this.length --;
            return true;
        }else{
            Node node = this.root;
            while (node.next != null){
                // 如果要删除的节点是 当前节点的下一个节点
                if (node.next.data == value){
                    // 就让当前节点的写一个节点等于 下一个节点的下一个节点
                    node.next = node.next.next;
                    this.length --;
                    return true;
                }
                node = node.next;
            }

            return false;
        }
    }

    /*
    *   将元素插入到指定索引位置
    *
    *   @prarm value: 要插入的数据值
    *   @prarm index: 要插入到的索引位置
    *   @return: 返回是否插入成功
    *
    * */
    public boolean insert(int value, int index){
        if(index<0 || index > this.length){
            return false;
        }else if(index == this.length){
            add(value);
            return true;
        }else if(index == 0){
            Node new_node = new Node(value);
            new_node.next = this.root;
            this.root = new_node;
        }else{
            // n 始终保存在 index 的前一个节点
            Node n = this.root;
            for (int i = 0; i < index-1; i++) {
                n = n.next;
            }
            Node new_node = new Node(value);
            // 将新节点插入到链表中
            new_node.next = n.next;
            n.next = new_node;
        }

        this.length++;
        return true;
    }


    @Override
    public String toString() {
        if(this.length == 0){
            return "[]";
        }

        String slink = "[";

        Node n = this.root;
        slink += n.data;

        while (n.next != null){
            n = n.next;

            if (n.next == null){
                slink += ", " + n.data;
            }else{
                slink += ", " + n.data;
            }
        }

        slink += "],length="+this.length;

        return slink;
    }
}
