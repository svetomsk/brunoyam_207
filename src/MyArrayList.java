public class MyArrayList {
    private int size;
    private int capacity = 1;
    private int [] data;

    public MyArrayList() {
        data = new int[capacity];
    }

    // mas[index]
    public int get(int index) {
        return data[index];
    }

    // mas[index] = value
    public void set(int index, int value) {
        data[index] = value;
    }

    private void checkCapacity() {
        if(size >= capacity) {
            int [] newData = new int[capacity * 2];
            if (capacity >= 0) System.arraycopy(data, 0, newData, 0, capacity);
            data = newData;
            capacity *= 2;
        }
    }

    public void add(int value) {
        checkCapacity();
        data[size] = value;
        size++;
    }

    public int size() {
        return size;
    }

    public void addFirst(int value) {
        // check capacity
        // insert first element
        checkCapacity();
        // shift elements to the right
        if (capacity - 1 >= 0) System.arraycopy(data, 0, data, 1, capacity - 1);
        data[0] = value;
        size++;
    }

    public void remove(int index) {
        // shift all elements to the left
        // starting from index
        if (capacity - 1 - index >= 0) System.arraycopy(data, index + 1, data, index, capacity - 1 - index);
        size--;
    }

    public void clear() {
        size = 0;
        data = new int[10];
    }

    @Override
    public String toString() {
        String result;
        result = "[";
        for(int i = 0; i < size - 1; i++) {
            result += data[i] + ", ";
        }
        if(size > 0) {
            result += data[size - 1];
        }
        result += "]";
        return result;
    }
}
