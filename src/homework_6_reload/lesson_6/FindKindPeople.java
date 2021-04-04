package homework_6_reload.lesson_6;

import homework_6_reload.Person;

import java.util.List;
import java.util.stream.Collectors;

public class FindKindPeople {
    public List<Person> findKindPeopleUnderAgeOf18(List<Person> personList) {
        List<Person> collect = personList.stream()
                .filter(person -> person.getAge() < 18)
                .collect(Collectors.toList());

        return collect;
    }
}
