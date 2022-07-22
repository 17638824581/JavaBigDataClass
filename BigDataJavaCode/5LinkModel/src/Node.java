public class Node {
    /*
    *  Node 链表节点类，每一个节点存储一个 int 型的数据，还存储下一个节点的地址
    * */
    // 存储数据
    public int data;
    // 存储下一个节点地址
    Node next;

    public Node(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
