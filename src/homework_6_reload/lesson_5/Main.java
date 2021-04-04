package homework_6_reload.lesson_5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 5 - Sum all elements of a numeric collection

        Count calculator = new Count();

        List<Integer> integerList = new ArrayList<>();

        integerList.add(8);
        integerList.add(10);
        integerList.add(6);
        integerList.add(2);
        integerList.add(36);
        integerList.add(7);

        Integer sumOfElements = calculator.SumOfElements(integerList);

        System.out.println("Sum all elements of a numeric collection: " + sumOfElements);
    }
}
