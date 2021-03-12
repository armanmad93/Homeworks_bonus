package com.company.homework_1.homework1_5;

import java.util.Scanner;

public class Homework1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomMath customMath = new CustomMath();

        System.out.print("plz enter initial number: ");
        int initialNumber = scanner.nextInt();
        int prime = customMath.nextPrime(initialNumber);
        System.out.println("nextPrime(" + initialNumber + ") -> " + prime);
    }
}
