package homework_6_reload.lesson_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //2 - Filter collection so that only elements with less than 4 characters are returned.

        Filter list = new Filter();

        List<String> collection = new ArrayList<>();

        collection.add("my");
        collection.add("name");
        collection.add("is");
        collection.add("Arman");
        collection.add("Karapetyan");

        List<String> filterFourCharacter = list.filterFourCharacter(collection);

        System.out.println(filterFourCharacter);
    }
}
