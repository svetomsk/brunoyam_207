import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int number = 0;
        System.out.println("Текущий результат: " + number);
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите операцию");
            String s = sc.nextLine();
            System.out.println("Введите число");
            int a = sc.nextInt();

            if (s.equals("+")) {
                number = number + a;
                System.out.println("Текущий результат: " + number);
            } else if (s.equals("-")) {
                number = number - a;
                System.out.println("Текущий результат: " + number);
            } else if (s.equals("*")) {
                number = number * a;
                System.out.println("Текущий результат: " + number);
            } else if (s.equals("/")) {
                number = number / a;
                System.out.println("Текущий результат: " + number);
            }
        }
    }
}