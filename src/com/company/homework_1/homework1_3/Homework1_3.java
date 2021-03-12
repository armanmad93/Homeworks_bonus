package com.company.homework_1.homework1_3;

public class Homework1_3 {
    public static void main(String[] args) {
        Person p1 = new Person("Arman", 28);
        Person p2 = new Person("Daiana", 32);
        Person p3 = new Person("Meline", 35);

        System.out.println(p1.compareAge(p2));
        System.out.println(p2.compareAge(p1));
        System.out.println(p1.compareAge(p3));
    }
}
