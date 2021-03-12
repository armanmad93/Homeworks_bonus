package com.company.homework_1.homework1_bonus;

public class Main {
    public static void main(String[] args) {
        MyCustomSupperArrayQueue myCustomSupperArrayQueue = new MyCustomSupperArrayQueue();

        myCustomSupperArrayQueue.add(15);
        myCustomSupperArrayQueue.add(20);
        myCustomSupperArrayQueue.add(5);
        myCustomSupperArrayQueue.add(57);
        myCustomSupperArrayQueue.add(7);

        System.out.println(myCustomSupperArrayQueue.toString());

        Integer number1 = myCustomSupperArrayQueue.poll();
        System.out.println("first number: " + number1);
        System.out.println(myCustomSupperArrayQueue.toString());

        Integer number2 = myCustomSupperArrayQueue.poll();
        System.out.println("first number: " + number2);
        System.out.println(myCustomSupperArrayQueue.toString());

        Integer number3 = myCustomSupperArrayQueue.peek();
        System.out.println("first number " + number3);
        System.out.println(myCustomSupperArrayQueue.toString());

    }
}
