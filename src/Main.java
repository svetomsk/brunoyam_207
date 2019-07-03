import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        int a = 123;
        int b = 213;
        {
            {
                int с = 123;
            }
            {
                int c = 123;

            }

            int sum = a + b;
            int sub = a - b;
            int mul = a * b;
            int div = a / b;
            sub = (sub + mul) * (div - sum);
        }

        String firstName = "Ivan";
        String lastName = "Ivanov";
        String fullName = firstName + " " + lastName;
        String fullNameConcat = firstName.concat(" ").concat(lastName);
        System.out.println(fullName);
        char t = 't';
        char firstChar = firstName.charAt(0);
        System.out.println(firstChar);

        int length = firstName.length();
        System.out.println("First name length = " + length);

        String substring = fullName.substring(4, 8);
        System.out.println(substring);

        String number = "123456";
        int numberInteger = Integer.valueOf(number);
        int numberInteger1 = Integer.parseInt(number);
        System.out.println(numberInteger + 10);

        number = String.valueOf(numberInteger + 100);
        System.out.println(number);

        Scanner sc = new Scanner(System.in);

//        String input = sc.nextLine();
//        System.out.println(input);
//        int first = sc.nextInt();
//        int second = sc.nextInt();
//        System.out.println(first + second);

        int value = 0;
        if (value > 10)
            System.out.println("right");
        else if (value < -10)
            System.out.println("left");
        else
            System.out.println("center");

        if(value < 10 && value > -10) {
            System.out.println("center");
        }

    }
}
