package homework_6_reload.lesson_4;

import homework_6_reload.Person;

import java.util.List;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        //4 -Get oldest person from the collection

        List<Person> people = asList(new Person("Arman", 28), new Person("Mher", 30)
                , new Person("Hexine", 15));

        FindOldestPerson oldestPerson = new FindOldestPerson();

        List<Person> oldestPersonFromTheCollection = oldestPerson.findOldestPersonFromTheCollection(people);

        oldestPersonFromTheCollection.forEach(each -> System.out.println(each.getName() + ": " + each.getAge()));
    }
}
