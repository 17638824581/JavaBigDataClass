public class LinkTest {
    public static void main(String[] args) {
        Link link = new Link();
        System.out.println(link);
        link.insert(99, 0);
        link.insert(88, 0);
        link.insert(77, 0);

        link.insert(100, 2);
        link.insert(200, 1);
        link.insert(300, 5);
        System.out.println(link.insert(400, 7));
        System.out.println(link);

    }
}
