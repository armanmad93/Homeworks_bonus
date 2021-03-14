package homework1_2.homework1_2_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("plz enter radius circle. ");

        Circle circle = new Circle(scanner.nextDouble());

        System.out.println("Perimeter circle: " + circle.calculatePerimeter());
        System.out.println("Area circle: " + circle.calculateArea());
    }
}
