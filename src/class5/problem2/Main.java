package class5.problem2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1;
        int number2;
        int sum;

        while (true) {
            try {
                number1 = Integer.parseInt(scanner.nextLine());
                number2 = Integer.parseInt(scanner.nextLine());
                sum = number1 / number2;
                break;
            } catch (NumberFormatException e) {
                System.out.println("try again!");
            } catch (ArithmeticException e) {
                System.out.println("try again");
            }
        }
        System.out.println("Number: " + sum);

    }
}
