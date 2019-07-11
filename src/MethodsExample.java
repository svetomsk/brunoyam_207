import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MethodsExample {
    public static void main(String[] args) {
        int a = 12;
        int b = 123;
        System.out.println(a + b);
//        printMyName("Petr");
        int n = 10000000;
        int [] data = new int[n];
        Random r = new Random();
        for(int i = 0; i < n; i++) {
            data[i] = r.nextInt();
        }

        int [] arr = Arrays.copyOf(data, data.length);
        long start = System.currentTimeMillis();
//        sort(arr); // O(n*n)
        System.out.println("Our time: " + (System.currentTimeMillis() - start));
//        for(int i : arr) {
//            System.out.println(i);
//        }

        System.out.println("--");
        int [] copy = Arrays.copyOf(data, data.length);

        start = System.currentTimeMillis();
        Arrays.sort(copy); // O(n * log(n))
        System.out.println("Java time: " + (System.currentTimeMillis() - start));
//        for(int i : copy) {
//            System.out.println(i);
//        }
    }

    private static void sort(int [] mas) {
        for(int i = 0; i < mas.length; i++) {
            for(int j = 0; j < mas.length - i - 1; j++) {
                if(mas[j] > mas[j + 1]) {
                    int tmp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = tmp;
                }
            }
        }
    }

    private static int sum(int a, int b) {
        // int a = 1;
        // int b = 2;
        Character.isLowerCase('a');
        return a + b;
    }

    private static int sum(int a) {
        return 0;
    }
}
