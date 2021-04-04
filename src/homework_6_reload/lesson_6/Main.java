package homework_6_reload.lesson_6;

import homework_6_reload.Person;
import homework_6_reload.lesson_4.FindOldestPerson;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        // 6 - Get names of all kids (under age of 18)
        FindKindPeople kindPeople = new FindKindPeople();

        List<Person> people = asList(new Person("Arman", 28), new Person("Mher", 30)
                , new Person("Hexine", 15), new Person("Armine", 10));

        List<Person> kindPeopleUnderAgeOf18 = kindPeople.findKindPeopleUnderAgeOf18(people);

        kindPeopleUnderAgeOf18.forEach(each -> System.out.println("kind peoples names: " + each.getName()));


    }
}
