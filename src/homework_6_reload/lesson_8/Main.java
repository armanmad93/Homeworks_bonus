package homework_6_reload.lesson_8;

import homework_6_reload.Person;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        //8 - Group people by nationality

        GropePeopleByNationality peopleByNationality = new GropePeopleByNationality();

        List<Person> people = asList(new Person("Arman", 28, "ARMENIA"), new Person("Mher", 30, "AMERICA")
                , new Person("Hexine", 15, "ARMENIA"), new Person("Armine", 10, "AMERICA"));

        Map<String, List<Person>> gropePeopleByNationality = peopleByNationality.gropePeopleByNationality(people);

        gropePeopleByNationality.entrySet()
                .forEach(entry -> System.out.println(entry.getKey() + ": "
                        + entry.getValue().stream().map(value -> new Person(value.getName(), value.getAge())).collect(Collectors.toList())));


    }
}
