package com.company.homework_1.homework1_4;

public class Luke {

    public void relationToLuke(String name) {
        switch (name) {
            case "Darth Vader" -> System.out.println("Luke, I am your father.");
            case "Leia" -> System.out.println("Luke, I am your sister.");
            case "Han" -> System.out.println("Luke, I am your brother in law.");
            default -> System.out.println("i am not from your family");
        }
    }

}
