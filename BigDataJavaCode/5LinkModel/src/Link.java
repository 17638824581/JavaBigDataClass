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

        slink += "]";

        return slink;
    }
}
