package homework1_2.homework1_2_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("plz enter height. ");
        double height = scanner.nextDouble();

        System.out.print("plz enter width. ");
        double width = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(height, width);

        System.out.println("rectangle perimeter: " + rectangle.calculatePerimeter());
        System.out.println("rectangle area: " + rectangle.calculateArea());
    }
}
