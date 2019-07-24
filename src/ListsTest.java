public class ListsTest {
    public static void main(String[] args) {
        testLinkedList();
    }

    public static void testLinkedList() {
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        System.out.println(list);

        System.out.println(list.get(2));

        list.set(1, 10);
        System.out.println(list);

        list.addFirst(0);
        System.out.println(list);
    }

    public static void testArrayList() {
        MyArrayList list = new MyArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list); // [1, 2, 3]
        list.set(1, -2);
        System.out.println(list); // [1, -2, 3]
        System.out.println(list.size()); // 3
        list.add(4);
        System.out.println(list.size()); // 4
        list.addFirst(0);
        System.out.println(list); // [0, 1, -2, 3, 4]
        list.remove(1);
        System.out.println(list); // [0, -2, 3, 4]
        list.clear();
        System.out.println(list.size()); // 0
        System.out.println(list); // []
    }
}
