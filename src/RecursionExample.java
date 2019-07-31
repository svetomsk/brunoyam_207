public class RecursionExample {
    public static void main(String[] args) {
        foo(1);
        System.out.println(fib(1, 1, 5));
    }

    // 1 1 2 3 5 8 13 21 34

    public static int fib(int a, int b, int k) {
        if(k == 2) {
            return b;
        }
        return fib(b, a + b, k - 1);
    }

    public static void foo(int i) {
        if(i == 5) {
            return;
        }
        System.out.println(i);
        foo(i + 1);
    }
}
