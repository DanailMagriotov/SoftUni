package Fundamentals;

import java.util.Scanner;

public class SortNumbers_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        if (number1 >= number2 && number1 >= number3) {
            if (number2 >= number3) {
                System.out.printf("%d%n%d%n%d", number1, number2, number3);
            } else {
                System.out.printf("%d%n%d%n%d", number1, number3, number2);
            }
        } else if (number2 >= number1 && number2 >= number3) {
            if (number1 >= number3) {
                System.out.printf("%d%n%d%n%d", number2, number1, number3);
            } else {
                System.out.printf("%d%n%d%n%d", number2, number3, number1);
            }
        } else {
            if (number1 >= number2) {
                System.out.printf("%d%n%d%n%d", number3, number1, number2);
            } else {
                System.out.printf("%d%n%d%n%d", number3, number2, number1);
            }
        }
    }
}
