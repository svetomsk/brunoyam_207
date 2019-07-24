public class MyLinkedList {
    private class Item {
        int value;
        Item prev;
        Item next;
    }

    private Item head;
    private Item tail;
    private int size;

    public void addLast(int value) {
        if(head == null) {
            head = new Item();
            head.value = value;
            tail = head;
        } else {
            Item current = new Item();
            current.value = value;
            tail.next = current;
            current.prev = tail;
            tail = current;
        }
        size++;
    }

    public void addFirst(int value) {
        if(head == null) {
            head = new Item();
            head.value = value;
            tail = head;
        } else {
            Item current = new Item();
            current.value = value;
            head.prev = current;
            current.next = head;
            head = current;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public int get(int index) {
        Item cur = head;
        for(int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.value;
    }

    public void set(int index, int value) {
        Item cur = head;
        for(int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.value = value;
    }

    @Override
    public String toString() {
        String result = "[";
        Item cur = head;
        for(int i = 0; i < size - 1; i++) {
            result += cur.value + ", ";
            cur = cur.next;
        }
        if(size > 0) {
            result += cur.value;
        }

        result += "]";

        return result;
    }
}
