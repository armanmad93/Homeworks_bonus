package com.company.homework_1.homework1_1;

import java.util.Scanner;

public class Homework1_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("plz enter two numbers. ");

        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();

        System.out.println("plz enter operator");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+' -> result = firstNumber + secondNumber;
            case '-' -> result = firstNumber - secondNumber;
            case '/' -> result = firstNumber / secondNumber;
            case '*' -> result = firstNumber * secondNumber;
            default -> {
                System.out.println("Error! operator is not correct");
                return;
            }
        }

        System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + result);

    }
}

