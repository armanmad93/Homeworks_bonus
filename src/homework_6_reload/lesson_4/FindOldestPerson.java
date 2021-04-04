package homework_6_reload.lesson_4;

import homework_6_reload.Person;

import java.util.List;
import java.util.stream.Collectors;

public class FindOldestPerson {

    public List<Person> findOldestPersonFromTheCollection(List<Person> personList) {
        List<Person> collect = personList.stream()
                .reduce((person1, person2) -> person1.getAge() > person2.getAge() ? person1 : person2)
                .stream()
                .collect(Collectors.toList());

        return collect;
    }
}
