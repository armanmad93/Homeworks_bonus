package com.company.homework_1.homework1_5;

public class CustomMath {

    public int nextPrime(int number) {

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                number++;
                i = 2;
            }
        }
        return number;
    }

}
