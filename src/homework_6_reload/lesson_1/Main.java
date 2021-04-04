package homework_6_reload.lesson_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1 - Convert elements of a  collection to upper case.

        Convector convector = new Convector();

        List<String> collection = new ArrayList<>();

        collection.add("my");
        collection.add("name");
        collection.add("is");
        collection.add("Arman");
        collection.add("Karapetyan");

        List<String> toUpperCaseConvector = convector.toUpperCaseConvector(collection);

        System.out.println(toUpperCaseConvector);
    }
}
