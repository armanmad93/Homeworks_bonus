package com.company.homework_1.homewrok1_2;

import java.util.Scanner;

public class Homework1_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Product product = new Product();

        int upvotes;
        int downvotes;

        System.out.print("upvotes: ");
        while (true) {
            upvotes = scanner.nextInt();
            if (upvotes > 0) {
                break;
            }
            System.out.println("plz enter only positive number. ");
        }

        System.out.print("downvotes: ");
        while (true) {
            downvotes = scanner.nextInt();
            if (downvotes > 0) {
                break;
            }
            System.out.println("plz enter only positive number. ");
        }

        int sum = product.getVoteCount(upvotes, downvotes);

        System.out.println("getVoteCount({ upvotes: " + upvotes + " downvotes: " + downvotes + " }) ➞ " + sum);

    }
}
