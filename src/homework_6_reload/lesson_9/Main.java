package homework_6_reload.lesson_9;

import homework_6_reload.Person;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        //9 - Return people names separated by comma

        List<Person> people = asList(new Person("Arman", 28), new Person("Mher", 30)
                , new Person("Hexine", 15), new Person("Armine", 10));

        List<String> peopleNames = people.stream()
                .map(person -> person.getName() + ", ")
                .collect(Collectors.toList());

        peopleNames.forEach(System.out::print);


    }
}
